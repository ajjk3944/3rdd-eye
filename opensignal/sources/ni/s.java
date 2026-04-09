package ni;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18121a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18122b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18123c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18124d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18125e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18126f;

    /* renamed from: g, reason: collision with root package name */
    public final List f18127g;

    public s(long j, long j7, String str, String str2, String str3, long j10, List list) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        this.f18121a = j;
        this.f18122b = j7;
        this.f18123c = str;
        this.f18124d = str2;
        this.f18125e = str3;
        this.f18126f = j10;
        this.f18127g = list;
    }

    @Override // vj.c
    public final String a() {
        return this.f18125e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18121a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18124d;
    }

    @Override // vj.c
    public final long d() {
        return this.f18122b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18123c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f18121a == sVar.f18121a && this.f18122b == sVar.f18122b && br.l.a(this.f18123c, sVar.f18123c) && br.l.a(this.f18124d, sVar.f18124d) && br.l.a(this.f18125e, sVar.f18125e) && this.f18126f == sVar.f18126f && br.l.a(this.f18127g, sVar.f18127g);
    }

    @Override // vj.c
    public final long f() {
        return this.f18126f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f18127g.iterator();
        while (it.hasNext()) {
            jSONArray.put(new JSONObject(((t) it.next()).h()));
        }
        jSONObject.put("TIME", this.f18126f);
        jSONObject.put("CONNECTION_INFO_ITEMS", jSONArray);
    }

    public final int hashCode() {
        return this.f18127g.hashCode() + h0.b.b(c7.a.g(this.f18125e, c7.a.g(this.f18124d, c7.a.g(this.f18123c, h0.b.b(Long.hashCode(this.f18121a) * 31, 31, this.f18122b), 31), 31), 31), 31, this.f18126f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlushConnectionInfoJobResult(id=");
        sb2.append(this.f18121a);
        sb2.append(", taskId=");
        sb2.append(this.f18122b);
        sb2.append(", taskName=");
        sb2.append(this.f18123c);
        sb2.append(", jobType=");
        sb2.append(this.f18124d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18125e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18126f);
        sb2.append(", results=");
        return h0.b.t(sb2, this.f18127g, ')');
    }
}
