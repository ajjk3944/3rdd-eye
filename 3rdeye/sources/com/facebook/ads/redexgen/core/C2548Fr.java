package com.facebook.ads.redexgen.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Fr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2548Fr extends AbstractRunnableC2959Vt {
    public final /* synthetic */ InterfaceC3222cW A00;
    public final /* synthetic */ C3223cX A01;

    public C2548Fr(C3223cX c3223cX, InterfaceC3222cW interfaceC3222cW) {
        this.A01 = c3223cX;
        this.A00 = interfaceC3222cW;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C2549Fs(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
