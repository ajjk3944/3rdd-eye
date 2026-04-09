package N7;

import N7.AbstractC1410wa;
import org.json.JSONObject;

/* compiled from: DivStrokeStyleJsonParser.kt */
/* renamed from: N7.pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1313pa implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8911a;

    public C1313pa(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8911a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object aVar;
        Object obj;
        Object obj2;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        Object obj3 = null;
        AbstractC1410wa abstractC1410wa = bVar instanceof AbstractC1410wa ? (AbstractC1410wa) bVar : null;
        if (abstractC1410wa != null) {
            if (abstractC1410wa instanceof AbstractC1410wa.b) {
                strI = "solid";
            } else {
                if (!(abstractC1410wa instanceof AbstractC1410wa.a)) {
                    throw new b9.j();
                }
                strI = "dashed";
            }
        }
        boolean zEquals = strI.equals("solid");
        Uc uc = this.f8911a;
        if (zEquals) {
            C1368ta c1368ta = (C1368ta) uc.f6944x7.getValue();
            if (abstractC1410wa != null) {
                if (abstractC1410wa instanceof AbstractC1410wa.b) {
                    obj2 = ((AbstractC1410wa.b) abstractC1410wa).f9730a;
                } else {
                    if (!(abstractC1410wa instanceof AbstractC1410wa.a)) {
                        throw new b9.j();
                    }
                    obj2 = ((AbstractC1410wa.a) abstractC1410wa).f9729a;
                }
                obj3 = obj2;
            }
            c1368ta.getClass();
            aVar = new AbstractC1410wa.b(new C1396va());
        } else {
            if (!strI.equals("dashed")) {
                throw z7.e.l(jSONObject, "type", strI);
            }
            C1257la c1257la = (C1257la) uc.f6912u7.getValue();
            if (abstractC1410wa != null) {
                if (abstractC1410wa instanceof AbstractC1410wa.b) {
                    obj = ((AbstractC1410wa.b) abstractC1410wa).f9730a;
                } else {
                    if (!(abstractC1410wa instanceof AbstractC1410wa.a)) {
                        throw new b9.j();
                    }
                    obj = ((AbstractC1410wa.a) abstractC1410wa).f9729a;
                }
                obj3 = obj;
            }
            c1257la.getClass();
            aVar = new AbstractC1410wa.a(new C1285na());
        }
        return aVar;
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1410wa value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1410wa.b;
        Uc uc = this.f8911a;
        if (z10) {
            ((C1368ta) uc.f6944x7.getValue()).getClass();
            return C1368ta.d(context, ((AbstractC1410wa.b) value).f9730a);
        }
        if (!(value instanceof AbstractC1410wa.a)) {
            throw new b9.j();
        }
        ((C1257la) uc.f6912u7.getValue()).getClass();
        return C1257la.d(context, ((AbstractC1410wa.a) value).f9729a);
    }
}
