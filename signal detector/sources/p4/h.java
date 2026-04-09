package P4;

import c5.C0409f;
import c5.C0412i;
import h5.InterfaceC2370d;
import p5.p;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class h extends j5.g implements p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3163e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f3163e = str;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((h) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new h(this.f3163e, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        Object objD;
        R2.a.H(obj);
        try {
            objD = new Integer(Runtime.getRuntime().exec(this.f3163e).waitFor());
        } catch (Throwable th) {
            objD = R2.a.d(th);
        }
        return new C0409f(objD);
    }
}
