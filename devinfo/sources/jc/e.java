package jc;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f27491a;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f27493c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f27494d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f27495e = 1;

    /* renamed from: b, reason: collision with root package name */
    public long f27492b = 150;

    public e(long j) {
        this.f27491a = j;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f27491a);
        objectAnimator.setDuration(this.f27492b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.f27494d);
        objectAnimator.setRepeatMode(this.f27495e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f27493c;
        return timeInterpolator != null ? timeInterpolator : a.f27483b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f27491a == eVar.f27491a && this.f27492b == eVar.f27492b && this.f27494d == eVar.f27494d && this.f27495e == eVar.f27495e) {
            return b().getClass().equals(eVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f27491a;
        long j8 = this.f27492b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j8 >>> 32) ^ j8))) * 31)) * 31) + this.f27494d) * 31) + this.f27495e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(e.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f27491a);
        sb2.append(" duration: ");
        sb2.append(this.f27492b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f27494d);
        sb2.append(" repeatMode: ");
        return r5.c.j(this.f27495e, "}\n", sb2);
    }
}
