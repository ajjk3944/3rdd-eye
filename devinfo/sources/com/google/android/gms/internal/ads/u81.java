package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class u81 extends AtomicReference implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static final ce f17128a;

    /* renamed from: b, reason: collision with root package name */
    public static final ce f17129b;

    static {
        int i4 = 9;
        f17128a = new ce(i4);
        f17129b = new ce(i4);
    }

    public abstract Object a();

    public final void b(Thread thread) {
        Runnable runnable = (Runnable) get();
        t81 t81Var = null;
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            boolean z10 = runnable instanceof t81;
            ce ceVar = f17129b;
            if (!z10) {
                if (runnable != ceVar) {
                    break;
                }
            } else {
                t81Var = (t81) runnable;
            }
            i4++;
            if (i4 <= 1000) {
                Thread.yield();
            } else if (runnable == ceVar || compareAndSet(runnable, ceVar)) {
                z3 = Thread.interrupted() || z3;
                LockSupport.park(t81Var);
            }
            runnable = (Runnable) get();
        }
        if (z3) {
            thread.interrupt();
        }
    }

    public abstract String c();

    public abstract boolean d();

    public abstract void e(Object obj);

    public abstract void f(Throwable th2);

    public final void g() {
        ce ceVar = f17129b;
        ce ceVar2 = f17128a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            t81 t81Var = new t81(this);
            t81Var.a(Thread.currentThread());
            if (compareAndSet(runnable, t81Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(ceVar2)) == ceVar) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th2) {
                    if (((Runnable) getAndSet(ceVar2)) == ceVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th2;
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
            ce ceVar = f17128a;
            if (!zD) {
                try {
                    objA = a();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, ceVar)) {
                            b(threadCurrentThread);
                        }
                        f(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, ceVar)) {
                            b(threadCurrentThread);
                        }
                        e(null);
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, ceVar)) {
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
        String strM;
        Runnable runnable = (Runnable) get();
        if (runnable == f17128a) {
            strM = "running=[DONE]";
        } else if (runnable instanceof t81) {
            strM = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strM = r5.c.m(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            strM = "running=[NOT STARTED YET]";
        }
        String strC = c();
        return r5.c.m(new StringBuilder(strM.length() + 2 + String.valueOf(strC).length()), strM, ", ", strC);
    }
}
