package Y4;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import c5.C0412i;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import java.util.List;
import java.util.Locale;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* renamed from: Y4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240u extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WifiInfo f4503g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240u(WifiDetectionActivity wifiDetectionActivity, WifiInfo wifiInfo, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4502f = wifiDetectionActivity;
        this.f4503g = wifiInfo;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((C0240u) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new C0240u(this.f4502f, this.f4503g, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        List<ScanResult> scanResults;
        String str;
        int i = this.f4501e;
        WifiDetectionActivity wifiDetectionActivity = this.f4502f;
        if (i == 0) {
            R2.a.H(obj);
            long j6 = wifiDetectionActivity.f19410f0;
            this.f4501e = 1;
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
        int i3 = Build.VERSION.SDK_INT;
        WifiInfo wifiInfo = this.f4503g;
        boolean z6 = false;
        if (i3 >= 31) {
            return Boolean.valueOf(wifiInfo.getCurrentSecurityType() != 0);
        }
        WifiManager wifiManager = wifiDetectionActivity.f19407c0;
        if (wifiManager != null && (scanResults = wifiManager.getScanResults()) != null) {
            boolean z7 = false;
            for (ScanResult scanResult : scanResults) {
                if (q5.i.a(scanResult.BSSID, wifiInfo.getBSSID()) && (str = scanResult.capabilities) != null && str.length() != 0) {
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    q5.i.d(upperCase, "toUpperCase(...)");
                    if (y5.l.V(upperCase, "WEP", false) || y5.l.V(upperCase, "PSK", false) || y5.l.V(upperCase, "EAP", false) || y5.l.V(upperCase, "WPA", false)) {
                        z7 = true;
                    }
                }
            }
            z6 = z7;
        }
        return Boolean.valueOf(z6);
    }
}
