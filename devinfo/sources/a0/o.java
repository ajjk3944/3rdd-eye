package a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o extends r {

    /* renamed from: a, reason: collision with root package name */
    public float f95a;

    /* renamed from: b, reason: collision with root package name */
    public float f96b;

    public o(float f10, float f11) {
        this.f95a = f10;
        this.f96b = f11;
    }

    @Override // a0.r
    public final float a(int i4) {
        if (i4 == 0) {
            return this.f95a;
        }
        if (i4 != 1) {
            return 0.0f;
        }
        return this.f96b;
    }

    @Override // a0.r
    public final int b() {
        return 2;
    }

    @Override // a0.r
    public final r c() {
        return new o(0.0f, 0.0f);
    }

    @Override // a0.r
    public final void d() {
        this.f95a = 0.0f;
        this.f96b = 0.0f;
    }

    @Override // a0.r
    public final void e(int i4, float f10) {
        if (i4 == 0) {
            this.f95a = f10;
        } else {
            if (i4 != 1) {
                return;
            }
            this.f96b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return oVar.f95a == this.f95a && oVar.f96b == this.f96b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f96b) + (Float.floatToIntBits(this.f95a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f95a + ", v2 = " + this.f96b;
    }
}
