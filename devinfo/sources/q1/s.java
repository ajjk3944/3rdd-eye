package q1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final float f32142a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32143b;

    public s(float f10, float f11) {
        this.f32142a = f10;
        this.f32143b = f11;
    }

    public final float[] a() {
        float f10 = this.f32142a;
        float f11 = this.f32143b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f32142a, sVar.f32142a) == 0 && Float.compare(this.f32143b, sVar.f32143b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f32143b) + (Float.floatToIntBits(this.f32142a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f32142a);
        sb2.append(", y=");
        return r5.c.k(sb2, this.f32143b, ')');
    }
}
