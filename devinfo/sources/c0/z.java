package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z implements mk.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f2538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mk.a f2540c;

    public z(u0 u0Var, boolean z3, mk.a aVar) {
        this.f2538a = u0Var;
        this.f2539b = z3;
        this.f2540c = aVar;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        u0.p pVar = (u0.p) obj2;
        ((Number) obj3).intValue();
        pVar.W(-1525724089);
        Object objL = pVar.L();
        if (objL == u0.l.f34851a) {
            objL = new e0.i();
            pVar.g0(objL);
        }
        e0.i iVar = (e0.i) objL;
        i1.n nVarB = q0.a(i1.k.f25553a, iVar, this.f2538a).b(new y(iVar, null, this.f2539b, this.f2540c));
        pVar.p(false);
        return nVarB;
    }
}
