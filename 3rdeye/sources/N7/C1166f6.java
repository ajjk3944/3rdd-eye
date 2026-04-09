package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivInputFilterRegexJsonParser.kt */
/* renamed from: N7.f6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1166f6 implements D7.h, D7.i {
    public static C1196h6 d(D7.f fVar, C1196h6 c1196h6, JSONObject jSONObject) throws z7.d {
        return new C1196h6(l7.c.d(T1.B.w(fVar), jSONObject, "pattern", l7.k.f43898c, B4.g.p(fVar, "context", jSONObject, "data"), c1196h6 != null ? c1196h6.f8352a : null));
    }

    public static JSONObject e(D7.f context, C1196h6 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "pattern", value.f8352a);
        k8.F.y(context, jSONObject, "type", "regex");
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1196h6) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
