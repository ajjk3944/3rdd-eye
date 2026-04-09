package Y0;

/* loaded from: classes.dex */
final class u implements Z0.a {

    /* renamed from: a, reason: collision with root package name */
    private final float f24548a;

    public u(float f10) {
        this.f24548a = f10;
    }

    @Override // Z0.a
    public float a(float f10) {
        return f10 / this.f24548a;
    }

    @Override // Z0.a
    public float b(float f10) {
        return f10 * this.f24548a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Float.compare(this.f24548a, ((u) obj).f24548a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f24548a);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f24548a + ')';
    }
}
