package ch;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h extends ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final cj.a f3945a;

    public h(cj.a aVar, ThreadFactory threadFactory) {
        super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        this.f3945a = aVar;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) throws ExecutionException, InterruptedException {
        super.afterExecute(runnable, th2);
        if (th2 == null && (runnable instanceof Future)) {
            try {
                Future future = (Future) runnable;
                if (future.isDone()) {
                    future.get();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException e4) {
                e = e4;
                th2 = e;
            } catch (ExecutionException e10) {
                th2 = e10.getCause();
            } catch (Exception e11) {
                e = e11;
                th2 = e;
            }
        }
        if (th2 == null || (th2 instanceof CancellationException)) {
            return;
        }
        n.e("LoggingThreadPoolExecut", th2);
        this.f3945a.getClass();
        cj.a.G(th2);
    }
}
