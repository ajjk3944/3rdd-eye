package com.google.ar.core;

import android.animation.ValueAnimator;

/* loaded from: classes3.dex */
final class J implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f38185a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f38186b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f38187c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InstallActivity f38188d;

    J(InstallActivity installActivity, int i10, int i11, int i12) {
        this.f38185a = i10;
        this.f38186b = i11;
        this.f38187c = i12;
        this.f38188d = installActivity;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        float f10 = this.f38186b;
        float animatedFraction2 = valueAnimator.getAnimatedFraction();
        this.f38188d.getWindow().setLayout((int) ((this.f38185a * animatedFraction) + (f10 * animatedFraction2)), (int) ((this.f38187c * animatedFraction) + (this.f38186b * animatedFraction2)));
        this.f38188d.getWindow().getDecorView().refreshDrawableState();
    }
}
