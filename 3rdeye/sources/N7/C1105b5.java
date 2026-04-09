package N7;

import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONObject;

/* compiled from: DivFocusJsonParser.kt */
/* renamed from: N7.b5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1105b5 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7932a;

    public C1105b5(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7932a = component;
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
        Uc uc = this.f7932a;
        AbstractC5371a abstractC5371aK = l7.c.k(fVarW, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, zP, null, uc.f6440D1);
        AbstractC5371a abstractC5371aH = l7.c.h(fVarW, jSONObject, "border", zP, null, uc.f6503J1);
        AbstractC5371a abstractC5371aH2 = l7.c.h(fVarW, jSONObject, "next_focus_ids", zP, null, uc.f6409A3);
        b9.p pVar = uc.f6777i1;
        return new C1180g5(abstractC5371aK, abstractC5371aH, abstractC5371aH2, l7.c.k(fVarW, jSONObject, "on_blur", zP, null, pVar), l7.c.k(fVarW, jSONObject, "on_focus", zP, null, pVar));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1180g5 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f7932a;
        l7.c.v(context, jSONObject, io.appmetrica.analytics.impl.L2.f39740g, value.f8286a, uc.f6440D1);
        l7.c.u(context, jSONObject, "border", value.f8287b, uc.f6503J1);
        l7.c.u(context, jSONObject, "next_focus_ids", value.f8288c, uc.f6409A3);
        AbstractC5371a<List<C1132d2>> abstractC5371a = value.f8289d;
        b9.p pVar = uc.f6777i1;
        l7.c.v(context, jSONObject, "on_blur", abstractC5371a, pVar);
        l7.c.v(context, jSONObject, "on_focus", value.f8290e, pVar);
        return jSONObject;
    }
}
