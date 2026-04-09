package ai;

import br.l;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f386a;

    /* renamed from: b, reason: collision with root package name */
    public final long f387b;

    /* renamed from: c, reason: collision with root package name */
    public final String f388c;

    /* renamed from: d, reason: collision with root package name */
    public final String f389d;

    /* renamed from: e, reason: collision with root package name */
    public final String f390e;

    /* renamed from: f, reason: collision with root package name */
    public final long f391f;

    /* renamed from: g, reason: collision with root package name */
    public final List f392g;

    /* renamed from: h, reason: collision with root package name */
    public final long f393h;

    /* renamed from: i, reason: collision with root package name */
    public final String f394i;

    public e(long j, long j7, String str, String str2, String str3, long j10, List list, long j11, String str4) {
        l.e(str, "taskName");
        l.e(str2, "jobType");
        l.e(str3, "dataEndpoint");
        this.f386a = j;
        this.f387b = j7;
        this.f388c = str;
        this.f389d = str2;
        this.f390e = str3;
        this.f391f = j10;
        this.f392g = list;
        this.f393h = j11;
        this.f394i = str4;
    }

    public static e i(e eVar, long j) {
        long j7 = eVar.f387b;
        String str = eVar.f388c;
        String str2 = eVar.f389d;
        String str3 = eVar.f390e;
        long j10 = eVar.f391f;
        List list = eVar.f392g;
        long j11 = eVar.f393h;
        String str4 = eVar.f394i;
        l.e(str, "taskName");
        l.e(str2, "jobType");
        l.e(str3, "dataEndpoint");
        return new e(j, j7, str, str2, str3, j10, list, j11, str4);
    }

    @Override // vj.c
    public final String a() {
        return this.f390e;
    }

    @Override // vj.c
    public final long b() {
        return this.f386a;
    }

    @Override // vj.c
    public final String c() {
        return this.f389d;
    }

    @Override // vj.c
    public final long d() {
        return this.f387b;
    }

    @Override // vj.c
    public final String e() {
        return this.f388c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f386a == eVar.f386a && this.f387b == eVar.f387b && l.a(this.f388c, eVar.f388c) && l.a(this.f389d, eVar.f389d) && l.a(this.f390e, eVar.f390e) && this.f391f == eVar.f391f && l.a(this.f392g, eVar.f392g) && this.f393h == eVar.f393h && l.a(this.f394i, eVar.f394i);
    }

    @Override // vj.c
    public final long f() {
        return this.f391f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f392g.iterator();
        while (it.hasNext()) {
            jSONArray.put(((bh.a) it.next()).a());
        }
        jSONObject.put("assistant_results", jSONArray);
        jSONObject.put("assistant_entity_id", this.f394i);
        jSONObject.put("assistant_duration_in_millis", this.f393h);
    }

    public final int hashCode() {
        return this.f394i.hashCode() + h0.b.b(h0.b.c(h0.b.b(c7.a.g(this.f390e, c7.a.g(this.f389d, c7.a.g(this.f388c, h0.b.b(Long.hashCode(this.f386a) * 31, 31, this.f387b), 31), 31), 31), 31, this.f391f), 31, this.f392g), 31, this.f393h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssistantJobResult(id=");
        sb2.append(this.f386a);
        sb2.append(", taskId=");
        sb2.append(this.f387b);
        sb2.append(", taskName=");
        sb2.append(this.f388c);
        sb2.append(", jobType=");
        sb2.append(this.f389d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f390e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f391f);
        sb2.append(", assistantAnalysisResults=");
        sb2.append(this.f392g);
        sb2.append(", durationInMillis=");
        sb2.append(this.f393h);
        sb2.append(", entityId=");
        return h0.b.r(sb2, this.f394i, ')');
    }
}
