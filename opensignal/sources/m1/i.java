package m1;

/* loaded from: classes.dex */
public final class i extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16210c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16211d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16212e;

    /* renamed from: f, reason: collision with root package name */
    public final float f16213f;

    /* renamed from: g, reason: collision with root package name */
    public final float f16214g;

    /* renamed from: h, reason: collision with root package name */
    public final float f16215h;

    public i(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f16210c = f10;
        this.f16211d = f11;
        this.f16212e = f12;
        this.f16213f = f13;
        this.f16214g = f14;
        this.f16215h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f16210c, iVar.f16210c) == 0 && Float.compare(this.f16211d, iVar.f16211d) == 0 && Float.compare(this.f16212e, iVar.f16212e) == 0 && Float.compare(this.f16213f, iVar.f16213f) == 0 && Float.compare(this.f16214g, iVar.f16214g) == 0 && Float.compare(this.f16215h, iVar.f16215h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16215h) + w.g.a(w.g.a(w.g.a(w.g.a(Float.hashCode(this.f16210c) * 31, this.f16211d, 31), this.f16212e, 31), this.f16213f, 31), this.f16214g, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.f16210c);
        sb2.append(", y1=");
        sb2.append(this.f16211d);
        sb2.append(", x2=");
        sb2.append(this.f16212e);
        sb2.append(", y2=");
        sb2.append(this.f16213f);
        sb2.append(", x3=");
        sb2.append(this.f16214g);
        sb2.append(", y3=");
        return h0.b.q(sb2, this.f16215h, ')');
    }
}
