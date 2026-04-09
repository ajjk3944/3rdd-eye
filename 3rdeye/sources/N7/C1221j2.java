package N7;

import N7.A1;
import N7.AbstractC1249l2;
import N7.C1162f2;
import N7.C1205i0;
import N7.C1277n2;
import N7.C1345s1;
import N7.D1;
import org.json.JSONObject;

/* compiled from: DivActionTypedJsonParser.kt */
/* renamed from: N7.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221j2 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8480a;

    public C1221j2(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8480a = component;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) {
        String str;
        Object pVar;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        AbstractC1249l2 abstractC1249l2 = bVar instanceof AbstractC1249l2 ? (AbstractC1249l2) bVar : null;
        if (abstractC1249l2 == null) {
            str = strI;
        } else if (abstractC1249l2 instanceof AbstractC1249l2.a) {
            str = "animator_start";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.b) {
            str = "animator_stop";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.c) {
            str = "array_insert_value";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.d) {
            str = "array_remove_value";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.e) {
            str = "array_set_value";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.f) {
            str = "clear_focus";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.g) {
            str = "copy_to_clipboard";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.h) {
            str = "dict_set_value";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.i) {
            str = com.vungle.ads.internal.presenter.h.DOWNLOAD;
        } else if (abstractC1249l2 instanceof AbstractC1249l2.j) {
            str = "focus_element";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.k) {
            str = "hide_tooltip";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.l) {
            str = "scroll_by";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.m) {
            str = "scroll_to";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.n) {
            str = "set_state";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.o) {
            str = "set_stored_value";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.p) {
            str = "set_variable";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.q) {
            str = "show_tooltip";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.r) {
            str = "submit";
        } else if (abstractC1249l2 instanceof AbstractC1249l2.s) {
            str = "timer";
        } else {
            if (!(abstractC1249l2 instanceof AbstractC1249l2.t)) {
                throw new b9.j();
            }
            str = "video";
        }
        int iHashCode = str.hashCode();
        AbstractC1249l2 abstractC1249l22 = abstractC1249l2;
        Uc uc = this.f8480a;
        switch (iHashCode) {
            case -1623648839:
                if (str.equals("set_variable")) {
                    pVar = new AbstractC1249l2.p(((M1) uc.f6513K0.getValue()).d(fVar, (O1) (abstractC1249l22 != null ? abstractC1249l22.a() : null), jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case -1623635702:
                if (str.equals("animator_start")) {
                    pVar = new AbstractC1249l2.a(((C1205i0.d) uc.f6523L.getValue()).d(fVar, (C1219j0) (abstractC1249l22 != null ? abstractC1249l22.a() : null), jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case -1254965146:
                if (str.equals("clear_focus")) {
                    G0 g02 = (G0) uc.f6682a0.getValue();
                    g02.getClass();
                    pVar = new AbstractC1249l2.f(new I0());
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case -1160753574:
                if (str.equals("animator_stop")) {
                    C1261m0 c1261m0 = (C1261m0) uc.f6552O.getValue();
                    Object objA = abstractC1249l22 != null ? abstractC1249l22.a() : null;
                    c1261m0.getClass();
                    pVar = new AbstractC1249l2.b(C1261m0.d(fVar, (C1289o0) objA, jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case -891535336:
                if (str.equals("submit")) {
                    pVar = new AbstractC1249l2.r(((W1) uc.f6575Q0.getValue()).d(fVar, (C1117c2) (abstractC1249l22 != null ? abstractC1249l22.a() : null), jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case -796594542:
                if (str.equals("set_stored_value")) {
                    pVar = new AbstractC1249l2.o(((H1) uc.f6480H0.getValue()).d(fVar, (J1) (abstractC1249l22 != null ? abstractC1249l22.a() : null), jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case -404256420:
                if (str.equals("copy_to_clipboard")) {
                    pVar = new AbstractC1249l2.g(((Q0) uc.f6753g0.getValue()).d(fVar, (S0) (abstractC1249l22 != null ? abstractC1249l22.a() : null), jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case 10055918:
                if (str.equals("array_set_value")) {
                    pVar = new AbstractC1249l2.e(((B0) uc.f6649X.getValue()).d(fVar, (D0) (abstractC1249l22 != null ? abstractC1249l22.a() : null), jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case 110364485:
                if (str.equals("timer")) {
                    C1162f2.c cVar = (C1162f2.c) uc.f6671Z0.getValue();
                    Object objA2 = abstractC1249l22 != null ? abstractC1249l22.a() : null;
                    cVar.getClass();
                    pVar = new AbstractC1249l2.s(C1162f2.c.d(fVar, (C1177g2) objA2, jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case 112202875:
                if (str.equals("video")) {
                    C1277n2.c cVar2 = (C1277n2.c) uc.f6742f1.getValue();
                    Object objA3 = abstractC1249l22 != null ? abstractC1249l22.a() : null;
                    cVar2.getClass();
                    pVar = new AbstractC1249l2.t(C1277n2.c.d(fVar, (C1291o2) objA3, jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case 203934236:
                if (str.equals("array_remove_value")) {
                    C1400w0 c1400w0 = (C1400w0) uc.f6617U.getValue();
                    Object objA4 = abstractC1249l22 != null ? abstractC1249l22.a() : null;
                    c1400w0.getClass();
                    pVar = new AbstractC1249l2.d(C1400w0.d(fVar, (C1428y0) objA4, jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case 301532353:
                if (str.equals("show_tooltip")) {
                    R1 r12 = (R1) uc.f6544N0.getValue();
                    Object objA5 = abstractC1249l22 != null ? abstractC1249l22.a() : null;
                    r12.getClass();
                    pVar = new AbstractC1249l2.q(R1.d(fVar, (T1) objA5, jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case 417790729:
                if (str.equals("scroll_by")) {
                    C1345s1.c cVar3 = (C1345s1.c) uc.f6915v0.getValue();
                    Object objA6 = abstractC1249l22 != null ? abstractC1249l22.a() : null;
                    cVar3.getClass();
                    pVar = new AbstractC1249l2.l(C1345s1.c.d(fVar, (C1359t1) objA6, jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case 417791277:
                if (str.equals("scroll_to")) {
                    pVar = new AbstractC1249l2.m(((A1.b) uc.f6417B0.getValue()).d(fVar, (B1) (abstractC1249l22 != null ? abstractC1249l22.a() : null), jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case 932090484:
                if (str.equals("set_state")) {
                    D1.b bVar2 = (D1.b) uc.f6450E0.getValue();
                    Object objA7 = abstractC1249l22 != null ? abstractC1249l22.a() : null;
                    bVar2.getClass();
                    pVar = new AbstractC1249l2.n(D1.b.d(fVar, (E1) objA7, jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case 1427818632:
                if (str.equals(com.vungle.ads.internal.presenter.h.DOWNLOAD)) {
                    pVar = new AbstractC1249l2.i(((C1086a1) uc.f6819m0.getValue()).d(fVar, (C1116c1) (abstractC1249l22 != null ? abstractC1249l22.a() : null), jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case 1550697109:
                if (str.equals("focus_element")) {
                    C1161f1 c1161f1 = (C1161f1) uc.f6851p0.getValue();
                    Object objA8 = abstractC1249l22 != null ? abstractC1249l22.a() : null;
                    c1161f1.getClass();
                    pVar = new AbstractC1249l2.j(C1161f1.d(fVar, (C1191h1) objA8, jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case 1587919371:
                if (str.equals("dict_set_value")) {
                    pVar = new AbstractC1249l2.h(((V0) uc.f6788j0.getValue()).d(fVar, (X0) (abstractC1249l22 != null ? abstractC1249l22.a() : null), jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case 1715728902:
                if (str.equals("hide_tooltip")) {
                    C1234k1 c1234k1 = (C1234k1) uc.f6883s0.getValue();
                    Object objA9 = abstractC1249l22 != null ? abstractC1249l22.a() : null;
                    c1234k1.getClass();
                    pVar = new AbstractC1249l2.k(C1234k1.d(fVar, (C1262m1) objA9, jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            case 1811437713:
                if (str.equals("array_insert_value")) {
                    pVar = new AbstractC1249l2.c(((C1330r0) uc.f6584R.getValue()).d(fVar, (C1358t0) (abstractC1249l22 != null ? abstractC1249l22.a() : null), jSONObject));
                    return pVar;
                }
                throw z7.e.l(jSONObject, "type", str);
            default:
                throw z7.e.l(jSONObject, "type", str);
        }
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1249l2 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1249l2.a;
        Uc uc = this.f8480a;
        if (z10) {
            return ((C1205i0.d) uc.f6523L.getValue()).b(context, ((AbstractC1249l2.a) value).f8706a);
        }
        if (value instanceof AbstractC1249l2.b) {
            ((C1261m0) uc.f6552O.getValue()).getClass();
            return C1261m0.e(context, ((AbstractC1249l2.b) value).f8707a);
        }
        if (value instanceof AbstractC1249l2.c) {
            return ((C1330r0) uc.f6584R.getValue()).b(context, ((AbstractC1249l2.c) value).f8708a);
        }
        if (value instanceof AbstractC1249l2.d) {
            ((C1400w0) uc.f6617U.getValue()).getClass();
            return C1400w0.e(context, ((AbstractC1249l2.d) value).f8709a);
        }
        if (value instanceof AbstractC1249l2.e) {
            return ((B0) uc.f6649X.getValue()).b(context, ((AbstractC1249l2.e) value).f8710a);
        }
        if (value instanceof AbstractC1249l2.f) {
            ((G0) uc.f6682a0.getValue()).getClass();
            return G0.d(context, ((AbstractC1249l2.f) value).f8711a);
        }
        if (value instanceof AbstractC1249l2.g) {
            return ((Q0) uc.f6753g0.getValue()).b(context, ((AbstractC1249l2.g) value).f8712a);
        }
        if (value instanceof AbstractC1249l2.h) {
            return ((V0) uc.f6788j0.getValue()).b(context, ((AbstractC1249l2.h) value).f8713a);
        }
        if (value instanceof AbstractC1249l2.i) {
            return ((C1086a1) uc.f6819m0.getValue()).b(context, ((AbstractC1249l2.i) value).f8714a);
        }
        if (value instanceof AbstractC1249l2.j) {
            ((C1161f1) uc.f6851p0.getValue()).getClass();
            return C1161f1.e(context, ((AbstractC1249l2.j) value).f8715a);
        }
        if (value instanceof AbstractC1249l2.k) {
            ((C1234k1) uc.f6883s0.getValue()).getClass();
            return C1234k1.e(context, ((AbstractC1249l2.k) value).f8716a);
        }
        if (value instanceof AbstractC1249l2.l) {
            ((C1345s1.c) uc.f6915v0.getValue()).getClass();
            return C1345s1.c.e(context, ((AbstractC1249l2.l) value).f8717a);
        }
        if (value instanceof AbstractC1249l2.m) {
            return ((A1.b) uc.f6417B0.getValue()).b(context, ((AbstractC1249l2.m) value).f8718a);
        }
        if (value instanceof AbstractC1249l2.n) {
            ((D1.b) uc.f6450E0.getValue()).getClass();
            return D1.b.e(context, ((AbstractC1249l2.n) value).f8719a);
        }
        if (value instanceof AbstractC1249l2.o) {
            return ((H1) uc.f6480H0.getValue()).b(context, ((AbstractC1249l2.o) value).f8720a);
        }
        if (value instanceof AbstractC1249l2.p) {
            return ((M1) uc.f6513K0.getValue()).b(context, ((AbstractC1249l2.p) value).f8721a);
        }
        if (value instanceof AbstractC1249l2.q) {
            ((R1) uc.f6544N0.getValue()).getClass();
            return R1.e(context, ((AbstractC1249l2.q) value).f8722a);
        }
        if (value instanceof AbstractC1249l2.r) {
            return ((W1) uc.f6575Q0.getValue()).b(context, ((AbstractC1249l2.r) value).f8723a);
        }
        if (value instanceof AbstractC1249l2.s) {
            ((C1162f2.c) uc.f6671Z0.getValue()).getClass();
            return C1162f2.c.e(context, ((AbstractC1249l2.s) value).f8724a);
        }
        if (!(value instanceof AbstractC1249l2.t)) {
            throw new b9.j();
        }
        ((C1277n2.c) uc.f6742f1.getValue()).getClass();
        return C1277n2.c.e(context, ((AbstractC1249l2.t) value).f8725a);
    }
}
