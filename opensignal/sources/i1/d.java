package i1;

import g1.f0;
import g1.i;
import g1.m;
import lf.t1;
import x1.h0;

/* loaded from: classes.dex */
public interface d extends t2.c {
    static void D(h0 h0Var, long j, float f10) {
        long jH = h0Var.f24844b.H();
        b bVar = h0Var.f24844b;
        bVar.f11140b.f11138c.c(f10, jH, b.a(bVar, j, f.f11146b, 1.0f, 3));
    }

    static void F(d dVar, g1.g gVar, long j, long j7, float f10, m mVar, int i10, int i11) {
        dVar.p(gVar, 0L, j, (i11 & 16) != 0 ? j : j7, (i11 & 32) != 0 ? 1.0f : f10, mVar, (i11 & 512) != 0 ? 1 : i10);
    }

    static /* synthetic */ void P(d dVar, i iVar, f0 f0Var, float f10, g gVar, int i10) {
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        c cVar = gVar;
        if ((i10 & 8) != 0) {
            cVar = f.f11146b;
        }
        dVar.k(iVar, f0Var, f11, cVar, (i10 & 32) != 0 ? 3 : 0);
    }

    static void g(d dVar, long j, long j7, float f10, int i10) {
        if ((i10 & 4) != 0) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.C() >> 32)) - Float.intBitsToFloat((int) (0 >> 32));
            j7 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r14 & 4294967295L)) - Float.intBitsToFloat((int) (0 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        dVar.m(j, 0L, j7, (i10 & 8) != 0 ? 1.0f : f10, f.f11146b, (i10 & 64) != 0 ? 3 : 0);
    }

    bm.d A();

    default long C() {
        return A().H();
    }

    default long H() {
        return t1.p(A().H());
    }

    t2.i getLayoutDirection();

    void k(i iVar, f0 f0Var, float f10, c cVar, int i10);

    void m(long j, long j7, long j10, float f10, c cVar, int i10);

    void p(g1.g gVar, long j, long j7, long j10, float f10, m mVar, int i10);
}
