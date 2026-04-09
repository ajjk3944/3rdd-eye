package A;

import G3.C0152f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import o4.AbstractC2763b;
import x.AbstractC2984e;
import x.C2982c;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: f, reason: collision with root package name */
    public static int f37f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f38a;

    /* renamed from: b, reason: collision with root package name */
    public int f39b;

    /* renamed from: c, reason: collision with root package name */
    public int f40c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f41d;

    /* renamed from: e, reason: collision with root package name */
    public int f42e;

    public final void a(ArrayList arrayList) {
        int size = this.f38a.size();
        if (this.f42e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o oVar = (o) arrayList.get(i);
                if (this.f42e == oVar.f39b) {
                    c(this.f40c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C2982c c2982c, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f38a;
        if (arrayList.size() == 0) {
            return 0;
        }
        z.e eVar = (z.e) ((z.d) arrayList.get(0)).f24310T;
        c2982c.t();
        eVar.b(c2982c, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((z.d) arrayList.get(i3)).b(c2982c, false);
        }
        if (i == 0 && eVar.f24377z0 > 0) {
            z.j.a(eVar, c2982c, arrayList, 0);
        }
        if (i == 1 && eVar.f24357A0 > 0) {
            z.j.a(eVar, c2982c, arrayList, 1);
        }
        try {
            c2982c.p();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        this.f41d = new ArrayList();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            z.d dVar = (z.d) arrayList.get(i6);
            C0152f c0152f = new C0152f(1);
            new WeakReference(dVar);
            C2982c.n(dVar.f24300I);
            C2982c.n(dVar.f24301J);
            C2982c.n(dVar.f24302K);
            C2982c.n(dVar.f24303L);
            C2982c.n(dVar.M);
            this.f41d.add(c0152f);
        }
        if (i == 0) {
            iN = C2982c.n(eVar.f24300I);
            iN2 = C2982c.n(eVar.f24302K);
            c2982c.t();
        } else {
            iN = C2982c.n(eVar.f24301J);
            iN2 = C2982c.n(eVar.f24303L);
            c2982c.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, o oVar) {
        ArrayList arrayList = this.f38a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            z.d dVar = (z.d) obj;
            ArrayList arrayList2 = oVar.f38a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
            int i6 = oVar.f39b;
            if (i == 0) {
                dVar.f24342n0 = i6;
            } else {
                dVar.f24344o0 = i6;
            }
        }
        this.f42e = oVar.f39b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f40c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strD = AbstractC2763b.d(this.f39b, "] <", sb);
        ArrayList arrayList = this.f38a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            StringBuilder sbB = AbstractC2984e.b(strD, " ");
            sbB.append(((z.d) obj).f24331h0);
            strD = sbB.toString();
        }
        return AbstractC2763b.e(strD, " >");
    }
}
