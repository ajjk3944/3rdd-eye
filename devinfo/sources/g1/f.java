package g1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final mk.c f24232e;

    /* renamed from: f, reason: collision with root package name */
    public int f24233f;

    public f(long j, k kVar, mk.c cVar) {
        super(j, kVar);
        this.f24232e = cVar;
        this.f24233f = 1;
    }

    @Override // g1.g
    public final void c() {
        if (this.f24240c) {
            return;
        }
        l();
        this.f24240c = true;
        synchronized (m.f24260c) {
            o();
        }
    }

    @Override // g1.g
    public final mk.c e() {
        return this.f24232e;
    }

    @Override // g1.g
    public final boolean f() {
        return true;
    }

    @Override // g1.g
    public final mk.c i() {
        return null;
    }

    @Override // g1.g
    public final void k() {
        this.f24233f++;
    }

    @Override // g1.g
    public final void l() {
        int i4 = this.f24233f - 1;
        this.f24233f = i4;
        if (i4 == 0) {
            a();
        }
    }

    @Override // g1.g
    public final void n(x xVar) {
        b7.w wVar = m.f24258a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // g1.g
    public final g u(mk.c cVar) {
        m.c(this);
        return new e(this.f24239b, this.f24238a, m.k(cVar, this.f24232e, true), this);
    }

    @Override // g1.g
    public final void m() {
    }
}
