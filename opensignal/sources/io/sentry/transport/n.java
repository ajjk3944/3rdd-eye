package io.sentry.transport;

import i.g0;
import io.sentry.b5;
import io.sentry.j0;
import io.sentry.k4;
import io.sentry.l4;
import io.sentry.u0;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n extends ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final int f12770a;

    /* renamed from: d, reason: collision with root package name */
    public k4 f12771d;

    /* renamed from: g, reason: collision with root package name */
    public final u0 f12772g;

    /* renamed from: r, reason: collision with root package name */
    public final l4 f12773r;

    /* renamed from: x, reason: collision with root package name */
    public final g0 f12774x;

    public n(int i10, j0 j0Var, a aVar, u0 u0Var, l4 l4Var) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), j0Var, aVar);
        this.f12771d = null;
        this.f12774x = new g0(7);
        this.f12770a = i10;
        this.f12772g = u0Var;
        this.f12773r = l4Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        g0 g0Var = this.f12774x;
        try {
            super.afterExecute(runnable, th2);
        } finally {
            q qVar = (q) g0Var.f11051a;
            int i10 = q.f12781a;
            qVar.releaseShared(1);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        g0 g0Var = this.f12774x;
        q qVar = (q) g0Var.f11051a;
        q qVar2 = (q) g0Var.f11051a;
        int iA = q.a(qVar);
        int i10 = this.f12770a;
        u0 u0Var = this.f12772g;
        l4 l4Var = this.f12773r;
        if (iA >= i10) {
            this.f12771d = l4Var.a();
            u0Var.m(b5.WARNING, "Submit cancelled", new Object[0]);
            return new m();
        }
        q.b(qVar2);
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e4) {
            qVar2.releaseShared(1);
            this.f12771d = l4Var.a();
            u0Var.g(b5.WARNING, "Submit rejected by thread pool executor", e4);
            return new m();
        }
    }
}
