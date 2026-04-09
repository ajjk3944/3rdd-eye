package r7;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends a implements Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public float f32857d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32858e;

    /* renamed from: f, reason: collision with root package name */
    public long f32859f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public float f32860h;

    /* renamed from: i, reason: collision with root package name */
    public int f32861i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f32862k;

    /* renamed from: l, reason: collision with root package name */
    public f7.j f32863l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32864m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32865n;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f32844b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(h());
        i(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f32864m) {
            i(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        f7.j jVar = this.f32863l;
        if (jVar == null || !this.f32864m) {
            return;
        }
        float fAbs = (this.f32859f != 0 ? j - r2 : 0L) / ((1.0E9f / jVar.f23761n) / Math.abs(this.f32857d));
        float f10 = this.g;
        if (h()) {
            fAbs = -fAbs;
        }
        float f11 = f10 + fAbs;
        float fG = g();
        float f12 = f();
        PointF pointF = h.f32867a;
        boolean z3 = f11 >= fG && f11 <= f12;
        float f13 = this.g;
        float fB = h.b(f11, g(), f());
        this.g = fB;
        if (this.f32865n) {
            fB = (float) Math.floor(fB);
        }
        this.f32860h = fB;
        this.f32859f = j;
        if (z3) {
            if (!this.f32865n || this.g != f13) {
                d();
            }
        } else if (getRepeatCount() == -1 || this.f32861i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f32858e = !this.f32858e;
                this.f32857d = -this.f32857d;
            } else {
                float f14 = h() ? f() : g();
                this.g = f14;
                this.f32860h = f14;
            }
            this.f32859f = j;
            if (!this.f32865n || this.g != f13) {
                d();
            }
            Iterator it = this.f32844b.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.f32861i++;
        } else {
            float fG2 = this.f32857d < 0.0f ? g() : f();
            this.g = fG2;
            this.f32860h = fG2;
            i(true);
            if (!this.f32865n || this.g != f13) {
                d();
            }
            a(h());
        }
        if (this.f32863l == null) {
            return;
        }
        float f15 = this.f32860h;
        if (f15 < this.j || f15 > this.f32862k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.j), Float.valueOf(this.f32862k), Float.valueOf(this.f32860h)));
        }
    }

    public final float e() {
        f7.j jVar = this.f32863l;
        if (jVar == null) {
            return 0.0f;
        }
        float f10 = this.f32860h;
        float f11 = jVar.f23759l;
        return (f10 - f11) / (jVar.f23760m - f11);
    }

    public final float f() {
        f7.j jVar = this.f32863l;
        if (jVar == null) {
            return 0.0f;
        }
        float f10 = this.f32862k;
        return f10 == 2.1474836E9f ? jVar.f23760m : f10;
    }

    public final float g() {
        f7.j jVar = this.f32863l;
        if (jVar == null) {
            return 0.0f;
        }
        float f10 = this.j;
        return f10 == -2.1474836E9f ? jVar.f23759l : f10;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fG;
        float f10;
        float fG2;
        if (this.f32863l == null) {
            return 0.0f;
        }
        if (h()) {
            fG = f() - this.f32860h;
            f10 = f();
            fG2 = g();
        } else {
            fG = this.f32860h - g();
            f10 = f();
            fG2 = g();
        }
        return fG / (f10 - fG2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(e());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        f7.j jVar = this.f32863l;
        if (jVar == null) {
            return 0L;
        }
        return (long) jVar.b();
    }

    public final boolean h() {
        return this.f32857d < 0.0f;
    }

    public final void i(boolean z3) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z3) {
            this.f32864m = false;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f32864m;
    }

    public final void j(float f10) {
        if (this.g == f10) {
            return;
        }
        float fB = h.b(f10, g(), f());
        this.g = fB;
        if (this.f32865n) {
            fB = (float) Math.floor(fB);
        }
        this.f32860h = fB;
        this.f32859f = 0L;
        d();
    }

    public final void k(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException("minFrame (" + f10 + ") must be <= maxFrame (" + f11 + ")");
        }
        f7.j jVar = this.f32863l;
        float f12 = jVar == null ? -3.4028235E38f : jVar.f23759l;
        float f13 = jVar == null ? Float.MAX_VALUE : jVar.f23760m;
        float fB = h.b(f10, f12, f13);
        float fB2 = h.b(f11, f12, f13);
        if (fB == this.j && fB2 == this.f32862k) {
            return;
        }
        this.j = fB;
        this.f32862k = fB2;
        j((int) h.b(this.f32860h, fB, fB2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i4) {
        super.setRepeatMode(i4);
        if (i4 == 2 || !this.f32858e) {
            return;
        }
        this.f32858e = false;
        this.f32857d = -this.f32857d;
    }
}
