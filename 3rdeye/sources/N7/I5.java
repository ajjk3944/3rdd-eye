package N7;

import N7.C1104b4;
import N7.C1155ea;
import N7.H5;
import org.json.JSONObject;

/* compiled from: DivIndicatorItemPlacementJsonParser.kt */
/* loaded from: classes.dex */
public final class I5 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5443a;

    public I5(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5443a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("default");
        Uc uc = this.f5443a;
        if (zEquals) {
            return new H5.a(((C1104b4.a) uc.f6473G2.getValue()).a(fVar, jSONObject));
        }
        if (strI.equals("stretch")) {
            return new H5.b(((C1155ea.a) uc.f6869q7.getValue()).a(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        L5 l5 = bVarF instanceof L5 ? (L5) bVarF : null;
        if (l5 != null) {
            return ((K5) uc.f6674Z3.getValue()).a(fVar, l5, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, H5 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof H5.a;
        Uc uc = this.f5443a;
        if (z10) {
            return ((C1104b4.a) uc.f6473G2.getValue()).b(context, ((H5.a) value).f5391b);
        }
        if (value instanceof H5.b) {
            return ((C1155ea.a) uc.f6869q7.getValue()).b(context, ((H5.b) value).f5392b);
        }
        throw new b9.j();
    }
}
