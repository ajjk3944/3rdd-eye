package w;

/* loaded from: classes.dex */
public final class h extends l {

    /* renamed from: a, reason: collision with root package name */
    public float f24126a;

    public h(float f10) {
        this.f24126a = f10;
    }

    @Override // w.l
    public final float a(int i10) {
        if (i10 == 0) {
            return this.f24126a;
        }
        return 0.0f;
    }

    @Override // w.l
    public final int b() {
        return 1;
    }

    @Override // w.l
    public final l c() {
        return new h(0.0f);
    }

    @Override // w.l
    public final void d() {
        this.f24126a = 0.0f;
    }

    @Override // w.l
    public final void e(int i10, float f10) {
        if (i10 == 0) {
            this.f24126a = f10;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h) && ((h) obj).f24126a == this.f24126a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24126a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f24126a;
    }
}
