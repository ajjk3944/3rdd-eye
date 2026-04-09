package c1;

import java.util.ArrayList;
import u0.m1;
import u0.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f2567a = new StackTraceElement[0];

    /* renamed from: b, reason: collision with root package name */
    public static final p f2568b = new p(0, new long[0], new Object[0]);

    public static final int a(int i4, int i10) {
        return i4 << (((i10 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final h c(int i4, yj.c cVar, u0.p pVar) {
        Object objL = pVar.L();
        if (objL == u0.l.f34851a) {
            objL = new h(i4, true, cVar);
            pVar.g0(objL);
        }
        h hVar = (h) objL;
        if (!hVar.f2559c.equals(cVar)) {
            hVar.f2559c = cVar;
            if (hVar.f2558b) {
                m1 m1Var = hVar.f2560d;
                if (m1Var != null) {
                    w wVar = m1Var.f34867a;
                    if (wVar != null) {
                        wVar.s(m1Var, null);
                    }
                    hVar.f2560d = null;
                }
                ArrayList arrayList = hVar.f2561e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        m1 m1Var2 = (m1) arrayList.get(i10);
                        w wVar2 = m1Var2.f34867a;
                        if (wVar2 != null) {
                            wVar2.s(m1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return hVar;
    }

    public static final boolean d(m1 m1Var, m1 m1Var2) {
        if (m1Var == null) {
            return true;
        }
        if (m1Var instanceof m1) {
            return !m1Var.b() || m1Var.equals(m1Var2) || nk.k.a(m1Var.f34869c, m1Var2.f34869c);
        }
        return false;
    }
}
