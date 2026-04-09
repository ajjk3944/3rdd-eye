package r0;

import r0.C5508e;

/* compiled from: Optimizer.java */
/* renamed from: r0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5513j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f45655a = new boolean[3];

    public static void a(C5509f c5509f, p0.c cVar, C5508e c5508e) {
        c5508e.f45568o = -1;
        c5508e.f45570p = -1;
        C5508e.b bVar = c5509f.f45535U[0];
        C5508e.b bVar2 = C5508e.b.WRAP_CONTENT;
        C5508e.b[] bVarArr = c5508e.f45535U;
        if (bVar != bVar2 && bVarArr[0] == C5508e.b.MATCH_PARENT) {
            C5507d c5507d = c5508e.f45524J;
            int i = c5507d.f45512g;
            int iQ = c5509f.q();
            C5507d c5507d2 = c5508e.f45526L;
            int i10 = iQ - c5507d2.f45512g;
            c5507d.i = cVar.k(c5507d);
            c5507d2.i = cVar.k(c5507d2);
            cVar.d(c5507d.i, i);
            cVar.d(c5507d2.i, i10);
            c5508e.f45568o = 2;
            c5508e.f45542a0 = i;
            int i11 = i10 - i;
            c5508e.f45537W = i11;
            int i12 = c5508e.f45548d0;
            if (i11 < i12) {
                c5508e.f45537W = i12;
            }
        }
        if (c5509f.f45535U[1] == bVar2 || bVarArr[1] != C5508e.b.MATCH_PARENT) {
            return;
        }
        C5507d c5507d3 = c5508e.f45525K;
        int i13 = c5507d3.f45512g;
        int iK = c5509f.k();
        C5507d c5507d4 = c5508e.f45527M;
        int i14 = iK - c5507d4.f45512g;
        c5507d3.i = cVar.k(c5507d3);
        c5507d4.i = cVar.k(c5507d4);
        cVar.d(c5507d3.i, i13);
        cVar.d(c5507d4.i, i14);
        if (c5508e.f45546c0 > 0 || c5508e.f45557i0 == 8) {
            C5507d c5507d5 = c5508e.f45528N;
            c5507d5.i = cVar.k(c5507d5);
            cVar.d(c5507d5.i, c5508e.f45546c0 + i13);
        }
        c5508e.f45570p = 2;
        c5508e.f45544b0 = i13;
        int i15 = i14 - i13;
        c5508e.f45538X = i15;
        int i16 = c5508e.f45550e0;
        if (i15 < i16) {
            c5508e.f45538X = i16;
        }
    }

    public static final boolean b(int i, int i10) {
        return (i & i10) == i10;
    }
}
