package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f35758c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35759d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35760e;

    /* renamed from: f, reason: collision with root package name */
    public final float f35761f;

    public w(float f10, float f11, float f12, float f13) {
        super(2);
        this.f35758c = f10;
        this.f35759d = f11;
        this.f35760e = f12;
        this.f35761f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f35758c, wVar.f35758c) == 0 && Float.compare(this.f35759d, wVar.f35759d) == 0 && Float.compare(this.f35760e, wVar.f35760e) == 0 && Float.compare(this.f35761f, wVar.f35761f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35761f) + r5.c.d(this.f35760e, r5.c.d(this.f35759d, Float.floatToIntBits(this.f35758c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb2.append(this.f35758c);
        sb2.append(", dy1=");
        sb2.append(this.f35759d);
        sb2.append(", dx2=");
        sb2.append(this.f35760e);
        sb2.append(", dy2=");
        return r5.c.k(sb2, this.f35761f, ')');
    }
}
