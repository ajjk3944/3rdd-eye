package N7;

import N7.C1117c2;
import N7.U1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import l7.k;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* renamed from: N7.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1087a2 implements D7.j<JSONObject, C1117c2.a.C0100a, U1.a.C0096a> {
    @Override // D7.j
    public final Object a(D7.f context, Z6.b bVar, JSONObject data) {
        C1117c2.a.C0100a template = (C1117c2.a.C0100a) bVar;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        k.g gVar = l7.k.f43898c;
        A7.b bVarC = l7.d.c(context, template.f7965a, data, AppMeasurementSdk.ConditionalUserProperty.NAME, gVar);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…ame\", TYPE_HELPER_STRING)");
        A7.b bVarC2 = l7.d.c(context, template.f7966b, data, AppMeasurementSdk.ConditionalUserProperty.VALUE, gVar);
        kotlin.jvm.internal.l.e(bVarC2, "resolveExpression(contex…lue\", TYPE_HELPER_STRING)");
        return new U1.a.C0096a(bVarC, bVarC2);
    }
}
