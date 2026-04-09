package e9;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class e extends ValueAnimator implements Choreographer.FrameCallback {
    public r8.h H;

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f7987a = new CopyOnWriteArraySet();

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f7988d = new CopyOnWriteArraySet();

    /* renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet f7989g = new CopyOnWriteArraySet();

    /* renamed from: r, reason: collision with root package name */
    public float f7990r = 1.0f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7991x = false;

    /* renamed from: y, reason: collision with root package name */
    public long f7992y = 0;
    public float B = 0.0f;
    public float D = 0.0f;
    public int E = 0;
    public float F = -2.1474836E9f;
    public float G = 2.1474836E9f;
    public boolean I = false;
    public boolean J = false;

    public final float a() {
        r8.h hVar = this.H;
        if (hVar == null) {
            return 0.0f;
        }
        float f10 = this.D;
        float f11 = hVar.f21332l;
        return (f10 - f11) / (hVar.f21333m - f11);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f7988d.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f7989g.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f7987a.add(animatorUpdateListener);
    }

    public final float b() {
        r8.h hVar = this.H;
        if (hVar == null) {
            return 0.0f;
        }
        float f10 = this.G;
        return f10 == 2.1474836E9f ? hVar.f21333m : f10;
    }

    public final float c() {
        r8.h hVar = this.H;
        if (hVar == null) {
            return 0.0f;
        }
        float f10 = this.F;
        return f10 == -2.1474836E9f ? hVar.f21332l : f10;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f7988d.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        e(d());
        g(true);
    }

    public final boolean d() {
        return this.f7990r < 0.0f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z10 = false;
        if (this.I) {
            g(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        r8.h hVar = this.H;
        if (hVar == null || !this.I) {
            return;
        }
        r8.a aVar = r8.d.f21312a;
        float fAbs = (this.f7992y != 0 ? j - r2 : 0L) / ((1.0E9f / hVar.f21334n) / Math.abs(this.f7990r));
        float f10 = this.B;
        if (d()) {
            fAbs = -fAbs;
        }
        float f11 = f10 + fAbs;
        float fC = c();
        float fB = b();
        PointF pointF = g.f7994a;
        if (f11 >= fC && f11 <= fB) {
            z10 = true;
        }
        float f12 = this.B;
        float fB2 = g.b(f11, c(), b());
        this.B = fB2;
        if (this.J) {
            fB2 = (float) Math.floor(fB2);
        }
        this.D = fB2;
        this.f7992y = j;
        if (z10) {
            if (!this.J || this.B != f12) {
                f();
            }
        } else if (getRepeatCount() == -1 || this.E < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f7991x = !this.f7991x;
                this.f7990r = -this.f7990r;
            } else {
                float fB3 = d() ? b() : c();
                this.B = fB3;
                this.D = fB3;
            }
            this.f7992y = j;
            if (!this.J || this.B != f12) {
                f();
            }
            Iterator it = this.f7988d.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.E++;
        } else {
            float fC2 = this.f7990r < 0.0f ? c() : b();
            this.B = fC2;
            this.D = fC2;
            g(true);
            if (!this.J || this.B != f12) {
                f();
            }
            e(d());
        }
        if (this.H != null) {
            float f13 = this.D;
            if (f13 < this.F || f13 > this.G) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.F), Float.valueOf(this.G), Float.valueOf(this.D)));
            }
        }
        r8.a aVar2 = r8.d.f21312a;
    }

    public final void e(boolean z10) {
        Iterator it = this.f7988d.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    public final void f() {
        Iterator it = this.f7987a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final void g(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.I = false;
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fC;
        float fB;
        float fC2;
        if (this.H == null) {
            return 0.0f;
        }
        if (d()) {
            fC = b() - this.D;
            fB = b();
            fC2 = c();
        } else {
            fC = this.D - c();
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
        r8.h hVar = this.H;
        if (hVar == null) {
            return 0L;
        }
        return (long) hVar.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(float f10) {
        if (this.B == f10) {
            return;
        }
        float fB = g.b(f10, c(), b());
        this.B = fB;
        if (this.J) {
            fB = (float) Math.floor(fB);
        }
        this.D = fB;
        this.f7992y = 0L;
        f();
    }

    public final void i(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException("minFrame (" + f10 + ") must be <= maxFrame (" + f11 + ")");
        }
        r8.h hVar = this.H;
        float f12 = hVar == null ? -3.4028235E38f : hVar.f21332l;
        float f13 = hVar == null ? Float.MAX_VALUE : hVar.f21333m;
        float fB = g.b(f10, f12, f13);
        float fB2 = g.b(f11, f12, f13);
        if (fB == this.F && fB2 == this.G) {
            return;
        }
        this.F = fB;
        this.G = fB2;
        h((int) g.b(this.D, fB, fB2));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.I;
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f7988d.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f7987a.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f7988d.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f7989g.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f7987a.remove(animatorUpdateListener);
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
    public final void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f7991x) {
            return;
        }
        this.f7991x = false;
        this.f7990r = -this.f7990r;
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
