package Ii;

import Ii.AbstractC3062j0;
import dh.InterfaceC5384i;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class T extends AbstractC3062j0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: i, reason: collision with root package name */
    public static final T f9282i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f9283j;

    static {
        Long l10;
        T t10 = new T();
        f9282i = t10;
        AbstractC3060i0.v0(t10, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f9283j = timeUnit.toNanos(l10.longValue());
    }

    private T() {
    }

    private final synchronized void V0() {
        if (Y0()) {
            debugStatus = 3;
            P0();
            AbstractC6492s.g(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread W0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f9282i.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean X0() {
        return debugStatus == 4;
    }

    private final boolean Y0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean Z0() {
        if (Y0()) {
            return false;
        }
        debugStatus = 1;
        AbstractC6492s.g(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void a1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // Ii.AbstractC3064k0
    protected Thread B0() {
        Thread thread = _thread;
        return thread == null ? W0() : thread;
    }

    @Override // Ii.AbstractC3064k0
    protected void C0(long j10, AbstractC3062j0.c cVar) {
        a1();
    }

    @Override // Ii.AbstractC3062j0
    public void H0(Runnable runnable) {
        if (X0()) {
            a1();
        }
        super.H0(runnable);
    }

    @Override // Ii.AbstractC3062j0, Ii.X
    public InterfaceC3052e0 p(long j10, Runnable runnable, InterfaceC5384i interfaceC5384i) {
        return S0(j10, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zN0;
        U0.f9286a.d(this);
        AbstractC3047c.a();
        try {
            if (!Z0()) {
                if (zN0) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jY0 = y0();
                if (jY0 == Long.MAX_VALUE) {
                    AbstractC3047c.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f9283j + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        V0();
                        AbstractC3047c.a();
                        if (N0()) {
                            return;
                        }
                        B0();
                        return;
                    }
                    jY0 = AbstractC7978m.h(jY0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jY0 > 0) {
                    if (Y0()) {
                        _thread = null;
                        V0();
                        AbstractC3047c.a();
                        if (N0()) {
                            return;
                        }
                        B0();
                        return;
                    }
                    AbstractC3047c.a();
                    LockSupport.parkNanos(this, jY0);
                }
            }
        } finally {
            _thread = null;
            V0();
            AbstractC3047c.a();
            if (!N0()) {
                B0();
            }
        }
    }

    @Override // Ii.AbstractC3062j0, Ii.AbstractC3060i0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // Ii.J
    public String toString() {
        return "DefaultExecutor";
    }
}
