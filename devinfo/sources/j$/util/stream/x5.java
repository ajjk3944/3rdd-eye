package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public abstract class x5 {
    public static long c(long j, long j8) {
        long j9 = j8 >= 0 ? j + j8 : Long.MAX_VALUE;
        if (j9 >= 0) {
            return j9;
        }
        return Long.MAX_VALUE;
    }

    public static long a(long j, long j8, long j9) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j8, j9));
        }
        return -1L;
    }

    public static Spliterator b(b7 b7Var, Spliterator spliterator, long j, long j8) {
        long jC = c(j, j8);
        int i4 = v5.f26780a[b7Var.ordinal()];
        if (i4 == 1) {
            return new u7(spliterator, j, jC);
        }
        if (i4 == 2) {
            return new r7((Spliterator.OfInt) spliterator, j, jC);
        }
        if (i4 == 3) {
            return new s7((j$.util.z0) spliterator, j, jC);
        }
        if (i4 != 4) {
            throw new IllegalStateException("Unknown shape " + b7Var);
        }
        return new q7((j$.util.u0) spliterator, j, jC);
    }

    public static o5 h(e5 e5Var, long j, long j8) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new o5(e5Var, d(j8), j, j8);
    }

    public static q5 f(z0 z0Var, long j, long j8) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new q5(z0Var, d(j8), j, j8);
    }

    public static s5 g(h1 h1Var, long j, long j8) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new s5(h1Var, d(j8), j, j8);
    }

    public static u5 e(y yVar, long j, long j8) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new u5(yVar, d(j8), j, j8);
    }

    public static int d(long j) {
        return (j != -1 ? a7.f26493u : 0) | a7.f26492t;
    }
}
