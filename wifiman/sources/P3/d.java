package P3;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private long f18028a;

    /* renamed from: b, reason: collision with root package name */
    private long f18029b;

    /* renamed from: c, reason: collision with root package name */
    private TimeInterpolator f18030c;

    /* renamed from: d, reason: collision with root package name */
    private int f18031d;

    /* renamed from: e, reason: collision with root package name */
    private int f18032e;

    public d(long j10, long j11) {
        this.f18030c = null;
        this.f18031d = 0;
        this.f18032e = 1;
        this.f18028a = j10;
        this.f18029b = j11;
    }

    static d a(ValueAnimator valueAnimator) {
        d dVar = new d(valueAnimator.getStartDelay(), valueAnimator.getDuration(), e(valueAnimator));
        dVar.f18031d = valueAnimator.getRepeatCount();
        dVar.f18032e = valueAnimator.getRepeatMode();
        return dVar;
    }

    private static TimeInterpolator e(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f18022b : interpolator instanceof AccelerateInterpolator ? a.f18023c : interpolator instanceof DecelerateInterpolator ? a.f18024d : interpolator;
    }

    public long b() {
        return this.f18028a;
    }

    public long c() {
        return this.f18029b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.f18030c;
        return timeInterpolator != null ? timeInterpolator : a.f18022b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (b() == dVar.b() && c() == dVar.c() && f() == dVar.f() && g() == dVar.g()) {
            return d().getClass().equals(dVar.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.f18031d;
    }

    public int g() {
        return this.f18032e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public d(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f18031d = 0;
        this.f18032e = 1;
        this.f18028a = j10;
        this.f18029b = j11;
        this.f18030c = timeInterpolator;
    }
}
