package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NumberValueJsonParser.kt */
/* loaded from: classes.dex */
public final class Xc implements D7.h, D7.i {
    public static Zc d(D7.f fVar, Zc zc, JSONObject jSONObject) throws z7.d {
        return new Zc(l7.c.e(T1.B.w(fVar), jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43899d, B4.g.p(fVar, "context", jSONObject, "data"), zc != null ? zc.f7874a : null, l7.h.f43885f, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, Zc value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", "number");
        l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f7874a);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (Zc) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
