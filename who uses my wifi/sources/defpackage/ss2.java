package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ss2 implements dn2 {
    public final tr2 f;
    public final ur2 g;
    public final Executor h;
    public final Executor i;

    public ss2(tr2 tr2Var, ur2 ur2Var, Executor executor, ld2 ld2Var) {
        this.f = tr2Var;
        this.g = ur2Var;
        this.h = executor;
        this.i = ld2Var;
    }

    @Override // defpackage.dn2
    public final void D0() {
        n70 n70Var;
        n70 n70Var2;
        pd2 pd2Var;
        if (this.g.e) {
            tr2 tr2Var = this.f;
            xz2 xz2VarK = tr2Var.k();
            if (xz2VarK == null) {
                synchronized (tr2Var) {
                    n70Var = tr2Var.m;
                }
                if (n70Var != null && ((Boolean) tw1.e.c.a(mz1.N5)).booleanValue()) {
                    synchronized (tr2Var) {
                        n70Var2 = tr2Var.m;
                    }
                    synchronized (tr2Var) {
                        pd2Var = tr2Var.n;
                    }
                    if (n70Var2 == null || pd2Var == null) {
                        return;
                    }
                    zp3 zp3Var = new zp3(xm3.n(new n70[]{n70Var2, pd2Var}), false);
                    zp3Var.c(new jq3(zp3Var, new kf3(22, this), 0), this.i);
                    return;
                }
            }
            if (xz2VarK != null) {
                ag2 ag2VarJ = tr2Var.j();
                ag2 ag2VarH = tr2Var.h();
                if (ag2VarJ == null) {
                    ag2VarJ = ag2VarH == null ? null : ag2VarH;
                }
                if (ag2VarJ != null) {
                    this.h.execute(new ig2(ag2VarJ, 5));
                }
            }
        }
    }
}
