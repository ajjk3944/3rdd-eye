package wg;

import hg.InterfaceC6043c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import mg.AbstractC6822a;
import r.Y;

/* loaded from: classes4.dex */
final class e implements Callable, InterfaceC6043c {

    /* renamed from: f, reason: collision with root package name */
    static final FutureTask f64943f = new FutureTask(AbstractC6822a.f54015b, null);

    /* renamed from: a, reason: collision with root package name */
    final Runnable f64944a;

    /* renamed from: d, reason: collision with root package name */
    final ExecutorService f64947d;

    /* renamed from: e, reason: collision with root package name */
    Thread f64948e;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference f64946c = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference f64945b = new AtomicReference();

    e(Runnable runnable, ExecutorService executorService) {
        this.f64944a = runnable;
        this.f64947d = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f64948e = Thread.currentThread();
        try {
            this.f64944a.run();
            this.f64948e = null;
            c(this.f64947d.submit(this));
            return null;
        } catch (Throwable th2) {
            this.f64948e = null;
            Eg.a.v(th2);
            throw th2;
        }
    }

    void b(Future future) {
        Future future2;
        do {
            future2 = (Future) this.f64946c.get();
            if (future2 == f64943f) {
                future.cancel(this.f64948e != Thread.currentThread());
                return;
            }
        } while (!Y.a(this.f64946c, future2, future));
    }

    void c(Future future) {
        Future future2;
        do {
            future2 = (Future) this.f64945b.get();
            if (future2 == f64943f) {
                future.cancel(this.f64948e != Thread.currentThread());
                return;
            }
        } while (!Y.a(this.f64945b, future2, future));
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        AtomicReference atomicReference = this.f64946c;
        FutureTask futureTask = f64943f;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.f64948e != Thread.currentThread());
        }
        Future future2 = (Future) this.f64945b.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.f64948e != Thread.currentThread());
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return this.f64946c.get() == f64943f;
    }
}
