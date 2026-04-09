package d3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b {
    public static final long a(int i4, int i10, int i11, int i12) {
        if (!((i11 >= 0) & (i10 >= i4) & (i12 >= i11) & (i4 >= 0))) {
            h.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return g(i4, i10, i11, i12);
    }

    public static /* synthetic */ long b(int i4, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return a(0, i4, 0, i10);
    }

    public static final int c(int i4) {
        if (i4 < 8191) {
            return 13;
        }
        if (i4 < 32767) {
            return 15;
        }
        if (i4 < 65535) {
            return 16;
        }
        return i4 < 262143 ? 18 : 255;
    }

    public static final long d(long j, long j8) {
        int i4 = (int) (j8 >> 32);
        int iJ = a.j(j);
        int iH = a.h(j);
        if (i4 < iJ) {
            i4 = iJ;
        }
        if (i4 <= iH) {
            iH = i4;
        }
        int i10 = (int) (j8 & 4294967295L);
        int i11 = a.i(j);
        int iG = a.g(j);
        if (i10 < i11) {
            i10 = i11;
        }
        if (i10 <= iG) {
            iG = i10;
        }
        return (iH << 32) | (4294967295L & iG);
    }

    public static final int e(int i4, long j) {
        int i10 = a.i(j);
        int iG = a.g(j);
        if (i4 < i10) {
            i4 = i10;
        }
        return i4 > iG ? iG : i4;
    }

    public static final int f(int i4, long j) {
        int iJ = a.j(j);
        int iH = a.h(j);
        if (i4 < iJ) {
            i4 = iJ;
        }
        return i4 > iH ? iH : i4;
    }

    public static final long g(int i4, int i10, int i11, int i12) {
        int i13 = i12 == Integer.MAX_VALUE ? i11 : i12;
        int iC = c(i13);
        int i14 = i10 == Integer.MAX_VALUE ? i4 : i10;
        int iC2 = c(i14);
        if (iC + iC2 > 31) {
            i(i14, i13);
        }
        int i15 = i10 + 1;
        int i16 = i12 + 1;
        int i17 = iC2 - 13;
        return ((i15 & (~(i15 >> 31))) << 33) | ((i17 >> 1) + (i17 & 1)) | (i4 << 2) | (i11 << (iC2 + 2)) | ((i16 & (~(i16 >> 31))) << (iC2 + 33));
    }

    public static final long h(int i4, int i10, long j) {
        int iJ = a.j(j) + i4;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = a.h(j);
        if (iH != Integer.MAX_VALUE && (iH = iH + i4) < 0) {
            iH = 0;
        }
        int i11 = a.i(j) + i10;
        if (i11 < 0) {
            i11 = 0;
        }
        int iG = a.g(j);
        return a(iJ, iH, i11, (iG == Integer.MAX_VALUE || (iG = iG + i10) >= 0) ? iG : 0);
    }

    public static final void i(int i4, int i10) {
        throw new IllegalArgumentException(r5.c.i(i4, "Can't represent a width of ", " and height of ", i10, " in Constraints"));
    }

    public static final Void j(int i4) {
        throw new IllegalArgumentException(r5.c.h(i4, "Can't represent a size of ", " in Constraints"));
    }
}
