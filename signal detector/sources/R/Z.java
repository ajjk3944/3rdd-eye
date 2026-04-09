package R;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    public final int f3295a;

    /* renamed from: b, reason: collision with root package name */
    public float f3296b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f3297c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3298d;

    public Z(int i, Interpolator interpolator, long j6) {
        this.f3295a = i;
        this.f3297c = interpolator;
        this.f3298d = j6;
    }

    public long a() {
        return this.f3298d;
    }

    public float b() {
        Interpolator interpolator = this.f3297c;
        return interpolator != null ? interpolator.getInterpolation(this.f3296b) : this.f3296b;
    }

    public int c() {
        return this.f3295a;
    }

    public void d(float f2) {
        this.f3296b = f2;
    }
}
