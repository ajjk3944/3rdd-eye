package b5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;

/* loaded from: classes2.dex */
public class f extends b5.a {

    /* renamed from: g, reason: collision with root package name */
    public final float f4604g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4605h;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f4592b.setTranslationY(0.0f);
            f.this.k(0.0f);
        }
    }

    public f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f4604g = resources.getDimension(j4.d.m3_back_progress_bottom_container_max_scale_x_distance);
        this.f4605h = resources.getDimension(j4.d.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator animatorG = g();
        animatorG.setDuration(this.f4595e);
        animatorG.start();
    }

    public final Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f4592b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f4592b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.f4592b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new i1.b());
        return animatorSet;
    }

    public void h(BackEventCompat backEventCompat, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f4592b, (Property<View, Float>) View.TRANSLATION_Y, this.f4592b.getHeight() * this.f4592b.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new i1.b());
        objectAnimatorOfFloat.setDuration(k4.a.c(this.f4593c, this.f4594d, backEventCompat.a()));
        objectAnimatorOfFloat.addListener(new a());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void i(BackEventCompat backEventCompat, Animator.AnimatorListener animatorListener) {
        Animator animatorG = g();
        animatorG.setDuration(k4.a.c(this.f4593c, this.f4594d, backEventCompat.a()));
        if (animatorListener != null) {
            animatorG.addListener(animatorListener);
        }
        animatorG.start();
    }

    public void j(BackEventCompat backEventCompat) {
        super.d(backEventCompat);
    }

    public void k(float f10) {
        float fA = a(f10);
        float width = this.f4592b.getWidth();
        float height = this.f4592b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f11 = this.f4604g / width;
        float f12 = this.f4605h / height;
        float fA2 = 1.0f - k4.a.a(0.0f, f11, fA);
        float fA3 = 1.0f - k4.a.a(0.0f, f12, fA);
        if (Float.isNaN(fA2) || Float.isNaN(fA3)) {
            return;
        }
        this.f4592b.setScaleX(fA2);
        this.f4592b.setPivotY(height);
        this.f4592b.setScaleY(fA3);
        View view = this.f4592b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(fA3 != 0.0f ? fA2 / fA3 : 1.0f);
            }
        }
    }

    public void l(BackEventCompat backEventCompat) {
        if (super.e(backEventCompat) == null) {
            return;
        }
        k(backEventCompat.a());
    }
}
