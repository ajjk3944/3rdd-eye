package N7;

import N7.AbstractC1239k6;
import N7.T4;
import com.applovin.sdk.AppLovinEventParameters;
import org.json.JSONObject;

/* compiled from: DivInputMaskJsonParser.kt */
/* renamed from: N7.m6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1267m6 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8757a;

    public C1267m6(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8757a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        int iHashCode = strI.hashCode();
        Uc uc = this.f8757a;
        if (iHashCode != 106642798) {
            if (iHashCode != 393594385) {
                if (iHashCode == 575402001 && strI.equals(AppLovinEventParameters.REVENUE_CURRENCY)) {
                    ((N3) uc.f6917v2.getValue()).getClass();
                    return new AbstractC1239k6.a(N3.d(fVar, jSONObject));
                }
            } else if (strI.equals("fixed_length")) {
                return new AbstractC1239k6.b(((T4.a) uc.f6833n3.getValue()).a(fVar, jSONObject));
            }
        } else if (strI.equals("phone")) {
            ((Z7) uc.f6485H5.getValue()).getClass();
            return new AbstractC1239k6.c(Z7.d(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        AbstractC1309p6 abstractC1309p6 = bVarF instanceof AbstractC1309p6 ? (AbstractC1309p6) bVarF : null;
        if (abstractC1309p6 != null) {
            return ((C1295o6) uc.f6877r4.getValue()).a(fVar, abstractC1309p6, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1239k6 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1239k6.b;
        Uc uc = this.f8757a;
        if (z10) {
            return ((T4.a) uc.f6833n3.getValue()).b(context, ((AbstractC1239k6.b) value).f8633b);
        }
        if (value instanceof AbstractC1239k6.a) {
            ((N3) uc.f6917v2.getValue()).getClass();
            return N3.e(context, ((AbstractC1239k6.a) value).f8632b);
        }
        if (!(value instanceof AbstractC1239k6.c)) {
            throw new b9.j();
        }
        ((Z7) uc.f6485H5.getValue()).getClass();
        return Z7.e(context, ((AbstractC1239k6.c) value).f8634b);
    }
}
