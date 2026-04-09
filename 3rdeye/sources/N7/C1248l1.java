package N7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONObject;

/* compiled from: DivActionHideTooltipJsonParser.kt */
/* renamed from: N7.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1248l1 implements D7.j<JSONObject, C1262m1, C1206i1> {
    public static C1206i1 b(D7.f context, C1262m1 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarC = l7.d.c(context, template.f8746a, data, FacebookMediationAdapter.KEY_ID, l7.k.f43898c);
        kotlin.jvm.internal.l.e(bVarC, "resolveExpression(contex…\"id\", TYPE_HELPER_STRING)");
        return new C1206i1(bVarC);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (C1262m1) bVar, jSONObject);
    }
}
