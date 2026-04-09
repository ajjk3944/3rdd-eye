package N7;

import org.json.JSONObject;

/* compiled from: DivLayoutProviderJsonParser.kt */
/* loaded from: classes.dex */
public final class N6 implements D7.h, D7.i {
    public static JSONObject d(D7.f context, P6 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.t(context, jSONObject, "height_variable_name", value.f6006a);
        l7.c.t(context, jSONObject, "width_variable_name", value.f6007b);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return d(fVar, (P6) obj);
    }

    @Override // D7.i
    public final Z6.b c(D7.f fVar, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        A8.d dVar = l7.e.f43878b;
        return new P6(l7.c.i(fVarW, jSONObject, "height_variable_name", zP, null, dVar), l7.c.i(fVarW, jSONObject, "width_variable_name", zP, null, dVar));
    }
}
