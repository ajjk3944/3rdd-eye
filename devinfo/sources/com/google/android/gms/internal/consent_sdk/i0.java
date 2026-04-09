package com.google.android.gms.internal.consent_sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f19379b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f19378a = new AtomicInteger(1);

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f19380c = new WeakReference(null);

    public i0() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.android.gms.internal.consent_sdk.h0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                i0 i0Var = this.f19369a;
                Thread thread = new Thread(runnable, je.u.r(i0Var.f19378a.getAndIncrement(), "Google consent worker #"));
                i0Var.f19380c = new WeakReference(thread);
                return thread;
            }
        });
        this.f19379b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f19380c.get()) {
            runnable.run();
        } else {
            this.f19379b.execute(runnable);
        }
    }
}
