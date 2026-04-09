package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class H6 {
    public static byte[] A03;
    public static String[] A04 = {"HU4YGL7IwZePYHnBLI2PbuSTKGYLERhV", "fFsJPZ9", "v5n0jNlIC8VEk9kcmtdxoaJ1lX", "iKo8W6GX5Xgtq", "u9GtZMdpfWAUjc", "5VwMttC", "nQaWhqWLYmZyv", "CiiXTe9emjL8TKahiZ469ARUB1y9RvmO"};
    public final int A00;
    public final int A01;
    public final String A02;

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-73, -83, -81, -81, -60, -79, -127, -89, -71, -85, -88, -11, -14, 3, -66};
    }

    static {
        A02();
    }

    public H6(int i4, int i10, String str) {
        this.A01 = i4;
        this.A00 = i10;
        this.A02 = str;
    }

    public static H6 A00(C02434v c02434v) {
        String strA01;
        c02434v.A0g(2);
        int profileData = c02434v.A0I();
        int i4 = profileData >> 1;
        int iA0I = ((profileData & 1) << 5) | ((c02434v.A0I() >> 3) & 31);
        if (i4 == 4 || i4 == 5 || i4 == 7) {
            strA01 = A01(7, 4, 12);
        } else if (i4 == 8) {
            strA01 = A01(11, 4, 86);
        } else {
            int dvProfile = A04[2].length();
            if (dvProfile != 26) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[3] = "DwVGRWEQxSiyr";
            strArr[6] = "AkYplpXV9U4Nr";
            if (i4 == 9) {
                strA01 = A01(3, 4, 23);
            } else {
                return null;
            }
        }
        StringBuilder sbAppend = new StringBuilder().append(strA01);
        String strA012 = A01(1, 2, 72);
        StringBuilder sbAppend2 = sbAppend.append(strA012).append(i4);
        if (iA0I >= 10) {
            strA012 = A01(0, 1, 82);
        }
        return new H6(i4, iA0I, sbAppend2.append(strA012).append(iA0I).toString());
    }
}
