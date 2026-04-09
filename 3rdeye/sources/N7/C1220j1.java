package N7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionHideTooltipJsonParser.kt */
/* renamed from: N7.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1220j1 implements D7.h, D7.b {
    public static C1206i1 d(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        return new C1206i1(l7.b.a(context, data, FacebookMediationAdapter.KEY_ID, l7.k.f43898c, l7.e.f43878b, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, C1206i1 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f8385a);
        k8.F.y(context, jSONObject, "type", "hide_tooltip");
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1206i1) obj);
    }
}
