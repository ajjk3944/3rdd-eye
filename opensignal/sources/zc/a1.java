package zc;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a1 extends j1 {
    public static final AtomicLong H = new AtomicLong(Long.MIN_VALUE);
    public final LinkedBlockingQueue B;
    public final x0 D;
    public final x0 E;
    public final Object F;
    public final Semaphore G;

    /* renamed from: r, reason: collision with root package name */
    public z0 f26854r;

    /* renamed from: x, reason: collision with root package name */
    public z0 f26855x;

    /* renamed from: y, reason: collision with root package name */
    public final PriorityBlockingQueue f26856y;

    public a1(c1 c1Var) {
        super(c1Var);
        this.F = new Object();
        this.G = new Semaphore(2);
        this.f26856y = new PriorityBlockingQueue();
        this.B = new LinkedBlockingQueue();
        this.D = new x0(this, "Thread death: Uncaught exception on worker thread");
        this.E = new x0(this, "Thread death: Uncaught exception on network thread");
    }

    public final y0 A1(Callable callable) {
        u1();
        y0 y0Var = new y0(this, callable, true);
        if (Thread.currentThread() == this.f26854r) {
            y0Var.run();
            return y0Var;
        }
        F1(y0Var);
        return y0Var;
    }

    public final void B1(Runnable runnable) {
        u1();
        cc.s.h(runnable);
        F1(new y0(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object C1(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            a1 a1Var = ((c1) this.f1504d).B;
            c1.g(a1Var);
            a1Var.B1(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                j0 j0Var = ((c1) this.f1504d).f26889y;
                c1.g(j0Var);
                su.b bVar = j0Var.F;
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                bVar.b(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            j0 j0Var2 = ((c1) this.f1504d).f26889y;
            c1.g(j0Var2);
            j0Var2.F.b("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void D1(Runnable runnable) {
        u1();
        F1(new y0(this, runnable, true, "Task exception on worker thread"));
    }

    public final void E1(Runnable runnable) {
        u1();
        y0 y0Var = new y0(this, runnable, false, "Task exception on network thread");
        synchronized (this.F) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.B;
                linkedBlockingQueue.add(y0Var);
                z0 z0Var = this.f26855x;
                if (z0Var == null) {
                    z0 z0Var2 = new z0(this, "Measurement Network", linkedBlockingQueue);
                    this.f26855x = z0Var2;
                    z0Var2.setUncaughtExceptionHandler(this.E);
                    this.f26855x.start();
                } else {
                    Object obj = z0Var.f27279a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void F1(y0 y0Var) {
        synchronized (this.F) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f26856y;
                priorityBlockingQueue.add(y0Var);
                z0 z0Var = this.f26854r;
                if (z0Var == null) {
                    z0 z0Var2 = new z0(this, "Measurement Worker", priorityBlockingQueue);
                    this.f26854r = z0Var2;
                    z0Var2.setUncaughtExceptionHandler(this.D);
                    this.f26854r.start();
                } else {
                    Object obj = z0Var.f27279a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.lifecycle.o
    public final void s1() {
        if (Thread.currentThread() != this.f26854r) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // zc.j1
    public final boolean t1() {
        return false;
    }

    public final void w1() {
        if (Thread.currentThread() != this.f26855x) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void x1() {
        if (Thread.currentThread() == this.f26854r) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean y1() {
        return Thread.currentThread() == this.f26854r;
    }

    public final y0 z1(Callable callable) {
        u1();
        y0 y0Var = new y0(this, callable, false);
        if (Thread.currentThread() != this.f26854r) {
            F1(y0Var);
            return y0Var;
        }
        if (!this.f26856y.isEmpty()) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.F.b("Callable skipped the worker queue.");
        }
        y0Var.run();
        return y0Var;
    }
}
