package ab;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import ua.b;

/* renamed from: ab.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3778a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final ua.b a(String line) {
        AbstractC6492s.i(line, "line");
        switch (line.hashCode()) {
            case -1890254201:
                if (line.equals("edgemax")) {
                    return b.e.C2214e.f62860b;
                }
                return null;
            case -1417465894:
                if (line.equals("airmax")) {
                    return b.c.d.f62841b;
                }
                return null;
            case -1411091249:
                if (line.equals("apollo")) {
                    return b.s.f62906a;
                }
                return null;
            case -1216172875:
                if (line.equals("unifi-protect")) {
                    return b.t.d.f62912b;
                }
                return null;
            case -1075013498:
                if (line.equals("unifi-talk")) {
                    return b.u.f62917a;
                }
                return null;
            case -992049025:
                if (line.equals("aircube")) {
                    return b.a.f62824a;
                }
                return null;
            case -891178088:
                if (line.equals("sunmax")) {
                    return b.h.a.f62869b;
                }
                return null;
            case -879122748:
                if (line.equals("amplifi")) {
                    return b.d.f62851a;
                }
                return null;
            case -865969423:
                if (line.equals("unifi-led")) {
                    return b.o.f62891a;
                }
                return null;
            case -865968957:
                if (line.equals("unifi-lte")) {
                    return b.p.f62893a;
                }
                return null;
            case -847932009:
                if (line.equals("ufiber")) {
                    return b.j.a.f62875b;
                }
                return null;
            case -686335518:
                if (line.equals("airfiber")) {
                    return b.AbstractC2196b.c.f62830b;
                }
                return null;
            case 107501:
                if (line.equals("ltu")) {
                    return b.f.a.f62862b;
                }
                return null;
            case 108016:
                if (line.equals("mfi")) {
                    return b.g.f62866a;
                }
                return null;
            case 3590129:
                if (line.equals("uisp")) {
                    return b.k.a.f62880b;
                }
                return null;
            case 3642105:
                if (line.equals("wave")) {
                    return b.w.a.f62921b;
                }
                return null;
            case 44191440:
                if (line.equals("unifi-connect")) {
                    return b.m.f62887a;
                }
                return null;
            case 936325140:
                if (line.equals("unifi-network")) {
                    return b.r.e.f62902b;
                }
                return null;
            case 987537071:
                if (line.equals("toughswitch")) {
                    return b.i.f62872a;
                }
                return null;
            case 1020047600:
                if (line.equals("unifi-drive")) {
                    return b.n.f62889a;
                }
                return null;
            case 1270215813:
                if (line.equals("unifi-mobility")) {
                    return b.q.f62895a;
                }
                return null;
            case 1342251557:
                if (line.equals("wifiman")) {
                    return b.x.f62923a;
                }
                return null;
            case 1456769726:
                if (line.equals("unifi-access")) {
                    return b.l.f62885a;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final ua.b b(ua.b line, String productType) {
        AbstractC6492s.i(line, "line");
        AbstractC6492s.i(productType, "productType");
        if (line instanceof b.t) {
            switch (productType.hashCode()) {
                case -1367751899:
                    if (productType.equals("camera")) {
                        return b.t.a.f62909b;
                    }
                    break;
                case -905948230:
                    if (productType.equals("sensor")) {
                        return b.t.g.f62915b;
                    }
                    break;
                case -816631278:
                    if (productType.equals("viewer")) {
                        return b.t.h.f62916b;
                    }
                    break;
                case 94631228:
                    if (productType.equals("chime")) {
                        return b.t.C2224b.f62910b;
                    }
                    break;
                case 102970646:
                    if (productType.equals("light")) {
                        return b.t.e.f62913b;
                    }
                    break;
                case 1202479577:
                    if (productType.equals("doorlock")) {
                        return b.t.c.f62911b;
                    }
                    break;
            }
            return b.t.d.f62912b;
        }
        if ((line instanceof b.h) || (line instanceof b.g) || (line instanceof b.a) || (line instanceof b.k) || (line instanceof b.i) || (line instanceof b.e) || (line instanceof b.w) || (line instanceof b.f) || (line instanceof b.AbstractC2196b) || (line instanceof b.c) || (line instanceof b.d) || (line instanceof b.j) || (line instanceof b.r) || (line instanceof b.l) || (line instanceof b.u) || (line instanceof b.o) || (line instanceof b.m) || (line instanceof b.p) || (line instanceof b.n) || (line instanceof b.q) || (line instanceof b.s) || (line instanceof b.x) || (line instanceof b.v)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
