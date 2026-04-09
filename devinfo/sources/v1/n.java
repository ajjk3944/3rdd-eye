package v1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f35728c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35729d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35730e;

    /* renamed from: f, reason: collision with root package name */
    public final float f35731f;

    public n(float f10, float f11, float f12, float f13) {
        super(1);
        this.f35728c = f10;
        this.f35729d = f11;
        this.f35730e = f12;
        this.f35731f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f35728c, nVar.f35728c) == 0 && Float.compare(this.f35729d, nVar.f35729d) == 0 && Float.compare(this.f35730e, nVar.f35730e) == 0 && Float.compare(this.f35731f, nVar.f35731f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f35731f) + r5.c.d(this.f35730e, r5.c.d(this.f35729d, Float.floatToIntBits(this.f35728c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
        sb2.append(this.f35728c);
        sb2.append(", y1=");
        sb2.append(this.f35729d);
        sb2.append(", x2=");
        sb2.append(this.f35730e);
        sb2.append(", y2=");
        return r5.c.k(sb2, this.f35731f, ')');
    }
}
