package N7;

import N7.P7;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivPatchJsonParser.kt */
/* loaded from: classes.dex */
public final class Q7 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f6040a;

    public Q7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f6040a = component;
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
            return new P7.a((String) objOpt, k8.F.s(context, data, "items", this.f6040a.f6935w9));
        }
        throw z7.e.g(FacebookMediationAdapter.KEY_ID, data);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, P7.a value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, FacebookMediationAdapter.KEY_ID, value.f6012a);
        k8.F.B(context, jSONObject, "items", value.f6013b, this.f6040a.f6935w9);
        return jSONObject;
    }
}
