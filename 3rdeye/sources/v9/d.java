package v9;

/* compiled from: Ranges.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f47095a;

    public d(float f10) {
        this.f47095a = f10;
    }

    public final boolean a(Float f10) {
        float fFloatValue = f10.floatValue();
        return fFloatValue >= 0.0f && fFloatValue <= this.f47095a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        float f10 = this.f47095a;
        if (0.0f > f10 && 0.0f > ((d) obj).f47095a) {
            return true;
        }
        d dVar = (d) obj;
        dVar.getClass();
        return f10 == dVar.f47095a;
    }

    public final int hashCode() {
        float f10 = this.f47095a;
        if (0.0f > f10) {
            return -1;
        }
        return Float.floatToIntBits(f10) + (Float.floatToIntBits(0.0f) * 31);
    }

    public final String toString() {
        return "0.0.." + this.f47095a;
    }
}
