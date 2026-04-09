package u2;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import i2.C4444d;
import i2.C4448h;
import i2.EnumC4441a;
import java.util.Iterator;

/* compiled from: LottieValueAnimator.java */
/* renamed from: u2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC5626e extends AbstractC5622a implements Choreographer.FrameCallback {

    /* renamed from: e, reason: collision with root package name */
    public float f46545e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46546f;

    /* renamed from: g, reason: collision with root package name */
    public long f46547g;

    /* renamed from: h, reason: collision with root package name */
    public float f46548h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public int f46549j;

    /* renamed from: k, reason: collision with root package name */
    public float f46550k;

    /* renamed from: l, reason: collision with root package name */
    public float f46551l;

    /* renamed from: m, reason: collision with root package name */
    public C4448h f46552m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f46553n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f46554o;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f46537c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(g());
        h(true);
    }

    public final float d() {
        C4448h c4448h = this.f46552m;
        if (c4448h == null) {
            return 0.0f;
        }
        float f10 = this.i;
        float f11 = c4448h.f38355l;
        return (f10 - f11) / (c4448h.f38356m - f11);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j4) {
        if (this.f46553n) {
            h(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        C4448h c4448h = this.f46552m;
        if (c4448h == null || !this.f46553n) {
            return;
        }
        EnumC4441a enumC4441a = C4444d.f38338a;
        float fAbs = (this.f46547g != 0 ? j4 - r4 : 0L) / ((1.0E9f / c4448h.f38357n) / Math.abs(this.f46545e));
        float f10 = this.f46548h;
        if (g()) {
            fAbs = -fAbs;
        }
        float f11 = f10 + fAbs;
        float f12 = f();
        float fE = e();
        PointF pointF = C5628g.f46556a;
        boolean z10 = f11 >= f12 && f11 <= fE;
        float f13 = this.f46548h;
        float fB = C5628g.b(f11, f(), e());
        this.f46548h = fB;
        if (this.f46554o) {
            fB = (float) Math.floor(fB);
        }
        this.i = fB;
        this.f46547g = j4;
        if (!this.f46554o || this.f46548h != f13) {
            b();
        }
        if (!z10) {
            if (getRepeatCount() == -1 || this.f46549j < getRepeatCount()) {
                Iterator it = this.f46537c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.f46549j++;
                if (getRepeatMode() == 2) {
                    this.f46546f = !this.f46546f;
                    this.f46545e = -this.f46545e;
                } else {
                    float fE2 = g() ? e() : f();
                    this.f46548h = fE2;
                    this.i = fE2;
                }
                this.f46547g = j4;
            } else {
                float f14 = this.f46545e < 0.0f ? f() : e();
                this.f46548h = f14;
                this.i = f14;
                h(true);
                a(g());
            }
        }
        if (this.f46552m != null) {
            float f15 = this.i;
            if (f15 < this.f46550k || f15 > this.f46551l) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f46550k), Float.valueOf(this.f46551l), Float.valueOf(this.i)));
            }
        }
        EnumC4441a enumC4441a2 = C4444d.f38338a;
    }

    public final float e() {
        C4448h c4448h = this.f46552m;
        if (c4448h == null) {
            return 0.0f;
        }
        float f10 = this.f46551l;
        return f10 == 2.1474836E9f ? c4448h.f38356m : f10;
    }

    public final float f() {
        C4448h c4448h = this.f46552m;
        if (c4448h == null) {
            return 0.0f;
        }
        float f10 = this.f46550k;
        return f10 == -2.1474836E9f ? c4448h.f38355l : f10;
    }

    public final boolean g() {
        return this.f46545e < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f10;
        float fE;
        float f11;
        if (this.f46552m == null) {
            return 0.0f;
        }
        if (g()) {
            f10 = e() - this.i;
            fE = e();
            f11 = f();
        } else {
            f10 = this.i - f();
            fE = e();
            f11 = f();
        }
        return f10 / (fE - f11);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C4448h c4448h = this.f46552m;
        if (c4448h == null) {
            return 0L;
        }
        return (long) c4448h.b();
    }

    public final void h(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f46553n = false;
        }
    }

    public final void i(float f10) {
        if (this.f46548h == f10) {
            return;
        }
        float fB = C5628g.b(f10, f(), e());
        this.f46548h = fB;
        if (this.f46554o) {
            fB = (float) Math.floor(fB);
        }
        this.i = fB;
        this.f46547g = 0L;
        b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f46553n;
    }

    public final void j(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException("minFrame (" + f10 + ") must be <= maxFrame (" + f11 + ")");
        }
        C4448h c4448h = this.f46552m;
        float f12 = c4448h == null ? -3.4028235E38f : c4448h.f38355l;
        float f13 = c4448h == null ? Float.MAX_VALUE : c4448h.f38356m;
        float fB = C5628g.b(f10, f12, f13);
        float fB2 = C5628g.b(f11, f12, f13);
        if (fB == this.f46550k && fB2 == this.f46551l) {
            return;
        }
        this.f46550k = fB;
        this.f46551l = fB2;
        i((int) C5628g.b(this.i, fB, fB2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f46546f) {
            return;
        }
        this.f46546f = false;
        this.f46545e = -this.f46545e;
    }
}
