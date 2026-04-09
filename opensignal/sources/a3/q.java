package a3;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: f, reason: collision with root package name */
    public static int f68f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f69a;

    /* renamed from: b, reason: collision with root package name */
    public int f70b;

    /* renamed from: c, reason: collision with root package name */
    public int f71c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f72d;

    /* renamed from: e, reason: collision with root package name */
    public int f73e;

    public final void a(ArrayList arrayList) {
        int size = this.f69a.size();
        if (this.f73e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                q qVar = (q) arrayList.get(i10);
                if (this.f73e == qVar.f70b) {
                    c(this.f71c, qVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(x2.c cVar, int i10) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f69a;
        if (arrayList.size() == 0) {
            return 0;
        }
        z2.h hVar = (z2.h) ((z2.g) arrayList.get(0)).U;
        cVar.t();
        hVar.b(cVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((z2.g) arrayList.get(i11)).b(cVar, false);
        }
        if (i10 == 0 && hVar.f26585z0 > 0) {
            z2.n.a(hVar, cVar, arrayList, 0);
        }
        if (i10 == 1 && hVar.A0 > 0) {
            z2.n.a(hVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e4) {
            System.err.println(e4.toString() + "\n" + Arrays.toString(e4.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f72d = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            z2.g gVar = (z2.g) arrayList.get(i12);
            cg.e eVar = new cg.e();
            new WeakReference(gVar);
            x2.c.n(gVar.I);
            x2.c.n(gVar.J);
            x2.c.n(gVar.K);
            x2.c.n(gVar.L);
            x2.c.n(gVar.M);
            this.f72d.add(eVar);
        }
        if (i10 == 0) {
            iN = x2.c.n(hVar.I);
            iN2 = x2.c.n(hVar.K);
            cVar.t();
        } else {
            iN = x2.c.n(hVar.J);
            iN2 = x2.c.n(hVar.L);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i10, q qVar) {
        int i11 = qVar.f70b;
        Iterator it = this.f69a.iterator();
        while (it.hasNext()) {
            z2.g gVar = (z2.g) it.next();
            ArrayList arrayList = qVar.f69a;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
            }
            if (i10 == 0) {
                gVar.f26563o0 = i11;
            } else {
                gVar.f26565p0 = i11;
            }
        }
        this.f73e = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f71c;
        sb2.append(i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String strI = h0.b.i(this.f70b, "] <", sb2);
        Iterator it = this.f69a.iterator();
        while (it.hasNext()) {
            z2.g gVar = (z2.g) it.next();
            StringBuilder sbL = w.g.l(strI, " ");
            sbL.append(gVar.f26553i0);
            strI = sbL.toString();
        }
        return w.g.f(strI, " >");
    }
}
