package N7;

import N7.H8;
import N7.T6;
import N7.Ta;
import org.json.JSONObject;

/* compiled from: DivTextGradientJsonParser.kt */
/* loaded from: classes.dex */
public final class Ra implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f6173a;

    public Ra(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f6173a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object bVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar2 = fVar.c().get(strI);
        Object obj3 = null;
        Ta ta2 = bVar2 instanceof Ta ? (Ta) bVar2 : null;
        if (ta2 != null) {
            if (ta2 instanceof Ta.a) {
                strI = "gradient";
            } else {
                if (!(ta2 instanceof Ta.b)) {
                    throw new b9.j();
                }
                strI = "radial_gradient";
            }
        }
        boolean zEquals = strI.equals("gradient");
        Uc uc = this.f6173a;
        if (zEquals) {
            T6.b bVar3 = (T6.b) uc.f6547N4.getValue();
            if (ta2 != null) {
                if (ta2 instanceof Ta.a) {
                    obj2 = ((Ta.a) ta2).f6348a;
                } else {
                    if (!(ta2 instanceof Ta.b)) {
                        throw new b9.j();
                    }
                    obj2 = ((Ta.b) ta2).f6349a;
                }
                obj3 = obj2;
            }
            bVar = new Ta.a(bVar3.d(fVar, (U6) obj3, jSONObject));
        } else {
            if (!strI.equals("radial_gradient")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            H8.b bVar4 = (H8.b) uc.f6825m6.getValue();
            if (ta2 != null) {
                if (ta2 instanceof Ta.a) {
                    obj = ((Ta.a) ta2).f6348a;
                } else {
                    if (!(ta2 instanceof Ta.b)) {
                        throw new b9.j();
                    }
                    obj = ((Ta.b) ta2).f6349a;
                }
                obj3 = obj;
            }
            bVar = new Ta.b(bVar4.d(fVar, (V8) obj3, jSONObject));
        }
        return bVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Ta value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof Ta.a;
        Uc uc = this.f6173a;
        if (z10) {
            return ((T6.b) uc.f6547N4.getValue()).b(context, ((Ta.a) value).f6348a);
        }
        if (value instanceof Ta.b) {
            return ((H8.b) uc.f6825m6.getValue()).b(context, ((Ta.b) value).f6349a);
        }
        throw new b9.j();
    }
}
