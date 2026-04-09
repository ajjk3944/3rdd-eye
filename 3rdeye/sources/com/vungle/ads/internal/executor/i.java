package com.vungle.ads.internal.executor;

import b9.C1992A;
import com.vungle.ads.V;
import com.vungle.ads.internal.util.k;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* compiled from: VungleThreadPoolExecutor.kt */
/* loaded from: classes2.dex */
public final class i extends ThreadPoolExecutor {
    public static final a Companion = new a(null);
    private static final String TAG = "VungleThreadPool";

    /* compiled from: VungleThreadPoolExecutor.kt */
    public static final class a {

        /* compiled from: VungleThreadPoolExecutor.kt */
        /* renamed from: com.vungle.ads.internal.executor.i$a$a, reason: collision with other inner class name */
        public static final class C0380a extends com.vungle.ads.internal.task.h {
            final /* synthetic */ Runnable $command;
            final /* synthetic */ Runnable $fail;

            public C0380a(Runnable runnable, Runnable runnable2) {
                this.$command = runnable;
                this.$fail = runnable2;
            }

            @Override // com.vungle.ads.internal.task.h, java.lang.Comparable
            public int compareTo(Object other) {
                l.f(other, "other");
                if (!(other instanceof com.vungle.ads.internal.task.h)) {
                    return 0;
                }
                return l.h(((com.vungle.ads.internal.task.h) other).getPriority(), getPriority());
            }

            @Override // com.vungle.ads.internal.task.h
            public int getPriority() {
                return ((com.vungle.ads.internal.task.h) this.$command).getPriority();
            }

            @Override // java.lang.Runnable
            public void run() {
                i.Companion.wrapRunnableWithFail(this.$command, this.$fail);
            }
        }

        /* compiled from: VungleThreadPoolExecutor.kt */
        public static final class b implements b {
            final /* synthetic */ Runnable $command;
            final /* synthetic */ Runnable $fail;

            public b(Runnable runnable, Runnable runnable2) {
                this.$command = runnable;
                this.$fail = runnable2;
            }

            @Override // java.lang.Comparable
            public int compareTo(Object other) {
                l.f(other, "other");
                Runnable runnable = this.$command;
                if (runnable instanceof com.vungle.ads.internal.task.h) {
                    return ((com.vungle.ads.internal.task.h) runnable).compareTo(other);
                }
                return 0;
            }

            @Override // java.lang.Runnable
            public void run() {
                i.Companion.wrapRunnableWithFail(this.$command, this.$fail);
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> Callable<T> getWrappedCallableWithFallback(Callable<T> callable, InterfaceC5480a<C1992A> interfaceC5480a) {
            return new h(0, callable, interfaceC5480a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getWrappedCallableWithFallback$lambda-0, reason: not valid java name */
        public static final Object m47getWrappedCallableWithFallback$lambda0(Callable command, InterfaceC5480a failFallback) {
            l.f(command, "$command");
            l.f(failFallback, "$failFallback");
            try {
                return command.call();
            } catch (OutOfMemoryError unused) {
                failFallback.invoke();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b getWrappedRunnableWithFail(Runnable runnable, Runnable runnable2) {
            return runnable instanceof com.vungle.ads.internal.task.h ? new C0380a(runnable, runnable2) : new b(runnable, runnable2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void wrapRunnableWithFail(Runnable runnable, Runnable runnable2) {
            try {
                runnable.run();
            } catch (OutOfMemoryError unused) {
                runnable2.run();
            }
        }

        private a() {
        }
    }

    /* compiled from: VungleThreadPoolExecutor.kt */
    public interface b extends Comparable<Object>, Runnable {
    }

    /* compiled from: VungleThreadPoolExecutor.kt */
    public static final class c extends m implements InterfaceC5480a<C1992A> {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public /* bridge */ /* synthetic */ C1992A invoke() {
            invoke2();
            return C1992A.f18074a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            new V("submit callable error").logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public i(int i, int i10, long j4, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i, i10, j4, timeUnit, blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execute$lambda-0, reason: not valid java name */
    public static final void m44execute$lambda0() {
        new V("execute error").logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submit$lambda-1, reason: not valid java name */
    public static final void m45submit$lambda1() {
        new V("submit error").logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submit$lambda-2, reason: not valid java name */
    public static final void m46submit$lambda2() {
        new V("submit error with error").logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable command) {
        l.f(command, "command");
        try {
            super.execute(Companion.getWrappedRunnableWithFail(command, new f()));
        } catch (Exception e4) {
            k.Companion.e(TAG, "execute error: " + e4);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable task) {
        l.f(task, "task");
        try {
            Future<?> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(task, new g(0)));
            l.e(futureSubmit, "{\n            super.subm…\n            })\n        }");
            return futureSubmit;
        } catch (Exception e4) {
            k.Companion.e(TAG, "submit error: " + e4);
            return new com.vungle.ads.internal.executor.b(null);
        }
    }

    public final void execute(Runnable command, Runnable fail) {
        l.f(command, "command");
        l.f(fail, "fail");
        try {
            super.execute(Companion.getWrappedRunnableWithFail(command, fail));
        } catch (Exception e4) {
            k.Companion.e(TAG, "execute error with fail: " + e4);
            fail.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable task, T t10) {
        l.f(task, "task");
        try {
            Future<T> futureSubmit = super.submit((Runnable) Companion.getWrappedRunnableWithFail(task, new e()), (b) t10);
            l.e(futureSubmit, "{\n            super.subm…     }, result)\n        }");
            return futureSubmit;
        } catch (Exception e4) {
            k.Companion.e(TAG, "submit error with result: " + e4);
            return new com.vungle.ads.internal.executor.b(null);
        }
    }

    public final Future<?> submit(Runnable task, Runnable fail) {
        l.f(task, "task");
        l.f(fail, "fail");
        try {
            Future<?> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(task, fail));
            l.e(futureSubmit, "{\n            super.subm…il(task, fail))\n        }");
            return futureSubmit;
        } catch (Exception e4) {
            k.Companion.e(TAG, "submit error with fail: " + e4);
            fail.run();
            return new com.vungle.ads.internal.executor.b(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> task) {
        l.f(task, "task");
        try {
            Future<T> futureSubmit = super.submit(Companion.getWrappedCallableWithFallback(task, c.INSTANCE));
            l.e(futureSubmit, "{\n            super.subm…\n            })\n        }");
            return futureSubmit;
        } catch (Exception e4) {
            k.Companion.e(TAG, "submit callable: " + e4);
            return new com.vungle.ads.internal.executor.b(null);
        }
    }
}
