package N7;

import N7.O4;
import N7.V2;
import org.json.JSONObject;

/* compiled from: DivFilterJsonParser.kt */
/* loaded from: classes.dex */
public final class H4 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5389a;

    public H4(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5389a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object bVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar2 = fVar.c().get(strI);
        Object obj3 = null;
        O4 o42 = bVar2 instanceof O4 ? (O4) bVar2 : null;
        if (o42 != null) {
            if (o42 instanceof O4.a) {
                strI = "blur";
            } else {
                if (!(o42 instanceof O4.b)) {
                    throw new b9.j();
                }
                strI = "rtl_mirror";
            }
        }
        boolean zEquals = strI.equals("blur");
        Uc uc = this.f5389a;
        if (zEquals) {
            V2.b bVar3 = (V2.b) uc.f6472G1.getValue();
            if (o42 != null) {
                if (o42 instanceof O4.a) {
                    obj2 = ((O4.a) o42).f5949a;
                } else {
                    if (!(o42 instanceof O4.b)) {
                        throw new b9.j();
                    }
                    obj2 = ((O4.b) o42).f5950a;
                }
                obj3 = obj2;
            }
            bVar3.getClass();
            bVar = new O4.a(V2.b.d(fVar, (W2) obj3, jSONObject));
        } else {
            if (!strI.equals("rtl_mirror")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            L4 l42 = (L4) uc.f6744f3.getValue();
            if (o42 != null) {
                if (o42 instanceof O4.a) {
                    obj = ((O4.a) o42).f5949a;
                } else {
                    if (!(o42 instanceof O4.b)) {
                        throw new b9.j();
                    }
                    obj = ((O4.b) o42).f5950a;
                }
                obj3 = obj;
            }
            l42.getClass();
            bVar = new O4.b(new N4());
        }
        return bVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, O4 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof O4.a;
        Uc uc = this.f5389a;
        if (z10) {
            ((V2.b) uc.f6472G1.getValue()).getClass();
            return V2.b.e(context, ((O4.a) value).f5949a);
        }
        if (!(value instanceof O4.b)) {
            throw new b9.j();
        }
        ((L4) uc.f6744f3.getValue()).getClass();
        return L4.d(context, ((O4.b) value).f5950a);
    }
}
