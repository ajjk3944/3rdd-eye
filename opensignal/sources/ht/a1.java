package ht;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kt.h f10882a = kt.k.c(kt.j.DONT_CARE, new String[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final kt.h f10883b = kt.k.c(kt.j.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f10884c = new z0("NO_EXPECTED_TYPE");

    /* renamed from: d, reason: collision with root package name */
    public static final z0 f10885d = new z0("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r27) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ht.a1.a(int):void");
    }

    public static boolean b(x xVar) {
        if (xVar == null) {
            a(28);
            throw null;
        }
        if (xVar.c0()) {
            return true;
        }
        return c.j(xVar) && b(((r) xVar.k0()).f10939g);
    }

    public static boolean c(x xVar, ar.k kVar, rt.h hVar) {
        if (xVar == null) {
            return false;
        }
        c1 c1VarK0 = xVar.k0();
        if (l(xVar)) {
            return ((Boolean) kVar.a(c1VarK0)).booleanValue();
        }
        if (hVar != null && hVar.contains(xVar)) {
            return false;
        }
        if (((Boolean) kVar.a(c1VarK0)).booleanValue()) {
            return true;
        }
        if (hVar == null) {
            hVar = new rt.h();
        }
        hVar.add(xVar);
        r rVar = c1VarK0 instanceof r ? (r) c1VarK0 : null;
        if (rVar != null && (c(rVar.f10938d, kVar, hVar) || c(rVar.f10939g, kVar, hVar))) {
            return true;
        }
        if ((c1VarK0 instanceof n) && c(((n) c1VarK0).f10930d, kVar, hVar)) {
            return true;
        }
        m0 m0VarZ = xVar.Z();
        if (m0VarZ instanceof w) {
            Iterator it = ((w) m0VarZ).f10951b.iterator();
            while (it.hasNext()) {
                if (c((x) it.next(), kVar, hVar)) {
                    return true;
                }
            }
            return false;
        }
        for (p0 p0Var : xVar.L()) {
            if (!p0Var.c() && c(p0Var.b(), kVar, hVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new g0(((rr.r0) it.next()).q()));
        }
        return mq.o.Q0(arrayList);
    }

    public static boolean e(x xVar) {
        if (xVar == null) {
            a(27);
            throw null;
        }
        if (!xVar.c0() && (!c.j(xVar) || !e(((r) xVar.k0()).f10939g))) {
            if (!(xVar.k0() instanceof n)) {
                if (f(xVar)) {
                    if (!(xVar.Z().p() instanceof rr.f)) {
                        x0 x0VarD = x0.d(xVar);
                        Collection<x> collectionQ = xVar.Z().q();
                        ArrayList arrayList = new ArrayList(collectionQ.size());
                        for (x xVar2 : collectionQ) {
                            if (xVar2 == null) {
                                a(21);
                                throw null;
                            }
                            x xVarI = x0VarD.i(xVar2, d1.INVARIANT);
                            x xVarH = xVarI != null ? h(xVarI, xVar.c0()) : null;
                            if (xVarH != null) {
                                arrayList.add(xVarH);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((x) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                m0 m0VarZ = xVar.Z();
                if (m0VarZ instanceof w) {
                    Iterator it2 = ((w) m0VarZ).f10951b.iterator();
                    while (it2.hasNext()) {
                        if (e((x) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(x xVar) {
        if (xVar == null) {
            a(60);
            throw null;
        }
        if ((xVar.Z().p() instanceof rr.r0 ? (rr.r0) xVar.Z().p() : null) != null) {
            return true;
        }
        xVar.Z();
        return false;
    }

    public static c1 g(x xVar, boolean z10) {
        if (xVar == null) {
            a(3);
            throw null;
        }
        c1 c1VarP0 = xVar.k0().p0(z10);
        if (c1VarP0 != null) {
            return c1VarP0;
        }
        a(4);
        throw null;
    }

    public static x h(x xVar, boolean z10) {
        if (xVar != null) {
            return z10 ? g(xVar, true) : xVar;
        }
        a(8);
        throw null;
    }

    public static b0 i(b0 b0Var, boolean z10) {
        if (b0Var == null) {
            a(5);
            throw null;
        }
        if (!z10) {
            return b0Var;
        }
        b0 b0VarU0 = b0Var.p0(true);
        if (b0VarU0 != null) {
            return b0VarU0;
        }
        a(6);
        throw null;
    }

    public static g0 j(rr.r0 r0Var) {
        if (r0Var != null) {
            return new g0(r0Var);
        }
        a(45);
        throw null;
    }

    public static p0 k(rr.r0 r0Var, fs.a aVar) {
        if (r0Var != null) {
            return aVar.f9051a == y0.SUPERTYPE ? new g0(c.r(r0Var)) : new g0(r0Var);
        }
        a(46);
        throw null;
    }

    public static boolean l(x xVar) {
        if (xVar != null) {
            return xVar == f10884c || xVar == f10885d;
        }
        a(0);
        throw null;
    }
}
