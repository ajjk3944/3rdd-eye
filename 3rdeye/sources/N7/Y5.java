package N7;

import org.json.JSONObject;

/* compiled from: DivInputFilterExpressionJsonParser.kt */
/* loaded from: classes.dex */
public final class Y5 implements D7.j<JSONObject, Z5, V5> {
    public static V5 b(D7.f context, Z5 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarD = l7.d.d(context, template.f7857a, data, "condition", l7.k.f43896a, l7.h.f43884e);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…_BOOLEAN, ANY_TO_BOOLEAN)");
        return new V5(bVarD);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (Z5) bVar, jSONObject);
    }
}
