package v;

import br.l;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f23729a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f23730b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f23731c = new Object[0];

    public static final int a(int i10, int i11, int[] iArr) {
        l.e(iArr, "array");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static final int b(long[] jArr, int i10, long j) {
        l.e(jArr, "array");
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j7 = jArr[i13];
            if (j7 < j) {
                i12 = i13 + 1;
            } else {
                if (j7 <= j) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final void c(String str) {
        l.e(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        l.e(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void e(String str) {
        l.e(str, "message");
        throw new NoSuchElementException(str);
    }
}
