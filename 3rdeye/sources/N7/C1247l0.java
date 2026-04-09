package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionAnimatorStopJsonParser.kt */
/* renamed from: N7.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1247l0 implements D7.h, D7.b {
    public static C1233k0 d(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        Object objOpt = data.opt("animator_id");
        if (objOpt == JSONObject.NULL) {
            objOpt = null;
        }
        if (objOpt != null) {
            return new C1233k0((String) objOpt);
        }
        throw z7.e.g("animator_id", data);
    }

    public static JSONObject e(D7.f context, C1233k0 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "animator_id", value.f8625a);
        k8.F.y(context, jSONObject, "type", "animator_stop");
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1233k0) obj);
    }
}
