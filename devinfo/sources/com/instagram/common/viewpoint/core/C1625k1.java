package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.k1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1625k1 extends AbstractC1380fo {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass81 A00;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 77, 66, 66, 73, 94};
    }

    public C1625k1(AnonymousClass81 anonymousClass81) {
        this.A00 = anonymousClass81;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1380fo
    public final void A03() {
        if (!this.A00.A0H.A07()) {
            this.A00.A0H.A05();
            this.A00.A04.A0F().A4Q(this.A00.A02 != null);
            this.A00.A04.A0F().A3L();
            AbstractC0720Oa.A02(this.A00.A03.A0y(), AbstractC0956Xm.A00(A00(0, 6, 63)));
            this.A00.A05.ABJ(this.A00.A03.A2E(), new C1093b9().A03(this.A00.A0B).A02(this.A00.A0H).A04(this.A00.A03.A0z()).A05());
            if (C0886Up.A1A(this.A00.A04)) {
                C0932Wl.A00(this.A00.A04).A0E(AdPlacementType.BANNER.toString(), this.A00.A03.A2E());
            }
            C0700Ng.A07(this.A00.A03 == null ? null : this.A00.A03.A2A(), this.A00.A04);
            this.A00.A0B.A0V();
        }
    }
}
