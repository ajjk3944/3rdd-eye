package N7;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UrlVariableJsonParser.kt */
/* loaded from: classes.dex */
public final class Ed implements D7.h, D7.b {
    public static Dd d(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        Object objOpt = data.opt(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (objOpt == JSONObject.NULL) {
            objOpt = null;
        }
        if (objOpt != null) {
            return new Dd((String) objOpt, (Uri) k8.F.m(data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.h.f43883d));
        }
        throw z7.e.g(AppMeasurementSdk.ConditionalUserProperty.NAME, data);
    }

    public static JSONObject e(D7.f context, Dd value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f5121a);
        k8.F.y(context, jSONObject, "type", ImagesContract.URL);
        k8.F.A(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f5122b, l7.h.f43882c);
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (Dd) obj);
    }
}
