package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: ContentTextJsonParser.kt */
/* loaded from: classes.dex */
public final class H implements D7.j<JSONObject, I, E> {
    public static E b(D7.f context, I template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarC = l7.d.c(context, template.f5438a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…lue\", TYPE_HELPER_STRING)");
        return new E(bVarC);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (I) bVar, jSONObject);
    }
}
