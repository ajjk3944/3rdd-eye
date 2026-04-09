package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0931Wk {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-19, -7, -9, -72, -16, -21, -19, -17, -20, -7, -7, -11, -72, -21, -18, -3, -72, -13, -8, -2, -17, -4, -8, -21, -10, -72, -21, -18, -3, -23, -3, -6, -23, -3, -2, -7, -4, -21, -15, -17};
    }

    public static SharedPreferences A00(T8 t82) {
        return t82.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 40, 89), t82), 0);
    }

    public final int A03(T8 t82, String str, int i4) {
        return A00(t82).getInt(str, i4);
    }

    public final String A04(T8 t82, String str, String str2) {
        return A00(t82).getString(str, str2);
    }

    public final void A05(T8 t82, String str, int i4) {
        SharedPreferences btSP = A00(t82);
        btSP.edit().putInt(str, i4).apply();
    }

    public final void A06(T8 t82, String str, String str2) {
        SharedPreferences btSP = A00(t82);
        btSP.edit().putString(str, str2).apply();
    }
}
