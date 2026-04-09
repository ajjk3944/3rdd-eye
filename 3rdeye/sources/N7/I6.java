package N7;

import N7.C1169f9;
import N7.C1225j6;
import N7.C1231jc;
import N7.C1270m9;
import N7.C1335r5;
import N7.C1377u5;
import N7.C1419x5;
import N7.C1445z3;
import N7.C1452za;
import N7.D5;
import N7.Fa;
import N7.I7;
import N7.M5;
import N7.M9;
import N7.S3;
import N7.Wa;
import N7.Y9;
import N7.Z;
import org.json.JSONObject;

/* compiled from: DivJsonParser.kt */
/* loaded from: classes.dex */
public final class I6 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5444a;

    public I6(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5444a = component;
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
        Uc uc = this.f5444a;
        switch (iHashCode) {
            case -1349088399:
                if (strI.equals("custom")) {
                    return new Z.b(((S3.d) uc.f6950y2.getValue()).a(fVar, jSONObject));
                }
                break;
            case -906021636:
                if (strI.equals("select")) {
                    return new Z.j(((C1169f9.f) uc.f6943x6.getValue()).a(fVar, jSONObject));
                }
                break;
            case -899647263:
                if (strI.equals("slider")) {
                    return new Z.l(((M9.d) uc.f6666Y6.getValue()).a(fVar, jSONObject));
                }
                break;
            case -889473228:
                if (strI.equals("switch")) {
                    return new Z.n(((C1452za.d) uc.f6467F7.getValue()).a(fVar, jSONObject));
                }
                break;
            case -711999985:
                if (strI.equals("indicator")) {
                    return new Z.g(((M5.e) uc.f6686a4.getValue()).a(fVar, jSONObject));
                }
                break;
            case -410956671:
                if (strI.equals("container")) {
                    return new Z.a(((C1445z3.h) uc.f6790j2.getValue()).a(fVar, jSONObject));
                }
                break;
            case -196315310:
                if (strI.equals("gallery")) {
                    return new Z.c(((C1335r5.h) uc.f6494I3.getValue()).a(fVar, jSONObject));
                }
                break;
            case 102340:
                if (strI.equals("gif")) {
                    return new Z.d(((C1377u5.g) uc.f6527L3.getValue()).a(fVar, jSONObject));
                }
                break;
            case 3181382:
                if (strI.equals("grid")) {
                    return new Z.e(((C1419x5.f) uc.f6556O3.getValue()).a(fVar, jSONObject));
                }
                break;
            case 3552126:
                if (strI.equals("tabs")) {
                    return new Z.o(((Fa.d) uc.f6498I7.getValue()).a(fVar, jSONObject));
                }
                break;
            case 3556653:
                if (strI.equals("text")) {
                    return new Z.p(((Wa.k) uc.f6848o8.getValue()).a(fVar, jSONObject));
                }
                break;
            case 100313435:
                if (strI.equals("image")) {
                    return new Z.f(((D5.h) uc.f6621U3.getValue()).a(fVar, jSONObject));
                }
                break;
            case 100358090:
                if (strI.equals("input")) {
                    return new Z.h(((C1225j6.k) uc.f6443D4.getValue()).a(fVar, jSONObject));
                }
                break;
            case 106426307:
                if (strI.equals("pager")) {
                    return new Z.i(((I7.g) uc.f6931w5.getValue()).a(fVar, jSONObject));
                }
                break;
            case 109757585:
                if (strI.equals("state")) {
                    return new Z.m(((Y9.e) uc.f6805k7.getValue()).a(fVar, jSONObject));
                }
                break;
            case 112202875:
                if (strI.equals("video")) {
                    return new Z.q(((C1231jc.e) uc.f6807k9.getValue()).a(fVar, jSONObject));
                }
                break;
            case 1732829925:
                if (strI.equals("separator")) {
                    return new Z.k(((C1270m9.d) uc.f6445D6.getValue()).a(fVar, jSONObject));
                }
                break;
        }
        Z6.b bVarF = fVar.c().f(strI, jSONObject);
        Ja ja2 = bVarF instanceof Ja ? (Ja) bVarF : null;
        if (ja2 != null) {
            return ((K6) uc.f6957y9.getValue()).a(fVar, ja2, jSONObject);
        }
        throw z7.e.l(jSONObject, "type", strI);
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Z value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof Z.f;
        Uc uc = this.f5444a;
        if (z10) {
            return ((D5.h) uc.f6621U3.getValue()).b(context, ((Z.f) value).f7818c);
        }
        if (value instanceof Z.d) {
            return ((C1377u5.g) uc.f6527L3.getValue()).b(context, ((Z.d) value).f7816c);
        }
        if (value instanceof Z.p) {
            return ((Wa.k) uc.f6848o8.getValue()).b(context, ((Z.p) value).f7828c);
        }
        if (value instanceof Z.k) {
            return ((C1270m9.d) uc.f6445D6.getValue()).b(context, ((Z.k) value).f7823c);
        }
        if (value instanceof Z.a) {
            return ((C1445z3.h) uc.f6790j2.getValue()).b(context, ((Z.a) value).f7813c);
        }
        if (value instanceof Z.e) {
            return ((C1419x5.f) uc.f6556O3.getValue()).b(context, ((Z.e) value).f7817c);
        }
        if (value instanceof Z.c) {
            return ((C1335r5.h) uc.f6494I3.getValue()).b(context, ((Z.c) value).f7815c);
        }
        if (value instanceof Z.i) {
            return ((I7.g) uc.f6931w5.getValue()).b(context, ((Z.i) value).f7821c);
        }
        if (value instanceof Z.o) {
            return ((Fa.d) uc.f6498I7.getValue()).b(context, ((Z.o) value).f7827c);
        }
        if (value instanceof Z.m) {
            return ((Y9.e) uc.f6805k7.getValue()).b(context, ((Z.m) value).f7825c);
        }
        if (value instanceof Z.b) {
            return ((S3.d) uc.f6950y2.getValue()).b(context, ((Z.b) value).f7814c);
        }
        if (value instanceof Z.g) {
            return ((M5.e) uc.f6686a4.getValue()).b(context, ((Z.g) value).f7819c);
        }
        if (value instanceof Z.l) {
            return ((M9.d) uc.f6666Y6.getValue()).b(context, ((Z.l) value).f7824c);
        }
        if (value instanceof Z.n) {
            return ((C1452za.d) uc.f6467F7.getValue()).b(context, ((Z.n) value).f7826c);
        }
        if (value instanceof Z.h) {
            return ((C1225j6.k) uc.f6443D4.getValue()).b(context, ((Z.h) value).f7820c);
        }
        if (value instanceof Z.j) {
            return ((C1169f9.f) uc.f6943x6.getValue()).b(context, ((Z.j) value).f7822c);
        }
        if (value instanceof Z.q) {
            return ((C1231jc.e) uc.f6807k9.getValue()).b(context, ((Z.q) value).f7829c);
        }
        throw new b9.j();
    }
}
