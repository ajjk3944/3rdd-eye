package N7;

import N7.AbstractC1127cc;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* compiled from: DivTypedValueJsonParser.kt */
/* renamed from: N7.ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1097ac implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f7902a;

    public C1097ac(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f7902a = component;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object fVar2;
        Object objA;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        AbstractC1127cc abstractC1127cc = bVar instanceof AbstractC1127cc ? (AbstractC1127cc) bVar : null;
        if (abstractC1127cc != null) {
            if (abstractC1127cc instanceof AbstractC1127cc.g) {
                strI = "string";
            } else if (abstractC1127cc instanceof AbstractC1127cc.e) {
                strI = "integer";
            } else if (abstractC1127cc instanceof AbstractC1127cc.f) {
                strI = "number";
            } else if (abstractC1127cc instanceof AbstractC1127cc.c) {
                strI = "color";
            } else if (abstractC1127cc instanceof AbstractC1127cc.b) {
                strI = "boolean";
            } else if (abstractC1127cc instanceof AbstractC1127cc.h) {
                strI = ImagesContract.URL;
            } else if (abstractC1127cc instanceof AbstractC1127cc.d) {
                strI = "dict";
            } else {
                if (!(abstractC1127cc instanceof AbstractC1127cc.a)) {
                    throw new b9.j();
                }
                strI = "array";
            }
        }
        int iHashCode = strI.hashCode();
        Uc uc = this.f7902a;
        switch (iHashCode) {
            case -1034364087:
                if (strI.equals("number")) {
                    Xc xc = (Xc) uc.f6542M9.getValue();
                    objA = abstractC1127cc != null ? abstractC1127cc.a() : null;
                    xc.getClass();
                    fVar2 = new AbstractC1127cc.f(Xc.d(fVar, (Zc) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case -891985903:
                if (strI.equals("string")) {
                    qd qdVar = (qd) uc.f6669Y9.getValue();
                    objA = abstractC1127cc != null ? abstractC1127cc.a() : null;
                    qdVar.getClass();
                    fVar2 = new AbstractC1127cc.g(qd.d(fVar, (sd) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 116079:
                if (strI.equals(ImagesContract.URL)) {
                    Ad ad = (Ad) uc.f6739ea.getValue();
                    objA = abstractC1127cc != null ? abstractC1127cc.a() : null;
                    ad.getClass();
                    fVar2 = new AbstractC1127cc.h(Ad.d(fVar, (Cd) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 3083190:
                if (strI.equals("dict")) {
                    Q q10 = (Q) uc.f6958z.getValue();
                    objA = abstractC1127cc != null ? abstractC1127cc.a() : null;
                    q10.getClass();
                    fVar2 = new AbstractC1127cc.d(Q.d(fVar, (T) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 64711720:
                if (strI.equals("boolean")) {
                    C1260m c1260m = (C1260m) uc.f6764h.getValue();
                    objA = abstractC1127cc != null ? abstractC1127cc.a() : null;
                    c1260m.getClass();
                    fVar2 = new AbstractC1127cc.b(C1260m.d(fVar, (C1288o) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 93090393:
                if (strI.equals("array")) {
                    C1114c c1114c = (C1114c) uc.f6693b.getValue();
                    objA = abstractC1127cc != null ? abstractC1127cc.a() : null;
                    c1114c.getClass();
                    fVar2 = new AbstractC1127cc.a(C1114c.d(fVar, (C1144e) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 94842723:
                if (strI.equals("color")) {
                    C1399w c1399w = (C1399w) uc.f6829n.getValue();
                    objA = abstractC1127cc != null ? abstractC1127cc.a() : null;
                    c1399w.getClass();
                    fVar2 = new AbstractC1127cc.c(C1399w.d(fVar, (C1427y) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 1958052158:
                if (strI.equals("integer")) {
                    Mc mc = (Mc) uc.G9.getValue();
                    objA = abstractC1127cc != null ? abstractC1127cc.a() : null;
                    mc.getClass();
                    fVar2 = new AbstractC1127cc.e(Mc.d(fVar, (Oc) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            default:
                throw z7.e.l(jSONObject, "type", strI);
        }
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1127cc value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1127cc.g;
        Uc uc = this.f7902a;
        if (z10) {
            ((qd) uc.f6669Y9.getValue()).getClass();
            return qd.e(context, ((AbstractC1127cc.g) value).f8032a);
        }
        if (value instanceof AbstractC1127cc.e) {
            ((Mc) uc.G9.getValue()).getClass();
            return Mc.e(context, ((AbstractC1127cc.e) value).f8030a);
        }
        if (value instanceof AbstractC1127cc.f) {
            ((Xc) uc.f6542M9.getValue()).getClass();
            return Xc.e(context, ((AbstractC1127cc.f) value).f8031a);
        }
        if (value instanceof AbstractC1127cc.c) {
            ((C1399w) uc.f6829n.getValue()).getClass();
            return C1399w.e(context, ((AbstractC1127cc.c) value).f8028a);
        }
        if (value instanceof AbstractC1127cc.b) {
            ((C1260m) uc.f6764h.getValue()).getClass();
            return C1260m.e(context, ((AbstractC1127cc.b) value).f8027a);
        }
        if (value instanceof AbstractC1127cc.h) {
            ((Ad) uc.f6739ea.getValue()).getClass();
            return Ad.e(context, ((AbstractC1127cc.h) value).f8033a);
        }
        if (value instanceof AbstractC1127cc.d) {
            ((Q) uc.f6958z.getValue()).getClass();
            return Q.e(context, ((AbstractC1127cc.d) value).f8029a);
        }
        if (!(value instanceof AbstractC1127cc.a)) {
            throw new b9.j();
        }
        ((C1114c) uc.f6693b.getValue()).getClass();
        return C1114c.e(context, ((AbstractC1127cc.a) value).f8026a);
    }
}
