package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: DivPivotPercentageJsonParser.kt */
/* renamed from: N7.n8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1283n8 implements D7.j<JSONObject, C1297o8, C1241k8> {
    public static C1241k8 b(D7.f context, C1297o8 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarD = l7.d.d(context, template.f8861a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43899d, l7.h.f43885f);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…DOUBLE, NUMBER_TO_DOUBLE)");
        return new C1241k8(bVarD);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (C1297o8) bVar, jSONObject);
    }
}
