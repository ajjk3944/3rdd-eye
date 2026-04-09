package l3;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public n f28570a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f28571b;

    public static long a(e eVar, long j) {
        n nVar = eVar.f28560d;
        ArrayList arrayList = eVar.f28565k;
        if (nVar instanceof i) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) arrayList.get(i4);
            if (dVar instanceof e) {
                e eVar2 = (e) dVar;
                if (eVar2.f28560d != nVar) {
                    jMin = Math.min(jMin, a(eVar2, eVar2.f28562f + j));
                }
            }
        }
        e eVar3 = nVar.f28587i;
        e eVar4 = nVar.f28586h;
        if (eVar != eVar3) {
            return jMin;
        }
        long j8 = j - nVar.j();
        return Math.min(Math.min(jMin, a(eVar4, j8)), j8 - eVar4.f28562f);
    }

    public static long b(e eVar, long j) {
        n nVar = eVar.f28560d;
        ArrayList arrayList = eVar.f28565k;
        if (nVar instanceof i) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) arrayList.get(i4);
            if (dVar instanceof e) {
                e eVar2 = (e) dVar;
                if (eVar2.f28560d != nVar) {
                    jMax = Math.max(jMax, b(eVar2, eVar2.f28562f + j));
                }
            }
        }
        e eVar3 = nVar.f28586h;
        e eVar4 = nVar.f28587i;
        if (eVar != eVar3) {
            return jMax;
        }
        long j8 = nVar.j() + j;
        return Math.max(Math.max(jMax, b(eVar4, j8)), j8 - eVar4.f28562f);
    }
}
