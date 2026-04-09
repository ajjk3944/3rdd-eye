package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g1 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f17853a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17854b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17855c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17856d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17857e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17858f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17859g;

    public g1(long j, long j7, long j10, String str, String str2, String str3, String str4) {
        br.l.e(str, "taskName");
        br.l.e(str2, "dataEndpoint");
        br.l.e(str3, "jobType");
        this.f17853a = j;
        this.f17854b = j7;
        this.f17855c = str;
        this.f17856d = j10;
        this.f17857e = str2;
        this.f17858f = str3;
        this.f17859g = str4;
    }

    @Override // vj.c
    public final String a() {
        return this.f17857e;
    }

    @Override // vj.c
    public final long b() {
        return this.f17853a;
    }

    @Override // vj.c
    public final String c() {
        return this.f17858f;
    }

    @Override // vj.c
    public final long d() {
        return this.f17854b;
    }

    @Override // vj.c
    public final String e() {
        return this.f17855c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f17853a == g1Var.f17853a && this.f17854b == g1Var.f17854b && br.l.a(this.f17855c, g1Var.f17855c) && this.f17856d == g1Var.f17856d && br.l.a(this.f17857e, g1Var.f17857e) && br.l.a(this.f17858f, g1Var.f17858f) && br.l.a(this.f17859g, g1Var.f17859g);
    }

    @Override // vj.c
    public final long f() {
        return this.f17856d;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) {
        xu.d.Y(jSONObject, "wifi_information_elements", this.f17859g);
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f17858f, c7.a.g(this.f17857e, h0.b.b(c7.a.g(this.f17855c, h0.b.b(Long.hashCode(this.f17853a) * 31, 31, this.f17854b), 31), 31, this.f17856d), 31), 31);
        String str = this.f17859g;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WifiInformationElementsJobResult(id=");
        sb2.append(this.f17853a);
        sb2.append(", taskId=");
        sb2.append(this.f17854b);
        sb2.append(", taskName=");
        sb2.append(this.f17855c);
        sb2.append(", timeOfResult=");
        sb2.append(this.f17856d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f17857e);
        sb2.append(", jobType=");
        sb2.append(this.f17858f);
        sb2.append(", wifiInformationElements=");
        return h0.b.r(sb2, this.f17859g, ')');
    }
}
