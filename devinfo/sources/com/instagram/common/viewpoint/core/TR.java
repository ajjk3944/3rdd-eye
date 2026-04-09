package com.instagram.common.viewpoint.core;

import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class TR {
    public static byte[] A03;
    public final String A00;
    public final String A01;
    public final Map<String, String> A02;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{8, 101, 2, 0, 20, 6, 9, 21, 62, 4, 25, 2, 4, 17, 21, 8, 14, 15, 29, 26, 15, 13, 5, 26, 28, 15, 13, 11};
    }

    public TR(String str, Map<String, String> mStaticEnvironmentData) {
        this(str, mStaticEnvironmentData, false);
    }

    public TR(String str, Map<String, String> map, boolean z3) {
        this.A01 = str;
        this.A02 = map;
        this.A00 = z3 ? A00(1, 1, 37) : A00(0, 1, 73);
    }

    public final Map<String, String> A02() {
        HashMap map = new HashMap();
        map.put(A00(18, 10, 31), this.A01);
        map.put(A00(2, 16, 16), this.A00);
        Map<String, String> data = this.A02;
        map.putAll(data);
        return map;
    }
}
