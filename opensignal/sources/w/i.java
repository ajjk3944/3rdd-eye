package w;

/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: a, reason: collision with root package name */
    public float f24127a;

    /* renamed from: b, reason: collision with root package name */
    public float f24128b;

    public i(float f10, float f11) {
        this.f24127a = f10;
        this.f24128b = f11;
    }

    @Override // w.l
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f24127a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f24128b;
    }

    @Override // w.l
    public final int b() {
        return 2;
    }

    @Override // w.l
    public final l c() {
        return new i(0.0f, 0.0f);
    }

    @Override // w.l
    public final void d() {
        this.f24127a = 0.0f;
        this.f24128b = 0.0f;
    }

    @Override // w.l
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f24127a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f24128b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f24127a == this.f24127a && iVar.f24128b == this.f24128b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24128b) + (Float.hashCode(this.f24127a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f24127a + ", v2 = " + this.f24128b;
    }
}
