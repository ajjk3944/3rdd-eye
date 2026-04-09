package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f35736c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35737d;

    public p(float f10, float f11) {
        super(1);
        this.f35736c = f10;
        this.f35737d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f35736c, pVar.f35736c) == 0 && Float.compare(this.f35737d, pVar.f35737d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35737d) + (Float.floatToIntBits(this.f35736c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f35736c);
        sb2.append(", y=");
        return r5.c.k(sb2, this.f35737d, ')');
    }
}
