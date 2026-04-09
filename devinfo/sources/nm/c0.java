package nm;

import d0.a1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0.q f30008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f30009b;

    public c0(i0.q qVar, a1 a1Var) {
        this.f30008a = qVar;
        this.f30009b = a1Var;
    }

    public final int a() {
        return this.f30008a.f25479a;
    }

    public final long b() {
        return wd.b.o(this.f30009b, this.f30008a.f25489m);
    }

    public final long c() {
        int i4 = this.f30008a.f25490n;
        a1 a1Var = this.f30009b;
        nk.k.e(a1Var, "orientation");
        int iOrdinal = a1Var.ordinal();
        if (iOrdinal == 0) {
            return (i4 & 4294967295L) | (0 << 32);
        }
        if (iOrdinal == 1) {
            return (i4 << 32) | (4294967295L & 0);
        }
        throw new ac.m();
    }
}
