package N7;

import N7.X9;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivStateJsonParser.kt */
/* loaded from: classes.dex */
public final class Z9 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7871a;

    public Z9(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7871a = component;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f7871a;
        C1332r2 c1332r2 = (C1332r2) k8.F.q(context, data, "animation_in", uc.f6831n1);
        C1332r2 c1332r22 = (C1332r2) k8.F.q(context, data, "animation_out", uc.f6831n1);
        Z z10 = (Z) k8.F.q(context, data, "div", uc.f6935w9);
        Object objOpt = data.opt("state_id");
        if (objOpt == JSONObject.NULL) {
            objOpt = null;
        }
        if (objOpt != null) {
            return new X9.a(c1332r2, c1332r22, z10, (String) objOpt, k8.F.s(context, data, "swipe_out_actions", uc.f6766h1));
        }
        throw z7.e.g("state_id", data);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, X9.a value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f7871a;
        k8.F.z(context, jSONObject, "animation_in", value.f7745a, uc.f6831n1);
        k8.F.z(context, jSONObject, "animation_out", value.f7746b, uc.f6831n1);
        k8.F.z(context, jSONObject, "div", value.f7747c, uc.f6935w9);
        k8.F.y(context, jSONObject, "state_id", value.f7748d);
        k8.F.B(context, jSONObject, "swipe_out_actions", value.f7749e, uc.f6766h1);
        return jSONObject;
    }
}
