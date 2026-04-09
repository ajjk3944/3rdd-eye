package x0;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: e, reason: collision with root package name */
    public final ar.k f24695e;

    /* renamed from: f, reason: collision with root package name */
    public int f24696f;

    public e(long j, j jVar, ar.k kVar) {
        super(j, jVar);
        this.f24695e = kVar;
        this.f24696f = 1;
    }

    @Override // x0.f
    public final void c() {
        if (this.f24699c) {
            return;
        }
        l();
        this.f24699c = true;
        synchronized (l.f24717c) {
            o();
        }
    }

    @Override // x0.f
    public final ar.k e() {
        return this.f24695e;
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
        this.f24696f++;
    }

    @Override // x0.f
    public final void l() {
        int i10 = this.f24696f - 1;
        this.f24696f = i10;
        if (i10 == 0) {
            a();
        }
    }

    @Override // x0.f
    public final void n(t tVar) {
        lu.u uVar = l.f24715a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // x0.f
    public final f u(ar.k kVar) {
        l.d(this);
        return new d(this.f24698b, this.f24697a, l.l(kVar, this.f24695e, true), this);
    }

    @Override // x0.f
    public final void m() {
    }
}
