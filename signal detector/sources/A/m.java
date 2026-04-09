package A;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public p f33a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f34b;

    public static long a(g gVar, long j6) {
        p pVar = gVar.f22d;
        ArrayList arrayList = gVar.f28k;
        if (pVar instanceof k) {
            return j6;
        }
        int size = arrayList.size();
        long jMin = j6;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f22d != pVar) {
                    jMin = Math.min(jMin, a(gVar2, gVar2.f24f + j6));
                }
            }
        }
        g gVar3 = pVar.i;
        g gVar4 = pVar.f50h;
        if (gVar != gVar3) {
            return jMin;
        }
        long j7 = j6 - pVar.j();
        return Math.min(Math.min(jMin, a(gVar4, j7)), j7 - gVar4.f24f);
    }

    public static long b(g gVar, long j6) {
        p pVar = gVar.f22d;
        ArrayList arrayList = gVar.f28k;
        if (pVar instanceof k) {
            return j6;
        }
        int size = arrayList.size();
        long jMax = j6;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f22d != pVar) {
                    jMax = Math.max(jMax, b(gVar2, gVar2.f24f + j6));
                }
            }
        }
        g gVar3 = pVar.f50h;
        g gVar4 = pVar.i;
        if (gVar != gVar3) {
            return jMax;
        }
        long j7 = pVar.j() + j6;
        return Math.max(Math.max(jMax, b(gVar4, j7)), j7 - gVar4.f24f);
    }
}
