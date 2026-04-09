package k1;

import j1.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class i {
    public static o a(j1.e eVar, int i10, ArrayList arrayList, o oVar) {
        int iC1;
        int i11 = i10 == 0 ? eVar.f49872H0 : eVar.f49874I0;
        if (i11 != -1 && (oVar == null || i11 != oVar.c())) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i12);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof j1.j) && (iC1 = ((j1.j) eVar).c1(i10)) != -1) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = (o) arrayList.get(i13);
                    if (oVar3.c() == iC1) {
                        oVar = oVar3;
                        break;
                    }
                    i13++;
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof j1.h) {
                j1.h hVar = (j1.h) eVar;
                hVar.a1().c(hVar.b1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i10 == 0) {
                eVar.f49872H0 = oVar.c();
                eVar.f49879N.c(i10, arrayList, oVar);
                eVar.f49881P.c(i10, arrayList, oVar);
            } else {
                eVar.f49874I0 = oVar.c();
                eVar.f49880O.c(i10, arrayList, oVar);
                eVar.f49883R.c(i10, arrayList, oVar);
                eVar.f49882Q.c(i10, arrayList, oVar);
            }
            eVar.f49886U.c(i10, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = (o) arrayList.get(i11);
            if (i10 == oVar.c()) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0348  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(j1.f r16, k1.C6356b.InterfaceC1888b r17) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.i.c(j1.f, k1.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
