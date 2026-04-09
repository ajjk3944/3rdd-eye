package d3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f21951a;

    public /* synthetic */ a(long j) {
        this.f21951a = j;
    }

    public static long a(int i4, int i10, long j) {
        int iH = h(j);
        int iG = g(j);
        if (iH < i4 || iG < i10 || i4 < 0 || i10 < 0) {
            h.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.g(i4, iH, i10, iG);
    }

    public static final boolean b(long j, long j8) {
        return j == j8;
    }

    public static final boolean c(long j) {
        int i4 = (int) (3 & j);
        int i10 = (((i4 & 2) >> 1) * 3) + ((i4 & 1) << 1);
        return (((int) (j >> (i10 + 46))) & ((1 << (18 - i10)) - 1)) != 0;
    }

    public static final boolean d(long j) {
        int i4 = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i4 & 2) >> 1) * 3) + ((i4 & 1) << 1)) + 13)) - 1)) != 0;
    }

    public static final boolean e(long j) {
        int i4 = (int) (3 & j);
        int i10 = (((i4 & 2) >> 1) * 3) + ((i4 & 1) << 1);
        int i11 = (1 << (18 - i10)) - 1;
        int i12 = ((int) (j >> (i10 + 15))) & i11;
        int i13 = ((int) (j >> (i10 + 46))) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    public static final boolean f(long j) {
        int i4 = (int) (3 & j);
        int i10 = (1 << (((((i4 & 2) >> 1) * 3) + ((i4 & 1) << 1)) + 13)) - 1;
        int i11 = ((int) (j >> 2)) & i10;
        int i12 = ((int) (j >> 33)) & i10;
        return i11 == (i12 == 0 ? Integer.MAX_VALUE : i12 - 1);
    }

    public static final int g(long j) {
        int i4 = (int) (3 & j);
        int i10 = (((i4 & 2) >> 1) * 3) + ((i4 & 1) << 1);
        int i11 = ((int) (j >> (i10 + 46))) & ((1 << (18 - i10)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int h(long j) {
        int i4 = (int) (3 & j);
        int i10 = (int) (j >> 33);
        int i11 = i10 & ((1 << (((((i4 & 2) >> 1) * 3) + ((i4 & 1) << 1)) + 13)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    public static final int i(long j) {
        int i4 = (int) (3 & j);
        int i10 = (((i4 & 2) >> 1) * 3) + ((i4 & 1) << 1);
        return ((int) (j >> (i10 + 15))) & ((1 << (18 - i10)) - 1);
    }

    public static final int j(long j) {
        int i4 = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i4 & 2) >> 1) * 3) + ((i4 & 1) << 1)) + 13)) - 1);
    }

    public static String k(long j) {
        int iH = h(j);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j);
        String strValueOf2 = iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(j(j));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(i(j));
        sb2.append(", maxHeight = ");
        return r5.c.l(sb2, strValueOf2, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f21951a == ((a) obj).f21951a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f21951a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return k(this.f21951a);
    }
}
