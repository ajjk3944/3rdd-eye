package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivInputFilterExpressionJsonParser.kt */
/* loaded from: classes.dex */
public final class W5 implements D7.h, D7.b {
    public static V5 d(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        return new V5(l7.b.a(context, data, "condition", l7.k.f43896a, l7.h.f43884e, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, V5 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, "condition", value.f7571a);
        k8.F.y(context, jSONObject, "type", "expression");
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (V5) obj);
    }
}
