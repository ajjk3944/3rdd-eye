package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.bN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3151bN implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C2626Is A00;

    public C3151bN(C2626Is c2626Is) {
        this.A00 = c2626Is;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A0U.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.A00.A0U.requestLayout();
    }
}
