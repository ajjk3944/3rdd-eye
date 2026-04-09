package com.yandex.mobile.ads.impl;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public abstract class us1<R, E extends Exception> implements RunnableFuture<R> {

    /* renamed from: b, reason: collision with root package name */
    private final cr f34209b = new cr();

    /* renamed from: c, reason: collision with root package name */
    private final cr f34210c = new cr();

    /* renamed from: d, reason: collision with root package name */
    private final Object f34211d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private Exception f34212e;

    /* renamed from: f, reason: collision with root package name */
    private Thread f34213f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34214g;

    public final void a() {
        this.f34210c.b();
    }

    public abstract void b();

    public abstract void c() throws Exception;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.f34211d) {
            try {
                if (!this.f34214g && !this.f34210c.d()) {
                    this.f34214g = true;
                    b();
                    Thread thread = this.f34213f;
                    if (thread == null) {
                        this.f34209b.e();
                        this.f34210c.e();
                    } else if (z10) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get() throws ExecutionException, InterruptedException {
        this.f34210c.a();
        if (this.f34214g) {
            throw new CancellationException();
        }
        if (this.f34212e == null) {
            return null;
        }
        throw new ExecutionException(this.f34212e);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f34214g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f34210c.d();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f34211d) {
            try {
                if (this.f34214g) {
                    return;
                }
                this.f34213f = Thread.currentThread();
                this.f34209b.e();
                try {
                    try {
                        c();
                        synchronized (this.f34211d) {
                            this.f34210c.e();
                            this.f34213f = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th) {
                        synchronized (this.f34211d) {
                            this.f34210c.e();
                            this.f34213f = null;
                            Thread.interrupted();
                            throw th;
                        }
                    }
                } catch (Exception e4) {
                    this.f34212e = e4;
                    synchronized (this.f34211d) {
                        this.f34210c.e();
                        this.f34213f = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final R get(long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f34210c.a(TimeUnit.MILLISECONDS.convert(j4, timeUnit))) {
            if (!this.f34214g) {
                if (this.f34212e == null) {
                    return null;
                }
                throw new ExecutionException(this.f34212e);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}
