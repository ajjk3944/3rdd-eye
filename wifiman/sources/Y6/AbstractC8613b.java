package y6;

/* renamed from: y6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8613b {
    public static final int a(int i10, float f10, float f11, float f12, float f13) {
        return b(i10, (int) (f10 * 255.0f), (int) (f11 * 255.0f), (int) (f12 * 255.0f), (int) (f13 * 255.0f));
    }

    public static final int b(int i10, int i11, int i12, int i13, int i14) {
        return (i11 << 24) | (i12 << 16) | (i13 << 8) | i14;
    }

    public static /* synthetic */ int c(int i10, float f10, float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f10 = d(i10, 24) / 255.0f;
        }
        if ((i11 & 2) != 0) {
            f11 = d(i10, 16) / 255.0f;
        }
        if ((i11 & 4) != 0) {
            f12 = d(i10, 8) / 255.0f;
        }
        if ((i11 & 8) != 0) {
            f13 = d(i10, 0) / 255.0f;
        }
        return a(i10, f10, f11, f12, f13);
    }

    private static final int d(int i10, int i11) {
        return (i10 >> i11) & 255;
    }

    public static final int e(int i10) {
        return d(i10, 24);
    }
}
