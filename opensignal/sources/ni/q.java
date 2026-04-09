package ni;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18104a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18105b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18106c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18107d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18108e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18109f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18110g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18111h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f18112i;
    public final Integer j;
    public final Integer k;

    public q(long j, long j7, String str, String str2, String str3, long j10, String str4, String str5, Boolean bool, Integer num, Integer num2) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        this.f18104a = j;
        this.f18105b = j7;
        this.f18106c = str;
        this.f18107d = str2;
        this.f18108e = str3;
        this.f18109f = j10;
        this.f18110g = str4;
        this.f18111h = str5;
        this.f18112i = bool;
        this.j = num;
        this.k = num2;
    }

    @Override // vj.c
    public final String a() {
        return this.f18108e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18104a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18107d;
    }

    @Override // vj.c
    public final long d() {
        return this.f18105b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18106c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f18104a == qVar.f18104a && this.f18105b == qVar.f18105b && br.l.a(this.f18106c, qVar.f18106c) && br.l.a(this.f18107d, qVar.f18107d) && br.l.a(this.f18108e, qVar.f18108e) && this.f18109f == qVar.f18109f && br.l.a(this.f18110g, qVar.f18110g) && br.l.a(this.f18111h, qVar.f18111h) && br.l.a(this.f18112i, qVar.f18112i) && br.l.a(this.j, qVar.j) && br.l.a(this.k, qVar.k);
    }

    @Override // vj.c
    public final long f() {
        return this.f18109f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) {
        xu.d.Y(jSONObject, "END_CAPABILITIES", this.f18110g);
        xu.d.Y(jSONObject, "END_EXPERIMENTAL", this.f18111h);
        xu.d.Y(jSONObject, "END_IS_CONNECTED", this.f18112i);
        xu.d.Y(jSONObject, "END_NETWORK_STATE", this.j);
        xu.d.Y(jSONObject, "END_NETWORK_DETAILED_STATE", this.k);
    }

    public final int hashCode() {
        int iB = h0.b.b(c7.a.g(this.f18108e, c7.a.g(this.f18107d, c7.a.g(this.f18106c, h0.b.b(Long.hashCode(this.f18104a) * 31, 31, this.f18105b), 31), 31), 31), 31, this.f18109f);
        String str = this.f18110g;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18111h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f18112i;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.j;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.k;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EndCoreResultItem(id=");
        sb2.append(this.f18104a);
        sb2.append(", taskId=");
        sb2.append(this.f18105b);
        sb2.append(", taskName=");
        sb2.append(this.f18106c);
        sb2.append(", jobType=");
        sb2.append(this.f18107d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18108e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18109f);
        sb2.append(", networkCapabilities=");
        sb2.append(this.f18110g);
        sb2.append(", experimental=");
        sb2.append(this.f18111h);
        sb2.append(", isConnected=");
        sb2.append(this.f18112i);
        sb2.append(", networkState=");
        sb2.append(this.j);
        sb2.append(", networkDetailedState=");
        return w.g.i(sb2, this.k, ')');
    }
}
