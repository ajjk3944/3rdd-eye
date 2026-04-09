package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StrVariableJsonParser.kt */
/* loaded from: classes.dex */
public final class vd implements D7.h, D7.i {
    public static xd d(D7.f fVar, xd xdVar, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new xd(l7.c.a(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, zP, xdVar != null ? xdVar.f9803a : null), l7.c.a(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, zP, xdVar != null ? xdVar.f9804b : null));
    }

    public static JSONObject e(D7.f context, xd value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.t(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f9803a);
        k8.F.y(context, jSONObject, "type", "string");
        l7.c.t(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f9804b);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (xd) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
