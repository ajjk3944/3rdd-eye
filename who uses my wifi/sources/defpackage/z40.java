package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class z40 {
    public static final l92 a = l92.D("k");

    public static ArrayList a(i40 i40Var, u80 u80Var, float f, o41 o41Var, boolean z) {
        i40 i40Var2;
        u80 u80Var2;
        float f2;
        o41 o41Var2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (i40Var.o() == 6) {
            u80Var.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        i40Var.c();
        while (i40Var.i()) {
            if (i40Var.q(a) != 0) {
                i40Var.s();
            } else if (i40Var.o() == 1) {
                i40Var.a();
                if (i40Var.o() == 7) {
                    i40 i40Var3 = i40Var;
                    u80 u80Var3 = u80Var;
                    float f3 = f;
                    o41 o41Var3 = o41Var;
                    boolean z3 = z;
                    w40 w40VarB = y40.b(i40Var3, u80Var3, f3, o41Var3, false, z3);
                    i40Var2 = i40Var3;
                    u80Var2 = u80Var3;
                    f2 = f3;
                    o41Var2 = o41Var3;
                    z2 = z3;
                    arrayList.add(w40VarB);
                } else {
                    i40Var2 = i40Var;
                    u80Var2 = u80Var;
                    f2 = f;
                    o41Var2 = o41Var;
                    z2 = z;
                    while (i40Var2.i()) {
                        arrayList.add(y40.b(i40Var2, u80Var2, f2, o41Var2, true, z2));
                    }
                }
                i40Var2.f();
                i40Var = i40Var2;
                u80Var = u80Var2;
                f = f2;
                o41Var = o41Var2;
                z = z2;
            } else {
                i40 i40Var4 = i40Var;
                arrayList.add(y40.b(i40Var4, u80Var, f, o41Var, false, z));
                i40Var = i40Var4;
            }
        }
        i40Var.g();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            w40 w40Var = (w40) arrayList.get(i2);
            i2++;
            w40 w40Var2 = (w40) arrayList.get(i2);
            w40Var.h = Float.valueOf(w40Var2.g);
            if (w40Var.c == null && (obj = w40Var2.b) != null) {
                w40Var.c = obj;
                if (w40Var instanceof mk0) {
                    ((mk0) w40Var).d();
                }
            }
        }
        w40 w40Var3 = (w40) arrayList.get(i);
        if ((w40Var3.b == null || w40Var3.c == null) && arrayList.size() > 1) {
            arrayList.remove(w40Var3);
        }
    }
}
