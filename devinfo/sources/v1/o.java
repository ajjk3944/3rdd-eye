package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f35732c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35733d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35734e;

    /* renamed from: f, reason: collision with root package name */
    public final float f35735f;

    public o(float f10, float f11, float f12, float f13) {
        super(2);
        this.f35732c = f10;
        this.f35733d = f11;
        this.f35734e = f12;
        this.f35735f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f35732c, oVar.f35732c) == 0 && Float.compare(this.f35733d, oVar.f35733d) == 0 && Float.compare(this.f35734e, oVar.f35734e) == 0 && Float.compare(this.f35735f, oVar.f35735f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35735f) + r5.c.d(this.f35734e, r5.c.d(this.f35733d, Float.floatToIntBits(this.f35732c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.f35732c);
        sb2.append(", y1=");
        sb2.append(this.f35733d);
        sb2.append(", x2=");
        sb2.append(this.f35734e);
        sb2.append(", y2=");
        return r5.c.k(sb2, this.f35735f, ')');
    }
}
