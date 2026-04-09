package n0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final float f54204a;

    /* renamed from: b, reason: collision with root package name */
    private final float f54205b;

    public z(float f10, float f11) {
        this.f54204a = f10;
        this.f54205b = f11;
    }

    public final float a() {
        return this.f54204a;
    }

    public final float b() {
        return this.f54205b;
    }

    public final float[] c() {
        float f10 = this.f54204a;
        float f11 = this.f54205b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Float.compare(this.f54204a, zVar.f54204a) == 0 && Float.compare(this.f54205b, zVar.f54205b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f54204a) * 31) + Float.hashCode(this.f54205b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f54204a + ", y=" + this.f54205b + ')';
    }

    public z(float f10, float f11, float f12) {
        this(f10, f11, f12, f10 + f11 + f12);
    }

    private z(float f10, float f11, float f12, float f13) {
        this(f10 / f13, f11 / f13);
    }
}
