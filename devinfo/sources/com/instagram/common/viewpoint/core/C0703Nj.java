package com.instagram.common.viewpoint.core;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0703Nj implements Serializable {
    public static byte[] A04 = null;
    public static final long serialVersionUID = 351643298236575729L;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    static {
        A02();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-124, -2, -26, -8, -11, -11, -24, -15, -26, -4, 0, -36, -46, -42, -62, -49, -43, -54, -43, -38, -34};
    }

    public C0703Nj(C0702Ni c0702Ni) {
        this.A02 = c0702Ni.A02;
        this.A03 = c0702Ni.A03;
        this.A00 = c0702Ni.A00;
        this.A01 = c0702Ni.A01;
    }

    public static String A01(String str, String str2, int i4) {
        String strReplace = str.replace(A00(1, 10, 68), str2);
        String strA00 = A00(0, 0, 39);
        if (i4 > 0) {
            StringBuilder sbAppend = new StringBuilder().append(i4);
            String updatedString = A00(0, 1, 37);
            strA00 = sbAppend.append(updatedString).toString();
        }
        String updatedString2 = A00(11, 10, 34);
        return strReplace.replace(updatedString2, strA00);
    }

    public final String A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }

    public final String A05() {
        return this.A02;
    }

    public final String A06(String str, int i4) {
        return A01(this.A03, str, i4);
    }
}
