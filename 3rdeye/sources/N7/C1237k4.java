package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivDownloadCallbacksJsonParser.kt */
/* renamed from: N7.k4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1237k4 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8630a;

    public C1237k4(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8630a = component;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f8630a;
        return new C1223j4(k8.F.s(context, data, "on_fail_actions", uc.f6766h1), k8.F.s(context, data, "on_success_actions", uc.f6766h1));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1223j4 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f8630a;
        k8.F.B(context, jSONObject, "on_fail_actions", value.f8482a, uc.f6766h1);
        k8.F.B(context, jSONObject, "on_success_actions", value.f8483b, uc.f6766h1);
        return jSONObject;
    }
}
