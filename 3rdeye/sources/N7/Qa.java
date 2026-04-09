package N7;

import N7.H8;
import N7.Pa;
import N7.T6;
import org.json.JSONObject;

/* compiled from: DivTextGradientJsonParser.kt */
/* loaded from: classes.dex */
public final class Qa implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f6100a;

    public Qa(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f6100a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("gradient");
        Uc uc = this.f6100a;
        if (zEquals) {
            return new Pa.a(((T6.a) uc.f6537M4.getValue()).a(fVar, jSONObject));
        }
        if (strI.equals("radial_gradient")) {
            return new Pa.b(((H8.a) uc.f6814l6.getValue()).a(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        Ta ta2 = bVarF instanceof Ta ? (Ta) bVarF : null;
        if (ta2 != null) {
            return ((Sa) uc.f6646W7.getValue()).a(fVar, ta2, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Pa value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof Pa.a;
        Uc uc = this.f6100a;
        if (z10) {
            return ((T6.a) uc.f6537M4.getValue()).b(context, ((Pa.a) value).f6018b);
        }
        if (value instanceof Pa.b) {
            return ((H8.a) uc.f6814l6.getValue()).b(context, ((Pa.b) value).f6019b);
        }
        throw new b9.j();
    }
}
