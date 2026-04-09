package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes2.dex */
public class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f10703a;

    /* renamed from: b, reason: collision with root package name */
    public final View f10704b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f10705c = new float[2];

    public g(View view, View view2) {
        this.f10703a = view;
        this.f10704b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        h.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f10705c);
        View view = this.f10703a;
        if (view != null) {
            view.setAlpha(this.f10705c[0]);
        }
        View view2 = this.f10704b;
        if (view2 != null) {
            view2.setAlpha(this.f10705c[1]);
        }
    }
}
