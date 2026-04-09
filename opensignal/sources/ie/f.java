package ie;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f11343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f11344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f11345c;

    public f(g gVar, View view, View view2) {
        this.f11345c = gVar;
        this.f11343a = view;
        this.f11344b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f11345c.c(this.f11343a, this.f11344b, valueAnimator.getAnimatedFraction());
    }
}
