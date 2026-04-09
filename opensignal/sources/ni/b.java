package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f17658a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f17659b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f17660c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f17661d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f17662e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f17663f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f17664g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f17665h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f17666i;
    public final Integer j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f17667l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f17668m;

    public b(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13) {
        this.f17658a = num;
        this.f17659b = num2;
        this.f17660c = num3;
        this.f17661d = num4;
        this.f17662e = num5;
        this.f17663f = num6;
        this.f17664g = num7;
        this.f17665h = num8;
        this.f17666i = num9;
        this.j = num10;
        this.k = num11;
        this.f17667l = num12;
        this.f17668m = num13;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "cdma_bsid", this.f17658a);
        xu.d.Y(jSONObject, "cdma_sys_id", this.f17659b);
        xu.d.Y(jSONObject, "cdma_net_id", this.f17660c);
        xu.d.Y(jSONObject, "cdma_lat", this.f17661d);
        xu.d.Y(jSONObject, "cdma_lng", this.f17662e);
        xu.d.Y(jSONObject, "cdma_asu", this.f17663f);
        xu.d.Y(jSONObject, "cdma_dbm", this.f17664g);
        xu.d.Y(jSONObject, "cdma_ecio", this.f17665h);
        xu.d.Y(jSONObject, "cdma_level", this.f17666i);
        xu.d.Y(jSONObject, "cdma_evdo_dbm", this.j);
        xu.d.Y(jSONObject, "cdma_evdo_ecio", this.k);
        xu.d.Y(jSONObject, "cdma_evdo_level", this.f17667l);
        xu.d.Y(jSONObject, "cdma_evdo_snr", this.f17668m);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return br.l.a(this.f17658a, bVar.f17658a) && br.l.a(this.f17659b, bVar.f17659b) && br.l.a(this.f17660c, bVar.f17660c) && br.l.a(this.f17661d, bVar.f17661d) && br.l.a(this.f17662e, bVar.f17662e) && br.l.a(this.f17663f, bVar.f17663f) && br.l.a(this.f17664g, bVar.f17664g) && br.l.a(this.f17665h, bVar.f17665h) && br.l.a(this.f17666i, bVar.f17666i) && br.l.a(this.j, bVar.j) && br.l.a(this.k, bVar.k) && br.l.a(this.f17667l, bVar.f17667l) && br.l.a(this.f17668m, bVar.f17668m);
    }

    public final int hashCode() {
        Integer num = this.f17658a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f17659b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f17660c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f17661d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f17662e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f17663f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f17664g;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f17665h;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f17666i;
        int iHashCode9 = (iHashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.j;
        int iHashCode10 = (iHashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.k;
        int iHashCode11 = (iHashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.f17667l;
        int iHashCode12 = (iHashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.f17668m;
        return iHashCode12 + (num13 != null ? num13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CellInfoCdmaCoreResult(cdmaBsid=");
        sb2.append(this.f17658a);
        sb2.append(", cdmaSysId=");
        sb2.append(this.f17659b);
        sb2.append(", cdmaNetId=");
        sb2.append(this.f17660c);
        sb2.append(", cdmaLat=");
        sb2.append(this.f17661d);
        sb2.append(", cdmaLng=");
        sb2.append(this.f17662e);
        sb2.append(", cdmaAsu=");
        sb2.append(this.f17663f);
        sb2.append(", cdmaDbm=");
        sb2.append(this.f17664g);
        sb2.append(", cdmaEcio=");
        sb2.append(this.f17665h);
        sb2.append(", cdmaLevel=");
        sb2.append(this.f17666i);
        sb2.append(", cdmaEvdoDbm=");
        sb2.append(this.j);
        sb2.append(", cdmaEvdoEcio=");
        sb2.append(this.k);
        sb2.append(", cdmaEvdoLevel=");
        sb2.append(this.f17667l);
        sb2.append(", cdmaEvdoSnr=");
        return w.g.i(sb2, this.f17668m, ')');
    }
}
