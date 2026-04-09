package m1;

/* loaded from: classes.dex */
public final class q extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16238c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16239d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16240e;

    /* renamed from: f, reason: collision with root package name */
    public final float f16241f;

    /* renamed from: g, reason: collision with root package name */
    public final float f16242g;

    /* renamed from: h, reason: collision with root package name */
    public final float f16243h;

    public q(float f10, float f11, float f12, float f13, float f14, float f15) {
        super(2);
        this.f16238c = f10;
        this.f16239d = f11;
        this.f16240e = f12;
        this.f16241f = f13;
        this.f16242g = f14;
        this.f16243h = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f16238c, qVar.f16238c) == 0 && Float.compare(this.f16239d, qVar.f16239d) == 0 && Float.compare(this.f16240e, qVar.f16240e) == 0 && Float.compare(this.f16241f, qVar.f16241f) == 0 && Float.compare(this.f16242g, qVar.f16242g) == 0 && Float.compare(this.f16243h, qVar.f16243h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16243h) + w.g.a(w.g.a(w.g.a(w.g.a(Float.hashCode(this.f16238c) * 31, this.f16239d, 31), this.f16240e, 31), this.f16241f, 31), this.f16242g, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
        sb2.append(this.f16238c);
        sb2.append(", dy1=");
        sb2.append(this.f16239d);
        sb2.append(", dx2=");
        sb2.append(this.f16240e);
        sb2.append(", dy2=");
        sb2.append(this.f16241f);
        sb2.append(", dx3=");
        sb2.append(this.f16242g);
        sb2.append(", dy3=");
        return h0.b.q(sb2, this.f16243h, ')');
    }
}
