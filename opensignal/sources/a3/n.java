package a3;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public t f64a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f65b;

    public static long a(g gVar, long j) {
        t tVar = gVar.f54d;
        ArrayList arrayList = gVar.k;
        if (tVar instanceof k) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f54d != tVar) {
                    jMin = Math.min(jMin, a(gVar2, gVar2.f56f + j));
                }
            }
        }
        g gVar3 = tVar.f83i;
        g gVar4 = tVar.f82h;
        if (gVar != gVar3) {
            return jMin;
        }
        long j7 = j - tVar.j();
        return Math.min(Math.min(jMin, a(gVar4, j7)), j7 - gVar4.f56f);
    }

    public static long b(g gVar, long j) {
        t tVar = gVar.f54d;
        ArrayList arrayList = gVar.k;
        if (tVar instanceof k) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f54d != tVar) {
                    jMax = Math.max(jMax, b(gVar2, gVar2.f56f + j));
                }
            }
        }
        g gVar3 = tVar.f82h;
        g gVar4 = tVar.f83i;
        if (gVar != gVar3) {
            return jMax;
        }
        long j7 = tVar.j() + j;
        return Math.max(Math.max(jMax, b(gVar4, j7)), j7 - gVar4.f56f);
    }
}
