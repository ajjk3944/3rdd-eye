package B1;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
abstract class l {

    private static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private String f1082a;

        /* renamed from: b, reason: collision with root package name */
        private int f1083b;

        /* renamed from: B1.l$a$a, reason: collision with other inner class name */
        private static class C0043a extends Thread {

            /* renamed from: a, reason: collision with root package name */
            private final int f1084a;

            C0043a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f1084a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(this.f1084a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f1082a = str;
            this.f1083b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0043a(runnable, this.f1082a, this.f1083b);
        }
    }

    private static class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f1085a;

        b(Handler handler) {
            this.f1085a = (Handler) E1.h.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f1085a.post((Runnable) E1.h.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f1085a + " is shutting down");
        }
    }

    private static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Callable f1086a;

        /* renamed from: b, reason: collision with root package name */
        private E1.a f1087b;

        /* renamed from: c, reason: collision with root package name */
        private Handler f1088c;

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ E1.a f1089a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f1090b;

            a(E1.a aVar, Object obj) {
                this.f1089a = aVar;
                this.f1090b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f1089a.accept(this.f1090b);
            }
        }

        c(Handler handler, Callable callable, E1.a aVar) {
            this.f1086a = callable;
            this.f1087b = aVar;
            this.f1088c = handler;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            Object objCall;
            try {
                objCall = this.f1086a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f1088c.post(new a(this.f1087b, objCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static void c(Executor executor, Callable callable, E1.a aVar) {
        executor.execute(new c(B1.b.a(), callable, aVar));
    }

    static Object d(ExecutorService executorService, Callable callable, int i10) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw e10;
        } catch (ExecutionException e11) {
            throw new RuntimeException(e11);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
