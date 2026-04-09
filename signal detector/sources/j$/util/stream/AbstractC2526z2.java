package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2526z2 {
    public static long c(long j6, long j7) {
        long j8 = j7 >= 0 ? j6 + j7 : Long.MAX_VALUE;
        if (j8 >= 0) {
            return j8;
        }
        return Long.MAX_VALUE;
    }

    public static long a(long j6, long j7, long j8) {
        if (j6 >= 0) {
            return Math.max(-1L, Math.min(j6 - j7, j8));
        }
        return -1L;
    }

    public static Spliterator b(EnumC2418d3 enumC2418d3, Spliterator spliterator, long j6, long j7) {
        long jC = c(j6, j7);
        int i = AbstractC2516x2.f21193a[enumC2418d3.ordinal()];
        if (i == 1) {
            return new C2512w3(spliterator, j6, jC);
        }
        if (i == 2) {
            return new C2497t3((Spliterator.OfInt) spliterator, j6, jC);
        }
        if (i == 3) {
            return new C2502u3((j$.util.K) spliterator, j6, jC);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + enumC2418d3);
        }
        return new C2492s3((j$.util.F) spliterator, j6, jC);
    }

    public static C2482q2 h(AbstractC2432g2 abstractC2432g2, long j6, long j7) {
        if (j6 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j6);
        }
        return new C2482q2(abstractC2432g2, d(j7), j6, j7);
    }

    public static C2491s2 f(AbstractC2405b0 abstractC2405b0, long j6, long j7) {
        if (j6 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j6);
        }
        return new C2491s2(abstractC2405b0, d(j7), j6, j7);
    }

    public static C2501u2 g(AbstractC2445j0 abstractC2445j0, long j6, long j7) {
        if (j6 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j6);
        }
        return new C2501u2(abstractC2445j0, d(j7), j6, j7);
    }

    public static C2511w2 e(AbstractC2523z abstractC2523z, long j6, long j7) {
        if (j6 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j6);
        }
        return new C2511w2(abstractC2523z, d(j7), j6, j7);
    }

    public static int d(long j6) {
        return (j6 != -1 ? EnumC2413c3.f21041u : 0) | EnumC2413c3.f21040t;
    }
}
