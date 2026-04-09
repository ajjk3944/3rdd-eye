package o0;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class h {

    public static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public String f23563a;

        /* renamed from: b, reason: collision with root package name */
        public int f23564b;

        /* renamed from: o0.h$a$a, reason: collision with other inner class name */
        public static class C0440a extends Thread {

            /* renamed from: a, reason: collision with root package name */
            public final int f23565a;

            public C0440a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f23565a = i10;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(this.f23565a);
                super.run();
            }
        }

        public a(String str, int i10) {
            this.f23563a = str;
            this.f23564b = i10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0440a(runnable, this.f23563a, this.f23564b);
        }
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public Callable f23566a;

        /* renamed from: b, reason: collision with root package name */
        public r0.b f23567b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f23568c;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r0.b f23569a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f23570b;

            public a(r0.b bVar, Object obj) {
                this.f23569a = bVar;
                this.f23570b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f23569a.accept(this.f23570b);
            }
        }

        public b(Handler handler, Callable callable, r0.b bVar) {
            this.f23566a = callable;
            this.f23567b = bVar;
            this.f23568c = handler;
        }

        @Override // java.lang.Runnable
        public void run() throws Exception {
            Object objCall;
            try {
                objCall = this.f23566a.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f23568c.post(new a(this.f23567b, objCall));
        }
    }

    public static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void b(Executor executor, Callable callable, r0.b bVar) {
        executor.execute(new b(o0.a.a(), callable, bVar));
    }

    public static Object c(ExecutorService executorService, Callable callable, int i10) throws InterruptedException {
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
