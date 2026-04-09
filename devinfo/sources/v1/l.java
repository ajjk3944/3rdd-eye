package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f35724c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35725d;

    public l(float f10, float f11) {
        super(3);
        this.f35724c = f10;
        this.f35725d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f35724c, lVar.f35724c) == 0 && Float.compare(this.f35725d, lVar.f35725d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35725d) + (Float.floatToIntBits(this.f35724c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f35724c);
        sb2.append(", y=");
        return r5.c.k(sb2, this.f35725d, ')');
    }
}
