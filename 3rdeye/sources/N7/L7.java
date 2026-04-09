package N7;

import N7.N7;
import org.json.JSONObject;

/* compiled from: DivPagerLayoutModeJsonParser.kt */
/* loaded from: classes.dex */
public final class L7 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5758a;

    public L7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5758a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object cVar;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        N7 n72 = bVar instanceof N7 ? (N7) bVar : null;
        if (n72 != null) {
            if (n72 instanceof N7.c) {
                strI = "percentage";
            } else if (n72 instanceof N7.a) {
                strI = "fixed";
            } else {
                if (!(n72 instanceof N7.b)) {
                    throw new b9.j();
                }
                strI = "wrap_content";
            }
        }
        int iHashCode = strI.hashCode();
        Uc uc = this.f5758a;
        if (iHashCode == -921832806) {
            if (strI.equals("percentage")) {
                cVar = new N7.c(((C1351s7) uc.f6781i5.getValue()).d(fVar, (C1379u7) (n72 != null ? n72.a() : null), jSONObject));
                return cVar;
            }
            throw z7.e.l(jSONObject, "type", strI);
        }
        if (iHashCode != 97445748) {
            if (iHashCode == 343327108 && strI.equals("wrap_content")) {
                C1282n7 c1282n7 = (C1282n7) uc.f6746f5.getValue();
                c1282n7.getClass();
                return new N7.b(new C1310p7());
            }
        } else if (strI.equals("fixed")) {
            cVar = new N7.a(((C1092a7) uc.f6643W4.getValue()).d(fVar, (C1122c7) (n72 != null ? n72.a() : null), jSONObject));
            return cVar;
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, N7 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof N7.c;
        Uc uc = this.f5758a;
        if (z10) {
            return ((C1351s7) uc.f6781i5.getValue()).b(context, ((N7.c) value).f5937a);
        }
        if (value instanceof N7.a) {
            return ((C1092a7) uc.f6643W4.getValue()).b(context, ((N7.a) value).f5935a);
        }
        if (!(value instanceof N7.b)) {
            throw new b9.j();
        }
        ((C1282n7) uc.f6746f5.getValue()).getClass();
        return C1282n7.d(context, ((N7.b) value).f5936a);
    }
}
