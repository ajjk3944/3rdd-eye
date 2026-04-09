package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f35754c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35755d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35756e;

    /* renamed from: f, reason: collision with root package name */
    public final float f35757f;

    public v(float f10, float f11, float f12, float f13) {
        super(1);
        this.f35754c = f10;
        this.f35755d = f11;
        this.f35756e = f12;
        this.f35757f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f35754c, vVar.f35754c) == 0 && Float.compare(this.f35755d, vVar.f35755d) == 0 && Float.compare(this.f35756e, vVar.f35756e) == 0 && Float.compare(this.f35757f, vVar.f35757f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35757f) + r5.c.d(this.f35756e, r5.c.d(this.f35755d, Float.floatToIntBits(this.f35754c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.f35754c);
        sb2.append(", dy1=");
        sb2.append(this.f35755d);
        sb2.append(", dx2=");
        sb2.append(this.f35756e);
        sb2.append(", dy2=");
        return r5.c.k(sb2, this.f35757f, ')');
    }
}
