package g8;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public abstract class u {
    public static String a(Context context) {
        WifiInfo connectionInfo;
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        return (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) ? "" : connectionInfo.getBSSID();
    }

    public static DhcpInfo b(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager != null) {
            return wifiManager.getDhcpInfo();
        }
        return null;
    }

    public static String c(Context context) {
        String extraInfo;
        NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
        if (1 == networkInfo.getType()) {
            extraInfo = networkInfo.getExtraInfo();
            if (!TextUtils.isEmpty(extraInfo)) {
                if (extraInfo.startsWith("\"")) {
                    extraInfo = extraInfo.substring(1);
                }
                if (extraInfo.endsWith("\"")) {
                    extraInfo = extraInfo.substring(0, extraInfo.length() - 1);
                }
            }
        } else {
            extraInfo = "";
        }
        return TextUtils.isEmpty(extraInfo) ? e(context) : extraInfo;
    }

    public static WifiInfo d(Context context) {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager != null) {
            return wifiManager.getConnectionInfo();
        }
        return null;
    }

    public static String e(Context context) {
        String ssid;
        WifiManager wifiManager;
        WifiInfo connectionInfo;
        if (context == null || (wifiManager = (WifiManager) context.getSystemService("wifi")) == null || (connectionInfo = wifiManager.getConnectionInfo()) == null || !SupplicantState.COMPLETED.equals(connectionInfo.getSupplicantState())) {
            ssid = "";
        } else {
            ssid = connectionInfo.getSSID();
            if (!TextUtils.isEmpty(ssid)) {
                if (ssid.startsWith("\"")) {
                    ssid = ssid.substring(1);
                }
                if (ssid.endsWith("\"")) {
                    ssid = ssid.substring(0, ssid.length() - 1);
                }
            }
        }
        if (TextUtils.equals(ssid, "0x")) {
            return null;
        }
        return ssid;
    }

    public static boolean f(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1).isConnected();
    }

    public static boolean g(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager != null) {
                return wifiManager.isWifiEnabled();
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
