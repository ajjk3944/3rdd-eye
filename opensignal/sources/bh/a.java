package bh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mq.p;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2744a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2745b;

    /* renamed from: c, reason: collision with root package name */
    public final c f2746c;

    /* renamed from: d, reason: collision with root package name */
    public final e f2747d;

    /* renamed from: e, reason: collision with root package name */
    public final g f2748e;

    /* renamed from: f, reason: collision with root package name */
    public final List f2749f;

    public a(int i10, int i11, c cVar, e eVar, g gVar, List list) {
        br.l.e(cVar, "category");
        br.l.e(eVar, "explanation");
        br.l.e(gVar, "icon");
        this.f2744a = i10;
        this.f2745b = i11;
        this.f2746c = cVar;
        this.f2747d = eVar;
        this.f2748e = gVar;
        this.f2749f = list;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("priority", this.f2744a);
        jSONObject.put("result_code", this.f2745b);
        jSONObject.put("category", this.f2746c.getId());
        jSONObject.put("explanation", this.f2747d.getId());
        jSONObject.put("icon", this.f2748e.getId());
        List list = this.f2749f;
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((m) it.next()).getId()));
        }
        jSONObject.put("solutions", xu.d.h0(arrayList));
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2744a == aVar.f2744a && this.f2745b == aVar.f2745b && this.f2746c == aVar.f2746c && this.f2747d == aVar.f2747d && this.f2748e == aVar.f2748e && br.l.a(this.f2749f, aVar.f2749f);
    }

    public final int hashCode() {
        return this.f2749f.hashCode() + ((this.f2748e.hashCode() + ((this.f2747d.hashCode() + ((this.f2746c.hashCode() + c7.a.C(this.f2745b, Integer.hashCode(this.f2744a) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssistantAnalysisResult(priority=");
        sb2.append(this.f2744a);
        sb2.append(", resultCode=");
        sb2.append(this.f2745b);
        sb2.append(", category=");
        sb2.append(this.f2746c);
        sb2.append(", explanation=");
        sb2.append(this.f2747d);
        sb2.append(", icon=");
        sb2.append(this.f2748e);
        sb2.append(", solutions=");
        return h0.b.t(sb2, this.f2749f, ')');
    }
}
