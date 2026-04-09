package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1006Kl extends AbstractRunnableC1301Wc {
    public final /* synthetic */ AbstractC1499bb A00;

    public C1006Kl(AbstractC1499bb abstractC1499bb) {
        this.A00 = abstractC1499bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        this.A00.setPressed(false);
        this.A00.postOnAnimationDelayed(this.A00.A09, this.A00.A08);
    }
}
