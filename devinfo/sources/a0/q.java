package a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends r {

    /* renamed from: a, reason: collision with root package name */
    public float f107a;

    /* renamed from: b, reason: collision with root package name */
    public float f108b;

    /* renamed from: c, reason: collision with root package name */
    public float f109c;

    /* renamed from: d, reason: collision with root package name */
    public float f110d;

    public q(float f10, float f11, float f12, float f13) {
        this.f107a = f10;
        this.f108b = f11;
        this.f109c = f12;
        this.f110d = f13;
    }

    @Override // a0.r
    public final float a(int i4) {
        if (i4 == 0) {
            return this.f107a;
        }
        if (i4 == 1) {
            return this.f108b;
        }
        if (i4 == 2) {
            return this.f109c;
        }
        if (i4 != 3) {
            return 0.0f;
        }
        return this.f110d;
    }

    @Override // a0.r
    public final int b() {
        return 4;
    }

    @Override // a0.r
    public final r c() {
        return new q(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // a0.r
    public final void d() {
        this.f107a = 0.0f;
        this.f108b = 0.0f;
        this.f109c = 0.0f;
        this.f110d = 0.0f;
    }

    @Override // a0.r
    public final void e(int i4, float f10) {
        if (i4 == 0) {
            this.f107a = f10;
            return;
        }
        if (i4 == 1) {
            this.f108b = f10;
        } else if (i4 == 2) {
            this.f109c = f10;
        } else {
            if (i4 != 3) {
                return;
            }
            this.f110d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f107a == this.f107a && qVar.f108b == this.f108b && qVar.f109c == this.f109c && qVar.f110d == this.f110d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f110d) + r5.c.d(this.f109c, r5.c.d(this.f108b, Float.floatToIntBits(this.f107a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f107a + ", v2 = " + this.f108b + ", v3 = " + this.f109c + ", v4 = " + this.f110d;
    }
}
