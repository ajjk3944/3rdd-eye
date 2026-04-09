package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivNinePatchBackgroundJsonParser.kt */
/* renamed from: N7.e7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1152e7 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8161a;

    public C1152e7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8161a = component;
    }

    @Override // D7.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C1137d7 a(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        return new C1137d7(l7.b.a(context, data, "image_url", l7.k.f43900e, l7.h.f43883d, l7.e.f43877a), (C1085a0) k8.F.l(context, data, "insets", this.f8161a.f6449E));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1137d7 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.e(context, jSONObject, "image_url", value.f8071a, l7.h.f43882c);
        k8.F.z(context, jSONObject, "insets", value.f8072b, this.f8161a.f6449E);
        k8.F.y(context, jSONObject, "type", "nine_patch_image");
        return jSONObject;
    }
}
