package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.iU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3575iU extends AbstractC3344eW {
    public static byte[] A01;
    public final /* synthetic */ C7L A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 77, 66, 66, 73, 94};
    }

    public C3575iU(C7L c7l) {
        this.A00 = c7l;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3344eW
    public final void A03() {
        if (!this.A00.A07.A07()) {
            this.A00.A07.A05();
            this.A00.A04.A0F().A4I(this.A00.A02 != null);
            this.A00.A04.A0F().A3D();
            AbstractC2759Nw.A02(this.A00.A03.A0t(), X0.A00(A00(0, 6, 63)));
            this.A00.A05.AB5(this.A00.A03.A25(), new C3057Zp().A03(this.A00.A0C).A02(this.A00.A07).A04(this.A00.A03.A0u()).A05());
            if (U7.A19(this.A00.A04)) {
                W2.A00(this.A00.A04).A0E(AdPlacementType.BANNER.toString(), this.A00.A03.A25());
            }
            N3.A07(this.A00.A03 == null ? null : this.A00.A03.A21(), this.A00.A04);
            this.A00.A0C.A0V();
        }
    }
}
