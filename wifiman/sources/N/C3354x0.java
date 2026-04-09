package N;

/* renamed from: N.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3354x0 {

    /* renamed from: a, reason: collision with root package name */
    private final float f14844a;

    /* renamed from: b, reason: collision with root package name */
    private final float f14845b;

    /* renamed from: c, reason: collision with root package name */
    private final float f14846c;

    public C3354x0(float f10, float f11, float f12) {
        this.f14844a = f10;
        this.f14845b = f11;
        this.f14846c = f12;
    }

    public final float a(float f10) {
        float f11 = f10 < 0.0f ? this.f14845b : this.f14846c;
        if (f11 == 0.0f) {
            return 0.0f;
        }
        float f12 = this.f14844a;
        float f13 = f10 / f12;
        if (f13 < -1.0f) {
            f13 = -1.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        return (f12 / f11) * ((float) Math.sin((f13 * 3.1415927f) / 2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3354x0)) {
            return false;
        }
        C3354x0 c3354x0 = (C3354x0) obj;
        return this.f14844a == c3354x0.f14844a && this.f14845b == c3354x0.f14845b && this.f14846c == c3354x0.f14846c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f14844a) * 31) + Float.hashCode(this.f14845b)) * 31) + Float.hashCode(this.f14846c);
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.f14844a + ", factorAtMin=" + this.f14845b + ", factorAtMax=" + this.f14846c + ')';
    }
}
