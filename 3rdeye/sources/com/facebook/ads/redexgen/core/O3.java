package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class O3 {
    public static O2 A00;
    public static byte[] A01;
    public static String[] A02 = {"g", "j", "XC0Rp", "xmnbF", "ZVN1dtOIFAKzm8JTATZerxuQP9zv55g", "kSPLn3WG70", "", ""};

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            int i13 = bArrCopyOfRange[i12] ^ i11;
            String[] strArr = A02;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "w";
            strArr2[0] = "P";
            bArrCopyOfRange[i12] = (byte) (i13 ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{86, 90, 88, 27, 83, 84, 86, 80, 87, 90, 90, 94, 27, 84, 81, 70, 27, 116, 113, 106, 103, 112, 101, 122, 103, 97, 124, 123, 114, 106, 118, 122, 123, 115, 124, 114};
    }

    static {
        A02();
    }

    public static O2 A00(C3246cu c3246cu) {
        if (A00 == null) {
            synchronized (O2.class) {
                if (A00 == null) {
                    A00 = new O2(new C3473gf(c3246cu.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 105), c3246cu), 0)));
                }
            }
        }
        return A00;
    }
}
