package N7;

import N7.C1109b9;
import N7.D2;
import N7.D4;
import N7.J2;
import N7.J9;
import org.json.JSONObject;

/* compiled from: DivAppearanceTransitionJsonParser.kt */
/* loaded from: classes.dex */
public final class H2 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5385a;

    public H2(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5385a = component;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object cVar;
        Object objA;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        J2 j22 = bVar instanceof J2 ? (J2) bVar : null;
        if (j22 != null) {
            if (j22 instanceof J2.c) {
                strI = "set";
            } else if (j22 instanceof J2.a) {
                strI = "fade";
            } else if (j22 instanceof J2.b) {
                strI = "scale";
            } else {
                if (!(j22 instanceof J2.d)) {
                    throw new b9.j();
                }
                strI = "slide";
            }
        }
        int iHashCode = strI.hashCode();
        Uc uc = this.f5385a;
        switch (iHashCode) {
            case 113762:
                if (strI.equals("set")) {
                    cVar = new J2.c(((D2.b) uc.f6906u1.getValue()).d(fVar, (E2) (j22 != null ? j22.a() : null), jSONObject));
                    return cVar;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 3135100:
                if (strI.equals("fade")) {
                    D4.c cVar2 = (D4.c) uc.f6709c3.getValue();
                    objA = j22 != null ? j22.a() : null;
                    cVar2.getClass();
                    cVar = new J2.a(D4.c.d(fVar, (E4) objA, jSONObject));
                    return cVar;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 109250890:
                if (strI.equals("scale")) {
                    C1109b9.c cVar3 = (C1109b9.c) uc.f6921v6.getValue();
                    objA = j22 != null ? j22.a() : null;
                    cVar3.getClass();
                    cVar = new J2.b(C1109b9.c.d(fVar, (C1124c9) objA, jSONObject));
                    return cVar;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 109526449:
                if (strI.equals("slide")) {
                    cVar = new J2.d(((J9.d) uc.f6645W6.getValue()).d(fVar, (K9) (j22 != null ? j22.a() : null), jSONObject));
                    return cVar;
                }
                throw z7.e.l(jSONObject, "type", strI);
            default:
                throw z7.e.l(jSONObject, "type", strI);
        }
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, J2 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof J2.c;
        Uc uc = this.f5385a;
        if (z10) {
            return ((D2.b) uc.f6906u1.getValue()).b(context, ((J2.c) value).f5566a);
        }
        if (value instanceof J2.a) {
            ((D4.c) uc.f6709c3.getValue()).getClass();
            return D4.c.e(context, ((J2.a) value).f5564a);
        }
        if (value instanceof J2.b) {
            ((C1109b9.c) uc.f6921v6.getValue()).getClass();
            return C1109b9.c.e(context, ((J2.b) value).f5565a);
        }
        if (value instanceof J2.d) {
            return ((J9.d) uc.f6645W6.getValue()).b(context, ((J2.d) value).f5567a);
        }
        throw new b9.j();
    }
}
