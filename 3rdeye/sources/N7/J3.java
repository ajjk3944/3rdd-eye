package N7;

import N7.L3;
import N7.Q4;
import org.json.JSONObject;

/* compiled from: DivCountJsonParser.kt */
/* loaded from: classes.dex */
public final class J3 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5568a;

    public J3(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5568a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        Object obj3 = null;
        L3 l32 = bVar instanceof L3 ? (L3) bVar : null;
        if (l32 != null) {
            if (l32 instanceof L3.b) {
                strI = "infinity";
            } else {
                if (!(l32 instanceof L3.a)) {
                    throw new b9.j();
                }
                strI = "fixed";
            }
        }
        boolean zEquals = strI.equals("infinity");
        Uc uc = this.f5568a;
        if (zEquals) {
            Q5 q52 = (Q5) uc.e4.getValue();
            if (l32 != null) {
                if (l32 instanceof L3.b) {
                    obj2 = ((L3.b) l32).f5752a;
                } else {
                    if (!(l32 instanceof L3.a)) {
                        throw new b9.j();
                    }
                    obj2 = ((L3.a) l32).f5751a;
                }
                obj3 = obj2;
            }
            q52.getClass();
            return new L3.b(new S5());
        }
        if (!strI.equals("fixed")) {
            throw z7.e.l(jSONObject, "type", strI);
        }
        Q4.b bVar2 = (Q4.b) uc.f6812l3.getValue();
        if (l32 != null) {
            if (l32 instanceof L3.b) {
                obj = ((L3.b) l32).f5752a;
            } else {
                if (!(l32 instanceof L3.a)) {
                    throw new b9.j();
                }
                obj = ((L3.a) l32).f5751a;
            }
            obj3 = obj;
        }
        bVar2.getClass();
        return new L3.a(Q4.b.d(fVar, (R4) obj3, jSONObject));
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, L3 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof L3.b;
        Uc uc = this.f5568a;
        if (z10) {
            ((Q5) uc.e4.getValue()).getClass();
            return Q5.d(context, ((L3.b) value).f5752a);
        }
        if (!(value instanceof L3.a)) {
            throw new b9.j();
        }
        ((Q4.b) uc.f6812l3.getValue()).getClass();
        return Q4.b.e(context, ((L3.a) value).f5751a);
    }
}
