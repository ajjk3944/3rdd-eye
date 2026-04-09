package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o0 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18066a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18067b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18068c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18069d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18070e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18071f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18072g;

    public o0(long j, long j7, long j10, String str, String str2, String str3, String str4) {
        br.l.e(str, "taskName");
        br.l.e(str2, "dataEndpoint");
        this.f18066a = j;
        this.f18067b = j7;
        this.f18068c = str;
        this.f18069d = j10;
        this.f18070e = str2;
        this.f18071f = str3;
        this.f18072g = str4;
    }

    @Override // vj.c
    public final String a() {
        return this.f18070e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18066a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18071f;
    }

    @Override // vj.c
    public final long d() {
        return this.f18067b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18068c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f18066a == o0Var.f18066a && this.f18067b == o0Var.f18067b && br.l.a(this.f18068c, o0Var.f18068c) && this.f18069d == o0Var.f18069d && br.l.a(this.f18070e, o0Var.f18070e) && br.l.a(this.f18071f, o0Var.f18071f) && br.l.a(this.f18072g, o0Var.f18072g);
    }

    @Override // vj.c
    public final long f() {
        return this.f18069d;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) {
        xu.d.Y(jSONObject, "task_result_events", this.f18072g);
    }

    public final int hashCode() {
        int iG = c7.a.g(this.f18071f, c7.a.g(this.f18070e, h0.b.b(c7.a.g(this.f18068c, h0.b.b(Long.hashCode(this.f18066a) * 31, 31, this.f18067b), 31), 31, this.f18069d), 31), 31);
        String str = this.f18072g;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaskLoggerResult(id=");
        sb2.append(this.f18066a);
        sb2.append(", taskId=");
        sb2.append(this.f18067b);
        sb2.append(", taskName=");
        sb2.append(this.f18068c);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18069d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18070e);
        sb2.append(", jobType=");
        sb2.append(this.f18071f);
        sb2.append(", events=");
        return h0.b.r(sb2, this.f18072g, ')');
    }
}
