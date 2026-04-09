package ab;

import ca.x;
import com.google.android.exoplayer2.Format;
import pb.t0;
import qb.v;
import ya.r0;

/* loaded from: classes.dex */
public final class o extends a {
    public final int K;
    public final Format L;
    public long M;
    public boolean N;

    public o(pb.n nVar, na.c cVar, Format format, int i10, Object obj, long j, long j7, long j10, int i11, Format format2) {
        super(nVar, cVar, format, i10, obj, j, j7, -9223372036854775807L, -9223372036854775807L, j10);
        this.K = i11;
        this.L = format2;
    }

    @Override // ab.m
    public final boolean b() {
        return this.N;
    }

    @Override // pb.j0
    public final void c() {
        t0 t0Var = this.E;
        io.sentry.internal.debugmeta.c cVar = this.I;
        qb.b.k(cVar);
        for (r0 r0Var : (r0[]) cVar.f12354g) {
            if (r0Var.G != 0) {
                r0Var.G = 0L;
                r0Var.A = true;
            }
        }
        x xVarE = cVar.E(this.K);
        xVarE.e(this.L);
        try {
            long jQ = t0Var.q(this.f302d.e(this.M));
            if (jQ != -1) {
                jQ += this.M;
            }
            ca.h hVar = new ca.h(this.E, this.M, jQ);
            for (int iC = 0; iC != -1; iC = xVarE.c(hVar, Integer.MAX_VALUE, true)) {
                this.M += iC;
            }
            xVarE.d(this.B, 1, (int) this.M, 0, null);
            v.g(t0Var);
            this.N = true;
        } catch (Throwable th2) {
            v.g(t0Var);
            throw th2;
        }
    }

    @Override // pb.j0
    public final void d() {
    }
}
