package k4;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public long f21848a;

    /* renamed from: b, reason: collision with root package name */
    public long f21849b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f21850c;

    /* renamed from: d, reason: collision with root package name */
    public int f21851d;

    /* renamed from: e, reason: collision with root package name */
    public int f21852e;

    public i(long j10, long j11) {
        this.f21850c = null;
        this.f21851d = 0;
        this.f21852e = 1;
        this.f21848a = j10;
        this.f21849b = j11;
    }

    public static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), valueAnimator.getInterpolator());
        iVar.f21851d = valueAnimator.getRepeatCount();
        iVar.f21852e = valueAnimator.getRepeatMode();
        return iVar;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(f());
            valueAnimator.setRepeatMode(g());
        }
    }

    public long c() {
        return this.f21848a;
    }

    public long d() {
        return this.f21849b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f21850c;
        return timeInterpolator != null ? timeInterpolator : a.f21835b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && f() == iVar.f() && g() == iVar.g()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int f() {
        return this.f21851d;
    }

    public int g() {
        return this.f21852e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f21851d = 0;
        this.f21852e = 1;
        this.f21848a = j10;
        this.f21849b = j11;
        this.f21850c = timeInterpolator;
    }
}
