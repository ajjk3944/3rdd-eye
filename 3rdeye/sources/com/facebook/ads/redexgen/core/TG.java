package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public enum TG {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 12);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{98, 107, 104, 98, 106, -108, -104, -101, -99, -112, -98, -98, -108, -102, -103, -69, -82, -70, -66, -82, -68, -67};
    }

    static {
        A01();
    }
}
