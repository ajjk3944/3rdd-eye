package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.fP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC3398fP {
    A03(A01(35, 4, 16)),
    A04(A01(39, 4, 41));

    public static byte[] A01;
    public String A00;

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{125, 110, 119, 119, 99, 68, 92, 75, 70, 67, 78, 10, 89, 79, 88, 92, 79, 88, 10, 88, 79, 89, 90, 69, 68, 89, 79, 16, 10, 15, 89, 40, 38, 38, 51, 110, 125, 100, 100, 90, 84, 84, 65};
    }

    static {
        A02();
    }

    EnumC3398fP(String str) {
        this.A00 = str;
    }

    public static EnumC3398fP A00(String str) {
        for (EnumC3398fP enumC3398fP : values()) {
            if (enumC3398fP.A00.equals(str)) {
                return enumC3398fP;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 50), str));
    }
}
