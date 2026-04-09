package z3;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Log;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import c.C0377b;
import com.apm.insight.R;
import e3.AbstractC2303a;
import m0.C2650a;

/* renamed from: z3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3023h extends AbstractC3016a {

    /* renamed from: g, reason: collision with root package name */
    public final float f24476g;

    /* renamed from: h, reason: collision with root package name */
    public final float f24477h;
    public final float i;

    public C3023h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f24476g = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f24477h = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.i = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a() {
        if (this.f24467f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0377b c0377b = this.f24467f;
        this.f24467f = null;
        if (c0377b == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.f24463b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f24466e);
        animatorSet.start();
    }

    public final void b(C0377b c0377b, int i, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        int i3;
        boolean z6 = c0377b.f5821d == 0;
        View view = this.f24463b;
        boolean z7 = (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 3) == 3;
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 = z7 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i3 = 0;
        }
        float f2 = scaleX + i3;
        Property property = View.TRANSLATION_X;
        if (z7) {
            f2 = -f2;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f2);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new C2650a(1));
        objectAnimatorOfFloat.setDuration(AbstractC2303a.c(c0377b.f5820c, this.f24464c, this.f24465d));
        objectAnimatorOfFloat.addListener(new C3022g(this, z6, i));
        objectAnimatorOfFloat.addListener(animatorListenerAdapter);
        objectAnimatorOfFloat.start();
    }

    public final void c(int i, float f2, boolean z6) {
        float interpolation = this.f24462a.getInterpolation(f2);
        View view = this.f24463b;
        boolean z7 = (Gravity.getAbsoluteGravity(i, view.getLayoutDirection()) & 3) == 3;
        boolean z8 = z6 == z7;
        int width = view.getWidth();
        int height = view.getHeight();
        float f5 = width;
        if (f5 > 0.0f) {
            float f6 = height;
            if (f6 <= 0.0f) {
                return;
            }
            float f7 = this.f24476g / f5;
            float f8 = this.f24477h / f5;
            float f9 = this.i / f6;
            if (z7) {
                f5 = 0.0f;
            }
            view.setPivotX(f5);
            if (!z8) {
                f8 = -f7;
            }
            float fA = AbstractC2303a.a(0.0f, f8, interpolation);
            float f10 = fA + 1.0f;
            float fA2 = 1.0f - AbstractC2303a.a(0.0f, f9, interpolation);
            if (Float.isNaN(f10) || Float.isNaN(fA2)) {
                return;
            }
            view.setScaleX(f10);
            view.setScaleY(fA2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    childAt.setPivotX(z7 ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f11 = z8 ? 1.0f - fA : 1.0f;
                    float f12 = fA2 != 0.0f ? (f10 / fA2) * f11 : 1.0f;
                    if (!Float.isNaN(f11) && !Float.isNaN(f12)) {
                        childAt.setScaleX(f11);
                        childAt.setScaleY(f12);
                    }
                }
            }
        }
    }
}
