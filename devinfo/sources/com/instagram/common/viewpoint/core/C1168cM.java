package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.cM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1168cM implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ KE A00;

    public C1168cM(KE ke2) {
        this.A00 = ke2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        if (this.A00.A09 != null) {
            this.A00.A09.getLayoutParams().height = num.intValue();
            this.A00.A09.requestLayout();
        }
    }
}
