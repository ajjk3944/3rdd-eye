package N7;

import N7.A7;
import N7.D7;
import N7.F7;
import org.json.JSONObject;

/* compiled from: DivPageTransformationJsonParser.kt */
/* renamed from: N7.x7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1421x7 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9786a;

    public C1421x7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9786a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object aVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        Object obj3 = null;
        F7 f72 = bVar instanceof F7 ? (F7) bVar : null;
        if (f72 != null) {
            if (f72 instanceof F7.b) {
                strI = "slide";
            } else {
                if (!(f72 instanceof F7.a)) {
                    throw new b9.j();
                }
                strI = "overlap";
            }
        }
        boolean zEquals = strI.equals("slide");
        Uc uc = this.f9786a;
        if (zEquals) {
            D7.c cVar = (D7.c) uc.f6845o5.getValue();
            if (f72 != null) {
                if (f72 instanceof F7.b) {
                    obj2 = ((F7.b) f72).f5229a;
                } else {
                    if (!(f72 instanceof F7.a)) {
                        throw new b9.j();
                    }
                    obj2 = ((F7.a) f72).f5228a;
                }
                obj3 = obj2;
            }
            cVar.getClass();
            aVar = new F7.b(D7.c.d(fVar, (E7) obj3, jSONObject));
        } else {
            if (!strI.equals("overlap")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            A7.c cVar2 = (A7.c) uc.l5.getValue();
            if (f72 != null) {
                if (f72 instanceof F7.b) {
                    obj = ((F7.b) f72).f5229a;
                } else {
                    if (!(f72 instanceof F7.a)) {
                        throw new b9.j();
                    }
                    obj = ((F7.a) f72).f5228a;
                }
                obj3 = obj;
            }
            cVar2.getClass();
            aVar = new F7.a(A7.c.d(fVar, (B7) obj3, jSONObject));
        }
        return aVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, F7 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof F7.b;
        Uc uc = this.f9786a;
        if (z10) {
            ((D7.c) uc.f6845o5.getValue()).getClass();
            return D7.c.e(context, ((F7.b) value).f5229a);
        }
        if (!(value instanceof F7.a)) {
            throw new b9.j();
        }
        ((A7.c) uc.l5.getValue()).getClass();
        return A7.c.e(context, ((F7.a) value).f5228a);
    }
}
