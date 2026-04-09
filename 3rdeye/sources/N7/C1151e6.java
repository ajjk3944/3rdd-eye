package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivInputFilterRegexJsonParser.kt */
/* renamed from: N7.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1151e6 implements D7.h, D7.b {
    public static C1136d6 d(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        return new C1136d6(l7.b.a(context, data, "pattern", l7.k.f43898c, l7.e.f43878b, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, C1136d6 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, "pattern", value.f8069a);
        k8.F.y(context, jSONObject, "type", "regex");
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1136d6) obj);
    }
}
