package com.facebook.ads.redexgen.core;

import android.app.Activity;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2998Xi {
    public static byte[] A00;
    public static String[] A01 = {"fNLd7n7EkFNgLvt4vtbAtkfYXAQTEPRW", "T28d5tP6PdXMoXHWEuFSx", "qUncBokoif621v1GQ7gcKknRgizXPQsv", "IkdBxGtQCWxg3d0UA", "tTLCQWoYBdse5ixamGS9HTw2k7WXO8kY", "MyXxcbJBNTQUhn8S7mcX9rM3djOk", "ymwmgwOSW636xClV84tW2WEHiZAMdx7v", "xCAHRx5Y4"};

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            byte b10 = bArrCopyOfRange[i12];
            String[] strArr = A01;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A01[0] = "dZQs1GEaNPWr5rijC2ubsciPbAft3PPF";
            bArrCopyOfRange[i12] = (byte) ((b10 - i11) - 117);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{15, 13, 22, 13, 26, 17, 11};
    }

    static {
        A01();
    }

    public static void A02(Activity activity, int i, C3272dL c3272dL) {
        try {
            activity.setRequestedOrientation(i);
        } catch (IllegalStateException e4) {
            c3272dL.A08().ABR(A00(0, 7, 51), AbstractC2885Sv.A0H, new C2886Sw(e4));
        }
    }
}
