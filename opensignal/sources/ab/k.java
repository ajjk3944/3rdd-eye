package ab;

import com.google.android.exoplayer2.Format;
import pb.t0;
import qb.v;
import ya.r0;

/* loaded from: classes.dex */
public final class k extends a {
    public final int K;
    public final long L;
    public final e M;
    public long N;
    public volatile boolean O;
    public boolean P;

    public k(pb.n nVar, na.c cVar, Format format, int i10, Object obj, long j, long j7, long j10, long j11, long j12, int i11, long j13, e eVar) {
        super(nVar, cVar, format, i10, obj, j, j7, j10, j11, j12);
        this.K = i11;
        this.L = j13;
        this.M = eVar;
    }

    @Override // ab.m
    public final long a() {
        return this.F + this.K;
    }

    @Override // ab.m
    public final boolean b() {
        return this.P;
    }

    @Override // pb.j0
    public final void c() {
        if (this.N == 0) {
            io.sentry.internal.debugmeta.c cVar = this.I;
            qb.b.k(cVar);
            long j = this.L;
            for (r0 r0Var : (r0[]) cVar.f12354g) {
                if (r0Var.G != j) {
                    r0Var.G = j;
                    r0Var.A = true;
                }
            }
            e eVar = this.M;
            long j7 = this.G;
            long j10 = j7 == -9223372036854775807L ? -9223372036854775807L : j7 - this.L;
            long j11 = this.H;
            eVar.a(cVar, j10, j11 != -9223372036854775807L ? j11 - this.L : -9223372036854775807L);
        }
        try {
            na.c cVarE = this.f302d.e(this.N);
            t0 t0Var = this.E;
            ca.h hVar = new ca.h(t0Var, cVarE.f17419c, t0Var.q(cVarE));
            while (!this.O) {
                try {
                    int iF = this.M.f295a.f(hVar, e.F);
                    qb.b.j(iF != 1);
                    if (!(iF == 0)) {
                        break;
                    }
                } finally {
                    this.N = hVar.f3478r - this.f302d.f17419c;
                }
            }
            v.g(this.E);
            this.P = !this.O;
        } catch (Throwable th2) {
            v.g(this.E);
            throw th2;
        }
    }

    @Override // pb.j0
    public final void d() {
        this.O = true;
    }
}
