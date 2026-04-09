package p5;

import androidx.media3.common.r;
import b5.a0;
import lf.t1;
import o5.w0;

/* loaded from: classes.dex */
public final class n extends a {
    public final int K;
    public final r L;
    public long M;
    public boolean N;

    public n(b5.h hVar, b5.k kVar, r rVar, int i10, Object obj, long j, long j7, long j10, int i11, r rVar2) {
        super(hVar, kVar, rVar, i10, obj, j, j7, -9223372036854775807L, -9223372036854775807L, j10);
        this.K = i11;
        this.L = rVar2;
    }

    @Override // p5.l
    public final boolean b() {
        return this.N;
    }

    @Override // r5.k, pb.j0
    public final void c() {
        a0 a0Var = this.E;
        om.f fVar = this.I;
        a5.a.j(fVar);
        for (w0 w0Var : (w0[]) fVar.f19555g) {
            if (w0Var.F != 0) {
                w0Var.F = 0L;
                w0Var.f19101z = true;
            }
        }
        u5.a0 a0VarV = fVar.v(this.K);
        a0VarV.c(this.L);
        try {
            long jT = a0Var.t(this.f20265d.a(this.M));
            if (jT != -1) {
                jT += this.M;
            }
            u5.h hVar = new u5.h(this.E, this.M, jT);
            for (int iB = 0; iB != -1; iB = a0VarV.b(hVar, Integer.MAX_VALUE, true)) {
                this.M += iB;
            }
            a0VarV.a(this.B, 1, (int) this.M, 0, null);
            t1.h(a0Var);
            this.N = true;
        } catch (Throwable th2) {
            t1.h(a0Var);
            throw th2;
        }
    }

    @Override // r5.k, pb.j0
    public final void d() {
    }
}
