package N7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionShowTooltipJsonParser.kt */
/* loaded from: classes.dex */
public final class Q1 implements D7.h, D7.b {
    public static P1 d(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        k.g gVar = l7.k.f43898c;
        A8.d dVar = l7.e.f43878b;
        j6.l lVar = l7.e.f43877a;
        return new P1(l7.b.a(context, data, FacebookMediationAdapter.KEY_ID, gVar, dVar, lVar), l7.b.b(context, data, "multiple", l7.k.f43896a, l7.h.f43884e, lVar, null));
    }

    public static JSONObject e(D7.f context, P1 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f6000a);
        l7.b.d(context, jSONObject, "multiple", value.f6001b);
        k8.F.y(context, jSONObject, "type", "show_tooltip");
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (P1) obj);
    }
}
