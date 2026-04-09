package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f18080a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f18081b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f18082c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f18083d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18084e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18085f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18086g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18087h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f18088i;
    public final Integer j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f18089l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f18090m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f18091n;

    /* renamed from: o, reason: collision with root package name */
    public final String f18092o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f18093p;

    /* renamed from: q, reason: collision with root package name */
    public final String f18094q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f18095r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f18096s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f18097t;

    /* renamed from: u, reason: collision with root package name */
    public final String f18098u;

    /* renamed from: v, reason: collision with root package name */
    public final String f18099v;

    /* renamed from: w, reason: collision with root package name */
    public final String f18100w;

    /* renamed from: x, reason: collision with root package name */
    public final String f18101x;

    /* renamed from: y, reason: collision with root package name */
    public final Boolean f18102y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f18103z;

    public p0(Integer num, Integer num2, Integer num3, Boolean bool, String str, String str2, String str3, String str4, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool2, Boolean bool3, String str5, Boolean bool4, String str6, Boolean bool5, Integer num8, Integer num9, String str7, String str8, String str9, String str10, Boolean bool6, Integer num10) {
        this.f18080a = num;
        this.f18081b = num2;
        this.f18082c = num3;
        this.f18083d = bool;
        this.f18084e = str;
        this.f18085f = str2;
        this.f18086g = str3;
        this.f18087h = str4;
        this.f18088i = num4;
        this.j = num5;
        this.k = num6;
        this.f18089l = num7;
        this.f18090m = bool2;
        this.f18091n = bool3;
        this.f18092o = str5;
        this.f18093p = bool4;
        this.f18094q = str6;
        this.f18095r = bool5;
        this.f18096s = num8;
        this.f18097t = num9;
        this.f18098u = str7;
        this.f18099v = str8;
        this.f18100w = str9;
        this.f18101x = str10;
        this.f18102y = bool6;
        this.f18103z = num10;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "call_state", this.f18080a);
        xu.d.Y(jSONObject, "data_activity", this.f18081b);
        xu.d.Y(jSONObject, "data_state", this.f18082c);
        xu.d.Y(jSONObject, "is_network_roaming", this.f18083d);
        xu.d.Y(jSONObject, "network_operator", this.f18084e);
        xu.d.Y(jSONObject, "sim_operator", this.f18085f);
        xu.d.Y(jSONObject, "network_operator_name", this.f18086g);
        xu.d.Y(jSONObject, "sim_operator_name", this.f18087h);
        xu.d.Y(jSONObject, "network_type", this.f18088i);
        xu.d.Y(jSONObject, "voice_network_type", this.j);
        xu.d.Y(jSONObject, "active_modem_count", this.k);
        xu.d.Y(jSONObject, "supported_modem_count", this.f18089l);
        xu.d.Y(jSONObject, "is_data_capable", this.f18090m);
        xu.d.Y(jSONObject, "is_data_connection_allowed", this.f18091n);
        xu.d.Y(jSONObject, "data_disabled_reasons", this.f18092o);
        xu.d.Y(jSONObject, "capability_slicing_supported", this.f18093p);
        xu.d.Y(jSONObject, "equivalent_home_plmns", this.f18094q);
        xu.d.Y(jSONObject, "is_active_network_metered", this.f18095r);
        xu.d.Y(jSONObject, "restrict_background_status", this.f18096s);
        xu.d.Y(jSONObject, "sim_state", this.f18097t);
        xu.d.Y(jSONObject, "sim_group_id_level1", this.f18098u);
        xu.d.Y(jSONObject, "access_point_name", this.f18099v);
        xu.d.Y(jSONObject, "dns_servers", this.f18100w);
        xu.d.Y(jSONObject, "premium_capability_available_for_purchase", this.f18101x);
        xu.d.Y(jSONObject, "is_data_enabled", this.f18102y);
        xu.d.Y(jSONObject, "subscription_id", this.f18103z);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return br.l.a(this.f18080a, p0Var.f18080a) && br.l.a(this.f18081b, p0Var.f18081b) && br.l.a(this.f18082c, p0Var.f18082c) && br.l.a(this.f18083d, p0Var.f18083d) && br.l.a(this.f18084e, p0Var.f18084e) && br.l.a(this.f18085f, p0Var.f18085f) && br.l.a(this.f18086g, p0Var.f18086g) && br.l.a(this.f18087h, p0Var.f18087h) && br.l.a(this.f18088i, p0Var.f18088i) && br.l.a(this.j, p0Var.j) && br.l.a(this.k, p0Var.k) && br.l.a(this.f18089l, p0Var.f18089l) && br.l.a(this.f18090m, p0Var.f18090m) && br.l.a(this.f18091n, p0Var.f18091n) && br.l.a(this.f18092o, p0Var.f18092o) && br.l.a(this.f18093p, p0Var.f18093p) && br.l.a(this.f18094q, p0Var.f18094q) && br.l.a(this.f18095r, p0Var.f18095r) && br.l.a(this.f18096s, p0Var.f18096s) && br.l.a(this.f18097t, p0Var.f18097t) && br.l.a(this.f18098u, p0Var.f18098u) && br.l.a(this.f18099v, p0Var.f18099v) && br.l.a(this.f18100w, p0Var.f18100w) && br.l.a(this.f18101x, p0Var.f18101x) && br.l.a(this.f18102y, p0Var.f18102y) && br.l.a(this.f18103z, p0Var.f18103z);
    }

    public final int hashCode() {
        Integer num = this.f18080a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f18081b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f18082c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.f18083d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f18084e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18085f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18086g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18087h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.f18088i;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.j;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.k;
        int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f18089l;
        int iHashCode12 = (iHashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool2 = this.f18090m;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f18091n;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.f18092o;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool4 = this.f18093p;
        int iHashCode16 = (iHashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str6 = this.f18094q;
        int iHashCode17 = (iHashCode16 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool5 = this.f18095r;
        int iHashCode18 = (iHashCode17 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num8 = this.f18096s;
        int iHashCode19 = (iHashCode18 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f18097t;
        int iHashCode20 = (iHashCode19 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str7 = this.f18098u;
        int iHashCode21 = (iHashCode20 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f18099v;
        int iHashCode22 = (iHashCode21 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f18100w;
        int iHashCode23 = (iHashCode22 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f18101x;
        int iHashCode24 = (iHashCode23 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool6 = this.f18102y;
        int iHashCode25 = (iHashCode24 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num10 = this.f18103z;
        return iHashCode25 + (num10 != null ? num10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TelephonyCoreResult(callState=");
        sb2.append(this.f18080a);
        sb2.append(", dataActivity=");
        sb2.append(this.f18081b);
        sb2.append(", dataState=");
        sb2.append(this.f18082c);
        sb2.append(", isNetworkRoaming=");
        sb2.append(this.f18083d);
        sb2.append(", networkOperator=");
        sb2.append(this.f18084e);
        sb2.append(", simOperator=");
        sb2.append(this.f18085f);
        sb2.append(", networkOperatorName=");
        sb2.append(this.f18086g);
        sb2.append(", simOperatorName=");
        sb2.append(this.f18087h);
        sb2.append(", networkType=");
        sb2.append(this.f18088i);
        sb2.append(", voiceNetworkType=");
        sb2.append(this.j);
        sb2.append(", activeModemCount=");
        sb2.append(this.k);
        sb2.append(", supportedModemCount=");
        sb2.append(this.f18089l);
        sb2.append(", isDataCapable=");
        sb2.append(this.f18090m);
        sb2.append(", isDataConnectionAllowed=");
        sb2.append(this.f18091n);
        sb2.append(", dataDisabledReasons=");
        sb2.append(this.f18092o);
        sb2.append(", capabilitySlicingSupported=");
        sb2.append(this.f18093p);
        sb2.append(", equivalentHomePlmns=");
        sb2.append(this.f18094q);
        sb2.append(", isActiveNetworkMetered=");
        sb2.append(this.f18095r);
        sb2.append(", restrictBackgroundStatus=");
        sb2.append(this.f18096s);
        sb2.append(", simState=");
        sb2.append(this.f18097t);
        sb2.append(", simGroupIdLevel1=");
        sb2.append(this.f18098u);
        sb2.append(", simAccessPointName=");
        sb2.append(this.f18099v);
        sb2.append(", dnsServers=");
        sb2.append(this.f18100w);
        sb2.append(", premiumCapabilityAvailableForPurchase=");
        sb2.append(this.f18101x);
        sb2.append(", isDataEnabled=");
        sb2.append(this.f18102y);
        sb2.append(", subscriptionId=");
        return w.g.i(sb2, this.f18103z, ')');
    }
}
