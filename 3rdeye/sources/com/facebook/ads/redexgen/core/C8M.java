package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8M, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8M extends Exception {
    public static byte[] A03;
    public final int A00;
    public final C3949or A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-26, 26, 9, 14, 20, -7, 23, 6, 8, 16, -59, 28, 23, 14, 25, 10, -59, 11, 6, 14, 17, 10, 9, -33, -59};
    }

    public C8M(int i, C3949or c3949or, boolean z10) {
        super(A00(0, 25, 91) + i);
        this.A02 = z10;
        this.A00 = i;
        this.A01 = c3949or;
    }
}
