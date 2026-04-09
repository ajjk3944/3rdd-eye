package gg;

import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import lg.C6595e;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    static boolean f47902a = Boolean.getBoolean("rx3.scheduler.use-nanotime");

    /* renamed from: b, reason: collision with root package name */
    static final long f47903b = a(Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue(), System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes"));

    static final class a implements InterfaceC6043c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f47904a;

        /* renamed from: b, reason: collision with root package name */
        final c f47905b;

        /* renamed from: c, reason: collision with root package name */
        Thread f47906c;

        a(Runnable runnable, c cVar) {
            this.f47904a = runnable;
            this.f47905b = cVar;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f47906c == Thread.currentThread()) {
                c cVar = this.f47905b;
                if (cVar instanceof wg.h) {
                    ((wg.h) cVar).h();
                    return;
                }
            }
            this.f47905b.dispose();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f47905b.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f47906c = Thread.currentThread();
            try {
                this.f47904a.run();
            } finally {
            }
        }
    }

    static final class b implements InterfaceC6043c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f47907a;

        /* renamed from: b, reason: collision with root package name */
        final c f47908b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f47909c;

        b(Runnable runnable, c cVar) {
            this.f47907a = runnable;
            this.f47908b = cVar;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f47909c = true;
            this.f47908b.dispose();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f47909c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f47909c) {
                return;
            }
            try {
                this.f47907a.run();
            } catch (Throwable th2) {
                dispose();
                Eg.a.v(th2);
                throw th2;
            }
        }
    }

    public static abstract class c implements InterfaceC6043c {

        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final Runnable f47910a;

            /* renamed from: b, reason: collision with root package name */
            final C6595e f47911b;

            /* renamed from: c, reason: collision with root package name */
            final long f47912c;

            /* renamed from: d, reason: collision with root package name */
            long f47913d;

            /* renamed from: e, reason: collision with root package name */
            long f47914e;

            /* renamed from: f, reason: collision with root package name */
            long f47915f;

            a(long j10, Runnable runnable, long j11, C6595e c6595e, long j12) {
                this.f47910a = runnable;
                this.f47911b = c6595e;
                this.f47912c = j12;
                this.f47914e = j11;
                this.f47915f = j10;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r12 = this;
                    java.lang.Runnable r0 = r12.f47910a
                    r0.run()
                    lg.e r0 = r12.f47911b
                    boolean r0 = r0.isDisposed()
                    if (r0 != 0) goto L51
                    gg.y$c r0 = gg.y.c.this
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r2 = r0.a(r1)
                    long r4 = gg.y.f47903b
                    long r6 = r2 + r4
                    long r8 = r12.f47914e
                    int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    r6 = 1
                    if (r0 < 0) goto L34
                    long r10 = r12.f47912c
                    long r8 = r8 + r10
                    long r8 = r8 + r4
                    int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r0 < 0) goto L2a
                    goto L34
                L2a:
                    long r4 = r12.f47915f
                    long r8 = r12.f47913d
                    long r8 = r8 + r6
                    r12.f47913d = r8
                    long r8 = r8 * r10
                    long r4 = r4 + r8
                    goto L43
                L34:
                    long r4 = r12.f47912c
                    long r8 = r2 + r4
                    long r10 = r12.f47913d
                    long r10 = r10 + r6
                    r12.f47913d = r10
                    long r4 = r4 * r10
                    long r4 = r8 - r4
                    r12.f47915f = r4
                    r4 = r8
                L43:
                    r12.f47914e = r2
                    long r4 = r4 - r2
                    lg.e r0 = r12.f47911b
                    gg.y$c r2 = gg.y.c.this
                    hg.c r1 = r2.c(r12, r4, r1)
                    r0.a(r1)
                L51:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: gg.y.c.a.run():void");
            }
        }

        public long a(TimeUnit timeUnit) {
            return y.b(timeUnit);
        }

        public InterfaceC6043c b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract InterfaceC6043c c(Runnable runnable, long j10, TimeUnit timeUnit);

        public InterfaceC6043c d(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            C6595e c6595e = new C6595e();
            C6595e c6595e2 = new C6595e(c6595e);
            Runnable runnableX = Eg.a.x(runnable);
            long nanos = timeUnit.toNanos(j11);
            long jA = a(TimeUnit.NANOSECONDS);
            InterfaceC6043c interfaceC6043cC = c(new a(jA + timeUnit.toNanos(j10), runnableX, jA, c6595e2, nanos), j10, timeUnit);
            if (interfaceC6043cC == EnumC6593c.INSTANCE) {
                return interfaceC6043cC;
            }
            c6595e.a(interfaceC6043cC);
            return c6595e2;
        }
    }

    static long a(long j10, String str) {
        return "seconds".equalsIgnoreCase(str) ? TimeUnit.SECONDS.toNanos(j10) : "milliseconds".equalsIgnoreCase(str) ? TimeUnit.MILLISECONDS.toNanos(j10) : TimeUnit.MINUTES.toNanos(j10);
    }

    static long b(TimeUnit timeUnit) {
        return !f47902a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract c c();

    public long d(TimeUnit timeUnit) {
        return b(timeUnit);
    }

    public InterfaceC6043c e(Runnable runnable) {
        return f(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public InterfaceC6043c f(Runnable runnable, long j10, TimeUnit timeUnit) {
        c cVarC = c();
        a aVar = new a(Eg.a.x(runnable), cVarC);
        cVarC.c(aVar, j10, timeUnit);
        return aVar;
    }

    public InterfaceC6043c g(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        c cVarC = c();
        b bVar = new b(Eg.a.x(runnable), cVarC);
        InterfaceC6043c interfaceC6043cD = cVarC.d(bVar, j10, j11, timeUnit);
        return interfaceC6043cD == EnumC6593c.INSTANCE ? interfaceC6043cD : bVar;
    }

    public void h() {
    }
}
