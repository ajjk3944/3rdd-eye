package ec;

import com.google.android.gms.internal.ads.or;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l1 extends v1 {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicLong f22858l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: d, reason: collision with root package name */
    public k1 f22859d;

    /* renamed from: e, reason: collision with root package name */
    public k1 f22860e;

    /* renamed from: f, reason: collision with root package name */
    public final PriorityBlockingQueue f22861f;
    public final LinkedBlockingQueue g;

    /* renamed from: h, reason: collision with root package name */
    public final i1 f22862h;

    /* renamed from: i, reason: collision with root package name */
    public final i1 f22863i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Semaphore f22864k;

    public l1(o1 o1Var) {
        super(o1Var);
        this.j = new Object();
        this.f22864k = new Semaphore(2);
        this.f22861f = new PriorityBlockingQueue();
        this.g = new LinkedBlockingQueue();
        this.f22862h = new i1(this, "Thread death: Uncaught exception on worker thread");
        this.f22863i = new i1(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // a8.a
    public final void B() {
        if (Thread.currentThread() != this.f22859d) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // ec.v1
    public final boolean C() {
        return false;
    }

    public final void F() {
        if (Thread.currentThread() != this.f22860e) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void G() {
        if (Thread.currentThread() == this.f22859d) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean H() {
        return Thread.currentThread() == this.f22859d;
    }

    public final j1 I(Callable callable) {
        D();
        j1 j1Var = new j1(this, callable, false);
        if (Thread.currentThread() != this.f22859d) {
            O(j1Var);
            return j1Var;
        }
        if (!this.f22861f.isEmpty()) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.j.d("Callable skipped the worker queue.");
        }
        j1Var.run();
        return j1Var;
    }

    public final j1 J(Callable callable) {
        D();
        j1 j1Var = new j1(this, callable, true);
        if (Thread.currentThread() == this.f22859d) {
            j1Var.run();
            return j1Var;
        }
        O(j1Var);
        return j1Var;
    }

    public final void K(Runnable runnable) {
        D();
        pb.y.h(runnable);
        O(new j1(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object L(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            l1 l1Var = ((o1) this.f218b).g;
            o1.m(l1Var);
            l1Var.K(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                s0 s0Var = ((o1) this.f218b).f22954f;
                o1.m(s0Var);
                or orVar = s0Var.j;
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                orVar.d(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            s0 s0Var2 = ((o1) this.f218b).f22954f;
            o1.m(s0Var2);
            s0Var2.j.d("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void M(Runnable runnable) {
        D();
        O(new j1(this, runnable, true, "Task exception on worker thread"));
    }

    public final void N(Runnable runnable) {
        D();
        j1 j1Var = new j1(this, runnable, false, "Task exception on network thread");
        synchronized (this.j) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.g;
                linkedBlockingQueue.add(j1Var);
                k1 k1Var = this.f22860e;
                if (k1Var == null) {
                    k1 k1Var2 = new k1(this, "Measurement Network", linkedBlockingQueue);
                    this.f22860e = k1Var2;
                    k1Var2.setUncaughtExceptionHandler(this.f22863i);
                    this.f22860e.start();
                } else {
                    k1Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void O(j1 j1Var) {
        synchronized (this.j) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f22861f;
                priorityBlockingQueue.add(j1Var);
                k1 k1Var = this.f22859d;
                if (k1Var == null) {
                    k1 k1Var2 = new k1(this, "Measurement Worker", priorityBlockingQueue);
                    this.f22859d = k1Var2;
                    k1Var2.setUncaughtExceptionHandler(this.f22862h);
                    this.f22859d.start();
                } else {
                    k1Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
