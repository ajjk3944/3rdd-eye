package r;

import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class L implements I {

    /* renamed from: a, reason: collision with root package name */
    private final int f59488a;

    /* renamed from: b, reason: collision with root package name */
    private final int f59489b;

    /* renamed from: c, reason: collision with root package name */
    private final E f59490c;

    /* renamed from: d, reason: collision with root package name */
    private final long f59491d;

    /* renamed from: e, reason: collision with root package name */
    private final long f59492e;

    public L(int i10, int i11, E e10) {
        this.f59488a = i10;
        this.f59489b = i11;
        this.f59490c = e10;
        this.f59491d = i10 * 1000000;
        this.f59492e = i11 * 1000000;
    }

    private final long f(long j10) {
        return AbstractC7978m.m(j10 - this.f59492e, 0L, this.f59491d);
    }

    @Override // r.I
    public float b(long j10, float f10, float f11, float f12) {
        long jF = f(j10);
        if (jF < 0) {
            return 0.0f;
        }
        if (jF == 0) {
            return f12;
        }
        return (e(jF, f10, f11, f12) - e(jF - 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // r.I
    public long c(float f10, float f11, float f12) {
        return (this.f59489b + this.f59488a) * 1000000;
    }

    @Override // r.I
    public float e(long j10, float f10, float f11, float f12) {
        float f13 = this.f59488a == 0 ? 1.0f : f(j10) / this.f59491d;
        E e10 = this.f59490c;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        return u0.k(f10, f11, e10.a(f13 <= 1.0f ? f13 : 1.0f));
    }
}
