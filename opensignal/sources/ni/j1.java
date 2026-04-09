package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j1 {
    public final String A;
    public final Long B;
    public final Long C;
    public final String D;
    public final Long E;
    public final String F;
    public final Boolean G;
    public final Boolean H;
    public final Boolean I;
    public final Boolean J;
    public final String K;
    public final Boolean L;
    public final Boolean M;

    /* renamed from: a, reason: collision with root package name */
    public final String f17964a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f17965b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17966c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f17967d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f17968e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f17969f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f17970g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17971h;

    /* renamed from: i, reason: collision with root package name */
    public final String f17972i;
    public final Integer j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f17973l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f17974m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f17975n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f17976o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f17977p;

    /* renamed from: q, reason: collision with root package name */
    public final String f17978q;

    /* renamed from: r, reason: collision with root package name */
    public final String f17979r;

    /* renamed from: s, reason: collision with root package name */
    public final Long f17980s;

    /* renamed from: t, reason: collision with root package name */
    public final Boolean f17981t;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f17982u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f17983v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f17984w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f17985x;

    /* renamed from: y, reason: collision with root package name */
    public final String f17986y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f17987z;

    public j1(String str, Integer num, String str2, Boolean bool, Integer num2, Integer num3, Integer num4, String str3, String str4, Integer num5, Integer num6, Integer num7, Integer num8, Boolean bool2, Boolean bool3, Integer num9, String str5, String str6, Long l10, Boolean bool4, Integer num10, Integer num11, Integer num12, Integer num13, String str7, Integer num14, String str8, Long l11, Long l12, String str9, Long l13, String str10, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, String str11, Boolean bool9, Boolean bool10) {
        this.f17964a = str;
        this.f17965b = num;
        this.f17966c = str2;
        this.f17967d = bool;
        this.f17968e = num2;
        this.f17969f = num3;
        this.f17970g = num4;
        this.f17971h = str3;
        this.f17972i = str4;
        this.j = num5;
        this.k = num6;
        this.f17973l = num7;
        this.f17974m = num8;
        this.f17975n = bool2;
        this.f17976o = bool3;
        this.f17977p = num9;
        this.f17978q = str5;
        this.f17979r = str6;
        this.f17980s = l10;
        this.f17981t = bool4;
        this.f17982u = num10;
        this.f17983v = num11;
        this.f17984w = num12;
        this.f17985x = num13;
        this.f17986y = str7;
        this.f17987z = num14;
        this.A = str8;
        this.B = l11;
        this.C = l12;
        this.D = str9;
        this.E = l13;
        this.F = str10;
        this.G = bool5;
        this.H = bool6;
        this.I = bool7;
        this.J = bool8;
        this.K = str11;
        this.L = bool9;
        this.M = bool10;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        xu.d.Y(jSONObject, "bssid", this.f17964a);
        xu.d.Y(jSONObject, "frequency", this.f17965b);
        xu.d.Y(jSONObject, "ssid", this.f17966c);
        xu.d.Y(jSONObject, "is_hidden_ssid", this.f17967d);
        xu.d.Y(jSONObject, "link_psd", this.f17968e);
        xu.d.Y(jSONObject, "rssi", this.f17969f);
        xu.d.Y(jSONObject, "ip", this.f17970g);
        xu.d.Y(jSONObject, "supplicant_state", this.f17971h);
        xu.d.Y(jSONObject, "capabilities", this.f17972i);
        xu.d.Y(jSONObject, "center_fq_0", this.j);
        xu.d.Y(jSONObject, "center_fq_1", this.k);
        xu.d.Y(jSONObject, "channel_width", this.f17973l);
        xu.d.Y(jSONObject, "freq", this.f17974m);
        xu.d.Y(jSONObject, "is_80211mc_responder", this.f17975n);
        xu.d.Y(jSONObject, "is_passpoint", this.f17976o);
        xu.d.Y(jSONObject, "level", this.f17977p);
        xu.d.Y(jSONObject, "operator_name", this.f17978q);
        xu.d.Y(jSONObject, "venue_name", this.f17979r);
        xu.d.Y(jSONObject, "scan_age", this.f17980s);
        xu.d.Y(jSONObject, "wifi_on", this.f17981t);
        xu.d.Y(jSONObject, "wifi_standard", this.f17982u);
        xu.d.Y(jSONObject, "subscription_id", this.f17983v);
        xu.d.Y(jSONObject, "wifi_tx_link_speed_mbps", this.f17984w);
        xu.d.Y(jSONObject, "wifi_rx_link_speed_mbps", this.f17985x);
        xu.d.Y(jSONObject, "wifi_provisioner_carrier_name", this.f17986y);
        xu.d.Y(jSONObject, "wifi_current_security_type", this.f17987z);
        xu.d.Y(jSONObject, "wifi_info_string", this.A);
        xu.d.Y(jSONObject, "wifi_obtaining_ip_address_duration", this.B);
        xu.d.Y(jSONObject, "wifi_authenticating_duration", this.C);
        xu.d.Y(jSONObject, "wifi_last_bssid", this.D);
        xu.d.Y(jSONObject, "wifi_last_bssid_timestamp", this.E);
        xu.d.Y(jSONObject, "wifi_last_ssid", this.F);
        xu.d.Y(jSONObject, "wifi_is_aggressive_roaming_mode_supported", this.G);
        xu.d.Y(jSONObject, "wifi_is_d2d_supported_when_infra_sta_disabled", this.H);
        xu.d.Y(jSONObject, "wifi_is_wep_supported", this.I);
        xu.d.Y(jSONObject, "wifi_is_wpa_personal_supported", this.J);
        xu.d.Y(jSONObject, "wifi_passpoint_unique_id", this.K);
        xu.d.Y(jSONObject, "wifi_is_80211az_ntb_responder", this.L);
        xu.d.Y(jSONObject, "is_twt_responder", this.M);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return br.l.a(this.f17964a, j1Var.f17964a) && br.l.a(this.f17965b, j1Var.f17965b) && br.l.a(this.f17966c, j1Var.f17966c) && br.l.a(this.f17967d, j1Var.f17967d) && br.l.a(this.f17968e, j1Var.f17968e) && br.l.a(this.f17969f, j1Var.f17969f) && br.l.a(this.f17970g, j1Var.f17970g) && br.l.a(this.f17971h, j1Var.f17971h) && br.l.a(this.f17972i, j1Var.f17972i) && br.l.a(this.j, j1Var.j) && br.l.a(this.k, j1Var.k) && br.l.a(this.f17973l, j1Var.f17973l) && br.l.a(this.f17974m, j1Var.f17974m) && br.l.a(this.f17975n, j1Var.f17975n) && br.l.a(this.f17976o, j1Var.f17976o) && br.l.a(this.f17977p, j1Var.f17977p) && br.l.a(this.f17978q, j1Var.f17978q) && br.l.a(this.f17979r, j1Var.f17979r) && br.l.a(this.f17980s, j1Var.f17980s) && br.l.a(this.f17981t, j1Var.f17981t) && br.l.a(this.f17982u, j1Var.f17982u) && br.l.a(this.f17983v, j1Var.f17983v) && br.l.a(this.f17984w, j1Var.f17984w) && br.l.a(this.f17985x, j1Var.f17985x) && br.l.a(this.f17986y, j1Var.f17986y) && br.l.a(this.f17987z, j1Var.f17987z) && br.l.a(this.A, j1Var.A) && br.l.a(this.B, j1Var.B) && br.l.a(this.C, j1Var.C) && br.l.a(this.D, j1Var.D) && br.l.a(this.E, j1Var.E) && br.l.a(this.F, j1Var.F) && br.l.a(this.G, j1Var.G) && br.l.a(this.H, j1Var.H) && br.l.a(this.I, j1Var.I) && br.l.a(this.J, j1Var.J) && br.l.a(this.K, j1Var.K) && br.l.a(this.L, j1Var.L) && br.l.a(this.M, j1Var.M);
    }

    public final int hashCode() {
        String str = this.f17964a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f17965b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f17966c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f17967d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.f17968e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f17969f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f17970g;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.f17971h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17972i;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num5 = this.j;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.k;
        int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f17973l;
        int iHashCode12 = (iHashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f17974m;
        int iHashCode13 = (iHashCode12 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Boolean bool2 = this.f17975n;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f17976o;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num9 = this.f17977p;
        int iHashCode16 = (iHashCode15 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str5 = this.f17978q;
        int iHashCode17 = (iHashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f17979r;
        int iHashCode18 = (iHashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l10 = this.f17980s;
        int iHashCode19 = (iHashCode18 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Boolean bool4 = this.f17981t;
        int iHashCode20 = (iHashCode19 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num10 = this.f17982u;
        int iHashCode21 = (iHashCode20 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.f17983v;
        int iHashCode22 = (iHashCode21 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.f17984w;
        int iHashCode23 = (iHashCode22 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.f17985x;
        int iHashCode24 = (iHashCode23 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str7 = this.f17986y;
        int iHashCode25 = (iHashCode24 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num14 = this.f17987z;
        int iHashCode26 = (iHashCode25 + (num14 == null ? 0 : num14.hashCode())) * 31;
        String str8 = this.A;
        int iHashCode27 = (iHashCode26 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l11 = this.B;
        int iHashCode28 = (iHashCode27 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.C;
        int iHashCode29 = (iHashCode28 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str9 = this.D;
        int iHashCode30 = (iHashCode29 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l13 = this.E;
        int iHashCode31 = (iHashCode30 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str10 = this.F;
        int iHashCode32 = (iHashCode31 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool5 = this.G;
        int iHashCode33 = (iHashCode32 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.H;
        int iHashCode34 = (iHashCode33 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.I;
        int iHashCode35 = (iHashCode34 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.J;
        int iHashCode36 = (iHashCode35 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str11 = this.K;
        int iHashCode37 = (iHashCode36 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool9 = this.L;
        int iHashCode38 = (iHashCode37 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.M;
        return iHashCode38 + (bool10 != null ? bool10.hashCode() : 0);
    }

    public final String toString() {
        return "WifiStatusCoreResult(bssid=" + this.f17964a + ", frequency=" + this.f17965b + ", ssid=" + this.f17966c + ", hiddenSsid=" + this.f17967d + ", linkPsd=" + this.f17968e + ", rssi=" + this.f17969f + ", ip=" + this.f17970g + ", supplicantState=" + this.f17971h + ", capabilities=" + this.f17972i + ", centerFrequency0=" + this.j + ", centerFrequency1=" + this.k + ", channelWidth=" + this.f17973l + ", freq=" + this.f17974m + ", is80211Responder=" + this.f17975n + ", isPasspoint=" + this.f17976o + ", level=" + this.f17977p + ", operatorName=" + this.f17978q + ", venueName=" + this.f17979r + ", scanAge=" + this.f17980s + ", isWifiOn=" + this.f17981t + ", wifiStandard=" + this.f17982u + ", subscriptionId=" + this.f17983v + ", txLinkSpeedMbps=" + this.f17984w + ", rxLinkSpeedMbps=" + this.f17985x + ", wifiProvisionerCarrierName=" + this.f17986y + ", currentSecurityType=" + this.f17987z + ", wifiInfoString=" + this.A + ", obtainingIpAddressDuration=" + this.B + ", authenticatingDuration=" + this.C + ", lastBssid=" + this.D + ", lastBssidTimestamp=" + this.E + ", lastSsid=" + this.F + ", isAggressiveRoamingModeSupported=" + this.G + ", isD2dSupportedWhenInfraStaDisabled=" + this.H + ", isWepSupported=" + this.I + ", isWpaPersonalSupported=" + this.J + ", passpointUniqueId=" + this.K + ", is80211azNtbResponder=" + this.L + ", isTwtResponder=" + this.M + ')';
    }
}
