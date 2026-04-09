package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g0 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f17846a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17847b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17848c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17849d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17850e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17851f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17852g;

    public g0(long j, long j7, long j10, String str, String str2, String str3, String str4) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        this.f17846a = j;
        this.f17847b = j7;
        this.f17848c = str;
        this.f17849d = str2;
        this.f17850e = str3;
        this.f17851f = j10;
        this.f17852g = str4;
    }

    @Override // vj.c
    public final String a() {
        return this.f17850e;
    }

    @Override // vj.c
    public final long b() {
        return this.f17846a;
    }

    @Override // vj.c
    public final String c() {
        return this.f17849d;
    }

    @Override // vj.c
    public final long d() {
        return this.f17847b;
    }

    @Override // vj.c
    public final String e() {
        return this.f17848c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f17846a == g0Var.f17846a && this.f17847b == g0Var.f17847b && br.l.a(this.f17848c, g0Var.f17848c) && br.l.a(this.f17849d, g0Var.f17849d) && br.l.a(this.f17850e, g0Var.f17850e) && this.f17851f == g0Var.f17851f && br.l.a(this.f17852g, g0Var.f17852g);
    }

    @Override // vj.c
    public final long f() {
        return this.f17851f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) {
        xu.d.Y(jSONObject, "PUBLIC_IP", this.f17852g);
    }

    public final int hashCode() {
        int iB = h0.b.b(c7.a.g(this.f17850e, c7.a.g(this.f17849d, c7.a.g(this.f17848c, h0.b.b(Long.hashCode(this.f17846a) * 31, 31, this.f17847b), 31), 31), 31), 31, this.f17851f);
        String str = this.f17852g;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicIpResult(id=");
        sb2.append(this.f17846a);
        sb2.append(", taskId=");
        sb2.append(this.f17847b);
        sb2.append(", taskName=");
        sb2.append(this.f17848c);
        sb2.append(", jobType=");
        sb2.append(this.f17849d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f17850e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f17851f);
        sb2.append(", publicIp=");
        return h0.b.r(sb2, this.f17852g, ')');
    }
}
