package N7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivExtensionJsonParser.kt */
/* renamed from: N7.y4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1432y4 implements D7.h, D7.b {
    public static JSONObject d(D7.f context, C1418x4 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f9755a);
        k8.F.y(context, jSONObject, "params", value.f9756b);
        return jSONObject;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        Object objOpt = data.opt(FacebookMediationAdapter.KEY_ID);
        if (objOpt == JSONObject.NULL) {
            objOpt = null;
        }
        if (objOpt != null) {
            return new C1418x4((String) objOpt, (JSONObject) k8.F.r(context, data, "params", l7.e.f43878b, l7.e.f43877a));
        }
        throw z7.e.g(FacebookMediationAdapter.KEY_ID, data);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return d(fVar, (C1418x4) obj);
    }
}
