package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cq3 extends tp3 {
    public bq3 u;

    @Override // defpackage.gp3
    public final void k() {
        bq3 bq3Var = this.u;
        if (bq3Var != null) {
            bq3Var.g();
        }
    }

    @Override // defpackage.tp3
    public final void r(int i) {
        this.q = null;
        if (i == 1) {
            this.u = null;
        }
    }

    @Override // defpackage.tp3
    public final void x() {
        bq3 bq3Var = this.u;
        if (bq3Var != null) {
            try {
                bq3Var.h.execute(bq3Var);
            } catch (RejectedExecutionException e) {
                bq3Var.i.e(e);
            }
        }
    }

    @Override // defpackage.tp3
    public final void w(int i, Object obj) {
    }
}
