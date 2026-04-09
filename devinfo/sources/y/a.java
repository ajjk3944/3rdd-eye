package y;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.NoSuchElementException;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f37284a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f37285b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f37286c = new Object[0];

    public static final int a(int[] iArr, int i4, int i10) {
        k.e(iArr, "array");
        int i11 = i4 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
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

    public static final int b(long[] jArr, int i4, long j) {
        k.e(jArr, "array");
        int i10 = i4 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j8 = jArr[i12];
            if (j8 < j) {
                i11 = i12 + 1;
            } else {
                if (j8 <= j) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    public static final void c(String str) {
        k.e(str, PglCryptUtils.KEY_MESSAGE);
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        k.e(str, PglCryptUtils.KEY_MESSAGE);
        throw new IndexOutOfBoundsException(str);
    }

    public static final void e(String str) {
        k.e(str, PglCryptUtils.KEY_MESSAGE);
        throw new NoSuchElementException(str);
    }
}
