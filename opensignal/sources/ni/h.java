package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h extends vj.c {
    public final boolean A;
    public final String B;
    public final Boolean C;
    public final String D;
    public final Boolean E;
    public final String F;
    public final String G;
    public final Integer H;
    public final Integer I;
    public final String J;
    public final ak.s K;
    public final String L;
    public final Integer M;
    public final String N;
    public final Boolean O;
    public final Boolean P;
    public final String Q;

    /* renamed from: a, reason: collision with root package name */
    public final long f17860a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17861b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17862c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17863d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17864e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17865f;

    /* renamed from: g, reason: collision with root package name */
    public final long f17866g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17867h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17868i;
    public final String j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f17869l;

    /* renamed from: m, reason: collision with root package name */
    public final long f17870m;

    /* renamed from: n, reason: collision with root package name */
    public final String f17871n;

    /* renamed from: o, reason: collision with root package name */
    public final int f17872o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17873p;

    /* renamed from: q, reason: collision with root package name */
    public final String f17874q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f17875r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f17876s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f17877t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f17878u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f17879v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f17880w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f17881x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f17882y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f17883z;

    public h(long j, long j7, String str, String str2, String str3, long j10, long j11, String str4, int i10, String str5, int i11, Integer num, long j12, String str6, int i12, int i13, String str7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, String str8, Boolean bool, String str9, Boolean bool2, String str10, String str11, Integer num2, Integer num3, String str12, ak.s sVar, String str13, Integer num4, String str14, Boolean bool3, Boolean bool4, String str15) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        br.l.e(str4, "sdkVersionCode");
        br.l.e(str5, "androidVrsCode");
        br.l.e(str11, "kotlinVersion");
        this.f17860a = j;
        this.f17861b = j7;
        this.f17862c = str;
        this.f17863d = str2;
        this.f17864e = str3;
        this.f17865f = j10;
        this.f17866g = j11;
        this.f17867h = str4;
        this.f17868i = i10;
        this.j = str5;
        this.k = i11;
        this.f17869l = num;
        this.f17870m = j12;
        this.f17871n = str6;
        this.f17872o = i12;
        this.f17873p = i13;
        this.f17874q = str7;
        this.f17875r = z10;
        this.f17876s = z11;
        this.f17877t = z12;
        this.f17878u = z13;
        this.f17879v = z14;
        this.f17880w = z15;
        this.f17881x = z16;
        this.f17882y = z17;
        this.f17883z = z18;
        this.A = z19;
        this.B = str8;
        this.C = bool;
        this.D = str9;
        this.E = bool2;
        this.F = str10;
        this.G = str11;
        this.H = num2;
        this.I = num3;
        this.J = str12;
        this.K = sVar;
        this.L = str13;
        this.M = num4;
        this.N = str14;
        this.O = bool3;
        this.P = bool4;
        this.Q = str15;
    }

    public static h i(h hVar, long j) {
        long j7 = hVar.f17861b;
        String str = hVar.f17862c;
        String str2 = hVar.f17863d;
        String str3 = hVar.f17864e;
        long j10 = hVar.f17865f;
        long j11 = hVar.f17866g;
        String str4 = hVar.f17867h;
        int i10 = hVar.f17868i;
        String str5 = hVar.j;
        int i11 = hVar.k;
        Integer num = hVar.f17869l;
        long j12 = hVar.f17870m;
        String str6 = hVar.f17871n;
        int i12 = hVar.f17872o;
        int i13 = hVar.f17873p;
        String str7 = hVar.f17874q;
        boolean z10 = hVar.f17875r;
        boolean z11 = hVar.f17876s;
        boolean z12 = hVar.f17877t;
        boolean z13 = hVar.f17878u;
        boolean z14 = hVar.f17879v;
        boolean z15 = hVar.f17880w;
        boolean z16 = hVar.f17881x;
        boolean z17 = hVar.f17882y;
        boolean z18 = hVar.f17883z;
        boolean z19 = hVar.A;
        String str8 = hVar.B;
        Boolean bool = hVar.C;
        String str9 = hVar.D;
        Boolean bool2 = hVar.E;
        String str10 = hVar.F;
        String str11 = hVar.G;
        Integer num2 = hVar.H;
        Integer num3 = hVar.I;
        String str12 = hVar.J;
        ak.s sVar = hVar.K;
        String str13 = hVar.L;
        Integer num4 = hVar.M;
        String str14 = hVar.N;
        Boolean bool3 = hVar.O;
        Boolean bool4 = hVar.P;
        String str15 = hVar.Q;
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        br.l.e(str4, "sdkVersionCode");
        br.l.e(str5, "androidVrsCode");
        br.l.e(str11, "kotlinVersion");
        return new h(j, j7, str, str2, str3, j10, j11, str4, i10, str5, i11, num, j12, str6, i12, i13, str7, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, str8, bool, str9, bool2, str10, str11, num2, num3, str12, sVar, str13, num4, str14, bool3, bool4, str15);
    }

    @Override // vj.c
    public final String a() {
        return this.f17864e;
    }

    @Override // vj.c
    public final long b() {
        return this.f17860a;
    }

    @Override // vj.c
    public final String c() {
        return this.f17863d;
    }

    @Override // vj.c
    public final long d() {
        return this.f17861b;
    }

    @Override // vj.c
    public final String e() {
        return this.f17862c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f17860a == hVar.f17860a && this.f17861b == hVar.f17861b && br.l.a(this.f17862c, hVar.f17862c) && br.l.a(this.f17863d, hVar.f17863d) && br.l.a(this.f17864e, hVar.f17864e) && this.f17865f == hVar.f17865f && this.f17866g == hVar.f17866g && br.l.a(this.f17867h, hVar.f17867h) && this.f17868i == hVar.f17868i && br.l.a(this.j, hVar.j) && this.k == hVar.k && br.l.a(this.f17869l, hVar.f17869l) && this.f17870m == hVar.f17870m && br.l.a(this.f17871n, hVar.f17871n) && this.f17872o == hVar.f17872o && this.f17873p == hVar.f17873p && br.l.a(this.f17874q, hVar.f17874q) && this.f17875r == hVar.f17875r && this.f17876s == hVar.f17876s && this.f17877t == hVar.f17877t && this.f17878u == hVar.f17878u && this.f17879v == hVar.f17879v && this.f17880w == hVar.f17880w && this.f17881x == hVar.f17881x && this.f17882y == hVar.f17882y && this.f17883z == hVar.f17883z && this.A == hVar.A && br.l.a(this.B, hVar.B) && br.l.a(this.C, hVar.C) && br.l.a(this.D, hVar.D) && br.l.a(this.E, hVar.E) && br.l.a(this.F, hVar.F) && br.l.a(this.G, hVar.G) && br.l.a(this.H, hVar.H) && br.l.a(this.I, hVar.I) && br.l.a(this.J, hVar.J) && br.l.a(this.K, hVar.K) && br.l.a(this.L, hVar.L) && br.l.a(this.M, hVar.M) && br.l.a(this.N, hVar.N) && br.l.a(this.O, hVar.O) && br.l.a(this.P, hVar.P) && br.l.a(this.Q, hVar.Q);
    }

    @Override // vj.c
    public final long f() {
        return this.f17865f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("COHORT_ID", this.f17871n);
        jSONObject.put("APP_VRS_CODE", this.f17866g);
        jSONObject.put("DC_VRS_CODE", this.f17867h);
        jSONObject.put("DB_VRS_CODE", this.f17868i);
        jSONObject.put("ANDROID_VRS", this.j);
        jSONObject.put("ANDROID_SDK", this.k);
        xu.d.Y(jSONObject, "ANDROID_SDK_FULL", this.f17869l);
        jSONObject.put("CLIENT_VRS_CODE", this.f17870m);
        jSONObject.put("REPORT_CONFIG_REVISION", this.f17872o);
        jSONObject.put("REPORT_CONFIG_ID", this.f17873p);
        jSONObject.put("CONFIG_HASH", this.f17874q);
        jSONObject.put("NETWORK_ROAMING", this.f17875r);
        jSONObject.put("HAS_READ_PHONE_STATE", this.f17876s);
        jSONObject.put("HAS_READ_BASIC_PHONE_STATE", this.f17877t);
        jSONObject.put("HAS_FINE_LOCATION", this.f17878u);
        jSONObject.put("HAS_COARSE_LOCATION", this.f17879v);
        jSONObject.put("HAS_ACCESS_BACKGROUND_LOCATION", this.f17880w);
        jSONObject.put("HAS_IGNORE_BATTERY_OPTIMISATION", this.A);
        xu.d.Y(jSONObject, "EXOPLAYER_VERSION", this.B);
        xu.d.Y(jSONObject, "EXOPLAYER_DASH_AVAILABLE", this.C);
        xu.d.Y(jSONObject, "EXOPLAYER_DASH_INFERRED_VERSION", this.D);
        xu.d.Y(jSONObject, "EXOPLAYER_HLS_AVAILABLE", this.E);
        xu.d.Y(jSONObject, "EXOPLAYER_HLS_INFERRED_VERSION", this.F);
        xu.d.Y(jSONObject, "KOTLIN_VERSION", this.G);
        xu.d.Y(jSONObject, "ANDROID_MIN_SDK", this.H);
        xu.d.Y(jSONObject, "APP_STANDBY_BUCKET", this.I);
        String str = this.J;
        xu.d.Y(jSONObject, "SDK_DATA_USAGE_INFO", str);
        xu.d.Y(jSONObject, "SDK_DATA_USAGE_INFO", str);
        ak.s sVar = this.K;
        xu.d.Y(jSONObject, "CONNECTION_ID", sVar != null ? sVar.f656a : null);
        xu.d.Y(jSONObject, "CONNECTION_START_TIME", sVar != null ? sVar.f659d : null);
        xu.d.Y(jSONObject, "ACCESS_POINT_NAME", this.L);
        xu.d.Y(jSONObject, "SIM_CARRIER_ID", this.M);
        xu.d.Y(jSONObject, "MEDIA3_VERSION", this.N);
        xu.d.Y(jSONObject, "MEDIA3_DASH_AVAILABLE", this.O);
        xu.d.Y(jSONObject, "MEDIA3_HLS_AVAILABLE", this.P);
        xu.d.Y(jSONObject, "LAST_PUBLIC_IPS", this.Q);
    }

    public final int hashCode() {
        int iC = c7.a.C(this.k, c7.a.g(this.j, c7.a.C(this.f17868i, c7.a.g(this.f17867h, h0.b.b(h0.b.b(c7.a.g(this.f17864e, c7.a.g(this.f17863d, c7.a.g(this.f17862c, h0.b.b(Long.hashCode(this.f17860a) * 31, 31, this.f17861b), 31), 31), 31), 31, this.f17865f), 31, this.f17866g), 31), 31), 31), 31);
        Integer num = this.f17869l;
        int iB = w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(w.g.b(c7.a.g(this.f17874q, c7.a.C(this.f17873p, c7.a.C(this.f17872o, c7.a.g(this.f17871n, h0.b.b((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.f17870m), 31), 31), 31), 31), this.f17875r, 31), this.f17876s, 31), this.f17877t, 31), this.f17878u, 31), this.f17879v, 31), this.f17880w, 31), this.f17881x, 31), this.f17882y, 31), this.f17883z, 31), this.A, 31);
        String str = this.B;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.C;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.D;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.E;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.F;
        int iG = c7.a.g(this.G, (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        Integer num2 = this.H;
        int iHashCode5 = (iG + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.I;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.J;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ak.s sVar = this.K;
        int iHashCode8 = (iHashCode7 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str5 = this.L;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.M;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.N;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool3 = this.O;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.P;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str7 = this.Q;
        return iHashCode13 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DailyResult(id=");
        sb2.append(this.f17860a);
        sb2.append(", taskId=");
        sb2.append(this.f17861b);
        sb2.append(", taskName=");
        sb2.append(this.f17862c);
        sb2.append(", jobType=");
        sb2.append(this.f17863d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f17864e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f17865f);
        sb2.append(", clientVersionCode=");
        sb2.append(this.f17866g);
        sb2.append(", sdkVersionCode=");
        sb2.append(this.f17867h);
        sb2.append(", databaseVersionCode=");
        sb2.append(this.f17868i);
        sb2.append(", androidVrsCode=");
        sb2.append(this.j);
        sb2.append(", androidSdkVersion=");
        sb2.append(this.k);
        sb2.append(", androidSdkFullVersion=");
        sb2.append(this.f17869l);
        sb2.append(", clientVrsCode=");
        sb2.append(this.f17870m);
        sb2.append(", cohortId=");
        sb2.append(this.f17871n);
        sb2.append(", reportConfigRevision=");
        sb2.append(this.f17872o);
        sb2.append(", reportConfigId=");
        sb2.append(this.f17873p);
        sb2.append(", configHash=");
        sb2.append(this.f17874q);
        sb2.append(", networkRoaming=");
        sb2.append(this.f17875r);
        sb2.append(", hasReadPhoneStatePermission=");
        sb2.append(this.f17876s);
        sb2.append(", hasReadBasicPhoneStatePermission=");
        sb2.append(this.f17877t);
        sb2.append(", hasFineLocationPermission=");
        sb2.append(this.f17878u);
        sb2.append(", hasCoarseLocationPermission=");
        sb2.append(this.f17879v);
        sb2.append(", hasBackgroundLocationPermission=");
        sb2.append(this.f17880w);
        sb2.append(", hasAccessWifiStatePermission=");
        sb2.append(this.f17881x);
        sb2.append(", hasAccessNetworkStatePermission=");
        sb2.append(this.f17882y);
        sb2.append(", hasReceiveBootCompletedPermission=");
        sb2.append(this.f17883z);
        sb2.append(", hasIgnoreBatteryOptimizations=");
        sb2.append(this.A);
        sb2.append(", exoplayerVersion=");
        sb2.append(this.B);
        sb2.append(", exoplayerDashAvailable=");
        sb2.append(this.C);
        sb2.append(", exoplayerDashInferredVersion=");
        sb2.append(this.D);
        sb2.append(", exoplayerHlsAvailable=");
        sb2.append(this.E);
        sb2.append(", exoplayerHlsInferredVersion=");
        sb2.append(this.F);
        sb2.append(", kotlinVersion=");
        sb2.append(this.G);
        sb2.append(", androidMinSdk=");
        sb2.append(this.H);
        sb2.append(", appStandbyBucket=");
        sb2.append(this.I);
        sb2.append(", sdkDataUsageInfo=");
        sb2.append(this.J);
        sb2.append(", deviceConnection=");
        sb2.append(this.K);
        sb2.append(", accessPointName=");
        sb2.append(this.L);
        sb2.append(", simCarrierId=");
        sb2.append(this.M);
        sb2.append(", media3Version=");
        sb2.append(this.N);
        sb2.append(", media3DashAvailable=");
        sb2.append(this.O);
        sb2.append(", media3HlsAvailable=");
        sb2.append(this.P);
        sb2.append(", lastPublicIps=");
        return h0.b.r(sb2, this.Q, ')');
    }
}
