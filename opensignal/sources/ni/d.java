package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f17729a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f17730b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f17731c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f17732d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f17733e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f17734f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f17735g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f17736h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f17737i;
    public final Integer j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f17738l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f17739m;

    public d(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13) {
        this.f17729a = num;
        this.f17730b = num2;
        this.f17731c = num3;
        this.f17732d = num4;
        this.f17733e = num5;
        this.f17734f = num6;
        this.f17735g = num7;
        this.f17736h = num8;
        this.f17737i = num9;
        this.j = num10;
        this.k = num11;
        this.f17738l = num12;
        this.f17739m = num13;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "lte_ci", this.f17729a);
        xu.d.Y(jSONObject, "lte_pci", this.f17730b);
        xu.d.Y(jSONObject, "lte_mnc", this.f17732d);
        xu.d.Y(jSONObject, "lte_tac", this.f17731c);
        xu.d.Y(jSONObject, "lte_mcc", this.f17733e);
        xu.d.Y(jSONObject, "lte_earfcn", this.f17734f);
        xu.d.Y(jSONObject, "lte_asu", this.f17735g);
        xu.d.Y(jSONObject, "lte_dbm", this.f17736h);
        xu.d.Y(jSONObject, "lte_level", this.f17737i);
        xu.d.Y(jSONObject, "lte_rsrq", this.j);
        xu.d.Y(jSONObject, "lte_rssnr", this.k);
        xu.d.Y(jSONObject, "lte_timing_advance", this.f17738l);
        xu.d.Y(jSONObject, "lte_cell_info_connection_status", this.f17739m);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return br.l.a(this.f17729a, dVar.f17729a) && br.l.a(this.f17730b, dVar.f17730b) && br.l.a(this.f17731c, dVar.f17731c) && br.l.a(this.f17732d, dVar.f17732d) && br.l.a(this.f17733e, dVar.f17733e) && br.l.a(this.f17734f, dVar.f17734f) && br.l.a(this.f17735g, dVar.f17735g) && br.l.a(this.f17736h, dVar.f17736h) && br.l.a(this.f17737i, dVar.f17737i) && br.l.a(this.j, dVar.j) && br.l.a(this.k, dVar.k) && br.l.a(this.f17738l, dVar.f17738l) && br.l.a(this.f17739m, dVar.f17739m);
    }

    public final int hashCode() {
        Integer num = this.f17729a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f17730b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f17731c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f17732d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f17733e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f17734f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f17735g;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f17736h;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f17737i;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.j;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.k;
        int iHashCode11 = (iHashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.f17738l;
        int iHashCode12 = (iHashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.f17739m;
        return iHashCode12 + (num13 != null ? num13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CellInfoLteCoreResult(lteCi=");
        sb2.append(this.f17729a);
        sb2.append(", ltePci=");
        sb2.append(this.f17730b);
        sb2.append(", lteTac=");
        sb2.append(this.f17731c);
        sb2.append(", lteMnc=");
        sb2.append(this.f17732d);
        sb2.append(", lteMcc=");
        sb2.append(this.f17733e);
        sb2.append(", lteEarfcn=");
        sb2.append(this.f17734f);
        sb2.append(", lteAsu=");
        sb2.append(this.f17735g);
        sb2.append(", lteDbm=");
        sb2.append(this.f17736h);
        sb2.append(", lteLevel=");
        sb2.append(this.f17737i);
        sb2.append(", lteRsrq=");
        sb2.append(this.j);
        sb2.append(", lteRssnr=");
        sb2.append(this.k);
        sb2.append(", lteTimingAdvance=");
        sb2.append(this.f17738l);
        sb2.append(", lteCellInfoConnectionStatus=");
        return w.g.i(sb2, this.f17739m, ')');
    }
}
