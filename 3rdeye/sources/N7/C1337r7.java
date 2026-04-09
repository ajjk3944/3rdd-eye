package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivPageSizeJsonParser.kt */
/* renamed from: N7.r7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1337r7 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9076a;

    public C1337r7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9076a = component;
    }

    @Override // D7.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C1324q7 a(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        return new C1324q7((V7) k8.F.l(context, data, "page_width", this.f9076a.f6455E5));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1324q7 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.z(context, jSONObject, "page_width", value.f8990a, this.f9076a.f6455E5);
        k8.F.y(context, jSONObject, "type", "percentage");
        return jSONObject;
    }
}
