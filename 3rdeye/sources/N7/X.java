package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: DictVariableJsonParser.kt */
/* loaded from: classes.dex */
public final class X implements D7.j<JSONObject, Y, U> {
    public static U b(D7.f context, Y template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        AbstractC5371a<String> abstractC5371a = template.f7757a;
        A8.d dVar = l7.e.f43878b;
        j6.l lVar = l7.e.f43877a;
        Object objB = l7.d.b(abstractC5371a, data, AppMeasurementSdk.ConditionalUserProperty.NAME, dVar, lVar);
        kotlin.jvm.internal.l.e(objB, "resolve(context, template.name, data, \"name\")");
        Object objB2 = l7.d.b(template.f7758b, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, dVar, lVar);
        kotlin.jvm.internal.l.e(objB2, "resolve(context, template.value, data, \"value\")");
        return new U((String) objB, (JSONObject) objB2);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (Y) bVar, jSONObject);
    }
}
