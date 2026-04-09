package N7;

import N7.C1412wc;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivWrapContentSizeJsonParser.kt */
/* renamed from: N7.yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1440yc implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9988a;

    public C1440yc(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9988a = component;
    }

    @Override // D7.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C1412wc a(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        A7.b bVarB = l7.b.b(context, data, "constrained", l7.k.f43896a, l7.h.f43884e, l7.e.f43877a, null);
        Uc uc = this.f9988a;
        return new C1412wc(bVarB, (C1412wc.a) k8.F.q(context, data, "max_size", uc.f6903t9), (C1412wc.a) k8.F.q(context, data, "min_size", uc.f6903t9));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1412wc value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, "constrained", value.f9737a);
        Uc uc = this.f9988a;
        k8.F.z(context, jSONObject, "max_size", value.f9738b, uc.f6903t9);
        k8.F.z(context, jSONObject, "min_size", value.f9739c, uc.f6903t9);
        k8.F.y(context, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
