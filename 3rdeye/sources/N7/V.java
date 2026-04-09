package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DictVariableJsonParser.kt */
/* loaded from: classes.dex */
public final class V implements D7.h, D7.b {
    public static U d(D7.f context, JSONObject data) throws z7.d {
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
            return new U(str, (JSONObject) obj2);
        }
        throw z7.e.g(AppMeasurementSdk.ConditionalUserProperty.VALUE, data);
    }

    public static JSONObject e(D7.f context, U value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f6354a);
        k8.F.y(context, jSONObject, "type", "dict");
        k8.F.y(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f6355b);
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (U) obj);
    }
}
