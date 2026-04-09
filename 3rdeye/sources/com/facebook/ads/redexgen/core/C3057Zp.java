package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Zp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3057Zp {
    public static byte[] A01;
    public final Map<String, String> A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-25, -6, -10, -12, -29, -31, -22, -21, -16, -10, -11, -37, -42, -36, -54, -49};
    }

    public C3057Zp() {
        this.A00 = new HashMap();
    }

    public C3057Zp(Map<String, String> extraData) {
        this.A00 = extraData;
    }

    public final C3057Zp A02(XH xh) throws JSONException {
        if (xh != null) {
            this.A00.put(A00(11, 5, 48), AbstractC2981Wr.A01(xh.A04()));
        }
        return this;
    }

    public final C3057Zp A03(C3345eX c3345eX) {
        if (c3345eX != null) {
            this.A00.putAll(c3345eX.A0S());
        }
        return this;
    }

    public final C3057Zp A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00.put(A00(0, 11, 75), str);
        }
        return this;
    }

    public final Map<String, String> A05() {
        return this.A00;
    }
}
