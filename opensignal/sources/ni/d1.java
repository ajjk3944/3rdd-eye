package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d1 extends f1 {
    public final String A;
    public final int B;
    public final int C;
    public final String D;
    public final int E;
    public final int F;
    public final double G;
    public final double H;
    public final double I;
    public final int J;
    public final int K;
    public final int L;
    public final String M;
    public final int N;
    public final long O;
    public final String P;
    public final String Q;
    public final Boolean R;
    public final String S;
    public final Boolean T;
    public final String U;
    public final Boolean V;
    public final String W;
    public final Boolean X;
    public final Boolean Y;

    /* renamed from: b, reason: collision with root package name */
    public final long f17741b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17742c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17743d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17744e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17745f;

    /* renamed from: g, reason: collision with root package name */
    public final long f17746g;

    /* renamed from: h, reason: collision with root package name */
    public final long f17747h;

    /* renamed from: i, reason: collision with root package name */
    public final long f17748i;
    public final long j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final long f17749l;

    /* renamed from: m, reason: collision with root package name */
    public final long f17750m;

    /* renamed from: n, reason: collision with root package name */
    public final String f17751n;

    /* renamed from: o, reason: collision with root package name */
    public final String f17752o;

    /* renamed from: p, reason: collision with root package name */
    public final String f17753p;

    /* renamed from: q, reason: collision with root package name */
    public final String f17754q;

    /* renamed from: r, reason: collision with root package name */
    public final String f17755r;

    /* renamed from: s, reason: collision with root package name */
    public final long f17756s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f17757t;

    /* renamed from: u, reason: collision with root package name */
    public final String f17758u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f17759v;

    /* renamed from: w, reason: collision with root package name */
    public final String f17760w;

    /* renamed from: x, reason: collision with root package name */
    public final String f17761x;

    /* renamed from: y, reason: collision with root package name */
    public final long f17762y;

    /* renamed from: z, reason: collision with root package name */
    public final long f17763z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(long j, long j7, String str, String str2, String str3, long j10, long j11, long j12, long j13, long j14, long j15, long j16, String str4, String str5, String str6, String str7, String str8, long j17, boolean z10, String str9, boolean z11, String str10, String str11, long j18, long j19, String str12, int i10, int i11, String str13, int i12, int i13, double d6, double d10, double d11, int i14, int i15, int i16, String str14, int i17, long j20, String str15, String str16, Boolean bool, String str17, Boolean bool2, String str18, Boolean bool3, String str19, Boolean bool4, Boolean bool5) {
        super(false);
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        br.l.e(str5, "traffic");
        br.l.e(str6, "platformTested");
        br.l.e(str7, "interfaceUsed");
        br.l.e(str8, "resourceUsed");
        br.l.e(str9, "requestedQuality");
        br.l.e(str10, "host");
        br.l.e(str11, "ip");
        br.l.e(str12, "mime");
        br.l.e(str13, "codec");
        br.l.e(str14, "bufferingUpdates");
        br.l.e(str15, "screenInfo");
        this.f17741b = j;
        this.f17742c = j7;
        this.f17743d = str;
        this.f17744e = str2;
        this.f17745f = str3;
        this.f17746g = j10;
        this.f17747h = j11;
        this.f17748i = j12;
        this.j = j13;
        this.k = j14;
        this.f17749l = j15;
        this.f17750m = j16;
        this.f17751n = str4;
        this.f17752o = str5;
        this.f17753p = str6;
        this.f17754q = str7;
        this.f17755r = str8;
        this.f17756s = j17;
        this.f17757t = z10;
        this.f17758u = str9;
        this.f17759v = z11;
        this.f17760w = str10;
        this.f17761x = str11;
        this.f17762y = j18;
        this.f17763z = j19;
        this.A = str12;
        this.B = i10;
        this.C = i11;
        this.D = str13;
        this.E = i12;
        this.F = i13;
        this.G = d6;
        this.H = d10;
        this.I = d11;
        this.J = i14;
        this.K = i15;
        this.L = i16;
        this.M = str14;
        this.N = i17;
        this.O = j20;
        this.P = str15;
        this.Q = str16;
        this.R = bool;
        this.S = str17;
        this.T = bool2;
        this.U = str18;
        this.V = bool3;
        this.W = str19;
        this.X = bool4;
        this.Y = bool5;
    }

    @Override // vj.c
    public final String a() {
        return this.f17745f;
    }

    @Override // vj.c
    public final long b() {
        return this.f17741b;
    }

    @Override // vj.c
    public final String c() {
        return this.f17744e;
    }

    @Override // vj.c
    public final long d() {
        return this.f17742c;
    }

    @Override // vj.c
    public final String e() {
        return this.f17743d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f17741b == d1Var.f17741b && this.f17742c == d1Var.f17742c && br.l.a(this.f17743d, d1Var.f17743d) && br.l.a(this.f17744e, d1Var.f17744e) && br.l.a(this.f17745f, d1Var.f17745f) && this.f17746g == d1Var.f17746g && this.f17747h == d1Var.f17747h && this.f17748i == d1Var.f17748i && this.j == d1Var.j && this.k == d1Var.k && this.f17749l == d1Var.f17749l && this.f17750m == d1Var.f17750m && br.l.a(this.f17751n, d1Var.f17751n) && br.l.a(this.f17752o, d1Var.f17752o) && br.l.a(this.f17753p, d1Var.f17753p) && br.l.a(this.f17754q, d1Var.f17754q) && br.l.a(this.f17755r, d1Var.f17755r) && this.f17756s == d1Var.f17756s && this.f17757t == d1Var.f17757t && br.l.a(this.f17758u, d1Var.f17758u) && this.f17759v == d1Var.f17759v && br.l.a(this.f17760w, d1Var.f17760w) && br.l.a(this.f17761x, d1Var.f17761x) && this.f17762y == d1Var.f17762y && this.f17763z == d1Var.f17763z && br.l.a(this.A, d1Var.A) && this.B == d1Var.B && this.C == d1Var.C && br.l.a(this.D, d1Var.D) && this.E == d1Var.E && this.F == d1Var.F && Double.compare(this.G, d1Var.G) == 0 && Double.compare(this.H, d1Var.H) == 0 && Double.compare(this.I, d1Var.I) == 0 && this.J == d1Var.J && this.K == d1Var.K && this.L == d1Var.L && br.l.a(this.M, d1Var.M) && this.N == d1Var.N && this.O == d1Var.O && br.l.a(this.P, d1Var.P) && br.l.a(this.Q, d1Var.Q) && br.l.a(this.R, d1Var.R) && br.l.a(this.S, d1Var.S) && br.l.a(this.T, d1Var.T) && br.l.a(this.U, d1Var.U) && br.l.a(this.V, d1Var.V) && br.l.a(this.W, d1Var.W) && br.l.a(this.X, d1Var.X) && br.l.a(this.Y, d1Var.Y);
    }

    @Override // vj.c
    public final long f() {
        return this.f17746g;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("is_progress_result", false);
        jSONObject.put("KEY_INITIALISATION_TIME", this.f17747h);
        jSONObject.put("KEY_TIME_TO_FIRST_FRAME", this.f17748i);
        jSONObject.put("KEY_BUFFERING_TIME", this.j);
        jSONObject.put("KEY_BUFFERING_COUNTER", this.k);
        jSONObject.put("KEY_SEEKING_TIME", this.f17749l);
        jSONObject.put("KEY_SEEKING_COUNTER", this.f17750m);
        jSONObject.put("KEY_EVENTS", this.f17751n);
        jSONObject.put("KEY_TRAFFIC", this.f17752o);
        jSONObject.put("KEY_PLATFORM_TESTED", this.f17753p);
        jSONObject.put("KEY_INTERFACE_USED", this.f17754q);
        jSONObject.put("KEY_RESOURCE_USED", this.f17755r);
        jSONObject.put("KEY_RESOURCE_DURATION", this.f17756s);
        jSONObject.put("KEY_NETWORK_CHANGED", this.f17757t);
        jSONObject.put("KEY_REQUESTED_QUALITY", this.f17758u);
        jSONObject.put("KEY_QUALITY_CHANGED", this.f17759v);
        jSONObject.put("KEY_HOST", this.f17760w);
        jSONObject.put("KEY_IP", this.f17761x);
        jSONObject.put("KEY_TEST_DURATION", this.f17762y);
        jSONObject.put("KEY_BITRATE", this.f17763z);
        jSONObject.put("KEY_MIME", this.A);
        jSONObject.put("KEY_VIDEO_HEIGHT", this.C);
        jSONObject.put("KEY_VIDEO_WIDTH", this.B);
        jSONObject.put("KEY_CODEC", this.D);
        jSONObject.put("KEY_PROFILE", this.E);
        jSONObject.put("KEY_LEVEL", this.F);
        jSONObject.put("KEY_INITIAL_BUFFER_TIME", this.G);
        jSONObject.put("KEY_STALLING_RATIO", this.H);
        jSONObject.put("KEY_VIDEO_PLAY_DURATION", this.I);
        jSONObject.put("KEY_VIDEO_RESOLUTION", this.J);
        jSONObject.put("KEY_VIDEO_CODE", this.K);
        jSONObject.put("KEY_VIDEO_CODE_PROFILE", this.L);
        jSONObject.put("KEY_BUFFERING_UPDATES", this.M);
        jSONObject.put("KEY_TIMEOUT_REASON", this.N);
        jSONObject.put("KEY_REQUESTED_VIDEO_LENGTH", this.O);
        xu.d.Y(jSONObject, "KEY_SCREEN_INFO", this.P);
        xu.d.Y(jSONObject, "EXOPLAYER_VERSION", this.Q);
        xu.d.Y(jSONObject, "EXOPLAYER_DASH_AVAILABLE", this.R);
        xu.d.Y(jSONObject, "EXOPLAYER_DASH_INFERRED_VERSION", this.S);
        xu.d.Y(jSONObject, "EXOPLAYER_HLS_AVAILABLE", this.T);
        xu.d.Y(jSONObject, "EXOPLAYER_HLS_INFERRED_VERSION", this.U);
        xu.d.Y(jSONObject, "KEY_IGNORE_SCREEN_RESOLUTION", this.V);
        xu.d.Y(jSONObject, "MEDIA3_VERSION", this.W);
        xu.d.Y(jSONObject, "MEDIA3_DASH_AVAILABLE", this.Y);
        xu.d.Y(jSONObject, "MEDIA3_HLS_AVAILABLE", this.X);
    }

    public final int hashCode() {
        int iG = c7.a.g(this.P, h0.b.b(c7.a.C(this.N, c7.a.g(this.M, c7.a.C(this.L, c7.a.C(this.K, c7.a.C(this.J, h0.b.a(this.I, h0.b.a(this.H, h0.b.a(this.G, c7.a.C(this.F, c7.a.C(this.E, c7.a.g(this.D, c7.a.C(this.C, c7.a.C(this.B, c7.a.g(this.A, h0.b.b(h0.b.b(c7.a.g(this.f17761x, c7.a.g(this.f17760w, w.g.b(c7.a.g(this.f17758u, w.g.b(h0.b.b(c7.a.g(this.f17755r, c7.a.g(this.f17754q, c7.a.g(this.f17753p, c7.a.g(this.f17752o, c7.a.g(this.f17751n, h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(c7.a.g(this.f17745f, c7.a.g(this.f17744e, c7.a.g(this.f17743d, h0.b.b(Long.hashCode(this.f17741b) * 31, 31, this.f17742c), 31), 31), 31), 31, this.f17746g), 31, this.f17747h), 31, this.f17748i), 31, this.j), 31, this.k), 31, this.f17749l), 31, this.f17750m), 31), 31), 31), 31), 31), 31, this.f17756s), this.f17757t, 31), 31), this.f17759v, 31), 31), 31), 31, this.f17762y), 31, this.f17763z), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.O), 31);
        String str = this.Q;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.R;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.S;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.T;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.U;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.V;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.W;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool4 = this.X;
        int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.Y;
        return iHashCode8 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @Override // ni.f1
    public final f1 i(long j) {
        String str = this.f17743d;
        br.l.e(str, "taskName");
        String str2 = this.f17744e;
        br.l.e(str2, "jobType");
        String str3 = this.f17745f;
        br.l.e(str3, "dataEndpoint");
        String str4 = this.f17751n;
        br.l.e(str4, "events");
        String str5 = this.f17752o;
        br.l.e(str5, "traffic");
        String str6 = this.f17753p;
        br.l.e(str6, "platformTested");
        String str7 = this.f17754q;
        br.l.e(str7, "interfaceUsed");
        String str8 = this.f17755r;
        br.l.e(str8, "resourceUsed");
        String str9 = this.f17758u;
        br.l.e(str9, "requestedQuality");
        String str10 = this.f17760w;
        br.l.e(str10, "host");
        String str11 = this.f17761x;
        br.l.e(str11, "ip");
        String str12 = this.A;
        br.l.e(str12, "mime");
        String str13 = this.D;
        br.l.e(str13, "codec");
        String str14 = this.M;
        br.l.e(str14, "bufferingUpdates");
        String str15 = this.P;
        br.l.e(str15, "screenInfo");
        return new d1(j, this.f17742c, str, str2, str3, this.f17746g, this.f17747h, this.f17748i, this.j, this.k, this.f17749l, this.f17750m, str4, str5, str6, str7, str8, this.f17756s, this.f17757t, str9, this.f17759v, str10, str11, this.f17762y, this.f17763z, str12, this.B, this.C, str13, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, str14, this.N, this.O, str15, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y);
    }

    public final String toString() {
        return "VideoCompleteResult(id=" + this.f17741b + ", taskId=" + this.f17742c + ", taskName=" + this.f17743d + ", jobType=" + this.f17744e + ", dataEndpoint=" + this.f17745f + ", timeOfResult=" + this.f17746g + ", initialisationTime=" + this.f17747h + ", timeToFirstFrame=" + this.f17748i + ", bufferingTime=" + this.j + ", bufferingCounter=" + this.k + ", seekingTime=" + this.f17749l + ", seekingCounter=" + this.f17750m + ", events=" + this.f17751n + ", traffic=" + this.f17752o + ", platformTested=" + this.f17753p + ", interfaceUsed=" + this.f17754q + ", resourceUsed=" + this.f17755r + ", resourceDuration=" + this.f17756s + ", networkChanged=" + this.f17757t + ", requestedQuality=" + this.f17758u + ", qualityChanged=" + this.f17759v + ", host=" + this.f17760w + ", ip=" + this.f17761x + ", testDuration=" + this.f17762y + ", bitrate=" + this.f17763z + ", mime=" + this.A + ", videoWidth=" + this.B + ", videoHeight=" + this.C + ", codec=" + this.D + ", profile=" + this.E + ", level=" + this.F + ", initialBufferTime=" + this.G + ", stallingRatio=" + this.H + ", videoPlayDuration=" + this.I + ", videoResolution=" + this.J + ", videoCode=" + this.K + ", videoCodeProfile=" + this.L + ", bufferingUpdates=" + this.M + ", timeoutReason=" + this.N + ", requestedVideoLength=" + this.O + ", screenInfo=" + this.P + ", exoplayerVersion=" + this.Q + ", exoplayerDashAvailable=" + this.R + ", exoplayerDashInferredVersion=" + this.S + ", exoplayerHlsAvailable=" + this.T + ", exoplayerHlsInferredVersion=" + this.U + ", ignoreScreenResolution=" + this.V + ", media3Version=" + this.W + ", media3HlsAvailable=" + this.X + ", media3DashAvailable=" + this.Y + ')';
    }
}
