package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bq3 extends nq3 {
    public final Executor h;
    public final /* synthetic */ cq3 i;
    public final Callable j;
    public final /* synthetic */ cq3 k;

    public bq3(cq3 cq3Var, Callable callable, Executor executor) {
        this.k = cq3Var;
        this.i = cq3Var;
        executor.getClass();
        this.h = executor;
        this.j = callable;
    }

    @Override // defpackage.nq3
    public final Object a() {
        return this.j.call();
    }

    @Override // defpackage.nq3
    public final String c() {
        return this.j.toString();
    }

    @Override // defpackage.nq3
    public final boolean d() {
        return this.i.isDone();
    }

    @Override // defpackage.nq3
    public final void e(Object obj) {
        this.i.u = null;
        this.k.d(obj);
    }

    @Override // defpackage.nq3
    public final void f(Throwable th) {
        cq3 cq3Var = this.i;
        cq3Var.u = null;
        if (th instanceof ExecutionException) {
            cq3Var.e(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            cq3Var.cancel(false);
        } else {
            cq3Var.e(th);
        }
    }
}
