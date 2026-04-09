package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: NumberValueJsonParser.kt */
/* loaded from: classes.dex */
public final class Yc implements D7.j<JSONObject, Zc, Vc> {
    public static Vc b(D7.f context, Zc template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarD = l7.d.d(context, template.f7874a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43899d, l7.h.f43885f);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…DOUBLE, NUMBER_TO_DOUBLE)");
        return new Vc(bVarD);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (Zc) bVar, jSONObject);
    }
}
