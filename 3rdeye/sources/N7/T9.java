package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivSolidBackgroundJsonParser.kt */
/* loaded from: classes.dex */
public final class T9 implements D7.h, D7.b {
    public static S9 d(D7.f context, JSONObject data) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(data, "data");
        return new S9(l7.b.a(context, data, "color", l7.k.f43901f, l7.h.f43881b, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, S9 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.e(context, jSONObject, "color", value.f6211a, l7.h.f43880a);
        k8.F.y(context, jSONObject, "type", "solid");
        return jSONObject;
    }

    @Override // D7.b
    public final /* bridge */ /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return d(fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (S9) obj);
    }
}
