package N7;

import N7.C1364t6;
import org.json.JSONObject;

/* compiled from: DivInputJsonParser.kt */
/* renamed from: N7.r6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1336r6 implements D7.h, D7.i {
    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.h
    public final JSONObject b(D7.f context, Object obj) {
        C1364t6.a value = (C1364t6.a) obj;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.p(context, "color", value.f9333a, jSONObject, l7.h.f43880a);
        return jSONObject;
    }

    @Override // D7.i
    public final Z6.b c(D7.f fVar, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        return new C1364t6.a(l7.c.e(T1.B.w(fVar), jSONObject, "color", l7.k.f43901f, B4.g.p(fVar, "context", jSONObject, "data"), null, l7.h.f43881b, l7.e.f43877a));
    }
}
