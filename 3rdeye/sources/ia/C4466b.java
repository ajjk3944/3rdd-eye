package ia;

import A9.I;
import b9.C1992A;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p9.InterfaceC5480a;

/* compiled from: AsyncTimeout.kt */
/* renamed from: ia.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4466b extends D {
    private static final a Companion = new a();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static C4466b head;
    private static final ReentrantLock lock;
    private C4466b next;
    private int state;
    private long timeoutAt;

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: ia.b$a */
    public static final class a {
        public static final void a(a aVar, C4466b c4466b, long j4, boolean z10) {
            aVar.getClass();
            if (C4466b.head == null) {
                C4466b.head = new C4466b();
                C0468b c0468b = new C0468b("Okio Watchdog");
                c0468b.setDaemon(true);
                c0468b.start();
            }
            long jNanoTime = System.nanoTime();
            if (j4 != 0 && z10) {
                c4466b.timeoutAt = Math.min(j4, c4466b.deadlineNanoTime() - jNanoTime) + jNanoTime;
            } else if (j4 != 0) {
                c4466b.timeoutAt = j4 + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                c4466b.timeoutAt = c4466b.deadlineNanoTime();
            }
            long jRemainingNanos = c4466b.remainingNanos(jNanoTime);
            C4466b c4466b2 = C4466b.head;
            kotlin.jvm.internal.l.c(c4466b2);
            while (c4466b2.next != null) {
                C4466b c4466b3 = c4466b2.next;
                kotlin.jvm.internal.l.c(c4466b3);
                if (jRemainingNanos < c4466b3.remainingNanos(jNanoTime)) {
                    break;
                }
                c4466b2 = c4466b2.next;
                kotlin.jvm.internal.l.c(c4466b2);
            }
            c4466b.next = c4466b2.next;
            c4466b2.next = c4466b;
            if (c4466b2 == C4466b.head) {
                C4466b.condition.signal();
            }
        }

        public static final void b(a aVar, C4466b c4466b) {
            aVar.getClass();
            for (C4466b c4466b2 = C4466b.head; c4466b2 != null; c4466b2 = c4466b2.next) {
                if (c4466b2.next == c4466b) {
                    c4466b2.next = c4466b.next;
                    c4466b.next = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public static C4466b c() throws InterruptedException {
            C4466b c4466b = C4466b.head;
            kotlin.jvm.internal.l.c(c4466b);
            C4466b c4466b2 = c4466b.next;
            if (c4466b2 == null) {
                long jNanoTime = System.nanoTime();
                C4466b.condition.await(C4466b.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                C4466b c4466b3 = C4466b.head;
                kotlin.jvm.internal.l.c(c4466b3);
                if (c4466b3.next != null || System.nanoTime() - jNanoTime < C4466b.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return C4466b.head;
            }
            long jRemainingNanos = c4466b2.remainingNanos(System.nanoTime());
            if (jRemainingNanos > 0) {
                C4466b.condition.await(jRemainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            C4466b c4466b4 = C4466b.head;
            kotlin.jvm.internal.l.c(c4466b4);
            c4466b4.next = c4466b2.next;
            c4466b2.next = null;
            c4466b2.state = 2;
            return c4466b2;
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: ia.b$b, reason: collision with other inner class name */
    public static final class C0468b extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            C4466b c4466bC;
            while (true) {
                try {
                    C4466b.Companion.getClass();
                    reentrantLock = C4466b.lock;
                    reentrantLock.lock();
                    try {
                        C4466b.Companion.getClass();
                        c4466bC = a.c();
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c4466bC == C4466b.head) {
                    a unused2 = C4466b.Companion;
                    C4466b.head = null;
                    return;
                } else {
                    C1992A c1992a = C1992A.f18074a;
                    reentrantLock.unlock();
                    if (c4466bC != null) {
                        c4466bC.timedOut();
                    }
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: ia.b$c */
    public static final class c implements A {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ A f38639c;

        public c(A a10) {
            this.f38639c = a10;
        }

        @Override // ia.A, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            A a10 = this.f38639c;
            C4466b c4466b = C4466b.this;
            c4466b.enter();
            try {
                a10.close();
                C1992A c1992a = C1992A.f18074a;
                if (c4466b.exit()) {
                    throw c4466b.access$newTimeoutException(null);
                }
            } catch (IOException e4) {
                if (!c4466b.exit()) {
                    throw e4;
                }
                throw c4466b.access$newTimeoutException(e4);
            } finally {
                c4466b.exit();
            }
        }

        @Override // ia.A, java.io.Flushable
        public final void flush() throws IOException {
            A a10 = this.f38639c;
            C4466b c4466b = C4466b.this;
            c4466b.enter();
            try {
                a10.flush();
                C1992A c1992a = C1992A.f18074a;
                if (c4466b.exit()) {
                    throw c4466b.access$newTimeoutException(null);
                }
            } catch (IOException e4) {
                if (!c4466b.exit()) {
                    throw e4;
                }
                throw c4466b.access$newTimeoutException(e4);
            } finally {
                c4466b.exit();
            }
        }

        @Override // ia.A
        public final D timeout() {
            return C4466b.this;
        }

        public final String toString() {
            return "AsyncTimeout.sink(" + this.f38639c + ')';
        }

        @Override // ia.A
        public final void write(C4468d source, long j4) throws IOException {
            kotlin.jvm.internal.l.f(source, "source");
            I.m(source.f38643c, 0L, j4);
            while (true) {
                long j10 = 0;
                if (j4 <= 0) {
                    return;
                }
                x xVar = source.f38642b;
                kotlin.jvm.internal.l.c(xVar);
                while (true) {
                    if (j10 >= 65536) {
                        break;
                    }
                    j10 += xVar.f38690c - xVar.f38689b;
                    if (j10 >= j4) {
                        j10 = j4;
                        break;
                    } else {
                        xVar = xVar.f38693f;
                        kotlin.jvm.internal.l.c(xVar);
                    }
                }
                A a10 = this.f38639c;
                C4466b c4466b = C4466b.this;
                c4466b.enter();
                try {
                    try {
                        a10.write(source, j10);
                        C1992A c1992a = C1992A.f18074a;
                        if (c4466b.exit()) {
                            throw c4466b.access$newTimeoutException(null);
                        }
                        j4 -= j10;
                    } catch (IOException e4) {
                        if (!c4466b.exit()) {
                            throw e4;
                        }
                        throw c4466b.access$newTimeoutException(e4);
                    }
                } catch (Throwable th) {
                    c4466b.exit();
                    throw th;
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: ia.b$d */
    public static final class d implements C {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C f38641c;

        public d(C c10) {
            this.f38641c = c10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            C c10 = this.f38641c;
            C4466b c4466b = C4466b.this;
            c4466b.enter();
            try {
                c10.close();
                C1992A c1992a = C1992A.f18074a;
                if (c4466b.exit()) {
                    throw c4466b.access$newTimeoutException(null);
                }
            } catch (IOException e4) {
                if (!c4466b.exit()) {
                    throw e4;
                }
                throw c4466b.access$newTimeoutException(e4);
            } finally {
                c4466b.exit();
            }
        }

        @Override // ia.C
        public final long read(C4468d sink, long j4) throws IOException {
            kotlin.jvm.internal.l.f(sink, "sink");
            C c10 = this.f38641c;
            C4466b c4466b = C4466b.this;
            c4466b.enter();
            try {
                long j10 = c10.read(sink, j4);
                if (c4466b.exit()) {
                    throw c4466b.access$newTimeoutException(null);
                }
                return j10;
            } catch (IOException e4) {
                if (c4466b.exit()) {
                    throw c4466b.access$newTimeoutException(e4);
                }
                throw e4;
            } finally {
                c4466b.exit();
            }
        }

        @Override // ia.C
        public final D timeout() {
            return C4466b.this;
        }

        public final String toString() {
            return "AsyncTimeout.source(" + this.f38641c + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.l.e(conditionNewCondition, "newCondition(...)");
        condition = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j4) {
        return this.timeoutAt - j4;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    @Override // ia.D
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                a.b(Companion, this);
                this.state = 3;
            }
            C1992A c1992a = C1992A.f18074a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void enter() {
        long jTimeoutNanos = timeoutNanos();
        boolean zHasDeadline = hasDeadline();
        if (jTimeoutNanos != 0 || zHasDeadline) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                a.a(Companion, this, jTimeoutNanos, zHasDeadline);
                C1992A c1992a = C1992A.f18074a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i = this.state;
            this.state = 0;
            if (i != 1) {
                return i == 2;
            }
            a.b(Companion, this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final A sink(A sink) {
        kotlin.jvm.internal.l.f(sink, "sink");
        return new c(sink);
    }

    public final C source(C source) {
        kotlin.jvm.internal.l.f(source, "source");
        return new d(source);
    }

    public final <T> T withTimeout(InterfaceC5480a<? extends T> block) throws IOException {
        kotlin.jvm.internal.l.f(block, "block");
        enter();
        try {
            T tInvoke = block.invoke();
            if (exit()) {
                throw access$newTimeoutException(null);
            }
            return tInvoke;
        } catch (IOException e4) {
            if (exit()) {
                throw access$newTimeoutException(e4);
            }
            throw e4;
        } finally {
            exit();
        }
    }

    public void timedOut() {
    }
}
