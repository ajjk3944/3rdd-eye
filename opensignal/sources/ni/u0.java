package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u0 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18201a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18202b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18203c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18204d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18205e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18206f;

    /* renamed from: g, reason: collision with root package name */
    public final double f18207g;

    /* renamed from: h, reason: collision with root package name */
    public final double f18208h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18209i;
    public final long j;
    public final long k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18210l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18211m;

    /* renamed from: n, reason: collision with root package name */
    public final int f18212n;

    /* renamed from: o, reason: collision with root package name */
    public final String f18213o;

    /* renamed from: p, reason: collision with root package name */
    public final String f18214p;

    /* renamed from: q, reason: collision with root package name */
    public final String f18215q;

    /* renamed from: r, reason: collision with root package name */
    public final String f18216r;

    /* renamed from: s, reason: collision with root package name */
    public final String f18217s;

    public u0(long j, long j7, String str, long j10, String str2, String str3, double d6, double d10, String str4, long j11, long j12, int i10, int i11, int i12, String str5, String str6, String str7, String str8, String str9) {
        br.l.e(str, "taskName");
        br.l.e(str2, "dataEndpoint");
        br.l.e(str3, "jobType");
        this.f18201a = j;
        this.f18202b = j7;
        this.f18203c = str;
        this.f18204d = j10;
        this.f18205e = str2;
        this.f18206f = str3;
        this.f18207g = d6;
        this.f18208h = d10;
        this.f18209i = str4;
        this.j = j11;
        this.k = j12;
        this.f18210l = i10;
        this.f18211m = i11;
        this.f18212n = i12;
        this.f18213o = str5;
        this.f18214p = str6;
        this.f18215q = str7;
        this.f18216r = str8;
        this.f18217s = str9;
    }

    public static u0 i(u0 u0Var, long j) {
        long j7 = u0Var.f18202b;
        String str = u0Var.f18203c;
        long j10 = u0Var.f18204d;
        String str2 = u0Var.f18205e;
        String str3 = u0Var.f18206f;
        double d6 = u0Var.f18207g;
        double d10 = u0Var.f18208h;
        String str4 = u0Var.f18209i;
        long j11 = u0Var.j;
        long j12 = u0Var.k;
        int i10 = u0Var.f18210l;
        int i11 = u0Var.f18211m;
        int i12 = u0Var.f18212n;
        String str5 = u0Var.f18213o;
        String str6 = u0Var.f18214p;
        String str7 = u0Var.f18215q;
        String str8 = u0Var.f18216r;
        String str9 = u0Var.f18217s;
        br.l.e(str, "taskName");
        br.l.e(str2, "dataEndpoint");
        br.l.e(str3, "jobType");
        return new u0(j, j7, str, j10, str2, str3, d6, d10, str4, j11, j12, i10, i11, i12, str5, str6, str7, str8, str9);
    }

    @Override // vj.c
    public final String a() {
        return this.f18205e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18201a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18206f;
    }

    @Override // vj.c
    public final long d() {
        return this.f18202b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18203c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f18201a == u0Var.f18201a && this.f18202b == u0Var.f18202b && br.l.a(this.f18203c, u0Var.f18203c) && this.f18204d == u0Var.f18204d && br.l.a(this.f18205e, u0Var.f18205e) && br.l.a(this.f18206f, u0Var.f18206f) && Double.compare(this.f18207g, u0Var.f18207g) == 0 && Double.compare(this.f18208h, u0Var.f18208h) == 0 && br.l.a(this.f18209i, u0Var.f18209i) && this.j == u0Var.j && this.k == u0Var.k && this.f18210l == u0Var.f18210l && this.f18211m == u0Var.f18211m && this.f18212n == u0Var.f18212n && br.l.a(this.f18213o, u0Var.f18213o) && br.l.a(this.f18214p, u0Var.f18214p) && br.l.a(this.f18215q, u0Var.f18215q) && br.l.a(this.f18216r, u0Var.f18216r) && br.l.a(this.f18217s, u0Var.f18217s);
    }

    @Override // vj.c
    public final long f() {
        return this.f18204d;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("THROUGHPUT_UPLOAD_SPEED", this.f18207g);
        jSONObject.put("THROUGHPUT_UPLOAD_SPEED_TEST_BYTES_ONLY", this.f18208h);
        xu.d.Y(jSONObject, "THROUGHPUT_UPLOAD_TEST_SERVER", this.f18209i);
        jSONObject.put("THROUGHPUT_UPLOAD_TEST_SERVER_TIMESTAMP", this.j);
        jSONObject.put("THROUGHPUT_UPLOAD_TEST_SIZE", this.k);
        jSONObject.put("THROUGHPUT_UPLOAD_TEST_STATUS", this.f18210l);
        jSONObject.put("THROUGHPUT_UPLOAD_DNS_LOOKUP_TIME", this.f18211m);
        jSONObject.put("THROUGHPUT_UPLOAD_TTFA", this.f18212n);
        xu.d.Y(jSONObject, "THROUGHPUT_UPLOAD_AWS_DIAGNOSTICS", this.f18213o);
        xu.d.Y(jSONObject, "THROUGHPUT_UPLOAD_AWS_EDGE_LOCATION", this.f18214p);
        xu.d.Y(jSONObject, "THROUGHPUT_UPLOAD_TIMES", this.f18215q);
        xu.d.Y(jSONObject, "THROUGHPUT_UPLOAD_CUMULATIVE_BYTES", this.f18216r);
        xu.d.Y(jSONObject, "THROUGHPUT_UPLOAD_EVENTS", this.f18217s);
    }

    public final int hashCode() {
        int iA = h0.b.a(this.f18208h, h0.b.a(this.f18207g, c7.a.g(this.f18206f, c7.a.g(this.f18205e, h0.b.b(c7.a.g(this.f18203c, h0.b.b(Long.hashCode(this.f18201a) * 31, 31, this.f18202b), 31), 31, this.f18204d), 31), 31), 31), 31);
        String str = this.f18209i;
        int iC = c7.a.C(this.f18212n, c7.a.C(this.f18211m, c7.a.C(this.f18210l, h0.b.b(h0.b.b((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.j), 31, this.k), 31), 31), 31);
        String str2 = this.f18213o;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18214p;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18215q;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18216r;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18217s;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ThroughputUploadJobResult(id=");
        sb2.append(this.f18201a);
        sb2.append(", taskId=");
        sb2.append(this.f18202b);
        sb2.append(", taskName=");
        sb2.append(this.f18203c);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18204d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18205e);
        sb2.append(", jobType=");
        sb2.append(this.f18206f);
        sb2.append(", speed=");
        sb2.append(this.f18207g);
        sb2.append(", speedTestBytesOnly=");
        sb2.append(this.f18208h);
        sb2.append(", testServer=");
        sb2.append(this.f18209i);
        sb2.append(", testServerTimestamp=");
        sb2.append(this.j);
        sb2.append(", testSize=");
        sb2.append(this.k);
        sb2.append(", testStatus=");
        sb2.append(this.f18210l);
        sb2.append(", dnsLookupTime=");
        sb2.append(this.f18211m);
        sb2.append(", ttfa=");
        sb2.append(this.f18212n);
        sb2.append(", awsDiagnostic=");
        sb2.append(this.f18213o);
        sb2.append(", awsEdgeLocation=");
        sb2.append(this.f18214p);
        sb2.append(", samplingTimes=");
        sb2.append(this.f18215q);
        sb2.append(", samplingCumulativeBytes=");
        sb2.append(this.f18216r);
        sb2.append(", events=");
        return h0.b.r(sb2, this.f18217s, ')');
    }
}
