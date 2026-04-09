package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class AL extends C1922p5 {
    public static byte[] A01;
    public final String A00;

    static {
        A02();
    }

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-11, 26, 34, 13, 24, 21, 16, -52, 15, 27, 26, 32, 17, 26, 32, -52, 32, 37, 28, 17, -26, -52};
    }

    public AL(String str, C02565i c02565i) {
        super(A01(0, 22, 85) + str, c02565i, AdError.INTERNAL_ERROR_2003, 1);
        this.A00 = str;
    }
}
