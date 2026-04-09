package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b1 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f17671a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17672b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17673c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17674d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17675e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17676f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17677g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f17678h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f17679i;
    public final Integer j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f17680l;

    /* renamed from: m, reason: collision with root package name */
    public final String f17681m;

    /* renamed from: n, reason: collision with root package name */
    public final String f17682n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f17683o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f17684p;

    /* renamed from: q, reason: collision with root package name */
    public final Long f17685q;

    /* renamed from: r, reason: collision with root package name */
    public final String f17686r;

    public b1(long j, long j7, String str, String str2, String str3, long j10, String str4, Integer num, Integer num2, Integer num3, String str5, Long l10, String str6, String str7, Boolean bool, Boolean bool2, Long l11, String str8) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        br.l.e(str4, "testName");
        this.f17671a = j;
        this.f17672b = j7;
        this.f17673c = str;
        this.f17674d = str2;
        this.f17675e = str3;
        this.f17676f = j10;
        this.f17677g = str4;
        this.f17678h = num;
        this.f17679i = num2;
        this.j = num3;
        this.k = str5;
        this.f17680l = l10;
        this.f17681m = str6;
        this.f17682n = str7;
        this.f17683o = bool;
        this.f17684p = bool2;
        this.f17685q = l11;
        this.f17686r = str8;
    }

    public static b1 i(b1 b1Var, long j, String str, int i10) {
        long j7 = (i10 & 1) != 0 ? b1Var.f17671a : j;
        long j10 = b1Var.f17672b;
        String str2 = b1Var.f17673c;
        String str3 = b1Var.f17674d;
        String str4 = b1Var.f17675e;
        long j11 = b1Var.f17676f;
        String str5 = b1Var.f17677g;
        Integer num = b1Var.f17678h;
        Integer num2 = b1Var.f17679i;
        Integer num3 = b1Var.j;
        String str6 = (i10 & 1024) != 0 ? b1Var.k : str;
        Long l10 = b1Var.f17680l;
        String str7 = b1Var.f17681m;
        String str8 = b1Var.f17682n;
        Boolean bool = b1Var.f17683o;
        Boolean bool2 = b1Var.f17684p;
        Long l11 = b1Var.f17685q;
        String str9 = b1Var.f17686r;
        b1Var.getClass();
        br.l.e(str2, "taskName");
        br.l.e(str3, "jobType");
        br.l.e(str4, "dataEndpoint");
        br.l.e(str5, "testName");
        return new b1(j7, j10, str2, str3, str4, j11, str5, num, num2, num3, str6, l10, str7, str8, bool, bool2, l11, str9);
    }

    @Override // vj.c
    public final String a() {
        return this.f17675e;
    }

    @Override // vj.c
    public final long b() {
        return this.f17671a;
    }

    @Override // vj.c
    public final String c() {
        return this.f17674d;
    }

    @Override // vj.c
    public final long d() {
        return this.f17672b;
    }

    @Override // vj.c
    public final String e() {
        return this.f17673c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f17671a == b1Var.f17671a && this.f17672b == b1Var.f17672b && br.l.a(this.f17673c, b1Var.f17673c) && br.l.a(this.f17674d, b1Var.f17674d) && br.l.a(this.f17675e, b1Var.f17675e) && this.f17676f == b1Var.f17676f && br.l.a(this.f17677g, b1Var.f17677g) && br.l.a(this.f17678h, b1Var.f17678h) && br.l.a(this.f17679i, b1Var.f17679i) && br.l.a(this.j, b1Var.j) && br.l.a(this.k, b1Var.k) && br.l.a(this.f17680l, b1Var.f17680l) && br.l.a(this.f17681m, b1Var.f17681m) && br.l.a(this.f17682n, b1Var.f17682n) && br.l.a(this.f17683o, b1Var.f17683o) && br.l.a(this.f17684p, b1Var.f17684p) && br.l.a(this.f17685q, b1Var.f17685q) && br.l.a(this.f17686r, b1Var.f17686r);
    }

    @Override // vj.c
    public final long f() {
        return this.f17676f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("JOB_RESULT_VERIFICATION_TEST_NAME", this.f17677g);
        xu.d.Y(jSONObject, "JOB_RESULT_SENT_VERIFICATION_PROBES_COUNT", this.f17678h);
        xu.d.Y(jSONObject, "JOB_RESULT_RECEIVED_VERIFICATION_PROBES_COUNT", this.f17679i);
        xu.d.Y(jSONObject, "JOB_RESULT_SUCCESSFUL_RECEIVED_VERIFICATION_PROBES_COUNT", this.j);
        xu.d.Y(jSONObject, "JOB_RESULT_EVENTS", this.k);
        xu.d.Y(jSONObject, "JOB_RESULT_VERIFICATION_RESPONSE", this.f17680l);
        xu.d.Y(jSONObject, "JOB_RESULT_VERIFICATION_SENT_TIMES", this.f17681m);
        xu.d.Y(jSONObject, "JOB_RESULT_VERIFICATION_RECEIVED_TIMES", this.f17682n);
        xu.d.Y(jSONObject, "JOB_RESULT_UDP_VERIFICATION_PAYLOAD_IS_VALID", this.f17683o);
        xu.d.Y(jSONObject, "JOB_RESULT_UDP_VERIFICATION_RESPONSE_IS_VALID", this.f17684p);
        xu.d.Y(jSONObject, "JOB_RESULT_UDP_VERIFICATION_RESPONSE_AGE_MS", this.f17685q);
        xu.d.Y(jSONObject, "JOB_RESULT_UDP_VERIFICATION_RAW_RESPONSES", this.f17686r);
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f17677g, h0.b.b(c7.a.g(this.f17675e, c7.a.g(this.f17674d, c7.a.g(this.f17673c, h0.b.b(Long.hashCode(this.f17671a) * 31, 31, this.f17672b), 31), 31), 31), 31, this.f17676f), 31);
        Integer num = this.f17678h;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f17679i;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.j;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.k;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.f17680l;
        int iHashCode5 = (iHashCode4 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str2 = this.f17681m;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17682n;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f17683o;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f17684p;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l11 = this.f17685q;
        int iHashCode10 = (iHashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.f17686r;
        return iHashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UdpVerificationResult(id=");
        sb2.append(this.f17671a);
        sb2.append(", taskId=");
        sb2.append(this.f17672b);
        sb2.append(", taskName=");
        sb2.append(this.f17673c);
        sb2.append(", jobType=");
        sb2.append(this.f17674d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f17675e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f17676f);
        sb2.append(", testName=");
        sb2.append(this.f17677g);
        sb2.append(", sentVerificationProbesCount=");
        sb2.append(this.f17678h);
        sb2.append(", receivedVerificationProbesCount=");
        sb2.append(this.f17679i);
        sb2.append(", successfulReceivedVerificationProbesCount=");
        sb2.append(this.j);
        sb2.append(", events=");
        sb2.append(this.k);
        sb2.append(", verificationResponse=");
        sb2.append(this.f17680l);
        sb2.append(", sentTimes=");
        sb2.append(this.f17681m);
        sb2.append(", receivedTimes=");
        sb2.append(this.f17682n);
        sb2.append(", udpVerificationPayloadIsValid=");
        sb2.append(this.f17683o);
        sb2.append(", udpVerificationResponseIsValid=");
        sb2.append(this.f17684p);
        sb2.append(", udpVerificationResponseAgeMs=");
        sb2.append(this.f17685q);
        sb2.append(", udpVerificationRawResponses=");
        return h0.b.r(sb2, this.f17686r, ')');
    }
}
