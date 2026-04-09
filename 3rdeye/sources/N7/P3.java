package N7;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* compiled from: DivCurrencyInputMaskJsonParser.kt */
/* loaded from: classes.dex */
public final class P3 implements D7.j<JSONObject, Q3, M3> {
    public static M3 b(D7.f context, Q3 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarJ = l7.d.j(context, template.f6035a, data, CommonUrlParts.LOCALE, l7.k.f43898c);
        Object objB = l7.d.b(template.f6036b, data, "raw_text_variable", l7.e.f43878b, l7.e.f43877a);
        kotlin.jvm.internal.l.e(objB, "resolve(context, templat…ata, \"raw_text_variable\")");
        return new M3(bVarJ, (String) objB);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (Q3) bVar, jSONObject);
    }
}
