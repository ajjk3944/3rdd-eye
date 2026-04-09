package a0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<View> f239a;

    /* renamed from: b, reason: collision with root package name */
    Runnable f240b = null;

    /* renamed from: c, reason: collision with root package name */
    Runnable f241c = null;

    /* renamed from: d, reason: collision with root package name */
    int f242d = -1;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f243a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f244b;

        a(x xVar, View view) {
            this.f243a = xVar;
            this.f244b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f243a.c(this.f244b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f243a.a(this.f244b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f243a.b(this.f244b);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f246a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f247b;

        b(z zVar, View view) {
            this.f246a = zVar;
            this.f247b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f246a.a(this.f247b);
        }
    }

    static class c implements x {

        /* renamed from: a, reason: collision with root package name */
        w f249a;

        /* renamed from: b, reason: collision with root package name */
        boolean f250b;

        c(w wVar) {
            this.f249a = wVar;
        }

        @Override // a0.x
        @SuppressLint({"WrongConstant"})
        public void a(View view) {
            int i2 = this.f249a.f242d;
            if (i2 > -1) {
                view.setLayerType(i2, null);
                this.f249a.f242d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f250b) {
                w wVar = this.f249a;
                Runnable runnable = wVar.f241c;
                if (runnable != null) {
                    wVar.f241c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                x xVar = tag instanceof x ? (x) tag : null;
                if (xVar != null) {
                    xVar.a(view);
                }
                this.f250b = true;
            }
        }

        @Override // a0.x
        public void b(View view) {
            this.f250b = false;
            if (this.f249a.f242d > -1) {
                view.setLayerType(2, null);
            }
            w wVar = this.f249a;
            Runnable runnable = wVar.f240b;
            if (runnable != null) {
                wVar.f240b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            x xVar = tag instanceof x ? (x) tag : null;
            if (xVar != null) {
                xVar.b(view);
            }
        }

        @Override // a0.x
        public void c(View view) {
            Object tag = view.getTag(2113929216);
            x xVar = tag instanceof x ? (x) tag : null;
            if (xVar != null) {
                xVar.c(view);
            }
        }
    }

    w(View view) {
        this.f239a = new WeakReference<>(view);
    }

    private void g(View view, x xVar) {
        if (xVar != null) {
            view.animate().setListener(new a(xVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public w a(float f2) {
        View view = this.f239a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = this.f239a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.f239a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public w d(long j2) {
        View view = this.f239a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public w e(Interpolator interpolator) {
        View view = this.f239a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public w f(x xVar) {
        View view = this.f239a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, xVar);
                xVar = new c(this);
            }
            g(view, xVar);
        }
        return this;
    }

    public w h(long j2) {
        View view = this.f239a.get();
        if (view != null) {
            view.animate().setStartDelay(j2);
        }
        return this;
    }

    public w i(z zVar) {
        View view = this.f239a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(zVar != null ? new b(zVar, view) : null);
        }
        return this;
    }

    public void j() {
        View view = this.f239a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public w k(float f2) {
        View view = this.f239a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
