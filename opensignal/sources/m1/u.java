package m1;

/* loaded from: classes.dex */
public final class u extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16249c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16250d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16251e;

    /* renamed from: f, reason: collision with root package name */
    public final float f16252f;

    public u(float f10, float f11, float f12, float f13) {
        super(1);
        this.f16249c = f10;
        this.f16250d = f11;
        this.f16251e = f12;
        this.f16252f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f16249c, uVar.f16249c) == 0 && Float.compare(this.f16250d, uVar.f16250d) == 0 && Float.compare(this.f16251e, uVar.f16251e) == 0 && Float.compare(this.f16252f, uVar.f16252f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16252f) + w.g.a(w.g.a(Float.hashCode(this.f16249c) * 31, this.f16250d, 31), this.f16251e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f16249c);
        sb2.append(", dy1=");
        sb2.append(this.f16250d);
        sb2.append(", dx2=");
        sb2.append(this.f16251e);
        sb2.append(", dy2=");
        return h0.b.q(sb2, this.f16252f, ')');
    }
}
