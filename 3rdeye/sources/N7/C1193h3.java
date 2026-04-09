package N7;

import N7.AbstractC1178g3;
import N7.C1103b3;
import N7.C1148e3;
import org.json.JSONObject;

/* compiled from: DivChangeTransitionJsonParser.kt */
/* renamed from: N7.h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1193h3 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8339a;

    public C1193h3(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8339a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("set");
        Uc uc = this.f8339a;
        if (zEquals) {
            return new AbstractC1178g3.b(((C1148e3.a) uc.f6554O1.getValue()).a(fVar, jSONObject));
        }
        if (strI.equals("change_bounds")) {
            ((C1103b3.b) uc.f6525L1.getValue()).getClass();
            return new AbstractC1178g3.a(C1103b3.b.d(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        AbstractC1236k3 abstractC1236k3 = bVarF instanceof AbstractC1236k3 ? (AbstractC1236k3) bVarF : null;
        if (abstractC1236k3 != null) {
            return ((C1222j3) uc.f6608T1.getValue()).a(fVar, abstractC1236k3, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1178g3 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1178g3.b;
        Uc uc = this.f8339a;
        if (z10) {
            return ((C1148e3.a) uc.f6554O1.getValue()).b(context, ((AbstractC1178g3.b) value).f8274b);
        }
        if (!(value instanceof AbstractC1178g3.a)) {
            throw new b9.j();
        }
        ((C1103b3.b) uc.f6525L1.getValue()).getClass();
        return C1103b3.b.e(context, ((AbstractC1178g3.a) value).f8273b);
    }
}
