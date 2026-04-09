package m6;

import E.u;
import N7.Ba;
import N7.C1322q5;
import N7.C1405w5;
import N7.C1431y3;
import N7.G7;
import N7.R3;
import N7.S2;
import N7.X9;
import N7.Z;
import c9.C2095p;
import h7.C4421b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DivPatchApply.kt */
/* renamed from: m6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5329b {
    public final List<Z> a(Z z10, A7.d dVar) {
        Z bVar;
        S2 s2D;
        if (z10.d().getId() != null) {
            throw null;
        }
        if (z10 instanceof Z.a) {
            C1431y3 c1431y3 = ((Z.a) z10).f7813c;
            bVar = new Z.a(C1431y3.a(c1431y3, null, b(c1431y3.f9824A, dVar), -67108865));
        } else if (z10 instanceof Z.e) {
            C1405w5 c1405w5 = ((Z.e) z10).f7817c;
            bVar = new Z.e(C1405w5.a(c1405w5, null, b(c1405w5.f9719y, dVar), -16777217));
        } else if (z10 instanceof Z.c) {
            C1322q5 c1322q5 = ((Z.c) z10).f7815c;
            bVar = new Z.c(C1322q5.a(c1322q5, null, b(c1322q5.f8976u, dVar), -1048577));
        } else if (z10 instanceof Z.i) {
            G7 g72 = ((Z.i) z10).f7821c;
            bVar = new Z.i(G7.a(g72, null, b(g72.f5364t, dVar), -524289));
        } else if (z10 instanceof Z.m) {
            X9 x92 = ((Z.m) z10).f7825c;
            List<X9.a> list = x92.f7743y;
            ArrayList arrayList = new ArrayList();
            for (X9.a aVar : list) {
                Z z11 = aVar.f7747c;
                if (((z11 == null || (s2D = z11.d()) == null) ? null : s2D.getId()) != null) {
                    throw null;
                }
                Z z12 = aVar.f7747c;
                List<Z> listA = z12 != null ? a(z12, dVar) : null;
                if (listA != null && listA.size() == 1) {
                    aVar = new X9.a(aVar.f7745a, aVar.f7746b, listA.get(0), aVar.f7748d, aVar.f7749e);
                }
                arrayList.add(aVar);
            }
            bVar = new Z.m(X9.a(x92, null, null, arrayList, -16777217));
        } else if (z10 instanceof Z.o) {
            ArrayList arrayList2 = new ArrayList();
            Ba ba2 = ((Z.o) z10).f7827c;
            for (Ba.a aVar2 : ba2.f4949q) {
                List<Z> listA2 = a(aVar2.f4959a, dVar);
                if (listA2.size() == 1) {
                    arrayList2.add(new Ba.a(listA2.get(0), aVar2.f4960b, aVar2.f4961c));
                } else {
                    int i = C4421b.f38269a;
                    C4421b.a(C7.a.ERROR);
                    arrayList2.add(aVar2);
                }
            }
            bVar = new Z.o(Ba.a(ba2, null, arrayList2, -65537));
        } else if (z10 instanceof Z.b) {
            R3 r32 = ((Z.b) z10).f7814c;
            bVar = new Z.b(R3.a(r32, null, b(r32.f6139q, dVar), -65537));
        } else {
            bVar = z10;
        }
        return u.G(bVar);
    }

    public final ArrayList b(List list, A7.d dVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2095p.b0(a((Z) it.next(), dVar), arrayList);
        }
        return arrayList;
    }
}
