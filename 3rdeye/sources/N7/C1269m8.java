package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivPivotPercentageJsonParser.kt */
/* renamed from: N7.m8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1269m8 implements D7.h, D7.i {
    public static C1297o8 d(D7.f fVar, C1297o8 c1297o8, JSONObject jSONObject) throws z7.d {
        return new C1297o8(l7.c.e(T1.B.w(fVar), jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43899d, B4.g.p(fVar, "context", jSONObject, "data"), c1297o8 != null ? c1297o8.f8861a : null, l7.h.f43885f, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, C1297o8 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", "pivot-percentage");
        l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f8861a);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1297o8) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
