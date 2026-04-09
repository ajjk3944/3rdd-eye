package com.instagram.common.viewpoint.core;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public final class U8 {
    public static HashMap<String, String> A00;
    public static byte[] A01;
    public static String[] A02 = {"iAmMZEnTjRyKTNBZ", "vq5cthhr", "805H8tMQ6F09oxi1Jl38UficVRLMtQ", "JBRmxZg7", "Cn5UKxgX5LOr", "xwoZ6hhdKgqxJaNY", "yguqyABz11m3k", "UOBi89mTAaMo"};

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A02[5].length() != 16) {
                throw new RuntimeException();
            }
            A02[0] = "gDribvuqSsGNU0u3";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 70);
            i12++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-69, -54, -54, -68, -49, -61, -58, -66, -60, -45, -45, -47, -60, -48, -56, 6, 21, 21, 27, 10, 23, 24, -15, 4, -3, -13, -5, -12, -38, -36, -47, -46, -39, -34, -30, 0, 4, 7, -10, 3, 4, 8, -7, 0, -51, -66, -59, -39, -48, -65, -52, -51, -61, -55, -56, -31, -45, -31, -31, -41, -35, -36, -19, -41, -46, -54, -41, -51, -37, -40, -46, -51};
    }

    static {
        A02();
    }

    public static synchronized Map<String, String> A01(T8 t82) {
        if (A00 != null) {
            return new HashMap(A00);
        }
        A00 = new HashMap<>();
        A00.put(A00(22, 6, 105), t82.getPackageName());
        A03(t82, A00, null);
        return new HashMap(A00);
    }

    public static synchronized void A03(T8 t82, Map<String, String> map, String str) {
        map.put(A00(41, 3, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION), A00(65, 7, 35));
        map.put(A00(44, 11, 52), t82.A05().A9T());
        map.put(A00(33, 2, 73), t82.A05().A9S());
        map.put(A00(35, 6, FacebookMediationAdapter.ERROR_NULL_CONTEXT), C0859To.A04);
        C0859To c0859To = new C0859To(t82, str);
        map.put(A00(15, 7, 127), c0859To.A06());
        map.put(A00(8, 7, 61), c0859To.A05());
        map.put(A00(0, 8, 52), String.valueOf(c0859To.A04()));
        map.put(A00(28, 5, 71), c0859To.A0A());
        map.put(A00(55, 10, 72), t82.A09().A02());
    }
}
