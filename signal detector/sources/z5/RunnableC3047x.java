package z5;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: z5.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC3047x extends J implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final RunnableC3047x i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f24567j;

    static {
        Long l2;
        RunnableC3047x runnableC3047x = new RunnableC3047x();
        i = runnableC3047x;
        runnableC3047x.q(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f24567j = timeUnit.toNanos(l2.longValue());
    }

    @Override // z5.K
    public final Thread p() {
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
                thread.setContextClassLoader(RunnableC3047x.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zV;
        j0.f24536a.set(this);
        try {
            synchronized (this) {
                int i3 = debugStatus;
                if (i3 == 2 || i3 == 3) {
                    if (zV) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j6 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jW = w();
                    if (jW == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j6 == Long.MAX_VALUE) {
                            j6 = f24567j + jNanoTime;
                        }
                        long j7 = j6 - jNanoTime;
                        if (j7 <= 0) {
                            _thread = null;
                            y();
                            if (v()) {
                                return;
                            }
                            p();
                            return;
                        }
                        if (jW > j7) {
                            jW = j7;
                        }
                    } else {
                        j6 = Long.MAX_VALUE;
                    }
                    if (jW > 0) {
                        int i6 = debugStatus;
                        if (i6 == 2 || i6 == 3) {
                            _thread = null;
                            y();
                            if (v()) {
                                return;
                            }
                            p();
                            return;
                        }
                        LockSupport.parkNanos(this, jW);
                    }
                }
            }
        } finally {
            _thread = null;
            y();
            if (!v()) {
                p();
            }
        }
    }

    @Override // z5.K
    public final void s(long j6, H h6) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // z5.J, z5.K
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // z5.J
    public final void t(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.t(runnable);
    }

    public final synchronized void y() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            J.f24493f.set(this, null);
            J.f24494g.set(this, null);
            notifyAll();
        }
    }
}
