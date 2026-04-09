package com.instagram.common.viewpoint.core;

import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public final class T0 {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-47, -17, -15, -10, -13, -82, -14, -9, 1, -7, -82, -12, -17, -9, -6, 3, 0, -13, -68, -72, -42, -40, -35, -38, -107, -39, -34, -24, -32, -107, -24, -22, -40, -40, -38, -24, -24, -93, -7, 23, 25, 30, 27, -42, 26, 37, 45, 36, 34, 37, 23, 26, -42, 28, 23, 31, 34, 43, 40, 27, -28, -80, -50, -48, -43, -46, -115, -43, -42, -31, -101, -63, -33, -31, -26, -29, -98, -21, -25, -15, -15, -84, 19, 22, 17, 21, 36, 23, 19, 38, 27, 40, 23, 17, 37, 27, 44, 23, 17, 20, 43, 38, 23, 37, -33, -30, -35, -31, -16, -29, -33, -14, -25, -12, -29, -35, -14, -9, -18, -29, 29, 32, 27, 34, 43, 46, 41, 29, 48, 27, 48, 53, 44, 33, -10, -7, -12, 7, -6, 6, 10, -6, 8, 9, -12, -2, -7, 67, 86, 86, 71, 79, 82, 86, 30, 28, 30, 35, 32, Utf8.REPLACEMENT_BYTE, 61, Utf8.REPLACEMENT_BYTE, 68, 65, 59, Utf8.REPLACEMENT_BYTE, 75, 74, 80, 65, 84, 80, -35, -40, -32, -29, -20, -23, -36, -42, -23, -36, -40, -22, -26, -27, 23, 27, 15, 21, 19, 28, 31, 17, 20, 15, 36, 25, 29, 21, 70, 67, 61};
    }

    static {
        A01();
        A09 = T0.class.getSimpleName();
        A05 = AbstractC0848Td.A0o;
        A06 = AbstractC0848Td.A0s;
        A02 = AbstractC0848Td.A0l;
        A01 = AbstractC0848Td.A0k;
        A03 = AbstractC0848Td.A0m;
        A00 = AbstractC0848Td.A0i;
        A04 = AbstractC0848Td.A0n;
        A07 = AbstractC0848Td.A0t;
    }

    public static void A02(T8 t82, C0835Sq c0835Sq, int i4, String str, long j) {
        if (!A06(t82)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c0835Sq.A01);
            jSONObject.put(A00(134, 13, 46), c0835Sq.A02);
            if (j > 0) {
                jSONObject.put(A00(191, 9, 73), Y1.A07(System.currentTimeMillis() - j));
            }
            C0849Te c0849Te = new C0849Te(str);
            c0849Te.A07(jSONObject);
            c0849Te.A05(1);
            t82.A08().ABD(A00(154, 5, 84), i4, c0849Te);
        } catch (Throwable deLogException) {
            t82.A08().A4I(deLogException);
        }
    }

    public static void A03(T8 t82, C0840Sv c0840Sv, String str, int i4, String str2, Long l10, Long l11) {
        if (A06(t82)) {
            A05(t82, c0840Sv.A06, c0840Sv.A07, c0840Sv.A08, A00(186, 5, 71), str, i4, str2, l10, l11, null);
        }
    }

    public static void A04(T8 t82, C0844Sz c0844Sz, boolean z3) {
        if (!A06(t82)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c0844Sz.A01);
            jSONObject.put(A00(134, 13, 46), c0844Sz.A03);
            jSONObject.put(A00(104, 16, 23), c0844Sz.A02);
            jSONObject.put(A00(159, 13, 117), c0844Sz.A00);
            if (C0886Up.A2T(t82)) {
                jSONObject.put(A00(TTAdConstant.MATE_VALID, 3, 106), c0844Sz.A04);
            }
            String strA00 = z3 ? A00(61, 10, 6) : A00(71, 11, 23);
            int i4 = z3 ? A05 : A06;
            C0849Te c0849Te = new C0849Te(strA00);
            c0849Te.A07(jSONObject);
            c0849Te.A05(1);
            t82.A08().ABD(A00(154, 5, 84), i4, c0849Te);
        } catch (Throwable th2) {
            t82.A08().A4I(th2);
        }
    }

    public static void A05(T8 t82, String str, String str2, String str3, String str4, String str5, int i4, String str6, Long l10, Long l11, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), str);
            jSONObject.put(A00(134, 13, 46), str2);
            jSONObject.put(A00(104, 16, 23), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 16), str6);
            }
            if (l10 != null) {
                jSONObject.put(A00(82, 22, 75), String.valueOf(l10));
            }
            if (l11 != null) {
                jSONObject.put(A00(191, 9, 73), String.valueOf(l11));
            }
            if (num != null) {
                jSONObject.put(A00(147, 7, 123), String.valueOf(num));
            }
            jSONObject.put(A00(159, 13, 117), str5);
            if (C0886Up.A2T(t82)) {
                jSONObject.put(A00(TTAdConstant.MATE_VALID, 3, 106), str3);
            }
            String strA00 = A00(19, 19, 14);
            if (i4 == A03) {
                strA00 = A00(38, 23, 79);
            } else if (i4 == A01) {
                strA00 = A00(0, 19, 39);
            }
            C0849Te c0849Te = new C0849Te(strA00);
            c0849Te.A07(jSONObject);
            c0849Te.A05(1);
            t82.A08().ABD(A00(154, 5, 84), i4, c0849Te);
        } catch (Throwable th2) {
            t82.A08().A4I(th2);
        }
    }

    public static boolean A06(T8 t82) {
        int iA06;
        if (t82.A05().AAO()) {
            iA06 = 1;
        } else {
            iA06 = AbstractC0888Ur.A06(t82);
        }
        if (iA06 == 0) {
            return false;
        }
        return iA06 <= 0 || t82.A09().A00() <= 1.0d / ((double) iA06);
    }
}
