package N7;

import N7.C1139d9;
import N7.C1228j9;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivSelectJsonParser.kt */
/* renamed from: N7.i9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1214i9 implements D7.j<JSONObject, C1228j9.a, C1139d9.a> {
    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        C1228j9.a template = (C1228j9.a) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        k.g gVar = l7.k.f43898c;
        A7.b bVarJ = l7.d.j(context, template.f8594a, data, "text", gVar);
        A7.b bVarC = l7.d.c(context, template.f8595b, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, gVar);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…lue\", TYPE_HELPER_STRING)");
        return new C1139d9.a(bVarJ, bVarC);
    }
}
