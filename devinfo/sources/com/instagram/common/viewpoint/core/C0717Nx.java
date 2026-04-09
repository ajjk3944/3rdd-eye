package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0717Nx implements XN {
    public static byte[] A01;
    public final /* synthetic */ NO A00;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{69, 81, 80, 75, 71, 72, 77, 71, 79};
    }

    public C0717Nx(NO no) {
        this.A00 = no;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        if (!this.A00.A0H && !this.A00.A0G) {
            this.A00.A0W(false, A00(0, 9, 80));
        }
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f10) {
    }
}
