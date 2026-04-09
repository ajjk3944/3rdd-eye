package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class an extends et implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final an n;
    public static final long o;

    static {
        Long l;
        an anVar = new an();
        n = anVar;
        anVar.o(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        o = timeUnit.toNanos(l.longValue());
    }

    @Override // defpackage.et, defpackage.zn
    public final jp c(long j, u11 u11Var, hk hkVar) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return ph0.f;
        }
        long jNanoTime = System.nanoTime();
        bt btVar = new bt(j2 + jNanoTime, u11Var);
        v(jNanoTime, btVar);
        return btVar;
    }

    @Override // defpackage.ft
    public final Thread n() {
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
                thread.setContextClassLoader(an.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // defpackage.ft
    public final void q(long j, ct ctVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.et
    public final void r(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.r(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zT;
        p11.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zT) {
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
                    long jU = u();
                    if (jU == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = o + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            w();
                            if (t()) {
                                return;
                            }
                            n();
                            return;
                        }
                        if (jU > j2) {
                            jU = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jU > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            w();
                            if (t()) {
                                return;
                            }
                            n();
                            return;
                        }
                        LockSupport.parkNanos(this, jU);
                    }
                }
            }
        } finally {
            _thread = null;
            w();
            if (!t()) {
                n();
            }
        }
    }

    @Override // defpackage.et, defpackage.ft
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void w() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            et.k.set(this, null);
            et.l.set(this, null);
            notifyAll();
        }
    }
}
