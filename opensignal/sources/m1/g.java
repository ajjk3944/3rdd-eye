package m1;

/* loaded from: classes.dex */
public final class g extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16196c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16197d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16198e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16199f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16200g;

    /* renamed from: h, reason: collision with root package name */
    public final float f16201h;

    /* renamed from: i, reason: collision with root package name */
    public final float f16202i;

    public g(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        super(3);
        this.f16196c = f10;
        this.f16197d = f11;
        this.f16198e = f12;
        this.f16199f = z10;
        this.f16200g = z11;
        this.f16201h = f13;
        this.f16202i = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f16196c, gVar.f16196c) == 0 && Float.compare(this.f16197d, gVar.f16197d) == 0 && Float.compare(this.f16198e, gVar.f16198e) == 0 && this.f16199f == gVar.f16199f && this.f16200g == gVar.f16200g && Float.compare(this.f16201h, gVar.f16201h) == 0 && Float.compare(this.f16202i, gVar.f16202i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16202i) + w.g.a(w.g.b(w.g.b(w.g.a(w.g.a(Float.hashCode(this.f16196c) * 31, this.f16197d, 31), this.f16198e, 31), this.f16199f, 31), this.f16200g, 31), this.f16201h, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.f16196c);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.f16197d);
        sb2.append(", theta=");
        sb2.append(this.f16198e);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.f16199f);
        sb2.append(", isPositiveArc=");
        sb2.append(this.f16200g);
        sb2.append(", arcStartX=");
        sb2.append(this.f16201h);
        sb2.append(", arcStartY=");
        return h0.b.q(sb2, this.f16202i, ')');
    }
}
