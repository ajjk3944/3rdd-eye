package r;

import o.AbstractC7020k;

/* loaded from: classes.dex */
public abstract class Q {
    public static final int a(AbstractC7020k abstractC7020k, int i10, int i11, int i12) {
        if (!(i11 <= i12)) {
            AbstractC7518a0.a("fromIndex(" + i11 + ") > toIndex(" + i12 + ')');
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Index out of range: " + i11);
        }
        if (i12 > abstractC7020k.b()) {
            throw new IndexOutOfBoundsException("Index out of range: " + i12);
        }
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int iA = abstractC7020k.a(i14);
            if (iA < i10) {
                i11 = i14 + 1;
            } else {
                if (iA <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static /* synthetic */ int b(AbstractC7020k abstractC7020k, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = abstractC7020k.b();
        }
        return a(abstractC7020k, i10, i11, i12);
    }
}
