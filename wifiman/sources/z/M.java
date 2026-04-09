package z;

/* loaded from: classes.dex */
public abstract class M {
    public static long a(int i10, int i11, int i12, int i13) {
        return b(Y0.c.a(i10, i11, i12, i13));
    }

    private static long b(long j10) {
        return j10;
    }

    public static long c(long j10, K k10) {
        K k11 = K.Horizontal;
        return a(k10 == k11 ? Y0.b.n(j10) : Y0.b.m(j10), k10 == k11 ? Y0.b.l(j10) : Y0.b.k(j10), k10 == k11 ? Y0.b.m(j10) : Y0.b.n(j10), k10 == k11 ? Y0.b.k(j10) : Y0.b.l(j10));
    }

    public static final long d(long j10, int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, i13);
    }

    public static /* synthetic */ long e(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = Y0.b.n(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = Y0.b.l(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = Y0.b.m(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = Y0.b.k(j10);
        }
        return d(j10, i15, i16, i17, i13);
    }

    public static final long f(long j10, K k10) {
        return k10 == K.Horizontal ? Y0.c.a(Y0.b.n(j10), Y0.b.l(j10), Y0.b.m(j10), Y0.b.k(j10)) : Y0.c.a(Y0.b.m(j10), Y0.b.k(j10), Y0.b.n(j10), Y0.b.l(j10));
    }
}
