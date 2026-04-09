package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.kY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1657kY<T> implements M0<T> {
    public static byte[] A01;
    public final String A00;

    static {
        A03();
    }

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-90, -83, -92, -92};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kY != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    public AbstractC1657kY(String str) {
        this.A00 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kY != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    public C0668Lz A04(T t10) {
        return new C0668Lz(this, t10 == null ? A02(0, 4, 35) : t10.toString());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kY != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    @Override // com.instagram.common.viewpoint.core.M0
    public final String getName() {
        return this.A00;
    }
}
