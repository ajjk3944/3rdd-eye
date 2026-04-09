package N7;

import N7.U1;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionSubmitJsonParser.kt */
/* loaded from: classes.dex */
public final class V1 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7555a;

    public V1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7555a = component;
    }

    @Override // D7.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final U1 a(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarA = l7.b.a(context, data, "container_id", l7.k.f43898c, l7.e.f43878b, l7.e.f43877a);
        Uc uc = this.f7555a;
        return new U1(bVarA, k8.F.s(context, data, "on_fail_actions", uc.f6766h1), k8.F.s(context, data, "on_success_actions", uc.f6766h1), (U1.a) k8.F.l(context, data, com.vungle.ads.internal.ui.a.REQUEST_KEY_EXTRA, uc.f6596S0));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, U1 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, "container_id", value.f6358a);
        Uc uc = this.f7555a;
        k8.F.B(context, jSONObject, "on_fail_actions", value.f6359b, uc.f6766h1);
        k8.F.B(context, jSONObject, "on_success_actions", value.f6360c, uc.f6766h1);
        k8.F.z(context, jSONObject, com.vungle.ads.internal.ui.a.REQUEST_KEY_EXTRA, value.f6361d, uc.f6596S0);
        k8.F.y(context, jSONObject, "type", "submit");
        return jSONObject;
    }
}
