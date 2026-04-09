package nm;

import u0.u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n extends nk.l implements mk.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f30100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f30101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mk.c f30102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mk.a f30103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, d dVar, mk.c cVar, mk.a aVar) {
        super(3);
        this.f30100a = oVar;
        this.f30101b = dVar;
        this.f30102c = cVar;
        this.f30103d = aVar;
    }

    @Override // mk.f
    public final Object a(Object obj, Object obj2, Object obj3) {
        i1.n nVar = (i1.n) obj;
        u0.p pVar = (u0.p) obj2;
        ((Number) obj3).intValue();
        nk.k.e(nVar, "$this$composed");
        pVar.W(231415144);
        pVar.W(-1020090083);
        Object objL = pVar.L();
        Object obj4 = u0.l.f34851a;
        if (objL == obj4) {
            objL = u0.q.r(new o1.b(0L));
            pVar.g0(objL);
        }
        u0 u0Var = (u0) objL;
        pVar.p(false);
        pVar.W(-1020087938);
        Object objL2 = pVar.L();
        if (objL2 == obj4) {
            objL2 = u0.q.r(new d3.k(0L));
            pVar.g0(objL2);
        }
        u0 u0Var2 = (u0) objL2;
        pVar.p(false);
        Object objL3 = pVar.L();
        if (objL3 == obj4) {
            Object zVar = new u0.z(u0.q.j(pVar));
            pVar.g0(zVar);
            objL3 = zVar;
        }
        xk.v vVar = ((u0.z) objL3).f35025a;
        pVar.W(-1020083824);
        Object objL4 = pVar.L();
        if (objL4 == obj4) {
            objL4 = new c2.w(9, u0Var, u0Var2);
            pVar.g0(objL4);
        }
        pVar.p(false);
        i1.n nVarH = g2.n0.h(nVar, (mk.c) objL4);
        o oVar = this.f30100a;
        e0 e0Var = oVar.f30109a;
        Object obj5 = oVar.f30110b;
        e0Var.getClass();
        nk.k.e(obj5, "key");
        boolean z3 = ((Boolean) u0.q.l(new c2.c(15, obj5, e0Var)).getValue()).booleanValue() || !((Boolean) oVar.f30109a.f30023l.getValue()).booleanValue();
        pVar.W(-1020069521);
        boolean zH = pVar.h(vVar) | pVar.f(oVar) | pVar.f(this.f30102c);
        Object objL5 = pVar.L();
        if (zH || objL5 == obj4) {
            Object mVar = new m(vVar, this.f30102c, oVar, u0Var, u0Var2);
            pVar.g0(mVar);
            objL5 = mVar;
        }
        mk.c cVar = (mk.c) objL5;
        pVar.p(false);
        pVar.W(-1020052768);
        boolean zF = pVar.f(oVar);
        Object obj6 = this.f30103d;
        boolean zF2 = zF | pVar.f(obj6);
        Object objL6 = pVar.L();
        if (zF2 || objL6 == obj4) {
            objL6 = new c2.c(14, oVar, obj6);
            pVar.g0(objL6);
        }
        mk.a aVar = (mk.a) objL6;
        pVar.p(false);
        pVar.W(-1020048579);
        boolean zF3 = pVar.f(oVar);
        Object objL7 = pVar.L();
        if (zF3 || objL7 == obj4) {
            objL7 = new i1.j(4, oVar);
            pVar.g0(objL7);
        }
        mk.e eVar = (mk.e) objL7;
        pVar.p(false);
        nk.k.e(nVarH, "<this>");
        d dVar = this.f30101b;
        nk.k.e(dVar, "dragGestureDetector");
        nk.k.e(cVar, "onDragStarted");
        nk.k.e(aVar, "onDragStopped");
        nk.k.e(eVar, "onDrag");
        i1.n nVarK = com.bumptech.glide.d.k(nVarH, new j(e0Var, aVar, z3, dVar, cVar, eVar));
        pVar.p(false);
        return nVarK;
    }
}
