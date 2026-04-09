package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.NativeAdBase;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.fa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3409fa implements NX {
    public static byte[] A03;
    public static String[] A04 = {"2TNZv5rtJTplZyjTIrSAFwUR6QP", "UjegX20Mk8HUIHIT", "Ti96PrkTuXG6IMzmEs5GDJe0LgUxYJn1", "WKFIsio5", "sT4eIPa9", "0D70Whi8Ioa2N41OWBvmw3gUZoSjgMHO", "iH11Sl", "erLbaj7N4o7d5mJ3hEM6"};
    public RO A00;
    public C3272dL A01;
    public final NativeAdBase.MediaCacheFlag A02;

    public static String A02(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A04[6].length() == 1) {
                throw new RuntimeException();
            }
            A04[0] = "MdmGKNh4C3mG92xgGyorPLR3SXO";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 88);
            i12++;
        }
    }

    public static void A03() {
        A03 = new byte[]{-26, -39, -20, -31, -18, -35, -28, -35, -38, -35, -34, -26, -35};
    }

    static {
        A03();
    }

    public C3409fa(RO ro, C3272dL c3272dL, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = ro;
        this.A01 = c3272dL;
        this.A02 = mediaCacheFlag;
    }

    @Override // com.facebook.ads.redexgen.core.NX
    public final void ADB(V1 v12) {
        AbstractC2950Vk.A00(new C3412fd(this, v12));
    }

    @Override // com.facebook.ads.redexgen.core.NX
    public final void AEJ(List<C3568iN> list) {
        SF manager = new SF(this.A01);
        String firstRequestId = A02(6, 7, 23);
        for (C3568iN c3568iN : list) {
            if (A02(6, 7, 23).equals(firstRequestId)) {
                firstRequestId = c3568iN.A0G();
            }
            if (this.A02.equals(NativeAdBase.MediaCacheFlag.ALL)) {
                if (c3568iN.A0E().A0F() != null) {
                    manager.A0c(new SD(c3568iN.A0E().A0F().getUrl(), c3568iN.A0E().A0F().getHeight(), c3568iN.A0E().A0F().getWidth(), c3568iN.A0G(), A02(0, 6, 32)));
                }
                if (c3568iN.A0E().A0E() != null) {
                    manager.A0c(new SD(c3568iN.A0E().A0E().getUrl(), c3568iN.A0E().A0E().getHeight(), c3568iN.A0E().A0E().getWidth(), c3568iN.A0G(), A02(0, 6, 32)));
                }
                if (!TextUtils.isEmpty(c3568iN.A0E().A0b())) {
                    manager.A0b(new SB(c3568iN.A0E().A0b(), c3568iN.A0G(), A02(0, 6, 32), c3568iN.A0E().A0A()));
                }
            }
        }
        manager.A0X(new C3410fb(this, list), new S8(firstRequestId, A02(0, 6, 32)));
    }
}
