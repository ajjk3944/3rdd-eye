package com.instagram.common.viewpoint.core;

import com.applovin.shadow.okio.Utf8;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03127m extends AbstractC1601jd {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A02();
    }

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{52, 59, 46, 51, 44, Utf8.REPLACEMENT_BYTE};
    }

    public C03127m(List<NR> list) {
        super(list);
    }

    public static C03127m A00(JSONObject jSONObject, C1436gi c1436gi) {
        C03127m c03127m = new C03127m(AbstractC1601jd.A08(jSONObject, c1436gi, new C1593jR()));
        c03127m.A2I(jSONObject);
        c03127m.A1N(A01(0, 6, FacebookMediationAdapter.ERROR_NULL_CONTEXT));
        return c03127m;
    }

    @Override // com.instagram.common.viewpoint.core.NQ
    public final int A0o() {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.NQ
    public final int A0p() {
        return 0;
    }
}
