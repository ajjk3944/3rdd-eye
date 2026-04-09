package N7;

import N7.G9;
import N7.W6;
import N7.X4;
import org.json.JSONObject;

/* compiled from: DivSizeJsonParser.kt */
/* loaded from: classes.dex */
public final class E9 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5154a;

    public E9(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5154a = component;
    }

    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object aVar;
        Object objA;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        G9 g92 = bVar instanceof G9 ? (G9) bVar : null;
        if (g92 != null) {
            if (g92 instanceof G9.a) {
                strI = "fixed";
            } else if (g92 instanceof G9.b) {
                strI = "match_parent";
            } else {
                if (!(g92 instanceof G9.c)) {
                    throw new b9.j();
                }
                strI = "wrap_content";
            }
        }
        int iHashCode = strI.hashCode();
        Uc uc = this.f5154a;
        if (iHashCode == 97445748) {
            if (strI.equals("fixed")) {
                X4.c cVar = (X4.c) uc.f6908u3.getValue();
                objA = g92 != null ? g92.a() : null;
                cVar.getClass();
                aVar = new G9.a(X4.c.d(fVar, (Y4) objA, jSONObject));
                return aVar;
            }
            throw z7.e.l(jSONObject, "type", strI);
        }
        if (iHashCode == 343327108) {
            if (strI.equals("wrap_content")) {
                aVar = new G9.c(((C1454zc) uc.r9.getValue()).d(fVar, (Bc) (g92 != null ? g92.a() : null), jSONObject));
                return aVar;
            }
            throw z7.e.l(jSONObject, "type", strI);
        }
        if (iHashCode == 1386124388 && strI.equals("match_parent")) {
            W6.b bVar2 = (W6.b) uc.f6611T4.getValue();
            objA = g92 != null ? g92.a() : null;
            bVar2.getClass();
            aVar = new G9.b(W6.b.d(fVar, (X6) objA, jSONObject));
            return aVar;
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, G9 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof G9.a;
        Uc uc = this.f5154a;
        if (z10) {
            ((X4.c) uc.f6908u3.getValue()).getClass();
            return X4.c.e(context, ((G9.a) value).f5376a);
        }
        if (value instanceof G9.b) {
            ((W6.b) uc.f6611T4.getValue()).getClass();
            return W6.b.e(context, ((G9.b) value).f5377a);
        }
        if (value instanceof G9.c) {
            return ((C1454zc) uc.r9.getValue()).b(context, ((G9.c) value).f5378a);
        }
        throw new b9.j();
    }
}
