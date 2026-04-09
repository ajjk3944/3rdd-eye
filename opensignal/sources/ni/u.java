package ni;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f18194a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18195b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18196c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18197d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18198e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18199f;

    /* renamed from: g, reason: collision with root package name */
    public final List f18200g;

    public u(long j, long j7, String str, String str2, String str3, long j10, List list) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        this.f18194a = j;
        this.f18195b = j7;
        this.f18196c = str;
        this.f18197d = str2;
        this.f18198e = str3;
        this.f18199f = j10;
        this.f18200g = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List] */
    public static u i(u uVar, long j, ArrayList arrayList, int i10) {
        if ((i10 & 1) != 0) {
            j = uVar.f18194a;
        }
        long j7 = j;
        long j10 = uVar.f18195b;
        String str = uVar.f18196c;
        String str2 = uVar.f18197d;
        String str3 = uVar.f18198e;
        long j11 = uVar.f18199f;
        ArrayList arrayList2 = arrayList;
        if ((i10 & 64) != 0) {
            arrayList2 = uVar.f18200g;
        }
        uVar.getClass();
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        return new u(j7, j10, str, str2, str3, j11, arrayList2);
    }

    @Override // vj.c
    public final String a() {
        return this.f18198e;
    }

    @Override // vj.c
    public final long b() {
        return this.f18194a;
    }

    @Override // vj.c
    public final String c() {
        return this.f18197d;
    }

    @Override // vj.c
    public final long d() {
        return this.f18195b;
    }

    @Override // vj.c
    public final String e() {
        return this.f18196c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f18194a == uVar.f18194a && this.f18195b == uVar.f18195b && br.l.a(this.f18196c, uVar.f18196c) && br.l.a(this.f18197d, uVar.f18197d) && br.l.a(this.f18198e, uVar.f18198e) && this.f18199f == uVar.f18199f && br.l.a(this.f18200g, uVar.f18200g);
    }

    @Override // vj.c
    public final long f() {
        return this.f18199f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f18200g.iterator();
        while (it.hasNext()) {
            jSONArray.put(((fh.g) it.next()).b());
        }
        jSONObject.put("http_head_latencies", jSONArray.toString());
    }

    public final int hashCode() {
        return this.f18200g.hashCode() + h0.b.b(c7.a.g(this.f18198e, c7.a.g(this.f18197d, c7.a.g(this.f18196c, h0.b.b(Long.hashCode(this.f18194a) * 31, 31, this.f18195b), 31), 31), 31), 31, this.f18199f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpHeadLatencyJobResult(id=");
        sb2.append(this.f18194a);
        sb2.append(", taskId=");
        sb2.append(this.f18195b);
        sb2.append(", taskName=");
        sb2.append(this.f18196c);
        sb2.append(", jobType=");
        sb2.append(this.f18197d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f18198e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f18199f);
        sb2.append(", latencyList=");
        return h0.b.t(sb2, this.f18200g, ')');
    }
}
