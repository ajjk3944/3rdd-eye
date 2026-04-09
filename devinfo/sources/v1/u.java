package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f35752c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35753d;

    public u(float f10, float f11) {
        super(3);
        this.f35752c = f10;
        this.f35753d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f35752c, uVar.f35752c) == 0 && Float.compare(this.f35753d, uVar.f35753d) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35753d) + (Float.floatToIntBits(this.f35752c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f35752c);
        sb2.append(", dy=");
        return r5.c.k(sb2, this.f35753d, ')');
    }
}
