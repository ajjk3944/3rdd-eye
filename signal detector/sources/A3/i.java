package A3;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f377b;

    public i(k kVar, float f2) {
        this.f377b = kVar;
        this.f376a = f2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f377b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f376a);
    }
}
