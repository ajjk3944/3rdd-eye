package com.google.android.material.transformation;

import V3.d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes2.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f23220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Drawable f23221b;

    public b(d dVar, Drawable drawable) {
        this.f23220a = dVar;
        this.f23221b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f23220a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f23220a.setCircularRevealOverlayDrawable(this.f23221b);
    }
}
