package N7;

import N7.Ka;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes.dex */
public final class Ma implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5882a;

    public Ma(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5882a = component;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f5882a;
        return new Ka.a(l7.b.a(context, data, "text", l7.k.f43898c, l7.e.f43878b, l7.e.f43877a), k8.F.s(context, data, "actions", uc.f6766h1), k8.F.s(context, data, "images", uc.u8), k8.F.s(context, data, "ranges", uc.f6881r8));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Ka.a value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f5882a;
        k8.F.B(context, jSONObject, "actions", value.f5696a, uc.f6766h1);
        k8.F.B(context, jSONObject, "images", value.f5697b, uc.u8);
        k8.F.B(context, jSONObject, "ranges", value.f5698c, uc.f6881r8);
        l7.b.d(context, jSONObject, "text", value.f5699d);
        return jSONObject;
    }
}
