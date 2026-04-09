package N7;

import N7.AbstractC1402w2;
import N7.C1226j7;
import N7.C1403w3;
import org.json.JSONObject;

/* compiled from: DivAnimatorJsonParser.kt */
/* renamed from: N7.y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1430y2 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9812a;

    public C1430y2(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9812a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("color_animator");
        Uc uc = this.f9812a;
        if (zEquals) {
            return new AbstractC1402w2.a(((C1403w3.c) uc.f6755g2.getValue()).a(fVar, jSONObject));
        }
        if (strI.equals("number_animator")) {
            return new AbstractC1402w2.b(((C1226j7.c) uc.f6699b5.getValue()).a(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        B2 b22 = bVarF instanceof B2 ? (B2) bVarF : null;
        if (b22 != null) {
            return ((A2) uc.f6884s1.getValue()).a(fVar, b22, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1402w2 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1402w2.a;
        Uc uc = this.f9812a;
        if (z10) {
            return ((C1403w3.c) uc.f6755g2.getValue()).b(context, ((AbstractC1402w2.a) value).f9657b);
        }
        if (value instanceof AbstractC1402w2.b) {
            return ((C1226j7.c) uc.f6699b5.getValue()).b(context, ((AbstractC1402w2.b) value).f9658b);
        }
        throw new b9.j();
    }
}
