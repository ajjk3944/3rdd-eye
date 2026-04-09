package u0;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d2 {
    public static final int a(int i4, int[] iArr) {
        return iArr[(i4 * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i4, int i10) {
        int iE = e(arrayList, i4, i10);
        return iE >= 0 ? iE : -(iE + 1);
    }

    public static final int c(int i4, int[] iArr) {
        int i10 = i4 * 5;
        return Integer.bitCount(iArr[i10 + 1] >> 28) + iArr[i10 + 4];
    }

    public static final void d(int[] iArr, int i4, int i10) {
        if (i10 >= 0) {
        }
        int i11 = (i4 * 5) + 1;
        iArr[i11] = i10 | (iArr[i11] & (-67108864));
    }

    public static final int e(ArrayList arrayList, int i4, int i10) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int i13 = ((a) arrayList.get(i12)).f34724a;
            if (i13 < 0) {
                i13 += i10;
            }
            int iF = nk.k.f(i13, i4);
            if (iF < 0) {
                i11 = i12 + 1;
            } else {
                if (iF <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
