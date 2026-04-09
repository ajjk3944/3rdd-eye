package N7;

import N7.T5;
import org.json.JSONObject;

/* compiled from: DivInputJsonParser.kt */
/* renamed from: N7.q6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1323q6 implements D7.h, D7.b {
    @Override // D7.b
    public final Object a(D7.f context, JSONObject jSONObject) {
        kotlin.jvm.internal.l.f(context, "context");
        return new T5.d(l7.b.a(context, jSONObject, "color", l7.k.f43901f, l7.h.f43881b, l7.e.f43877a));
    }

    @Override // D7.h
    public final JSONObject b(D7.f context, Object obj) {
        T5.d value = (T5.d) obj;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.b.e(context, jSONObject, "color", value.f6330a, l7.h.f43880a);
        return jSONObject;
    }
}
