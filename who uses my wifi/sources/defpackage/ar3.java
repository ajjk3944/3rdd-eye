package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ar3 extends eq3 implements RunnableFuture {
    public volatile nq3 m;

    public ar3(Callable callable) {
        this.m = new zq3(this, callable);
    }

    @Override // defpackage.gp3
    public final void f() {
        nq3 nq3Var;
        if (l() && (nq3Var = this.m) != null) {
            nq3Var.g();
        }
        this.m = null;
    }

    @Override // defpackage.gp3
    public final String g() {
        nq3 nq3Var = this.m;
        if (nq3Var == null) {
            return super.g();
        }
        String string = nq3Var.toString();
        return ex0.l(new StringBuilder(string.length() + 7), "task=[", string, "]");
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        nq3 nq3Var = this.m;
        if (nq3Var != null) {
            nq3Var.run();
        }
        this.m = null;
    }
}
