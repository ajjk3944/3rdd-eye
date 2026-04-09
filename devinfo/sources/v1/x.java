package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f35762c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35763d;

    public x(float f10, float f11) {
        super(1);
        this.f35762c = f10;
        this.f35763d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f35762c, xVar.f35762c) == 0 && Float.compare(this.f35763d, xVar.f35763d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35763d) + (Float.floatToIntBits(this.f35762c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f35762c);
        sb2.append(", dy=");
        return r5.c.k(sb2, this.f35763d, ')');
    }
}
