package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QB extends AbstractRunnableC0923Wc {
    public final /* synthetic */ ViewOnSystemUiVisibilityChangeListenerC0967Xx A00;

    public QB(ViewOnSystemUiVisibilityChangeListenerC0967Xx viewOnSystemUiVisibilityChangeListenerC0967Xx) {
        this.A00 = viewOnSystemUiVisibilityChangeListenerC0967Xx;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        this.A00.A02(false);
    }
}
