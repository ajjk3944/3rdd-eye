package ni;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18315a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18316b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18317c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18318d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18319e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18320f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f18321g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f18322h;

    /* renamed from: i, reason: collision with root package name */
    public final List f18323i;
    public final String j;

    public z(long j, long j7, String str, String str2, String str3, long j10, Integer num, Integer num2, List list, String str4) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        this.f18315a = j;
        this.f18316b = j7;
        this.f18317c = str;
        this.f18318d = str2;
        this.f18319e = str3;
        this.f18320f = j10;
        this.f18321g = num;
        this.f18322h = num2;
        this.f18323i = list;
        this.j = str4;
    }

    public static z i(z zVar, long j) {
        long j7 = zVar.f18316b;
        String str = zVar.f18317c;
        String str2 = zVar.f18318d;
        String str3 = zVar.f18319e;
        long j10 = zVar.f18320f;
        Integer num = zVar.f18321g;
        Integer num2 = zVar.f18322h;
        List list = zVar.f18323i;
        String str4 = zVar.j;
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        return new z(j, j7, str, str2, str3, j10, num, num2, list, str4);
    }

    public static JSONArray j(List list) {
        JSONArray jSONArray = new JSONArray();
        ch.l lVar = ch.l.f3962t5;
        if (lVar.f3901t0 == null) {
            lVar.f3901t0 = new gi.a(8);
        }
        gi.a aVar = lVar.f3901t0;
        if (aVar == null) {
            br.l.l("_latencyResultItemJsonMapper");
            throw null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) aVar.a((a0) it.next()));
        }
        return jSONArray;
    }

    @Override // vj.c
    public final String a() {
        return this.f18319e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18315a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18318d;
    }

    @Override // vj.c
    public final long d() {
        return this.f18316b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18317c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f18315a == zVar.f18315a && this.f18316b == zVar.f18316b && br.l.a(this.f18317c, zVar.f18317c) && br.l.a(this.f18318d, zVar.f18318d) && br.l.a(this.f18319e, zVar.f18319e) && this.f18320f == zVar.f18320f && br.l.a(this.f18321g, zVar.f18321g) && br.l.a(this.f18322h, zVar.f18322h) && br.l.a(this.f18323i, zVar.f18323i) && br.l.a(this.j, zVar.j);
    }

    @Override // vj.c
    public final long f() {
        return this.f18320f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        jSONObject.put("JOB_RESULT_ITEMS", j(this.f18323i));
        xu.d.Y(jSONObject, "JOB_RESULT_UNRELIABLE_LATENCY", this.f18321g);
        xu.d.Y(jSONObject, "JOB_RESULT_LATENCY_EVENTS", this.j);
        xu.d.Y(jSONObject, "JOB_RESULT_MIN_MEDIAN_LATENCY", this.f18322h);
    }

    public final int hashCode() {
        int iB = h0.b.b(c7.a.g(this.f18319e, c7.a.g(this.f18318d, c7.a.g(this.f18317c, h0.b.b(Long.hashCode(this.f18315a) * 31, 31, this.f18316b), 31), 31), 31), 31, this.f18320f);
        Integer num = this.f18321g;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f18322h;
        int iC = h0.b.c((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f18323i);
        String str = this.j;
        return iC + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LatencyResult(id=");
        sb2.append(this.f18315a);
        sb2.append(", taskId=");
        sb2.append(this.f18316b);
        sb2.append(", taskName=");
        sb2.append(this.f18317c);
        sb2.append(", jobType=");
        sb2.append(this.f18318d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18319e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18320f);
        sb2.append(", unreliableLatency=");
        sb2.append(this.f18321g);
        sb2.append(", minMedianLatency=");
        sb2.append(this.f18322h);
        sb2.append(", results=");
        sb2.append(this.f18323i);
        sb2.append(", latencyEvents=");
        return h0.b.r(sb2, this.j, ')');
    }
}
