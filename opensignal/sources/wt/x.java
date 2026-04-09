package wt;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class x extends j0 implements Runnable {
    public static final x F;
    public static final long G;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l10;
        x xVar = new x();
        F = xVar;
        xVar.u0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        G = timeUnit.toNanos(l10.longValue());
    }

    public final synchronized void D0() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            j0.B.set(this, null);
            j0.D.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zB0;
        k1.f24632a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    if (zB0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jV0 = v0();
                    if (jV0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = G + jNanoTime;
                        }
                        long j7 = j - jNanoTime;
                        if (j7 <= 0) {
                            _thread = null;
                            D0();
                            if (B0()) {
                                return;
                            }
                            t0();
                            return;
                        }
                        if (jV0 > j7) {
                            jV0 = j7;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jV0 > 0) {
                        int i11 = debugStatus;
                        if (i11 == 2 || i11 == 3) {
                            _thread = null;
                            D0();
                            if (B0()) {
                                return;
                            }
                            t0();
                            return;
                        }
                        LockSupport.parkNanos(this, jV0);
                    }
                }
            }
        } finally {
            _thread = null;
            D0();
            if (!B0()) {
                t0();
            }
        }
    }

    @Override // wt.j0, wt.k0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // wt.k0
    public final Thread t0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(F.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // wt.q
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // wt.k0
    public final void x0(long j, h0 h0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // wt.j0
    public final void y0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.y0(runnable);
    }
}
