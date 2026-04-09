package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1097bD {
    A05(0),
    A04(1),
    A03(2);

    public static byte[] A01;
    public int A00;

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{78, 67, 76, 70, 81, 65, 67, 82, 71, 56, 39, 58, 60, 58, 41, 33, 60, 22, 13, 16, 19, 6, 0, 10, 5, 10, 6, 7};
    }

    static {
        A02();
    }

    EnumC1097bD(int i4) {
        this.A00 = i4;
    }

    public static EnumC1097bD A00(int i4) {
        for (EnumC1097bD enumC1097bD : values()) {
            if (enumC1097bD.A00 == i4) {
                return enumC1097bD;
            }
        }
        return A04;
    }

    public final int A04() {
        return this.A00;
    }
}
