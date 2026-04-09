package j2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: c, reason: collision with root package name */
    public static final c1 f27102c = new c1(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f27103a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27104b;

    public c1(long j, long j8) {
        this.f27103a = j;
        this.f27104b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return d3.k.a(this.f27103a, c1Var.f27103a) && this.f27104b == c1Var.f27104b;
    }

    public final int hashCode() {
        long j = this.f27103a;
        int i4 = ((int) (j ^ (j >>> 32))) * 31;
        long j8 = this.f27104b;
        return i4 + ((int) ((j8 >>> 32) ^ j8));
    }
}
