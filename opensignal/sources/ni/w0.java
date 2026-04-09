package ni;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class w0 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18269a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18270b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18271c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18272d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18273e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18274f;

    /* renamed from: g, reason: collision with root package name */
    public final JSONArray f18275g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONArray f18276h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18277i;
    public final String j;

    public w0(long j, long j7, String str, String str2, String str3, long j10, JSONArray jSONArray, JSONArray jSONArray2, String str4, String str5) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        this.f18269a = j;
        this.f18270b = j7;
        this.f18271c = str;
        this.f18272d = str2;
        this.f18273e = str3;
        this.f18274f = j10;
        this.f18275g = jSONArray;
        this.f18276h = jSONArray2;
        this.f18277i = str4;
        this.j = str5;
    }

    public static w0 i(w0 w0Var, long j) {
        long j7 = w0Var.f18270b;
        String str = w0Var.f18271c;
        String str2 = w0Var.f18272d;
        String str3 = w0Var.f18273e;
        long j10 = w0Var.f18274f;
        JSONArray jSONArray = w0Var.f18275g;
        JSONArray jSONArray2 = w0Var.f18276h;
        String str4 = w0Var.f18277i;
        String str5 = w0Var.j;
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        return new w0(j, j7, str, str2, str3, j10, jSONArray, jSONArray2, str4, str5);
    }

    @Override // vj.c
    public final String a() {
        return this.f18273e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18269a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18272d;
    }

    @Override // vj.c
    public final long d() {
        return this.f18270b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18271c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f18269a == w0Var.f18269a && this.f18270b == w0Var.f18270b && br.l.a(this.f18271c, w0Var.f18271c) && br.l.a(this.f18272d, w0Var.f18272d) && br.l.a(this.f18273e, w0Var.f18273e) && this.f18274f == w0Var.f18274f && br.l.a(this.f18275g, w0Var.f18275g) && br.l.a(this.f18276h, w0Var.f18276h) && br.l.a(this.f18277i, w0Var.f18277i) && br.l.a(this.j, w0Var.j);
    }

    @Override // vj.c
    public final long f() {
        return this.f18274f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("TIME", this.f18274f);
        xu.d.Y(jSONObject, "TRACEROUTE", this.f18275g);
        xu.d.Y(jSONObject, "TR_EVENTS", this.f18276h);
        xu.d.Y(jSONObject, "TR_ENDPOINT", this.f18277i);
        xu.d.Y(jSONObject, "TR_IP_ADDRESS", this.j);
    }

    public final int hashCode() {
        int iB = h0.b.b(c7.a.g(this.f18273e, c7.a.g(this.f18272d, c7.a.g(this.f18271c, h0.b.b(Long.hashCode(this.f18269a) * 31, 31, this.f18270b), 31), 31), 31), 31, this.f18274f);
        JSONArray jSONArray = this.f18275g;
        int iHashCode = (iB + (jSONArray == null ? 0 : jSONArray.hashCode())) * 31;
        JSONArray jSONArray2 = this.f18276h;
        int iHashCode2 = (iHashCode + (jSONArray2 == null ? 0 : jSONArray2.hashCode())) * 31;
        String str = this.f18277i;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TracerouteResult(id=");
        sb2.append(this.f18269a);
        sb2.append(", taskId=");
        sb2.append(this.f18270b);
        sb2.append(", taskName=");
        sb2.append(this.f18271c);
        sb2.append(", jobType=");
        sb2.append(this.f18272d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18273e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18274f);
        sb2.append(", traceroute=");
        sb2.append(this.f18275g);
        sb2.append(", events=");
        sb2.append(this.f18276h);
        sb2.append(", endpoint=");
        sb2.append(this.f18277i);
        sb2.append(", ipAddress=");
        return h0.b.r(sb2, this.j, ')');
    }
}
