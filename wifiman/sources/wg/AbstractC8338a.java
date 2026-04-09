package wg;

import hg.InterfaceC6043c;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import mg.AbstractC6822a;

/* renamed from: wg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC8338a extends AtomicReference implements InterfaceC6043c {

    /* renamed from: d, reason: collision with root package name */
    protected static final FutureTask f64901d;

    /* renamed from: e, reason: collision with root package name */
    protected static final FutureTask f64902e;

    /* renamed from: a, reason: collision with root package name */
    protected final Runnable f64903a;

    /* renamed from: b, reason: collision with root package name */
    protected final boolean f64904b;

    /* renamed from: c, reason: collision with root package name */
    protected Thread f64905c;

    static {
        Runnable runnable = AbstractC6822a.f54015b;
        f64901d = new FutureTask(runnable, null);
        f64902e = new FutureTask(runnable, null);
    }

    AbstractC8338a(Runnable runnable, boolean z10) {
        this.f64903a = runnable;
        this.f64904b = z10;
    }

    private void a(Future future) {
        if (this.f64905c == Thread.currentThread()) {
            future.cancel(false);
        } else {
            future.cancel(this.f64904b);
        }
    }

    public final void c(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f64901d) {
                return;
            }
            if (future2 == f64902e) {
                a(future);
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // hg.InterfaceC6043c
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f64901d || future == (futureTask = f64902e) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        a(future);
    }

    @Override // hg.InterfaceC6043c
    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == f64901d || future == f64902e;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        String str;
        Future future = (Future) get();
        if (future == f64901d) {
            str = "Finished";
        } else if (future == f64902e) {
            str = "Disposed";
        } else if (this.f64905c != null) {
            str = "Running on " + this.f64905c;
        } else {
            str = "Waiting";
        }
        return getClass().getSimpleName() + "[" + str + "]";
    }
}
