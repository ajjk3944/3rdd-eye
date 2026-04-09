package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8G, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C8G extends AbstractC2035kY<M5> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 90, 81, 81};
    }

    public C8G(String str) {
        super(str);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2035kY
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C1046Lz A04(M5 m52) {
        return new C1046Lz(this, m52 == null ? A00(0, 4, 114) : m52.A03());
    }
}
