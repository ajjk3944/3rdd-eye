package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f35738c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35739d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35740e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f35741f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final float f35742h;

    /* renamed from: i, reason: collision with root package name */
    public final float f35743i;

    public q(float f10, float f11, float f12, boolean z3, boolean z10, float f13, float f14) {
        super(3);
        this.f35738c = f10;
        this.f35739d = f11;
        this.f35740e = f12;
        this.f35741f = z3;
        this.g = z10;
        this.f35742h = f13;
        this.f35743i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f35738c, qVar.f35738c) == 0 && Float.compare(this.f35739d, qVar.f35739d) == 0 && Float.compare(this.f35740e, qVar.f35740e) == 0 && this.f35741f == qVar.f35741f && this.g == qVar.g && Float.compare(this.f35742h, qVar.f35742h) == 0 && Float.compare(this.f35743i, qVar.f35743i) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35743i) + r5.c.d(this.f35742h, (((r5.c.d(this.f35740e, r5.c.d(this.f35739d, Float.floatToIntBits(this.f35738c) * 31, 31), 31) + (this.f35741f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f35738c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f35739d);
        sb2.append(", theta=");
        sb2.append(this.f35740e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f35741f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f35742h);
        sb2.append(", arcStartDy=");
        return r5.c.k(sb2, this.f35743i, ')');
    }
}
