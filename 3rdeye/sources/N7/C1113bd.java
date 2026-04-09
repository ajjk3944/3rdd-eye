package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NumberVariableJsonParser.kt */
/* renamed from: N7.bd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1113bd implements D7.h, D7.b {
    public static C1098ad d(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        Object objOpt = data.opt(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (objOpt == JSONObject.NULL) {
            objOpt = null;
        }
        if (objOpt != null) {
            return new C1098ad((String) objOpt, ((Number) k8.F.m(data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.h.f43885f)).doubleValue());
        }
        throw z7.e.g(AppMeasurementSdk.ConditionalUserProperty.NAME, data);
    }

    public static JSONObject e(D7.f context, C1098ad value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f7903a);
        k8.F.y(context, jSONObject, "type", "number");
        k8.F.y(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, Double.valueOf(value.f7904b));
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1098ad) obj);
    }
}
