package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18039a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18040b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18041c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18042d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18043e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18044f;

    /* renamed from: g, reason: collision with root package name */
    public final long f18045g;

    /* renamed from: h, reason: collision with root package name */
    public final long f18046h;

    /* renamed from: i, reason: collision with root package name */
    public final long f18047i;
    public final long j;
    public final Long k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18048l;

    /* renamed from: m, reason: collision with root package name */
    public final String f18049m;

    /* renamed from: n, reason: collision with root package name */
    public final String f18050n;

    /* renamed from: o, reason: collision with root package name */
    public final String f18051o;

    /* renamed from: p, reason: collision with root package name */
    public final String f18052p;

    /* renamed from: q, reason: collision with root package name */
    public final int f18053q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18054r;

    /* renamed from: s, reason: collision with root package name */
    public final String f18055s;

    /* renamed from: t, reason: collision with root package name */
    public final long f18056t;

    public n(long j, long j7, String str, String str2, String str3, long j10, long j11, long j12, long j13, long j14, Long l10, String str4, String str5, String str6, String str7, String str8, int i10, int i11, String str9, long j15) {
        br.l.e(str, "taskName");
        br.l.e(str3, "dataEndpoint");
        br.l.e(str6, "downloadCdnName");
        br.l.e(str7, "downloadIp");
        br.l.e(str8, "downloadHost");
        this.f18039a = j;
        this.f18040b = j7;
        this.f18041c = str;
        this.f18042d = str2;
        this.f18043e = str3;
        this.f18044f = j10;
        this.f18045g = j11;
        this.f18046h = j12;
        this.f18047i = j13;
        this.j = j14;
        this.k = l10;
        this.f18048l = str4;
        this.f18049m = str5;
        this.f18050n = str6;
        this.f18051o = str7;
        this.f18052p = str8;
        this.f18053q = i10;
        this.f18054r = i11;
        this.f18055s = str9;
        this.f18056t = j15;
    }

    public static n i(n nVar, long j) {
        long j7 = nVar.f18040b;
        String str = nVar.f18041c;
        String str2 = nVar.f18042d;
        String str3 = nVar.f18043e;
        long j10 = nVar.f18044f;
        long j11 = nVar.f18045g;
        long j12 = nVar.f18046h;
        long j13 = nVar.f18047i;
        long j14 = nVar.j;
        Long l10 = nVar.k;
        String str4 = nVar.f18048l;
        String str5 = nVar.f18049m;
        String str6 = nVar.f18050n;
        String str7 = nVar.f18051o;
        String str8 = nVar.f18052p;
        int i10 = nVar.f18053q;
        int i11 = nVar.f18054r;
        String str9 = nVar.f18055s;
        long j15 = nVar.f18056t;
        br.l.e(str, "taskName");
        br.l.e(str3, "dataEndpoint");
        br.l.e(str6, "downloadCdnName");
        br.l.e(str7, "downloadIp");
        br.l.e(str8, "downloadHost");
        return new n(j, j7, str, str2, str3, j10, j11, j12, j13, j14, l10, str4, str5, str6, str7, str8, i10, i11, str9, j15);
    }

    @Override // vj.c
    public final String a() {
        return this.f18043e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18039a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18042d;
    }

    @Override // vj.c
    public final long d() {
        return this.f18040b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18041c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f18039a == nVar.f18039a && this.f18040b == nVar.f18040b && br.l.a(this.f18041c, nVar.f18041c) && br.l.a(this.f18042d, nVar.f18042d) && br.l.a(this.f18043e, nVar.f18043e) && this.f18044f == nVar.f18044f && this.f18045g == nVar.f18045g && this.f18046h == nVar.f18046h && this.f18047i == nVar.f18047i && this.j == nVar.j && br.l.a(this.k, nVar.k) && br.l.a(this.f18048l, nVar.f18048l) && br.l.a(this.f18049m, nVar.f18049m) && br.l.a(this.f18050n, nVar.f18050n) && br.l.a(this.f18051o, nVar.f18051o) && br.l.a(this.f18052p, nVar.f18052p) && this.f18053q == nVar.f18053q && this.f18054r == nVar.f18054r && br.l.a(this.f18055s, nVar.f18055s) && this.f18056t == nVar.f18056t;
    }

    @Override // vj.c
    public final long f() {
        return this.f18044f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("download_time_response", this.f18045g);
        jSONObject.put("download_speed", this.f18046h);
        jSONObject.put("trimmed_download_speed", this.f18047i);
        jSONObject.put("download_file_size", this.j);
        jSONObject.put("download_last_time", this.k);
        jSONObject.put("download_file_sizes", this.f18048l);
        jSONObject.put("download_times", this.f18049m);
        jSONObject.put("download_cdn_name", this.f18050n);
        jSONObject.put("download_ip", this.f18051o);
        jSONObject.put("download_host", this.f18052p);
        jSONObject.put("download_thread_count", this.f18053q);
        jSONObject.put("download_unreliability", this.f18054r);
        jSONObject.put("download_events", this.f18055s);
        jSONObject.put("download_test_duration", this.f18056t);
    }

    public final int hashCode() {
        int iB = h0.b.b(h0.b.b(h0.b.b(h0.b.b(h0.b.b(c7.a.g(this.f18043e, c7.a.g(this.f18042d, c7.a.g(this.f18041c, h0.b.b(Long.hashCode(this.f18039a) * 31, 31, this.f18040b), 31), 31), 31), 31, this.f18044f), 31, this.f18045g), 31, this.f18046h), 31, this.f18047i), 31, this.j);
        Long l10 = this.k;
        int iHashCode = (iB + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.f18048l;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18049m;
        int iC = c7.a.C(this.f18054r, c7.a.C(this.f18053q, c7.a.g(this.f18052p, c7.a.g(this.f18051o, c7.a.g(this.f18050n, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31), 31);
        String str3 = this.f18055s;
        return Long.hashCode(this.f18056t) + ((iC + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DownloadSpeedResult(id=");
        sb2.append(this.f18039a);
        sb2.append(", taskId=");
        sb2.append(this.f18040b);
        sb2.append(", taskName=");
        sb2.append(this.f18041c);
        sb2.append(", jobType=");
        sb2.append(this.f18042d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18043e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18044f);
        sb2.append(", downloadTimeResponse=");
        sb2.append(this.f18045g);
        sb2.append(", downloadSpeed=");
        sb2.append(this.f18046h);
        sb2.append(", trimmedDownloadSpeed=");
        sb2.append(this.f18047i);
        sb2.append(", downloadFileSize=");
        sb2.append(this.j);
        sb2.append(", lastDownloadTime=");
        sb2.append(this.k);
        sb2.append(", downloadedFileSizes=");
        sb2.append(this.f18048l);
        sb2.append(", downloadTimes=");
        sb2.append(this.f18049m);
        sb2.append(", downloadCdnName=");
        sb2.append(this.f18050n);
        sb2.append(", downloadIp=");
        sb2.append(this.f18051o);
        sb2.append(", downloadHost=");
        sb2.append(this.f18052p);
        sb2.append(", downloadThreadsCount=");
        sb2.append(this.f18053q);
        sb2.append(", downloadUnreliability=");
        sb2.append(this.f18054r);
        sb2.append(", downloadEvents=");
        sb2.append(this.f18055s);
        sb2.append(", testDuration=");
        return w.g.h(sb2, this.f18056t, ')');
    }
}
