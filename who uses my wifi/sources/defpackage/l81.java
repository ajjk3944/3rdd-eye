package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l81 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                l81 l81Var = (l81) arrayList.get(i);
                if (this.e == l81Var.b) {
                    c(this.c, l81Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(x60 x60Var, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        qi qiVar = (qi) ((pi) arrayList.get(0)).T;
        x60Var.t();
        qiVar.b(x60Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((pi) arrayList.get(i2)).b(x60Var, false);
        }
        if (i == 0 && qiVar.z0 > 0) {
            um.c(qiVar, x60Var, arrayList, 0);
        }
        if (i == 1 && qiVar.A0 > 0) {
            um.c(qiVar, x60Var, arrayList, 1);
        }
        try {
            x60Var.p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            pi piVar = (pi) arrayList.get(i3);
            us0 us0Var = new us0();
            new WeakReference(piVar);
            x60.n(piVar.I);
            x60.n(piVar.J);
            x60.n(piVar.K);
            x60.n(piVar.L);
            x60.n(piVar.M);
            this.d.add(us0Var);
        }
        if (i == 0) {
            iN = x60.n(qiVar.I);
            iN2 = x60.n(qiVar.K);
            x60Var.t();
        } else {
            iN = x60.n(qiVar.J);
            iN2 = x60.n(qiVar.L);
            x60Var.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, l81 l81Var) {
        int i2 = l81Var.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            pi piVar = (pi) obj;
            ArrayList arrayList2 = l81Var.a;
            if (!arrayList2.contains(piVar)) {
                arrayList2.add(piVar);
            }
            if (i == 0) {
                piVar.n0 = i2;
            } else {
                piVar.o0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strI = ex0.i(sb, this.b, "] <");
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            strI = strI + " " + ((pi) obj).h0;
        }
        return ex0.g(strI, " >");
    }
}
