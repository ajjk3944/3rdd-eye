package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ArrayValueJsonParser.kt */
/* renamed from: N7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1114c implements D7.h, D7.i {
    public static C1144e d(D7.f fVar, C1144e c1144e, JSONObject jSONObject) throws z7.d {
        return new C1144e(l7.c.d(T1.B.w(fVar), jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43902g, B4.g.p(fVar, "context", jSONObject, "data"), c1144e != null ? c1144e.f8143a : null));
    }

    public static JSONObject e(D7.f context, C1144e value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", "array");
        l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f8143a);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1144e) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
