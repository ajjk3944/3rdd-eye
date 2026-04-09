package N7;

import N7.U3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivDataJsonParser.kt */
/* loaded from: classes.dex */
public final class W3 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7610a;

    public W3(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7610a = component;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        return new U3.a((Z) k8.F.l(context, data, "div", this.f7610a.f6935w9), ((Number) k8.F.m(data, "state_id", l7.h.f43886g)).longValue());
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, U3.a value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.z(context, jSONObject, "div", value.f6382a, this.f7610a.f6935w9);
        k8.F.y(context, jSONObject, "state_id", Long.valueOf(value.f6383b));
        return jSONObject;
    }
}
