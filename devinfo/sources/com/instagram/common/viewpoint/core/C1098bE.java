package com.instagram.common.viewpoint.core;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.bE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1098bE implements InterfaceC0663Lu {
    public static byte[] A01;
    public final T8 A00;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-93, -73, -56, -82, -118, -71, -78, -78, -87, -80, -87, -40, -47, -47, -56, -49, -99, -125, -39, -24, -2, -52, -3, -20, -11, -5, -26, -117, -102, -109, -109, -118, -111, -68, -53, -60, -60, -69, -62, -75, -62, -59, -67, -67, -69, -70, -58, -43, -50, -50, -59, -52, -65, -52, -49, -57, -57, -55, -50, -57, -65, -51, -49, -60, -59};
    }

    public C1098bE(T8 t82) {
        this.A00 = t82;
    }

    private void A02(int i4, String str, JSONObject jSONObject, boolean z3, int i10) throws JSONException {
        C0849Te c0849Te = new C0849Te(A00(4, 6, 44));
        c0849Te.A07(jSONObject);
        c0849Te.A05(1);
        c0849Te.A09(z3);
        c0849Te.A04(i10);
        try {
            jSONObject.put(A00(33, 13, 62), TX.A0H(this.A00));
        } catch (JSONException unused) {
        }
        try {
            jSONObject.put(A00(46, 19, 72), i10);
        } catch (JSONException unused2) {
        }
        this.A00.A08().ABD(A00(27, 6, 13), i4 + 4000, c0849Te);
        if (this.A00.A05().AAO()) {
            String str2 = A00(10, 8, 75) + str + A00(0, 1, 99) + i4 + A00(1, 3, 118) + jSONObject.toString();
        }
    }

    public static boolean A03(EnumC0665Lw enumC0665Lw) {
        for (EnumC0665Lw enumC0665Lw2 : ZJ.A06) {
            if (enumC0665Lw2.equals(enumC0665Lw)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0663Lu
    public final void ABE(EnumC0665Lw enumC0665Lw, JSONObject jSONObject, int i4) throws JSONException {
        A02(enumC0665Lw.A03(), enumC0665Lw.toString(), jSONObject, A03(enumC0665Lw), i4);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0663Lu
    public final void ABs(int i4, JSONObject jSONObject, int i10) throws JSONException {
        A02(i4, A00(18, 9, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION) + i4, jSONObject, false, i10);
    }
}
