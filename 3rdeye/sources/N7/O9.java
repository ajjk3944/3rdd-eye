package N7;

import N7.Q9;
import l7.h;
import l7.k;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: DivSliderJsonParser.kt */
/* loaded from: classes.dex */
public final class O9 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5994a;

    public O9(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5994a = component;
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
        k.e eVar = l7.k.f43897b;
        h.e eVar2 = l7.h.f43886g;
        j6.l lVar = l7.e.f43877a;
        AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "end", eVar, zP, null, eVar2, lVar);
        Uc uc = this.f5994a;
        AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "margins", zP, null, uc.f6641W2);
        AbstractC5371a abstractC5371aJ2 = l7.c.j(fVarW, jSONObject, "start", eVar, zP, null, eVar2, lVar);
        b9.p pVar = uc.f6609T2;
        return new Q9.a(abstractC5371aJ, abstractC5371aH, abstractC5371aJ2, l7.c.h(fVarW, jSONObject, "track_active_style", zP, null, pVar), l7.c.h(fVarW, jSONObject, "track_inactive_style", zP, null, pVar));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Q9.a value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "end", value.f6087a);
        Uc uc = this.f5994a;
        l7.c.u(context, jSONObject, "margins", value.f6088b, uc.f6641W2);
        l7.c.q(context, jSONObject, "start", value.f6089c);
        AbstractC5371a<AbstractC1348s4> abstractC5371a = value.f6090d;
        b9.p pVar = uc.f6609T2;
        l7.c.u(context, jSONObject, "track_active_style", abstractC5371a, pVar);
        l7.c.u(context, jSONObject, "track_inactive_style", value.f6091e, pVar);
        return jSONObject;
    }
}
