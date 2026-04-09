package N7;

import org.json.JSONObject;

/* compiled from: DivActionAnimatorStopJsonParser.kt */
/* renamed from: N7.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1275n0 implements D7.j<JSONObject, C1289o0, C1233k0> {
    public static C1233k0 b(D7.f context, C1289o0 template, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(template, "template");
        kotlin.jvm.internal.l.f(data, "data");
        Object objB = l7.d.b(template.f8846a, data, "animator_id", l7.e.f43878b, l7.e.f43877a);
        kotlin.jvm.internal.l.e(objB, "resolve(context, templat…rId, data, \"animator_id\")");
        return new C1233k0((String) objB);
    }

    @Override // D7.j
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, Z6.b bVar, JSONObject jSONObject) {
        return b(fVar, (C1289o0) bVar, jSONObject);
    }
}
