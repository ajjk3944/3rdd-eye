package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.d1;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class m0 extends d1 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: h, reason: collision with root package name */
    public static final m0 f22576h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f22577i;

    static {
        Long l10;
        m0 m0Var = new m0();
        f22576h = m0Var;
        c1.h0(m0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f22577i = timeUnit.toNanos(l10.longValue());
    }

    public final synchronized void G0() {
        if (J0()) {
            debugStatus = 3;
            A0();
            kotlin.jvm.internal.p.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread H0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(m0.class.getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean I0() {
        return debugStatus == 4;
    }

    public final boolean J0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    public final synchronized boolean K0() {
        if (J0()) {
            return false;
        }
        debugStatus = 1;
        kotlin.jvm.internal.p.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void L0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.d1, kotlinx.coroutines.q0
    public y0 e(long j10, Runnable runnable, kotlin.coroutines.d dVar) {
        return D0(j10, runnable);
    }

    @Override // kotlinx.coroutines.e1
    public Thread n0() {
        Thread thread = _thread;
        return thread == null ? H0() : thread;
    }

    @Override // kotlinx.coroutines.e1
    public void o0(long j10, d1.c cVar) {
        L0();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zY0;
        p2.f22589a.d(this);
        c.a();
        try {
            if (!K0()) {
                if (zY0) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jK0 = k0();
                if (jK0 == Long.MAX_VALUE) {
                    c.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f22577i + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        G0();
                        c.a();
                        if (y0()) {
                            return;
                        }
                        n0();
                        return;
                    }
                    jK0 = q9.e.e(jK0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jK0 > 0) {
                    if (J0()) {
                        _thread = null;
                        G0();
                        c.a();
                        if (y0()) {
                            return;
                        }
                        n0();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, jK0);
                }
            }
        } finally {
            _thread = null;
            G0();
            c.a();
            if (!y0()) {
                n0();
            }
        }
    }

    @Override // kotlinx.coroutines.d1, kotlinx.coroutines.c1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // kotlinx.coroutines.d1
    public void t0(Runnable runnable) {
        if (I0()) {
            L0();
        }
        super.t0(runnable);
    }
}
