package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ij, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3588ij extends MH {
    public static byte[] A01;
    public static final String A02;
    public final Uri A00;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{16, 43, 51, 54, 47, 46, -22, 62, 57, -22, 57, 58, 47, 56, -22, 54, 51, 56, 53, -22, 63, 60, 54, 4, -22};
    }

    static {
        A01();
        A02 = C3588ij.class.getSimpleName();
    }

    public C3588ij(C3272dL c3272dL, US us, String str, Uri uri) {
        super(c3272dL, us, str);
        this.A00 = uri;
    }

    @Override // com.facebook.ads.redexgen.core.MH
    public final ME A0G(String str) {
        try {
            WN.A0E(new WN(), this.A01, this.A00, this.A03);
        } catch (Exception unused) {
            String str2 = A00(0, 25, 104) + this.A00.toString();
        }
        return ME.A09;
    }
}
