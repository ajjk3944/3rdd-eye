package ej;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public class E {

    /* renamed from: e, reason: collision with root package name */
    public static final b f46436e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final E f46437f = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f46438a;

    /* renamed from: b, reason: collision with root package name */
    private long f46439b;

    /* renamed from: c, reason: collision with root package name */
    private long f46440c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Object f46441d;

    public static final class a extends E {
        a() {
        }

        @Override // ej.E
        public E e(long j10) {
            return this;
        }

        @Override // ej.E
        public void g() {
        }

        @Override // ej.E
        public E h(long j10, TimeUnit unit) {
            AbstractC6492s.i(unit, "unit");
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(long j10, long j11) {
            return (j10 != 0 && (j11 == 0 || j10 < j11)) ? j10 : j11;
        }

        private b() {
        }
    }

    public void a(Condition condition) throws InterruptedException, InterruptedIOException {
        AbstractC6492s.i(condition, "condition");
        try {
            boolean zF = f();
            long jI = i();
            if (!zF && jI == 0) {
                condition.await();
                return;
            }
            if (zF && jI != 0) {
                jI = Math.min(jI, d() - System.nanoTime());
            } else if (zF) {
                jI = d() - System.nanoTime();
            }
            if (jI <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.f46441d;
            if (condition.awaitNanos(jI) <= 0 && this.f46441d == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public E b() {
        this.f46438a = false;
        return this;
    }

    public E c() {
        this.f46440c = 0L;
        return this;
    }

    public long d() {
        if (this.f46438a) {
            return this.f46439b;
        }
        throw new IllegalStateException("No deadline");
    }

    public E e(long j10) {
        this.f46438a = true;
        this.f46439b = j10;
        return this;
    }

    public boolean f() {
        return this.f46438a;
    }

    public void g() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f46438a && this.f46439b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public E h(long j10, TimeUnit unit) {
        AbstractC6492s.i(unit, "unit");
        if (j10 >= 0) {
            this.f46440c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long i() {
        return this.f46440c;
    }

    public void j(Object monitor) throws InterruptedException, InterruptedIOException {
        AbstractC6492s.i(monitor, "monitor");
        try {
            boolean zF = f();
            long jI = i();
            if (!zF && jI == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime = System.nanoTime();
            if (zF && jI != 0) {
                jI = Math.min(jI, d() - jNanoTime);
            } else if (zF) {
                jI = d() - jNanoTime;
            }
            if (jI <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.f46441d;
            long j10 = jI / 1000000;
            monitor.wait(j10, (int) (jI - (1000000 * j10)));
            if (System.nanoTime() - jNanoTime >= jI && this.f46441d == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
