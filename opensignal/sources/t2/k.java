package t2;

import lf.t1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final l[] f22393b = {new l(0), new l(4294967296L), new l(8589934592L)};

    /* renamed from: c, reason: collision with root package name */
    public static final long f22394c = t1.B(0, Float.NaN);

    /* renamed from: a, reason: collision with root package name */
    public final long f22395a;

    public /* synthetic */ k(long j) {
        this.f22395a = j;
    }

    public static final boolean a(long j, long j7) {
        return j == j7;
    }

    public static final long b(long j) {
        return f22393b[(int) ((j & 1095216660480L) >>> 32)].f22396a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        long jB = b(j);
        if (l.a(jB, 0L)) {
            return "Unspecified";
        }
        if (l.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!l.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f22395a == ((k) obj).f22395a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22395a);
    }

    public final String toString() {
        return d(this.f22395a);
    }
}
