package N;

import a1.AbstractC3751b;

/* loaded from: classes.dex */
public final class Y implements b1 {

    /* renamed from: a, reason: collision with root package name */
    private final float f14198a;

    public Y(float f10) {
        this.f14198a = f10;
    }

    @Override // N.b1
    public float a(Y0.d dVar, float f10, float f11) {
        return AbstractC3751b.b(f10, f11, this.f14198a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y) && Float.compare(this.f14198a, ((Y) obj).f14198a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f14198a);
    }

    public String toString() {
        return "FractionalThreshold(fraction=" + this.f14198a + ')';
    }
}
