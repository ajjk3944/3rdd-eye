package N7;

import org.json.JSONObject;

/* compiled from: DivPointJsonParser.kt */
/* renamed from: N7.s8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1352s8 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9186a;

    public C1352s8(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9186a = component;
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
        Uc uc = this.f9186a;
        return new C1380u8(l7.c.b(fVarW, jSONObject, "x", zP, null, uc.f6515K2), l7.c.b(fVarW, jSONObject, "y", zP, null, uc.f6515K2));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1380u8 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f9186a;
        l7.c.u(context, jSONObject, "x", value.f9427a, uc.f6515K2);
        l7.c.u(context, jSONObject, "y", value.f9428b, uc.f6515K2);
        return jSONObject;
    }
}
