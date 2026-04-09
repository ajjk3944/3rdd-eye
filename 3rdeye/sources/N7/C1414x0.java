package N7;

import org.json.JSONObject;

/* compiled from: DivActionArrayRemoveValueJsonParser.kt */
/* renamed from: N7.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1414x0 implements D7.j<JSONObject, C1428y0, C1372u0> {
    public static C1372u0 b(D7.f context, C1428y0 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarD = l7.d.d(context, template.f9806a, data, "index", l7.k.f43897b, l7.h.f43886g);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…ELPER_INT, NUMBER_TO_INT)");
        A7.b bVarC = l7.d.c(context, template.f9807b, data, "variable_name", l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…ame\", TYPE_HELPER_STRING)");
        return new C1372u0(bVarD, bVarC);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (C1428y0) bVar, jSONObject);
    }
}
