package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public class VK extends AbstractRunnableC2959Vt {
    public final /* synthetic */ VJ A00;

    public VK(VJ vj) {
        this.A00 = vj;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        this.A00.A0C = false;
        if (this.A00.A0B.getQueue().isEmpty()) {
            this.A00.A0B.execute(this.A00.A0A);
        }
    }
}
