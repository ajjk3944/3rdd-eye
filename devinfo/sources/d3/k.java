package d3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f21965a;

    public static final boolean a(long j, long j8) {
        return j == j8;
    }

    public static String b(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f21965a == ((k) obj).f21965a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f21965a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return b(this.f21965a);
    }
}
