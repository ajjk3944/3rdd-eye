package N7;

import N7.AbstractC1202hc;
import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONObject;

/* compiled from: DivVariableJsonParser.kt */
/* renamed from: N7.fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1172fc implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8250a;

    public C1172fc(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8250a = component;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        Object fVar2;
        Object objA;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        AbstractC1202hc abstractC1202hc = bVar instanceof AbstractC1202hc ? (AbstractC1202hc) bVar : null;
        if (abstractC1202hc != null) {
            if (abstractC1202hc instanceof AbstractC1202hc.g) {
                strI = "string";
            } else if (abstractC1202hc instanceof AbstractC1202hc.f) {
                strI = "number";
            } else if (abstractC1202hc instanceof AbstractC1202hc.e) {
                strI = "integer";
            } else if (abstractC1202hc instanceof AbstractC1202hc.b) {
                strI = "boolean";
            } else if (abstractC1202hc instanceof AbstractC1202hc.c) {
                strI = "color";
            } else if (abstractC1202hc instanceof AbstractC1202hc.h) {
                strI = ImagesContract.URL;
            } else if (abstractC1202hc instanceof AbstractC1202hc.d) {
                strI = "dict";
            } else {
                if (!(abstractC1202hc instanceof AbstractC1202hc.a)) {
                    throw new b9.j();
                }
                strI = "array";
            }
        }
        int iHashCode = strI.hashCode();
        Uc uc = this.f8250a;
        switch (iHashCode) {
            case -1034364087:
                if (strI.equals("number")) {
                    C1128cd c1128cd = (C1128cd) uc.f6573P9.getValue();
                    objA = abstractC1202hc != null ? abstractC1202hc.a() : null;
                    c1128cd.getClass();
                    fVar2 = new AbstractC1202hc.f(C1128cd.d(fVar, (C1158ed) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case -891985903:
                if (strI.equals("string")) {
                    vd vdVar = (vd) uc.f6704ba.getValue();
                    objA = abstractC1202hc != null ? abstractC1202hc.a() : null;
                    vdVar.getClass();
                    fVar2 = new AbstractC1202hc.g(vd.d(fVar, (xd) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 116079:
                if (strI.equals(ImagesContract.URL)) {
                    Fd fd = (Fd) uc.f6775ha.getValue();
                    objA = abstractC1202hc != null ? abstractC1202hc.a() : null;
                    fd.getClass();
                    fVar2 = new AbstractC1202hc.h(Fd.d(fVar, (Hd) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 3083190:
                if (strI.equals("dict")) {
                    W w10 = (W) uc.f6427C.getValue();
                    objA = abstractC1202hc != null ? abstractC1202hc.a() : null;
                    w10.getClass();
                    fVar2 = new AbstractC1202hc.d(W.d(fVar, (Y) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 64711720:
                if (strI.equals("boolean")) {
                    r rVar = (r) uc.f6797k.getValue();
                    objA = abstractC1202hc != null ? abstractC1202hc.a() : null;
                    rVar.getClass();
                    fVar2 = new AbstractC1202hc.b(r.d(fVar, (C1357t) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 93090393:
                if (strI.equals("array")) {
                    C1189h c1189h = (C1189h) uc.f6729e.getValue();
                    objA = abstractC1202hc != null ? abstractC1202hc.a() : null;
                    c1189h.getClass();
                    fVar2 = new AbstractC1202hc.a(C1189h.d(fVar, (C1218j) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 94842723:
                if (strI.equals("color")) {
                    B b10 = (B) uc.f6861q.getValue();
                    objA = abstractC1202hc != null ? abstractC1202hc.a() : null;
                    b10.getClass();
                    fVar2 = new AbstractC1202hc.c(B.d(fVar, (D) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            case 1958052158:
                if (strI.equals("integer")) {
                    Rc rc = (Rc) uc.f6511J9.getValue();
                    objA = abstractC1202hc != null ? abstractC1202hc.a() : null;
                    rc.getClass();
                    fVar2 = new AbstractC1202hc.e(Rc.d(fVar, (Tc) objA, jSONObject));
                    return fVar2;
                }
                throw z7.e.l(jSONObject, "type", strI);
            default:
                throw z7.e.l(jSONObject, "type", strI);
        }
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1202hc value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1202hc.g;
        Uc uc = this.f8250a;
        if (z10) {
            ((vd) uc.f6704ba.getValue()).getClass();
            return vd.e(context, ((AbstractC1202hc.g) value).f8373a);
        }
        if (value instanceof AbstractC1202hc.f) {
            ((C1128cd) uc.f6573P9.getValue()).getClass();
            return C1128cd.e(context, ((AbstractC1202hc.f) value).f8372a);
        }
        if (value instanceof AbstractC1202hc.e) {
            ((Rc) uc.f6511J9.getValue()).getClass();
            return Rc.e(context, ((AbstractC1202hc.e) value).f8371a);
        }
        if (value instanceof AbstractC1202hc.b) {
            ((r) uc.f6797k.getValue()).getClass();
            return r.e(context, ((AbstractC1202hc.b) value).f8368a);
        }
        if (value instanceof AbstractC1202hc.c) {
            ((B) uc.f6861q.getValue()).getClass();
            return B.e(context, ((AbstractC1202hc.c) value).f8369a);
        }
        if (value instanceof AbstractC1202hc.h) {
            ((Fd) uc.f6775ha.getValue()).getClass();
            return Fd.e(context, ((AbstractC1202hc.h) value).f8374a);
        }
        if (value instanceof AbstractC1202hc.d) {
            ((W) uc.f6427C.getValue()).getClass();
            return W.e(context, ((AbstractC1202hc.d) value).f8370a);
        }
        if (!(value instanceof AbstractC1202hc.a)) {
            throw new b9.j();
        }
        ((C1189h) uc.f6729e.getValue()).getClass();
        return C1189h.e(context, ((AbstractC1202hc.a) value).f8367a);
    }
}
