package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class S0 {
    public static S1 A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-91, -88, -79, -90, -85, -80, -92, -75, -82};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (S0.class) {
            if (A00 == null) {
                return;
            }
            C2886Sw c2886Sw = new C2886Sw(A00.AHr());
            c2886Sw.A05(1);
            C3246cu c3246cuA00 = SP.A00();
            if (c3246cuA00 != null) {
                c3246cuA00.A08().AAy(A00(0, 9, 49), 3401, c2886Sw);
            }
            A00.reset();
        }
    }

    public static void A03(long j4) {
        if (j4 > 0) {
            A00 = new C3308dw();
            new S2(j4);
        }
    }
}
