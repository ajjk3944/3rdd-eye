package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.b9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1093b9 {
    public static byte[] A01;
    public final Map<String, String> A00;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-25, -6, -10, -12, -29, -31, -22, -21, -16, -10, -11, -37, -42, -36, -54, -49};
    }

    public C1093b9() {
        this.A00 = new HashMap();
    }

    public C1093b9(Map<String, String> extraData) {
        this.A00 = extraData;
    }

    public final C1093b9 A02(Y2 y22) throws JSONException {
        if (y22 != null) {
            this.A00.put(A00(11, 5, 48), AbstractC0947Xd.A01(y22.A04()));
        }
        return this;
    }

    public final C1093b9 A03(C1381fp c1381fp) {
        if (c1381fp != null) {
            this.A00.putAll(c1381fp.A0S());
        }
        return this;
    }

    public final C1093b9 A04(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00.put(A00(0, 11, 75), str);
        }
        return this;
    }

    public final Map<String, String> A05() {
        return this.A00;
    }
}
