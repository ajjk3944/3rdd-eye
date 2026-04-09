package a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n extends r {

    /* renamed from: a, reason: collision with root package name */
    public float f92a;

    public n(float f10) {
        this.f92a = f10;
    }

    @Override // a0.r
    public final float a(int i4) {
        if (i4 == 0) {
            return this.f92a;
        }
        return 0.0f;
    }

    @Override // a0.r
    public final int b() {
        return 1;
    }

    @Override // a0.r
    public final r c() {
        return new n(0.0f);
    }

    @Override // a0.r
    public final void d() {
        this.f92a = 0.0f;
    }

    @Override // a0.r
    public final void e(int i4, float f10) {
        if (i4 == 0) {
            this.f92a = f10;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n) && ((n) obj).f92a == this.f92a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f92a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f92a;
    }
}
