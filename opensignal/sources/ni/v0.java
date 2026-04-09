package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v0 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18242a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18243b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18244c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18245d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18246e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18247f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18248g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18249h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18250i;

    public v0(long j, long j7, String str, String str2, String str3, long j10, String str4, String str5, String str6) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        this.f18242a = j;
        this.f18243b = j7;
        this.f18244c = str;
        this.f18245d = str2;
        this.f18246e = str3;
        this.f18247f = j10;
        this.f18248g = str4;
        this.f18249h = str5;
        this.f18250i = str6;
    }

    @Override // vj.c
    public final String a() {
        return this.f18246e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18242a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18245d;
    }

    @Override // vj.c
    public final long d() {
        return this.f18243b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18244c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f18242a == v0Var.f18242a && this.f18243b == v0Var.f18243b && br.l.a(this.f18244c, v0Var.f18244c) && br.l.a(this.f18245d, v0Var.f18245d) && br.l.a(this.f18246e, v0Var.f18246e) && this.f18247f == v0Var.f18247f && br.l.a(this.f18248g, v0Var.f18248g) && br.l.a(this.f18249h, v0Var.f18249h) && br.l.a(this.f18250i, v0Var.f18250i);
    }

    @Override // vj.c
    public final long f() {
        return this.f18247f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("JOB_RESULT_TRACEROUTE_HOP", this.f18248g);
        jSONObject.put("JOB_RESULT_TRACEROUTE_ENDPOINT", this.f18249h);
        jSONObject.put("JOB_RESULT_TRACEROUTE_IP", this.f18250i);
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f18248g, h0.b.b(c7.a.g(this.f18246e, c7.a.g(this.f18245d, c7.a.g(this.f18244c, h0.b.b(Long.hashCode(this.f18242a) * 31, 31, this.f18243b), 31), 31), 31), 31, this.f18247f), 31);
        String str = this.f18249h;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18250i;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TracerouteProgressResult(id=");
        sb2.append(this.f18242a);
        sb2.append(", taskId=");
        sb2.append(this.f18243b);
        sb2.append(", taskName=");
        sb2.append(this.f18244c);
        sb2.append(", jobType=");
        sb2.append(this.f18245d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18246e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18247f);
        sb2.append(", hopResult=");
        sb2.append(this.f18248g);
        sb2.append(", endpoint=");
        sb2.append(this.f18249h);
        sb2.append(", ipAddress=");
        return h0.b.r(sb2, this.f18250i, ')');
    }
}
