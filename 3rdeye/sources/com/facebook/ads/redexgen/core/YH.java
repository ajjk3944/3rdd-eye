package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class YH implements LI {
    public static byte[] A01;
    public final SQ A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-93, -73, -56, -82, -118, -71, -78, -78, -87, -80, -87, -40, -47, -47, -56, -49, -99, -125, -39, -24, -2, -52, -3, -20, -11, -5, -26, -117, -102, -109, -109, -118, -111, -68, -53, -60, -60, -69, -62, -75, -62, -59, -67, -67, -69, -70, -58, -43, -50, -50, -59, -52, -65, -52, -49, -57, -57, -55, -50, -57, -65, -51, -49, -60, -59};
    }

    public YH(SQ sq) {
        this.A00 = sq;
    }

    private void A02(int i, String str, JSONObject jSONObject, boolean z10, int i10) throws JSONException {
        C2886Sw c2886Sw = new C2886Sw(A00(4, 6, 44));
        c2886Sw.A07(jSONObject);
        c2886Sw.A05(1);
        c2886Sw.A09(z10);
        c2886Sw.A04(i10);
        try {
            jSONObject.put(A00(33, 13, 62), C2879Sp.A0H(this.A00));
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put(A00(46, 19, 72), i10);
        } catch (JSONException unused2) {
        }
        this.A00.A08().AAz(A00(27, 6, 13), i + 4000, c2886Sw);
        if (this.A00.A05().AAF()) {
            String str2 = A00(10, 8, 75) + str + A00(0, 1, 99) + i + A00(1, 3, 118) + jSONObject.toString();
        }
    }

    public static boolean A03(LK lk) {
        for (LK lk2 : C2967Wb.A06) {
            if (lk2.equals(lk)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.LI
    public final void AB0(LK lk, JSONObject jSONObject, int i) throws JSONException {
        A02(lk.A03(), lk.toString(), jSONObject, A03(lk), i);
    }

    @Override // com.facebook.ads.redexgen.core.LI
    public final void ABM(int i, JSONObject jSONObject, int i10) throws JSONException {
        A02(i, A00(18, 9, 111) + i, jSONObject, false, i10);
    }
}
