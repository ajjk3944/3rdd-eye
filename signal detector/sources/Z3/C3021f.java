package z3;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.apm.insight.R;
import e3.AbstractC2303a;
import m0.C2650a;

/* renamed from: z3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3021f extends AbstractC3016a {

    /* renamed from: g, reason: collision with root package name */
    public final float f24471g;

    /* renamed from: h, reason: collision with root package name */
    public final float f24472h;

    public C3021f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f24471g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f24472h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f24463b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C2650a(1));
        return animatorSet;
    }

    public final void b(float f2) {
        float interpolation = this.f24462a.getInterpolation(f2);
        View view = this.f24463b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f5 = this.f24471g / width;
        float f6 = this.f24472h / height;
        float fA = 1.0f - AbstractC2303a.a(0.0f, f5, interpolation);
        float fA2 = 1.0f - AbstractC2303a.a(0.0f, f6, interpolation);
        if (Float.isNaN(fA) || Float.isNaN(fA2)) {
            return;
        }
        view.setScaleX(fA);
        view.setPivotY(height);
        view.setScaleY(fA2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fA2 != 0.0f ? fA / fA2 : 1.0f);
            }
        }
    }
}
