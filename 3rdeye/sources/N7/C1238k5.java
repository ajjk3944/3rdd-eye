package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivFunctionArgumentJsonParser.kt */
/* renamed from: N7.k5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1238k5 implements D7.h, D7.b {
    public static JSONObject d(D7.f context, C1224j5 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f8485a);
        k8.F.A(context, jSONObject, "type", value.f8486b, EnumC1404w4.TO_STRING);
        return jSONObject;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        Object objOpt = data.opt(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (objOpt == JSONObject.NULL) {
            objOpt = null;
        }
        if (objOpt != null) {
            return new C1224j5((String) objOpt, (EnumC1404w4) k8.F.m(data, "type", EnumC1404w4.FROM_STRING));
        }
        throw z7.e.g(AppMeasurementSdk.ConditionalUserProperty.NAME, data);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return d(fVar, (C1224j5) obj);
    }
}
