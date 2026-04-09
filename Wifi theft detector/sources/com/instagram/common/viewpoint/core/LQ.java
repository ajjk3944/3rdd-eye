package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class LQ extends AbstractRunnableC1301Wc {
    public final /* synthetic */ C1468b6 A00;

    public LQ(C1468b6 c1468b6) {
        this.A00 = c1468b6;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        this.A00.A03();
        if (!this.A00.A08) {
            return;
        }
        this.A00.A0D.postDelayed(this.A00.A0F, 250L);
    }
}
