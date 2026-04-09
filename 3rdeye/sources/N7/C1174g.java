package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ArrayVariableJsonParser.kt */
/* renamed from: N7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1174g implements D7.h, D7.b {
    public static C1159f d(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        Object objOpt = data.opt(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Object obj = JSONObject.NULL;
        if (objOpt == obj) {
            objOpt = null;
        }
        if (objOpt == null) {
            throw z7.e.g(AppMeasurementSdk.ConditionalUserProperty.NAME, data);
        }
        String str = (String) objOpt;
        Object objOpt2 = data.opt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Object obj2 = objOpt2 != obj ? objOpt2 : null;
        if (obj2 != null) {
            return new C1159f(str, (JSONArray) obj2);
        }
        throw z7.e.g(AppMeasurementSdk.ConditionalUserProperty.VALUE, data);
    }

    public static JSONObject e(D7.f context, C1159f value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f8178a);
        k8.F.y(context, jSONObject, "type", "array");
        k8.F.y(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f8179b);
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1159f) obj);
    }
}
