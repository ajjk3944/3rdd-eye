package ou;

import com.google.android.gms.internal.measurement.e5;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final t f19860a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19861b;

    /* renamed from: c, reason: collision with root package name */
    public final s f19862c;

    /* renamed from: d, reason: collision with root package name */
    public final bc.f0 f19863d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f19864e;

    /* renamed from: f, reason: collision with root package name */
    public h f19865f;

    public a0(t tVar, String str, s sVar, bc.f0 f0Var, Map map) {
        br.l.e(tVar, "url");
        br.l.e(str, "method");
        this.f19860a = tVar;
        this.f19861b = str;
        this.f19862c = sVar;
        this.f19863d = f0Var;
        this.f19864e = map;
    }

    public final h a() {
        h hVar = this.f19865f;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = h.f19908n;
        h hVarH = d.h(this.f19862c);
        this.f19865f = hVarH;
        return hVarH;
    }

    public final cj.a b() {
        cj.a aVar = new cj.a(false);
        aVar.f3978y = new LinkedHashMap();
        aVar.f3974d = this.f19860a;
        aVar.f3975g = this.f19861b;
        aVar.f3977x = this.f19863d;
        Map map = this.f19864e;
        aVar.f3978y = map.isEmpty() ? new LinkedHashMap() : mq.b0.Y(map);
        aVar.f3976r = this.f19862c.c();
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f19861b);
        sb2.append(", url=");
        sb2.append(this.f19860a);
        s sVar = this.f19862c;
        if (sVar.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object obj : sVar) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    e5.Q();
                    throw null;
                }
                lq.l lVar = (lq.l) obj;
                String str = (String) lVar.f15571a;
                String str2 = (String) lVar.f15572d;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        Map map = this.f19864e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
