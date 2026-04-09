package N7;

import com.applovin.sdk.AppLovinEventParameters;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivCurrencyInputMaskJsonParser.kt */
/* loaded from: classes.dex */
public final class N3 implements D7.h, D7.b {
    public static M3 d(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarB = l7.b.b(context, data, CommonUrlParts.LOCALE, l7.k.f43898c, l7.e.f43878b, l7.e.f43877a, null);
        Object objOpt = data.opt("raw_text_variable");
        if (objOpt == JSONObject.NULL) {
            objOpt = null;
        }
        if (objOpt != null) {
            return new M3(bVarB, (String) objOpt);
        }
        throw z7.e.g("raw_text_variable", data);
    }

    public static JSONObject e(D7.f context, M3 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, CommonUrlParts.LOCALE, value.f5830a);
        k8.F.y(context, jSONObject, "raw_text_variable", value.f5831b);
        k8.F.y(context, jSONObject, "type", AppLovinEventParameters.REVENUE_CURRENCY);
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (M3) obj);
    }
}
