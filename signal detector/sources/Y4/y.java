package Y4;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiSsid;
import android.os.Build;
import android.text.TextUtils;
import c5.C0412i;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import java.util.List;
import java.util.Locale;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class y extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WifiInfo f4511g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(WifiDetectionActivity wifiDetectionActivity, WifiInfo wifiInfo, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4510f = wifiDetectionActivity;
        this.f4511g = wifiInfo;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((y) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new y(this.f4510f, this.f4511g, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        List<ScanResult> scanResults;
        String strF0;
        String string;
        int i = this.f4509e;
        WifiDetectionActivity wifiDetectionActivity = this.f4510f;
        if (i == 0) {
            R2.a.H(obj);
            long j6 = wifiDetectionActivity.f19410f0;
            this.f4509e = 1;
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
        WifiInfo wifiInfo = this.f4511g;
        String bssid = wifiInfo.getBSSID();
        String ssid = wifiInfo.getSSID();
        if (TextUtils.isEmpty(ssid) || TextUtils.isEmpty(bssid)) {
            return Boolean.TRUE;
        }
        WifiManager wifiManager = wifiDetectionActivity.f19407c0;
        boolean z6 = false;
        if (wifiManager != null && (scanResults = wifiManager.getScanResults()) != null) {
            boolean z7 = false;
            for (ScanResult scanResult : scanResults) {
                if (Build.VERSION.SDK_INT >= 33) {
                    WifiSsid wifiSsid = scanResult.getWifiSsid();
                    strF0 = (wifiSsid == null || (string = wifiSsid.toString()) == null) ? null : y5.l.f0(string, "\"", "");
                } else {
                    strF0 = scanResult.SSID;
                }
                String strM = A.f.m("\"", strF0, "\"");
                if (ssid.equals(strF0) || ssid.equals(strM)) {
                    String str = scanResult.capabilities;
                    if (str != null && str.length() != 0) {
                        String upperCase = str.toUpperCase(Locale.ROOT);
                        q5.i.d(upperCase, "toUpperCase(...)");
                        if (y5.l.V(upperCase, "WEP", false) || y5.l.V(upperCase, "PSK", false) || y5.l.V(upperCase, "EAP", false) || y5.l.V(upperCase, "WPA", false)) {
                            z7 = true;
                        }
                    }
                }
            }
            z6 = z7;
        }
        return Boolean.valueOf(z6);
    }
}
