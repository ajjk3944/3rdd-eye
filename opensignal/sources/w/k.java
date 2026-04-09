package w;

/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public float f24132a;

    /* renamed from: b, reason: collision with root package name */
    public float f24133b;

    /* renamed from: c, reason: collision with root package name */
    public float f24134c;

    /* renamed from: d, reason: collision with root package name */
    public float f24135d;

    public k(float f10, float f11, float f12, float f13) {
        this.f24132a = f10;
        this.f24133b = f11;
        this.f24134c = f12;
        this.f24135d = f13;
    }

    @Override // w.l
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f24132a;
        }
        if (i10 == 1) {
            return this.f24133b;
        }
        if (i10 == 2) {
            return this.f24134c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f24135d;
    }

    @Override // w.l
    public final int b() {
        return 4;
    }

    @Override // w.l
    public final l c() {
        return new k(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // w.l
    public final void d() {
        this.f24132a = 0.0f;
        this.f24133b = 0.0f;
        this.f24134c = 0.0f;
        this.f24135d = 0.0f;
    }

    @Override // w.l
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f24132a = f10;
            return;
        }
        if (i10 == 1) {
            this.f24133b = f10;
        } else if (i10 == 2) {
            this.f24134c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f24135d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f24132a == this.f24132a && kVar.f24133b == this.f24133b && kVar.f24134c == this.f24134c && kVar.f24135d == this.f24135d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24135d) + g.a(g.a(Float.hashCode(this.f24132a) * 31, this.f24133b, 31), this.f24134c, 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f24132a + ", v2 = " + this.f24133b + ", v3 = " + this.f24134c + ", v4 = " + this.f24135d;
    }
}
