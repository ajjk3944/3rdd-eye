package N7;

import N7.AbstractC1111bb;
import N7.C1306p3;
import org.json.JSONObject;

/* compiled from: DivTextRangeBackgroundJsonParser.kt */
/* loaded from: classes.dex */
public final class Za implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7872a;

    public Za(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7872a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object aVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        Object obj3 = null;
        AbstractC1111bb abstractC1111bb = bVar instanceof AbstractC1111bb ? (AbstractC1111bb) bVar : null;
        if (abstractC1111bb != null) {
            if (abstractC1111bb instanceof AbstractC1111bb.b) {
                strI = "solid";
            } else {
                if (!(abstractC1111bb instanceof AbstractC1111bb.a)) {
                    throw new b9.j();
                }
                strI = "cloud";
            }
        }
        boolean zEquals = strI.equals("solid");
        Uc uc = this.f7872a;
        if (zEquals) {
            U9 u92 = (U9) uc.f6783i7.getValue();
            if (abstractC1111bb != null) {
                if (abstractC1111bb instanceof AbstractC1111bb.b) {
                    obj2 = ((AbstractC1111bb.b) abstractC1111bb).f7949a;
                } else {
                    if (!(abstractC1111bb instanceof AbstractC1111bb.a)) {
                        throw new b9.j();
                    }
                    obj2 = ((AbstractC1111bb.a) abstractC1111bb).f7948a;
                }
                obj3 = obj2;
            }
            u92.getClass();
            aVar = new AbstractC1111bb.b(U9.d(fVar, (W9) obj3, jSONObject));
        } else {
            if (!strI.equals("cloud")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            C1306p3.b bVar2 = (C1306p3.b) uc.f6661Y1.getValue();
            if (abstractC1111bb != null) {
                if (abstractC1111bb instanceof AbstractC1111bb.b) {
                    obj = ((AbstractC1111bb.b) abstractC1111bb).f7949a;
                } else {
                    if (!(abstractC1111bb instanceof AbstractC1111bb.a)) {
                        throw new b9.j();
                    }
                    obj = ((AbstractC1111bb.a) abstractC1111bb).f7948a;
                }
                obj3 = obj;
            }
            aVar = new AbstractC1111bb.a(bVar2.d(fVar, (C1320q3) obj3, jSONObject));
        }
        return aVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1111bb value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1111bb.b;
        Uc uc = this.f7872a;
        if (z10) {
            ((U9) uc.f6783i7.getValue()).getClass();
            return U9.e(context, ((AbstractC1111bb.b) value).f7949a);
        }
        if (value instanceof AbstractC1111bb.a) {
            return ((C1306p3.b) uc.f6661Y1.getValue()).b(context, ((AbstractC1111bb.a) value).f7948a);
        }
        throw new b9.j();
    }
}
