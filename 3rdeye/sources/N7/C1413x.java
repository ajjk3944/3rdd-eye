package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: ColorValueJsonParser.kt */
/* renamed from: N7.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1413x implements D7.j<JSONObject, C1427y, C1371u> {
    public static C1371u b(D7.f context, C1427y template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarD = l7.d.d(context, template.f9805a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43901f, l7.h.f43881b);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…LOR, STRING_TO_COLOR_INT)");
        return new C1371u(bVarD);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (C1427y) bVar, jSONObject);
    }
}
