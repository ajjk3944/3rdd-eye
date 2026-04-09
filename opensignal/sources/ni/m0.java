package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f18020a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f18021b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18022c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f18023d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18024e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f18025f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f18026g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f18027h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f18028i;
    public final Boolean j;
    public final Boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18029l;

    /* renamed from: m, reason: collision with root package name */
    public final String f18030m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f18031n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f18032o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f18033p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f18034q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f18035r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f18036s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f18037t;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f18038u;

    public m0(Integer num, Integer num2, String str, Integer num3, String str2, Integer num4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str3, String str4, Integer num5, Integer num6, Boolean bool6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11) {
        this.f18020a = num;
        this.f18021b = num2;
        this.f18022c = str;
        this.f18023d = num3;
        this.f18024e = str2;
        this.f18025f = num4;
        this.f18026g = bool;
        this.f18027h = bool2;
        this.f18028i = bool3;
        this.j = bool4;
        this.k = bool5;
        this.f18029l = str3;
        this.f18030m = str4;
        this.f18031n = num5;
        this.f18032o = num6;
        this.f18033p = bool6;
        this.f18034q = num7;
        this.f18035r = num8;
        this.f18036s = num9;
        this.f18037t = num10;
        this.f18038u = num11;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "active_count", this.f18020a);
        xu.d.Y(jSONObject, "active_count_max", this.f18021b);
        xu.d.Y(jSONObject, "carrier_name", this.f18022c);
        xu.d.Y(jSONObject, "data_roaming", this.f18023d);
        xu.d.Y(jSONObject, "display_name", this.f18024e);
        xu.d.Y(jSONObject, "subscription_id", this.f18025f);
        xu.d.Y(jSONObject, "is_data_sim", this.f18026g);
        xu.d.Y(jSONObject, "is_default_sim", this.f18027h);
        xu.d.Y(jSONObject, "is_sms_sim", this.f18028i);
        xu.d.Y(jSONObject, "is_voice_sim", this.j);
        xu.d.Y(jSONObject, "mccmnc_list", this.f18029l);
        xu.d.Y(jSONObject, "network_id", this.f18030m);
        xu.d.Y(jSONObject, "slot_index", this.f18031n);
        xu.d.Y(jSONObject, "card_id", this.f18032o);
        xu.d.Y(jSONObject, "is_embedded", this.f18033p);
        xu.d.Y(jSONObject, "active_data_id", this.f18034q);
        xu.d.Y(jSONObject, "is_active_data_sim", this.k);
        xu.d.Y(jSONObject, "default_data_subscription_id", this.f18035r);
        xu.d.Y(jSONObject, "default_subscription_id", this.f18036s);
        xu.d.Y(jSONObject, "default_voice_subscription_id", this.f18037t);
        xu.d.Y(jSONObject, "default_sms_subscription_id", this.f18038u);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return br.l.a(this.f18020a, m0Var.f18020a) && br.l.a(this.f18021b, m0Var.f18021b) && br.l.a(this.f18022c, m0Var.f18022c) && br.l.a(this.f18023d, m0Var.f18023d) && br.l.a(this.f18024e, m0Var.f18024e) && br.l.a(this.f18025f, m0Var.f18025f) && br.l.a(this.f18026g, m0Var.f18026g) && br.l.a(this.f18027h, m0Var.f18027h) && br.l.a(this.f18028i, m0Var.f18028i) && br.l.a(this.j, m0Var.j) && br.l.a(this.k, m0Var.k) && br.l.a(this.f18029l, m0Var.f18029l) && br.l.a(this.f18030m, m0Var.f18030m) && br.l.a(this.f18031n, m0Var.f18031n) && br.l.a(this.f18032o, m0Var.f18032o) && br.l.a(this.f18033p, m0Var.f18033p) && br.l.a(this.f18034q, m0Var.f18034q) && br.l.a(this.f18035r, m0Var.f18035r) && br.l.a(this.f18036s, m0Var.f18036s) && br.l.a(this.f18037t, m0Var.f18037t) && br.l.a(this.f18038u, m0Var.f18038u);
    }

    public final int hashCode() {
        Integer num = this.f18020a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f18021b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f18022c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f18023d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.f18024e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.f18025f;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.f18026g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f18027h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f18028i;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.j;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.k;
        int iHashCode11 = (iHashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str3 = this.f18029l;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18030m;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num5 = this.f18031n;
        int iHashCode14 = (iHashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f18032o;
        int iHashCode15 = (iHashCode14 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool6 = this.f18033p;
        int iHashCode16 = (iHashCode15 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num7 = this.f18034q;
        int iHashCode17 = (iHashCode16 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f18035r;
        int iHashCode18 = (iHashCode17 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f18036s;
        int iHashCode19 = (iHashCode18 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.f18037t;
        int iHashCode20 = (iHashCode19 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.f18038u;
        return iHashCode20 + (num11 != null ? num11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SubscriptionCoreResult(activeCount=");
        sb2.append(this.f18020a);
        sb2.append(", activeCountMax=");
        sb2.append(this.f18021b);
        sb2.append(", carrierName=");
        sb2.append(this.f18022c);
        sb2.append(", dataRoaming=");
        sb2.append(this.f18023d);
        sb2.append(", displayName=");
        sb2.append(this.f18024e);
        sb2.append(", subscriptionId=");
        sb2.append(this.f18025f);
        sb2.append(", isDataSim=");
        sb2.append(this.f18026g);
        sb2.append(", isDefaultSim=");
        sb2.append(this.f18027h);
        sb2.append(", isSmsSim=");
        sb2.append(this.f18028i);
        sb2.append(", isVoiceSim=");
        sb2.append(this.j);
        sb2.append(", isActiveDataSim=");
        sb2.append(this.k);
        sb2.append(", mccMncJson=");
        sb2.append(this.f18029l);
        sb2.append(", networkId=");
        sb2.append(this.f18030m);
        sb2.append(", simSlotIndex=");
        sb2.append(this.f18031n);
        sb2.append(", cardId=");
        sb2.append(this.f18032o);
        sb2.append(", isEmbedded=");
        sb2.append(this.f18033p);
        sb2.append(", activeDataSubscriptionId=");
        sb2.append(this.f18034q);
        sb2.append(", defaultDataSubscriptionId=");
        sb2.append(this.f18035r);
        sb2.append(", defaultSubscriptionId=");
        sb2.append(this.f18036s);
        sb2.append(", defaultVoiceSubscriptionId=");
        sb2.append(this.f18037t);
        sb2.append(", defaultSmsSubscriptionId=");
        return w.g.i(sb2, this.f18038u, ')');
    }
}
