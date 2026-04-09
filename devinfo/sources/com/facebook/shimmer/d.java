package com.facebook.shimmer;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import ed.h;
import ed.j;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8962b;

    public /* synthetic */ d(int i4, Object obj) {
        this.f8961a = i4;
        this.f8962b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8961a) {
            case 0:
                ((e) this.f8962b).invalidateSelf();
                break;
            case 1:
                ((TabLayout) this.f8962b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 2:
                ((TextInputLayout) this.f8962b).f20638w0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                ((m9.b) this.f8962b).postInvalidate();
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j jVar = ((BottomSheetBehavior) this.f8962b).f20364i;
                if (jVar != null) {
                    h hVar = jVar.f23316b;
                    if (hVar.j != fFloatValue) {
                        hVar.j = fFloatValue;
                        jVar.f23320f = true;
                        jVar.g = true;
                        jVar.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
