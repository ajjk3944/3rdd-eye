package N7;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* compiled from: BoolValueJsonParser.kt */
/* renamed from: N7.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1274n implements D7.j<JSONObject, C1288o, C1232k> {
    public static C1232k b(D7.f context, C1288o template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarD = l7.d.d(context, template.f8845a, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, l7.k.f43896a, l7.h.f43884e);
        kotlin.jvm.internal.l.e(bVarD, "resolveExpression(contex…_BOOLEAN, ANY_TO_BOOLEAN)");
        return new C1232k(bVarD);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (C1288o) bVar, jSONObject);
    }
}
