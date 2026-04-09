package B6;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: DivTooltipAnimation.kt */
/* loaded from: classes.dex */
public final class p extends Visibility {

    /* renamed from: b, reason: collision with root package name */
    public final float f565b;

    public p(float f10) {
        this.f565b = f10;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues startValues, TransitionValues endValues) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(startValues, "startValues");
        kotlin.jvm.internal.l.f(endValues, "endValues");
        Property property = View.SCALE_X;
        float scaleX = view.getScaleX();
        float f10 = this.f565b;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) property, f10, scaleX), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f10, view.getScaleY()));
        kotlin.jvm.internal.l.e(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(\n…Y\n            )\n        )");
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues startValues, TransitionValues endValues) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(startValues, "startValues");
        kotlin.jvm.internal.l.f(endValues, "endValues");
        Property property = View.SCALE_X;
        float scaleX = view.getScaleX();
        float f10 = this.f565b;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) property, scaleX, f10), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, view.getScaleY(), f10));
        kotlin.jvm.internal.l.e(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(\n…r\n            )\n        )");
        return objectAnimatorOfPropertyValuesHolder;
    }
}
