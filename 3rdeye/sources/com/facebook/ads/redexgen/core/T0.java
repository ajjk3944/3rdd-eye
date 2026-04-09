package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public abstract class T0 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{23, 52, 60, 60, 50, 53, 60, 123, 21, 62, 47, 44, 52, 41, 48, 123, 30, 45, 62, 53, 47, 34, 51, 52, 39, 50, 47, 41, 40, 96, 119, 119, 106, 119, 32, 60, 60, 56, 23, 59, 60, 41, 60, 61, 59, 23, 43, 39, 44, 45, 98, 105, 120, 123, 99, 126, 103, 41, 56, 32, 53, 54, 56, 61, 6, 42, 48, 35, 60, 55, 48, 37, 54, 48, 27, 48, 45, 41, 33, 40, 45, 49, 50, 60, 57, 2, 46, 52, 39, 56};
    }

    public static JSONObject A01(SQ sq, long j4, long j10, long j11, long j12, int i, Exception exc) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put(A00(69, 10, 52), j4);
                try {
                    jSONObject.put(A00(21, 8, 54), j10 / 1000.0d);
                    try {
                        jSONObject.put(A00(57, 12, 41), j11);
                        try {
                            jSONObject.put(A00(79, 11, 45), j12);
                            try {
                                jSONObject.put(A00(34, 16, 56), i);
                                if (exc != null) {
                                    jSONObject.put(A00(29, 5, 117), exc.getMessage());
                                }
                            } catch (JSONException e4) {
                                e = e4;
                                sq.A08().A4A(e);
                                return jSONObject;
                            }
                        } catch (JSONException e10) {
                            e = e10;
                        }
                    } catch (JSONException e11) {
                        e = e11;
                    }
                } catch (JSONException e12) {
                    e = e12;
                }
            } catch (JSONException e13) {
                e = e13;
            }
        } catch (JSONException e14) {
            e = e14;
        }
        return jSONObject;
    }

    public static void A03(SQ sq, long j4, long j10, long j11, long j12, int i, Exception exc) {
        C2886Sw c2886Sw = new C2886Sw(A00(0, 21, 43));
        c2886Sw.A05(1);
        c2886Sw.A07(A01(sq, j4, j10, j11, j12, i, exc));
        sq.A08().ABZ(A00(50, 7, 124), AbstractC2885Sv.A20, c2886Sw);
    }
}
