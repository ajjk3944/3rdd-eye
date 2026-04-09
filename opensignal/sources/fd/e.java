package fd;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f8831a;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f8833c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f8834d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f8835e = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f8832b = 150;

    public e(long j) {
        this.f8831a = j;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f8831a);
        objectAnimator.setDuration(this.f8832b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.f8834d);
        objectAnimator.setRepeatMode(this.f8835e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f8833c;
        return timeInterpolator != null ? timeInterpolator : a.f8823b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f8831a == eVar.f8831a && this.f8832b == eVar.f8832b && this.f8834d == eVar.f8834d && this.f8835e == eVar.f8835e) {
            return b().getClass().equals(eVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f8831a;
        long j7 = this.f8832b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j7 >>> 32) ^ j7))) * 31)) * 31) + this.f8834d) * 31) + this.f8835e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(e.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f8831a);
        sb2.append(" duration: ");
        sb2.append(this.f8832b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f8834d);
        sb2.append(" repeatMode: ");
        return h0.b.i(this.f8835e, "}\n", sb2);
    }
}
