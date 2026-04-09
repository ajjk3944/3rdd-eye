package d3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final o[] f21970b = {new o(0), new o(4294967296L), new o(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f21971c = nh.a.p(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f21972a;

    public static final boolean a(long j, long j8) {
        return j == j8;
    }

    public static final long b(long j) {
        return f21970b[(int) ((j & 1095216660480L) >>> 32)].f21973a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static String e(long j) {
        long jB = b(j);
        if (o.a(jB, 0L)) {
            return "Unspecified";
        }
        if (o.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!o.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f21972a == ((n) obj).f21972a;
        }
        return false;
    }

    public final int hashCode() {
        return d(this.f21972a);
    }

    public final String toString() {
        return e(this.f21972a);
    }
}
