package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f17764a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f17765b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f17766c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f17767d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f17768e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f17769f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f17770g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f17771h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f17772i;

    public e(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9) {
        this.f17764a = num;
        this.f17765b = num2;
        this.f17766c = num3;
        this.f17767d = num4;
        this.f17768e = num5;
        this.f17769f = num6;
        this.f17770g = num7;
        this.f17771h = num8;
        this.f17772i = num9;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "wcdma_cid", this.f17764a);
        xu.d.Y(jSONObject, "wcdma_lac", this.f17765b);
        xu.d.Y(jSONObject, "wcdma_mcc", this.f17766c);
        xu.d.Y(jSONObject, "wcdma_mnc", this.f17767d);
        xu.d.Y(jSONObject, "wcdma_psc", this.f17768e);
        xu.d.Y(jSONObject, "wcdma_uarfcn", this.f17769f);
        xu.d.Y(jSONObject, "cs_wcdma_asu", this.f17770g);
        xu.d.Y(jSONObject, "cs_wcdma_dbm", this.f17771h);
        xu.d.Y(jSONObject, "cs_wcdma_level", this.f17772i);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return br.l.a(this.f17764a, eVar.f17764a) && br.l.a(this.f17765b, eVar.f17765b) && br.l.a(this.f17766c, eVar.f17766c) && br.l.a(this.f17767d, eVar.f17767d) && br.l.a(this.f17768e, eVar.f17768e) && br.l.a(this.f17769f, eVar.f17769f) && br.l.a(this.f17770g, eVar.f17770g) && br.l.a(this.f17771h, eVar.f17771h) && br.l.a(this.f17772i, eVar.f17772i);
    }

    public final int hashCode() {
        Integer num = this.f17764a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f17765b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f17766c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f17767d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f17768e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f17769f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f17770g;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f17771h;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f17772i;
        return iHashCode8 + (num9 != null ? num9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CellInfoWcdmaCoreResult(wcdmaCid=");
        sb2.append(this.f17764a);
        sb2.append(", wcdmaLac=");
        sb2.append(this.f17765b);
        sb2.append(", wcdmaMcc=");
        sb2.append(this.f17766c);
        sb2.append(", wcdmaMnc=");
        sb2.append(this.f17767d);
        sb2.append(", wcdmaPsc=");
        sb2.append(this.f17768e);
        sb2.append(", wcdmaUarfcn=");
        sb2.append(this.f17769f);
        sb2.append(", wcdmaAsu=");
        sb2.append(this.f17770g);
        sb2.append(", wcdmaDbm=");
        sb2.append(this.f17771h);
        sb2.append(", wcdmaLevel=");
        return w.g.i(sb2, this.f17772i, ')');
    }
}
