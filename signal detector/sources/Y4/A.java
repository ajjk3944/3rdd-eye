package Y4;

import c5.C0412i;
import com.lefan.signal.ui.wifi.WifiDetectionActivity;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class A extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ WifiDetectionActivity f4390f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(WifiDetectionActivity wifiDetectionActivity, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4390f = wifiDetectionActivity;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((A) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new A(this.f4390f, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        int i = this.f4389e;
        if (i == 0) {
            R2.a.H(obj);
            long j6 = this.f4390f.f19410f0;
            this.f4389e = 1;
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
        return Boolean.TRUE;
    }
}
