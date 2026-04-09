package N7;

import N7.AbstractC1236k3;
import N7.C1103b3;
import N7.C1148e3;
import org.json.JSONObject;

/* compiled from: DivChangeTransitionJsonParser.kt */
/* renamed from: N7.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1208i3 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8388a;

    public C1208i3(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8388a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object aVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        Object obj3 = null;
        AbstractC1236k3 abstractC1236k3 = bVar instanceof AbstractC1236k3 ? (AbstractC1236k3) bVar : null;
        if (abstractC1236k3 != null) {
            if (abstractC1236k3 instanceof AbstractC1236k3.b) {
                strI = "set";
            } else {
                if (!(abstractC1236k3 instanceof AbstractC1236k3.a)) {
                    throw new b9.j();
                }
                strI = "change_bounds";
            }
        }
        boolean zEquals = strI.equals("set");
        Uc uc = this.f8388a;
        if (zEquals) {
            C1148e3.b bVar2 = (C1148e3.b) uc.f6565P1.getValue();
            if (abstractC1236k3 != null) {
                if (abstractC1236k3 instanceof AbstractC1236k3.b) {
                    obj2 = ((AbstractC1236k3.b) abstractC1236k3).f8629a;
                } else {
                    if (!(abstractC1236k3 instanceof AbstractC1236k3.a)) {
                        throw new b9.j();
                    }
                    obj2 = ((AbstractC1236k3.a) abstractC1236k3).f8628a;
                }
                obj3 = obj2;
            }
            aVar = new AbstractC1236k3.b(bVar2.d(fVar, (C1163f3) obj3, jSONObject));
        } else {
            if (!strI.equals("change_bounds")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            C1103b3.c cVar = (C1103b3.c) uc.f6534M1.getValue();
            if (abstractC1236k3 != null) {
                if (abstractC1236k3 instanceof AbstractC1236k3.b) {
                    obj = ((AbstractC1236k3.b) abstractC1236k3).f8629a;
                } else {
                    if (!(abstractC1236k3 instanceof AbstractC1236k3.a)) {
                        throw new b9.j();
                    }
                    obj = ((AbstractC1236k3.a) abstractC1236k3).f8628a;
                }
                obj3 = obj;
            }
            cVar.getClass();
            aVar = new AbstractC1236k3.a(C1103b3.c.d(fVar, (C1118c3) obj3, jSONObject));
        }
        return aVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1236k3 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1236k3.b;
        Uc uc = this.f8388a;
        if (z10) {
            return ((C1148e3.b) uc.f6565P1.getValue()).b(context, ((AbstractC1236k3.b) value).f8629a);
        }
        if (!(value instanceof AbstractC1236k3.a)) {
            throw new b9.j();
        }
        ((C1103b3.c) uc.f6534M1.getValue()).getClass();
        return C1103b3.c.e(context, ((AbstractC1236k3.a) value).f8628a);
    }
}
