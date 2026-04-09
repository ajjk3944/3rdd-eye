package N7;

import N7.AbstractC1293o4;
import org.json.JSONObject;

/* compiled from: DivDrawableJsonParser.kt */
/* renamed from: N7.p4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1307p4 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8893a;

    public C1307p4(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8893a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("shape_drawable");
        Uc uc = this.f8893a;
        if (zEquals) {
            return new AbstractC1293o4.a(((C1367t9) uc.f6539M6.getValue()).a(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        AbstractC1348s4 abstractC1348s4 = bVarF instanceof AbstractC1348s4 ? (AbstractC1348s4) bVarF : null;
        if (abstractC1348s4 != null) {
            return ((C1334r4) uc.f6620U2.getValue()).a(fVar, abstractC1348s4, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1293o4 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        if (value instanceof AbstractC1293o4.a) {
            return ((C1367t9) this.f8893a.f6539M6.getValue()).b(context, ((AbstractC1293o4.a) value).f8855b);
        }
        throw new b9.j();
    }
}
