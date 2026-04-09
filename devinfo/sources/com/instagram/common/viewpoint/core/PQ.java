package com.instagram.common.viewpoint.core;

import android.R;

/* loaded from: assets/audience_network/classes2.dex */
public class PQ extends AbstractRunnableC0923Wc {
    public final /* synthetic */ AnimationAnimationListenerC0990Yu A00;

    public PQ(AnimationAnimationListenerC0990Yu animationAnimationListenerC0990Yu) {
        this.A00 = animationAnimationListenerC0990Yu;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
