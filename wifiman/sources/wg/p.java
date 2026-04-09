package wg;

import gg.y;
import hg.InterfaceC6043c;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public final class p extends y {

    /* renamed from: c, reason: collision with root package name */
    private static final p f64990c = new p();

    static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f64991a;

        /* renamed from: b, reason: collision with root package name */
        private final c f64992b;

        /* renamed from: c, reason: collision with root package name */
        private final long f64993c;

        a(Runnable runnable, c cVar, long j10) {
            this.f64991a = runnable;
            this.f64992b = cVar;
            this.f64993c = j10;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            if (this.f64992b.f65001d) {
                return;
            }
            long jA = this.f64992b.a(TimeUnit.MILLISECONDS);
            long j10 = this.f64993c;
            if (j10 > jA) {
                try {
                    Thread.sleep(j10 - jA);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    Eg.a.v(e10);
                    return;
                }
            }
            if (this.f64992b.f65001d) {
                return;
            }
            this.f64991a.run();
        }
    }

    static final class b implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f64994a;

        /* renamed from: b, reason: collision with root package name */
        final long f64995b;

        /* renamed from: c, reason: collision with root package name */
        final int f64996c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f64997d;

        b(Runnable runnable, Long l10, int i10) {
            this.f64994a = runnable;
            this.f64995b = l10.longValue();
            this.f64996c = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iCompare = Long.compare(this.f64995b, bVar.f64995b);
            return iCompare == 0 ? Integer.compare(this.f64996c, bVar.f64996c) : iCompare;
        }
    }

    static final class c extends y.c {

        /* renamed from: a, reason: collision with root package name */
        final PriorityBlockingQueue f64998a = new PriorityBlockingQueue();

        /* renamed from: b, reason: collision with root package name */
        private final AtomicInteger f64999b = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f65000c = new AtomicInteger();

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f65001d;

        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final b f65002a;

            a(b bVar) {
                this.f65002a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f65002a.f64997d = true;
                c.this.f64998a.remove(this.f65002a);
            }
        }

        c() {
        }

        @Override // gg.y.c
        public InterfaceC6043c b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // gg.y.c
        public InterfaceC6043c c(Runnable runnable, long j10, TimeUnit timeUnit) {
            long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j10);
            return e(new a(runnable, this, jA), jA);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f65001d = true;
        }

        InterfaceC6043c e(Runnable runnable, long j10) {
            if (this.f65001d) {
                return EnumC6593c.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f65000c.incrementAndGet());
            this.f64998a.add(bVar);
            if (this.f64999b.getAndIncrement() != 0) {
                return InterfaceC6043c.l(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f65001d) {
                b bVar2 = (b) this.f64998a.poll();
                if (bVar2 == null) {
                    iAddAndGet = this.f64999b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return EnumC6593c.INSTANCE;
                    }
                } else if (!bVar2.f64997d) {
                    bVar2.f64994a.run();
                }
            }
            this.f64998a.clear();
            return EnumC6593c.INSTANCE;
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f65001d;
        }
    }

    p() {
    }

    public static p i() {
        return f64990c;
    }

    @Override // gg.y
    public y.c c() {
        return new c();
    }

    @Override // gg.y
    public InterfaceC6043c e(Runnable runnable) {
        Eg.a.x(runnable).run();
        return EnumC6593c.INSTANCE;
    }

    @Override // gg.y
    public InterfaceC6043c f(Runnable runnable, long j10, TimeUnit timeUnit) throws InterruptedException {
        try {
            timeUnit.sleep(j10);
            Eg.a.x(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            Eg.a.v(e10);
        }
        return EnumC6593c.INSTANCE;
    }
}
