package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QB extends AbstractRunnableC1301Wc {
    public final /* synthetic */ ViewOnSystemUiVisibilityChangeListenerC1345Xx A00;

    public QB(ViewOnSystemUiVisibilityChangeListenerC1345Xx viewOnSystemUiVisibilityChangeListenerC1345Xx) {
        this.A00 = viewOnSystemUiVisibilityChangeListenerC1345Xx;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        this.A00.A02(false);
    }
}
