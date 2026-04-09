package N7;

import N7.AbstractC1309p6;
import N7.T4;
import com.applovin.sdk.AppLovinEventParameters;
import org.json.JSONObject;

/* compiled from: DivInputMaskJsonParser.kt */
/* renamed from: N7.n6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1281n6 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8793a;

    public C1281n6(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8793a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object cVar;
        Object objA;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        AbstractC1309p6 abstractC1309p6 = bVar instanceof AbstractC1309p6 ? (AbstractC1309p6) bVar : null;
        if (abstractC1309p6 != null) {
            if (abstractC1309p6 instanceof AbstractC1309p6.b) {
                strI = "fixed_length";
            } else if (abstractC1309p6 instanceof AbstractC1309p6.a) {
                strI = AppLovinEventParameters.REVENUE_CURRENCY;
            } else {
                if (!(abstractC1309p6 instanceof AbstractC1309p6.c)) {
                    throw new b9.j();
                }
                strI = "phone";
            }
        }
        int iHashCode = strI.hashCode();
        Uc uc = this.f8793a;
        if (iHashCode == 106642798) {
            if (strI.equals("phone")) {
                C1093a8 c1093a8 = (C1093a8) uc.f6496I5.getValue();
                objA = abstractC1309p6 != null ? abstractC1309p6.a() : null;
                c1093a8.getClass();
                cVar = new AbstractC1309p6.c(C1093a8.d(fVar, (C1123c8) objA, jSONObject));
                return cVar;
            }
            throw z7.e.l(jSONObject, "type", strI);
        }
        if (iHashCode == 393594385) {
            if (strI.equals("fixed_length")) {
                cVar = new AbstractC1309p6.b(((T4.b) uc.f6843o3.getValue()).d(fVar, (V4) (abstractC1309p6 != null ? abstractC1309p6.a() : null), jSONObject));
                return cVar;
            }
            throw z7.e.l(jSONObject, "type", strI);
        }
        if (iHashCode == 575402001 && strI.equals(AppLovinEventParameters.REVENUE_CURRENCY)) {
            O3 o32 = (O3) uc.f6928w2.getValue();
            objA = abstractC1309p6 != null ? abstractC1309p6.a() : null;
            o32.getClass();
            cVar = new AbstractC1309p6.a(O3.d(fVar, (Q3) objA, jSONObject));
            return cVar;
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1309p6 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1309p6.b;
        Uc uc = this.f8793a;
        if (z10) {
            return ((T4.b) uc.f6843o3.getValue()).b(context, ((AbstractC1309p6.b) value).f8899a);
        }
        if (value instanceof AbstractC1309p6.a) {
            ((O3) uc.f6928w2.getValue()).getClass();
            return O3.e(context, ((AbstractC1309p6.a) value).f8898a);
        }
        if (!(value instanceof AbstractC1309p6.c)) {
            throw new b9.j();
        }
        ((C1093a8) uc.f6496I5.getValue()).getClass();
        return C1093a8.e(context, ((AbstractC1309p6.c) value).f8900a);
    }
}
