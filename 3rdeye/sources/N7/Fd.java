package N7;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UrlVariableJsonParser.kt */
/* loaded from: classes.dex */
public final class Fd implements D7.h, D7.i {
    public static Hd d(D7.f fVar, Hd hd, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new Hd(l7.c.a(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, zP, hd != null ? hd.f5436a : null), l7.c.c(fVarW, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, zP, hd != null ? hd.f5437b : null, l7.h.f43883d, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, Hd value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.t(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f5436a);
        k8.F.y(context, jSONObject, "type", ImagesContract.URL);
        l7.c.s(context, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f5437b, jSONObject, l7.h.f43882c);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (Hd) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
