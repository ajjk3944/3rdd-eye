package Y0;

import kotlin.KotlinNothingValueException;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public abstract class c {
    public static final long a(int i10, int i11, int i12, int i13) {
        boolean z10 = false;
        if (!(i11 >= i10)) {
            m.a("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')');
        }
        if (!(i13 >= i12)) {
            m.a("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')');
        }
        if (i10 >= 0 && i12 >= 0) {
            z10 = true;
        }
        if (!z10) {
            m.a("minWidth(" + i10 + ") and minHeight(" + i12 + ") must be >= 0");
        }
        return j(i10, i11, i12, i13);
    }

    public static /* synthetic */ long b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(i10, i11, i12, i13);
    }

    private static final int d(int i10, int i11) {
        return i10 == Integer.MAX_VALUE ? i10 : AbstractC7978m.d(i10 + i11, 0);
    }

    private static final int e(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        return i10 < 262143 ? 18 : 255;
    }

    public static final long f(long j10, long j11) {
        return s.a(AbstractC7978m.k(r.g(j11), b.n(j10), b.l(j10)), AbstractC7978m.k(r.f(j11), b.m(j10), b.k(j10)));
    }

    public static final long g(long j10, long j11) {
        return a(AbstractC7978m.k(b.n(j11), b.n(j10), b.l(j10)), AbstractC7978m.k(b.l(j11), b.n(j10), b.l(j10)), AbstractC7978m.k(b.m(j11), b.m(j10), b.k(j10)), AbstractC7978m.k(b.k(j11), b.m(j10), b.k(j10)));
    }

    public static final int h(long j10, int i10) {
        return AbstractC7978m.k(i10, b.m(j10), b.k(j10));
    }

    public static final int i(long j10, int i10) {
        return AbstractC7978m.k(i10, b.n(j10), b.l(j10));
    }

    public static final long j(int i10, int i11, int i12, int i13) {
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iE = e(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iE2 = e(i15);
        if (iE + iE2 > 31) {
            k(i15, i14);
        }
        int i16 = i11 + 1;
        int i17 = i16 & (~(i16 >> 31));
        int i18 = i13 + 1;
        int i19 = i18 & (~(i18 >> 31));
        int i20 = 0;
        if (iE2 != 13) {
            if (iE2 == 18) {
                i20 = 3;
            } else if (iE2 == 15) {
                i20 = 1;
            } else if (iE2 == 16) {
                i20 = 2;
            }
        }
        int i21 = ((i20 & 1) << 1) + (((i20 & 2) >> 1) * 3);
        return b.b((i17 << 33) | i20 | (i10 << 2) | (i12 << (i21 + 15)) | (i19 << (i21 + 46)));
    }

    private static final void k(int i10, int i11) {
        throw new IllegalArgumentException("Can't represent a width of " + i10 + " and height of " + i11 + " in Constraints");
    }

    private static final Void l(int i10) {
        throw new IllegalArgumentException("Can't represent a size of " + i10 + " in Constraints");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(int i10) {
        if (i10 < 8191) {
            return 262142;
        }
        if (i10 < 32767) {
            return 65534;
        }
        if (i10 < 65535) {
            return 32766;
        }
        if (i10 < 262143) {
            return 8190;
        }
        l(i10);
        throw new KotlinNothingValueException();
    }

    public static final long n(long j10, int i10, int i11) {
        return a(AbstractC7978m.d(b.n(j10) + i10, 0), d(b.l(j10), i10), AbstractC7978m.d(b.m(j10) + i11, 0), d(b.k(j10), i11));
    }

    public static /* synthetic */ long o(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return n(j10, i10, i11);
    }
}
