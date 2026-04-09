package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10802a = Color.alpha(-1728053248);

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DrawerLayout f10803a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f10804b;

        public a(DrawerLayout drawerLayout, View view) {
            this.f10803a = drawerLayout;
            this.f10804b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10803a.g(this.f10804b, false);
            this.f10803a.setScrimColor(-1728053248);
        }
    }

    public static Animator.AnimatorListener b(DrawerLayout drawerLayout, View view) {
        return new a(drawerLayout, view);
    }

    public static ValueAnimator.AnimatorUpdateListener c(final DrawerLayout drawerLayout) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                drawerLayout.setScrimColor(j0.a.k(-1728053248, k4.a.c(b.f10802a, 0, valueAnimator.getAnimatedFraction())));
            }
        };
    }
}
