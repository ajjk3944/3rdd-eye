package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRelativeCenterJsonParser.kt */
/* loaded from: classes.dex */
public final class Q8 implements D7.j<JSONObject, R8, N8> {
    public static N8 b(D7.f context, R8 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarD = l7.d.d(context, template.f6159a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43899d, l7.h.f43885f);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…DOUBLE, NUMBER_TO_DOUBLE)");
        return new N8(bVarD);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (R8) bVar, jSONObject);
    }
}
