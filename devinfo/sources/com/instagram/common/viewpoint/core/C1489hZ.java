package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1489hZ extends R7 {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC1484hU A01;

    public C1489hZ(AbstractC1484hU abstractC1484hU) {
        this.A01 = abstractC1484hU;
    }

    @Override // com.instagram.common.viewpoint.core.R7
    public final void A0L(C7M c7m, int i4) {
        super.A0L(c7m, i4);
        if (i4 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.instagram.common.viewpoint.core.R7
    public final void A0M(C7M c7m, int i4, int i10) {
        if (i4 != 0 || i10 != 0) {
            this.A00 = true;
        }
    }
}
