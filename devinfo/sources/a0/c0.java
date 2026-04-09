package a0;

import com.google.android.gms.internal.ads.mx1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f20a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23d;

    public c0(int i4, mx1 mx1Var, long j, long j8) {
        this.f20a = i4;
        this.f23d = mx1Var;
        this.f21b = j;
        this.f22c = j8;
    }

    @Override // a0.a0
    public float a(long j, float f10, float f11, float f12) {
        long j8 = j - this.f22c;
        if (j8 < 0) {
            j8 = 0;
        }
        long j9 = this.f21b;
        long j10 = j8 > j9 ? j9 : j8;
        if (j10 == 0) {
            return f12;
        }
        return (e(j10, f10, f11, f12) - e(j10 - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // a0.a0
    public long b(float f10, float f11, float f12) {
        return this.f22c + this.f21b;
    }

    @Override // a0.l
    public v0 c(y4.a aVar) {
        return new x0(this);
    }

    @Override // a0.a0
    public float d(float f10, float f11, float f12) {
        return a(b(f10, f11, f12), f10, f11, f12);
    }

    @Override // a0.a0
    public float e(long j, float f10, float f11, float f12) {
        long j8 = j - this.f22c;
        if (j8 < 0) {
            j8 = 0;
        }
        long j9 = this.f21b;
        if (j8 > j9) {
            j8 = j9;
        }
        float fA = ((w) this.f23d).a(this.f20a == 0 ? 1.0f : j8 / j9);
        return (f11 * fA) + ((1 - fA) * f10);
    }

    public c0(int i4, w wVar) {
        this.f20a = i4;
        this.f23d = wVar;
        this.f21b = i4 * 1000000;
        this.f22c = 0 * 1000000;
    }
}
