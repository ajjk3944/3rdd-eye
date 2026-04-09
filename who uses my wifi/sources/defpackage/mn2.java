package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mn2 implements je4, gj0 {
    public final /* synthetic */ int f;
    public final Executor g;
    public final Object h;
    public final Object i;

    public /* synthetic */ mn2(Executor executor, pj pjVar, gi4 gi4Var, int i) {
        this.f = i;
        this.g = executor;
        this.i = pjVar;
        this.h = gi4Var;
    }

    @Override // defpackage.je4
    public final void a(gi4 gi4Var) {
        switch (this.f) {
            case 0:
                this.g.execute(new n62(this, gi4Var, 5, false));
                return;
            case 1:
                this.g.execute(new n62(this, gi4Var, 26, false));
                return;
            case 2:
                synchronized (this.i) {
                }
                this.g.execute(new sz2(this, gi4Var, 18, false));
                return;
            default:
                if (gi4Var.c() || gi4Var.d) {
                    return;
                }
                synchronized (this.i) {
                }
                this.g.execute(new sz2(this, gi4Var, 21, false));
                return;
        }
    }

    @Override // defpackage.gj0
    public void q(Exception exc) {
        ((gi4) this.h).d(exc);
    }

    public mn2(Executor executor, dj0 dj0Var) {
        this.f = 2;
        this.i = new Object();
        this.g = executor;
        this.h = dj0Var;
    }

    public mn2(Executor executor, gj0 gj0Var) {
        this.f = 3;
        this.i = new Object();
        this.g = executor;
        this.h = gj0Var;
    }
}
