package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Mf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0623Mf extends AbstractExecutorService implements ID {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9879a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f9880b;

    public C0623Mf(Executor executor) {
        this.f9880b = executor;
    }

    public final InterfaceFutureC2326a a(Runnable runnable) {
        return (InterfaceFutureC2326a) super.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j6, TimeUnit timeUnit) {
        switch (this.f9879a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f9880b).awaitTermination(j6, timeUnit);
        }
    }

    public final InterfaceFutureC2326a b(Callable callable) {
        return (InterfaceFutureC2326a) super.submit(callable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f9879a) {
            case 0:
                this.f9880b.execute(runnable);
                break;
            default:
                ((ExecutorService) this.f9880b).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f9879a) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f9880b).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f9879a) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f9880b).isTerminated();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new TD(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.f9879a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.f9880b).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f9879a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f9880b).shutdownNow();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (InterfaceFutureC2326a) super.submit(runnable);
    }

    public String toString() {
        switch (this.f9879a) {
            case 1:
                ExecutorService executorService = (ExecutorService) this.f9880b;
                String string = super.toString();
                String strValueOf = String.valueOf(executorService);
                return AbstractC1135f5.o(new StringBuilder(String.valueOf(string).length() + 1 + strValueOf.length() + 1), string, "[", strValueOf, "]");
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new TD(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (InterfaceFutureC2326a) super.submit(runnable, obj);
    }

    public C0623Mf(ExecutorService executorService) {
        executorService.getClass();
        this.f9880b = executorService;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (InterfaceFutureC2326a) super.submit(callable);
    }
}
