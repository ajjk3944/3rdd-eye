package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ft3 implements je4 {
    public final /* synthetic */ int f;
    public final Executor g;
    public final Object h;
    public final mn2 i;

    public ft3(Executor executor, mn2 mn2Var, int i) {
        this.f = i;
        switch (i) {
            case 1:
                this.h = new Object();
                this.g = executor;
                this.i = mn2Var;
                break;
            default:
                this.h = new Object();
                this.g = executor;
                this.i = mn2Var;
                break;
        }
    }

    @Override // defpackage.je4
    public final void a(gi4 gi4Var) {
        switch (this.f) {
            case 0:
                if (gi4Var.d) {
                    synchronized (this.h) {
                    }
                    this.g.execute(new bh3(0, this));
                    return;
                }
                return;
            default:
                if (gi4Var.c()) {
                    synchronized (this.h) {
                    }
                    this.g.execute(new sz2(this, gi4Var, 23, false));
                    return;
                }
                return;
        }
    }
}
