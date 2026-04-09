package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class F1 extends AbstractRunnableC0923Wc {
    public final /* synthetic */ C0483Eu A00;

    public F1(C0483Eu c0483Eu) {
        this.A00 = c0483Eu;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        this.A00.A03.A07();
        this.A00.A04.getEventBus().A04(this.A00.A06, this.A00.A05);
    }
}
