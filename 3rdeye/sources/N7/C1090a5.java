package N7;

import N7.Z4;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivFocusJsonParser.kt */
/* renamed from: N7.a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1090a5 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7896a;

    public C1090a5(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7896a = component;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject data) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        Uc uc = this.f7896a;
        List listS = k8.F.s(context, data, io.appmetrica.analytics.impl.L2.f39740g, uc.f6429C1);
        X2 x22 = (X2) k8.F.q(context, data, "border", uc.f6492I1);
        Z4.a aVar = (Z4.a) k8.F.q(context, data, "next_focus_ids", uc.f6962z3);
        b9.p pVar = uc.f6766h1;
        return new Z4(listS, x22, aVar, k8.F.s(context, data, "on_blur", pVar), k8.F.s(context, data, "on_focus", pVar));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Z4 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f7896a;
        k8.F.B(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f7845a, uc.f6429C1);
        k8.F.z(context, jSONObject, "border", value.f7846b, uc.f6492I1);
        k8.F.z(context, jSONObject, "next_focus_ids", value.f7847c, uc.f6962z3);
        List<C1175g0> list = value.f7848d;
        b9.p pVar = uc.f6766h1;
        k8.F.B(context, jSONObject, "on_blur", list, pVar);
        k8.F.B(context, jSONObject, "on_focus", value.f7849e, pVar);
        return jSONObject;
    }
}
