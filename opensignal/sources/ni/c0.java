package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Double f17696a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f17697b;

    /* renamed from: c, reason: collision with root package name */
    public final Double f17698c;

    /* renamed from: d, reason: collision with root package name */
    public final Double f17699d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f17700e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f17701f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f17702g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f17703h;

    /* renamed from: i, reason: collision with root package name */
    public final String f17704i;
    public final Double j;
    public final Float k;

    /* renamed from: l, reason: collision with root package name */
    public final Float f17705l;

    public c0(Double d6, Double d10, Double d11, Double d12, Long l10, Boolean bool, Double d13, Long l11, String str, Double d14, Float f10, Float f11) {
        this.f17696a = d6;
        this.f17697b = d10;
        this.f17698c = d11;
        this.f17699d = d12;
        this.f17700e = l10;
        this.f17701f = bool;
        this.f17702g = d13;
        this.f17703h = l11;
        this.f17704i = str;
        this.j = d14;
        this.k = f10;
        this.f17705l = f11;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "altitude", this.f17696a);
        xu.d.Y(jSONObject, "latitude", this.f17697b);
        xu.d.Y(jSONObject, "longitude", this.f17698c);
        xu.d.Y(jSONObject, "accuracy", this.f17699d);
        xu.d.Y(jSONObject, "age", this.f17700e);
        xu.d.Y(jSONObject, "mocking_enabled", this.f17701f);
        xu.d.Y(jSONObject, "speed", this.f17702g);
        xu.d.Y(jSONObject, "time", this.f17703h);
        xu.d.Y(jSONObject, "provider", this.f17704i);
        xu.d.Y(jSONObject, "msl_altitude_meters", this.j);
        xu.d.Y(jSONObject, "msl_altitude_accuracy_meters", this.k);
        xu.d.Y(jSONObject, "altitude_accuracy_meters", this.f17705l);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return br.l.a(this.f17696a, c0Var.f17696a) && br.l.a(this.f17697b, c0Var.f17697b) && br.l.a(this.f17698c, c0Var.f17698c) && br.l.a(this.f17699d, c0Var.f17699d) && br.l.a(this.f17700e, c0Var.f17700e) && br.l.a(this.f17701f, c0Var.f17701f) && br.l.a(this.f17702g, c0Var.f17702g) && br.l.a(this.f17703h, c0Var.f17703h) && br.l.a(this.f17704i, c0Var.f17704i) && br.l.a(this.j, c0Var.j) && br.l.a(this.k, c0Var.k) && br.l.a(this.f17705l, c0Var.f17705l);
    }

    public final int hashCode() {
        Double d6 = this.f17696a;
        int iHashCode = (d6 == null ? 0 : d6.hashCode()) * 31;
        Double d10 = this.f17697b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f17698c;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f17699d;
        int iHashCode4 = (iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Long l10 = this.f17700e;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool = this.f17701f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d13 = this.f17702g;
        int iHashCode7 = (iHashCode6 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Long l11 = this.f17703h;
        int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.f17704i;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Double d14 = this.j;
        int iHashCode10 = (iHashCode9 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Float f10 = this.k;
        int iHashCode11 = (iHashCode10 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f17705l;
        return iHashCode11 + (f11 != null ? f11.hashCode() : 0);
    }

    public final String toString() {
        return "LocationCoreResult(altitude=" + this.f17696a + ", latitude=" + this.f17697b + ", longitude=" + this.f17698c + ", accuracy=" + this.f17699d + ", age=" + this.f17700e + ", mockingEnabled=" + this.f17701f + ", speed=" + this.f17702g + ", time=" + this.f17703h + ", provider=" + this.f17704i + ", mslAltitudeMeters=" + this.j + ", mslAltitudeAccuracyMeters=" + this.k + ", altitudeAccuracyMeters=" + this.f17705l + ')';
    }
}
