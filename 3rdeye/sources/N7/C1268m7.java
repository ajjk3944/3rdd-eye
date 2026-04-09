package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivPageContentSizeJsonParser.kt */
/* renamed from: N7.m7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1268m7 implements D7.h, D7.b {
    public static JSONObject d(D7.f context, C1254l7 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", "wrap_content");
        return jSONObject;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject jSONObject) {
        kotlin.jvm.internal.l.f(context, "context");
        return new C1254l7();
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return d(fVar, (C1254l7) obj);
    }
}
