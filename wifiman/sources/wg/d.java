package wg;

import gg.y;
import hg.C6042b;
import hg.InterfaceC6043c;
import hg.InterfaceC6044d;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lg.C6595e;
import lg.EnumC6592b;
import lg.EnumC6593c;
import vg.C8229a;

/* loaded from: classes4.dex */
public final class d extends y {

    /* renamed from: c, reason: collision with root package name */
    final boolean f64921c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f64922d;

    /* renamed from: e, reason: collision with root package name */
    final Executor f64923e;

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f64924a;

        a(b bVar) {
            this.f64924a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = this.f64924a;
            bVar.f64927b.a(d.this.e(bVar));
        }
    }

    static final class b extends AtomicReference implements Runnable, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final C6595e f64926a;

        /* renamed from: b, reason: collision with root package name */
        final C6595e f64927b;

        b(Runnable runnable) {
            super(runnable);
            this.f64926a = new C6595e();
            this.f64927b = new C6595e();
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (getAndSet(null) != null) {
                this.f64926a.dispose();
                this.f64927b.dispose();
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    try {
                        runnable.run();
                        lazySet(null);
                        C6595e c6595e = this.f64926a;
                        EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
                        c6595e.lazySet(enumC6592b);
                        this.f64927b.lazySet(enumC6592b);
                    } catch (Throwable th2) {
                        lazySet(null);
                        this.f64926a.lazySet(EnumC6592b.DISPOSED);
                        this.f64927b.lazySet(EnumC6592b.DISPOSED);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Eg.a.v(th3);
                    throw th3;
                }
            }
        }
    }

    public static final class c extends y.c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final boolean f64928a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f64929b;

        /* renamed from: c, reason: collision with root package name */
        final Executor f64930c;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f64932e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f64933f = new AtomicInteger();

        /* renamed from: g, reason: collision with root package name */
        final C6042b f64934g = new C6042b();

        /* renamed from: d, reason: collision with root package name */
        final C8229a f64931d = new C8229a();

        static final class a extends AtomicBoolean implements Runnable, InterfaceC6043c {

            /* renamed from: a, reason: collision with root package name */
            final Runnable f64935a;

            a(Runnable runnable) {
                this.f64935a = runnable;
            }

            @Override // hg.InterfaceC6043c
            public void dispose() {
                lazySet(true);
            }

            @Override // hg.InterfaceC6043c
            public boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f64935a.run();
                } finally {
                }
            }
        }

        static final class b extends AtomicInteger implements Runnable, InterfaceC6043c {

            /* renamed from: a, reason: collision with root package name */
            final Runnable f64936a;

            /* renamed from: b, reason: collision with root package name */
            final InterfaceC6044d f64937b;

            /* renamed from: c, reason: collision with root package name */
            volatile Thread f64938c;

            b(Runnable runnable, InterfaceC6044d interfaceC6044d) {
                this.f64936a = runnable;
                this.f64937b = interfaceC6044d;
            }

            void a() {
                InterfaceC6044d interfaceC6044d = this.f64937b;
                if (interfaceC6044d != null) {
                    interfaceC6044d.c(this);
                }
            }

            @Override // hg.InterfaceC6043c
            public void dispose() {
                while (true) {
                    int i10 = get();
                    if (i10 >= 2) {
                        return;
                    }
                    if (i10 == 0) {
                        if (compareAndSet(0, 4)) {
                            a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f64938c;
                        if (thread != null) {
                            thread.interrupt();
                            this.f64938c = null;
                        }
                        set(4);
                        a();
                        return;
                    }
                }
            }

            @Override // hg.InterfaceC6043c
            public boolean isDisposed() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.f64938c = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.f64938c = null;
                        return;
                    }
                    try {
                        this.f64936a.run();
                        this.f64938c = null;
                        if (compareAndSet(1, 2)) {
                            a();
                            return;
                        }
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } catch (Throwable th2) {
                        try {
                            Eg.a.v(th2);
                            throw th2;
                        } catch (Throwable th3) {
                            this.f64938c = null;
                            if (compareAndSet(1, 2)) {
                                a();
                            } else {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            }
                            throw th3;
                        }
                    }
                }
            }
        }

        /* renamed from: wg.d$c$c, reason: collision with other inner class name */
        final class RunnableC2301c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final C6595e f64939a;

            /* renamed from: b, reason: collision with root package name */
            private final Runnable f64940b;

            RunnableC2301c(C6595e c6595e, Runnable runnable) {
                this.f64939a = c6595e;
                this.f64940b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f64939a.a(c.this.b(this.f64940b));
            }
        }

        public c(Executor executor, boolean z10, boolean z11) {
            this.f64930c = executor;
            this.f64928a = z10;
            this.f64929b = z11;
        }

        @Override // gg.y.c
        public InterfaceC6043c b(Runnable runnable) {
            InterfaceC6043c aVar;
            if (this.f64932e) {
                return EnumC6593c.INSTANCE;
            }
            Runnable runnableX = Eg.a.x(runnable);
            if (this.f64928a) {
                aVar = new b(runnableX, this.f64934g);
                this.f64934g.a(aVar);
            } else {
                aVar = new a(runnableX);
            }
            this.f64931d.offer(aVar);
            if (this.f64933f.getAndIncrement() == 0) {
                try {
                    this.f64930c.execute(this);
                } catch (RejectedExecutionException e10) {
                    this.f64932e = true;
                    this.f64931d.clear();
                    Eg.a.v(e10);
                    return EnumC6593c.INSTANCE;
                }
            }
            return aVar;
        }

        @Override // gg.y.c
        public InterfaceC6043c c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (j10 <= 0) {
                return b(runnable);
            }
            if (this.f64932e) {
                return EnumC6593c.INSTANCE;
            }
            C6595e c6595e = new C6595e();
            C6595e c6595e2 = new C6595e(c6595e);
            m mVar = new m(new RunnableC2301c(c6595e2, Eg.a.x(runnable)), this.f64934g, this.f64928a);
            this.f64934g.a(mVar);
            Executor executor = this.f64930c;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    mVar.a(((ScheduledExecutorService) executor).schedule((Callable) mVar, j10, timeUnit));
                } catch (RejectedExecutionException e10) {
                    this.f64932e = true;
                    Eg.a.v(e10);
                    return EnumC6593c.INSTANCE;
                }
            } else {
                mVar.a(new wg.c(C2302d.f64942a.f(mVar, j10, timeUnit)));
            }
            c6595e.a(mVar);
            return c6595e2;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f64932e) {
                return;
            }
            this.f64932e = true;
            this.f64934g.dispose();
            if (this.f64933f.getAndIncrement() == 0) {
                this.f64931d.clear();
            }
        }

        void e() {
            C8229a c8229a = this.f64931d;
            int iAddAndGet = 1;
            while (!this.f64932e) {
                do {
                    Runnable runnable = (Runnable) c8229a.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else if (this.f64932e) {
                        c8229a.clear();
                        return;
                    } else {
                        iAddAndGet = this.f64933f.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } while (!this.f64932e);
                c8229a.clear();
                return;
            }
            c8229a.clear();
        }

        void f() {
            C8229a c8229a = this.f64931d;
            if (this.f64932e) {
                c8229a.clear();
                return;
            }
            ((Runnable) c8229a.poll()).run();
            if (this.f64932e) {
                c8229a.clear();
            } else if (this.f64933f.decrementAndGet() != 0) {
                this.f64930c.execute(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f64932e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f64929b) {
                f();
            } else {
                e();
            }
        }
    }

    /* renamed from: wg.d$d, reason: collision with other inner class name */
    static final class C2302d {

        /* renamed from: a, reason: collision with root package name */
        static final y f64942a = Gg.a.e();
    }

    public d(Executor executor, boolean z10, boolean z11) {
        this.f64923e = executor;
        this.f64921c = z10;
        this.f64922d = z11;
    }

    @Override // gg.y
    public y.c c() {
        return new c(this.f64923e, this.f64921c, this.f64922d);
    }

    @Override // gg.y
    public InterfaceC6043c e(Runnable runnable) {
        Runnable runnableX = Eg.a.x(runnable);
        try {
            if (this.f64923e instanceof ExecutorService) {
                l lVar = new l(runnableX, this.f64921c);
                lVar.c(((ExecutorService) this.f64923e).submit(lVar));
                return lVar;
            }
            if (this.f64921c) {
                c.b bVar = new c.b(runnableX, null);
                this.f64923e.execute(bVar);
                return bVar;
            }
            c.a aVar = new c.a(runnableX);
            this.f64923e.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e10) {
            Eg.a.v(e10);
            return EnumC6593c.INSTANCE;
        }
    }

    @Override // gg.y
    public InterfaceC6043c f(Runnable runnable, long j10, TimeUnit timeUnit) {
        Runnable runnableX = Eg.a.x(runnable);
        if (!(this.f64923e instanceof ScheduledExecutorService)) {
            b bVar = new b(runnableX);
            bVar.f64926a.a(C2302d.f64942a.f(new a(bVar), j10, timeUnit));
            return bVar;
        }
        try {
            l lVar = new l(runnableX, this.f64921c);
            lVar.c(((ScheduledExecutorService) this.f64923e).schedule(lVar, j10, timeUnit));
            return lVar;
        } catch (RejectedExecutionException e10) {
            Eg.a.v(e10);
            return EnumC6593c.INSTANCE;
        }
    }

    @Override // gg.y
    public InterfaceC6043c g(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        if (!(this.f64923e instanceof ScheduledExecutorService)) {
            return super.g(runnable, j10, j11, timeUnit);
        }
        try {
            k kVar = new k(Eg.a.x(runnable), this.f64921c);
            kVar.c(((ScheduledExecutorService) this.f64923e).scheduleAtFixedRate(kVar, j10, j11, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e10) {
            Eg.a.v(e10);
            return EnumC6593c.INSTANCE;
        }
    }
}
