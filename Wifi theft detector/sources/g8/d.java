package g8;

import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class d {
    public static boolean a(Context context) {
        String strSubstring;
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
            String ssid = connectionInfo.getSSID();
            if (ssid != null && ssid.length() > 2) {
                if (ssid.startsWith("\"") && ssid.endsWith("\"")) {
                    ssid = ssid.substring(1, ssid.length() - 1);
                }
                if (configuredNetworks != null && configuredNetworks.size() > 0) {
                    for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                        if (wifiConfiguration != null && wifiConfiguration.status == 0) {
                            if (TextUtils.isEmpty(wifiConfiguration.SSID)) {
                                strSubstring = null;
                            } else {
                                strSubstring = wifiConfiguration.SSID;
                                if (strSubstring.startsWith("\"") && wifiConfiguration.SSID.endsWith("\"")) {
                                    String str = wifiConfiguration.SSID;
                                    strSubstring = str.substring(1, str.length() - 1);
                                }
                            }
                            if (TextUtils.isEmpty(ssid) || ssid.equalsIgnoreCase(strSubstring)) {
                                return !wifiConfiguration.allowedKeyManagement.get(0);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }
}
