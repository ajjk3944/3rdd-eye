package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2532Fb extends AbstractRunnableC2959Vt {
    public static byte[] A01;
    public final /* synthetic */ C22523r A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-67, -48, -53, -52, -42, -121, -34, -56, -38, -121, -43, -52, -35, -52, -39, -121, -41, -39, -52, -41, -56, -39, -52, -53};
    }

    public C2532Fb(C22523r c22523r) {
        this.A00 = c22523r;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        if (!this.A00.A0E) {
            this.A00.A0R(A00(0, 24, 8));
        }
    }
}
