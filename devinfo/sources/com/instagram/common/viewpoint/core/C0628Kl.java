package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0628Kl extends AbstractRunnableC0923Wc {
    public final /* synthetic */ AbstractC1121bb A00;

    public C0628Kl(AbstractC1121bb abstractC1121bb) {
        this.A00 = abstractC1121bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        this.A00.setPressed(false);
        this.A00.postOnAnimationDelayed(this.A00.A09, this.A00.A08);
    }
}
