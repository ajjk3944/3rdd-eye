package tm;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f22882a;

    /* renamed from: b, reason: collision with root package name */
    public final double f22883b;

    /* renamed from: c, reason: collision with root package name */
    public final double f22884c;

    /* renamed from: d, reason: collision with root package name */
    public final double f22885d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22886e;

    public a(double d6, double d10, double d11, double d12, int i10) {
        this.f22882a = d6;
        this.f22883b = d10;
        this.f22884c = d11;
        this.f22885d = d12;
        this.f22886e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Double.compare(this.f22882a, aVar.f22882a) == 0 && Double.compare(this.f22883b, aVar.f22883b) == 0 && Double.compare(this.f22884c, aVar.f22884c) == 0 && Double.compare(this.f22885d, aVar.f22885d) == 0 && this.f22886e == aVar.f22886e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22886e) + h0.b.a(this.f22885d, h0.b.a(this.f22884c, h0.b.a(this.f22883b, Double.hashCode(this.f22882a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoundingBox(maxLat=");
        sb2.append(this.f22882a);
        sb2.append(", maxLng=");
        sb2.append(this.f22883b);
        sb2.append(", minLat=");
        sb2.append(this.f22884c);
        sb2.append(", minLng=");
        sb2.append(this.f22885d);
        sb2.append(", zoom=");
        return c7.a.q(sb2, this.f22886e, ')');
    }
}
