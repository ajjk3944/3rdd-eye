package N7;

import N7.Z3;
import org.json.JSONObject;

/* compiled from: DivDataJsonParser.kt */
/* loaded from: classes.dex */
public final class X3 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7693a;

    public X3(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7693a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final Z6.b c(D7.f fVar, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        return new Z3.a(l7.c.b(fVarW, jSONObject, "div", zP, null, this.f7693a.f6946x9), l7.c.c(fVarW, jSONObject, "state_id", zP, null, l7.h.f43886g, l7.e.f43877a));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Z3.a value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.u(context, jSONObject, "div", value.f7843a, this.f7693a.f6946x9);
        l7.c.t(context, jSONObject, "state_id", value.f7844b);
        return jSONObject;
    }
}
