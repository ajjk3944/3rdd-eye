package n0;

import kotlin.jvm.internal.l;

/* compiled from: ContainerHelpers.kt */
/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5346a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f44190a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f44191b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f44192c = new Object[0];

    public static final int a(int i, int i10, int[] array) {
        l.f(array, "array");
        int i11 = i - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = array[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else {
                if (i14 <= i10) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final int b(long[] array, int i, long j4) {
        l.f(array, "array");
        int i10 = i - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j10 = array[i12];
            if (j10 < j4) {
                i11 = i12 + 1;
            } else {
                if (j10 <= j4) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }
}
