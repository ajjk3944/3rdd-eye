package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class X0 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-33, -41, -37, -39, -41, -39};
    }

    public static Bundle A00(String str) {
        Bundle bundle = new Bundle();
        bundle.putString(AbstractC2759Nw.A01, A01(0, 6, 102));
        bundle.putString(AbstractC2759Nw.A00, str);
        return bundle;
    }
}
