package z7;

import N7.J6;
import h7.C4422c;
import io.appmetrica.analytics.impl.Oo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;
import m0.C5308a;
import org.json.JSONException;
import org.json.JSONObject;
import z7.b;

/* compiled from: TemplateParsingEnvironment.kt */
/* loaded from: classes.dex */
public abstract class g<T extends b<?>> implements D7.f {

    /* renamed from: b, reason: collision with root package name */
    public final B7.a<T> f48480b;

    public g(B7.a aVar) {
        this.f48480b = aVar;
    }

    @Override // D7.f
    public final c a() {
        return c.f48475r8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(JSONObject jSONObject) throws JSONException {
        B7.b bVar = this.f48480b.f577b;
        com.google.android.gms.measurement.internal.a aVar = c.f48475r8;
        C5308a c5308a = new C5308a();
        C5308a c5308a2 = new C5308a();
        try {
            LinkedHashMap linkedHashMapC = l7.f.c(this, jSONObject);
            c5308a.putAll(bVar.f578b);
            B7.e eVar = new B7.e(c5308a, 0);
            for (Map.Entry entry : linkedHashMapC.entrySet()) {
                String str = (String) entry.getKey();
                Set set = (Set) entry.getValue();
                try {
                    E7.b bVar2 = new E7.b(eVar, new A3.c(aVar, str));
                    Oo oo = ((Z6.a) this).f14017d;
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                    l.e(jSONObject2, "json.getJSONObject(name)");
                    oo.getClass();
                    c5308a.put(str, ((J6) D7.a.f1071b.f6946x9.getValue()).a(bVar2, jSONObject2));
                    if (!set.isEmpty()) {
                        c5308a2.put(str, set);
                    }
                } catch (d unused) {
                    int i = C4422c.f38270a;
                }
            }
        } catch (Exception unused2) {
            int i10 = C4422c.f38270a;
        }
        Iterator it = ((C5308a.C0496a) c5308a.entrySet()).iterator();
        while (true) {
            C5308a.d dVar = (C5308a.d) it;
            if (!dVar.hasNext()) {
                return;
            }
            dVar.next();
            C5308a.d dVar2 = dVar;
            String templateId = (String) dVar2.getKey();
            b jsonTemplate = (b) dVar2.getValue();
            l.f(templateId, "templateId");
            l.f(jsonTemplate, "jsonTemplate");
            bVar.f578b.put(templateId, jsonTemplate);
        }
    }

    @Override // D7.f
    public final /* synthetic */ boolean e() {
        return true;
    }
}
