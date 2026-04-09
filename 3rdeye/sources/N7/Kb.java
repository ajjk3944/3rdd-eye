package N7;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivTooltipModeNonModalJsonParser.kt */
/* loaded from: classes.dex */
public final class Kb implements D7.h, D7.b {
    public static JSONObject d(D7.f context, Jb value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        k8.F.y(context, jSONObject, "type", "non_modal");
        return jSONObject;
    }

    @Override // D7.b
    public final Object a(D7.f context, JSONObject jSONObject) {
        kotlin.jvm.internal.l.f(context, "context");
        return new Jb();
    }

    @Override // D7.h
    public final /* bridge */ /* synthetic */ JSONObject b(D7.f fVar, Object obj) {
        return d(fVar, (Jb) obj);
    }
}
