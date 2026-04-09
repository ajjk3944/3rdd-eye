package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f35706c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35707d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35708e;

    /* renamed from: f, reason: collision with root package name */
    public final float f35709f;
    public final float g;

    /* renamed from: h, reason: collision with root package name */
    public final float f35710h;

    public j(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f35706c = f10;
        this.f35707d = f11;
        this.f35708e = f12;
        this.f35709f = f13;
        this.g = f14;
        this.f35710h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f35706c, jVar.f35706c) == 0 && Float.compare(this.f35707d, jVar.f35707d) == 0 && Float.compare(this.f35708e, jVar.f35708e) == 0 && Float.compare(this.f35709f, jVar.f35709f) == 0 && Float.compare(this.g, jVar.g) == 0 && Float.compare(this.f35710h, jVar.f35710h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35710h) + r5.c.d(this.g, r5.c.d(this.f35709f, r5.c.d(this.f35708e, r5.c.d(this.f35707d, Float.floatToIntBits(this.f35706c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f35706c);
        sb2.append(", y1=");
        sb2.append(this.f35707d);
        sb2.append(", x2=");
        sb2.append(this.f35708e);
        sb2.append(", y2=");
        sb2.append(this.f35709f);
        sb2.append(", x3=");
        sb2.append(this.g);
        sb2.append(", y3=");
        return r5.c.k(sb2, this.f35710h, ')');
    }
}
