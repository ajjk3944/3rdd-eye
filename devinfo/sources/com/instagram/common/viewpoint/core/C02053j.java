package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3j, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C02053j extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 104, 110, 103, 104, 98, 106, 99, 98, 38, 96, 105, 116, 107, 103, 114, 60, 38};
    }

    public C02053j(C02043i c02043i) {
        super(A00(0, 18, 51) + c02043i);
    }
}
