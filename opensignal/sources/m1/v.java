package m1;

/* loaded from: classes.dex */
public final class v extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16253c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16254d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16255e;

    /* renamed from: f, reason: collision with root package name */
    public final float f16256f;

    public v(float f10, float f11, float f12, float f13) {
        super(2);
        this.f16253c = f10;
        this.f16254d = f11;
        this.f16255e = f12;
        this.f16256f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f16253c, vVar.f16253c) == 0 && Float.compare(this.f16254d, vVar.f16254d) == 0 && Float.compare(this.f16255e, vVar.f16255e) == 0 && Float.compare(this.f16256f, vVar.f16256f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16256f) + w.g.a(w.g.a(Float.hashCode(this.f16253c) * 31, this.f16254d, 31), this.f16255e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f16253c);
        sb2.append(", dy1=");
        sb2.append(this.f16254d);
        sb2.append(", dx2=");
        sb2.append(this.f16255e);
        sb2.append(", dy2=");
        return h0.b.q(sb2, this.f16256f, ')');
    }
}
