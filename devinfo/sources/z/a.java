package z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f37791a;

    /* renamed from: b, reason: collision with root package name */
    public final float f37792b;

    public a(float f10, float f11) {
        this.f37791a = f10;
        this.f37792b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f37791a, aVar.f37791a) == 0 && Float.compare(this.f37792b, aVar.f37792b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f37792b) + (Float.floatToIntBits(this.f37791a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb2.append(this.f37791a);
        sb2.append(", velocityCoefficient=");
        return r5.c.k(sb2, this.f37792b, ')');
    }
}
