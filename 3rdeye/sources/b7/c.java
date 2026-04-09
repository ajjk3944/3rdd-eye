package B7;

import N7.C1154e9;
import kotlin.jvm.internal.l;
import o7.C5431b;
import org.json.JSONObject;

/* compiled from: TemplateProvider.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class c {
    public static Z6.b a(f fVar, String str, JSONObject json) throws z7.d {
        l.f(json, "json");
        Z6.b bVar = fVar.get(str);
        if (bVar != null) {
            return bVar;
        }
        z7.d dVar = z7.e.f48479a;
        throw new z7.d(z7.f.MISSING_TEMPLATE, C1154e9.i("Template '", str, "' is missing!"), null, new C5431b(json), d.C(json), 4);
    }
}
