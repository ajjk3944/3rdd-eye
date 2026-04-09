package N7;

import N7.AbstractC1429y1;
import N7.C1188gd;
import N7.Ic;
import org.json.JSONObject;

/* compiled from: DivActionScrollDestinationJsonParser.kt */
/* renamed from: N7.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1401w1 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9655a;

    public C1401w1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9655a = component;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object cVar;
        Object objA;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        AbstractC1429y1 abstractC1429y1 = bVar instanceof AbstractC1429y1 ? (AbstractC1429y1) bVar : null;
        if (abstractC1429y1 != null) {
            if (abstractC1429y1 instanceof AbstractC1429y1.c) {
                strI = "offset";
            } else if (abstractC1429y1 instanceof AbstractC1429y1.b) {
                strI = "index";
            } else if (abstractC1429y1 instanceof AbstractC1429y1.d) {
                strI = "start";
            } else {
                if (!(abstractC1429y1 instanceof AbstractC1429y1.a)) {
                    throw new b9.j();
                }
                strI = "end";
            }
        }
        int iHashCode = strI.hashCode();
        Uc uc = this.f9655a;
        switch (iHashCode) {
            case -1019779949:
                if (strI.equals("offset")) {
                    C1188gd.b bVar2 = (C1188gd.b) uc.f6605S9.getValue();
                    objA = abstractC1429y1 != null ? abstractC1429y1.a() : null;
                    bVar2.getClass();
                    cVar = new AbstractC1429y1.c(C1188gd.b.d(fVar, (C1203hd) objA, jSONObject));
                    return cVar;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 100571:
                if (strI.equals("end")) {
                    Ec ec = (Ec) uc.f6415A9.getValue();
                    ec.getClass();
                    return new AbstractC1429y1.a(new Gc());
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 100346066:
                if (strI.equals("index")) {
                    Ic.b bVar3 = (Ic.b) uc.f6448D9.getValue();
                    objA = abstractC1429y1 != null ? abstractC1429y1.a() : null;
                    bVar3.getClass();
                    cVar = new AbstractC1429y1.b(Ic.b.d(fVar, (Jc) objA, jSONObject));
                    return cVar;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 109757538:
                if (strI.equals("start")) {
                    ld ldVar = (ld) uc.f6637V9.getValue();
                    ldVar.getClass();
                    return new AbstractC1429y1.d(new nd());
                }
                throw z7.e.l(jSONObject, "type", strI);
            default:
                throw z7.e.l(jSONObject, "type", strI);
        }
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1429y1 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1429y1.c;
        Uc uc = this.f9655a;
        if (z10) {
            ((C1188gd.b) uc.f6605S9.getValue()).getClass();
            return C1188gd.b.e(context, ((AbstractC1429y1.c) value).f9810a);
        }
        if (value instanceof AbstractC1429y1.b) {
            ((Ic.b) uc.f6448D9.getValue()).getClass();
            return Ic.b.e(context, ((AbstractC1429y1.b) value).f9809a);
        }
        if (value instanceof AbstractC1429y1.d) {
            ((ld) uc.f6637V9.getValue()).getClass();
            return ld.d(context, ((AbstractC1429y1.d) value).f9811a);
        }
        if (!(value instanceof AbstractC1429y1.a)) {
            throw new b9.j();
        }
        ((Ec) uc.f6415A9.getValue()).getClass();
        return Ec.d(context, ((AbstractC1429y1.a) value).f9808a);
    }
}
