package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s0 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18128a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18129b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18130c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18131d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18132e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18133f;

    /* renamed from: g, reason: collision with root package name */
    public final double f18134g;

    /* renamed from: h, reason: collision with root package name */
    public final double f18135h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18136i;
    public final String j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18137l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18138m;

    /* renamed from: n, reason: collision with root package name */
    public final int f18139n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18140o;

    /* renamed from: p, reason: collision with root package name */
    public final String f18141p;

    /* renamed from: q, reason: collision with root package name */
    public final String f18142q;

    /* renamed from: r, reason: collision with root package name */
    public final String f18143r;

    /* renamed from: s, reason: collision with root package name */
    public final String f18144s;

    /* renamed from: t, reason: collision with root package name */
    public final String f18145t;

    public s0(long j, long j7, String str, long j10, String str2, String str3, double d6, double d10, String str4, String str5, long j11, int i10, int i11, int i12, int i13, String str6, String str7, String str8, String str9, String str10) {
        br.l.e(str, "taskName");
        br.l.e(str2, "dataEndpoint");
        br.l.e(str3, "jobType");
        this.f18128a = j;
        this.f18129b = j7;
        this.f18130c = str;
        this.f18131d = j10;
        this.f18132e = str2;
        this.f18133f = str3;
        this.f18134g = d6;
        this.f18135h = d10;
        this.f18136i = str4;
        this.j = str5;
        this.k = j11;
        this.f18137l = i10;
        this.f18138m = i11;
        this.f18139n = i12;
        this.f18140o = i13;
        this.f18141p = str6;
        this.f18142q = str7;
        this.f18143r = str8;
        this.f18144s = str9;
        this.f18145t = str10;
    }

    public static s0 i(s0 s0Var, long j) {
        long j7 = s0Var.f18129b;
        String str = s0Var.f18130c;
        long j10 = s0Var.f18131d;
        String str2 = s0Var.f18132e;
        String str3 = s0Var.f18133f;
        double d6 = s0Var.f18134g;
        double d10 = s0Var.f18135h;
        String str4 = s0Var.f18136i;
        String str5 = s0Var.j;
        long j11 = s0Var.k;
        int i10 = s0Var.f18137l;
        int i11 = s0Var.f18138m;
        int i12 = s0Var.f18139n;
        int i13 = s0Var.f18140o;
        String str6 = s0Var.f18141p;
        String str7 = s0Var.f18142q;
        String str8 = s0Var.f18143r;
        String str9 = s0Var.f18144s;
        String str10 = s0Var.f18145t;
        br.l.e(str, "taskName");
        br.l.e(str2, "dataEndpoint");
        br.l.e(str3, "jobType");
        return new s0(j, j7, str, j10, str2, str3, d6, d10, str4, str5, j11, i10, i11, i12, i13, str6, str7, str8, str9, str10);
    }

    @Override // vj.c
    public final String a() {
        return this.f18132e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18128a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18133f;
    }

    @Override // vj.c
    public final long d() {
        return this.f18129b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18130c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f18128a == s0Var.f18128a && this.f18129b == s0Var.f18129b && br.l.a(this.f18130c, s0Var.f18130c) && this.f18131d == s0Var.f18131d && br.l.a(this.f18132e, s0Var.f18132e) && br.l.a(this.f18133f, s0Var.f18133f) && Double.compare(this.f18134g, s0Var.f18134g) == 0 && Double.compare(this.f18135h, s0Var.f18135h) == 0 && br.l.a(this.f18136i, s0Var.f18136i) && br.l.a(this.j, s0Var.j) && this.k == s0Var.k && this.f18137l == s0Var.f18137l && this.f18138m == s0Var.f18138m && this.f18139n == s0Var.f18139n && this.f18140o == s0Var.f18140o && br.l.a(this.f18141p, s0Var.f18141p) && br.l.a(this.f18142q, s0Var.f18142q) && br.l.a(this.f18143r, s0Var.f18143r) && br.l.a(this.f18144s, s0Var.f18144s) && br.l.a(this.f18145t, s0Var.f18145t);
    }

    @Override // vj.c
    public final long f() {
        return this.f18131d;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("THROUGHPUT_DOWNLOAD_SPEED", this.f18134g);
        jSONObject.put("THROUGHPUT_DOWNLOAD_SPEED_TEST_BYTES_ONLY", this.f18135h);
        xu.d.Y(jSONObject, "THROUGHPUT_DOWNLOAD_TEST_SERVER", this.f18136i);
        xu.d.Y(jSONObject, "THROUGHPUT_DOWNLOAD_AWS_DIAGNOSTIC", this.j);
        jSONObject.put("THROUGHPUT_DOWNLOAD_TEST_SIZE", this.k);
        jSONObject.put("THROUGHPUT_DOWNLOAD_TEST_STATUS", this.f18137l);
        jSONObject.put("THROUGHPUT_DOWNLOAD_DNS_LOOKUP_TIME", this.f18138m);
        jSONObject.put("THROUGHPUT_DOWNLOAD_TTFA", this.f18139n);
        jSONObject.put("THROUGHPUT_DOWNLOAD_TTFB", this.f18140o);
        xu.d.Y(jSONObject, "THROUGHPUT_DOWNLOAD_AWS_EDGE_LOCATION", this.f18141p);
        xu.d.Y(jSONObject, "THROUGHPUT_DOWNLOAD_AWS_X_CACHE", this.f18142q);
        xu.d.Y(jSONObject, "THROUGHPUT_DOWNLOAD_TIMES", this.f18143r);
        xu.d.Y(jSONObject, "THROUGHPUT_DOWNLOAD_CUMULATIVE_BYTES", this.f18144s);
        xu.d.Y(jSONObject, "THROUGHPUT_DOWNLOAD_EVENTS", this.f18145t);
    }

    public final int hashCode() {
        int iA = h0.b.a(this.f18135h, h0.b.a(this.f18134g, c7.a.g(this.f18133f, c7.a.g(this.f18132e, h0.b.b(c7.a.g(this.f18130c, h0.b.b(Long.hashCode(this.f18128a) * 31, 31, this.f18129b), 31), 31, this.f18131d), 31), 31), 31), 31);
        String str = this.f18136i;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int iC = c7.a.C(this.f18140o, c7.a.C(this.f18139n, c7.a.C(this.f18138m, c7.a.C(this.f18137l, h0.b.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.k), 31), 31), 31), 31);
        String str3 = this.f18141p;
        int iHashCode2 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18142q;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18143r;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18144s;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f18145t;
        return iHashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThroughputDownloadJobResult(id=");
        sb2.append(this.f18128a);
        sb2.append(", taskId=");
        sb2.append(this.f18129b);
        sb2.append(", taskName=");
        sb2.append(this.f18130c);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18131d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18132e);
        sb2.append(", jobType=");
        sb2.append(this.f18133f);
        sb2.append(", speed=");
        sb2.append(this.f18134g);
        sb2.append(", speedTestBytesOnly=");
        sb2.append(this.f18135h);
        sb2.append(", testServer=");
        sb2.append(this.f18136i);
        sb2.append(", diagnosticAws=");
        sb2.append(this.j);
        sb2.append(", testSize=");
        sb2.append(this.k);
        sb2.append(", testStatus=");
        sb2.append(this.f18137l);
        sb2.append(", dnsLookupTime=");
        sb2.append(this.f18138m);
        sb2.append(", ttfa=");
        sb2.append(this.f18139n);
        sb2.append(", ttfb=");
        sb2.append(this.f18140o);
        sb2.append(", awsEdgeLocation=");
        sb2.append(this.f18141p);
        sb2.append(", awsXCache=");
        sb2.append(this.f18142q);
        sb2.append(", samplingTimes=");
        sb2.append(this.f18143r);
        sb2.append(", samplingCumulativeBytes=");
        sb2.append(this.f18144s);
        sb2.append(", events=");
        return h0.b.r(sb2, this.f18145t, ')');
    }
}
