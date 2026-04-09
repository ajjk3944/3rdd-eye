package ni;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18073a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18074b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18075c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18076d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18077e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18078f;

    /* renamed from: g, reason: collision with root package name */
    public final List f18079g;

    public p(long j, long j7, String str, String str2, String str3, long j10, List list) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        this.f18073a = j;
        this.f18074b = j7;
        this.f18075c = str;
        this.f18076d = str2;
        this.f18077e = str3;
        this.f18078f = j10;
        this.f18079g = list;
    }

    @Override // vj.c
    public final String a() {
        return this.f18077e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18073a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18076d;
    }

    @Override // vj.c
    public final long d() {
        return this.f18074b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18075c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f18073a == pVar.f18073a && this.f18074b == pVar.f18074b && br.l.a(this.f18075c, pVar.f18075c) && br.l.a(this.f18076d, pVar.f18076d) && br.l.a(this.f18077e, pVar.f18077e) && this.f18078f == pVar.f18078f && br.l.a(this.f18079g, pVar.f18079g);
    }

    @Override // vj.c
    public final long f() {
        return this.f18078f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f18079g.iterator();
        while (it.hasNext()) {
            jSONArray.put(new JSONObject(((q) it.next()).h()));
        }
        jSONObject.put("END_CORE_RESULT_ITEMS", jSONArray);
    }

    public final int hashCode() {
        return this.f18079g.hashCode() + h0.b.b(c7.a.g(this.f18077e, c7.a.g(this.f18076d, c7.a.g(this.f18075c, h0.b.b(Long.hashCode(this.f18073a) * 31, 31, this.f18074b), 31), 31), 31), 31, this.f18078f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EndCoreResult(id=");
        sb2.append(this.f18073a);
        sb2.append(", taskId=");
        sb2.append(this.f18074b);
        sb2.append(", taskName=");
        sb2.append(this.f18075c);
        sb2.append(", jobType=");
        sb2.append(this.f18076d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18077e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18078f);
        sb2.append(", endCoreResultItems=");
        return h0.b.t(sb2, this.f18079g, ')');
    }
}
