package ab;

import com.google.android.exoplayer2.Format;
import pb.t0;
import qb.v;

/* loaded from: classes.dex */
public final class l extends f {
    public final e F;
    public io.sentry.internal.debugmeta.c G;
    public long H;
    public volatile boolean I;

    public l(pb.n nVar, na.c cVar, Format format, int i10, Object obj, e eVar) {
        super(nVar, cVar, 2, format, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.F = eVar;
    }

    @Override // pb.j0
    public final void c() {
        if (this.H == 0) {
            this.F.a(this.G, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            na.c cVarE = this.f302d.e(this.H);
            t0 t0Var = this.E;
            ca.h hVar = new ca.h(t0Var, cVarE.f17419c, t0Var.q(cVarE));
            while (!this.I) {
                try {
                    int iF = this.F.f295a.f(hVar, e.F);
                    boolean z10 = false;
                    qb.b.j(iF != 1);
                    if (iF == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        break;
                    }
                } finally {
                    this.H = hVar.f3478r - this.f302d.f17419c;
                }
            }
        } finally {
            v.g(this.E);
        }
    }

    @Override // pb.j0
    public final void d() {
        this.I = true;
    }
}
