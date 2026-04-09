package o1;

import o1.C7049e;

/* renamed from: o1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7055k {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f55231a = new boolean[3];

    static void a(C7050f c7050f, n1.d dVar, C7049e c7049e) {
        c7049e.f55125j = -1;
        c7049e.f55127k = -1;
        C7049e.b bVar = c7050f.f55093M[0];
        C7049e.b bVar2 = C7049e.b.WRAP_CONTENT;
        if (bVar != bVar2 && c7049e.f55093M[0] == C7049e.b.MATCH_PARENT) {
            int i10 = c7049e.f55082B.f55076e;
            int iP = c7050f.P() - c7049e.f55084D.f55076e;
            C7048d c7048d = c7049e.f55082B;
            c7048d.f55078g = dVar.q(c7048d);
            C7048d c7048d2 = c7049e.f55084D;
            c7048d2.f55078g = dVar.q(c7048d2);
            dVar.f(c7049e.f55082B.f55078g, i10);
            dVar.f(c7049e.f55084D.f55078g, iP);
            c7049e.f55125j = 2;
            c7049e.k0(i10, iP);
        }
        if (c7050f.f55093M[1] == bVar2 || c7049e.f55093M[1] != C7049e.b.MATCH_PARENT) {
            return;
        }
        int i11 = c7049e.f55083C.f55076e;
        int iV = c7050f.v() - c7049e.f55085E.f55076e;
        C7048d c7048d3 = c7049e.f55083C;
        c7048d3.f55078g = dVar.q(c7048d3);
        C7048d c7048d4 = c7049e.f55085E;
        c7048d4.f55078g = dVar.q(c7048d4);
        dVar.f(c7049e.f55083C.f55078g, i11);
        dVar.f(c7049e.f55085E.f55078g, iV);
        if (c7049e.f55105Y > 0 || c7049e.O() == 8) {
            C7048d c7048d5 = c7049e.f55086F;
            c7048d5.f55078g = dVar.q(c7048d5);
            dVar.f(c7049e.f55086F.f55078g, c7049e.f55105Y + i11);
        }
        c7049e.f55127k = 2;
        c7049e.z0(i11, iV);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
