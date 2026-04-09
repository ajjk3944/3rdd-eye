package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NumberVariableJsonParser.kt */
/* renamed from: N7.cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1128cd implements D7.h, D7.i {
    public static C1158ed d(D7.f fVar, C1158ed c1158ed, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new C1158ed(l7.c.a(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, zP, c1158ed != null ? c1158ed.f8176a : null), l7.c.c(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, zP, c1158ed != null ? c1158ed.f8177b : null, l7.h.f43885f, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, C1158ed value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.t(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f8176a);
        k8.F.y(context, jSONObject, "type", "number");
        l7.c.t(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f8177b);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1158ed) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
