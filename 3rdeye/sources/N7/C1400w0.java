package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionArrayRemoveValueJsonParser.kt */
/* renamed from: N7.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1400w0 implements D7.h, D7.i {
    public static C1428y0 d(D7.f fVar, C1428y0 c1428y0, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new C1428y0(l7.c.e(fVarW, jSONObject, "index", l7.k.f43897b, zP, c1428y0 != null ? c1428y0.f9806a : null, l7.h.f43886g, l7.e.f43877a), l7.c.d(fVarW, jSONObject, "variable_name", l7.k.f43898c, zP, c1428y0 != null ? c1428y0.f9807b : null));
    }

    public static JSONObject e(D7.f context, C1428y0 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "index", value.f9806a);
        k8.F.y(context, jSONObject, "type", "array_remove_value");
        l7.c.q(context, jSONObject, "variable_name", value.f9807b);
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1428y0) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
