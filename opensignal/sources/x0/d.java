package x0;

/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: e, reason: collision with root package name */
    public final ar.k f24693e;

    /* renamed from: f, reason: collision with root package name */
    public final f f24694f;

    public d(long j, j jVar, ar.k kVar, f fVar) {
        super(j, jVar);
        this.f24693e = kVar;
        this.f24694f = fVar;
        fVar.k();
    }

    @Override // x0.f
    public final void c() {
        f fVar = this.f24694f;
        if (this.f24699c) {
            return;
        }
        if (this.f24698b != fVar.g()) {
            a();
        }
        fVar.l();
        this.f24699c = true;
        synchronized (l.f24717c) {
            o();
        }
    }

    @Override // x0.f
    public final ar.k e() {
        return this.f24693e;
    }

    @Override // x0.f
    public final boolean f() {
        return true;
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
    public final void n(t tVar) {
        lu.u uVar = l.f24715a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // x0.f
    public final f u(ar.k kVar) {
        return new d(this.f24698b, this.f24697a, l.l(kVar, this.f24693e, true), this.f24694f);
    }

    @Override // x0.f
    public final void m() {
    }
}
