package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: ArrayValueJsonParser.kt */
/* renamed from: N7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1129d implements D7.j<JSONObject, C1144e, C1084a> {
    public static C1084a b(D7.f context, C1144e template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarC = l7.d.c(context, template.f8143a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43902g);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…, TYPE_HELPER_JSON_ARRAY)");
        return new C1084a(bVarC);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (C1144e) bVar, jSONObject);
    }
}
