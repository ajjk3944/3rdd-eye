package u3;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23218a;

    /* renamed from: b, reason: collision with root package name */
    public float f23219b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f23220c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23221d;

    public t0(int i10, Interpolator interpolator, long j) {
        this.f23218a = i10;
        this.f23220c = interpolator;
        this.f23221d = j;
    }

    public long a() {
        return this.f23221d;
    }

    public float b() {
        Interpolator interpolator = this.f23220c;
        return interpolator != null ? interpolator.getInterpolation(this.f23219b) : this.f23219b;
    }

    public int c() {
        return this.f23218a;
    }

    public void d(float f10) {
        this.f23219b = f10;
    }
}
