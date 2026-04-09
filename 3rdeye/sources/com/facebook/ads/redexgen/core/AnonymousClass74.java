package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.74, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass74 extends AbstractC3547hy {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A02();
    }

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{52, 59, 46, 51, 44, 63};
    }

    public AnonymousClass74(List<C2726Mp> list) {
        super(list);
    }

    public static AnonymousClass74 A00(JSONObject jSONObject, C3272dL c3272dL) {
        AnonymousClass74 anonymousClass74 = new AnonymousClass74(AbstractC3547hy.A08(jSONObject, c3272dL, new C3538hm()));
        anonymousClass74.A29(jSONObject);
        anonymousClass74.A1I(A01(0, 6, 107));
        return anonymousClass74;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2725Mo
    public final int A0l() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2725Mo
    public final int A0m() {
        return 0;
    }
}
