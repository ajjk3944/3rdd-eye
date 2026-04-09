package sm;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22102a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22103b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22104c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22105d;

    /* renamed from: e, reason: collision with root package name */
    public final double f22106e;

    /* renamed from: f, reason: collision with root package name */
    public final double f22107f;

    public a(String str, String str2, String str3, String str4, double d6, double d10) {
        br.l.e(str2, "name");
        br.l.e(str3, "asciiName");
        br.l.e(str4, "region");
        this.f22102a = str;
        this.f22103b = str2;
        this.f22104c = str3;
        this.f22105d = str4;
        this.f22106e = d6;
        this.f22107f = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return br.l.a(this.f22102a, aVar.f22102a) && br.l.a(this.f22103b, aVar.f22103b) && br.l.a(this.f22104c, aVar.f22104c) && br.l.a(this.f22105d, aVar.f22105d) && Double.compare(this.f22106e, aVar.f22106e) == 0 && Double.compare(this.f22107f, aVar.f22107f) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f22107f) + h0.b.a(this.f22106e, c7.a.g(this.f22105d, c7.a.g(this.f22104c, c7.a.g(this.f22103b, this.f22102a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "City(countryName=" + this.f22102a + ", name=" + this.f22103b + ", asciiName=" + this.f22104c + ", region=" + this.f22105d + ", latitude=" + this.f22106e + ", longitude=" + this.f22107f + ')';
    }
}
