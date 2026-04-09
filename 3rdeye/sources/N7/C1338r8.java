package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivPointJsonParser.kt */
/* renamed from: N7.r8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1338r8 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9077a;

    public C1338r8(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9077a = component;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f9077a;
        return new C1325q8((C1134d4) k8.F.l(context, data, "x", uc.f6504J2), (C1134d4) k8.F.l(context, data, "y", uc.f6504J2));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1325q8 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f9077a;
        k8.F.z(context, jSONObject, "x", value.f8992a, uc.f6504J2);
        k8.F.z(context, jSONObject, "y", value.f8993b, uc.f6504J2);
        return jSONObject;
    }
}
