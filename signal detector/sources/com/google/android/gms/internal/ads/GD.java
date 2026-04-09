package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class GD extends AtomicReference implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static final RunnableC1944u6 f8335a;

    /* renamed from: b, reason: collision with root package name */
    public static final RunnableC1944u6 f8336b;

    static {
        int i = 9;
        f8335a = new RunnableC1944u6(i);
        f8336b = new RunnableC1944u6(i);
    }

    public abstract Object a();

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        FD fd = null;
        boolean z6 = false;
        int i = 0;
        while (true) {
            boolean z7 = runnable instanceof FD;
            RunnableC1944u6 runnableC1944u6 = f8336b;
            if (!z7) {
                if (runnable != runnableC1944u6) {
                    break;
                }
            } else {
                fd = (FD) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC1944u6 || compareAndSet(runnable, runnableC1944u6)) {
                z6 = Thread.interrupted() || z6;
                LockSupport.park(fd);
            }
            runnable = (Runnable) get();
        }
        if (z6) {
            thread.interrupt();
        }
    }

    public abstract String c();

    public abstract boolean d();

    public abstract void e(Object obj);

    public abstract void f(Throwable th);

    public final void g() {
        RunnableC1944u6 runnableC1944u6 = f8336b;
        RunnableC1944u6 runnableC1944u62 = f8335a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            FD fd = new FD(this);
            fd.a(Thread.currentThread());
            if (compareAndSet(runnable, fd)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(runnableC1944u62)) == runnableC1944u6) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(runnableC1944u62)) == runnableC1944u6) {
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
            RunnableC1944u6 runnableC1944u6 = f8335a;
            if (!zD) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, runnableC1944u6)) {
                            b(threadCurrentThread);
                        }
                        f(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, runnableC1944u6)) {
                            b(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, runnableC1944u6)) {
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
        String strN;
        Runnable runnable = (Runnable) get();
        if (runnable == f8335a) {
            strN = "running=[DONE]";
        } else if (runnable instanceof FD) {
            strN = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strN = AbstractC1135f5.n(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            strN = "running=[NOT STARTED YET]";
        }
        String strC = c();
        return AbstractC1135f5.n(new StringBuilder(strN.length() + 2 + String.valueOf(strC).length()), strN, ", ", strC);
    }
}
