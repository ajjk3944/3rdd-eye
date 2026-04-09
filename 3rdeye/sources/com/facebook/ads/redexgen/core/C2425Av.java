package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Av, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2425Av extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{52, 19, 27, 30, 23, 22, 82, 6, 29, 82, 3, 7, 23, 0, 11, 82, 7, 28, 22, 23, 0, 30, 11, 27, 28, 21, 82, 31, 23, 22, 27, 19, 82, 17, 29, 22, 23, 17, 1};
    }

    public C2425Av(Throwable th) {
        super(A00(0, 39, 35), th);
    }
}
