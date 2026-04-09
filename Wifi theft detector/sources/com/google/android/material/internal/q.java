package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes2.dex */
public class q implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final a f10716a;

    /* renamed from: b, reason: collision with root package name */
    public final View[] f10717b;

    public interface a {
        void a(ValueAnimator valueAnimator, View view);
    }

    public q(a aVar, View... viewArr) {
        this.f10716a = aVar;
        this.f10717b = viewArr;
    }

    public static q e(View... viewArr) {
        return new q(new a() { // from class: com.google.android.material.internal.p
            @Override // com.google.android.material.internal.q.a
            public final void a(ValueAnimator valueAnimator, View view) {
                q.g(valueAnimator, view);
            }
        }, viewArr);
    }

    public static q f(View... viewArr) {
        return new q(new a() { // from class: com.google.android.material.internal.o
            @Override // com.google.android.material.internal.q.a
            public final void a(ValueAnimator valueAnimator, View view) {
                q.h(valueAnimator, view);
            }
        }, viewArr);
    }

    public static void g(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void h(ValueAnimator valueAnimator, View view) {
        Float f10 = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f10.floatValue());
        view.setScaleY(f10.floatValue());
    }

    public static void i(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void j(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static q k(View... viewArr) {
        return new q(new a() { // from class: com.google.android.material.internal.m
            @Override // com.google.android.material.internal.q.a
            public final void a(ValueAnimator valueAnimator, View view) {
                q.i(valueAnimator, view);
            }
        }, viewArr);
    }

    public static q l(View... viewArr) {
        return new q(new a() { // from class: com.google.android.material.internal.n
            @Override // com.google.android.material.internal.q.a
            public final void a(ValueAnimator valueAnimator, View view) {
                q.j(valueAnimator, view);
            }
        }, viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.f10717b) {
            this.f10716a.a(valueAnimator, view);
        }
    }
}
