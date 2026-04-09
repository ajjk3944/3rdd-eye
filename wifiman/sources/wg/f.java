package wg;

import gg.y;
import hg.C6042b;
import hg.InterfaceC6043c;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6593c;
import r.Y;

/* loaded from: classes4.dex */
public final class f extends y {

    /* renamed from: e, reason: collision with root package name */
    static final j f64949e;

    /* renamed from: f, reason: collision with root package name */
    static final j f64950f;

    /* renamed from: i, reason: collision with root package name */
    static final c f64953i;

    /* renamed from: j, reason: collision with root package name */
    static boolean f64954j;

    /* renamed from: k, reason: collision with root package name */
    static final a f64955k;

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f64956c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference f64957d;

    /* renamed from: h, reason: collision with root package name */
    private static final TimeUnit f64952h = TimeUnit.SECONDS;

    /* renamed from: g, reason: collision with root package name */
    private static final long f64951g = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final long f64958a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue f64959b;

        /* renamed from: c, reason: collision with root package name */
        final C6042b f64960c;

        /* renamed from: d, reason: collision with root package name */
        private final ScheduledExecutorService f64961d;

        /* renamed from: e, reason: collision with root package name */
        private final Future f64962e;

        /* renamed from: f, reason: collision with root package name */
        private final ThreadFactory f64963f;

        a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f64958a = nanos;
            this.f64959b = new ConcurrentLinkedQueue();
            this.f64960c = new C6042b();
            this.f64963f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f.f64950f);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f64961d = scheduledExecutorServiceNewScheduledThreadPool;
            this.f64962e = scheduledFutureScheduleWithFixedDelay;
        }

        static void a(ConcurrentLinkedQueue concurrentLinkedQueue, C6042b c6042b) {
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jC = c();
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.i() > jC) {
                    return;
                }
                if (concurrentLinkedQueue.remove(cVar)) {
                    c6042b.b(cVar);
                }
            }
        }

        static long c() {
            return System.nanoTime();
        }

        c b() {
            if (this.f64960c.isDisposed()) {
                return f.f64953i;
            }
            while (!this.f64959b.isEmpty()) {
                c cVar = (c) this.f64959b.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            c cVar2 = new c(this.f64963f);
            this.f64960c.a(cVar2);
            return cVar2;
        }

        void d(c cVar) {
            cVar.j(c() + this.f64958a);
            this.f64959b.offer(cVar);
        }

        void e() {
            this.f64960c.dispose();
            Future future = this.f64962e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f64961d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a(this.f64959b, this.f64960c);
        }
    }

    static final class b extends y.c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final a f64965b;

        /* renamed from: c, reason: collision with root package name */
        private final c f64966c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f64967d = new AtomicBoolean();

        /* renamed from: a, reason: collision with root package name */
        private final C6042b f64964a = new C6042b();

        b(a aVar) {
            this.f64965b = aVar;
            this.f64966c = aVar.b();
        }

        @Override // gg.y.c
        public InterfaceC6043c c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f64964a.isDisposed() ? EnumC6593c.INSTANCE : this.f64966c.e(runnable, j10, timeUnit, this.f64964a);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f64967d.compareAndSet(false, true)) {
                this.f64964a.dispose();
                if (f.f64954j) {
                    this.f64966c.e(this, 0L, TimeUnit.NANOSECONDS, null);
                } else {
                    this.f64965b.d(this.f64966c);
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f64967d.get();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f64965b.d(this.f64966c);
        }
    }

    static final class c extends h {

        /* renamed from: c, reason: collision with root package name */
        long f64968c;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f64968c = 0L;
        }

        public long i() {
            return this.f64968c;
        }

        public void j(long j10) {
            this.f64968c = j10;
        }
    }

    static {
        c cVar = new c(new j("RxCachedThreadSchedulerShutdown"));
        f64953i = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        j jVar = new j("RxCachedThreadScheduler", iMax);
        f64949e = jVar;
        f64950f = new j("RxCachedWorkerPoolEvictor", iMax);
        f64954j = Boolean.getBoolean("rx3.io-scheduled-release");
        a aVar = new a(0L, null, jVar);
        f64955k = aVar;
        aVar.e();
    }

    public f() {
        this(f64949e);
    }

    @Override // gg.y
    public y.c c() {
        return new b((a) this.f64957d.get());
    }

    @Override // gg.y
    public void h() {
        AtomicReference atomicReference = this.f64957d;
        a aVar = f64955k;
        a aVar2 = (a) atomicReference.getAndSet(aVar);
        if (aVar2 != aVar) {
            aVar2.e();
        }
    }

    public void i() {
        a aVar = new a(f64951g, f64952h, this.f64956c);
        if (Y.a(this.f64957d, f64955k, aVar)) {
            return;
        }
        aVar.e();
    }

    public f(ThreadFactory threadFactory) {
        this.f64956c = threadFactory;
        this.f64957d = new AtomicReference(f64955k);
        i();
    }
}
