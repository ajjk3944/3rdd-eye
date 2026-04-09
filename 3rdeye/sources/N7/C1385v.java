package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ColorValueJsonParser.kt */
/* renamed from: N7.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1385v implements D7.h, D7.b {
    public static C1371u d(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        return new C1371u(l7.b.a(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43901f, l7.h.f43881b, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, C1371u value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", "color");
        l7.b.e(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f9353a, l7.h.f43880a);
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1371u) obj);
    }
}
