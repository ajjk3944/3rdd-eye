package A9;

import A9.AbstractC0568b0;
import f9.InterfaceC4350h;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: DefaultExecutor.kt */
/* loaded from: classes3.dex */
public final class J extends AbstractC0568b0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final J f192j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f193k;

    static {
        Long l5;
        J j4 = new J();
        f192j = j4;
        j4.T0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l5 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l5 = 1000L;
        }
        f193k = timeUnit.toNanos(l5.longValue());
    }

    @Override // A9.AbstractC0568b0, A9.N
    public final W B0(long j4, P0 p02, InterfaceC4350h interfaceC4350h) {
        long j10 = j4 > 0 ? j4 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j4 : 0L;
        if (j10 >= 4611686018427387903L) {
            return E0.f187b;
        }
        long jNanoTime = System.nanoTime();
        AbstractC0568b0.b bVar = new AbstractC0568b0.b(j10 + jNanoTime, p02);
        b1(jNanoTime, bVar);
        return bVar;
    }

    @Override // A9.AbstractC0570c0
    public final Thread W0() {
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
                thread.setContextClassLoader(J.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // A9.AbstractC0570c0
    public final void X0(long j4, AbstractC0568b0.c cVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // A9.AbstractC0568b0
    public final void Y0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.Y0(runnable);
    }

    public final synchronized void c1() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC0568b0.f225g.set(this, null);
            AbstractC0568b0.f226h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA1;
        N0.f198a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zA1) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j4 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jU0 = U0();
                    if (jU0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j4 == Long.MAX_VALUE) {
                            j4 = f193k + jNanoTime;
                        }
                        long j10 = j4 - jNanoTime;
                        if (j10 <= 0) {
                            _thread = null;
                            c1();
                            if (a1()) {
                                return;
                            }
                            W0();
                            return;
                        }
                        if (jU0 > j10) {
                            jU0 = j10;
                        }
                    } else {
                        j4 = Long.MAX_VALUE;
                    }
                    if (jU0 > 0) {
                        int i10 = debugStatus;
                        if (i10 == 2 || i10 == 3) {
                            _thread = null;
                            c1();
                            if (a1()) {
                                return;
                            }
                            W0();
                            return;
                        }
                        LockSupport.parkNanos(this, jU0);
                    }
                }
            }
        } finally {
            _thread = null;
            c1();
            if (!a1()) {
                W0();
            }
        }
    }

    @Override // A9.AbstractC0568b0, A9.AbstractC0566a0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
