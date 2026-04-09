package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.p4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3961p4 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{49, 53, 46, 54, 51, 52, 116, 48, 44, 55, 116, 60, 47, 52, 57, 46, 51, 53, 52, 41, 116};
    }

    public final String A02(InterfaceC23989u interfaceC23989u) {
        String string = interfaceC23989u.getClass().getGenericInterfaces()[0].toString();
        String strA00 = A00(0, 21, 12);
        return string.startsWith(strA00) ? string.substring(strA00.length()) : string;
    }

    public final String A03(C1C c1c) {
        return A02(c1c);
    }
}
