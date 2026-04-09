package N7;

import N7.F4;
import N7.V2;
import org.json.JSONObject;

/* compiled from: DivFilterJsonParser.kt */
/* loaded from: classes.dex */
public final class G4 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5265a;

    public G4(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5265a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("blur");
        Uc uc = this.f5265a;
        if (zEquals) {
            ((V2.a) uc.f6461F1.getValue()).getClass();
            return new F4.a(V2.a.d(fVar, jSONObject));
        }
        if (strI.equals("rtl_mirror")) {
            ((K4) uc.f6733e3.getValue()).getClass();
            return new F4.b(new J4());
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        O4 o42 = bVarF instanceof O4 ? (O4) bVarF : null;
        if (o42 != null) {
            return ((I4) uc.f6791j3.getValue()).a(fVar, o42, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, F4 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof F4.a;
        Uc uc = this.f5265a;
        if (z10) {
            ((V2.a) uc.f6461F1.getValue()).getClass();
            return V2.a.e(context, ((F4.a) value).f5171b);
        }
        if (!(value instanceof F4.b)) {
            throw new b9.j();
        }
        ((K4) uc.f6733e3.getValue()).getClass();
        return K4.d(context, ((F4.b) value).f5172b);
    }
}
