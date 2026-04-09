package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class K9 extends AbstractRunnableC2959Vt {
    public final /* synthetic */ AbstractC3077aB A00;

    public K9(AbstractC3077aB abstractC3077aB) {
        this.A00 = abstractC3077aB;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        if (!this.A00.isPressed()) {
            this.A00.setPressed(true);
            this.A00.postOnAnimationDelayed(this.A00.A0A, 250L);
        } else {
            this.A00.postDelayed(this, this.A00.A08);
        }
    }
}
