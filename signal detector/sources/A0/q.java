package a0;

import c5.C0412i;
import h5.InterfaceC2370d;
import i5.EnumC2380a;

/* loaded from: classes.dex */
public final class q extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4595e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4596f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0244C f4597g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C0244C c0244c, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4597g = c0244c;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((q) j((InterfaceC2370d) obj2, (C5.c) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        q qVar = new q(this.f4597g, interfaceC2370d);
        qVar.f4596f = obj;
        return qVar;
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        C0244C c0244c = this.f4597g;
        C5.o oVar = c0244c.f4557e;
        int i = this.f4595e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R2.a.H(obj);
            return C0412i.f5929a;
        }
        R2.a.H(obj);
        C5.c cVar = (C5.c) this.f4596f;
        AbstractC0245D abstractC0245D = (AbstractC0245D) oVar.I();
        if (!(abstractC0245D instanceof C0247a)) {
            c0244c.f4559g.y(new C0256j(abstractC0245D));
        }
        C0261o c0261o = new C0261o(abstractC0245D, null);
        this.f4595e = 1;
        oVar.k(new C5.e(new q5.l(), new C5.f(1, cVar), c0261o), this);
        return EnumC2380a.f20635a;
    }
}
