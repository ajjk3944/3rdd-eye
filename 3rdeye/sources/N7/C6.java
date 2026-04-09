package N7;

import N7.C1448z6;
import N7.F6;
import N7.H6;
import org.json.JSONObject;

/* compiled from: DivInputValidatorJsonParser.kt */
/* loaded from: classes.dex */
public final class C6 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5030a;

    public C6(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5030a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object aVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        Object obj3 = null;
        H6 h62 = bVar instanceof H6 ? (H6) bVar : null;
        if (h62 != null) {
            if (h62 instanceof H6.b) {
                strI = "regex";
            } else {
                if (!(h62 instanceof H6.a)) {
                    throw new b9.j();
                }
                strI = "expression";
            }
        }
        boolean zEquals = strI.equals("regex");
        Uc uc = this.f5030a;
        if (zEquals) {
            F6.b bVar2 = (F6.b) uc.f6952y4.getValue();
            if (h62 != null) {
                if (h62 instanceof H6.b) {
                    obj2 = ((H6.b) h62).f5394a;
                } else {
                    if (!(h62 instanceof H6.a)) {
                        throw new b9.j();
                    }
                    obj2 = ((H6.a) h62).f5393a;
                }
                obj3 = obj2;
            }
            bVar2.getClass();
            aVar = new H6.b(F6.b.d(fVar, (G6) obj3, jSONObject));
        } else {
            if (!strI.equals("expression")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            C1448z6.b bVar3 = (C1448z6.b) uc.f6919v4.getValue();
            if (h62 != null) {
                if (h62 instanceof H6.b) {
                    obj = ((H6.b) h62).f5394a;
                } else {
                    if (!(h62 instanceof H6.a)) {
                        throw new b9.j();
                    }
                    obj = ((H6.a) h62).f5393a;
                }
                obj3 = obj;
            }
            bVar3.getClass();
            aVar = new H6.a(C1448z6.b.d(fVar, (A6) obj3, jSONObject));
        }
        return aVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, H6 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof H6.b;
        Uc uc = this.f5030a;
        if (z10) {
            ((F6.b) uc.f6952y4.getValue()).getClass();
            return F6.b.e(context, ((H6.b) value).f5394a);
        }
        if (!(value instanceof H6.a)) {
            throw new b9.j();
        }
        ((C1448z6.b) uc.f6919v4.getValue()).getClass();
        return C1448z6.b.e(context, ((H6.a) value).f5393a);
    }
}
