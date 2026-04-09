package ni;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a1 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f17643a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17644b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17645c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17646d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17647e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17648f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17649g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17650h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17651i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final long f17652l;

    /* renamed from: m, reason: collision with root package name */
    public final long f17653m;

    /* renamed from: n, reason: collision with root package name */
    public final long f17654n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f17655o;

    /* renamed from: p, reason: collision with root package name */
    public final String f17656p;

    /* renamed from: q, reason: collision with root package name */
    public final String f17657q;

    public a1(long j, long j7, String str, String str2, String str3, long j10, boolean z10, int i10, int i11, int i12, int i13, long j11, long j12, long j13, byte[] bArr, String str4, String str5) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        br.l.e(bArr, "testId");
        this.f17643a = j;
        this.f17644b = j7;
        this.f17645c = str;
        this.f17646d = str2;
        this.f17647e = str3;
        this.f17648f = j10;
        this.f17649g = z10;
        this.f17650h = i10;
        this.f17651i = i11;
        this.j = i12;
        this.k = i13;
        this.f17652l = j11;
        this.f17653m = j12;
        this.f17654n = j13;
        this.f17655o = bArr;
        this.f17656p = str4;
        this.f17657q = str5;
    }

    @Override // vj.c
    public final String a() {
        return this.f17647e;
    }

    @Override // vj.c
    public final long b() {
        return this.f17643a;
    }

    @Override // vj.c
    public final String c() {
        return this.f17646d;
    }

    @Override // vj.c
    public final long d() {
        return this.f17644b;
    }

    @Override // vj.c
    public final String e() {
        return this.f17645c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f17643a == a1Var.f17643a && this.f17644b == a1Var.f17644b && br.l.a(this.f17645c, a1Var.f17645c) && br.l.a(this.f17646d, a1Var.f17646d) && br.l.a(this.f17647e, a1Var.f17647e) && this.f17648f == a1Var.f17648f && this.f17649g == a1Var.f17649g && this.f17650h == a1Var.f17650h && this.f17651i == a1Var.f17651i && this.j == a1Var.j && this.k == a1Var.k && this.f17652l == a1Var.f17652l && this.f17653m == a1Var.f17653m && this.f17654n == a1Var.f17654n && br.l.a(this.f17655o, a1Var.f17655o) && br.l.a(this.f17656p, a1Var.f17656p) && br.l.a(this.f17657q, a1Var.f17657q);
    }

    @Override // vj.c
    public final long f() {
        return this.f17648f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("JOB_RESULT_KEY_IS_SENDING_RESULT", this.f17649g);
        jSONObject.put("JOB_RESULT_PAYLOAD_LENGTH", this.f17650h);
        jSONObject.put("JOB_RESULT_ECHO_FACTOR", this.f17651i);
        jSONObject.put("JOB_RESULT_SEQUENCE_NUMBER", this.j);
        jSONObject.put("JOB_RESULT_ECHO_SEQUENCE_NUMBER", this.k);
        jSONObject.put("JOB_RESULT_ELAPSED_SEND_TIME", this.f17652l);
        jSONObject.put("JOB_RESULT_ELAPSED_RECEIVED_TIME", this.f17654n);
        jSONObject.put("JOB_RESULT_SEND_TIME", this.f17653m);
        jSONObject.put("JOB_RESULT_TEST_ID", this.f17655o.toString());
        jSONObject.put("JOB_RESULT_URL", this.f17656p);
        jSONObject.put("JOB_RESULT_TEST_NAME", this.f17657q);
    }

    public final int hashCode() {
        return this.f17657q.hashCode() + c7.a.g(this.f17656p, (Arrays.hashCode(this.f17655o) + h0.b.b(h0.b.b(h0.b.b(c7.a.C(this.k, c7.a.C(this.j, c7.a.C(this.f17651i, c7.a.C(this.f17650h, w.g.b(h0.b.b(c7.a.g(this.f17647e, c7.a.g(this.f17646d, c7.a.g(this.f17645c, h0.b.b(Long.hashCode(this.f17643a) * 31, 31, this.f17644b), 31), 31), 31), 31, this.f17648f), this.f17649g, 31), 31), 31), 31), 31), 31, this.f17652l), 31, this.f17653m), 31, this.f17654n)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UdpVerificationProgressResult(id=");
        sb2.append(this.f17643a);
        sb2.append(", taskId=");
        sb2.append(this.f17644b);
        sb2.append(", taskName=");
        sb2.append(this.f17645c);
        sb2.append(", jobType=");
        sb2.append(this.f17646d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f17647e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f17648f);
        sb2.append(", isSendingResult=");
        sb2.append(this.f17649g);
        sb2.append(", payloadLength=");
        sb2.append(this.f17650h);
        sb2.append(", echoFactor=");
        sb2.append(this.f17651i);
        sb2.append(", sequenceNumber=");
        sb2.append(this.j);
        sb2.append(", echoSequenceNumber=");
        sb2.append(this.k);
        sb2.append(", elapsedSendTimeMicroseconds=");
        sb2.append(this.f17652l);
        sb2.append(", sendTime=");
        sb2.append(this.f17653m);
        sb2.append(", elapsedReceivedTimeMicroseconds=");
        sb2.append(this.f17654n);
        sb2.append(", testId=");
        sb2.append(Arrays.toString(this.f17655o));
        sb2.append(", url=");
        sb2.append(this.f17656p);
        sb2.append(", testName=");
        return h0.b.r(sb2, this.f17657q, ')');
    }
}
