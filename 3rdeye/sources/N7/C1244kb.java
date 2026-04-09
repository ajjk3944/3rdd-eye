package N7;

import N7.AbstractC1186gb;
import N7.C1300ob;
import N7.C1341rb;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskJsonParser.kt */
/* renamed from: N7.kb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1244kb implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8703a;

    public C1244kb(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8703a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("particles");
        Uc uc = this.f8703a;
        if (zEquals) {
            return new AbstractC1186gb.a(((C1300ob.a) uc.f6749f8.getValue()).a(fVar, jSONObject));
        }
        if (strI.equals("solid")) {
            ((C1341rb.a) uc.f6784i8.getValue()).getClass();
            return new AbstractC1186gb.b(C1341rb.a.d(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        AbstractC1369tb abstractC1369tb = bVarF instanceof AbstractC1369tb ? (AbstractC1369tb) bVarF : null;
        if (abstractC1369tb != null) {
            return ((C1272mb) uc.f6838n8.getValue()).a(fVar, abstractC1369tb, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1186gb value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1186gb.a;
        Uc uc = this.f8703a;
        if (z10) {
            return ((C1300ob.a) uc.f6749f8.getValue()).b(context, ((AbstractC1186gb.a) value).f8305b);
        }
        if (!(value instanceof AbstractC1186gb.b)) {
            throw new b9.j();
        }
        ((C1341rb.a) uc.f6784i8.getValue()).getClass();
        return C1341rb.a.e(context, ((AbstractC1186gb.b) value).f8306b);
    }
}
