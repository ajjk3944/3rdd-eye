package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.pl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public enum EnumC3988pl {
    A02,
    A04,
    A03;

    public static byte[] A00;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{86, 95, 101, 86, 99, -51, -32, -47, -36, -88, -93, -105, -108, -89, -104};
    }

    static {
        A01();
    }
}
