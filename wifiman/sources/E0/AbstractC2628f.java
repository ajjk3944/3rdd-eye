package E0;

/* renamed from: E0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2628f {
    public static int[] a(int[] iArr) {
        return iArr;
    }

    public static final int b(int[] iArr, int i10) {
        return iArr[i10 + c(iArr)];
    }

    private static final int c(int[] iArr) {
        return iArr.length / 2;
    }

    public static final void d(int[] iArr, int i10, int i11) {
        iArr[i10 + c(iArr)] = i11;
    }
}
