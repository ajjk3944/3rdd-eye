package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: DictValueJsonParser.kt */
/* loaded from: classes.dex */
public final class S implements D7.j<JSONObject, T, O> {
    public static O b(D7.f context, T template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarC = l7.d.c(context, template.f6217a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43903h);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…value\", TYPE_HELPER_DICT)");
        return new O(bVarC);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (T) bVar, jSONObject);
    }
}
