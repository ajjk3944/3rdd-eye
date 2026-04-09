package com.vungle.ads.internal.executor;

import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y8.s;

/* loaded from: classes3.dex */
public final class VungleThreadPoolExecutor extends ThreadPoolExecutor {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final String TAG = "VungleThreadPool";

    @Nullable
    private final c threadFactory;

    public static final class a {

        /* renamed from: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$a$a, reason: collision with other inner class name */
        public static final class C0366a extends com.vungle.ads.internal.task.e implements b {
            final /* synthetic */ Runnable $command;
            final /* synthetic */ Runnable $fail;

            public C0366a(Runnable runnable, Runnable runnable2) {
                this.$command = runnable;
                this.$fail = runnable2;
            }

            @Override // com.vungle.ads.internal.task.e, java.lang.Comparable
            public int compareTo(@NotNull Object other) {
                p.e(other, "other");
                if (!(other instanceof com.vungle.ads.internal.task.e)) {
                    return 0;
                }
                return p.f(((com.vungle.ads.internal.task.e) other).getPriority(), getPriority());
            }

            @Override // com.vungle.ads.internal.task.e
            public int getPriority() {
                return ((com.vungle.ads.internal.task.e) this.$command).getPriority();
            }

            @Override // java.lang.Runnable
            public void run() {
                VungleThreadPoolExecutor.Companion.wrapRunnableWithFail(this.$command, this.$fail);
            }
        }

        public static final class b implements b {
            final /* synthetic */ Runnable $command;
            final /* synthetic */ Runnable $fail;

            public b(Runnable runnable, Runnable runnable2) {
                this.$command = runnable;
                this.$fail = runnable2;
            }

            @Override // java.lang.Comparable
            public int compareTo(@NotNull Object other) {
                p.e(other, "other");
                Runnable runnable = this.$command;
                if (runnable instanceof com.vungle.ads.internal.task.e) {
                    return ((com.vungle.ads.internal.task.e) runnable).compareTo(other);
                }
                return 0;
            }

