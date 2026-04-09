package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1867hZ extends R7 {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC1862hU A01;

    public C1867hZ(AbstractC1862hU abstractC1862hU) {
        this.A01 = abstractC1862hU;
    }

    @Override // com.instagram.common.viewpoint.core.R7
    public final void A0L(C7M c7m, int i10) {
        super.A0L(c7m, i10);
        if (i10 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.instagram.common.viewpoint.core.R7
    public final void A0M(C7M c7m, int i10, int i11) {
        if (i10 != 0 || i11 != 0) {
            this.A00 = true;
        }
    }
}
