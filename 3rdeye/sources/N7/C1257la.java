package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleDashedJsonParser.kt */
/* renamed from: N7.la, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257la implements D7.h, D7.i {
    public static JSONObject d(D7.f context, C1285na value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", "dashed");
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return d(fVar, (C1285na) obj);
    }

    @Override // D7.i
    public final Z6.b c(D7.f context, Object obj) {
        JSONObject data = (JSONObject) obj;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        return new C1285na();
    }
}
