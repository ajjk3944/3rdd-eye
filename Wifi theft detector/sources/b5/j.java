package b5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;

/* loaded from: classes2.dex */
public class j extends b5.a {

    /* renamed from: g, reason: collision with root package name */
    public final float f4616g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4617h;

    /* renamed from: i, reason: collision with root package name */
    public final float f4618i;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f4619a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4620b;

        public a(boolean z10, int i10) {
            this.f4619a = z10;
            this.f4620b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j.this.f4592b.setTranslationX(0.0f);
            j.this.k(0.0f, this.f4619a, this.f4620b);
        }
    }

    public j(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f4616g = resources.getDimension(j4.d.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.f4617h = resources.getDimension(j4.d.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.f4618i = resources.getDimension(j4.d.m3_back_progress_side_container_max_scale_y_distance);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f4592b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f4592b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f4592b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f4595e);
        animatorSet.start();
    }

    public final boolean g(int i10, int i11) {
        return (Gravity.getAbsoluteGravity(i10, this.f4592b.getLayoutDirection()) & i11) == i11;
    }

    public void h(BackEventCompat backEventCompat, int i10, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z10 = backEventCompat.b() == 0;
        boolean zG = g(i10, 3);
        float width = (this.f4592b.getWidth() * this.f4592b.getScaleX()) + i(zG);
        View view = this.f4592b;
        Property property = View.TRANSLATION_X;
        if (zG) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new i1.b());
        objectAnimatorOfFloat.setDuration(k4.a.c(this.f4593c, this.f4594d, backEventCompat.a()));
        objectAnimatorOfFloat.addListener(new a(z10, i10));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public final int i(boolean z10) {
        ViewGroup.LayoutParams layoutParams = this.f4592b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void j(BackEventCompat backEventCompat) {
        super.d(backEventCompat);
    }

    public void k(float f10, boolean z10, int i10) {
        float fA = a(f10);
        boolean zG = g(i10, 3);
        boolean z11 = z10 == zG;
        int width = this.f4592b.getWidth();
        int height = this.f4592b.getHeight();
        float f11 = width;
        if (f11 > 0.0f) {
            float f12 = height;
            if (f12 <= 0.0f) {
                return;
            }
            float f13 = this.f4616g / f11;
            float f14 = this.f4617h / f11;
            float f15 = this.f4618i / f12;
            View view = this.f4592b;
            if (zG) {
                f11 = 0.0f;
            }
            view.setPivotX(f11);
            if (!z11) {
                f14 = -f13;
            }
            float fA2 = k4.a.a(0.0f, f14, fA);
            float f16 = fA2 + 1.0f;
            float fA3 = 1.0f - k4.a.a(0.0f, f15, fA);
            if (Float.isNaN(f16) || Float.isNaN(fA3)) {
                return;
            }
            this.f4592b.setScaleX(f16);
            this.f4592b.setScaleY(fA3);
            View view2 = this.f4592b;
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setPivotX(zG ? (width - childAt.getRight()) + childAt.getWidth() : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f17 = z11 ? 1.0f - fA2 : 1.0f;
                    float f18 = fA3 != 0.0f ? (f16 / fA3) * f17 : 1.0f;
                    if (!Float.isNaN(f17) && !Float.isNaN(f18)) {
                        childAt.setScaleX(f17);
                        childAt.setScaleY(f18);
                    }
                }
            }
        }
    }

    public void l(BackEventCompat backEventCompat, int i10) {
        if (super.e(backEventCompat) == null) {
            return;
        }
        k(backEventCompat.a(), backEventCompat.b() == 0, i10);
    }
}
