package N7;

import org.json.JSONObject;

/* compiled from: DivPhoneInputMaskJsonParser.kt */
/* renamed from: N7.b8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1108b8 implements D7.j<JSONObject, C1123c8, Y7> {
    public static Y7 b(D7.f context, C1123c8 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Object objB = l7.d.b(template.f7974a, data, "raw_text_variable", l7.e.f43878b, l7.e.f43877a);
        kotlin.jvm.internal.l.e(objB, "resolve(context, templat…ata, \"raw_text_variable\")");
        return new Y7((String) objB);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (C1123c8) bVar, jSONObject);
    }
}
