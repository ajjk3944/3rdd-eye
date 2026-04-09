package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivLayoutProviderJsonParser.kt */
/* loaded from: classes.dex */
public final class M6 implements D7.h, D7.b {
    public static JSONObject d(D7.f context, L6 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "height_variable_name", value.f5755a);
        k8.F.y(context, jSONObject, "width_variable_name", value.f5756b);
        return jSONObject;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        A8.d dVar = l7.e.f43878b;
        j6.l lVar = l7.e.f43877a;
        return new L6((String) k8.F.r(context, data, "height_variable_name", dVar, lVar), (String) k8.F.r(context, data, "width_variable_name", dVar, lVar));
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return d(fVar, (L6) obj);
    }
}
