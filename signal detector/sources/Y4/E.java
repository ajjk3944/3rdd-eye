package Y4;

import android.net.DhcpInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiSsid;
import android.os.Build;
import c5.C0409f;
import c5.C0412i;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import java.net.InetAddress;
import java.util.List;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class E extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4401f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(WifiDetectionActivity wifiDetectionActivity, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4401f = wifiDetectionActivity;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((E) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new E(this.f4401f, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        String ssid;
        String bssid;
        String string;
        int i = this.f4400e;
        WifiDetectionActivity wifiDetectionActivity = this.f4401f;
        if (i == 0) {
            R2.a.H(obj);
            long j6 = wifiDetectionActivity.f19410f0;
            this.f4400e = 1;
            Object objE = AbstractC3046w.e(j6, this);
            EnumC2380a enumC2380a = EnumC2380a.f20635a;
            if (objE == enumC2380a) {
                return enumC2380a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R2.a.H(obj);
        }
        WifiManager wifiManager = wifiDetectionActivity.f19407c0;
        q5.i.b(wifiManager);
        DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
        if (dhcpInfo != null) {
            int i3 = dhcpInfo.netmask;
            int i6 = dhcpInfo.gateway;
            int[] iArr = {dhcpInfo.dns1, dhcpInfo.dns2};
            if (i3 == 0 || i3 == -1) {
                i3 = 16777215;
            }
            for (int i7 = 0; i7 < 2; i7++) {
                int i8 = iArr[i7];
                if (i8 != -1 && i8 != 0 && i8 != i6 && (i6 & i3) == (i8 & i3)) {
                    WifiManager wifiManager2 = wifiDetectionActivity.f19407c0;
                    q5.i.b(wifiManager2);
                    WifiInfo connectionInfo = wifiManager2.getConnectionInfo();
                    if (connectionInfo != null) {
                        ssid = connectionInfo.getSSID();
                        q5.i.d(ssid, "getSSID(...)");
                        bssid = connectionInfo.getBSSID();
                    } else {
                        ssid = "";
                        bssid = "";
                    }
                    WifiManager wifiManager3 = wifiDetectionActivity.f19407c0;
                    q5.i.b(wifiManager3);
                    List<ScanResult> scanResults = wifiManager3.getScanResults();
                    if (scanResults != null) {
                        for (ScanResult scanResult : scanResults) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                WifiSsid wifiSsid = scanResult.getWifiSsid();
                                string = wifiSsid != null ? wifiSsid.toString() : null;
                            } else {
                                string = scanResult.SSID;
                            }
                            if (ssid.equals(string) && !bssid.equals(scanResult.BSSID)) {
                                return Boolean.TRUE;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        try {
            InetAddress.getByName("adfasdf.fljalfjsd.com.cn");
            return Boolean.TRUE;
        } catch (Throwable th) {
            return C0409f.a(R2.a.d(th)) != null ? Boolean.FALSE : Boolean.FALSE;
        }
    }
}
