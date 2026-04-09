package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: BoolVariableJsonParser.kt */
/* renamed from: N7.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1343s implements D7.j<JSONObject, C1357t, C1302p> {
    public static C1302p b(D7.f context, C1357t template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        AbstractC5371a<String> abstractC5371a = template.f9196a;
        A8.d dVar = l7.e.f43878b;
        j6.l lVar = l7.e.f43877a;
        Object objB = l7.d.b(abstractC5371a, data, AppMeasurementSdk.ConditionalUserProperty.NAME, dVar, lVar);
        kotlin.jvm.internal.l.e(objB, "resolve(context, template.name, data, \"name\")");
        Object objB2 = l7.d.b(template.f9197b, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.h.f43884e, lVar);
        kotlin.jvm.internal.l.e(objB2, "resolve(context, templat… \"value\", ANY_TO_BOOLEAN)");
        return new C1302p((String) objB, ((Boolean) objB2).booleanValue());
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (C1357t) bVar, jSONObject);
    }
}
