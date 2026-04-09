package N7;

import org.json.JSONObject;

/* compiled from: DivActionFocusElementJsonParser.kt */
/* renamed from: N7.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1176g1 implements D7.j<JSONObject, C1191h1, C1131d1> {
    public static C1131d1 b(D7.f context, C1191h1 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarC = l7.d.c(context, template.f8317a, data, "element_id", l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…_id\", TYPE_HELPER_STRING)");
        return new C1131d1(bVarC);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (C1191h1) bVar, jSONObject);
    }
}
