package N7;

import N7.C1175g0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionJsonParser.kt */
/* renamed from: N7.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1290o1 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8847a;

    public C1290o1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8847a = component;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f8847a;
        return new C1175g0.a((C1175g0) k8.F.q(context, data, "action", uc.f6766h1), k8.F.s(context, data, "actions", uc.f6766h1), l7.b.a(context, data, "text", l7.k.f43898c, l7.e.f43878b, l7.e.f43877a));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1175g0.a value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f8847a;
        k8.F.z(context, jSONObject, "action", value.f8264a, uc.f6766h1);
        k8.F.B(context, jSONObject, "actions", value.f8265b, uc.f6766h1);
        l7.b.d(context, jSONObject, "text", value.f8266c);
        return jSONObject;
    }
}
