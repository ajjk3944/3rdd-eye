package com.google.firebase.crashlytics.internal.common;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public abstract class I {

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38728a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f38729b;

        /* renamed from: com.google.firebase.crashlytics.internal.common.I$a$a, reason: collision with other inner class name */
        class C1219a extends AbstractRunnableC5102d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f38730a;

            C1219a(Runnable runnable) {
                this.f38730a = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.AbstractRunnableC5102d
            public void a() {
                this.f38730a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f38728a = str;
            this.f38729b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C1219a(runnable));
            threadNewThread.setName(this.f38728a + this.f38729b.getAndIncrement());
            return threadNewThread;
        }
    }

    class b extends AbstractRunnableC5102d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38732a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f38733b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f38734c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TimeUnit f38735d;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f38732a = str;
            this.f38733b = executorService;
            this.f38734c = j10;
            this.f38735d = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.AbstractRunnableC5102d
        public void a() {
            try {
                I4.g.f().b("Executing shutdown hook for " + this.f38732a);
                this.f38733b.shutdown();
                if (this.f38733b.awaitTermination(this.f38734c, this.f38735d)) {
                    return;
                }
                I4.g.f().b(this.f38732a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f38733b.shutdownNow();
            } catch (InterruptedException unused) {
                I4.g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f38732a));
                this.f38733b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j10, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService executorServiceE = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
