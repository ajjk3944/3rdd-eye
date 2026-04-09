package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionAnimatorStopJsonParser.kt */
/* renamed from: N7.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1261m0 implements D7.h, D7.i {
    public static C1289o0 d(D7.f fVar, C1289o0 c1289o0, JSONObject jSONObject) throws z7.d {
        return new C1289o0(l7.c.a(T1.B.w(fVar), jSONObject, "animator_id", B4.g.p(fVar, "context", jSONObject, "data"), c1289o0 != null ? c1289o0.f8846a : null));
    }

    public static JSONObject e(D7.f context, C1289o0 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.t(context, jSONObject, "animator_id", value.f8846a);
        k8.F.y(context, jSONObject, "type", "animator_stop");
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1289o0) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
