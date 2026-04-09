package N7;

import N7.C9;
import N7.W6;
import N7.X4;
import org.json.JSONObject;

/* compiled from: DivSizeJsonParser.kt */
/* loaded from: classes.dex */
public final class D9 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5118a;

    public D9(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5118a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        int iHashCode = strI.hashCode();
        Uc uc = this.f5118a;
        if (iHashCode != 97445748) {
            if (iHashCode != 343327108) {
                if (iHashCode == 1386124388 && strI.equals("match_parent")) {
                    ((W6.a) uc.f6600S4.getValue()).getClass();
                    return new C9.b(W6.a.d(fVar, jSONObject));
                }
            } else if (strI.equals("wrap_content")) {
                return new C9.c(((C1440yc) uc.f6871q9.getValue()).a(fVar, jSONObject));
            }
        } else if (strI.equals("fixed")) {
            ((X4.b) uc.f6897t3.getValue()).getClass();
            return new C9.a(X4.b.d(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        G9 g92 = bVarF instanceof G9 ? (G9) bVarF : null;
        if (g92 != null) {
            return ((F9) uc.U6.getValue()).a(fVar, g92, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, C9 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof C9.a;
        Uc uc = this.f5118a;
        if (z10) {
            ((X4.b) uc.f6897t3.getValue()).getClass();
            return X4.b.e(context, ((C9.a) value).f5043b);
        }
        if (value instanceof C9.b) {
            ((W6.a) uc.f6600S4.getValue()).getClass();
            return W6.a.e(context, ((C9.b) value).f5044b);
        }
        if (value instanceof C9.c) {
            return ((C1440yc) uc.f6871q9.getValue()).b(context, ((C9.c) value).f5045b);
        }
        throw new b9.j();
    }
}
