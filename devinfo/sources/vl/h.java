package vl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h implements r {

    /* renamed from: a, reason: collision with root package name */
    public final q f36324a;

    public h(Throwable th2) {
        this.f36324a = new q(this, th2, 2);
    }

    @Override // vl.r
    public final r a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // vl.r
    public final n b() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // vl.r
    public final boolean c() {
        return false;
    }

    @Override // vl.r, wl.e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // vl.r
    public final q d() {
        return this.f36324a;
    }

    @Override // vl.r
    public final q f() {
        return this.f36324a;
    }
}
