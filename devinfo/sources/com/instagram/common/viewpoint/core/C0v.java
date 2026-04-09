package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0v, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0v extends C1B {
    public static byte[] A00;
    public static final CC A01;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
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
        A01 = new C0v();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0v() {
        final String strA00 = A00(0, 18, 12);
        new C2S(strA00) { // from class: com.facebook.ads.redexgen.X.1B
            public final String A00;

            {
                this.A00 = (String) AbstractC1666ki.A04(strA00);
            }

            public final String toString() {
                return this.A00;
            }
        };
    }

    @Override // com.instagram.common.viewpoint.core.CC
    public final int A08(CharSequence sequence, int start) {
        int length = sequence.length();
        AbstractC1666ki.A01(start, length);
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.CC
    public final boolean A09(char c9) {
        return false;
    }
}
