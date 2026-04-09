package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GZ extends AbstractRunnableC0923Wc {
    public final /* synthetic */ C02454x A00;

    public GZ(C02454x c02454x) {
        this.A00 = c02454x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        if (this.A00.A00 != null && this.A00.A00.A1N()) {
            ((AbstractC0523Gj) this.A00).A02 = true;
            this.A00.A09.setToolbarActionMode(8);
        }
    }
}
