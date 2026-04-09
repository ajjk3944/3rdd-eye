package s0;

import java.util.ArrayList;
import r0.C5508e;
import r0.C5511h;
import r0.C5512i;

/* compiled from: Grouping.java */
/* loaded from: classes.dex */
public final class i {
    public static o a(C5508e c5508e, int i, ArrayList<o> arrayList, o oVar) {
        int i10;
        int i11 = i == 0 ? c5508e.f45571p0 : c5508e.f45573q0;
        if (i11 != -1 && (oVar == null || i11 != oVar.f45942b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i12);
                if (oVar2.f45942b == i11) {
                    if (oVar != null) {
                        oVar.c(i, oVar2);
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
            if (c5508e instanceof C5512i) {
                C5512i c5512i = (C5512i) c5508e;
                int i13 = 0;
                while (true) {
                    if (i13 >= c5512i.f45654s0) {
                        i10 = -1;
                        break;
                    }
                    C5508e c5508e2 = c5512i.f45653r0[i13];
                    if ((i == 0 && (i10 = c5508e2.f45571p0) != -1) || (i == 1 && (i10 = c5508e2.f45573q0) != -1)) {
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i14);
                        if (oVar3.f45942b == i10) {
                            oVar = oVar3;
                            break;
                        }
                        i14++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o();
                oVar.f45941a = new ArrayList<>();
                oVar.f45944d = null;
                oVar.f45945e = -1;
                int i15 = o.f45940f;
                o.f45940f = i15 + 1;
                oVar.f45942b = i15;
                oVar.f45943c = i;
            }
            arrayList.add(oVar);
        }
        ArrayList<C5508e> arrayList2 = oVar.f45941a;
        if (arrayList2.contains(c5508e)) {
            return oVar;
        }
        arrayList2.add(c5508e);
        if (c5508e instanceof C5511h) {
            C5511h c5511h = (C5511h) c5508e;
            c5511h.f45649u0.c(c5511h.f45650v0 == 0 ? 1 : 0, arrayList, oVar);
        }
        int i16 = oVar.f45942b;
        if (i == 0) {
            c5508e.f45571p0 = i16;
            c5508e.f45524J.c(i, arrayList, oVar);
            c5508e.f45526L.c(i, arrayList, oVar);
        } else {
            c5508e.f45573q0 = i16;
            c5508e.f45525K.c(i, arrayList, oVar);
            c5508e.f45528N.c(i, arrayList, oVar);
            c5508e.f45527M.c(i, arrayList, oVar);
        }
        c5508e.f45531Q.c(i, arrayList, oVar);
        return oVar;
    }

    public static boolean b(C5508e.b bVar, C5508e.b bVar2, C5508e.b bVar3, C5508e.b bVar4) {
        C5508e.b bVar5;
        C5508e.b bVar6;
        C5508e.b bVar7 = C5508e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = C5508e.b.WRAP_CONTENT) || (bVar3 == C5508e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = C5508e.b.WRAP_CONTENT) || (bVar4 == C5508e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
