package com.facebook.ads.redexgen.core;

import javax.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public abstract class OR {
    public static String[] A00 = {"nDiC2V", "xvPzB4voGkHgvzabNn8fejRwCVSwo6Ah", "OJIGMHO1ySc0mzACRtkWxwocBaSnW5m2", "JbsfTTx", "hwYl", "U04BYM1NuctRYg5sssH2", "d2TQ", "mxYxJu"};
    public static final int[] A01 = new int[0];
    public static final long[] A02 = new long[0];
    public static final Object[] A03 = new Object[0];

    public static int A00(int i) {
        return A01(i * 8) / 8;
    }

    public static int A01(int i) {
        int i10 = 4;
        while (A00[5].length() == 20) {
            A00[5] = "sf2HjvEbKVwFe9jamb5q";
            if (i10 >= 32) {
                return i;
            }
            int i11 = 1 << i10;
            if (i <= i11 - 12) {
                int i12 = (1 << i10) - 12;
                return i12;
            }
            i10++;
        }
        throw new RuntimeException();
    }

    public static int A02(int[] iArr, int i, int i10) {
        int midVal = 0;
        int i11 = i - 1;
        while (midVal <= i11) {
            int i12 = midVal + i11;
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[2];
            int hi = str.charAt(26);
            int lo = str2.charAt(26);
            if (hi != lo) {
                throw new RuntimeException();
            }
            A00[3] = "GyF3CdngjgIBS8WP";
            int hi2 = i12 >>> 1;
            int lo2 = iArr[hi2];
            if (lo2 < i10) {
                midVal = hi2 + 1;
            } else if (lo2 > i10) {
                i11 = hi2 - 1;
            } else {
                return hi2;
            }
        }
        int lo3 = ~midVal;
        return lo3;
    }

    public static int A03(long[] jArr, int i, long j4) {
        int i10 = 0;
        int i11 = i - 1;
        while (i10 <= i11) {
            int lo = i10 + i11;
            int i12 = lo >>> 1;
            long j10 = jArr[i12];
            if (j10 < j4) {
                i10 = i12 + 1;
            } else {
                String[] strArr = A00;
                String str = strArr[4];
                String str2 = strArr[6];
                int hi = str.length();
                int lo2 = str2.length();
                if (hi != lo2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A00;
                strArr2[4] = "jlrm";
                strArr2[6] = "MXd0";
                if (j10 > j4) {
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
