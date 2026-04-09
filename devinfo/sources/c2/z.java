package c2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z extends nk.l implements mk.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mk.c f2701a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(mk.c cVar) {
        super(3);
        this.f2701a = cVar;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        u0.p pVar = (u0.p) obj2;
        ((Number) obj3).intValue();
        pVar.W(374375707);
        Object objL = pVar.L();
        if (objL == u0.l.f34851a) {
            objL = new y();
            pVar.g0(objL);
        }
        y yVar = (y) objL;
        yVar.f2697a = this.f2701a;
        d0 d0Var = yVar.f2698b;
        if (d0Var != null) {
            d0Var.f2600b = null;
        }
        yVar.f2698b = null;
        pVar.p(false);
        return yVar;
    }
}
