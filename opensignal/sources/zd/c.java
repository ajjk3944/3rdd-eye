package zd;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f27291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f27292b;

    public c(e eVar, float f10) {
        this.f27292b = eVar;
        this.f27291a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f27292b.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f27291a);
    }
}
