package wg;

import gg.y;
import hg.C6042b;
import hg.InterfaceC6043c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public final class o extends y {

    /* renamed from: e, reason: collision with root package name */
    static final j f64983e;

    /* renamed from: f, reason: collision with root package name */
    static final ScheduledExecutorService f64984f;

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f64985c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference f64986d;

    static final class a extends y.c {

        /* renamed from: a, reason: collision with root package name */
        final ScheduledExecutorService f64987a;

        /* renamed from: b, reason: collision with root package name */
        final C6042b f64988b = new C6042b();

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f64989c;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f64987a = scheduledExecutorService;
        }

        @Override // gg.y.c
        public InterfaceC6043c c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f64989c) {
                return EnumC6593c.INSTANCE;
            }
            m mVar = new m(Eg.a.x(runnable), this.f64988b);
            this.f64988b.a(mVar);
            try {
                mVar.a(j10 <= 0 ? this.f64987a.submit((Callable) mVar) : this.f64987a.schedule((Callable) mVar, j10, timeUnit));
                return mVar;
            } catch (RejectedExecutionException e10) {
                dispose();
                Eg.a.v(e10);
                return EnumC6593c.INSTANCE;
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f64989c) {
                return;
            }
            this.f64989c = true;
            this.f64988b.dispose();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f64989c;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f64984f = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f64983e = new j("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public o() {
        this(f64983e);
    }

    static ScheduledExecutorService i(ThreadFactory threadFactory) {
        return n.a(threadFactory);
    }

    @Override // gg.y
    public y.c c() {
        return new a((ScheduledExecutorService) this.f64986d.get());
    }

    @Override // gg.y
    public InterfaceC6043c f(Runnable runnable, long j10, TimeUnit timeUnit) {
        l lVar = new l(Eg.a.x(runnable), true);
        try {
            lVar.c(j10 <= 0 ? ((ScheduledExecutorService) this.f64986d.get()).submit(lVar) : ((ScheduledExecutorService) this.f64986d.get()).schedule(lVar, j10, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e10) {
            Eg.a.v(e10);
            return EnumC6593c.INSTANCE;
        }
    }

    @Override // gg.y
    public InterfaceC6043c g(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableX = Eg.a.x(runnable);
        if (j11 > 0) {
            k kVar = new k(runnableX, true);
            try {
                kVar.c(((ScheduledExecutorService) this.f64986d.get()).scheduleAtFixedRate(kVar, j10, j11, timeUnit));
                return kVar;
            } catch (RejectedExecutionException e10) {
                Eg.a.v(e10);
                return EnumC6593c.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f64986d.get();
        e eVar = new e(runnableX, scheduledExecutorService);
        try {
            eVar.b(j10 <= 0 ? scheduledExecutorService.submit(eVar) : scheduledExecutorService.schedule(eVar, j10, timeUnit));
            return eVar;
        } catch (RejectedExecutionException e11) {
            Eg.a.v(e11);
            return EnumC6593c.INSTANCE;
        }
    }

    @Override // gg.y
    public void h() {
        AtomicReference atomicReference = this.f64986d;
        ScheduledExecutorService scheduledExecutorService = f64984f;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) atomicReference.getAndSet(scheduledExecutorService);
        if (scheduledExecutorService2 != scheduledExecutorService) {
            scheduledExecutorService2.shutdownNow();
        }
    }

    public o(ThreadFactory threadFactory) {
        AtomicReference atomicReference = new AtomicReference();
        this.f64986d = atomicReference;
        this.f64985c = threadFactory;
        atomicReference.lazySet(i(threadFactory));
    }
}
