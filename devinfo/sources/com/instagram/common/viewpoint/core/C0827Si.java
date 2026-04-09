package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Si, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0827Si {
    public static InterfaceC0828Sj A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i4, i4 + i10);
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
        synchronized (C0827Si.class) {
            if (A00 == null) {
                return;
            }
            C0849Te c0849Te = new C0849Te(A00.AIb());
            c0849Te.A05(1);
            C1432ge c1432geA00 = T7.A00();
            if (c1432geA00 != null) {
                c1432geA00.A08().ABC(A00(0, 9, 49), 3401, c0849Te);
            }
            A00.reset();
        }
    }

    public static void A03(long j) {
        if (j > 0) {
            A00 = new C1445gr();
            new C0829Sk(j);
        }
    }
}
