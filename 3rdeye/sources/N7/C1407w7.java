package N7;

import N7.A7;
import N7.AbstractC1393v7;
import N7.D7;
import org.json.JSONObject;

/* compiled from: DivPageTransformationJsonParser.kt */
/* renamed from: N7.w7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1407w7 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9722a;

    public C1407w7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9722a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        boolean zEquals = strI.equals("slide");
        Uc uc = this.f9722a;
        if (zEquals) {
            ((D7.b) uc.f6835n5.getValue()).getClass();
            return new AbstractC1393v7.b(D7.b.d(fVar, jSONObject));
        }
        if (strI.equals("overlap")) {
            ((A7.b) uc.f6803k5.getValue()).getClass();
            return new AbstractC1393v7.a(A7.b.d(fVar, jSONObject));
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        F7 f72 = bVarF instanceof F7 ? (F7) bVarF : null;
        if (f72 != null) {
            return ((C1435y7) uc.f6888s5.getValue()).a(fVar, f72, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1393v7 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1393v7.b;
        Uc uc = this.f9722a;
        if (z10) {
            ((D7.b) uc.f6835n5.getValue()).getClass();
            return D7.b.e(context, ((AbstractC1393v7.b) value).f9626b);
        }
        if (!(value instanceof AbstractC1393v7.a)) {
            throw new b9.j();
        }
        ((A7.b) uc.f6803k5.getValue()).getClass();
        return A7.b.e(context, ((AbstractC1393v7.a) value).f9625b);
    }
}
