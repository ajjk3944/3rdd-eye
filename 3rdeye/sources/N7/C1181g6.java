package N7;

import org.json.JSONObject;

/* compiled from: DivInputFilterRegexJsonParser.kt */
/* renamed from: N7.g6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1181g6 implements D7.j<JSONObject, C1196h6, C1136d6> {
    public static C1136d6 b(D7.f context, C1196h6 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarC = l7.d.c(context, template.f8352a, data, "pattern", l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…ern\", TYPE_HELPER_STRING)");
        return new C1136d6(bVarC);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (C1196h6) bVar, jSONObject);
    }
}
