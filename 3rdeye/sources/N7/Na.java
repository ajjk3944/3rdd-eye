package N7;

import N7.C1383ub;
import org.json.JSONObject;

/* compiled from: DivTextJsonParser.kt */
/* loaded from: classes.dex */
public final class Na implements D7.h, D7.i {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5941a;

    public Na(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5941a = component;
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
        Uc uc = this.f5941a;
        return new C1383ub.a(l7.c.k(fVarW, jSONObject, "actions", zP, null, uc.f6777i1), l7.c.k(fVarW, jSONObject, "images", zP, null, uc.f6923v8), l7.c.k(fVarW, jSONObject, "ranges", zP, null, uc.f6891s8), l7.c.d(fVarW, jSONObject, "text", l7.k.f43898c, zP, null));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C1383ub.a value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        JSONObject jSONObject = new JSONObject();
        Uc uc = this.f5941a;
        l7.c.v(context, jSONObject, "actions", value.f9498a, uc.f6777i1);
        l7.c.v(context, jSONObject, "images", value.f9499b, uc.f6923v8);
        l7.c.v(context, jSONObject, "ranges", value.f9500c, uc.f6891s8);
        l7.c.q(context, jSONObject, "text", value.f9501d);
        return jSONObject;
    }
}
