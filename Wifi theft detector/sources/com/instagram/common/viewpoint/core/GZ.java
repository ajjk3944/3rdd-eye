package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GZ extends AbstractRunnableC1301Wc {
    public final /* synthetic */ C06234x A00;

    public GZ(C06234x c06234x) {
        this.A00 = c06234x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        if (this.A00.A00 != null && this.A00.A00.A1N()) {
            ((AbstractC0901Gj) this.A00).A02 = true;
            this.A00.A09.setToolbarActionMode(8);
        }
    }
}
