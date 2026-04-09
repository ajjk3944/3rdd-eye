package L3;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f2574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f2576c;

    public e(f fVar, View view, View view2) {
        this.f2576c = fVar;
        this.f2574a = view;
        this.f2575b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2576c.c(this.f2574a, this.f2575b, valueAnimator.getAnimatedFraction());
    }
}
