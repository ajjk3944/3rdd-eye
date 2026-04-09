package N7;

import org.json.JSONObject;

/* compiled from: DivDownloadCallbacksJsonParser.kt */
/* renamed from: N7.l4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1251l4 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8731a;

    public C1251l4(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8731a = component;
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
        Uc uc = this.f8731a;
        return new C1279n4(l7.c.k(fVarW, jSONObject, "on_fail_actions", zP, null, uc.f6777i1), l7.c.k(fVarW, jSONObject, "on_success_actions", zP, null, uc.f6777i1));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1279n4 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f8731a;
        l7.c.v(context, jSONObject, "on_fail_actions", value.f8789a, uc.f6777i1);
        l7.c.v(context, jSONObject, "on_success_actions", value.f8790b, uc.f6777i1);
        return jSONObject;
    }
}
