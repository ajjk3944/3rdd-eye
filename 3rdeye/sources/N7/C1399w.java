package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ColorValueJsonParser.kt */
/* renamed from: N7.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1399w implements D7.h, D7.i {
    public static C1427y d(D7.f fVar, C1427y c1427y, JSONObject jSONObject) throws z7.d {
        return new C1427y(l7.c.e(T1.B.w(fVar), jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43901f, B4.g.p(fVar, "context", jSONObject, "data"), c1427y != null ? c1427y.f9805a : null, l7.h.f43881b, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, C1427y value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", "color");
        l7.c.p(context, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f9805a, jSONObject, l7.h.f43880a);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1427y) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
