package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class nq3 extends AtomicReference implements Runnable {
    public static final vr f;
    public static final vr g;

    static {
        int i = 9;
        f = new vr(i);
        g = new vr(i);
    }

    public abstract Object a();

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        mq3 mq3Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof mq3;
            vr vrVar = g;
            if (!z2) {
                if (runnable != vrVar) {
                    break;
                }
            } else {
                mq3Var = (mq3) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == vrVar || compareAndSet(runnable, vrVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(mq3Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract String c();

    public abstract boolean d();

    public abstract void e(Object obj);

    public abstract void f(Throwable th);

    public final void g() {
        vr vrVar = g;
        vr vrVar2 = f;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            mq3 mq3Var = new mq3(this);
            mq3Var.a(Thread.currentThread());
            if (compareAndSet(runnable, mq3Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(vrVar2)) == vrVar) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(vrVar2)) == vrVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            vr vrVar = f;
            if (!zD) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, vrVar)) {
                            b(threadCurrentThread);
                        }
                        f(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, vrVar)) {
                            b(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, vrVar)) {
                b(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            e(objA);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strL;
        Runnable runnable = (Runnable) get();
        if (runnable == f) {
            strL = "running=[DONE]";
        } else if (runnable instanceof mq3) {
            strL = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strL = ex0.l(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            strL = "running=[NOT STARTED YET]";
        }
        String strC = c();
        return ex0.l(new StringBuilder(strL.length() + 2 + String.valueOf(strC).length()), strL, ", ", strC);
    }
}
