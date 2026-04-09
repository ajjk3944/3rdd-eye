package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivPhoneInputMaskJsonParser.kt */
/* renamed from: N7.a8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1093a8 implements D7.h, D7.i {
    public static C1123c8 d(D7.f fVar, C1123c8 c1123c8, JSONObject jSONObject) throws z7.d {
        return new C1123c8(l7.c.a(T1.B.w(fVar), jSONObject, "raw_text_variable", B4.g.p(fVar, "context", jSONObject, "data"), c1123c8 != null ? c1123c8.f7974a : null));
    }

    public static JSONObject e(D7.f context, C1123c8 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.t(context, jSONObject, "raw_text_variable", value.f7974a);
        k8.F.y(context, jSONObject, "type", "phone");
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1123c8) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
