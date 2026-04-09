package N7;

import N7.AbstractC1408w8;
import N7.E8;
import org.json.JSONObject;

/* compiled from: DivRadialGradientCenterJsonParser.kt */
/* renamed from: N7.x8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1422x8 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9787a;

    public C1422x8(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9787a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("fixed");
        Uc uc = this.f9787a;
        if (zEquals) {
            ((E8.b) uc.f6676Z5.getValue()).getClass();
            return new AbstractC1408w8.a(E8.b.d(fVar, jSONObject));
        }
        if (strI.equals("relative")) {
            ((O8) uc.f6747f6.getValue()).getClass();
            return new AbstractC1408w8.b(O8.d(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        A8 a82 = bVarF instanceof A8 ? (A8) bVarF : null;
        if (a82 != null) {
            return ((C1450z8) uc.f6665Y5.getValue()).a(fVar, a82, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1408w8 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1408w8.a;
        Uc uc = this.f9787a;
        if (z10) {
            ((E8.b) uc.f6676Z5.getValue()).getClass();
            return E8.b.e(context, ((AbstractC1408w8.a) value).f9724b);
        }
        if (!(value instanceof AbstractC1408w8.b)) {
            throw new b9.j();
        }
        ((O8) uc.f6747f6.getValue()).getClass();
        return O8.e(context, ((AbstractC1408w8.b) value).f9725b);
    }
}
