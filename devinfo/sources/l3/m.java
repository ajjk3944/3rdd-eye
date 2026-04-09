package l3;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static int f28574f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f28575a;

    /* renamed from: b, reason: collision with root package name */
    public int f28576b;

    /* renamed from: c, reason: collision with root package name */
    public int f28577c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f28578d;

    /* renamed from: e, reason: collision with root package name */
    public int f28579e;

    public final void a(ArrayList arrayList) {
        int size = this.f28575a.size();
        if (this.f28579e != -1 && size > 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                m mVar = (m) arrayList.get(i4);
                if (this.f28579e == mVar.f28576b) {
                    c(this.f28577c, mVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(i3.c cVar, int i4) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f28575a;
        if (arrayList.size() == 0) {
            return 0;
        }
        k3.e eVar = (k3.e) ((k3.d) arrayList.get(0)).T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((k3.d) arrayList.get(i10)).b(cVar, false);
        }
        if (i4 == 0 && eVar.f27888z0 > 0) {
            k3.j.a(eVar, cVar, arrayList, 0);
        }
        if (i4 == 1 && eVar.A0 > 0) {
            k3.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e2) {
            System.err.println(e2.toString() + "\n" + Arrays.toString(e2.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f28578d = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            k3.d dVar = (k3.d) arrayList.get(i11);
            j6.i iVar = new j6.i(3);
            new WeakReference(dVar);
            i3.c.n(dVar.I);
            i3.c.n(dVar.J);
            i3.c.n(dVar.K);
            i3.c.n(dVar.L);
            i3.c.n(dVar.M);
            this.f28578d.add(iVar);
        }
        if (i4 == 0) {
            iN = i3.c.n(eVar.I);
            iN2 = i3.c.n(eVar.K);
            cVar.t();
        } else {
            iN = i3.c.n(eVar.J);
            iN2 = i3.c.n(eVar.L);
            cVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i4, m mVar) {
        int i10 = mVar.f28576b;
        ArrayList arrayList = this.f28575a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            k3.d dVar = (k3.d) obj;
            ArrayList arrayList2 = mVar.f28575a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
            if (i4 == 0) {
                dVar.f27864n0 = i10;
            } else {
                dVar.f27866o0 = i10;
            }
        }
        this.f28579e = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i4 = this.f28577c;
        sb2.append(i4 == 0 ? "Horizontal" : i4 == 1 ? "Vertical" : i4 == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String strJ = r5.c.j(this.f28576b, "] <", sb2);
        ArrayList arrayList = this.f28575a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            StringBuilder sbB = i3.e.b(strJ, " ");
            sbB.append(((k3.d) obj).f27853h0);
            strJ = sbB.toString();
        }
        return d.h.s(strJ, " >");
    }
}
