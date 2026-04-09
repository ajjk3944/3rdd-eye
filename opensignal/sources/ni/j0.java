package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17955a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17956b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17957c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17958d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f17959e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f17960f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17961g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17962h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f17963i;
    public final String j;

    public j0(boolean z10, String str, String str2, boolean z11, Integer num, Boolean bool, String str3, String str4, Long l10, String str5) {
        this.f17955a = z10;
        this.f17956b = str;
        this.f17957c = str2;
        this.f17958d = z11;
        this.f17959e = num;
        this.f17960f = bool;
        this.f17961g = str3;
        this.f17962h = str4;
        this.f17963i = l10;
        this.j = str5;
    }

    public final String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_manual", this.f17955a);
        xu.d.Y(jSONObject, "operator_alpha_long", this.f17956b);
        xu.d.Y(jSONObject, "operator_numeric", this.f17957c);
        jSONObject.put("is_roaming", this.f17958d);
        xu.d.Y(jSONObject, "state", this.f17959e);
        xu.d.Y(jSONObject, "is_using_carrier_aggregation", this.f17960f);
        xu.d.Y(jSONObject, "service_state_content", this.f17961g);
        xu.d.Y(jSONObject, "cell_bandwidths", this.f17962h);
        xu.d.Y(jSONObject, "service_state_update_time", this.f17963i);
        xu.d.Y(jSONObject, "network_registration_info", this.j);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f17955a == j0Var.f17955a && br.l.a(this.f17956b, j0Var.f17956b) && br.l.a(this.f17957c, j0Var.f17957c) && this.f17958d == j0Var.f17958d && br.l.a(this.f17959e, j0Var.f17959e) && br.l.a(this.f17960f, j0Var.f17960f) && br.l.a(this.f17961g, j0Var.f17961g) && br.l.a(this.f17962h, j0Var.f17962h) && br.l.a(this.f17963i, j0Var.f17963i) && br.l.a(this.j, j0Var.j);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f17955a) * 31;
        String str = this.f17956b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17957c;
        int iB = w.g.b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, this.f17958d, 31);
        Integer num = this.f17959e;
        int iHashCode3 = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f17960f;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f17961g;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17962h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l10 = this.f17963i;
        int iHashCode7 = (iHashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str5 = this.j;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceStateCoreResult(isManual=");
        sb2.append(this.f17955a);
        sb2.append(", operatorAlphaLong=");
        sb2.append(this.f17956b);
        sb2.append(", operatorNumeric=");
        sb2.append(this.f17957c);
        sb2.append(", isRoaming=");
        sb2.append(this.f17958d);
        sb2.append(", state=");
        sb2.append(this.f17959e);
        sb2.append(", isUsingCarrierAggregation=");
        sb2.append(this.f17960f);
        sb2.append(", serviceStateContent=");
        sb2.append(this.f17961g);
        sb2.append(", cellBandwidths=");
        sb2.append(this.f17962h);
        sb2.append(", serviceStateUpdateTime=");
        sb2.append(this.f17963i);
        sb2.append(", networkRegistrationInfo=");
        return h0.b.r(sb2, this.j, ')');
    }
}
