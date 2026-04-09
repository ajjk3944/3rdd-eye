package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z0 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18324a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18325b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18326c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18327d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18328e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18329f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18330g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18331h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18332i;
    public final float j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18333l;

    /* renamed from: m, reason: collision with root package name */
    public final String f18334m;

    /* renamed from: n, reason: collision with root package name */
    public final String f18335n;

    /* renamed from: o, reason: collision with root package name */
    public final String f18336o;

    /* renamed from: p, reason: collision with root package name */
    public final String f18337p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f18338q;

    /* renamed from: r, reason: collision with root package name */
    public final String f18339r;

    /* renamed from: s, reason: collision with root package name */
    public final String f18340s;

    /* renamed from: t, reason: collision with root package name */
    public final String f18341t;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f18342u;

    public z0(long j, long j7, String str, String str2, String str3, long j10, int i10, int i11, int i12, float f10, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, String str10, String str11, String str12, Integer num) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        br.l.e(str11, "testName");
        this.f18324a = j;
        this.f18325b = j7;
        this.f18326c = str;
        this.f18327d = str2;
        this.f18328e = str3;
        this.f18329f = j10;
        this.f18330g = i10;
        this.f18331h = i11;
        this.f18332i = i12;
        this.j = f10;
        this.k = str4;
        this.f18333l = str5;
        this.f18334m = str6;
        this.f18335n = str7;
        this.f18336o = str8;
        this.f18337p = str9;
        this.f18338q = z10;
        this.f18339r = str10;
        this.f18340s = str11;
        this.f18341t = str12;
        this.f18342u = num;
    }

    public static z0 i(z0 z0Var, long j, String str, int i10) {
        long j7 = (i10 & 1) != 0 ? z0Var.f18324a : j;
        long j10 = z0Var.f18325b;
        String str2 = z0Var.f18326c;
        String str3 = z0Var.f18327d;
        String str4 = z0Var.f18328e;
        long j11 = z0Var.f18329f;
        int i11 = z0Var.f18330g;
        int i12 = z0Var.f18331h;
        int i13 = z0Var.f18332i;
        float f10 = z0Var.j;
        String str5 = z0Var.k;
        String str6 = z0Var.f18333l;
        String str7 = z0Var.f18334m;
        String str8 = z0Var.f18335n;
        String str9 = z0Var.f18336o;
        String str10 = z0Var.f18337p;
        boolean z10 = z0Var.f18338q;
        String str11 = (i10 & 131072) != 0 ? z0Var.f18339r : str;
        String str12 = z0Var.f18340s;
        String str13 = z0Var.f18341t;
        Integer num = z0Var.f18342u;
        z0Var.getClass();
        br.l.e(str2, "taskName");
        br.l.e(str3, "jobType");
        br.l.e(str4, "dataEndpoint");
        br.l.e(str12, "testName");
        return new z0(j7, j10, str2, str3, str4, j11, i11, i12, i13, f10, str5, str6, str7, str8, str9, str10, z10, str11, str12, str13, num);
    }

    @Override // vj.c
    public final String a() {
        return this.f18328e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18324a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18327d;
    }

    @Override // vj.c
    public final long d() {
        return this.f18325b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18326c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f18324a == z0Var.f18324a && this.f18325b == z0Var.f18325b && br.l.a(this.f18326c, z0Var.f18326c) && br.l.a(this.f18327d, z0Var.f18327d) && br.l.a(this.f18328e, z0Var.f18328e) && this.f18329f == z0Var.f18329f && this.f18330g == z0Var.f18330g && this.f18331h == z0Var.f18331h && this.f18332i == z0Var.f18332i && Float.compare(this.j, z0Var.j) == 0 && br.l.a(this.k, z0Var.k) && br.l.a(this.f18333l, z0Var.f18333l) && br.l.a(this.f18334m, z0Var.f18334m) && br.l.a(this.f18335n, z0Var.f18335n) && br.l.a(this.f18336o, z0Var.f18336o) && br.l.a(this.f18337p, z0Var.f18337p) && this.f18338q == z0Var.f18338q && br.l.a(this.f18339r, z0Var.f18339r) && br.l.a(this.f18340s, z0Var.f18340s) && br.l.a(this.f18341t, z0Var.f18341t) && br.l.a(this.f18342u, z0Var.f18342u);
    }

    @Override // vj.c
    public final long f() {
        return this.f18329f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("JOB_RESULT_PACKETS_SENT", this.f18330g);
        jSONObject.put("JOB_RESULT_PAYLOAD_SIZE", this.f18331h);
        jSONObject.put("JOB_RESULT_TARGET_SEND_KBPS", this.f18332i);
        jSONObject.put("JOB_RESULT_ECHO_FACTOR", Float.valueOf(this.j));
        xu.d.Y(jSONObject, "JOB_RESULT_PROVIDER_NAME", this.k);
        xu.d.Y(jSONObject, "JOB_RESULT_IP", this.f18333l);
        xu.d.Y(jSONObject, "JOB_RESULT_HOST", this.f18334m);
        xu.d.Y(jSONObject, "JOB_RESULT_SENT_TIMES", this.f18335n);
        xu.d.Y(jSONObject, "JOB_RESULT_RECEIVED_TIMES", this.f18336o);
        xu.d.Y(jSONObject, "JOB_RESULT_TRAFFIC", this.f18337p);
        jSONObject.put("JOB_RESULT_NETWORK_CHANGED", this.f18338q);
        xu.d.Y(jSONObject, "JOB_RESULT_EVENTS", this.f18339r);
        jSONObject.put("JOB_RESULT_TEST_NAME", this.f18340s);
        xu.d.Y(jSONObject, "JOB_RESULT_UDP_VERIFICATION_STATUSES", this.f18341t);
        xu.d.Y(jSONObject, "JOB_RESULT_UDP_VERSION", this.f18342u);
    }

    public final int hashCode() {
        int iA = w.g.a(c7.a.C(this.f18332i, c7.a.C(this.f18331h, c7.a.C(this.f18330g, h0.b.b(c7.a.g(this.f18328e, c7.a.g(this.f18327d, c7.a.g(this.f18326c, h0.b.b(Long.hashCode(this.f18324a) * 31, 31, this.f18325b), 31), 31), 31), 31, this.f18329f), 31), 31), 31), this.j, 31);
        String str = this.k;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18333l;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18334m;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18335n;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18336o;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18337p;
        int iB = w.g.b((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, this.f18338q, 31);
        String str7 = this.f18339r;
        int iG = c7.a.g(this.f18340s, (iB + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
        String str8 = this.f18341t;
        int iHashCode6 = (iG + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f18342u;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UdpResult(id=");
        sb2.append(this.f18324a);
        sb2.append(", taskId=");
        sb2.append(this.f18325b);
        sb2.append(", taskName=");
        sb2.append(this.f18326c);
        sb2.append(", jobType=");
        sb2.append(this.f18327d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18328e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18329f);
        sb2.append(", packetsSent=");
        sb2.append(this.f18330g);
        sb2.append(", payloadSize=");
        sb2.append(this.f18331h);
        sb2.append(", targetSendKbps=");
        sb2.append(this.f18332i);
        sb2.append(", echoFactor=");
        sb2.append(this.j);
        sb2.append(", providerName=");
        sb2.append(this.k);
        sb2.append(", ip=");
        sb2.append(this.f18333l);
        sb2.append(", host=");
        sb2.append(this.f18334m);
        sb2.append(", sentTimes=");
        sb2.append(this.f18335n);
        sb2.append(", receivedTimes=");
        sb2.append(this.f18336o);
        sb2.append(", traffic=");
        sb2.append(this.f18337p);
        sb2.append(", networkChanged=");
        sb2.append(this.f18338q);
        sb2.append(", events=");
        sb2.append(this.f18339r);
        sb2.append(", testName=");
        sb2.append(this.f18340s);
        sb2.append(", udpVerificationStatuses=");
        sb2.append(this.f18341t);
        sb2.append(", udpVersion=");
        return w.g.i(sb2, this.f18342u, ')');
    }
}
