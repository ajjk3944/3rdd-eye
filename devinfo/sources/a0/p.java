package a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p extends r {

    /* renamed from: a, reason: collision with root package name */
    public float f102a;

    /* renamed from: b, reason: collision with root package name */
    public float f103b;

    /* renamed from: c, reason: collision with root package name */
    public float f104c;

    public p(float f10, float f11, float f12) {
        this.f102a = f10;
        this.f103b = f11;
        this.f104c = f12;
    }

    @Override // a0.r
    public final float a(int i4) {
        if (i4 == 0) {
            return this.f102a;
        }
        if (i4 == 1) {
            return this.f103b;
        }
        if (i4 != 2) {
            return 0.0f;
        }
        return this.f104c;
    }

    @Override // a0.r
    public final int b() {
        return 3;
    }

    @Override // a0.r
    public final r c() {
        return new p(0.0f, 0.0f, 0.0f);
    }

    @Override // a0.r
    public final void d() {
        this.f102a = 0.0f;
        this.f103b = 0.0f;
        this.f104c = 0.0f;
    }

    @Override // a0.r
    public final void e(int i4, float f10) {
        if (i4 == 0) {
            this.f102a = f10;
        } else if (i4 == 1) {
            this.f103b = f10;
        } else {
            if (i4 != 2) {
                return;
            }
            this.f104c = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.f102a == this.f102a && pVar.f103b == this.f103b && pVar.f104c == this.f104c;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f104c) + r5.c.d(this.f103b, Float.floatToIntBits(this.f102a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f102a + ", v2 = " + this.f103b + ", v3 = " + this.f104c;
    }
}
