package N7;

import N7.H3;
import N7.Q4;
import org.json.JSONObject;

/* compiled from: DivCountJsonParser.kt */
/* loaded from: classes.dex */
public final class I3 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5441a;

    public I3(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5441a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("infinity");
        Uc uc = this.f5441a;
        if (zEquals) {
            ((P5) uc.f6722d4.getValue()).getClass();
            return new H3.b(new O5());
        }
        if (strI.equals("fixed")) {
            ((Q4.a) uc.f6801k3.getValue()).getClass();
            return new H3.a(Q4.a.d(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        L3 l32 = bVarF instanceof L3 ? (L3) bVarF : null;
        if (l32 != null) {
            return ((K3) uc.f6907u2.getValue()).a(fVar, l32, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, H3 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof H3.b;
        Uc uc = this.f5441a;
        if (z10) {
            ((P5) uc.f6722d4.getValue()).getClass();
            return P5.d(context, ((H3.b) value).f5388b);
        }
        if (!(value instanceof H3.a)) {
            throw new b9.j();
        }
        ((Q4.a) uc.f6801k3.getValue()).getClass();
        return Q4.a.e(context, ((H3.a) value).f5387b);
    }
}
