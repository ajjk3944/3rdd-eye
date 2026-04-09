package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class GU extends AbstractRunnableC0923Wc {
    public static byte[] A01;
    public final /* synthetic */ C4V A00;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{102, 89, 84, 85, 95, 16, 71, 81, 67, 16, 94, 85, 70, 85, 66, 16, 64, 66, 85, 64, 81, 66, 85, 84};
    }

    public GU(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        if (!this.A00.A0E) {
            this.A00.A0Q(A00(0, 24, 46));
        }
    }
}
