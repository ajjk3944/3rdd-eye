package N7;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UrlValueJsonParser.kt */
/* loaded from: classes.dex */
public final class Ad implements D7.h, D7.i {
    public static Cd d(D7.f fVar, Cd cd, JSONObject jSONObject) throws z7.d {
        return new Cd(l7.c.e(T1.B.w(fVar), jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43900e, B4.g.p(fVar, "context", jSONObject, "data"), cd != null ? cd.f5049a : null, l7.h.f43883d, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, Cd value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", ImagesContract.URL);
        l7.c.p(context, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f5049a, jSONObject, l7.h.f43882c);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (Cd) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
