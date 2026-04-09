package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.g8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3442g8 implements InterfaceC2795Pi {
    public static byte[] A01;
    public final /* synthetic */ C23196g A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-10, 0, -9};
    }

    public C3442g8(C23196g c23196g) {
        this.A00 = c23196g;
    }

    private final void A02(C2796Pj c2796Pj) {
        throw new NullPointerException(A00(0, 3, 40));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2795Pi
    public final void AD2(C2796Pj c2796Pj) {
        A02(c2796Pj);
        throw null;
    }
}
