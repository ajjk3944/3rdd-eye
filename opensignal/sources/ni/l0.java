package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f18006a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18007b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f18008c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18009d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f18010e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18011f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18012g;

    public l0(Integer num, String str, Integer num2, String str2, Integer num3, String str3, String str4) {
        this.f18006a = num;
        this.f18007b = str;
        this.f18008c = num2;
        this.f18009d = str2;
        this.f18010e = num3;
        this.f18011f = str3;
        this.f18012g = str4;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "sim_carrier_id", this.f18006a);
        xu.d.Y(jSONObject, "sim_carrier_name", this.f18007b);
        xu.d.Y(jSONObject, "sim_specific_carrier_id", this.f18008c);
        xu.d.Y(jSONObject, "sim_specific_carrier_name", this.f18009d);
        xu.d.Y(jSONObject, "sim_state", this.f18010e);
        xu.d.Y(jSONObject, "sim_group_id_level1", this.f18011f);
        xu.d.Y(jSONObject, "access_point_name", this.f18012g);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return br.l.a(this.f18006a, l0Var.f18006a) && br.l.a(this.f18007b, l0Var.f18007b) && br.l.a(this.f18008c, l0Var.f18008c) && br.l.a(this.f18009d, l0Var.f18009d) && br.l.a(this.f18010e, l0Var.f18010e) && br.l.a(this.f18011f, l0Var.f18011f) && br.l.a(this.f18012g, l0Var.f18012g);
    }

    public final int hashCode() {
        Integer num = this.f18006a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f18007b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f18008c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f18009d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.f18010e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.f18011f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18012g;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimCarrierCoreResult(simCarrierId=");
        sb2.append(this.f18006a);
        sb2.append(", simCarrierIdName=");
        sb2.append(this.f18007b);
        sb2.append(", simSpecificCarrierId=");
        sb2.append(this.f18008c);
        sb2.append(", simSpecificCarrierIdName=");
        sb2.append(this.f18009d);
        sb2.append(", simState=");
        sb2.append(this.f18010e);
        sb2.append(", simGroupIdLevel1=");
        sb2.append(this.f18011f);
        sb2.append(", simAccessPointName=");
        return h0.b.r(sb2, this.f18012g, ')');
    }
}
