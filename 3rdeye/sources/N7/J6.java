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
import N7.Ja;
import N7.M5;
import N7.M9;
import N7.S3;
import N7.Wa;
import N7.Y9;
import org.json.JSONObject;

/* compiled from: DivJsonParser.kt */
/* loaded from: classes.dex */
public final class J6 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5571a;

    public J6(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5571a = component;
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
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Ja a(D7.f fVar, JSONObject jSONObject) throws z7.d {
        String str;
        String strI = B4.i.i(fVar, "context", jSONObject, "data", jSONObject);
        Z6.b bVar = fVar.c().get(strI);
        Ja ja2 = bVar instanceof Ja ? (Ja) bVar : null;
        if (ja2 == null) {
            str = strI;
        } else if (ja2 instanceof Ja.f) {
            str = "image";
        } else if (ja2 instanceof Ja.d) {
            str = "gif";
        } else if (ja2 instanceof Ja.p) {
            str = "text";
        } else if (ja2 instanceof Ja.k) {
            str = "separator";
        } else if (ja2 instanceof Ja.a) {
            str = "container";
        } else if (ja2 instanceof Ja.e) {
            str = "grid";
        } else if (ja2 instanceof Ja.c) {
            str = "gallery";
        } else if (ja2 instanceof Ja.i) {
            str = "pager";
        } else if (ja2 instanceof Ja.o) {
            str = "tabs";
        } else if (ja2 instanceof Ja.m) {
            str = "state";
        } else if (ja2 instanceof Ja.b) {
            str = "custom";
        } else if (ja2 instanceof Ja.g) {
            str = "indicator";
        } else if (ja2 instanceof Ja.l) {
            str = "slider";
        } else if (ja2 instanceof Ja.n) {
            str = "switch";
        } else if (ja2 instanceof Ja.h) {
            str = "input";
        } else if (ja2 instanceof Ja.j) {
            str = "select";
        } else {
            if (!(ja2 instanceof Ja.q)) {
                throw new b9.j();
            }
            str = "video";
        }
        int iHashCode = str.hashCode();
        Ja ja3 = ja2;
        Uc uc = this.f5571a;
        switch (iHashCode) {
            case -1349088399:
                if (str.equals("custom")) {
                    return new Ja.b(((S3.e) uc.f6961z2.getValue()).d(fVar, (T3) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case -906021636:
                if (str.equals("select")) {
                    return new Ja.j(((C1169f9.g) uc.f6954y6.getValue()).d(fVar, (C1228j9) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case -899647263:
                if (str.equals("slider")) {
                    return new Ja.l(((M9.e) uc.f6677Z6.getValue()).d(fVar, (Q9) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case -889473228:
                if (str.equals("switch")) {
                    return new Ja.n(((C1452za.e) uc.G7.getValue()).d(fVar, (Aa) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case -711999985:
                if (str.equals("indicator")) {
                    return new Ja.g(((M5.f) uc.f6698b4.getValue()).d(fVar, (N5) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case -410956671:
                if (str.equals("container")) {
                    return new Ja.a(((C1445z3.i) uc.f6800k2.getValue()).d(fVar, (B3) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case -196315310:
                if (str.equals("gallery")) {
                    return new Ja.c(((C1335r5.i) uc.f6505J3.getValue()).d(fVar, (C1349s5) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case 102340:
                if (str.equals("gif")) {
                    return new Ja.d(((C1377u5.h) uc.f6536M3.getValue()).d(fVar, (C1391v5) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case 3181382:
                if (str.equals("grid")) {
                    return new Ja.e(((C1419x5.g) uc.f6567P3.getValue()).d(fVar, (C1433y5) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case 3552126:
                if (str.equals("tabs")) {
                    return new Ja.o(((Fa.e) uc.f6509J7.getValue()).d(fVar, (Ia) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    return new Ja.p(((Wa.l) uc.f6859p8.getValue()).d(fVar, (C1383ub) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    return new Ja.f(((D5.i) uc.f6631V3.getValue()).d(fVar, (F5) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case 100358090:
                if (str.equals("input")) {
                    return new Ja.h(((C1225j6.l) uc.f6454E4.getValue()).d(fVar, (C1364t6) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case 106426307:
                if (str.equals("pager")) {
                    return new Ja.i(((I7.h) uc.f6942x5.getValue()).d(fVar, (O7) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case 109757585:
                if (str.equals("state")) {
                    return new Ja.m(((Y9.f) uc.f6815l7.getValue()).d(fVar, (C1125ca) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    return new Ja.q(((C1231jc.f) uc.f6817l9.getValue()).d(fVar, (C1342rc) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
            case 1732829925:
                if (str.equals("separator")) {
                    return new Ja.k(((C1270m9.e) uc.f6456E6.getValue()).d(fVar, (C1284n9) (ja3 != null ? ja3.a() : null), jSONObject));
                }
                break;
        }
        throw z7.e.l(jSONObject, "type", str);
    }

    @Override // D7.h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, Ja value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof Ja.f;
        Uc uc = this.f5571a;
        if (z10) {
            return ((D5.i) uc.f6631V3.getValue()).b(context, ((Ja.f) value).f5595a);
        }
        if (value instanceof Ja.d) {
            return ((C1377u5.h) uc.f6536M3.getValue()).b(context, ((Ja.d) value).f5593a);
        }
        if (value instanceof Ja.p) {
            return ((Wa.l) uc.f6859p8.getValue()).b(context, ((Ja.p) value).f5605a);
        }
        if (value instanceof Ja.k) {
            return ((C1270m9.e) uc.f6456E6.getValue()).b(context, ((Ja.k) value).f5600a);
        }
        if (value instanceof Ja.a) {
            return ((C1445z3.i) uc.f6800k2.getValue()).b(context, ((Ja.a) value).f5590a);
        }
        if (value instanceof Ja.e) {
            return ((C1419x5.g) uc.f6567P3.getValue()).b(context, ((Ja.e) value).f5594a);
        }
        if (value instanceof Ja.c) {
            return ((C1335r5.i) uc.f6505J3.getValue()).b(context, ((Ja.c) value).f5592a);
        }
        if (value instanceof Ja.i) {
            return ((I7.h) uc.f6942x5.getValue()).b(context, ((Ja.i) value).f5598a);
        }
        if (value instanceof Ja.o) {
            return ((Fa.e) uc.f6509J7.getValue()).b(context, ((Ja.o) value).f5604a);
        }
        if (value instanceof Ja.m) {
            return ((Y9.f) uc.f6815l7.getValue()).b(context, ((Ja.m) value).f5602a);
        }
        if (value instanceof Ja.b) {
            return ((S3.e) uc.f6961z2.getValue()).b(context, ((Ja.b) value).f5591a);
        }
        if (value instanceof Ja.g) {
            return ((M5.f) uc.f6698b4.getValue()).b(context, ((Ja.g) value).f5596a);
        }
        if (value instanceof Ja.l) {
            return ((M9.e) uc.f6677Z6.getValue()).b(context, ((Ja.l) value).f5601a);
        }
        if (value instanceof Ja.n) {
            return ((C1452za.e) uc.G7.getValue()).b(context, ((Ja.n) value).f5603a);
        }
        if (value instanceof Ja.h) {
            return ((C1225j6.l) uc.f6454E4.getValue()).b(context, ((Ja.h) value).f5597a);
        }
        if (value instanceof Ja.j) {
            return ((C1169f9.g) uc.f6954y6.getValue()).b(context, ((Ja.j) value).f5599a);
        }
        if (value instanceof Ja.q) {
            return ((C1231jc.f) uc.f6817l9.getValue()).b(context, ((Ja.q) value).f5606a);
        }
        throw new b9.j();
    }
}
