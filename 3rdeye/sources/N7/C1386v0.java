package N7;

import l7.h;
import l7.k;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivActionArrayRemoveValueJsonParser.kt */
/* renamed from: N7.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1386v0 implements D7.h, D7.b {
    public static C1372u0 d(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        k.e eVar = l7.k.f43897b;
        h.e eVar2 = l7.h.f43886g;
        j6.l lVar = l7.e.f43877a;
        return new C1372u0(l7.b.a(context, data, "index", eVar, eVar2, lVar), l7.b.a(context, data, "variable_name", l7.k.f43898c, l7.e.f43878b, lVar));
    }

    public static JSONObject e(D7.f context, C1372u0 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, "index", value.f9355a);
        k8.F.y(context, jSONObject, "type", "array_remove_value");
        l7.b.d(context, jSONObject, "variable_name", value.f9356b);
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (C1372u0) obj);
    }
}
