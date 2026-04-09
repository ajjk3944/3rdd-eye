package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivInputFilterExpressionJsonParser.kt */
/* loaded from: classes.dex */
public final class X5 implements D7.h, D7.i {
    public static Z5 d(D7.f fVar, Z5 z52, JSONObject jSONObject) throws z7.d {
        return new Z5(l7.c.e(T1.B.w(fVar), jSONObject, "condition", l7.k.f43896a, B4.g.p(fVar, "context", jSONObject, "data"), z52 != null ? z52.f7857a : null, l7.h.f43884e, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, Z5 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "condition", value.f7857a);
        k8.F.y(context, jSONObject, "type", "expression");
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (Z5) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
