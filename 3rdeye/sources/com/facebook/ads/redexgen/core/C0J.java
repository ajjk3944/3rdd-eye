package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0J extends AbstractC21590a {
    public static byte[] A00;
    public static final BZ A01;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{9, 34, 43, 56, 7, 43, 62, 41, 34, 47, 56, 100, 36, 37, 36, 47, 98, 99};
    }

    static {
        A01();
        A01 = new C0J();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0J() {
        final String strA00 = A00(0, 18, 12);
        new AbstractC22001p(strA00) { // from class: com.facebook.ads.redexgen.X.0a
            public final String A00;

            {
                this.A00 = (String) AbstractC3614jA.A04(strA00);
            }

            public final String toString() {
                return this.A00;
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.BZ
    public final int A08(CharSequence sequence, int start) {
        int length = sequence.length();
        AbstractC3614jA.A01(start, length);
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.BZ
    public final boolean A09(char c10) {
        return false;
    }
}
