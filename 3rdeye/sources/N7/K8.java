package N7;

import N7.M8;
import N7.T8;
import N7.X4;
import org.json.JSONObject;

/* compiled from: DivRadialGradientRadiusJsonParser.kt */
/* loaded from: classes.dex */
public final class K8 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5621a;

    public K8(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5621a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object bVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar2 = fVar.c().get(strI);
        Object obj3 = null;
        M8 m82 = bVar2 instanceof M8 ? (M8) bVar2 : null;
        if (m82 != null) {
            if (m82 instanceof M8.a) {
                strI = "fixed";
            } else {
                if (!(m82 instanceof M8.b)) {
                    throw new b9.j();
                }
                strI = "relative";
            }
        }
        boolean zEquals = strI.equals("fixed");
        Uc uc = this.f5621a;
        if (zEquals) {
            X4.c cVar = (X4.c) uc.f6908u3.getValue();
            if (m82 != null) {
                if (m82 instanceof M8.a) {
                    obj2 = ((M8.a) m82).f5861a;
                } else {
                    if (!(m82 instanceof M8.b)) {
                        throw new b9.j();
                    }
                    obj2 = ((M8.b) m82).f5862a;
                }
                obj3 = obj2;
            }
            cVar.getClass();
            bVar = new M8.a(X4.c.d(fVar, (Y4) obj3, jSONObject));
        } else {
            if (!strI.equals("relative")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            T8.c cVar2 = (T8.c) uc.f6793j6.getValue();
            if (m82 != null) {
                if (m82 instanceof M8.a) {
                    obj = ((M8.a) m82).f5861a;
                } else {
                    if (!(m82 instanceof M8.b)) {
                        throw new b9.j();
                    }
                    obj = ((M8.b) m82).f5862a;
                }
                obj3 = obj;
            }
            cVar2.getClass();
            bVar = new M8.b(T8.c.d(fVar, (U8) obj3, jSONObject));
        }
        return bVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, M8 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof M8.a;
        Uc uc = this.f5621a;
        if (z10) {
            ((X4.c) uc.f6908u3.getValue()).getClass();
            return X4.c.e(context, ((M8.a) value).f5861a);
        }
        if (!(value instanceof M8.b)) {
            throw new b9.j();
        }
        ((T8.c) uc.f6793j6.getValue()).getClass();
        return T8.c.e(context, ((M8.b) value).f5862a);
    }
}
