package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class KH extends AbstractRunnableC1301Wc {
    public final /* synthetic */ KE A00;

    public KH(KE ke) {
        this.A00 = ke;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        if (!this.A00.A0Y) {
            YB.A0F(1000, this.A00.A0K);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
