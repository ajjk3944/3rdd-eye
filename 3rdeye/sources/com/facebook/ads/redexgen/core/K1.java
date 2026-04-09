package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class K1 extends AbstractRunnableC2959Vt {
    public final /* synthetic */ AbstractC3077aB A00;

    public K1(AbstractC3077aB abstractC3077aB) {
        this.A00 = abstractC3077aB;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        this.A00.setPressed(false);
        this.A00.postOnAnimationDelayed(this.A00.A09, this.A00.A08);
    }
}
