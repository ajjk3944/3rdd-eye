package N7;

import N7.I8;
import N7.T8;
import N7.X4;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRadiusJsonParser.kt */
/* loaded from: classes.dex */
public final class J8 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5576a;

    public J8(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5576a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("fixed");
        Uc uc = this.f5576a;
        if (zEquals) {
            ((X4.b) uc.f6897t3.getValue()).getClass();
            return new I8.a(X4.b.d(fVar, jSONObject));
        }
        if (strI.equals("relative")) {
            ((T8.b) uc.f6782i6.getValue()).getClass();
            return new I8.b(T8.b.d(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        M8 m82 = bVarF instanceof M8 ? (M8) bVarF : null;
        if (m82 != null) {
            return ((L8) uc.f6735e6.getValue()).a(fVar, m82, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, I8 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof I8.a;
        Uc uc = this.f5576a;
        if (z10) {
            ((X4.b) uc.f6897t3.getValue()).getClass();
            return X4.b.e(context, ((I8.a) value).f5476b);
        }
        if (!(value instanceof I8.b)) {
            throw new b9.j();
        }
        ((T8.b) uc.f6782i6.getValue()).getClass();
        return T8.b.e(context, ((I8.b) value).f5477b);
    }
}
