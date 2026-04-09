package F1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: F1.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2745e0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f5722a;

    /* renamed from: F1.e0$a */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2747f0 f5723a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f5724b;

        a(InterfaceC2747f0 interfaceC2747f0, View view) {
            this.f5723a = interfaceC2747f0;
            this.f5724b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5723a.a(this.f5724b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5723a.b(this.f5724b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f5723a.c(this.f5724b);
        }
    }

    C2745e0(View view) {
        this.f5722a = new WeakReference(view);
    }

    private void i(View view, InterfaceC2747f0 interfaceC2747f0) {
        if (interfaceC2747f0 != null) {
            view.animate().setListener(new a(interfaceC2747f0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public C2745e0 b(float f10) {
        View view = (View) this.f5722a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f5722a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f5722a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public C2745e0 f(long j10) {
        View view = (View) this.f5722a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public C2745e0 g(Interpolator interpolator) {
        View view = (View) this.f5722a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public C2745e0 h(InterfaceC2747f0 interfaceC2747f0) {
        View view = (View) this.f5722a.get();
        if (view != null) {
            i(view, interfaceC2747f0);
        }
        return this;
    }

    public C2745e0 j(long j10) {
        View view = (View) this.f5722a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public C2745e0 k(final InterfaceC2751h0 interfaceC2751h0) {
        final View view = (View) this.f5722a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC2751h0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: F1.d0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC2751h0.a(view);
                }
            } : null);
        }
        return this;
    }

    public void l() {
        View view = (View) this.f5722a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public C2745e0 m(float f10) {
        View view = (View) this.f5722a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
