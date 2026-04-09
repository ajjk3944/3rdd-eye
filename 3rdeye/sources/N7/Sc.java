package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: IntegerVariableJsonParser.kt */
/* loaded from: classes.dex */
public final class Sc implements D7.j<JSONObject, Tc, Pc> {
    public static Pc b(D7.f context, Tc template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        AbstractC5371a<String> abstractC5371a = template.f6352a;
        A8.d dVar = l7.e.f43878b;
        j6.l lVar = l7.e.f43877a;
        Object objB = l7.d.b(abstractC5371a, data, AppMeasurementSdk.ConditionalUserProperty.NAME, dVar, lVar);
        kotlin.jvm.internal.l.e(objB, "resolve(context, template.name, data, \"name\")");
        Object objB2 = l7.d.b(template.f6353b, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.h.f43886g, lVar);
        kotlin.jvm.internal.l.e(objB2, "resolve(context, templat…, \"value\", NUMBER_TO_INT)");
        return new Pc((String) objB, ((Number) objB2).longValue());
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (Tc) bVar, jSONObject);
    }
}
