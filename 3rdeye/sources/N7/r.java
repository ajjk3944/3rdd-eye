package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BoolVariableJsonParser.kt */
/* loaded from: classes.dex */
public final class r implements D7.h, D7.i {
    public static C1357t d(D7.f fVar, C1357t c1357t, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new C1357t(l7.c.a(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, zP, c1357t != null ? c1357t.f9196a : null), l7.c.c(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, zP, c1357t != null ? c1357t.f9197b : null, l7.h.f43884e, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, C1357t value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.t(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f9196a);
        k8.F.y(context, jSONObject, "type", "boolean");
        l7.c.t(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f9197b);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1357t) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
