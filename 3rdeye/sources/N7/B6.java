package N7;

import N7.AbstractC1378u6;
import N7.C1448z6;
import N7.F6;
import org.json.JSONObject;

/* compiled from: DivInputValidatorJsonParser.kt */
/* loaded from: classes.dex */
public final class B6 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f4907a;

    public B6(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f4907a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("regex");
        Uc uc = this.f4907a;
        if (zEquals) {
            ((F6.a) uc.f6941x4.getValue()).getClass();
            return new AbstractC1378u6.b(F6.a.d(fVar, jSONObject));
        }
        if (strI.equals("expression")) {
            ((C1448z6.a) uc.f6909u4.getValue()).getClass();
            return new AbstractC1378u6.a(C1448z6.a.d(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        H6 h62 = bVarF instanceof H6 ? (H6) bVarF : null;
        if (h62 != null) {
            return ((D6) uc.f6432C4.getValue()).a(fVar, h62, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1378u6 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1378u6.b;
        Uc uc = this.f4907a;
        if (z10) {
            ((F6.a) uc.f6941x4.getValue()).getClass();
            return F6.a.e(context, ((AbstractC1378u6.b) value).f9425b);
        }
        if (!(value instanceof AbstractC1378u6.a)) {
            throw new b9.j();
        }
        ((C1448z6.a) uc.f6909u4.getValue()).getClass();
        return C1448z6.a.e(context, ((AbstractC1378u6.a) value).f9424b);
    }
}
