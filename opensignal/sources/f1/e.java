package f1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f8416a;

    public /* synthetic */ e(long j) {
        this.f8416a = j;
    }

    public static final boolean a(long j, long j7) {
        return j == j7;
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
        return "Size(" + ic.a.P(Float.intBitsToFloat((int) (j >> 32))) + ", " + ic.a.P(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f8416a == ((e) obj).f8416a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8416a);
    }

    public final String toString() {
        return d(this.f8416a);
    }
}
