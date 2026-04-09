package N7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: DivExtensionJsonParser.kt */
/* loaded from: classes.dex */
public final class A4 implements D7.j<JSONObject, B4, C1418x4> {
    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        B4 template = (B4) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        AbstractC5371a<String> abstractC5371a = template.f4891a;
        A8.d dVar = l7.e.f43878b;
        Object objB = l7.d.b(abstractC5371a, data, FacebookMediationAdapter.KEY_ID, dVar, l7.e.f43877a);
        kotlin.jvm.internal.l.e(objB, "resolve(context, template.id, data, \"id\")");
        return new C1418x4((String) objB, (JSONObject) l7.d.g(context, "params", template.f4892b, data, dVar));
    }
}
