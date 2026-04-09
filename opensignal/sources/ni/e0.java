package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e0 {
    public final Boolean A;
    public final Boolean B;
    public final Boolean C;
    public final Integer D;
    public final Integer E;
    public final Boolean F;
    public final Boolean G;
    public final String H;
    public final Boolean I;
    public final Boolean J;

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f17773a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f17774b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f17775c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f17776d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f17777e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f17778f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f17779g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f17780h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f17781i;
    public final Boolean j;
    public final Boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f17782l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f17783m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f17784n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f17785o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f17786p;

    /* renamed from: q, reason: collision with root package name */
    public final Boolean f17787q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f17788r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f17789s;

    /* renamed from: t, reason: collision with root package name */
    public final Boolean f17790t;

    /* renamed from: u, reason: collision with root package name */
    public final Boolean f17791u;

    /* renamed from: v, reason: collision with root package name */
    public final Boolean f17792v;

    /* renamed from: w, reason: collision with root package name */
    public final Boolean f17793w;

    /* renamed from: x, reason: collision with root package name */
    public final Boolean f17794x;

    /* renamed from: y, reason: collision with root package name */
    public final Boolean f17795y;

    /* renamed from: z, reason: collision with root package name */
    public final Boolean f17796z;

    public e0(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, Boolean bool28, Boolean bool29, Integer num, Integer num2, Boolean bool30, Boolean bool31, String str, Boolean bool32, Boolean bool33) {
        this.f17773a = bool;
        this.f17774b = bool2;
        this.f17775c = bool3;
        this.f17776d = bool4;
        this.f17777e = bool5;
        this.f17778f = bool6;
        this.f17779g = bool7;
        this.f17780h = bool8;
        this.f17781i = bool9;
        this.j = bool10;
        this.k = bool11;
        this.f17782l = bool12;
        this.f17783m = bool13;
        this.f17784n = bool14;
        this.f17785o = bool15;
        this.f17786p = bool16;
        this.f17787q = bool17;
        this.f17788r = bool18;
        this.f17789s = bool19;
        this.f17790t = bool20;
        this.f17791u = bool21;
        this.f17792v = bool22;
        this.f17793w = bool23;
        this.f17794x = bool24;
        this.f17795y = bool25;
        this.f17796z = bool26;
        this.A = bool27;
        this.B = bool28;
        this.C = bool29;
        this.D = num;
        this.E = num2;
        this.F = bool30;
        this.G = bool31;
        this.H = str;
        this.I = bool32;
        this.J = bool33;
    }

    public final String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_captive_portal", this.f17773a);
        jSONObject.put("is_cbs_reachable", this.f17774b);
        jSONObject.put("is_dun_emergency_reachable", this.f17775c);
        jSONObject.put("is_eims_emergencyReachable", this.f17776d);
        jSONObject.put("is_running_foreground", this.f17777e);
        jSONObject.put("is_fota_reachable", this.f17778f);
        jSONObject.put("is_ia_reachable", this.f17779g);
        jSONObject.put("is_ims_reachable", this.f17780h);
        jSONObject.put("is_internet_reachable", this.f17781i);
        jSONObject.put("is_mms_reachable", this.j);
        jSONObject.put("is_not_congested", this.k);
        jSONObject.put("is_not_metered", this.f17782l);
        jSONObject.put("is_not_restricted", this.f17783m);
        jSONObject.put("is_not_roaming", this.f17784n);
        jSONObject.put("is_not_suspended", this.f17785o);
        jSONObject.put("is_not_vpn", this.f17786p);
        jSONObject.put("is_rcs_reachable", this.f17787q);
        jSONObject.put("is_supl_reachable", this.f17788r);
        jSONObject.put("is_trusted", this.f17789s);
        jSONObject.put("is_validated", this.f17790t);
        jSONObject.put("is_wifi_p2p_reachable", this.f17791u);
        jSONObject.put("is_xcap_reachable", this.f17792v);
        jSONObject.put("is_transport_bluetooth", this.f17793w);
        jSONObject.put("is_transport_cellular", this.f17794x);
        jSONObject.put("is_transport_ethernet", this.f17795y);
        jSONObject.put("is_transport_lowpan", this.f17796z);
        jSONObject.put("is_transport_vpn", this.A);
        jSONObject.put("is_transport_wifi", this.B);
        jSONObject.put("is_transport_wifi_aware", this.C);
        jSONObject.put("upstream_bandwidth_kbps", this.D);
        jSONObject.put("downstream_bandwidth_kbps", this.E);
        jSONObject.put("is_network_enterprise", this.F);
        jSONObject.put("is_connected_to_head_unit", this.G);
        jSONObject.put("capabilities", this.H);
        jSONObject.put("is_local_network", this.I);
        jSONObject.put("is_satellite", this.J);
        String string = jSONObject.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return br.l.a(this.f17773a, e0Var.f17773a) && br.l.a(this.f17774b, e0Var.f17774b) && br.l.a(this.f17775c, e0Var.f17775c) && br.l.a(this.f17776d, e0Var.f17776d) && br.l.a(this.f17777e, e0Var.f17777e) && br.l.a(this.f17778f, e0Var.f17778f) && br.l.a(this.f17779g, e0Var.f17779g) && br.l.a(this.f17780h, e0Var.f17780h) && br.l.a(this.f17781i, e0Var.f17781i) && br.l.a(this.j, e0Var.j) && br.l.a(this.k, e0Var.k) && br.l.a(this.f17782l, e0Var.f17782l) && br.l.a(this.f17783m, e0Var.f17783m) && br.l.a(this.f17784n, e0Var.f17784n) && br.l.a(this.f17785o, e0Var.f17785o) && br.l.a(this.f17786p, e0Var.f17786p) && br.l.a(this.f17787q, e0Var.f17787q) && br.l.a(this.f17788r, e0Var.f17788r) && br.l.a(this.f17789s, e0Var.f17789s) && br.l.a(this.f17790t, e0Var.f17790t) && br.l.a(this.f17791u, e0Var.f17791u) && br.l.a(this.f17792v, e0Var.f17792v) && br.l.a(this.f17793w, e0Var.f17793w) && br.l.a(this.f17794x, e0Var.f17794x) && br.l.a(this.f17795y, e0Var.f17795y) && br.l.a(this.f17796z, e0Var.f17796z) && br.l.a(this.A, e0Var.A) && br.l.a(this.B, e0Var.B) && br.l.a(this.C, e0Var.C) && br.l.a(this.D, e0Var.D) && br.l.a(this.E, e0Var.E) && br.l.a(this.F, e0Var.F) && br.l.a(this.G, e0Var.G) && br.l.a(this.H, e0Var.H) && br.l.a(this.I, e0Var.I) && br.l.a(this.J, e0Var.J);
    }

    public final int hashCode() {
        Boolean bool = this.f17773a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f17774b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f17775c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f17776d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f17777e;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f17778f;
        int iHashCode6 = (iHashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f17779g;
        int iHashCode7 = (iHashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.f17780h;
        int iHashCode8 = (iHashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.f17781i;
        int iHashCode9 = (iHashCode8 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.j;
        int iHashCode10 = (iHashCode9 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.k;
        int iHashCode11 = (iHashCode10 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.f17782l;
        int iHashCode12 = (iHashCode11 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.f17783m;
        int iHashCode13 = (iHashCode12 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.f17784n;
        int iHashCode14 = (iHashCode13 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.f17785o;
        int iHashCode15 = (iHashCode14 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.f17786p;
        int iHashCode16 = (iHashCode15 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.f17787q;
        int iHashCode17 = (iHashCode16 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.f17788r;
        int iHashCode18 = (iHashCode17 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.f17789s;
        int iHashCode19 = (iHashCode18 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.f17790t;
        int iHashCode20 = (iHashCode19 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.f17791u;
        int iHashCode21 = (iHashCode20 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.f17792v;
        int iHashCode22 = (iHashCode21 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.f17793w;
        int iHashCode23 = (iHashCode22 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.f17794x;
        int iHashCode24 = (iHashCode23 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        Boolean bool25 = this.f17795y;
        int iHashCode25 = (iHashCode24 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        Boolean bool26 = this.f17796z;
        int iHashCode26 = (iHashCode25 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        Boolean bool27 = this.A;
        int iHashCode27 = (iHashCode26 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        Boolean bool28 = this.B;
        int iHashCode28 = (iHashCode27 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        Boolean bool29 = this.C;
        int iHashCode29 = (iHashCode28 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        Integer num = this.D;
        int iHashCode30 = (iHashCode29 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.E;
        int iHashCode31 = (iHashCode30 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool30 = this.F;
        int iHashCode32 = (iHashCode31 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        Boolean bool31 = this.G;
        int iHashCode33 = (iHashCode32 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
        String str = this.H;
        int iHashCode34 = (iHashCode33 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool32 = this.I;
        int iHashCode35 = (iHashCode34 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
        Boolean bool33 = this.J;
        return iHashCode35 + (bool33 != null ? bool33.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkCapabilityCoreResult(isCaptivePortal=" + this.f17773a + ", isCbsReachable=" + this.f17774b + ", isDunReachable=" + this.f17775c + ", isEimsEmergencyReachable=" + this.f17776d + ", isRunningForeground=" + this.f17777e + ", isFotaReachable=" + this.f17778f + ", isIaReachable=" + this.f17779g + ", isImsReachable=" + this.f17780h + ", isInternetReachable=" + this.f17781i + ", isMmsReachable=" + this.j + ", isNotCongested=" + this.k + ", isNotMetered=" + this.f17782l + ", isNotRestricted=" + this.f17783m + ", isNotRoaming=" + this.f17784n + ", isNotSuspended=" + this.f17785o + ", isNotVpn=" + this.f17786p + ", isRcsReachable=" + this.f17787q + ", isSuplReachable=" + this.f17788r + ", isTrusted=" + this.f17789s + ", isValidated=" + this.f17790t + ", isWifiP2pReachable=" + this.f17791u + ", isXcapReachable=" + this.f17792v + ", isBluetooth=" + this.f17793w + ", isCellular=" + this.f17794x + ", isEthernet=" + this.f17795y + ", isLowpan=" + this.f17796z + ", isVpn=" + this.A + ", isWifi=" + this.B + ", isWifiAware=" + this.C + ", upstreamBandwidthKbps=" + this.D + ", downstreamBandwidthKbps=" + this.E + ", isNetworkEnterprise=" + this.F + ", isConnectedToHeadUnit=" + this.G + ", capabilities=" + this.H + ", isLocalNetwork=" + this.I + ", isSatellite=" + this.J + ')';
    }
}
