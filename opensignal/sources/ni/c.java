package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f17687a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f17688b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f17689c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f17690d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f17691e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f17692f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f17693g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f17694h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f17695i;

    public c(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9) {
        this.f17687a = num;
        this.f17688b = num2;
        this.f17689c = num3;
        this.f17690d = num4;
        this.f17691e = num5;
        this.f17692f = num6;
        this.f17693g = num7;
        this.f17694h = num8;
        this.f17695i = num9;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "gsm_cid", this.f17687a);
        xu.d.Y(jSONObject, "gsm_lac", this.f17688b);
        xu.d.Y(jSONObject, "gsm_mcc", this.f17689c);
        xu.d.Y(jSONObject, "gsm_mnc", this.f17690d);
        xu.d.Y(jSONObject, "gsm_arfcn", this.f17691e);
        xu.d.Y(jSONObject, "gsm_bsic", this.f17692f);
        xu.d.Y(jSONObject, "gsm_asu", this.f17693g);
        xu.d.Y(jSONObject, "gsm_dbm", this.f17694h);
        xu.d.Y(jSONObject, "gsm_level", this.f17695i);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return br.l.a(this.f17687a, cVar.f17687a) && br.l.a(this.f17688b, cVar.f17688b) && br.l.a(this.f17689c, cVar.f17689c) && br.l.a(this.f17690d, cVar.f17690d) && br.l.a(this.f17691e, cVar.f17691e) && br.l.a(this.f17692f, cVar.f17692f) && br.l.a(this.f17693g, cVar.f17693g) && br.l.a(this.f17694h, cVar.f17694h) && br.l.a(this.f17695i, cVar.f17695i);
    }

    public final int hashCode() {
        Integer num = this.f17687a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f17688b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f17689c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f17690d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f17691e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f17692f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f17693g;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f17694h;
        int iHashCode8 = (iHashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f17695i;
        return iHashCode8 + (num9 != null ? num9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CellInfoGsmCoreResult(gsmCid=");
        sb2.append(this.f17687a);
        sb2.append(", gsmLac=");
        sb2.append(this.f17688b);
        sb2.append(", gsmMcc=");
        sb2.append(this.f17689c);
        sb2.append(", gsmMnc=");
        sb2.append(this.f17690d);
        sb2.append(", gsmArfcn=");
        sb2.append(this.f17691e);
        sb2.append(", gsmBsic=");
        sb2.append(this.f17692f);
        sb2.append(", gsmAsu=");
        sb2.append(this.f17693g);
        sb2.append(", gsmDbm=");
        sb2.append(this.f17694h);
        sb2.append(", gsmLevel=");
        return w.g.i(sb2, this.f17695i, ')');
    }
}
