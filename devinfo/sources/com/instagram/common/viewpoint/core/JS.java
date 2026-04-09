package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public enum JS {
    A03,
    A04;

    public static byte[] A00;
    public static String[] A01 = {"AGSeLGKSRVWHjwpJcBbRLkJfLT8WtSj5", "H7iAoy9xUjOjDwkyYn3gaRvOJ1nIBHLJ", "EVfEuZVSowgq13ZnxgimNyesiv2WPjJR", "wEMBUpOgjO3FJGZSz1OinbfqqxPYLP66", "CBkqendLt6fx", "OD9b4WhLx6uMipDOtSe029KXVXZlCbYX", "5yVEyiRs1KvMosNbPykruqGUah2O3DeM", "pqSqJaa9ICEXDKYBpEheNdvD5WKufuNj"};

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            int i13 = (bArrCopyOfRange[i12] - i11) - 61;
            String[] strArr = A01;
            if (strArr[1].charAt(13) != strArr[0].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "ai0karKAJoeNx7Xk9C6gfqHAQPI6uXke";
            strArr2[7] = "u7OYJqR0ngtg88afXXFiWDXiPlKyUSBE";
            bArrCopyOfRange[i12] = (byte) i13;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-34, -35, -44, -73, -70, -78};
    }

    static {
        A01();
    }
}
