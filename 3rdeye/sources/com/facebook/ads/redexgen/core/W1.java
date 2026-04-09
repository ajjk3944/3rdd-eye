package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W1 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-19, -7, -9, -72, -16, -21, -19, -17, -20, -7, -7, -11, -72, -21, -18, -3, -72, -13, -8, -2, -17, -4, -8, -21, -10, -72, -21, -18, -3, -23, -3, -6, -23, -3, -2, -7, -4, -21, -15, -17};
    }

    public static SharedPreferences A00(SQ sq) {
        return sq.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 40, 89), sq), 0);
    }

    public final int A03(SQ sq, String str, int i) {
        return A00(sq).getInt(str, i);
    }

    public final String A04(SQ sq, String str, String str2) {
        return A00(sq).getString(str, str2);
    }

    public final void A05(SQ sq, String str, int i) {
        SharedPreferences btSP = A00(sq);
        btSP.edit().putInt(str, i).apply();
    }

    public final void A06(SQ sq, String str, String str2) {
        SharedPreferences btSP = A00(sq);
        btSP.edit().putString(str, str2).apply();
    }
}
