package N7;

import N7.A8;
import N7.E8;
import org.json.JSONObject;

/* compiled from: DivRadialGradientCenterJsonParser.kt */
/* renamed from: N7.y8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1436y8 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9938a;

    public C1436y8(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9938a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object bVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar2 = fVar.c().get(strI);
        Object obj3 = null;
        A8 a82 = bVar2 instanceof A8 ? (A8) bVar2 : null;
        if (a82 != null) {
            if (a82 instanceof A8.a) {
                strI = "fixed";
            } else {
                if (!(a82 instanceof A8.b)) {
                    throw new b9.j();
                }
                strI = "relative";
            }
        }
        boolean zEquals = strI.equals("fixed");
        Uc uc = this.f9938a;
        if (zEquals) {
            E8.c cVar = (E8.c) uc.f6688a6.getValue();
            if (a82 != null) {
                if (a82 instanceof A8.a) {
                    obj2 = ((A8.a) a82).f4787a;
                } else {
                    if (!(a82 instanceof A8.b)) {
                        throw new b9.j();
                    }
                    obj2 = ((A8.b) a82).f4788a;
                }
                obj3 = obj2;
            }
            cVar.getClass();
            bVar = new A8.a(E8.c.d(fVar, (F8) obj3, jSONObject));
        } else {
            if (!strI.equals("relative")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            P8 p82 = (P8) uc.f6759g6.getValue();
            if (a82 != null) {
                if (a82 instanceof A8.a) {
                    obj = ((A8.a) a82).f4787a;
                } else {
                    if (!(a82 instanceof A8.b)) {
                        throw new b9.j();
                    }
                    obj = ((A8.b) a82).f4788a;
                }
                obj3 = obj;
            }
            p82.getClass();
            bVar = new A8.b(P8.d(fVar, (R8) obj3, jSONObject));
        }
        return bVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, A8 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof A8.a;
        Uc uc = this.f9938a;
        if (z10) {
            ((E8.c) uc.f6688a6.getValue()).getClass();
            return E8.c.e(context, ((A8.a) value).f4787a);
        }
        if (!(value instanceof A8.b)) {
            throw new b9.j();
        }
        ((P8) uc.f6759g6.getValue()).getClass();
        return P8.e(context, ((A8.b) value).f4788a);
    }
}
