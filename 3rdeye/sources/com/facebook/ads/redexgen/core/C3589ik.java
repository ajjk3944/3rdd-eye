package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.ik, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3589ik extends MH {
    public static byte[] A02;
    public static final String A03;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{52, 54, 45, 51, 54, 45, 56, 61, -32, -27, -36, -47};
    }

    static {
        A01();
        A03 = C3589ik.class.getSimpleName();
    }

    public C3589ik(C3272dL c3272dL, US us, String str, Uri uri, Map<String, String> mExtraData) {
        super(c3272dL, us, str);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.core.MH
    public final ME A0G(String str) {
        UU uu = UU.A05;
        String queryParameter = this.A00.getQueryParameter(A00(0, 8, 109));
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                uu = UU.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception unused) {
            }
        }
        this.A02.ABK(this.A03, this.A01, this.A00.getQueryParameter(A00(8, 4, 21)), uu);
        return ME.A09;
    }
}
