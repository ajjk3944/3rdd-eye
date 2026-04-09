package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.85, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass85 extends AbstractC1640kH {
    public static byte[] A02;
    public Map<String, String> A00;
    public final Uri A01;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 33, 38, 35};
    }

    public AnonymousClass85(C1436gi c1436gi, VA va2, String str, Uri uri, Map<String, String> mExtraData) {
        super(c1436gi, va2, str, null, true, true);
        this.A01 = uri;
        this.A00 = mExtraData;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1640kH
    public final EnumC0685Mq A0H() {
        A0J(this.A00, null);
        return EnumC0685Mq.A09;
    }

    public final Uri A0M() {
        String uri = this.A01.getQueryParameter(A00(0, 4, 5));
        if (uri == null) {
            uri = A00(0, 0, 121);
        }
        return XB.A00(uri);
    }
}
