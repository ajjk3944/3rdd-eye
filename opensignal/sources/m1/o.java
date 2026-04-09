package m1;

/* loaded from: classes.dex */
public final class o extends z {

    /* renamed from: c, reason: collision with root package name */
    public final float f16229c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16230d;

    public o(float f10, float f11) {
        super(1);
        this.f16229c = f10;
        this.f16230d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f16229c, oVar.f16229c) == 0 && Float.compare(this.f16230d, oVar.f16230d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16230d) + (Float.hashCode(this.f16229c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.f16229c);
        sb2.append(", y=");
        return h0.b.q(sb2, this.f16230d, ')');
    }
}
