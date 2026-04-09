package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f35695c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35696d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35697e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f35698f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final float f35699h;

    /* renamed from: i, reason: collision with root package name */
    public final float f35700i;

    public h(float f10, float f11, float f12, boolean z3, boolean z10, float f13, float f14) {
        super(3);
        this.f35695c = f10;
        this.f35696d = f11;
        this.f35697e = f12;
        this.f35698f = z3;
        this.g = z10;
        this.f35699h = f13;
        this.f35700i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.f35695c, hVar.f35695c) == 0 && Float.compare(this.f35696d, hVar.f35696d) == 0 && Float.compare(this.f35697e, hVar.f35697e) == 0 && this.f35698f == hVar.f35698f && this.g == hVar.g && Float.compare(this.f35699h, hVar.f35699h) == 0 && Float.compare(this.f35700i, hVar.f35700i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35700i) + r5.c.d(this.f35699h, (((r5.c.d(this.f35697e, r5.c.d(this.f35696d, Float.floatToIntBits(this.f35695c) * 31, 31), 31) + (this.f35698f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f35695c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f35696d);
        sb2.append(", theta=");
        sb2.append(this.f35697e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f35698f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.g);
        sb2.append(", arcStartX=");
        sb2.append(this.f35699h);
        sb2.append(", arcStartY=");
        return r5.c.k(sb2, this.f35700i, ')');
    }
}
