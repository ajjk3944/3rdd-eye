package g1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: e, reason: collision with root package name */
    public final mk.c f24224e;

    /* renamed from: f, reason: collision with root package name */
    public final g f24225f;

    public e(long j, k kVar, mk.c cVar, g gVar) {
        super(j, kVar);
        this.f24224e = cVar;
        this.f24225f = gVar;
        gVar.k();
    }

    @Override // g1.g
    public final void c() {
        g gVar = this.f24225f;
        if (this.f24240c) {
            return;
        }
        if (this.f24239b != gVar.g()) {
            a();
        }
        gVar.l();
        this.f24240c = true;
        synchronized (m.f24260c) {
            o();
        }
    }

    @Override // g1.g
    public final mk.c e() {
        return this.f24224e;
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
        r.q();
        throw null;
    }

    @Override // g1.g
    public final void l() {
        r.q();
        throw null;
    }

    @Override // g1.g
    public final void n(x xVar) {
        b7.w wVar = m.f24258a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // g1.g
    public final g u(mk.c cVar) {
        return new e(this.f24239b, this.f24238a, m.k(cVar, this.f24224e, true), this.f24225f);
    }

    @Override // g1.g
    public final void m() {
    }
}
