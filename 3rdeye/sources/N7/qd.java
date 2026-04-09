package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: StrValueJsonParser.kt */
/* loaded from: classes.dex */
public final class qd implements D7.h, D7.i {
    public static sd d(D7.f fVar, sd sdVar, JSONObject jSONObject) throws z7.d {
        return new sd(l7.c.d(T1.B.w(fVar), jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43898c, B4.g.p(fVar, "context", jSONObject, "data"), sdVar != null ? sdVar.f9195a : null));
    }

    public static JSONObject e(D7.f context, sd value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", "string");
        l7.c.q(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f9195a);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (sd) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
