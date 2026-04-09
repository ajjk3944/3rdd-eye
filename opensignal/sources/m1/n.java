package m1;

/* loaded from: classes.dex */
public final class n extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16225c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16226d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16227e;

    /* renamed from: f, reason: collision with root package name */
    public final float f16228f;

    public n(float f10, float f11, float f12, float f13) {
        super(2);
        this.f16225c = f10;
        this.f16226d = f11;
        this.f16227e = f12;
        this.f16228f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f16225c, nVar.f16225c) == 0 && Float.compare(this.f16226d, nVar.f16226d) == 0 && Float.compare(this.f16227e, nVar.f16227e) == 0 && Float.compare(this.f16228f, nVar.f16228f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16228f) + w.g.a(w.g.a(Float.hashCode(this.f16225c) * 31, this.f16226d, 31), this.f16227e, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f16225c);
        sb2.append(", y1=");
        sb2.append(this.f16226d);
        sb2.append(", x2=");
        sb2.append(this.f16227e);
        sb2.append(", y2=");
        return h0.b.q(sb2, this.f16228f, ')');
    }
}
