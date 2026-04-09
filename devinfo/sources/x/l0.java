package x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f36914a = {-9187201950435737345L, -1};

    static {
        new e0(0);
    }

    public static final int a(int i4) {
        if (i4 == 7) {
            return 6;
        }
        return i4 - (i4 / 8);
    }

    public static final int b(int i4) {
        if (i4 == 0) {
            return 6;
        }
        return (i4 * 2) + 1;
    }

    public static final int c(int i4) {
        if (i4 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i4);
        }
        return 0;
    }

    public static final int d(int i4) {
        if (i4 == 7) {
            return 8;
        }
        return ((i4 - 1) / 7) + i4;
    }
}
