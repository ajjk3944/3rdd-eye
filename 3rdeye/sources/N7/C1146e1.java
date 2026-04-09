package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionFocusElementJsonParser.kt */
/* renamed from: N7.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1146e1 implements D7.h, D7.b {
    public static C1131d1 d(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        return new C1131d1(l7.b.a(context, data, "element_id", l7.k.f43898c, l7.e.f43878b, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, C1131d1 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, "element_id", value.f8048a);
        k8.F.y(context, jSONObject, "type", "focus_element");
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1131d1) obj);
    }
}
