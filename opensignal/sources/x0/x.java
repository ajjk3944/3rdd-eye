package x0;

import u.b0;

/* loaded from: classes.dex */
public final class x extends b {

    /* renamed from: o, reason: collision with root package name */
    public final b f24757o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f24758p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f24759q;

    /* renamed from: r, reason: collision with root package name */
    public ar.k f24760r;

    /* renamed from: s, reason: collision with root package name */
    public ar.k f24761s;

    /* renamed from: t, reason: collision with root package name */
    public final long f24762t;

    /* JADX WARN: Illegal instructions before constructor call */
    public x(b bVar, ar.k kVar, ar.k kVar2, boolean z10, boolean z11) {
        ar.k kVarI;
        ar.k kVarE;
        lu.u uVar = l.f24715a;
        super(0L, j.f24707x, l.l(kVar, (bVar == null || (kVarE = bVar.e()) == null) ? l.j.f24684e : kVarE, z10), l.b(kVar2, (bVar == null || (kVarI = bVar.i()) == null) ? l.j.f24685f : kVarI));
        this.f24757o = bVar;
        this.f24758p = z10;
        this.f24759q = z11;
        this.f24760r = this.f24684e;
        this.f24761s = this.f24685f;
        this.f24762t = v0.i.b();
    }

    @Override // x0.b
    public final void B(b0 b0Var) {
        p.j();
        throw null;
    }

    @Override // x0.b
    public final b C(ar.k kVar, ar.k kVar2) {
        ar.k kVarL = l.l(kVar, this.f24760r, true);
        ar.k kVarB = l.b(kVar2, this.f24761s);
        return !this.f24758p ? new x(D().C(null, kVarB), kVarL, kVarB, false, true) : D().C(kVarL, kVarB);
    }

    public final b D() {
        b bVar = this.f24757o;
        return bVar == null ? l.j : bVar;
    }

    @Override // x0.b, x0.f
    public final void c() {
        b bVar;
        this.f24699c = true;
        if (!this.f24759q || (bVar = this.f24757o) == null) {
            return;
        }
        bVar.c();
    }

    @Override // x0.f
    public final j d() {
        return D().d();
    }

    @Override // x0.b, x0.f
    public final ar.k e() {
        return this.f24760r;
    }

    @Override // x0.b, x0.f
    public final boolean f() {
        return D().f();
    }

    @Override // x0.f
    public final long g() {
        return D().g();
    }

    @Override // x0.b, x0.f
    public final int h() {
        return D().h();
    }

    @Override // x0.b, x0.f
    public final ar.k i() {
        return this.f24761s;
    }

    @Override // x0.b, x0.f
    public final void k() {
        p.j();
        throw null;
    }

    @Override // x0.b, x0.f
    public final void l() {
        p.j();
        throw null;
    }

    @Override // x0.b, x0.f
    public final void m() {
        D().m();
    }

    @Override // x0.b, x0.f
    public final void n(t tVar) {
        D().n(tVar);
    }

    @Override // x0.f
    public final void r(j jVar) {
        p.j();
        throw null;
    }

    @Override // x0.f
    public final void s(long j) {
        p.j();
        throw null;
    }

    @Override // x0.b, x0.f
    public final void t(int i10) {
        D().t(i10);
    }

    @Override // x0.b, x0.f
    public final f u(ar.k kVar) {
        ar.k kVarL = l.l(kVar, this.f24760r, true);
        return !this.f24758p ? l.h(D().u(null), kVarL, true) : D().u(kVarL);
    }

    @Override // x0.b
    public final p w() {
        return D().w();
    }

    @Override // x0.b
    public final b0 x() {
        return D().x();
    }

    @Override // x0.b
    /* renamed from: y */
    public final ar.k e() {
        return this.f24760r;
    }
}
