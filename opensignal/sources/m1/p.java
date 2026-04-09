package m1;

/* loaded from: classes.dex */
public final class p extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16231c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16232d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16233e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16234f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16235g;

    /* renamed from: h, reason: collision with root package name */
    public final float f16236h;

    /* renamed from: i, reason: collision with root package name */
    public final float f16237i;

    public p(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        super(3);
        this.f16231c = f10;
        this.f16232d = f11;
        this.f16233e = f12;
        this.f16234f = z10;
        this.f16235g = z11;
        this.f16236h = f13;
        this.f16237i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f16231c, pVar.f16231c) == 0 && Float.compare(this.f16232d, pVar.f16232d) == 0 && Float.compare(this.f16233e, pVar.f16233e) == 0 && this.f16234f == pVar.f16234f && this.f16235g == pVar.f16235g && Float.compare(this.f16236h, pVar.f16236h) == 0 && Float.compare(this.f16237i, pVar.f16237i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16237i) + w.g.a(w.g.b(w.g.b(w.g.a(w.g.a(Float.hashCode(this.f16231c) * 31, this.f16232d, 31), this.f16233e, 31), this.f16234f, 31), this.f16235g, 31), this.f16236h, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb2.append(this.f16231c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f16232d);
        sb2.append(", theta=");
        sb2.append(this.f16233e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f16234f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f16235g);
        sb2.append(", arcStartDx=");
        sb2.append(this.f16236h);
        sb2.append(", arcStartDy=");
        return h0.b.q(sb2, this.f16237i, ')');
    }
}
