package g1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e0 extends c {

    /* renamed from: o, reason: collision with root package name */
    public final c f24226o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f24227p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f24228q;

    /* renamed from: r, reason: collision with root package name */
    public mk.c f24229r;

    /* renamed from: s, reason: collision with root package name */
    public mk.c f24230s;

    /* renamed from: t, reason: collision with root package name */
    public final long f24231t;

    /* JADX WARN: Illegal instructions before constructor call */
    public e0(c cVar, mk.c cVar2, mk.c cVar3, boolean z3, boolean z10) {
        mk.c cVarI;
        mk.c cVarE;
        b7.w wVar = m.f24258a;
        super(0L, k.f24250e, m.k(cVar2, (cVar == null || (cVarE = cVar.e()) == null) ? m.j.f24208e : cVarE, z3), m.l(cVar3, (cVar == null || (cVarI = cVar.i()) == null) ? m.j.f24209f : cVarI));
        this.f24226o = cVar;
        this.f24227p = z3;
        this.f24228q = z10;
        this.f24229r = this.f24208e;
        this.f24230s = this.f24209f;
        this.f24231t = c1.n.b();
    }

    @Override // g1.c
    public final void C(x.f0 f0Var) {
        r.q();
        throw null;
    }

    @Override // g1.c
    public final c D(mk.c cVar, mk.c cVar2) {
        mk.c cVarK = m.k(cVar, this.f24229r, true);
        mk.c cVarL = m.l(cVar2, this.f24230s);
        return !this.f24227p ? new e0(E().D(null, cVarL), cVarK, cVarL, false, true) : E().D(cVarK, cVarL);
    }

    public final c E() {
        c cVar = this.f24226o;
        return cVar == null ? m.j : cVar;
    }

    @Override // g1.c, g1.g
    public final void c() {
        c cVar;
        this.f24240c = true;
        if (!this.f24228q || (cVar = this.f24226o) == null) {
            return;
        }
        cVar.c();
    }

    @Override // g1.g
    public final k d() {
        return E().d();
    }

    @Override // g1.c, g1.g
    public final mk.c e() {
        return this.f24229r;
    }

    @Override // g1.c, g1.g
    public final boolean f() {
        return E().f();
    }

    @Override // g1.g
    public final long g() {
        return E().g();
    }

    @Override // g1.c, g1.g
    public final int h() {
        return E().h();
    }

    @Override // g1.c, g1.g
    public final mk.c i() {
        return this.f24230s;
    }

    @Override // g1.c, g1.g
    public final void k() {
        r.q();
        throw null;
    }

    @Override // g1.c, g1.g
    public final void l() {
        r.q();
        throw null;
    }

    @Override // g1.c, g1.g
    public final void m() {
        E().m();
    }

    @Override // g1.c, g1.g
    public final void n(x xVar) {
        E().n(xVar);
    }

    @Override // g1.g
    public final void r(k kVar) {
        r.q();
        throw null;
    }

    @Override // g1.g
    public final void s(long j) {
        r.q();
        throw null;
    }

    @Override // g1.c, g1.g
    public final void t(int i4) {
        E().t(i4);
    }

    @Override // g1.c, g1.g
    public final g u(mk.c cVar) {
        mk.c cVarK = m.k(cVar, this.f24229r, true);
        return !this.f24227p ? m.g(E().u(null), cVarK, true) : E().u(cVarK);
    }

    @Override // g1.c
    public final r w() {
        return E().w();
    }

    @Override // g1.c
    public final x.f0 x() {
        return E().x();
    }

    @Override // g1.c
    /* renamed from: y */
    public final mk.c e() {
        return this.f24229r;
    }
}
