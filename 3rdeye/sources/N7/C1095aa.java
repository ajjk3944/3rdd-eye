package N7;

import N7.C1125ca;
import org.json.JSONObject;

/* compiled from: DivStateJsonParser.kt */
/* renamed from: N7.aa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1095aa implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7900a;

    public C1095aa(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7900a = component;
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
        Uc uc = this.f7900a;
        return new C1125ca.a(l7.c.h(fVarW, jSONObject, "animation_in", zP, null, uc.f6841o1), l7.c.h(fVarW, jSONObject, "animation_out", zP, null, uc.f6841o1), l7.c.h(fVarW, jSONObject, "div", zP, null, uc.f6946x9), l7.c.a(fVarW, jSONObject, "state_id", zP, null), l7.c.k(fVarW, jSONObject, "swipe_out_actions", zP, null, uc.f6777i1));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1125ca.a value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f7900a;
        l7.c.u(context, jSONObject, "animation_in", value.f8018a, uc.f6841o1);
        l7.c.u(context, jSONObject, "animation_out", value.f8019b, uc.f6841o1);
        l7.c.u(context, jSONObject, "div", value.f8020c, uc.f6946x9);
        l7.c.t(context, jSONObject, "state_id", value.f8021d);
        l7.c.v(context, jSONObject, "swipe_out_actions", value.f8022e, uc.f6777i1);
        return jSONObject;
    }
}
