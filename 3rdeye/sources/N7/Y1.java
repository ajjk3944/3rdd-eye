package N7;

import N7.U1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes.dex */
public final class Y1 implements D7.h, D7.b {
    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        k.g gVar = l7.k.f43898c;
        A8.d dVar = l7.e.f43878b;
        j6.l lVar = l7.e.f43877a;
        return new U1.a.C0096a(l7.b.a(context, data, AppMeasurementSdk.ConditionalUserProperty.NAME, gVar, dVar, lVar), l7.b.a(context, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, gVar, dVar, lVar));
    }

    @Override // D7.h
    public final JSONObject b(D7.f context, Object obj) {
        U1.a.C0096a value = (U1.a.C0096a) obj;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.NAME, value.f6367a);
        l7.b.d(context, jSONObject, AppMeasurementSdk.ConditionalUserProperty.VALUE, value.f6368b);
        return jSONObject;
    }
}
