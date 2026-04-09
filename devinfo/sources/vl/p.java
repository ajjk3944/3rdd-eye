package vl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final n f36376a;

    public p(n nVar) {
        nk.k.e(nVar, "connection");
        this.f36376a = nVar;
    }

    @Override // vl.r
    public final r a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // vl.r
    public final n b() {
        return this.f36376a;
    }

    @Override // vl.r
    public final boolean c() {
        return true;
    }

    @Override // vl.r, wl.e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // vl.r
    public final q d() {
        throw new IllegalStateException("already connected");
    }

    @Override // vl.r
    public final q f() {
        throw new IllegalStateException("already connected");
    }
}
