package N7;

import N7.Bc;
import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivWrapContentSizeJsonParser.kt */
/* renamed from: N7.zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1454zc implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f10130a;

    public C1454zc(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f10130a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }

    public final Bc d(D7.f fVar, Bc bc, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        AbstractC5371a abstractC5371aJ = l7.c.j(fVarW, jSONObject, "constrained", l7.k.f43896a, zP, bc != null ? bc.f5001a : null, l7.h.f43884e, l7.e.f43877a);
        AbstractC5371a<Bc.a> abstractC5371a = bc != null ? bc.f5002b : null;
        Uc uc = this.f10130a;
        return new Bc(abstractC5371aJ, l7.c.h(fVarW, jSONObject, "max_size", zP, abstractC5371a, uc.f6913u9), l7.c.h(fVarW, jSONObject, "min_size", zP, bc != null ? bc.f5003c : null, uc.f6913u9));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Bc value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "constrained", value.f5001a);
        Uc uc = this.f10130a;
        l7.c.u(context, jSONObject, "max_size", value.f5002b, uc.f6913u9);
        l7.c.u(context, jSONObject, "min_size", value.f5003c, uc.f6913u9);
        k8.F.y(context, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
