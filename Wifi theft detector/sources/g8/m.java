package g8;

import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import java.net.InetAddress;

/* loaded from: classes3.dex */
public abstract class m {
    public static InetAddress a(Context context) {
        DhcpInfo dhcpInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getDhcpInfo();
        if (dhcpInfo == null) {
            System.out.println("Could not get broadcast address");
            return null;
        }
        int i10 = dhcpInfo.ipAddress;
        int i11 = dhcpInfo.netmask;
        int i12 = (~i11) | (i10 & i11);
        byte[] bArr = new byte[4];
        for (int i13 = 0; i13 < 4; i13++) {
            bArr[i13] = (byte) ((i12 >> (i13 * 8)) & 255);
        }
        return InetAddress.getByAddress(bArr);
    }
}
