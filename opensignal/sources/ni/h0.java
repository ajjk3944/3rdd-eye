package ni;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h0 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f17884a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17885b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17886c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17887d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17888e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17889f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17890g;

    public h0(long j, long j7, long j10, String str, String str2, String str3, String str4) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        this.f17884a = j;
        this.f17885b = j7;
        this.f17886c = str;
        this.f17887d = str2;
        this.f17888e = str3;
        this.f17889f = j10;
        this.f17890g = str4;
    }

    @Override // vj.c
    public final String a() {
        return this.f17888e;
    }

    @Override // vj.c
    public final long b() {
        return this.f17884a;
    }

    @Override // vj.c
    public final String c() {
        return this.f17887d;
    }

    @Override // vj.c
    public final long d() {
        return this.f17885b;
    }

    @Override // vj.c
    public final String e() {
        return this.f17886c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f17884a == h0Var.f17884a && this.f17885b == h0Var.f17885b && br.l.a(this.f17886c, h0Var.f17886c) && br.l.a(this.f17887d, h0Var.f17887d) && br.l.a(this.f17888e, h0Var.f17888e) && this.f17889f == h0Var.f17889f && br.l.a(this.f17890g, h0Var.f17890g);
    }

    @Override // vj.c
    public final long f() {
        return this.f17889f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("JOB_RESULT_TRIGGER_TYPE", this.f17890g);
    }

    public final int hashCode() {
        return this.f17890g.hashCode() + h0.b.b(c7.a.g(this.f17888e, c7.a.g(this.f17887d, c7.a.g(this.f17886c, h0.b.b(Long.hashCode(this.f17884a) * 31, 31, this.f17885b), 31), 31), 31), 31, this.f17889f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SchedulerInfoResult(id=");
        sb2.append(this.f17884a);
        sb2.append(", taskId=");
        sb2.append(this.f17885b);
        sb2.append(", taskName=");
        sb2.append(this.f17886c);
        sb2.append(", jobType=");
        sb2.append(this.f17887d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f17888e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f17889f);
        sb2.append(", triggerType=");
        return h0.b.r(sb2, this.f17890g, ')');
    }
}
