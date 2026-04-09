package o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f30377a;

    public static final boolean a(long j, long j8) {
        return j == j8;
    }

    public static final float b(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    public static final boolean c(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    public static String d(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + com.bumptech.glide.c.u(Float.intBitsToFloat((int) (j >> 32))) + ", " + com.bumptech.glide.c.u(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f30377a == ((e) obj).f30377a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f30377a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return d(this.f30377a);
    }
}
