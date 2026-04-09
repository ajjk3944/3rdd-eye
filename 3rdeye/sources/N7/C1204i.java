package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import n7.AbstractC5371a;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ArrayVariableJsonParser.kt */
/* renamed from: N7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1204i implements D7.j<JSONObject, C1218j, C1159f> {
    public static C1159f b(D7.f context, C1218j template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        AbstractC5371a<String> abstractC5371a = template.f8470a;
        A8.d dVar = l7.e.f43878b;
        j6.l lVar = l7.e.f43877a;
        Object objB = l7.d.b(abstractC5371a, data, AppMeasurementSdk.ConditionalUserProperty.NAME, dVar, lVar);
        kotlin.jvm.internal.l.e(objB, "resolve(context, template.name, data, \"name\")");
        Object objB2 = l7.d.b(template.f8471b, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, dVar, lVar);
        kotlin.jvm.internal.l.e(objB2, "resolve(context, template.value, data, \"value\")");
        return new C1159f((String) objB, (JSONArray) objB2);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (C1218j) bVar, jSONObject);
    }
}
