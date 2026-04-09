package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s90 extends ValueAnimator implements Choreographer.FrameCallback {
    public u80 q;
    public final CopyOnWriteArraySet f = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet g = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet h = new CopyOnWriteArraySet();
    public float i = 1.0f;
    public boolean j = false;
    public long k = 0;
    public float l = 0.0f;
    public float m = 0.0f;
    public int n = 0;
    public float o = -2.1474836E9f;
    public float p = 2.1474836E9f;
    public boolean r = false;
    public boolean s = false;

    public final float a() {
        u80 u80Var = this.q;
        if (u80Var == null) {
            return 0.0f;
        }
        float f = this.m;
        float f2 = u80Var.l;
        return (f - f2) / (u80Var.m - f2);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.g.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.h.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f.add(animatorUpdateListener);
    }

    public final float b() {
        u80 u80Var = this.q;
        if (u80Var == null) {
            return 0.0f;
        }
        float f = this.p;
        return f == 2.1474836E9f ? u80Var.m : f;
    }

    public final float c() {
        u80 u80Var = this.q;
        if (u80Var == null) {
            return 0.0f;
        }
        float f = this.o;
        return f == -2.1474836E9f ? u80Var.l : f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        e(d());
        g(true);
    }

    public final boolean d() {
        return this.i < 0.0f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.r) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        u80 u80Var = this.q;
        if (u80Var == null || !this.r) {
            return;
        }
        float fAbs = (this.k != 0 ? j - r2 : 0L) / ((1.0E9f / u80Var.n) / Math.abs(this.i));
        float f = this.l;
        if (d()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fC = c();
        float fB = b();
        PointF pointF = te0.a;
        if (f2 >= fC && f2 <= fB) {
            z = true;
        }
        float f3 = this.l;
        float fB2 = te0.b(f2, c(), b());
        this.l = fB2;
        if (this.s) {
            fB2 = (float) Math.floor(fB2);
        }
        this.m = fB2;
        this.k = j;
        if (z) {
            if (!this.s || this.l != f3) {
                f();
            }
        } else if (getRepeatCount() == -1 || this.n < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.j = !this.j;
                this.i = -this.i;
            } else {
                float fB3 = d() ? b() : c();
                this.l = fB3;
                this.m = fB3;
            }
            this.k = j;
            if (!this.s || this.l != f3) {
                f();
            }
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.n++;
        } else {
            float fC2 = this.i < 0.0f ? c() : b();
            this.l = fC2;
            this.m = fC2;
            g(true);
            if (!this.s || this.l != f3) {
                f();
            }
            e(d());
        }
        if (this.q == null) {
            return;
        }
        float f4 = this.m;
        if (f4 < this.o || f4 > this.p) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.o), Float.valueOf(this.p), Float.valueOf(this.m)));
        }
    }

    public final void e(boolean z) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z);
        }
    }

    public final void f() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void g(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.r = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fC;
        float fB;
        float fC2;
        if (this.q == null) {
            return 0.0f;
        }
        if (d()) {
            fC = b() - this.m;
            fB = b();
            fC2 = c();
        } else {
            fC = this.m - c();
            fB = b();
            fC2 = c();
        }
        return fC / (fB - fC2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        u80 u80Var = this.q;
        if (u80Var == null) {
            return 0L;
        }
        return (long) u80Var.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(float f) {
        if (this.l == f) {
            return;
        }
        float fB = te0.b(f, c(), b());
        this.l = fB;
        if (this.s) {
            fB = (float) Math.floor(fB);
        }
        this.m = fB;
        this.k = 0L;
        f();
    }

    public final void i(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f2 + ")");
        }
        u80 u80Var = this.q;
        float f3 = u80Var == null ? -3.4028235E38f : u80Var.l;
        float f4 = u80Var == null ? Float.MAX_VALUE : u80Var.m;
        float fB = te0.b(f, f3, f4);
        float fB2 = te0.b(f2, f3, f4);
        if (fB == this.o && fB2 == this.p) {
            return;
        }
        this.o = fB;
        this.p = fB2;
        h((int) te0.b(this.m, fB, fB2));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.r;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.g.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.g.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.h.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.j) {
            return;
        }
        this.j = false;
        this.i = -this.i;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
