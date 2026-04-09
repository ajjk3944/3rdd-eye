package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class LN {
    public static byte[] A02;
    public final LO A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{55, 36, 63, 63, 52, 61, 14};
    }

    public LN(LO lo, String str) {
        this.A00 = lo;
        this.A01 = str;
    }

    public final void A02(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put(A00(0, 7, 99) + this.A00.getName(), this.A01);
        } catch (JSONException unused) {
        }
    }
}
