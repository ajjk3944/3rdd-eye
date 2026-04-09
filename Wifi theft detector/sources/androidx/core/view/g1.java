package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2721a;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h1 f2722a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f2723b;

        public a(h1 h1Var, View view) {
            this.f2722a = h1Var;
            this.f2723b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2722a.a(this.f2723b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2722a.b(this.f2723b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f2722a.c(this.f2723b);
        }
    }

    public g1(View view) {
        this.f2721a = new WeakReference(view);
    }

    public g1 b(float f10) {
        View view = (View) this.f2721a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f2721a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f2721a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public g1 e(long j10) {
        View view = (View) this.f2721a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public g1 f(Interpolator interpolator) {
        View view = (View) this.f2721a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public g1 g(h1 h1Var) {
        View view = (View) this.f2721a.get();
        if (view != null) {
            h(view, h1Var);
        }
        return this;
    }

    public final void h(View view, h1 h1Var) {
        if (h1Var != null) {
            view.animate().setListener(new a(h1Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public g1 i(long j10) {
        View view = (View) this.f2721a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public g1 j(final j1 j1Var) {
        final View view = (View) this.f2721a.get();
        if (view != null) {
            view.animate().setUpdateListener(j1Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.f1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    j1Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.f2721a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public g1 l(float f10) {
        View view = (View) this.f2721a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
