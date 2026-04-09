package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: StrValueJsonParser.kt */
/* loaded from: classes.dex */
public final class rd implements D7.j<JSONObject, sd, od> {
    public static od b(D7.f context, sd template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarC = l7.d.c(context, template.f9195a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…lue\", TYPE_HELPER_STRING)");
        return new od(bVarC);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (sd) bVar, jSONObject);
    }
}
