package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ex extends AbstractExecutorService implements w81, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10898a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f10899b;

    public ex(Executor executor) {
        this.f10899b = executor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        switch (this.f10898a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f10899b).awaitTermination(j, timeUnit);
        }
    }

    public final vd.b c(Runnable runnable) {
        return (vd.b) super.submit(runnable);
    }

    public /* synthetic */ void close() throws InterruptedException {
        a3.a.g(this);
    }

    public final vd.b e(Callable callable) {
        return (vd.b) super.submit(callable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f10898a) {
            case 0:
                this.f10899b.execute(runnable);
                break;
            default:
                ((ExecutorService) this.f10899b).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f10898a) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f10899b).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f10898a) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f10899b).isTerminated();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new h91(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.f10898a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.f10899b).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f10898a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f10899b).shutdownNow();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (vd.b) super.submit(runnable);
    }

    public String toString() {
        switch (this.f10898a) {
            case 1:
                ExecutorService executorService = (ExecutorService) this.f10899b;
                String string = super.toString();
                String strValueOf = String.valueOf(executorService);
                return a0.g.p(new StringBuilder(je.u.l(String.valueOf(string).length(), 1, strValueOf.length(), 1)), string, "[", strValueOf, "]");
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new h91(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (vd.b) super.submit(runnable, obj);
    }

    public ex(ExecutorService executorService) {
        executorService.getClass();
        this.f10899b = executorService;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (vd.b) super.submit(callable);
    }
}
