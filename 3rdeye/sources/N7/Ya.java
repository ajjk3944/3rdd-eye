package N7;

import N7.C1306p3;
import N7.Xa;
import org.json.JSONObject;

/* compiled from: DivTextRangeBackgroundJsonParser.kt */
/* loaded from: classes.dex */
public final class Ya implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7801a;

    public Ya(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7801a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("solid");
        Uc uc = this.f7801a;
        if (zEquals) {
            ((T9) uc.f6772h7.getValue()).getClass();
            return new Xa.b(T9.d(fVar, jSONObject));
        }
        if (strI.equals("cloud")) {
            return new Xa.a(((C1306p3.a) uc.f6651X1.getValue()).a(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        AbstractC1111bb abstractC1111bb = bVarF instanceof AbstractC1111bb ? (AbstractC1111bb) bVarF : null;
        if (abstractC1111bb != null) {
            return ((C1096ab) uc.f6678Z7.getValue()).a(fVar, abstractC1111bb, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Xa value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof Xa.b;
        Uc uc = this.f7801a;
        if (z10) {
            ((T9) uc.f6772h7.getValue()).getClass();
            return T9.e(context, ((Xa.b) value).f7753b);
        }
        if (value instanceof Xa.a) {
            return ((C1306p3.a) uc.f6651X1.getValue()).b(context, ((Xa.a) value).f7752b);
        }
        throw new b9.j();
    }
}
