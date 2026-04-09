package com.instagram.common.viewpoint.core;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.applovin.shadow.okio.Utf8;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class W9 {
    public static boolean A00;
    public static byte[] A01;
    public static final Map<String, Long> A02;
    public static final Map<String, Long> A03;
    public static final Map<String, String> A04;

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{96, 54, 127, 96, 54, 127, 96, 33, 127, 96, 33, 127, 96, 33, 82, 92, 4, 92, 0, 87, 85, 85, 11, 45, 55, 48, 57, 126, 50, Utf8.REPLACEMENT_BYTE, 45, 42, 126, Utf8.REPLACEMENT_BYTE, 58, 126, 44, 59, 45, 46, 49, 48, 45, 59, 65, 67, 82, 106, 71, 85, 82, 116, 67, 85, 86, 73, 72, 85, 67};
    }

    static {
        A04();
        A03 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
        A04 = new ConcurrentHashMap();
        A00 = false;
    }

    public static long A00(String str, EnumC0911Vq enumC0911Vq) {
        if (A03.containsKey(str)) {
            return A03.get(str).longValue();
        }
        switch (enumC0911Vq) {
            case A0E:
            case A0F:
            case A0G:
            case A0D:
                return 15000L;
            default:
                return -1000L;
        }
    }

    public static String A02(WA wa2) {
        AbstractC0919Vy.A05(A01(44, 15, WebSocketProtocol.PAYLOAD_SHORT), A01(22, 22, 6), A01(14, 8, 61));
        return A04.get(A03(wa2));
    }

    public static String A03(WA wa2) {
        return String.format(Locale.US, A01(0, 14, 29), wa2.A09(), wa2.A07(), Integer.valueOf(wa2.A08() == null ? 0 : wa2.A08().A00()), Integer.valueOf(wa2.A08() == null ? 0 : wa2.A08().A01()), Integer.valueOf(wa2.A04()));
    }

    public static void A05(long j, WA wa2) {
        A03.put(A03(wa2), Long.valueOf(j));
    }

    public static void A06(WA wa2) {
        A02.put(A03(wa2), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, WA wa2) {
        A04.put(A03(wa2), str);
    }

    public static boolean A08(WA wa2) {
        if (A00) {
            return false;
        }
        String strA03 = A03(wa2);
        if (A02.containsKey(strA03)) {
            return System.currentTimeMillis() - A02.get(strA03).longValue() < A00(strA03, wa2.A07());
        }
        return false;
    }
}
