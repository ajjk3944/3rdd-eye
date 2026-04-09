package Y4;

import c5.C0412i;
import com.lefan.signal.ui.wifi.WifiFragment;
import h5.InterfaceC2370d;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class P extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q5.o f4427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4428f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WifiFragment f4429g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(q5.o oVar, String str, WifiFragment wifiFragment, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4427e = oVar;
        this.f4428f = str;
        this.f4429g = wifiFragment;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        P p6 = (P) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj);
        C0412i c0412i = C0412i.f5929a;
        p6.l(c0412i);
        return c0412i;
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new P(this.f4427e, this.f4428f, this.f4429g, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        R2.a.H(obj);
        this.f4427e.f23299a = T2.g.q(this.f4428f, (L4.g) this.f4429g.f19432l0.getValue());
        return C0412i.f5929a;
    }
}
