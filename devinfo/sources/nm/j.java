package nm;

import u0.u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends nk.l implements mk.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f30062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk.a f30063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f30065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mk.c f30066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mk.e f30067f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Object obj, mk.a aVar, boolean z3, d dVar, mk.c cVar, mk.e eVar) {
        super(3);
        this.f30062a = obj;
        this.f30063b = aVar;
        this.f30064c = z3;
        this.f30065d = dVar;
        this.f30066e = cVar;
        this.f30067f = eVar;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        Boolean bool;
        i1.n nVar = (i1.n) obj;
        u0.p pVar = (u0.p) obj2;
        ((Number) obj3).intValue();
        nk.k.e(nVar, "$this$composed");
        pVar.W(1321786060);
        Object objL = pVar.L();
        u0.e eVar = u0.l.f34851a;
        if (objL == eVar) {
            u0.z zVar = new u0.z(u0.q.j(pVar));
            pVar.g0(zVar);
            objL = zVar;
        }
        xk.v vVar = ((u0.z) objL).f35025a;
        pVar.W(-98757340);
        Object objL2 = pVar.L();
        if (objL2 == eVar) {
            objL2 = u0.q.r(null);
            pVar.g0(objL2);
        }
        u0 u0Var = (u0) objL2;
        pVar.p(false);
        pVar.W(-98754771);
        Object objL3 = pVar.L();
        if (objL3 == eVar) {
            objL3 = u0.q.r(Boolean.FALSE);
            pVar.g0(objL3);
        }
        u0 u0Var2 = (u0) objL3;
        pVar.p(false);
        pVar.W(-98752375);
        boolean zH = pVar.h(vVar) | pVar.f(null);
        mk.a aVar = this.f30063b;
        boolean zF = zH | pVar.f(aVar);
        Object objL4 = pVar.L();
        if (zF || objL4 == eVar) {
            objL4 = new g(aVar, u0Var2, u0Var, vVar);
            pVar.g0(objL4);
        }
        pVar.p(false);
        Object obj4 = this.f30062a;
        u0.q.c(obj4, (mk.c) objL4, pVar);
        boolean z3 = this.f30064c;
        Boolean boolValueOf = Boolean.valueOf(z3);
        pVar.W(-98737076);
        boolean zF2 = pVar.f(null) | pVar.g(z3) | pVar.h(this.f30065d) | pVar.h(vVar);
        mk.c cVar = this.f30066e;
        boolean zF3 = zF2 | pVar.f(cVar) | pVar.f(aVar);
        mk.e eVar2 = this.f30067f;
        boolean zF4 = zF3 | pVar.f(eVar2);
        Object objL5 = pVar.L();
        if (zF4 || objL5 == eVar) {
            bool = boolValueOf;
            i iVar = new i(this.f30064c, this.f30065d, eVar2, cVar, u0Var2, vVar, u0Var, aVar, null);
            pVar.g0(iVar);
            objL5 = iVar;
        } else {
            bool = boolValueOf;
        }
        pVar.p(false);
        c2.j jVar = c2.g0.f2612a;
        i1.n nVarB = nVar.b(new c2.e0(obj4, bool, new c2.f0((mk.e) objL5), 4));
        pVar.p(false);
        return nVarB;
    }
}
