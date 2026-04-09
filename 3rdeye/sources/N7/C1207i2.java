package N7;

import N7.A1;
import N7.AbstractC1192h2;
import N7.C1162f2;
import N7.C1205i0;
import N7.C1277n2;
import N7.C1345s1;
import N7.D1;
import org.json.JSONObject;

/* compiled from: DivActionTypedJsonParser.kt */
/* renamed from: N7.i2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1207i2 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f8387a;

    public C1207i2(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f8387a = component;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // D7.b
    public final Object a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        int iHashCode = strI.hashCode();
        Uc uc = this.f8387a;
        switch (iHashCode) {
            case -1623648839:
                if (strI.equals("set_variable")) {
                    return new AbstractC1192h2.p(((L1) uc.f6502J0.getValue()).a(fVar, jSONObject));
                }
                break;
            case -1623635702:
                if (strI.equals("animator_start")) {
                    return new AbstractC1192h2.a(((C1205i0.c) uc.f6512K.getValue()).a(fVar, jSONObject));
                }
                break;
            case -1254965146:
                if (strI.equals("clear_focus")) {
                    ((F0) uc.f6670Z.getValue()).getClass();
                    return new AbstractC1192h2.f(new E0());
                }
                break;
            case -1160753574:
                if (strI.equals("animator_stop")) {
                    ((C1247l0) uc.f6543N.getValue()).getClass();
                    return new AbstractC1192h2.b(C1247l0.d(fVar, jSONObject));
                }
                break;
            case -891535336:
                if (strI.equals("submit")) {
                    return new AbstractC1192h2.r(((V1) uc.f6564P0.getValue()).a(fVar, jSONObject));
                }
                break;
            case -796594542:
                if (strI.equals("set_stored_value")) {
                    return new AbstractC1192h2.o(((G1) uc.f6471G0.getValue()).a(fVar, jSONObject));
                }
                break;
            case -404256420:
                if (strI.equals("copy_to_clipboard")) {
                    return new AbstractC1192h2.g(((P0) uc.f6741f0.getValue()).a(fVar, jSONObject));
                }
                break;
            case 10055918:
                if (strI.equals("array_set_value")) {
                    return new AbstractC1192h2.e(((A0) uc.f6638W.getValue()).a(fVar, jSONObject));
                }
                break;
            case 110364485:
                if (strI.equals("timer")) {
                    ((C1162f2.b) uc.f6660Y0.getValue()).getClass();
                    return new AbstractC1192h2.s(C1162f2.b.d(fVar, jSONObject));
                }
                break;
            case 112202875:
                if (strI.equals("video")) {
                    ((C1277n2.b) uc.f6731e1.getValue()).getClass();
                    return new AbstractC1192h2.t(C1277n2.b.d(fVar, jSONObject));
                }
                break;
            case 203934236:
                if (strI.equals("array_remove_value")) {
                    ((C1386v0) uc.f6606T.getValue()).getClass();
                    return new AbstractC1192h2.d(C1386v0.d(fVar, jSONObject));
                }
                break;
            case 301532353:
                if (strI.equals("show_tooltip")) {
                    ((Q1) uc.f6533M0.getValue()).getClass();
                    return new AbstractC1192h2.q(Q1.d(fVar, jSONObject));
                }
                break;
            case 417790729:
                if (strI.equals("scroll_by")) {
                    ((C1345s1.b) uc.f6905u0.getValue()).getClass();
                    return new AbstractC1192h2.l(C1345s1.b.d(fVar, jSONObject));
                }
                break;
            case 417791277:
                if (strI.equals("scroll_to")) {
                    return new AbstractC1192h2.m(((A1.a) uc.f6406A0.getValue()).a(fVar, jSONObject));
                }
                break;
            case 932090484:
                if (strI.equals("set_state")) {
                    ((D1.a) uc.f6439D0.getValue()).getClass();
                    return new AbstractC1192h2.n(D1.a.d(fVar, jSONObject));
                }
                break;
            case 1427818632:
                if (strI.equals(com.vungle.ads.internal.presenter.h.DOWNLOAD)) {
                    return new AbstractC1192h2.i(((Z0) uc.f6809l0.getValue()).a(fVar, jSONObject));
                }
                break;
            case 1550697109:
                if (strI.equals("focus_element")) {
                    ((C1146e1) uc.f6840o0.getValue()).getClass();
                    return new AbstractC1192h2.j(C1146e1.d(fVar, jSONObject));
                }
                break;
            case 1587919371:
                if (strI.equals("dict_set_value")) {
                    return new AbstractC1192h2.h(((U0) uc.f6776i0.getValue()).a(fVar, jSONObject));
                }
                break;
            case 1715728902:
                if (strI.equals("hide_tooltip")) {
                    ((C1220j1) uc.f6873r0.getValue()).getClass();
                    return new AbstractC1192h2.k(C1220j1.d(fVar, jSONObject));
                }
                break;
            case 1811437713:
                if (strI.equals("array_insert_value")) {
                    return new AbstractC1192h2.c(((C1317q0) uc.f6574Q.getValue()).a(fVar, jSONObject));
                }
                break;
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        AbstractC1249l2 abstractC1249l2 = bVarF instanceof AbstractC1249l2 ? (AbstractC1249l2) bVarF : null;
        if (abstractC1249l2 != null) {
            return ((C1235k2) uc.f6719d1.getValue()).a(fVar, abstractC1249l2, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1192h2 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1192h2.a;
        Uc uc = this.f8387a;
        if (z10) {
            return ((C1205i0.c) uc.f6512K.getValue()).b(context, ((AbstractC1192h2.a) value).f8319b);
        }
        if (value instanceof AbstractC1192h2.b) {
            ((C1247l0) uc.f6543N.getValue()).getClass();
            return C1247l0.e(context, ((AbstractC1192h2.b) value).f8320b);
        }
        if (value instanceof AbstractC1192h2.c) {
            return ((C1317q0) uc.f6574Q.getValue()).b(context, ((AbstractC1192h2.c) value).f8321b);
        }
        if (value instanceof AbstractC1192h2.d) {
            ((C1386v0) uc.f6606T.getValue()).getClass();
            return C1386v0.e(context, ((AbstractC1192h2.d) value).f8322b);
        }
        if (value instanceof AbstractC1192h2.e) {
            return ((A0) uc.f6638W.getValue()).b(context, ((AbstractC1192h2.e) value).f8323b);
        }
        if (value instanceof AbstractC1192h2.f) {
            ((F0) uc.f6670Z.getValue()).getClass();
            return F0.d(context, ((AbstractC1192h2.f) value).f8324b);
        }
        if (value instanceof AbstractC1192h2.g) {
            return ((P0) uc.f6741f0.getValue()).b(context, ((AbstractC1192h2.g) value).f8325b);
        }
        if (value instanceof AbstractC1192h2.h) {
            return ((U0) uc.f6776i0.getValue()).b(context, ((AbstractC1192h2.h) value).f8326b);
        }
        if (value instanceof AbstractC1192h2.i) {
            return ((Z0) uc.f6809l0.getValue()).b(context, ((AbstractC1192h2.i) value).f8327b);
        }
        if (value instanceof AbstractC1192h2.j) {
            ((C1146e1) uc.f6840o0.getValue()).getClass();
            return C1146e1.e(context, ((AbstractC1192h2.j) value).f8328b);
        }
        if (value instanceof AbstractC1192h2.k) {
            ((C1220j1) uc.f6873r0.getValue()).getClass();
            return C1220j1.e(context, ((AbstractC1192h2.k) value).f8329b);
        }
        if (value instanceof AbstractC1192h2.l) {
            ((C1345s1.b) uc.f6905u0.getValue()).getClass();
            return C1345s1.b.e(context, ((AbstractC1192h2.l) value).f8330b);
        }
        if (value instanceof AbstractC1192h2.m) {
            return ((A1.a) uc.f6406A0.getValue()).b(context, ((AbstractC1192h2.m) value).f8331b);
        }
        if (value instanceof AbstractC1192h2.n) {
            ((D1.a) uc.f6439D0.getValue()).getClass();
            return D1.a.e(context, ((AbstractC1192h2.n) value).f8332b);
        }
        if (value instanceof AbstractC1192h2.o) {
            return ((G1) uc.f6471G0.getValue()).b(context, ((AbstractC1192h2.o) value).f8333b);
        }
        if (value instanceof AbstractC1192h2.p) {
            return ((L1) uc.f6502J0.getValue()).b(context, ((AbstractC1192h2.p) value).f8334b);
        }
        if (value instanceof AbstractC1192h2.q) {
            ((Q1) uc.f6533M0.getValue()).getClass();
            return Q1.e(context, ((AbstractC1192h2.q) value).f8335b);
        }
        if (value instanceof AbstractC1192h2.r) {
            return ((V1) uc.f6564P0.getValue()).b(context, ((AbstractC1192h2.r) value).f8336b);
        }
        if (value instanceof AbstractC1192h2.s) {
            ((C1162f2.b) uc.f6660Y0.getValue()).getClass();
            return C1162f2.b.e(context, ((AbstractC1192h2.s) value).f8337b);
        }
        if (!(value instanceof AbstractC1192h2.t)) {
            throw new b9.j();
        }
        ((C1277n2.b) uc.f6731e1.getValue()).getClass();
        return C1277n2.b.e(context, ((AbstractC1192h2.t) value).f8338b);
    }
}
