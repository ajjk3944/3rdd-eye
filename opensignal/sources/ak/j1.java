package ak;

import java.util.List;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f579a;

    /* renamed from: b, reason: collision with root package name */
    public final int f580b;

    /* renamed from: c, reason: collision with root package name */
    public final int f581c;

    /* renamed from: d, reason: collision with root package name */
    public final int f582d;

    /* renamed from: e, reason: collision with root package name */
    public final long f583e;

    /* renamed from: f, reason: collision with root package name */
    public final long f584f;

    /* renamed from: g, reason: collision with root package name */
    public final long f585g;

    /* renamed from: h, reason: collision with root package name */
    public final long f586h;

    /* renamed from: i, reason: collision with root package name */
    public final long f587i;
    public final List j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final String f588l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f589m;

    /* renamed from: n, reason: collision with root package name */
    public final int f590n;

    /* renamed from: o, reason: collision with root package name */
    public final y f591o;

    /* renamed from: p, reason: collision with root package name */
    public final String f592p;

    /* renamed from: q, reason: collision with root package name */
    public final String f593q;

    /* renamed from: r, reason: collision with root package name */
    public final String f594r;

    /* renamed from: s, reason: collision with root package name */
    public final a f595s;

    /* renamed from: t, reason: collision with root package name */
    public final String f596t;

    /* renamed from: u, reason: collision with root package name */
    public final String f597u;

    /* renamed from: v, reason: collision with root package name */
    public final long f598v;

    public j1(int i10, int i11, int i12, int i13, long j, long j7, long j10, long j11, long j12, List list, long j13, String str, boolean z10, int i14, y yVar, String str2, String str3, String str4, a aVar, String str5, String str6, long j14) {
        br.l.e(list, "tests");
        br.l.e(str, "youtubeUrlFormat");
        br.l.e(str2, "youtubeConsentUrl");
        br.l.e(str3, "youtubePlayerResponseRegex");
        br.l.e(str4, "youtubeConsentFormParamsRegex");
        br.l.e(str5, "remoteUrlEndpoint");
        this.f579a = i10;
        this.f580b = i11;
        this.f581c = i12;
        this.f582d = i13;
        this.f583e = j;
        this.f584f = j7;
        this.f585g = j10;
        this.f586h = j11;
        this.f587i = j12;
        this.j = list;
        this.k = j13;
        this.f588l = str;
        this.f589m = z10;
        this.f590n = i14;
        this.f591o = yVar;
        this.f592p = str2;
        this.f593q = str3;
        this.f594r = str4;
        this.f595s = aVar;
        this.f596t = str5;
        this.f597u = str6;
        this.f598v = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.f579a == j1Var.f579a && this.f580b == j1Var.f580b && this.f581c == j1Var.f581c && this.f582d == j1Var.f582d && this.f583e == j1Var.f583e && this.f584f == j1Var.f584f && this.f585g == j1Var.f585g && this.f586h == j1Var.f586h && this.f587i == j1Var.f587i && br.l.a(this.j, j1Var.j) && this.k == j1Var.k && br.l.a(this.f588l, j1Var.f588l) && this.f589m == j1Var.f589m && this.f590n == j1Var.f590n && br.l.a(this.f591o, j1Var.f591o) && br.l.a(this.f592p, j1Var.f592p) && br.l.a(this.f593q, j1Var.f593q) && br.l.a(this.f594r, j1Var.f594r) && br.l.a(this.f595s, j1Var.f595s) && br.l.a(this.f596t, j1Var.f596t) && br.l.a(this.f597u, j1Var.f597u) && this.f598v == j1Var.f598v;
    }

    public final int hashCode() {
        return Long.hashCode(this.f598v) + c7.a.g(this.f597u, c7.a.g(this.f596t, (this.f595s.hashCode() + c7.a.g(this.f594r, c7.a.g(this.f593q, c7.a.g(this.f592p, (this.f591o.hashCode() + c7.a.C(this.f590n, w.g.b(c7.a.g(this.f588l, h0.b.b(h0.b.c(h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(c7.a.C(this.f582d, c7.a.C(this.f581c, c7.a.C(this.f580b, Integer.hashCode(this.f579a) * 31, 31), 31), 31), 31, this.f583e), 31, this.f584f), 31, this.f585g), 31, this.f586h), 31, this.f587i), 31, this.j), 31, this.k), 31), this.f589m, 31), 31)) * 31, 31), 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoConfig(bufferForPlaybackAfterRebufferMs=");
        sb2.append(this.f579a);
        sb2.append(", bufferForPlaybackMs=");
        sb2.append(this.f580b);
        sb2.append(", maxBufferMs=");
        sb2.append(this.f581c);
        sb2.append(", minBufferMs=");
        sb2.append(this.f582d);
        sb2.append(", testLength=");
        sb2.append(this.f583e);
        sb2.append(", globalTimeoutMs=");
        sb2.append(this.f584f);
        sb2.append(", initialisationTimeoutMs=");
        sb2.append(this.f585g);
        sb2.append(", bufferingTimeoutMs=");
        sb2.append(this.f586h);
        sb2.append(", seekingTimeoutMs=");
        sb2.append(this.f587i);
        sb2.append(", tests=");
        sb2.append(this.j);
        sb2.append(", videoInfoRequestTimeoutMs=");
        sb2.append(this.k);
        sb2.append(", youtubeUrlFormat=");
        sb2.append(this.f588l);
        sb2.append(", useExoplayerAnalyticsListener=");
        sb2.append(this.f589m);
        sb2.append(", youtubeParserVersion=");
        sb2.append(this.f590n);
        sb2.append(", innerTubeConfig=");
        sb2.append(this.f591o);
        sb2.append(", youtubeConsentUrl=");
        sb2.append(this.f592p);
        sb2.append(", youtubePlayerResponseRegex=");
        sb2.append(this.f593q);
        sb2.append(", youtubeConsentFormParamsRegex=");
        sb2.append(this.f594r);
        sb2.append(", adaptiveConfig=");
        sb2.append(this.f595s);
        sb2.append(", remoteUrlEndpoint=");
        sb2.append(this.f596t);
        sb2.append(", videoPlaybackLibrary=");
        sb2.append(this.f597u);
        sb2.append(", trafficStatsFrequencyMs=");
        return w.g.h(sb2, this.f598v, ')');
    }
}
