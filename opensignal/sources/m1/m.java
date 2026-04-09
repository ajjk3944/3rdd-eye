package m1;

/* loaded from: classes.dex */
public final class m extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16221c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16222d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16223e;

    /* renamed from: f, reason: collision with root package name */
    public final float f16224f;

    public m(float f10, float f11, float f12, float f13) {
        super(1);
        this.f16221c = f10;
        this.f16222d = f11;
        this.f16223e = f12;
        this.f16224f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f16221c, mVar.f16221c) == 0 && Float.compare(this.f16222d, mVar.f16222d) == 0 && Float.compare(this.f16223e, mVar.f16223e) == 0 && Float.compare(this.f16224f, mVar.f16224f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16224f) + w.g.a(w.g.a(Float.hashCode(this.f16221c) * 31, this.f16222d, 31), this.f16223e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f16221c);
        sb2.append(", y1=");
        sb2.append(this.f16222d);
        sb2.append(", x2=");
        sb2.append(this.f16223e);
        sb2.append(", y2=");
        return h0.b.q(sb2, this.f16224f, ')');
    }
}
