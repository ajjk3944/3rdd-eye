package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5187a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5188b;

    public s(int i10) {
        this.f5188b = i10;
    }

    public static m c(kg.r rVar, List list) {
        a.a.J(w.FN.name(), 2, list);
        n nVarC = ((t) rVar.f14396d).c(rVar, (n) list.get(0));
        n nVarC2 = ((t) rVar.f14396d).c(rVar, (n) list.get(1));
        if (!(nVarC2 instanceof d)) {
            throw new IllegalArgumentException(c7.a.p("FN requires an ArrayValue of parameter names found ", nVarC2.getClass().getCanonicalName()));
        }
        List listN = ((d) nVarC2).n();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new m(nVarC.l(), (ArrayList) listN, arrayList, rVar);
    }

    public static boolean d(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.l());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.l());
        }
        if ((nVar instanceof q) && (nVar2 instanceof q)) {
            return ((q) nVar).f5166a.compareTo(((q) nVar2).f5166a) < 0;
        }
        double dDoubleValue = nVar.c().doubleValue();
        double dDoubleValue2 = nVar2.c().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static n e(v vVar, n nVar, n nVar2) {
        if (nVar instanceof Iterable) {
            return g(vVar, ((Iterable) nVar).iterator(), nVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean f(n nVar, n nVar2) {
        if (nVar.getClass().equals(nVar2.getClass())) {
            if ((nVar instanceof r) || (nVar instanceof l)) {
                return true;
            }
            return nVar instanceof g ? (Double.isNaN(nVar.c().doubleValue()) || Double.isNaN(nVar2.c().doubleValue()) || nVar.c().doubleValue() != nVar2.c().doubleValue()) ? false : true : nVar instanceof q ? nVar.l().equals(nVar2.l()) : nVar instanceof e ? nVar.a().equals(nVar2.a()) : nVar == nVar2;
        }
        if (((nVar instanceof r) || (nVar instanceof l)) && ((nVar2 instanceof r) || (nVar2 instanceof l))) {
            return true;
        }
        boolean z10 = nVar instanceof g;
        if (z10 && (nVar2 instanceof q)) {
            return f(nVar, new g(nVar2.c()));
        }
        boolean z11 = nVar instanceof q;
        if (z11 && (nVar2 instanceof g)) {
            return f(new g(nVar.c()), nVar2);
        }
        if (nVar instanceof e) {
            return f(new g(nVar.c()), nVar2);
        }
        if (nVar2 instanceof e) {
            return f(nVar, new g(nVar2.c()));
        }
        if ((z11 || z10) && (nVar2 instanceof j)) {
            return f(nVar, new q(nVar2.l()));
        }
        if ((nVar instanceof j) && ((nVar2 instanceof q) || (nVar2 instanceof g))) {
            return f(new q(nVar.l()), nVar2);
        }
        return false;
    }

    public static n g(v vVar, Iterator it, n nVar) {
        kg.r rVarE;
        if (it != null) {
            while (it.hasNext()) {
                n nVar2 = (n) it.next();
                switch (vVar.f5224a) {
                    case 0:
                        rVarE = vVar.f5225b.E();
                        String str = vVar.f5226c;
                        rVarE.H(str, nVar2);
                        ((HashMap) rVarE.f14398r).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        rVarE = vVar.f5225b.E();
                        rVarE.H(vVar.f5226c, nVar2);
                        break;
                    default:
                        rVarE = vVar.f5225b;
                        rVarE.H(vVar.f5226c, nVar2);
                        break;
                }
                n nVarD = rVarE.D((d) nVar);
                if (nVarD instanceof f) {
                    f fVar = (f) nVarD;
                    String str2 = fVar.f4981d;
                    if ("break".equals(str2)) {
                        return n.f5129f;
                    }
                    if ("return".equals(str2)) {
                        return fVar;
                    }
                }
            }
        }
        return n.f5129f;
    }

    public static boolean h(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.l());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.l());
        }
        return (((nVar instanceof q) && (nVar2 instanceof q)) || !(Double.isNaN(nVar.c().doubleValue()) || Double.isNaN(nVar2.c().doubleValue()))) && !d(nVar2, nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:506:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.n a(java.lang.String r12, kg.r r13, java.util.ArrayList r14) {
        /*
            Method dump skipped, instructions count: 3808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s.a(java.lang.String, kg.r, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final void b(String str) {
        if (!this.f5187a.contains(a.a.M(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
