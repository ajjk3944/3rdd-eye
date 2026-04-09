package e3;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f19936a;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f19938c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f19939d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f19940e = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f19937b = 150;

    public f(long j6) {
        this.f19936a = j6;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f19936a);
        objectAnimator.setDuration(this.f19937b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.f19939d);
        objectAnimator.setRepeatMode(this.f19940e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f19938c;
        return timeInterpolator != null ? timeInterpolator : AbstractC2303a.f19928b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f19936a == fVar.f19936a && this.f19937b == fVar.f19937b && this.f19939d == fVar.f19939d && this.f19940e == fVar.f19940e) {
            return b().getClass().equals(fVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f19936a;
        long j7 = this.f19937b;
        return ((((b().getClass().hashCode() + (((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) ((j7 >>> 32) ^ j7))) * 31)) * 31) + this.f19939d) * 31) + this.f19940e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(f.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f19936a);
        sb.append(" duration: ");
        sb.append(this.f19937b);
        sb.append(" interpolator: ");
        sb.append(b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f19939d);
        sb.append(" repeatMode: ");
        return AbstractC2763b.d(this.f19940e, "}\n", sb);
    }
}
