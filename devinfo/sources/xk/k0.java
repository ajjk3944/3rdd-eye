package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f37203a;

    public k0(boolean z3) {
        this.f37203a = z3;
    }

    @Override // xk.v0
    public final boolean c() {
        return this.f37203a;
    }

    @Override // xk.v0
    public final h1 d() {
        return null;
    }

    public final String toString() {
        return r5.c.l(new StringBuilder("Empty{"), this.f37203a ? "Active" : "New", '}');
    }
}
