package N7;

import N7.B2;
import N7.C1226j7;
import N7.C1403w3;
import org.json.JSONObject;

/* compiled from: DivAnimatorJsonParser.kt */
/* renamed from: N7.z2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1444z2 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f10002a;

    public C1444z2(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f10002a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object bVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar2 = fVar.c().get(strI);
        Object obj3 = null;
        B2 b22 = bVar2 instanceof B2 ? (B2) bVar2 : null;
        if (b22 != null) {
            if (b22 instanceof B2.a) {
                strI = "color_animator";
            } else {
                if (!(b22 instanceof B2.b)) {
                    throw new b9.j();
                }
                strI = "number_animator";
            }
        }
        boolean zEquals = strI.equals("color_animator");
        Uc uc = this.f10002a;
        if (zEquals) {
            C1403w3.d dVar = (C1403w3.d) uc.f6767h2.getValue();
            if (b22 != null) {
                if (b22 instanceof B2.a) {
                    obj2 = ((B2.a) b22).f4833a;
                } else {
                    if (!(b22 instanceof B2.b)) {
                        throw new b9.j();
                    }
                    obj2 = ((B2.b) b22).f4834a;
                }
                obj3 = obj2;
            }
            bVar = new B2.a(dVar.d(fVar, (C1417x3) obj3, jSONObject));
        } else {
            if (!strI.equals("number_animator")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            C1226j7.d dVar2 = (C1226j7.d) uc.f6711c5.getValue();
            if (b22 != null) {
                if (b22 instanceof B2.a) {
                    obj = ((B2.a) b22).f4833a;
                } else {
                    if (!(b22 instanceof B2.b)) {
                        throw new b9.j();
                    }
                    obj = ((B2.b) b22).f4834a;
                }
                obj3 = obj;
            }
            bVar = new B2.b(dVar2.d(fVar, (C1240k7) obj3, jSONObject));
        }
        return bVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, B2 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof B2.a;
        Uc uc = this.f10002a;
        if (z10) {
            return ((C1403w3.d) uc.f6767h2.getValue()).b(context, ((B2.a) value).f4833a);
        }
        if (value instanceof B2.b) {
            return ((C1226j7.d) uc.f6711c5.getValue()).b(context, ((B2.b) value).f4834a);
        }
        throw new b9.j();
    }
}
