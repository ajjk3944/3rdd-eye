package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: IntegerValueJsonParser.kt */
/* loaded from: classes.dex */
public final class Nc implements D7.j<JSONObject, Oc, Kc> {
    public static Kc b(D7.f context, Oc template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarD = l7.d.d(context, template.f5998a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43897b, l7.h.f43886g);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…ELPER_INT, NUMBER_TO_INT)");
        return new Kc(bVarD);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (Oc) bVar, jSONObject);
    }
}
