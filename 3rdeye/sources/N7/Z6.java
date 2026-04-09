package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivNeighbourPageSizeJsonParser.kt */
/* loaded from: classes.dex */
public final class Z6 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7858a;

    public Z6(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7858a = component;
    }

    @Override // D7.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Y6 a(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        return new Y6((W4) k8.F.l(context, data, "neighbour_page_width", this.f7858a.f6897t3));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Y6 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.z(context, jSONObject, "neighbour_page_width", value.f7771a, this.f7858a.f6897t3);
        k8.F.y(context, jSONObject, "type", "fixed");
        return jSONObject;
    }
}
