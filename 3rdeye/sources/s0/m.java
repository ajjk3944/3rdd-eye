package s0;

import java.util.ArrayList;

/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public p f45935a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<p> f45936b;

    public static long a(f fVar, long j4) {
        p pVar = fVar.f45923d;
        if (pVar instanceof k) {
            return j4;
        }
        ArrayList arrayList = fVar.f45929k;
        int size = arrayList.size();
        long jMin = j4;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f45923d != pVar) {
                    jMin = Math.min(jMin, a(fVar2, fVar2.f45925f + j4));
                }
            }
        }
        if (fVar != pVar.i) {
            return jMin;
        }
        long j10 = pVar.j();
        long j11 = j4 - j10;
        return Math.min(Math.min(jMin, a(pVar.f45953h, j11)), j11 - r9.f45925f);
    }

    public static long b(f fVar, long j4) {
        p pVar = fVar.f45923d;
        if (pVar instanceof k) {
            return j4;
        }
        ArrayList arrayList = fVar.f45929k;
        int size = arrayList.size();
        long jMax = j4;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f45923d != pVar) {
                    jMax = Math.max(jMax, b(fVar2, fVar2.f45925f + j4));
                }
            }
        }
        if (fVar != pVar.f45953h) {
            return jMax;
        }
        long j10 = pVar.j();
        long j11 = j4 + j10;
        return Math.max(Math.max(jMax, b(pVar.i, j11)), j11 - r9.f45925f);
    }
}
