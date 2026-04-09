package N7;

import org.json.JSONObject;

/* compiled from: DivSolidBackgroundJsonParser.kt */
/* loaded from: classes.dex */
public final class V9 implements D7.j<JSONObject, W9, S9> {
    public static S9 b(D7.f context, W9 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarD = l7.d.d(context, template.f7625a, data, "color", l7.k.f43901f, l7.h.f43881b);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
        return new S9(bVarD);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (W9) bVar, jSONObject);
    }
}
