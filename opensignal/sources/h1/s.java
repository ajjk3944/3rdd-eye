package h1;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final float f9756a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9757b;

    public s(float f10, float f11) {
        this.f9756a = f10;
        this.f9757b = f11;
    }

    public final float[] a() {
        float f10 = this.f9756a;
        float f11 = this.f9757b;
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
        return Float.compare(this.f9756a, sVar.f9756a) == 0 && Float.compare(this.f9757b, sVar.f9757b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9757b) + (Float.hashCode(this.f9756a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f9756a);
        sb2.append(", y=");
        return h0.b.q(sb2, this.f9757b, ')');
    }
}
