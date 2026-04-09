package g1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 extends g {

    /* renamed from: e, reason: collision with root package name */
    public final g f24234e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24235f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public mk.c f24236h;

    /* renamed from: i, reason: collision with root package name */
    public final long f24237i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g gVar, mk.c cVar, boolean z3, boolean z10) {
        mk.c cVarE;
        super(0L, k.f24250e);
        b7.w wVar = m.f24258a;
        this.f24234e = gVar;
        this.f24235f = z3;
        this.g = z10;
        this.f24236h = m.k(cVar, (gVar == null || (cVarE = gVar.e()) == null) ? m.j.f24208e : cVarE, z3);
        this.f24237i = c1.n.b();
    }

    @Override // g1.g
    public final void c() {
        g gVar;
        this.f24240c = true;
        if (!this.g || (gVar = this.f24234e) == null) {
            return;
        }
        gVar.c();
    }

    @Override // g1.g
    public final k d() {
        return v().d();
    }

    @Override // g1.g
    public final mk.c e() {
        return this.f24236h;
    }

    @Override // g1.g
    public final boolean f() {
        return v().f();
    }

    @Override // g1.g
    public final long g() {
        return v().g();
    }

    @Override // g1.g
    public final mk.c i() {
        return null;
    }

    @Override // g1.g
    public final void k() {
        r.q();
        throw null;
    }

    @Override // g1.g
    public final void l() {
        r.q();
        throw null;
    }

    @Override // g1.g
    public final void m() {
        v().m();
    }

    @Override // g1.g
    public final void n(x xVar) {
        v().n(xVar);
    }

    @Override // g1.g
    public final g u(mk.c cVar) {
        mk.c cVarK = m.k(cVar, this.f24236h, true);
        return !this.f24235f ? m.g(v().u(null), cVarK, true) : v().u(cVarK);
    }

    public final g v() {
        g gVar = this.f24234e;
        return gVar == null ? m.j : gVar;
    }
}
