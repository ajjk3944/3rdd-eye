package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f35744c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35745d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35746e;

    /* renamed from: f, reason: collision with root package name */
    public final float f35747f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f35748h;

    public r(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f35744c = f10;
        this.f35745d = f11;
        this.f35746e = f12;
        this.f35747f = f13;
        this.g = f14;
        this.f35748h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f35744c, rVar.f35744c) == 0 && Float.compare(this.f35745d, rVar.f35745d) == 0 && Float.compare(this.f35746e, rVar.f35746e) == 0 && Float.compare(this.f35747f, rVar.f35747f) == 0 && Float.compare(this.g, rVar.g) == 0 && Float.compare(this.f35748h, rVar.f35748h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35748h) + r5.c.d(this.g, r5.c.d(this.f35747f, r5.c.d(this.f35746e, r5.c.d(this.f35745d, Float.floatToIntBits(this.f35744c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f35744c);
        sb2.append(", dy1=");
        sb2.append(this.f35745d);
        sb2.append(", dx2=");
        sb2.append(this.f35746e);
        sb2.append(", dy2=");
        sb2.append(this.f35747f);
        sb2.append(", dx3=");
        sb2.append(this.g);
        sb2.append(", dy3=");
        return r5.c.k(sb2, this.f35748h, ')');
    }
}
