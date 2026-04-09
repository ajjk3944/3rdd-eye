package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.cf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1187cf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C0599Ji A00;

    public C1187cf(C0599Ji c0599Ji) {
        this.A00 = c0599Ji;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A00.A0T != null) {
            this.A00.A0T.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.A00.A0T.requestLayout();
        }
    }
}
