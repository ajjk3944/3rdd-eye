package com.instagram.common.viewpoint.core;

import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class P5 {
    public static String[] A00 = {"nDiC2V", "xvPzB4voGkHgvzabNn8fejRwCVSwo6Ah", "OJIGMHO1ySc0mzACRtkWxwocBaSnW5m2", "JbsfTTx", "hwYl", "U04BYM1NuctRYg5sssH2", "d2TQ", "mxYxJu"};
    public static final int[] A01 = new int[0];
    public static final long[] A02 = new long[0];
    public static final Object[] A03 = new Object[0];

    public static int A00(int i4) {
        return A01(i4 * 8) / 8;
    }

    public static int A01(int i4) {
        int i10 = 4;
        while (A00[5].length() == 20) {
            A00[5] = "sf2HjvEbKVwFe9jamb5q";
            if (i10 >= 32) {
                return i4;
            }
            int i11 = 1 << i10;
            if (i4 <= i11 - 12) {
                int i12 = (1 << i10) - 12;
                return i12;
            }
            i10++;
        }
        throw new RuntimeException();
    }

    public static int A02(int[] iArr, int i4, int i10) {
        int midVal = 0;
        int i11 = i4 - 1;
        while (midVal <= i11) {
            int i12 = midVal + i11;
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[2];
            int hi2 = str.charAt(26);
            int lo = str2.charAt(26);
            if (hi2 != lo) {
                throw new RuntimeException();
            }
            A00[3] = "GyF3CdngjgIBS8WP";
            int hi3 = i12 >>> 1;
            int lo2 = iArr[hi3];
            if (lo2 < i10) {
                midVal = hi3 + 1;
            } else if (lo2 > i10) {
                i11 = hi3 - 1;
            } else {
                return hi3;
            }
        }
        int lo3 = ~midVal;
        return lo3;
    }

    public static int A03(long[] jArr, int i4, long j) {
        int i10 = 0;
        int i11 = i4 - 1;
        while (i10 <= i11) {
            int lo = i10 + i11;
            int i12 = lo >>> 1;
            long j8 = jArr[i12];
            if (j8 < j) {
                i10 = i12 + 1;
            } else {
                String[] strArr = A00;
                String str = strArr[4];
                String str2 = strArr[6];
                int hi2 = str.length();
                int lo2 = str2.length();
                if (hi2 != lo2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A00;
                strArr2[4] = "jlrm";
                strArr2[6] = "MXd0";
                if (j8 > j) {
                    i11 = i12 - 1;
                } else {
                    return i12;
                }
            }
        }
        int lo3 = ~i10;
        return lo3;
    }

    public static boolean A04(@Nullable Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
