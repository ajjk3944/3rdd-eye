package com.google.common.collect;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class l {
    public static Object a(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i10);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int b(int i10, int i11) {
        return i10 & (~i11);
    }

    public static int c(int i10, int i11) {
        return i10 & i11;
    }

    public static int d(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static int e(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    public static int f(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int iD = z.d(obj);
        int i13 = iD & i10;
        int iH = h(obj3, i13);
        if (iH == 0) {
            return -1;
        }
        int iB = b(iD, i10);
        int i14 = -1;
        while (true) {
            i11 = iH - 1;
            i12 = iArr[i11];
            if (b(i12, i10) == iB && com.google.common.base.f.a(obj, objArr[i11]) && (objArr2 == null || com.google.common.base.f.a(obj2, objArr2[i11]))) {
                break;
            }
            int iC = c(i12, i10);
            if (iC == 0) {
                return -1;
            }
            i14 = i11;
            iH = iC;
        }
        int iC2 = c(i12, i10);
        if (i14 == -1) {
            i(obj3, i13, iC2);
            return i11;
        }
        iArr[i14] = d(iArr[i14], iC2, i10);
        return i11;
    }

    public static void g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static int h(Object obj, int i10) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    public static void i(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static int j(int i10) {
        return Math.max(4, z.a(i10 + 1, 1.0d));
    }
}
