package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ua, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2915Ua {
    public static byte[] A02;
    public final US A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-15, -13, -32, -14, -9, -18, -29};
    }

    public C2915Ua(String str, US us) {
        this.A01 = str;
        this.A00 = us;
    }

    public static void A02(UZ uz, Map<String, String> map, String str, US us) {
        A03(uz.A03(), map, str, us);
    }

    public static void A03(String str, Map<String, String> map, String str2, US us) {
        if (!AbstractC2917Uc.A0B(str2, str)) {
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(A00(0, 7, 81), str);
        us.AB1(str2, map);
    }

    public final void A04(UZ uz, Map<String, String> data) {
        A05(uz.A03(), data);
    }

    public final void A05(String str, Map<String, String> data) {
        A03(str, data, this.A01, this.A00);
    }
}
