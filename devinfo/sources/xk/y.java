package xk;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y extends p0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final y j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f37260k;

    static {
        Long l10;
        y yVar = new y();
        j = yVar;
        yVar.a0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f37260k = timeUnit.toNanos(l10.longValue());
    }

    @Override // xk.p0, xk.b0
    public final i0 F(long j8, Runnable runnable, ck.h hVar) {
        long j9 = j8 > 0 ? j8 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j8 : 0L;
        if (j9 >= 4611686018427387903L) {
            return j1.f37202a;
        }
        long jNanoTime = System.nanoTime();
        m0 m0Var = new m0(runnable, j9 + jNanoTime);
        i0(jNanoTime, m0Var);
        return m0Var;
    }

    @Override // xk.q0
    public final Thread Z() {
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
                thread.setContextClassLoader(j.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // xk.q0
    public final void d0(long j8, n0 n0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // xk.p0
    public final void e0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.e0(runnable);
    }

    public final synchronized void j0() {
        int i4 = debugStatus;
        if (i4 == 2 || i4 == 3) {
            debugStatus = 3;
            p0.g.set(this, null);
            p0.f37220h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zH0;
        n1.f37210a.set(this);
        try {
            synchronized (this) {
                int i4 = debugStatus;
                if (i4 == 2 || i4 == 3) {
                    if (zH0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j8 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jB0 = b0();
                    if (jB0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j8 == Long.MAX_VALUE) {
                            j8 = f37260k + jNanoTime;
                        }
                        long j9 = j8 - jNanoTime;
                        if (j9 <= 0) {
                            _thread = null;
                            j0();
                            if (h0()) {
                                return;
                            }
                            Z();
                            return;
                        }
                        if (jB0 > j9) {
                            jB0 = j9;
                        }
                    } else {
                        j8 = Long.MAX_VALUE;
                    }
                    if (jB0 > 0) {
                        int i10 = debugStatus;
                        if (i10 == 2 || i10 == 3) {
                            _thread = null;
                            j0();
                            if (h0()) {
                                return;
                            }
                            Z();
                            return;
                        }
                        LockSupport.parkNanos(this, jB0);
                    }
                }
            }
        } finally {
            _thread = null;
            j0();
            if (!h0()) {
                Z();
            }
        }
    }

    @Override // xk.p0, xk.q0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // xk.r
    public final String toString() {
        return "DefaultExecutor";
    }
}
