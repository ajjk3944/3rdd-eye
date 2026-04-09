package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19910a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19911b;

    public s(int i4) {
        this.f19911b = i4;
    }

    public static m c(a0.x0 x0Var, List list) {
        w wVar = w.ADD;
        com.bumptech.glide.c.w(2, list, "FN");
        n nVarC = ((t) x0Var.f145b).c(x0Var, (n) list.get(0));
        n nVarC2 = ((t) x0Var.f145b).c(x0Var, (n) list.get(1));
        if (!(nVarC2 instanceof d)) {
            throw new IllegalArgumentException(je.u.t("FN requires an ArrayValue of parameter names found ", nVarC2.getClass().getCanonicalName()));
        }
        List listK = ((d) nVarC2).k();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new m(nVarC.zzc(), (ArrayList) listK, arrayList, x0Var);
    }

    public static boolean d(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.zzc());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.zzc());
        }
        if ((nVar instanceof q) && (nVar2 instanceof q)) {
            return ((q) nVar).f19867a.compareTo(((q) nVar2).f19867a) < 0;
        }
        double dDoubleValue = nVar.f().doubleValue();
        double dDoubleValue2 = nVar2.f().doubleValue();
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
            return nVar instanceof g ? (Double.isNaN(nVar.f().doubleValue()) || Double.isNaN(nVar2.f().doubleValue()) || nVar.f().doubleValue() != nVar2.f().doubleValue()) ? false : true : nVar instanceof q ? nVar.zzc().equals(nVar2.zzc()) : nVar instanceof e ? nVar.c().equals(nVar2.c()) : nVar == nVar2;
        }
        if (((nVar instanceof r) || (nVar instanceof l)) && ((nVar2 instanceof r) || (nVar2 instanceof l))) {
            return true;
        }
        boolean z3 = nVar instanceof g;
        if (z3 && (nVar2 instanceof q)) {
            return f(nVar, new g(nVar2.f()));
        }
        boolean z10 = nVar instanceof q;
        if (z10 && (nVar2 instanceof g)) {
            return f(new g(nVar.f()), nVar2);
        }
        if (nVar instanceof e) {
            return f(new g(nVar.f()), nVar2);
        }
        if (nVar2 instanceof e) {
            return f(nVar, new g(nVar2.f()));
        }
        if ((z10 || z3) && (nVar2 instanceof j)) {
            return f(nVar, new q(nVar2.zzc()));
        }
        if ((nVar instanceof j) && ((nVar2 instanceof q) || (nVar2 instanceof g))) {
            return f(new q(nVar.zzc()), nVar2);
        }
        return false;
    }

    public static n g(v vVar, Iterator it, n nVar) {
        a0.x0 x0VarT;
        if (it != null) {
            while (it.hasNext()) {
                n nVar2 = (n) it.next();
                switch (vVar.f19962a) {
                    case 0:
                        x0VarT = vVar.f19963b.T();
                        String str = vVar.f19964c;
                        x0VarT.W(str, nVar2);
                        ((HashMap) x0VarT.f147d).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        x0VarT = vVar.f19963b.T();
                        x0VarT.W(vVar.f19964c, nVar2);
                        break;
                    default:
                        x0VarT = vVar.f19963b;
                        x0VarT.W(vVar.f19964c, nVar2);
                        break;
                }
                n nVarR = x0VarT.R((d) nVar);
                if (nVarR instanceof f) {
                    f fVar = (f) nVarR;
                    String str2 = fVar.f19727b;
                    if ("break".equals(str2)) {
                        return n.J8;
                    }
                    if ("return".equals(str2)) {
                        return fVar;
                    }
                }
            }
        }
        return n.J8;
    }

    public static boolean h(n nVar, n nVar2) {
        if (nVar instanceof j) {
            nVar = new q(nVar.zzc());
        }
        if (nVar2 instanceof j) {
            nVar2 = new q(nVar2.zzc());
        }
        return (((nVar instanceof q) && (nVar2 instanceof q)) || !(Double.isNaN(nVar.f().doubleValue()) || Double.isNaN(nVar2.f().doubleValue()))) && !d(nVar2, nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:504:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.n a(java.lang.String r12, a0.x0 r13, java.util.ArrayList r14) {
        /*
            Method dump skipped, instructions count: 3854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s.a(java.lang.String, a0.x0, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final void b(String str) {
        if (!this.f19910a.contains(com.bumptech.glide.c.z(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
