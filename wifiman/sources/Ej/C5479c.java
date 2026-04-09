package ej;

import Yg.J;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ej.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5479c extends E {

    /* renamed from: j, reason: collision with root package name */
    private static final a f46446j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    private static final ReentrantLock f46447k;

    /* renamed from: l, reason: collision with root package name */
    private static final Condition f46448l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f46449m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f46450n;

    /* renamed from: o, reason: collision with root package name */
    private static C5479c f46451o;

    /* renamed from: g, reason: collision with root package name */
    private int f46452g;

    /* renamed from: h, reason: collision with root package name */
    private C5479c f46453h;

    /* renamed from: i, reason: collision with root package name */
    private long f46454i;

    /* renamed from: ej.c$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(C5479c c5479c, long j10, boolean z10) {
            if (C5479c.f46451o == null) {
                C5479c.f46451o = new C5479c();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                c5479c.f46454i = Math.min(j10, c5479c.d() - jNanoTime) + jNanoTime;
            } else if (j10 != 0) {
                c5479c.f46454i = j10 + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                c5479c.f46454i = c5479c.d();
            }
            long jA = c5479c.A(jNanoTime);
            C5479c c5479c2 = C5479c.f46451o;
            AbstractC6492s.f(c5479c2);
            while (c5479c2.f46453h != null) {
                C5479c c5479c3 = c5479c2.f46453h;
                AbstractC6492s.f(c5479c3);
                if (jA < c5479c3.A(jNanoTime)) {
                    break;
                }
                c5479c2 = c5479c2.f46453h;
                AbstractC6492s.f(c5479c2);
            }
            c5479c.f46453h = c5479c2.f46453h;
            c5479c2.f46453h = c5479c;
            if (c5479c2 == C5479c.f46451o) {
                d().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C5479c c5479c) {
            for (C5479c c5479c2 = C5479c.f46451o; c5479c2 != null; c5479c2 = c5479c2.f46453h) {
                if (c5479c2.f46453h == c5479c) {
                    c5479c2.f46453h = c5479c.f46453h;
                    c5479c.f46453h = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final C5479c c() throws InterruptedException {
            C5479c c5479c = C5479c.f46451o;
            AbstractC6492s.f(c5479c);
            C5479c c5479c2 = c5479c.f46453h;
            if (c5479c2 == null) {
                long jNanoTime = System.nanoTime();
                d().await(C5479c.f46449m, TimeUnit.MILLISECONDS);
                C5479c c5479c3 = C5479c.f46451o;
                AbstractC6492s.f(c5479c3);
                if (c5479c3.f46453h != null || System.nanoTime() - jNanoTime < C5479c.f46450n) {
                    return null;
                }
                return C5479c.f46451o;
            }
            long jA = c5479c2.A(System.nanoTime());
            if (jA > 0) {
                d().await(jA, TimeUnit.NANOSECONDS);
                return null;
            }
            C5479c c5479c4 = C5479c.f46451o;
            AbstractC6492s.f(c5479c4);
            c5479c4.f46453h = c5479c2.f46453h;
            c5479c2.f46453h = null;
            c5479c2.f46452g = 2;
            return c5479c2;
        }

        public final Condition d() {
            return C5479c.f46448l;
        }

        public final ReentrantLock e() {
            return C5479c.f46447k;
        }

        private a() {
        }
    }

    /* renamed from: ej.c$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockE;
            C5479c c5479cC;
            while (true) {
                try {
                    reentrantLockE = C5479c.f46446j.e();
                    reentrantLockE.lock();
                    try {
                        c5479cC = C5479c.f46446j.c();
                    } finally {
                        reentrantLockE.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (c5479cC == C5479c.f46451o) {
                    a unused2 = C5479c.f46446j;
                    C5479c.f46451o = null;
                    return;
                } else {
                    J j10 = J.f24997a;
                    reentrantLockE.unlock();
                    if (c5479cC != null) {
                        c5479cC.D();
                    }
                }
            }
        }
    }

    /* renamed from: ej.c$c, reason: collision with other inner class name */
    public static final class C1750c implements InterfaceC5474B {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5474B f46456b;

        C1750c(InterfaceC5474B interfaceC5474B) {
            this.f46456b = interfaceC5474B;
        }

        @Override // ej.InterfaceC5474B
        public void Z(C5481e source, long j10) throws IOException {
            AbstractC6492s.i(source, "source");
            AbstractC5478b.b(source.D0(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                y yVar = source.f46459a;
                AbstractC6492s.f(yVar);
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += yVar.f46528c - yVar.f46527b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        yVar = yVar.f46531f;
                        AbstractC6492s.f(yVar);
                    }
                }
                C5479c c5479c = C5479c.this;
                InterfaceC5474B interfaceC5474B = this.f46456b;
                c5479c.x();
                try {
                    interfaceC5474B.Z(source, j11);
                    J j12 = J.f24997a;
                    if (c5479c.y()) {
                        throw c5479c.r(null);
                    }
                    j10 -= j11;
                } catch (IOException e10) {
                    if (!c5479c.y()) {
                        throw e10;
                    }
                    throw c5479c.r(e10);
                } finally {
                    c5479c.y();
                }
            }
        }

        @Override // ej.InterfaceC5474B
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5479c c() {
            return C5479c.this;
        }

        @Override // ej.InterfaceC5474B, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C5479c c5479c = C5479c.this;
            InterfaceC5474B interfaceC5474B = this.f46456b;
            c5479c.x();
            try {
                interfaceC5474B.close();
                J j10 = J.f24997a;
                if (c5479c.y()) {
                    throw c5479c.r(null);
                }
            } catch (IOException e10) {
                if (!c5479c.y()) {
                    throw e10;
                }
                throw c5479c.r(e10);
            } finally {
                c5479c.y();
            }
        }

        @Override // ej.InterfaceC5474B, java.io.Flushable
        public void flush() throws IOException {
            C5479c c5479c = C5479c.this;
            InterfaceC5474B interfaceC5474B = this.f46456b;
            c5479c.x();
            try {
                interfaceC5474B.flush();
                J j10 = J.f24997a;
                if (c5479c.y()) {
                    throw c5479c.r(null);
                }
            } catch (IOException e10) {
                if (!c5479c.y()) {
                    throw e10;
                }
                throw c5479c.r(e10);
            } finally {
                c5479c.y();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f46456b + ')';
        }
    }

    /* renamed from: ej.c$d */
    public static final class d implements InterfaceC5476D {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5476D f46458b;

        d(InterfaceC5476D interfaceC5476D) {
            this.f46458b = interfaceC5476D;
        }

        @Override // ej.InterfaceC5476D
        public long U(C5481e sink, long j10) throws IOException {
            AbstractC6492s.i(sink, "sink");
            C5479c c5479c = C5479c.this;
            InterfaceC5476D interfaceC5476D = this.f46458b;
            c5479c.x();
            try {
                long jU = interfaceC5476D.U(sink, j10);
                if (c5479c.y()) {
                    throw c5479c.r(null);
                }
                return jU;
            } catch (IOException e10) {
                if (c5479c.y()) {
                    throw c5479c.r(e10);
                }
                throw e10;
            } finally {
                c5479c.y();
            }
        }

        @Override // ej.InterfaceC5476D
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5479c c() {
            return C5479c.this;
        }

        @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C5479c c5479c = C5479c.this;
            InterfaceC5476D interfaceC5476D = this.f46458b;
            c5479c.x();
            try {
                interfaceC5476D.close();
                J j10 = J.f24997a;
                if (c5479c.y()) {
                    throw c5479c.r(null);
                }
            } catch (IOException e10) {
                if (!c5479c.y()) {
                    throw e10;
                }
                throw c5479c.r(e10);
            } finally {
                c5479c.y();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f46458b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f46447k = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC6492s.h(conditionNewCondition, "newCondition(...)");
        f46448l = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f46449m = millis;
        f46450n = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long A(long j10) {
        return this.f46454i - j10;
    }

    public final InterfaceC5474B B(InterfaceC5474B sink) {
        AbstractC6492s.i(sink, "sink");
        return new C1750c(sink);
    }

    public final InterfaceC5476D C(InterfaceC5476D source) {
        AbstractC6492s.i(source, "source");
        return new d(source);
    }

    protected void D() {
    }

    public final IOException r(IOException iOException) {
        return z(iOException);
    }

    public final void x() {
        long jI = i();
        boolean zF = f();
        if (jI != 0 || zF) {
            ReentrantLock reentrantLock = f46447k;
            reentrantLock.lock();
            try {
                if (this.f46452g != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f46452g = 1;
                f46446j.f(this, jI, zF);
                J j10 = J.f24997a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean y() {
        ReentrantLock reentrantLock = f46447k;
        reentrantLock.lock();
        try {
            int i10 = this.f46452g;
            this.f46452g = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f46446j.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected IOException z(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
