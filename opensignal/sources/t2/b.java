package t2;

/* loaded from: classes.dex */
public abstract class b {
    public static final long a(int i10, int i11, int i12, int i13) {
        if (!((i12 >= 0) & (i11 >= i10) & (i13 >= i12) & (i10 >= 0))) {
            g.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return g(i10, i11, i12, i13);
    }

    public static /* synthetic */ long b(int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i12 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return a(0, i10, 0, i11);
    }

    public static final int c(int i10) {
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

    public static final long d(long j, long j7) {
        int i10 = (int) (j7 >> 32);
        int iJ = a.j(j);
        int iH = a.h(j);
        if (i10 < iJ) {
            i10 = iJ;
        }
        if (i10 <= iH) {
            iH = i10;
        }
        int i11 = (int) (j7 & 4294967295L);
        int i12 = a.i(j);
        int iG = a.g(j);
        if (i11 < i12) {
            i11 = i12;
        }
        if (i11 <= iG) {
            iG = i11;
        }
        return (iH << 32) | (iG & 4294967295L);
    }

    public static final int e(int i10, long j) {
        int i11 = a.i(j);
        int iG = a.g(j);
        if (i10 < i11) {
            i10 = i11;
        }
        return i10 > iG ? iG : i10;
    }

    public static final int f(int i10, long j) {
        int iJ = a.j(j);
        int iH = a.h(j);
        if (i10 < iJ) {
            i10 = iJ;
        }
        return i10 > iH ? iH : i10;
    }

    public static final long g(int i10, int i11, int i12, int i13) {
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iC = c(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iC2 = c(i15);
        if (iC + iC2 > 31) {
            h(i15, i14);
        }
        int i16 = i11 + 1;
        int i17 = i13 + 1;
        int i18 = iC2 - 13;
        return ((i16 & (~(i16 >> 31))) << 33) | ((i18 >> 1) + (i18 & 1)) | (i10 << 2) | (i12 << (iC2 + 2)) | ((i17 & (~(i17 >> 31))) << (iC2 + 33));
    }

    public static final void h(int i10, int i11) {
        throw new IllegalArgumentException("Can't represent a width of " + i10 + " and height of " + i11 + " in Constraints");
    }

    public static final Void i(int i10) {
        throw new IllegalArgumentException(h0.b.m("Can't represent a size of ", i10, " in Constraints"));
    }
}
