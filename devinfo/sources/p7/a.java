package p7;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final km.n f31395a = km.n.q("k", "x", "y");

    public static h7.c a(q7.b bVar, f7.j jVar) {
        ArrayList arrayList = new ArrayList();
        if (bVar.F() == 1) {
            bVar.c();
            while (bVar.v()) {
                q7.b bVar2 = bVar;
                f7.j jVar2 = jVar;
                arrayList.add(new i7.l(jVar2, o.b(bVar2, jVar2, r7.j.c(), f.f31411e, bVar.F() == 3, false)));
                bVar = bVar2;
                jVar = jVar2;
            }
            bVar.g();
            p.b(arrayList);
        } else {
            arrayList.add(new s7.a(n.b(bVar, r7.j.c())));
        }
        return new h7.c(arrayList);
    }

    public static l7.f b(q7.b bVar, f7.j jVar) {
        bVar.e();
        h7.c cVarA = null;
        l7.b bVarJ = null;
        boolean z3 = false;
        l7.b bVarJ2 = null;
        while (bVar.F() != 4) {
            int iL = bVar.L(f31395a);
            if (iL == 0) {
                cVarA = a(bVar, jVar);
            } else if (iL != 1) {
                if (iL != 2) {
                    bVar.N();
                    bVar.O();
                } else if (bVar.F() == 6) {
                    bVar.O();
                    z3 = true;
                } else {
                    bVarJ = wd.b.J(bVar, jVar, true);
                }
            } else if (bVar.F() == 6) {
                bVar.O();
                z3 = true;
            } else {
                bVarJ2 = wd.b.J(bVar, jVar, true);
            }
        }
        bVar.m();
        if (z3) {
            jVar.a("Lottie doesn't support expressions.");
        }
        return cVarA != null ? cVarA : new l7.c(bVarJ2, bVarJ);
    }
}
