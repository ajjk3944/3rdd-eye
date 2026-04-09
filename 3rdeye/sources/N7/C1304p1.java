package N7;

import N7.C1132d2;
import org.json.JSONObject;

/* compiled from: DivActionJsonParser.kt */
/* renamed from: N7.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1304p1 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8886a;

    public C1304p1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8886a = component;
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
        Uc uc = this.f8886a;
        return new C1132d2.a(l7.c.h(fVarW, jSONObject, "action", zP, null, uc.f6777i1), l7.c.k(fVarW, jSONObject, "actions", zP, null, uc.f6777i1), l7.c.d(fVarW, jSONObject, "text", l7.k.f43898c, zP, null));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1132d2.a value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f8886a;
        l7.c.u(context, jSONObject, "action", value.f8060a, uc.f6777i1);
        l7.c.v(context, jSONObject, "actions", value.f8061b, uc.f6777i1);
        l7.c.q(context, jSONObject, "text", value.f8062c);
        return jSONObject;
    }
}
