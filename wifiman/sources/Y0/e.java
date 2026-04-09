package Y0;

/* loaded from: classes.dex */
final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f24518a;

    /* renamed from: b, reason: collision with root package name */
    private final float f24519b;

    public e(float f10, float f11) {
        this.f24518a = f10;
        this.f24519b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f24518a, eVar.f24518a) == 0 && Float.compare(this.f24519b, eVar.f24519b) == 0;
    }

    @Override // Y0.d
    public float getDensity() {
        return this.f24518a;
    }

    public int hashCode() {
        return (Float.hashCode(this.f24518a) * 31) + Float.hashCode(this.f24519b);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f24518a + ", fontScale=" + this.f24519b + ')';
    }

    @Override // Y0.l
    public float y() {
        return this.f24519b;
    }
}
