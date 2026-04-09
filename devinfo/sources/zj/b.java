package zj;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {
    public static void a(int i4, int i10) {
        if (i4 < 0 || i4 >= i10) {
            throw new IndexOutOfBoundsException(a0.g.i(i4, i10, "index: ", ", size: "));
        }
    }

    public static void b(int i4, int i10) {
        if (i4 < 0 || i4 > i10) {
            throw new IndexOutOfBoundsException(a0.g.i(i4, i10, "index: ", ", size: "));
        }
    }

    public static void c(int i4, int i10, int i11) {
        if (i4 < 0 || i10 > i11) {
            StringBuilder sbN = r5.c.n(i4, "fromIndex: ", ", toIndex: ", i10, ", size: ");
            sbN.append(i11);
            throw new IndexOutOfBoundsException(sbN.toString());
        }
        if (i4 > i10) {
            throw new IllegalArgumentException(a0.g.i(i4, i10, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int d(int i4, int i10) {
        int i11 = i4 + (i4 >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        return i11 - 2147483639 > 0 ? i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i11;
    }
}
