package N7;

import N7.AbstractC1339r9;
import N7.C1264m3;
import N7.X8;
import org.json.JSONObject;

/* compiled from: DivShapeJsonParser.kt */
/* renamed from: N7.x9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1423x9 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9788a;

    public C1423x9(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9788a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("rounded_rectangle");
        Uc uc = this.f9788a;
        if (zEquals) {
            return new AbstractC1339r9.b(((X8.a) uc.f6879r6.getValue()).a(fVar, jSONObject));
        }
        if (strI.equals("circle")) {
            return new AbstractC1339r9.a(((C1264m3.a) uc.f6619U1.getValue()).a(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        A9 a92 = bVarF instanceof A9 ? (A9) bVarF : null;
        if (a92 != null) {
            return ((C1451z9) uc.f6591R6.getValue()).a(fVar, a92, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1339r9 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1339r9.b;
        Uc uc = this.f9788a;
        if (z10) {
            return ((X8.a) uc.f6879r6.getValue()).b(context, ((AbstractC1339r9.b) value).f9080b);
        }
        if (value instanceof AbstractC1339r9.a) {
            return ((C1264m3.a) uc.f6619U1.getValue()).b(context, ((AbstractC1339r9.a) value).f9079b);
        }
        throw new b9.j();
    }
}
