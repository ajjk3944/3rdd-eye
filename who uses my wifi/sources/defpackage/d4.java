package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class d4 {
    public static final l92 a = l92.D("k", "x", "y");

    public static kf3 a(j40 j40Var, u80 u80Var) {
        ArrayList arrayList = new ArrayList();
        if (j40Var.o() == 1) {
            j40Var.a();
            while (j40Var.i()) {
                j40 j40Var2 = j40Var;
                u80 u80Var2 = u80Var;
                arrayList.add(new mk0(u80Var2, y40.b(j40Var2, u80Var2, l41.c(), fr.k, j40Var.o() == 3, false)));
                j40Var = j40Var2;
                u80Var = u80Var2;
            }
            j40Var.f();
            z40.b(arrayList);
        } else {
            arrayList.add(new w40(k40.b(j40Var, l41.c())));
        }
        return new kf3(1, arrayList);
    }

    public static j4 b(j40 j40Var, u80 u80Var) {
        j40Var.c();
        kf3 kf3VarA = null;
        c4 c4VarF = null;
        boolean z = false;
        c4 c4VarF2 = null;
        while (j40Var.o() != 4) {
            int iQ = j40Var.q(a);
            if (iQ == 0) {
                kf3VarA = a(j40Var, u80Var);
            } else if (iQ != 1) {
                if (iQ != 2) {
                    j40Var.r();
                    j40Var.s();
                } else if (j40Var.o() == 6) {
                    j40Var.s();
                    z = true;
                } else {
                    c4VarF = yc0.f(j40Var, u80Var, true);
                }
            } else if (j40Var.o() == 6) {
                j40Var.s();
                z = true;
            } else {
                c4VarF2 = yc0.f(j40Var, u80Var, true);
            }
        }
        j40Var.g();
        if (z) {
            u80Var.a("Lottie doesn't support expressions.");
        }
        return kf3VarA != null ? kf3VarA : new e4(c4VarF2, c4VarF);
    }
}
