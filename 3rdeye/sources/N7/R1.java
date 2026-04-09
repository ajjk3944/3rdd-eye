package N7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionShowTooltipJsonParser.kt */
/* loaded from: classes.dex */
public final class R1 implements D7.h, D7.i {
    public static T1 d(D7.f fVar, T1 t12, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new T1(l7.c.d(fVarW, jSONObject, FacebookMediationAdapter.KEY_ID, l7.k.f43898c, zP, t12 != null ? t12.f6222a : null), l7.c.j(fVarW, jSONObject, "multiple", l7.k.f43896a, zP, t12 != null ? t12.f6223b : null, l7.h.f43884e, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, T1 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f6222a);
        l7.c.q(context, jSONObject, "multiple", value.f6223b);
        k8.F.y(context, jSONObject, "type", "show_tooltip");
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (T1) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
