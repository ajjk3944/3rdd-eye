package ni;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h1 extends vj.c {

    /* renamed from: a, reason: collision with root package name */
    public final long f17891a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17892b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17893c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17894d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17895e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17896f;

    /* renamed from: g, reason: collision with root package name */
    public final List f17897g;

    public h1(long j, long j7, String str, String str2, String str3, long j10, List list) {
        br.l.e(str, "taskName");
        br.l.e(str2, "jobType");
        br.l.e(str3, "dataEndpoint");
        this.f17891a = j;
        this.f17892b = j7;
        this.f17893c = str;
        this.f17894d = str2;
        this.f17895e = str3;
        this.f17896f = j10;
        this.f17897g = list;
    }

    @Override // vj.c
    public final String a() {
        return this.f17895e;
    }

    @Override // vj.c
    public final long b() {
        return this.f17891a;
    }

    @Override // vj.c
    public final String c() {
        return this.f17894d;
    }

    @Override // vj.c
    public final long d() {
        return this.f17892b;
    }

    @Override // vj.c
    public final String e() {
        return this.f17893c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f17891a == h1Var.f17891a && this.f17892b == h1Var.f17892b && br.l.a(this.f17893c, h1Var.f17893c) && br.l.a(this.f17894d, h1Var.f17894d) && br.l.a(this.f17895e, h1Var.f17895e) && this.f17896f == h1Var.f17896f && br.l.a(this.f17897g, h1Var.f17897g);
    }

    @Override // vj.c
    public final long f() {
        return this.f17896f;
    }

    @Override // vj.c
    public final void g(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f17897g.iterator();
        while (it.hasNext()) {
            jSONArray.put(((i1) it.next()).h());
        }
        jSONObject.put("WIFI_RESULT_ITEMS", jSONArray);
    }

    public final int hashCode() {
        return this.f17897g.hashCode() + h0.b.b(c7.a.g(this.f17895e, c7.a.g(this.f17894d, c7.a.g(this.f17893c, h0.b.b(Long.hashCode(this.f17891a) * 31, 31, this.f17892b), 31), 31), 31), 31, this.f17896f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WifiScanJobResult(id=");
        sb2.append(this.f17891a);
        sb2.append(", taskId=");
        sb2.append(this.f17892b);
        sb2.append(", taskName=");
        sb2.append(this.f17893c);
        sb2.append(", jobType=");
        sb2.append(this.f17894d);
        sb2.append(", dataEndpoint=");
        sb2.append(this.f17895e);
        sb2.append(", timeOfResult=");
        sb2.append(this.f17896f);
        sb2.append(", wifiScanResultItems=");
        return h0.b.t(sb2, this.f17897g, ')');
    }
}
