package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* renamed from: androidx.recyclerview.widget.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0317n f5522a;

    public C0316m(C0317n c0317n) {
        this.f5522a = c0317n;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0317n c0317n = this.f5522a;
        c0317n.f5531c.setAlpha(iFloatValue);
        c0317n.f5532d.setAlpha(iFloatValue);
        c0317n.f5546s.invalidate();
    }
}
