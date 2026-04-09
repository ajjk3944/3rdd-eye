package com.instagram.common.viewpoint.core;

import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.eK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1289eK {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-102, -110, -106, -107, -110, -108, -45, -30, -30, -47, -32, -45, -33, -41, -10, -9, 8, -5, -11, -9, -15, -1, 1, -10, -9, -2, -39, -36, -48, -50, -39, -46, -65, -61, 38, 42, 22, 45, 28, 41, -10, -25, -8, -6, -12, -21, -8, -27, -21, -12, -22, -10, -11, -17, -12, -6, -31, -35, -46, -22, -46, -45, -35, -42, -48, -33, -46, -34, -42, -56, -72, -57, -70, -70, -61, -76, -67, -70, -66, -68, -67, -55, 22, 6, 21, 8, 8, 17, 2, 26, 12, 7, 23, 11, -19, -34, -27, -39, -16, -33, -20, -19, -29, -23, -24, -1, -15, -1, -1, -11, -5, -6, -21, -11, -16};
    }

    public static Map<String, String> A01(T8 t82, String str, String str2) {
        HashMap map = new HashMap();
        C0859To c0859To = new C0859To(t82);
        int i4 = t82.getResources().getDisplayMetrics().widthPixels;
        int i10 = t82.getResources().getDisplayMetrics().heightPixels;
        map.put(A00(105, 10, 69), t82.A09().A02());
        map.put(A00(56, 13, 42), str2);
        map.put(A00(40, 16, 63), str);
        map.put(A00(14, 12, 75), String.valueOf(c0859To.A09()));
        map.put(A00(82, 12, 92), String.valueOf((int) (i4 / XX.A02)));
        map.put(A00(69, 13, 14), String.valueOf((int) (i10 / XX.A02)));
        map.put(A00(32, 2, 9), t82.A05().A9S());
        map.put(A00(34, 6, AppLovinMediationAdapter.ERROR_CHILD_USER), C0859To.A04);
        map.put(A00(26, 6, 38), Locale.getDefault().toString());
        map.put(A00(94, 11, 51), A00(0, 6, 29));
        map.put(A00(6, 8, 43), c0859To.A05());
        return map;
    }
}
