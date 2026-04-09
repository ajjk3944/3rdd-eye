package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivSolidBackgroundJsonParser.kt */
/* loaded from: classes.dex */
public final class U9 implements D7.h, D7.i {
    public static W9 d(D7.f fVar, W9 w92, JSONObject jSONObject) throws z7.d {
        return new W9(l7.c.e(T1.B.w(fVar), jSONObject, "color", l7.k.f43901f, B4.g.p(fVar, "context", jSONObject, "data"), w92 != null ? w92.f7625a : null, l7.h.f43881b, l7.e.f43877a));
    }

    public static JSONObject e(D7.f context, W9 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.p(context, "color", value.f7625a, jSONObject, l7.h.f43880a);
        k8.F.y(context, jSONObject, "type", "solid");
        return jSONObject;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return e(fVar, (W9) obj);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }
}
