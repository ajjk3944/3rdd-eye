package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ColorVariableJsonParser.kt */
/* loaded from: classes.dex */
public final class B implements D7.h, D7.i {
    public static D d(D7.f fVar, D d10, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new D(l7.c.a(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, zP, d10 != null ? d10.f5050a : null), l7.c.c(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, zP, d10 != null ? d10.f5051b : null, l7.h.f43881b, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, D value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.t(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f5050a);
        k8.F.y(context, jSONObject, "type", "color");
        l7.c.s(context, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f5051b, jSONObject, l7.h.f43880a);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (D) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
