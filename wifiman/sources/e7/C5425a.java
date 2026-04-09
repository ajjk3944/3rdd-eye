package e7;

/* renamed from: e7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5425a {

    /* renamed from: a, reason: collision with root package name */
    private final float f46211a;

    /* renamed from: b, reason: collision with root package name */
    private final float f46212b;

    /* renamed from: c, reason: collision with root package name */
    private final float f46213c;

    /* renamed from: d, reason: collision with root package name */
    private final float f46214d;

    public C5425a(float f10, float f11, float f12, float f13) {
        this.f46211a = f10;
        this.f46212b = f11;
        this.f46213c = f12;
        this.f46214d = f13;
    }

    public final float a() {
        return this.f46211a;
    }

    public final float b() {
        return this.f46213c;
    }

    public final float c() {
        return this.f46214d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5425a)) {
            return false;
        }
        C5425a c5425a = (C5425a) obj;
        return Float.compare(this.f46211a, c5425a.f46211a) == 0 && Float.compare(this.f46212b, c5425a.f46212b) == 0 && Float.compare(this.f46213c, c5425a.f46213c) == 0 && Float.compare(this.f46214d, c5425a.f46214d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f46211a) * 31) + Float.hashCode(this.f46212b)) * 31) + Float.hashCode(this.f46213c)) * 31) + Float.hashCode(this.f46214d);
    }

    public String toString() {
        return "ArCore2DSpacePosition(positionX=" + this.f46211a + ", positionY=" + this.f46212b + ", positionZ=" + this.f46213c + ", viewSightAngle=" + this.f46214d + ")";
    }
}
