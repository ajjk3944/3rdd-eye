package N7;

import N7.U5;
import org.json.JSONObject;

/* compiled from: DivInputFilterJsonParser.kt */
/* renamed from: N7.a6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1091a6 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7897a;

    public C1091a6(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7897a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("regex");
        Uc uc = this.f7897a;
        if (zEquals) {
            ((C1151e6) uc.j4.getValue()).getClass();
            return new U5.b(C1151e6.d(fVar, jSONObject));
        }
        if (strI.equals("expression")) {
            ((W5) uc.f6757g4.getValue()).getClass();
            return new U5.a(W5.d(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        AbstractC1211i6 abstractC1211i6 = bVarF instanceof AbstractC1211i6 ? (AbstractC1211i6) bVarF : null;
        if (abstractC1211i6 != null) {
            return ((C1121c6) uc.f6844o4.getValue()).a(fVar, abstractC1211i6, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, U5 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof U5.b;
        Uc uc = this.f7897a;
        if (z10) {
            ((C1151e6) uc.j4.getValue()).getClass();
            return C1151e6.e(context, ((U5.b) value).f6389b);
        }
        if (!(value instanceof U5.a)) {
            throw new b9.j();
        }
        ((W5) uc.f6757g4.getValue()).getClass();
        return W5.e(context, ((U5.a) value).f6388b);
    }
}
