package ni;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f17805a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17806b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17807c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17808d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17809e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17810f;

    /* renamed from: g, reason: collision with root package name */
    public final List f17811g;

    public f(long j, long j7, String str, String str2, String str3, long j10, List list) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        this.f17805a = j;
        this.f17806b = j7;
        this.f17807c = str;
        this.f17808d = str2;
        this.f17809e = str3;
        this.f17810f = j10;
        this.f17811g = list;
    }

    @Override // vj.c
    public final String a() {
        return this.f17809e;
    }

    @Override // vj.c
    public final long b() {
        return this.f17805a;
    }

    @Override // vj.c
    public final String c() {
        return this.f17808d;
    }

    @Override // vj.c
    public final long d() {
        return this.f17806b;
    }

    @Override // vj.c
    public final String e() {
        return this.f17807c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f17805a == fVar.f17805a && this.f17806b == fVar.f17806b && br.l.a(this.f17807c, fVar.f17807c) && br.l.a(this.f17808d, fVar.f17808d) && br.l.a(this.f17809e, fVar.f17809e) && this.f17810f == fVar.f17810f && br.l.a(this.f17811g, fVar.f17811g);
    }

    @Override // vj.c
    public final long f() {
        return this.f17810f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f17811g.iterator();
        while (it.hasNext()) {
            jSONArray.put(new JSONObject(((g) it.next()).h()));
        }
        jSONObject.put("CORE_RESULT_ITEMS", jSONArray);
    }

    public final int hashCode() {
        return this.f17811g.hashCode() + h0.b.b(c7.a.g(this.f17809e, c7.a.g(this.f17808d, c7.a.g(this.f17807c, h0.b.b(Long.hashCode(this.f17805a) * 31, 31, this.f17806b), 31), 31), 31), 31, this.f17810f);
    }

    public final g i() {
        Object next;
        List list = this.f17811g;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            m0 m0Var = ((g) next).f17841v;
            if (m0Var != null ? br.l.a(m0Var.f18026g, Boolean.TRUE) : false) {
                break;
            }
        }
        g gVar = (g) next;
        return gVar == null ? (g) mq.o.t0(list) : gVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CoreResult(id=");
        sb2.append(this.f17805a);
        sb2.append(", taskId=");
        sb2.append(this.f17806b);
        sb2.append(", taskName=");
        sb2.append(this.f17807c);
        sb2.append(", jobType=");
        sb2.append(this.f17808d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f17809e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f17810f);
        sb2.append(", coreResultItems=");
        return h0.b.t(sb2, this.f17811g, ')');
    }
}
