package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3519hR extends AbstractRunnableC2959Vt {
    public final /* synthetic */ AbstractC3518hQ A00;
    public final /* synthetic */ V1 A01;

    public C3519hR(AbstractC3518hQ abstractC3518hQ, V1 v12) {
        this.A00 = abstractC3518hQ;
        this.A01 = v12;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        this.A00.A0B.A0F().A5Y(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
