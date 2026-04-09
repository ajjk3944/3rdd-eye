package N7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionHideTooltipJsonParser.kt */
/* renamed from: N7.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1234k1 implements D7.h, D7.i {
    public static C1262m1 d(D7.f fVar, C1262m1 c1262m1, JSONObject jSONObject) throws z7.d {
        return new C1262m1(l7.c.d(T1.B.w(fVar), jSONObject, FacebookMediationAdapter.KEY_ID, l7.k.f43898c, B4.g.p(fVar, "context", jSONObject, "data"), c1262m1 != null ? c1262m1.f8746a : null));
    }

    public static JSONObject e(D7.f context, C1262m1 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f8746a);
        k8.F.y(context, jSONObject, "type", "hide_tooltip");
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1262m1) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
