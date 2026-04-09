package b5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.d0;

/* loaded from: classes2.dex */
public class i extends b5.a {

    /* renamed from: g, reason: collision with root package name */
    public final float f4608g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4609h;

    /* renamed from: i, reason: collision with root package name */
    public float f4610i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f4611j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f4612k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f4613l;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f4614a;

        public a(View view) {
            this.f4614a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f4614a;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public i(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f4608g = resources.getDimension(j4.d.m3_back_progress_main_container_min_edge_gap);
        this.f4609h = resources.getDimension(j4.d.m3_back_progress_main_container_max_translation_y);
    }

    public static float[] r(float[] fArr, float f10, float f11) {
        return new float[]{k4.a.a(fArr[0], f10, f11), k4.a.a(fArr[1], f10, f11), k4.a.a(fArr[2], f10, f11), k4.a.a(fArr[3], f10, f11), k4.a.a(fArr[4], f10, f11), k4.a.a(fArr[5], f10, f11), k4.a.a(fArr[6], f10, f11), k4.a.a(fArr[7], f10, f11)};
    }

    public static float[] s(float[] fArr, float[] fArr2, float f10) {
        return new float[]{k4.a.a(fArr[0], fArr2[0], f10), k4.a.a(fArr[1], fArr2[1], f10), k4.a.a(fArr[2], fArr2[2], f10), k4.a.a(fArr[3], fArr2[3], f10), k4.a.a(fArr[4], fArr2[4], f10), k4.a.a(fArr[5], fArr2[5], f10), k4.a.a(fArr[6], fArr2[6], f10), k4.a.a(fArr[7], fArr2[7], f10)};
    }

    public final float[] h() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = this.f4592b.getRootWindowInsets()) == null) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        }
        DisplayMetrics displayMetrics = this.f4592b.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        int[] iArr = new int[2];
        this.f4592b.getLocationOnScreen(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        int width = this.f4592b.getWidth();
        int height = this.f4592b.getHeight();
        int iQ = (i12 == 0 && i13 == 0) ? q(rootWindowInsets, 0) : 0;
        int i14 = width + i12;
        int iQ2 = (i14 < i10 || i13 != 0) ? 0 : q(rootWindowInsets, 1);
        int iQ3 = (i14 < i10 || i13 + height < i11) ? 0 : q(rootWindowInsets, 2);
        int iQ4 = (i12 != 0 || i13 + height < i11) ? 0 : q(rootWindowInsets, 3);
        float f10 = iQ;
        float f11 = iQ2;
        float f12 = iQ3;
        float f13 = iQ4;
        return new float[]{f10, f10, f11, f11, f12, f12, f13, f13};
    }

    public void i(View view) {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSetL = l(view);
        View view2 = this.f4592b;
        if (view2 instanceof ClippableRoundedCornerLayout) {
            animatorSetL.playTogether(k((ClippableRoundedCornerLayout) view2));
        }
        animatorSetL.setDuration(this.f4595e);
        animatorSetL.start();
        t();
    }

    public void j() {
        this.f4613l = null;
    }

    public final ValueAnimator k(final ClippableRoundedCornerLayout clippableRoundedCornerLayout) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new TypeEvaluator() { // from class: b5.g
            @Override // android.animation.TypeEvaluator
            public final Object evaluate(float f10, Object obj, Object obj2) {
                return i.s((float[]) obj, (float[]) obj2, f10);
            }
        }, clippableRoundedCornerLayout.getCornerRadii(), n());
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: b5.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                clippableRoundedCornerLayout.e((float[]) valueAnimator.getAnimatedValue());
            }
        });
        return valueAnimatorOfObject;
    }

    public final AnimatorSet l(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f4592b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f4592b, (Property<View, Float>) View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.f4592b, (Property<View, Float>) View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.f4592b, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        animatorSet.addListener(new a(view));
        return animatorSet;
    }

    public void m(long j10, View view) {
        AnimatorSet animatorSetL = l(view);
        animatorSetL.setDuration(j10);
        animatorSetL.start();
        t();
    }

    public float[] n() {
        if (this.f4613l == null) {
            this.f4613l = h();
        }
        return this.f4613l;
    }

    public Rect o() {
        return this.f4612k;
    }

    public Rect p() {
        return this.f4611j;
    }

    public final int q(WindowInsets windowInsets, int i10) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    public final void t() {
        this.f4610i = 0.0f;
        this.f4611j = null;
        this.f4612k = null;
    }

    public void u(float f10, View view) {
        this.f4611j = d0.c(this.f4592b);
        if (view != null) {
            this.f4612k = d0.b(this.f4592b, view);
        }
        this.f4610i = f10;
    }

    public void v(BackEventCompat backEventCompat, View view) {
        super.d(backEventCompat);
        u(backEventCompat.c(), view);
    }

    public void w(float f10, boolean z10, float f11, float f12) {
        float fA = a(f10);
        float width = this.f4592b.getWidth();
        float height = this.f4592b.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float fA2 = k4.a.a(1.0f, 0.9f, fA);
        float fA3 = k4.a.a(0.0f, Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - this.f4608g), fA) * (z10 ? 1 : -1);
        float fMin = Math.min(Math.max(0.0f, ((height - (fA2 * height)) / 2.0f) - this.f4608g), this.f4609h);
        float f13 = f11 - this.f4610i;
        float fA4 = k4.a.a(0.0f, fMin, Math.abs(f13) / height) * Math.signum(f13);
        if (Float.isNaN(fA2) || Float.isNaN(fA3) || Float.isNaN(fA4)) {
            return;
        }
        this.f4592b.setScaleX(fA2);
        this.f4592b.setScaleY(fA2);
        this.f4592b.setTranslationX(fA3);
        this.f4592b.setTranslationY(fA4);
        View view = this.f4592b;
        if (view instanceof ClippableRoundedCornerLayout) {
            ((ClippableRoundedCornerLayout) view).e(r(n(), f12, fA));
        }
    }

    public void x(BackEventCompat backEventCompat, View view, float f10) {
        if (super.e(backEventCompat) == null) {
            return;
        }
        if (view != null && view.getVisibility() != 4) {
            view.setVisibility(4);
        }
        w(backEventCompat.a(), backEventCompat.b() == 0, backEventCompat.c(), f10);
    }
}
