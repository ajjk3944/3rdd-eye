package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class KH extends AbstractRunnableC0923Wc {
    public final /* synthetic */ KE A00;

    public KH(KE ke2) {
        this.A00 = ke2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        if (!this.A00.A0Y) {
            YB.A0F(1000, this.A00.A0K);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
