package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Wu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2984Wu {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-16, -7, -3, 49, -85, -83, -83, 1, -2, -9};
    }

    public static String A01(long j4) {
        String string;
        String strA00 = A00(0, 0, 78);
        if (j4 < 1000) {
            string = j4 + strA00;
        } else {
            String strA002 = A00(0, 4, 79);
            if (j4 < 1000000) {
                StringBuilder sb = new StringBuilder();
                String formattedNumber = String.format(Locale.US, strA002, Double.valueOf(j4 / 1000.0d));
                StringBuilder sbAppend = sb.append(formattedNumber);
                String formattedNumber2 = A00(8, 1, 55);
                string = sbAppend.append(formattedNumber2).toString();
            } else if (j4 < 1000000000) {
                StringBuilder sb2 = new StringBuilder();
                String formattedNumber3 = String.format(Locale.US, strA002, Double.valueOf(j4 / 1000000.0d));
                StringBuilder sbAppend2 = sb2.append(formattedNumber3);
                String formattedNumber4 = A00(9, 1, 46);
                string = sbAppend2.append(formattedNumber4).toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                String formattedNumber5 = String.format(Locale.US, strA002, Double.valueOf(j4 / 1.0E9d));
                StringBuilder sbAppend3 = sb3.append(formattedNumber5);
                String formattedNumber6 = A00(7, 1, 67);
                string = sbAppend3.append(formattedNumber6).toString();
            }
        }
        String strA003 = A00(4, 3, 1);
        if (string.contains(strA003)) {
            return string.replace(strA003, strA00);
        }
        return string;
    }
}
