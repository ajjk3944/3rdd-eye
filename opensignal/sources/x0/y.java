package x0;

/* loaded from: classes.dex */
public final class y extends f {

    /* renamed from: e, reason: collision with root package name */
    public final f f24763e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24764f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24765g;

    /* renamed from: h, reason: collision with root package name */
    public ar.k f24766h;

    /* renamed from: i, reason: collision with root package name */
    public final long f24767i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(f fVar, ar.k kVar, boolean z10, boolean z11) {
        ar.k kVarE;
        super(0L, j.f24707x);
        lu.u uVar = l.f24715a;
        this.f24763e = fVar;
        this.f24764f = z10;
        this.f24765g = z11;
        this.f24766h = l.l(kVar, (fVar == null || (kVarE = fVar.e()) == null) ? l.j.f24684e : kVarE, z10);
        this.f24767i = v0.i.b();
    }

    @Override // x0.f
    public final void c() {
        f fVar;
        this.f24699c = true;
        if (!this.f24765g || (fVar = this.f24763e) == null) {
            return;
        }
        fVar.c();
    }

    @Override // x0.f
    public final j d() {
        return v().d();
    }

    @Override // x0.f
    public final ar.k e() {
        return this.f24766h;
    }

    @Override // x0.f
    public final boolean f() {
        return v().f();
    }

    @Override // x0.f
    public final long g() {
        return v().g();
    }

    @Override // x0.f
    public final ar.k i() {
        return null;
    }

    @Override // x0.f
    public final void k() {
        p.j();
        throw null;
    }

    @Override // x0.f
    public final void l() {
        p.j();
        throw null;
    }

    @Override // x0.f
    public final void m() {
        v().m();
    }

    @Override // x0.f
    public final void n(t tVar) {
        v().n(tVar);
    }

    @Override // x0.f
    public final f u(ar.k kVar) {
        ar.k kVarL = l.l(kVar, this.f24766h, true);
        return !this.f24764f ? l.h(v().u(null), kVarL, true) : v().u(kVarL);
    }

    public final f v() {
        f fVar = this.f24763e;
        return fVar == null ? l.j : fVar;
    }
}
