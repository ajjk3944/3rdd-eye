package N7;

import com.applovin.sdk.AppLovinEventParameters;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivCurrencyInputMaskJsonParser.kt */
/* loaded from: classes.dex */
public final class O3 implements D7.h, D7.i {
    public static Q3 d(D7.f fVar, Q3 q32, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new Q3(l7.c.j(fVarW, jSONObject, CommonUrlParts.LOCALE, l7.k.f43898c, zP, q32 != null ? q32.f6035a : null, l7.e.f43878b, l7.e.f43877a), l7.c.a(fVarW, jSONObject, "raw_text_variable", zP, q32 != null ? q32.f6036b : null));
    }

    public static JSONObject e(D7.f context, Q3 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, CommonUrlParts.LOCALE, value.f6035a);
        l7.c.t(context, jSONObject, "raw_text_variable", value.f6036b);
        k8.F.y(context, jSONObject, "type", AppLovinEventParameters.REVENUE_CURRENCY);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (Q3) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
