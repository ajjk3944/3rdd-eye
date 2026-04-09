package L3;

import B4.i;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* compiled from: MotionTiming.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public long f4048a;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f4050c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f4051d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f4052e = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f4049b = 150;

    public h(long j4) {
        this.f4048a = j4;
    }

    public final void a(Animator animator) {
        animator.setStartDelay(this.f4048a);
        animator.setDuration(this.f4049b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f4051d);
            valueAnimator.setRepeatMode(this.f4052e);
        }
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f4050c;
        return timeInterpolator != null ? timeInterpolator : a.f4035b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f4048a == hVar.f4048a && this.f4049b == hVar.f4049b && this.f4051d == hVar.f4051d && this.f4052e == hVar.f4052e) {
            return b().getClass().equals(hVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f4048a;
        long j10 = this.f4049b;
        return ((((b().getClass().hashCode() + (((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f4051d) * 31) + this.f4052e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(h.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f4048a);
        sb.append(" duration: ");
        sb.append(this.f4049b);
        sb.append(" interpolator: ");
        sb.append(b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f4051d);
        sb.append(" repeatMode: ");
        return i.j(sb, this.f4052e, "}\n");
    }
}
