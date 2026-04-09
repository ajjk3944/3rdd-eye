package N7;

import n7.AbstractC5371a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DivShapeDrawableJsonParser.kt */
/* renamed from: N7.u9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381u9 implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9429a;

    public C1381u9(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9429a = component;
    }

    @Override // D7.b
    public final /* synthetic */ Object a(D7.f fVar, JSONObject jSONObject) {
        return B4.h.c(this, fVar, jSONObject);
    }

    @Override // D7.i
    public final /* bridge */ /* synthetic */ Z6.b c(D7.f fVar, Object obj) {
        return d(fVar, null, (JSONObject) obj);
    }

    public final C1409w9 d(D7.f fVar, C1409w9 c1409w9, JSONObject jSONObject) throws z7.d {
        boolean zP = B4.g.p(fVar, "context", jSONObject, "data");
        D7.f fVarW = T1.B.w(fVar);
        AbstractC5371a abstractC5371aE = l7.c.e(fVarW, jSONObject, "color", l7.k.f43901f, zP, c1409w9 != null ? c1409w9.f9726a : null, l7.h.f43881b, l7.e.f43877a);
        AbstractC5371a<A9> abstractC5371a = c1409w9 != null ? c1409w9.f9727b : null;
        Uc uc = this.f9429a;
        return new C1409w9(abstractC5371aE, l7.c.b(fVarW, jSONObject, "shape", zP, abstractC5371a, uc.f6580Q6), l7.c.h(fVarW, jSONObject, "stroke", zP, c1409w9 != null ? c1409w9.f9728c : null, uc.f6446D7));
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1409w9 value) throws JSONException, z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        l7.c.p(context, "color", value.f9726a, jSONObject, l7.h.f43880a);
        Uc uc = this.f9429a;
        l7.c.u(context, jSONObject, "shape", value.f9727b, uc.f6580Q6);
        l7.c.u(context, jSONObject, "stroke", value.f9728c, uc.f6446D7);
        k8.F.y(context, jSONObject, "type", "shape_drawable");
        return jSONObject;
    }
}
