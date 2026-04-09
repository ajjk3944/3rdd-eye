package N7;

import N7.AbstractC1211i6;
import org.json.JSONObject;

/* compiled from: DivInputFilterJsonParser.kt */
/* renamed from: N7.b6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1106b6 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7933a;

    public C1106b6(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7933a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object aVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        Object obj3 = null;
        AbstractC1211i6 abstractC1211i6 = bVar instanceof AbstractC1211i6 ? (AbstractC1211i6) bVar : null;
        if (abstractC1211i6 != null) {
            if (abstractC1211i6 instanceof AbstractC1211i6.b) {
                strI = "regex";
            } else {
                if (!(abstractC1211i6 instanceof AbstractC1211i6.a)) {
                    throw new b9.j();
                }
                strI = "expression";
            }
        }
        boolean zEquals = strI.equals("regex");
        Uc uc = this.f7933a;
        if (zEquals) {
            C1166f6 c1166f6 = (C1166f6) uc.f6802k4.getValue();
            if (abstractC1211i6 != null) {
                if (abstractC1211i6 instanceof AbstractC1211i6.b) {
                    obj2 = ((AbstractC1211i6.b) abstractC1211i6).f8405a;
                } else {
                    if (!(abstractC1211i6 instanceof AbstractC1211i6.a)) {
                        throw new b9.j();
                    }
                    obj2 = ((AbstractC1211i6.a) abstractC1211i6).f8404a;
                }
                obj3 = obj2;
            }
            c1166f6.getClass();
            aVar = new AbstractC1211i6.b(C1166f6.d(fVar, (C1196h6) obj3, jSONObject));
        } else {
            if (!strI.equals("expression")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            X5 x52 = (X5) uc.f6769h4.getValue();
            if (abstractC1211i6 != null) {
                if (abstractC1211i6 instanceof AbstractC1211i6.b) {
                    obj = ((AbstractC1211i6.b) abstractC1211i6).f8405a;
                } else {
                    if (!(abstractC1211i6 instanceof AbstractC1211i6.a)) {
                        throw new b9.j();
                    }
                    obj = ((AbstractC1211i6.a) abstractC1211i6).f8404a;
                }
                obj3 = obj;
            }
            x52.getClass();
            aVar = new AbstractC1211i6.a(X5.d(fVar, (Z5) obj3, jSONObject));
        }
        return aVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1211i6 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1211i6.b;
        Uc uc = this.f7933a;
        if (z10) {
            ((C1166f6) uc.f6802k4.getValue()).getClass();
            return C1166f6.e(context, ((AbstractC1211i6.b) value).f8405a);
        }
        if (!(value instanceof AbstractC1211i6.a)) {
            throw new b9.j();
        }
        ((X5) uc.f6769h4.getValue()).getClass();
        return X5.e(context, ((AbstractC1211i6.a) value).f8404a);
    }
}
