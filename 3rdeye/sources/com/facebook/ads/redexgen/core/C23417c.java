package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C23417c extends AbstractC3609j4<LF> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public C23417c(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3609j4
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final LN A04(LF lf) {
        return new LN(this, lf == null ? A00(0, 4, 46) : A00(0, 0, 18) + lf.A03());
    }
}
