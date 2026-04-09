package N7;

import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: DivLayoutProviderJsonParser.kt */
/* loaded from: classes.dex */
public final class O6 implements D7.j<JSONObject, P6, L6> {
    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        P6 template = (P6) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        AbstractC5371a<String> abstractC5371a = template.f6006a;
        A8.d dVar = l7.e.f43878b;
        return new L6((String) l7.d.g(context, "height_variable_name", abstractC5371a, data, dVar), (String) l7.d.g(context, "width_variable_name", template.f6007b, data, dVar));
    }
}
