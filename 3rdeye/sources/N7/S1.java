package N7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONObject;

/* compiled from: DivActionShowTooltipJsonParser.kt */
/* loaded from: classes.dex */
public final class S1 implements D7.j<JSONObject, T1, P1> {
    public static P1 b(D7.f context, T1 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarC = l7.d.c(context, template.f6222a, data, FacebookMediationAdapter.KEY_ID, l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…\"id\", TYPE_HELPER_STRING)");
        return new P1(bVarC, l7.d.k(context, template.f6223b, data, "multiple", l7.k.f43896a, l7.h.f43884e));
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (T1) bVar, jSONObject);
    }
}
