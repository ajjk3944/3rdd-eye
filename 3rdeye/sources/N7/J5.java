package N7;

import N7.C1104b4;
import N7.C1155ea;
import N7.L5;
import org.json.JSONObject;

/* compiled from: DivIndicatorItemPlacementJsonParser.kt */
/* loaded from: classes.dex */
public final class J5 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5570a;

    public J5(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5570a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object bVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar2 = fVar.c().get(strI);
        Object obj3 = null;
        L5 l5 = bVar2 instanceof L5 ? (L5) bVar2 : null;
        if (l5 != null) {
            if (l5 instanceof L5.a) {
                strI = "default";
            } else {
                if (!(l5 instanceof L5.b)) {
                    throw new b9.j();
                }
                strI = "stretch";
            }
        }
        boolean zEquals = strI.equals("default");
        Uc uc = this.f5570a;
        if (zEquals) {
            C1104b4.b bVar3 = (C1104b4.b) uc.f6482H2.getValue();
            if (l5 != null) {
                if (l5 instanceof L5.a) {
                    obj2 = ((L5.a) l5).f5753a;
                } else {
                    if (!(l5 instanceof L5.b)) {
                        throw new b9.j();
                    }
                    obj2 = ((L5.b) l5).f5754a;
                }
                obj3 = obj2;
            }
            bVar = new L5.a(bVar3.d(fVar, (C1119c4) obj3, jSONObject));
        } else {
            if (!strI.equals("stretch")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            C1155ea.b bVar4 = (C1155ea.b) uc.f6880r7.getValue();
            if (l5 != null) {
                if (l5 instanceof L5.a) {
                    obj = ((L5.a) l5).f5753a;
                } else {
                    if (!(l5 instanceof L5.b)) {
                        throw new b9.j();
                    }
                    obj = ((L5.b) l5).f5754a;
                }
                obj3 = obj;
            }
            bVar = new L5.b(bVar4.d(fVar, (C1170fa) obj3, jSONObject));
        }
        return bVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, L5 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof L5.a;
        Uc uc = this.f5570a;
        if (z10) {
            return ((C1104b4.b) uc.f6482H2.getValue()).b(context, ((L5.a) value).f5753a);
        }
        if (value instanceof L5.b) {
            return ((C1155ea.b) uc.f6880r7.getValue()).b(context, ((L5.b) value).f5754a);
        }
        throw new b9.j();
    }
}
