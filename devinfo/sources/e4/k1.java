package e4;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f22364a;

    /* renamed from: b, reason: collision with root package name */
    public float f22365b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f22366c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22367d;

    public k1(int i4, Interpolator interpolator, long j) {
        this.f22364a = i4;
        this.f22366c = interpolator;
        this.f22367d = j;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f22367d;
    }

    public float c() {
        Interpolator interpolator = this.f22366c;
        return interpolator != null ? interpolator.getInterpolation(this.f22365b) : this.f22365b;
    }

    public int d() {
        return this.f22364a;
    }

    public void e(float f10) {
        this.f22365b = f10;
    }
}
