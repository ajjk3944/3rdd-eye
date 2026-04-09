package p5;

import androidx.media3.common.r;
import b5.a0;
import lf.t1;
import o5.w0;

/* loaded from: classes.dex */
public final class j extends a {
    public final int K;
    public final long L;
    public final f M;
    public long N;
    public volatile boolean O;
    public boolean P;

    public j(b5.h hVar, b5.k kVar, r rVar, int i10, Object obj, long j, long j7, long j10, long j11, long j12, int i11, long j13, f fVar) {
        super(hVar, kVar, rVar, i10, obj, j, j7, j10, j11, j12);
        this.K = i11;
        this.L = j13;
        this.M = fVar;
    }

    @Override // p5.l
    public final long a() {
        return this.F + this.K;
    }

    @Override // p5.l
    public final boolean b() {
        return this.P;
    }

    @Override // r5.k, pb.j0
    public final void c() {
        if (this.N == 0) {
            om.f fVar = this.I;
            a5.a.j(fVar);
            long j = this.L;
            for (w0 w0Var : (w0[]) fVar.f19555g) {
                if (w0Var.F != j) {
                    w0Var.F = j;
                    w0Var.f19101z = true;
                }
            }
            f fVar2 = this.M;
            long j7 = this.G;
            long j10 = j7 == -9223372036854775807L ? -9223372036854775807L : j7 - this.L;
            long j11 = this.H;
            ((d) fVar2).a(fVar, j10, j11 != -9223372036854775807L ? j11 - this.L : -9223372036854775807L);
        }
        try {
            b5.k kVarA = this.f20265d.a(this.N);
            a0 a0Var = this.E;
            u5.h hVar = new u5.h(a0Var, kVarA.f2447e, a0Var.t(kVarA));
            while (!this.O) {
                try {
                    int iG = ((d) this.M).f20258a.g(hVar, d.F);
                    a5.a.i(iG != 1);
                    if (!(iG == 0)) {
                        break;
                    }
                } finally {
                    this.N = hVar.f23288r - this.f20265d.f2447e;
                }
            }
            t1.h(this.E);
            this.P = !this.O;
        } catch (Throwable th2) {
            t1.h(this.E);
            throw th2;
        }
    }

    @Override // r5.k, pb.j0
    public final void d() {
        this.O = true;
    }
}
