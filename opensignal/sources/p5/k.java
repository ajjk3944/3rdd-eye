package p5;

import androidx.media3.common.r;
import b5.a0;
import lf.t1;

/* loaded from: classes.dex */
public final class k extends e {
    public final f F;
    public om.f G;
    public long H;
    public volatile boolean I;

    public k(b5.h hVar, b5.k kVar, r rVar, int i10, Object obj, f fVar) {
        super(hVar, kVar, 2, rVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.F = fVar;
    }

    @Override // r5.k, pb.j0
    public final void c() {
        if (this.H == 0) {
            ((d) this.F).a(this.G, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            b5.k kVarA = this.f20265d.a(this.H);
            a0 a0Var = this.E;
            u5.h hVar = new u5.h(a0Var, kVarA.f2447e, a0Var.t(kVarA));
            while (!this.I) {
                try {
                    int iG = ((d) this.F).f20258a.g(hVar, d.F);
                    boolean z10 = false;
                    a5.a.i(iG != 1);
                    if (iG == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        break;
                    }
                } finally {
                    this.H = hVar.f23288r - this.f20265d.f2447e;
                }
            }
        } finally {
            t1.h(this.E);
        }
    }

    @Override // r5.k, pb.j0
    public final void d() {
        this.I = true;
    }
}
