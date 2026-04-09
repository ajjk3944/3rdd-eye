package w;

/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    public float f24129a;

    /* renamed from: b, reason: collision with root package name */
    public float f24130b;

    /* renamed from: c, reason: collision with root package name */
    public float f24131c;

    public j(float f10, float f11, float f12) {
        this.f24129a = f10;
        this.f24130b = f11;
        this.f24131c = f12;
    }

    @Override // w.l
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f24129a;
        }
        if (i10 == 1) {
            return this.f24130b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f24131c;
    }

    @Override // w.l
    public final int b() {
        return 3;
    }

    @Override // w.l
    public final l c() {
        return new j(0.0f, 0.0f, 0.0f);
    }

    @Override // w.l
    public final void d() {
        this.f24129a = 0.0f;
        this.f24130b = 0.0f;
        this.f24131c = 0.0f;
    }

    @Override // w.l
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f24129a = f10;
        } else if (i10 == 1) {
            this.f24130b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f24131c = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f24129a == this.f24129a && jVar.f24130b == this.f24130b && jVar.f24131c == this.f24131c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24131c) + g.a(Float.hashCode(this.f24129a) * 31, this.f24130b, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f24129a + ", v2 = " + this.f24130b + ", v3 = " + this.f24131c;
    }
}
