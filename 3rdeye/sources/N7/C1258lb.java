package N7;

import N7.AbstractC1369tb;
import N7.C1300ob;
import N7.C1341rb;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskJsonParser.kt */
/* renamed from: N7.lb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258lb implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8737a;

    public C1258lb(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8737a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object bVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar2 = fVar.c().get(strI);
        Object obj3 = null;
        AbstractC1369tb abstractC1369tb = bVar2 instanceof AbstractC1369tb ? (AbstractC1369tb) bVar2 : null;
        if (abstractC1369tb != null) {
            if (abstractC1369tb instanceof AbstractC1369tb.a) {
                strI = "particles";
            } else {
                if (!(abstractC1369tb instanceof AbstractC1369tb.b)) {
                    throw new b9.j();
                }
                strI = "solid";
            }
        }
        boolean zEquals = strI.equals("particles");
        Uc uc = this.f8737a;
        if (zEquals) {
            C1300ob.b bVar3 = (C1300ob.b) uc.f6761g8.getValue();
            if (abstractC1369tb != null) {
                if (abstractC1369tb instanceof AbstractC1369tb.a) {
                    obj2 = ((AbstractC1369tb.a) abstractC1369tb).f9337a;
                } else {
                    if (!(abstractC1369tb instanceof AbstractC1369tb.b)) {
                        throw new b9.j();
                    }
                    obj2 = ((AbstractC1369tb.b) abstractC1369tb).f9338a;
                }
                obj3 = obj2;
            }
            bVar = new AbstractC1369tb.a(bVar3.d(fVar, (C1314pb) obj3, jSONObject));
        } else {
            if (!strI.equals("solid")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            C1341rb.b bVar4 = (C1341rb.b) uc.f6795j8.getValue();
            if (abstractC1369tb != null) {
                if (abstractC1369tb instanceof AbstractC1369tb.a) {
                    obj = ((AbstractC1369tb.a) abstractC1369tb).f9337a;
                } else {
                    if (!(abstractC1369tb instanceof AbstractC1369tb.b)) {
                        throw new b9.j();
                    }
                    obj = ((AbstractC1369tb.b) abstractC1369tb).f9338a;
                }
                obj3 = obj;
            }
            bVar4.getClass();
            bVar = new AbstractC1369tb.b(C1341rb.b.d(fVar, (C1355sb) obj3, jSONObject));
        }
        return bVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1369tb value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1369tb.a;
        Uc uc = this.f8737a;
        if (z10) {
            return ((C1300ob.b) uc.f6761g8.getValue()).b(context, ((AbstractC1369tb.a) value).f9337a);
        }
        if (!(value instanceof AbstractC1369tb.b)) {
            throw new b9.j();
        }
        ((C1341rb.b) uc.f6795j8.getValue()).getClass();
        return C1341rb.b.e(context, ((AbstractC1369tb.b) value).f9338a);
    }
}
