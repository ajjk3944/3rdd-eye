package u0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t1 extends q {

    /* renamed from: d, reason: collision with root package name */
    public final q f34986d;

    /* renamed from: e, reason: collision with root package name */
    public final int f34987e;

    public t1(q qVar, int i4) {
        this.f34986d = qVar;
        this.f34987e = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return nk.k.a(t1Var.f34986d, this.f34986d) && t1Var.f34987e == this.f34987e;
    }

    public final int hashCode() {
        return this.f34986d.hashCode() + (this.f34987e * 31);
    }
}
