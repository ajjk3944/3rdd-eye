package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ArrayValueJsonParser.kt */
/* renamed from: N7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1099b implements D7.h, D7.b {
    public static C1084a d(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        return new C1084a(l7.b.a(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43902g, l7.e.f43878b, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, C1084a value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", "array");
        l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f7875a);
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1084a) obj);
    }
}
