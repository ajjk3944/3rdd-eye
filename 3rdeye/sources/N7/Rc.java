package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IntegerVariableJsonParser.kt */
/* loaded from: classes.dex */
public final class Rc implements D7.h, D7.i {
    public static Tc d(D7.f fVar, Tc tc, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new Tc(l7.c.a(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, zP, tc != null ? tc.f6352a : null), l7.c.c(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, zP, tc != null ? tc.f6353b : null, l7.h.f43886g, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, Tc value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.t(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f6352a);
        k8.F.y(context, jSONObject, "type", "integer");
        l7.c.t(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f6353b);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (Tc) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
