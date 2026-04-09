package v;

import q5.i;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2959a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f23829a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f23830b = new Object[0];

    public static final int a(int[] iArr, int i, int i3) {
        i.e(iArr, "array");
        int i6 = i - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i3) {
                i7 = i8 + 1;
            } else {
                if (i9 <= i3) {
                    return i8;
                }
                i6 = i8 - 1;
            }
        }
        return ~i7;
    }

    public static final int b(long[] jArr, int i, long j6) {
        i.e(jArr, "array");
        int i3 = i - 1;
        int i6 = 0;
        while (i6 <= i3) {
            int i7 = (i6 + i3) >>> 1;
            long j7 = jArr[i7];
            if (j7 < j6) {
                i6 = i7 + 1;
            } else {
                if (j7 <= j6) {
                    return i7;
                }
                i3 = i7 - 1;
            }
        }
        return ~i6;
    }
}
