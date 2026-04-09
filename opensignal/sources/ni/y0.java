package ni;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class y0 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18300a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18301b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18302c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18303d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18304e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18305f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18306g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18307h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18308i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final long f18309l;

    /* renamed from: m, reason: collision with root package name */
    public final long f18310m;

    /* renamed from: n, reason: collision with root package name */
    public final long f18311n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f18312o;

    /* renamed from: p, reason: collision with root package name */
    public final String f18313p;

    /* renamed from: q, reason: collision with root package name */
    public final String f18314q;

    public y0(long j, long j7, String str, String str2, String str3, long j10, boolean z10, int i10, int i11, int i12, int i13, long j11, long j12, long j13, byte[] bArr, String str4, String str5) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        br.l.e(bArr, "testId");
        this.f18300a = j;
        this.f18301b = j7;
        this.f18302c = str;
        this.f18303d = str2;
        this.f18304e = str3;
        this.f18305f = j10;
        this.f18306g = z10;
        this.f18307h = i10;
        this.f18308i = i11;
        this.j = i12;
        this.k = i13;
        this.f18309l = j11;
        this.f18310m = j12;
        this.f18311n = j13;
        this.f18312o = bArr;
        this.f18313p = str4;
        this.f18314q = str5;
    }

    @Override // vj.c
    public final String a() {
        return this.f18304e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18300a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18303d;
    }

    @Override // vj.c
    public final long d() {
        return this.f18301b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18302c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f18300a == y0Var.f18300a && this.f18301b == y0Var.f18301b && br.l.a(this.f18302c, y0Var.f18302c) && br.l.a(this.f18303d, y0Var.f18303d) && br.l.a(this.f18304e, y0Var.f18304e) && this.f18305f == y0Var.f18305f && this.f18306g == y0Var.f18306g && this.f18307h == y0Var.f18307h && this.f18308i == y0Var.f18308i && this.j == y0Var.j && this.k == y0Var.k && this.f18309l == y0Var.f18309l && this.f18310m == y0Var.f18310m && this.f18311n == y0Var.f18311n && br.l.a(this.f18312o, y0Var.f18312o) && br.l.a(this.f18313p, y0Var.f18313p) && br.l.a(this.f18314q, y0Var.f18314q);
    }

    @Override // vj.c
    public final long f() {
        return this.f18305f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("JOB_RESULT_KEY_IS_SENDING_RESULT", this.f18306g);
        jSONObject.put("JOB_RESULT_PAYLOAD_LENGTH", this.f18307h);
        jSONObject.put("JOB_RESULT_ECHO_FACTOR", this.f18308i);
        jSONObject.put("JOB_RESULT_SEQUENCE_NUMBER", this.j);
        jSONObject.put("JOB_RESULT_ECHO_SEQUENCE_NUMBER", this.k);
        jSONObject.put("JOB_RESULT_ELAPSED_SEND_TIME", this.f18309l);
        jSONObject.put("JOB_RESULT_ELAPSED_RECEIVED_TIME", this.f18311n);
        jSONObject.put("JOB_RESULT_SEND_TIME", this.f18310m);
        jSONObject.put("JOB_RESULT_TEST_ID", this.f18312o.toString());
        jSONObject.put("JOB_RESULT_URL", this.f18313p);
        jSONObject.put("JOB_RESULT_TEST_NAME", this.f18314q);
    }

    public final int hashCode() {
        return this.f18314q.hashCode() + c7.a.g(this.f18313p, (Arrays.hashCode(this.f18312o) + h0.b.b(h0.b.b(h0.b.b(c7.a.C(this.k, c7.a.C(this.j, c7.a.C(this.f18308i, c7.a.C(this.f18307h, w.g.b(h0.b.b(c7.a.g(this.f18304e, c7.a.g(this.f18303d, c7.a.g(this.f18302c, h0.b.b(Long.hashCode(this.f18300a) * 31, 31, this.f18301b), 31), 31), 31), 31, this.f18305f), this.f18306g, 31), 31), 31), 31), 31), 31, this.f18309l), 31, this.f18310m), 31, this.f18311n)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UdpProgressResult(id=");
        sb2.append(this.f18300a);
        sb2.append(", taskId=");
        sb2.append(this.f18301b);
        sb2.append(", taskName=");
        sb2.append(this.f18302c);
        sb2.append(", jobType=");
        sb2.append(this.f18303d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18304e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18305f);
        sb2.append(", isSendingResult=");
        sb2.append(this.f18306g);
        sb2.append(", payloadLength=");
        sb2.append(this.f18307h);
        sb2.append(", echoFactor=");
        sb2.append(this.f18308i);
        sb2.append(", sequenceNumber=");
        sb2.append(this.j);
        sb2.append(", echoSequenceNumber=");
        sb2.append(this.k);
        sb2.append(", elapsedSendTimeMicroseconds=");
        sb2.append(this.f18309l);
        sb2.append(", sendTime=");
        sb2.append(this.f18310m);
        sb2.append(", elapsedReceivedTimeMicroseconds=");
        sb2.append(this.f18311n);
        sb2.append(", testId=");
        sb2.append(Arrays.toString(this.f18312o));
        sb2.append(", url=");
        sb2.append(this.f18313p);
        sb2.append(", testName=");
        return h0.b.r(sb2, this.f18314q, ')');
    }
}