            @Override // java.lang.Runnable
            public void run() {
                VungleThreadPoolExecutor.Companion.wrapRunnableWithFail(this.$command, this.$fail);
            }
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> Callable<T> getWrappedCallableWithFallback(final Callable<T> callable, final l9.a aVar) {
            return new Callable() { // from class: com.vungle.ads.internal.executor.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return VungleThreadPoolExecutor.a.m314getWrappedCallableWithFallback$lambda0(callable, aVar);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: getWrappedCallableWithFallback$lambda-0, reason: not valid java name */
        public static final Object m314getWrappedCallableWithFallback$lambda0(Callable command, l9.a failFallback) {
            p.e(command, "$command");
            p.e(failFallback, "$failFallback");
            try {
                return command.call();
            } catch (OutOfMemoryError unused) {
                failFallback.invoke();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b getWrappedRunnableWithFail(Runnable runnable, Runnable runnable2) {
            return runnable instanceof com.vungle.ads.internal.task.e ? new C0366a(runnable, runnable2) : new b(runnable, runnable2);
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

    public interface b extends Comparable, Runnable {
    }

    public VungleThreadPoolExecutor(int i10, int i11, long j10, @Nullable TimeUnit timeUnit, @Nullable BlockingQueue<Runnable> blockingQueue, @Nullable c cVar) {
        super(i10, i11, j10, timeUnit, blockingQueue, cVar);
        this.threadFactory = cVar;
        allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: execute$lambda-0, reason: not valid java name */
    public static final void m311execute$lambda0(VungleThreadPoolExecutor this$0) {
        p.e(this$0, "this$0");
        new OutOfMemory("execute error in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String executorName() {
        String name;
        c cVar = this.threadFactory;
        return (cVar == null || (name = cVar.getName()) == null) ? "VungleThreadPoolExecutor" : name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submit$lambda-1, reason: not valid java name */
    public static final void m312submit$lambda1(VungleThreadPoolExecutor this$0) {
        p.e(this$0, "this$0");
        new OutOfMemory("submit error in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submit$lambda-2, reason: not valid java name */
    public static final void m313submit$lambda2(VungleThreadPoolExecutor this$0) {
        p.e(this$0, "this$0");
        new OutOfMemory("submit error with result in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(@NotNull Runnable command) {
        p.e(command, "command");
        try {
            super.execute(Companion.getWrappedRunnableWithFail(command, new Runnable() { // from class: com.vungle.ads.internal.executor.f
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m311execute$lambda0(this.f20166a);
                }
            }));
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "execute exception", e10);
        } catch (OutOfMemoryError e11) {
            String str = "execute error in " + executorName() + ": " + e11.getLocalizedMessage();
            com.vungle.ads.internal.util.p.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    @Nullable
    public final c getThreadFactory() {
        return this.threadFactory;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    @NotNull
    public Future<?> submit(@NotNull Runnable task) {
        p.e(task, "task");
        try {
            Future<?> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(task, new Runnable() { // from class: com.vungle.ads.internal.executor.g
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m312submit$lambda1(this.f20167a);
                }
            }));
            p.d(futureSubmit, "{\n            super.subm…\n            })\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "submit exception", e10);
            return new com.vungle.ads.internal.executor.b(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error in " + executorName() + ": " + e11.getLocalizedMessage();
            com.vungle.ads.internal.util.p.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new com.vungle.ads.internal.executor.b(null);
        }
    }

    @NotNull
    public final Future<?> submit$vungle_ads_release(@NotNull Runnable task, @NotNull Runnable fail) {
        p.e(task, "task");
        p.e(fail, "fail");
        try {
            Future<?> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(task, fail));
            p.d(futureSubmit, "{\n            super.subm…il(task, fail))\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "submit exception with fail", e10);
            fail.run();
            return new com.vungle.ads.internal.executor.b(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error with fail in " + executorName() + ": " + e11.getLocalizedMessage();
            com.vungle.ads.internal.util.p.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            fail.run();
            return new com.vungle.ads.internal.executor.b(null);
        }
    }

    public final void execute(@NotNull Runnable command, @NotNull Runnable fail) {
        p.e(command, "command");
        p.e(fail, "fail");
        try {
            super.execute(Companion.getWrappedRunnableWithFail(command, fail));
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "execute exception with fail", e10);
            fail.run();
        } catch (OutOfMemoryError e11) {
            String str = "execute error with fail in " + executorName() + ": " + e11.getLocalizedMessage();
            com.vungle.ads.internal.util.p.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            fail.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    @NotNull
    public <T> Future<T> submit(@NotNull Runnable task, T t10) {
        p.e(task, "task");
        try {
            Future<T> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(task, new Runnable() { // from class: com.vungle.ads.internal.executor.e
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m313submit$lambda2(this.f20165a);
                }
            }), t10);
            p.d(futureSubmit, "{\n            super.subm…     }, result)\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "submit exception with result", e10);
            return new com.vungle.ads.internal.executor.b(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error with result in " + executorName() + ": " + e11.getLocalizedMessage();
            com.vungle.ads.internal.util.p.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new com.vungle.ads.internal.executor.b(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    @NotNull
    public <T> Future<T> submit(@NotNull Callable<T> task) {
        p.e(task, "task");
        try {
            Future<T> futureSubmit = super.submit(Companion.getWrappedCallableWithFallback(task, new l9.a() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor.submit.3
                {
                    super(0);
                }

                @Override // l9.a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m315invoke();
                    return s.f25199a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m315invoke() {
                    new OutOfMemory("submit callable error in " + VungleThreadPoolExecutor.this.executorName()).logErrorNoReturnValue$vungle_ads_release();
                }
            }));
            p.d(futureSubmit, "override fun <T> submit(…Future<T>\n        }\n    }");
            return futureSubmit;
        } catch (Exception e10) {
            com.vungle.ads.internal.util.p.Companion.e(TAG, "submit exception callable: " + e10);
            return new com.vungle.ads.internal.executor.b(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error callable in " + executorName() + ": " + e11.getLocalizedMessage();
            com.vungle.ads.internal.util.p.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new com.vungle.ads.internal.executor.b(null);
        }
    }
}
