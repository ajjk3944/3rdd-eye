package Y4;

import android.net.wifi.WifiInfo;
import c5.C0412i;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class I extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WifiInfo f4413g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(WifiDetectionActivity wifiDetectionActivity, WifiInfo wifiInfo, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4412f = wifiDetectionActivity;
        this.f4413g = wifiInfo;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((I) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new I(this.f4412f, this.f4413g, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        int i = this.f4411e;
        WifiDetectionActivity wifiDetectionActivity = this.f4412f;
        if (i == 0) {
            R2.a.H(obj);
            long j6 = wifiDetectionActivity.f19410f0;
            this.f4411e = 1;
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
        return a4.p.j(wifiDetectionActivity, new Integer(this.f4413g.getRssi()), wifiDetectionActivity.f19407c0);
    }
}
