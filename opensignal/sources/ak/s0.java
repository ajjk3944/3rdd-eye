package ak;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f673a;

    /* renamed from: b, reason: collision with root package name */
    public final int f674b;

    /* renamed from: c, reason: collision with root package name */
    public final int f675c;

    /* renamed from: d, reason: collision with root package name */
    public final int f676d;

    /* renamed from: e, reason: collision with root package name */
    public final int f677e;

    /* renamed from: f, reason: collision with root package name */
    public final long f678f;

    /* renamed from: g, reason: collision with root package name */
    public final int f679g;

    /* renamed from: h, reason: collision with root package name */
    public final long f680h;

    /* renamed from: i, reason: collision with root package name */
    public final int f681i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final long f682l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f683m;

    /* renamed from: n, reason: collision with root package name */
    public final int f684n;

    /* renamed from: o, reason: collision with root package name */
    public final int f685o;

    /* renamed from: p, reason: collision with root package name */
    public final int f686p;

    /* renamed from: q, reason: collision with root package name */
    public final long f687q;

    /* renamed from: r, reason: collision with root package name */
    public final int f688r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f689s;

    /* renamed from: t, reason: collision with root package name */
    public final long f690t;

    /* renamed from: u, reason: collision with root package name */
    public final int f691u;

    /* renamed from: v, reason: collision with root package name */
    public final int f692v;

    /* renamed from: w, reason: collision with root package name */
    public final int f693w;

    /* renamed from: x, reason: collision with root package name */
    public final int f694x;

    /* renamed from: y, reason: collision with root package name */
    public final x0 f695y;

    public s0(int i10, int i11, int i12, int i13, int i14, long j, int i15, long j7, int i16, int i17, int i18, long j10, boolean z10, int i19, int i20, int i21, long j11, int i22, boolean z11, long j12, int i23, int i24, int i25, int i26, x0 x0Var) {
        this.f673a = i10;
        this.f674b = i11;
        this.f675c = i12;
        this.f676d = i13;
        this.f677e = i14;
        this.f678f = j;
        this.f679g = i15;
        this.f680h = j7;
        this.f681i = i16;
        this.j = i17;
        this.k = i18;
        this.f682l = j10;
        this.f683m = z10;
        this.f684n = i19;
        this.f685o = i20;
        this.f686p = i21;
        this.f687q = j11;
        this.f688r = i22;
        this.f689s = z11;
        this.f690t = j12;
        this.f691u = i23;
        this.f692v = i24;
        this.f693w = i25;
        this.f694x = i26;
        this.f695y = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f673a == s0Var.f673a && this.f674b == s0Var.f674b && this.f675c == s0Var.f675c && this.f676d == s0Var.f676d && this.f677e == s0Var.f677e && this.f678f == s0Var.f678f && this.f679g == s0Var.f679g && this.f680h == s0Var.f680h && this.f681i == s0Var.f681i && this.j == s0Var.j && this.k == s0Var.k && this.f682l == s0Var.f682l && this.f683m == s0Var.f683m && this.f684n == s0Var.f684n && this.f685o == s0Var.f685o && this.f686p == s0Var.f686p && this.f687q == s0Var.f687q && this.f688r == s0Var.f688r && this.f689s == s0Var.f689s && this.f690t == s0Var.f690t && this.f691u == s0Var.f691u && this.f692v == s0Var.f692v && this.f693w == s0Var.f693w && this.f694x == s0Var.f694x && br.l.a(this.f695y, s0Var.f695y);
    }

    public final int hashCode() {
        return this.f695y.hashCode() + c7.a.C(this.f694x, c7.a.C(this.f693w, c7.a.C(this.f692v, c7.a.C(this.f691u, h0.b.b(w.g.b(c7.a.C(this.f688r, h0.b.b(c7.a.C(this.f686p, c7.a.C(this.f685o, c7.a.C(this.f684n, w.g.b(h0.b.b(c7.a.C(this.k, c7.a.C(this.j, c7.a.C(this.f681i, h0.b.b(c7.a.C(this.f679g, h0.b.b(c7.a.C(this.f677e, c7.a.C(this.f676d, c7.a.C(this.f675c, c7.a.C(this.f674b, Integer.hashCode(this.f673a) * 31, 31), 31), 31), 31), 31, this.f678f), 31), 31, this.f680h), 31), 31), 31), 31, this.f682l), this.f683m, 31), 31), 31), 31), 31, this.f687q), 31), this.f689s, 31), 31, this.f690t), 31), 31), 31), 31);
    }

    public final String toString() {
        return "SpeedTestConfig(downloadDurationBg=" + this.f673a + ", downloadDurationFg=" + this.f674b + ", downloadDurationFgWifi=" + this.f675c + ", uploadDurationFgWifi=" + this.f676d + ", downloadThreads=" + this.f677e + ", downloadThresholdInKilobytes=" + this.f678f + ", downloadTimeout=" + this.f679g + ", downloadTrafficDataFrequencyMs=" + this.f680h + ", numPings=" + this.f681i + ", pingMaxDuration=" + this.j + ", pingTimeout=" + this.k + ", pingWaitTime=" + this.f682l + ", waitForAllLatencyTests=" + this.f683m + ", uploadDurationBg=" + this.f684n + ", uploadDurationFg=" + this.f685o + ", uploadThreads=" + this.f686p + ", uploadThresholdInKilobytes=" + this.f687q + ", uploadTimeout=" + this.f688r + ", randomizeLatencyUrlsOrder=" + this.f689s + ", uploadTrafficDataFrequencyMs=" + this.f690t + ", cloudfrontChunkingMethod=" + this.f691u + ", cloudfrontChunkSize=" + this.f692v + ", cloudflareChunkingMethod=" + this.f693w + ", cloudflareChunkSize=" + this.f694x + ", testConfig=" + this.f695y + ')';
    }
}
