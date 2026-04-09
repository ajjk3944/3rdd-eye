package qg;

import gg.y;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6469f;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* loaded from: classes4.dex */
public final class w0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final long f59314c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f59315d;

    /* renamed from: e, reason: collision with root package name */
    final gg.y f59316e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f59317f;

    /* renamed from: g, reason: collision with root package name */
    final InterfaceC6469f f59318g;

    static final class a extends AtomicInteger implements gg.l, Dj.c, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59319a;

        /* renamed from: b, reason: collision with root package name */
        final long f59320b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f59321c;

        /* renamed from: d, reason: collision with root package name */
        final y.c f59322d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f59323e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference f59324f = new AtomicReference();

        /* renamed from: g, reason: collision with root package name */
        final AtomicLong f59325g = new AtomicLong();

        /* renamed from: h, reason: collision with root package name */
        final InterfaceC6469f f59326h;

        /* renamed from: i, reason: collision with root package name */
        Dj.c f59327i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f59328j;

        /* renamed from: k, reason: collision with root package name */
        Throwable f59329k;

        /* renamed from: l, reason: collision with root package name */
        volatile boolean f59330l;

        /* renamed from: m, reason: collision with root package name */
        volatile boolean f59331m;

        /* renamed from: n, reason: collision with root package name */
        long f59332n;

        /* renamed from: o, reason: collision with root package name */
        boolean f59333o;

        a(Dj.b bVar, long j10, TimeUnit timeUnit, y.c cVar, boolean z10, InterfaceC6469f interfaceC6469f) {
            this.f59319a = bVar;
            this.f59320b = j10;
            this.f59321c = timeUnit;
            this.f59322d = cVar;
            this.f59323e = z10;
            this.f59326h = interfaceC6469f;
        }

        @Override // Dj.b
        public void a() {
            this.f59328j = true;
            d();
        }

        void c() {
            if (this.f59326h == null) {
                this.f59324f.lazySet(null);
                return;
            }
            Object andSet = this.f59324f.getAndSet(null);
            if (andSet != null) {
                try {
                    this.f59326h.accept(andSet);
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    Eg.a.v(th2);
                }
            }
        }

        @Override // Dj.c
        public void cancel() {
            this.f59330l = true;
            this.f59327i.cancel();
            this.f59322d.dispose();
            if (getAndIncrement() == 0) {
                c();
            }
        }

        void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference atomicReference = this.f59324f;
            AtomicLong atomicLong = this.f59325g;
            Dj.b bVar = this.f59319a;
            int iAddAndGet = 1;
            while (!this.f59330l) {
                boolean z10 = this.f59328j;
                Throwable compositeException = this.f59329k;
                if (z10 && compositeException != null) {
                    if (this.f59326h != null) {
                        Object andSet = atomicReference.getAndSet(null);
                        if (andSet != null) {
                            try {
                                this.f59326h.accept(andSet);
                            } catch (Throwable th2) {
                                AbstractC6152a.b(th2);
                                compositeException = new CompositeException(compositeException, th2);
                            }
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    bVar.onError(compositeException);
                    this.f59322d.dispose();
                    return;
                }
                boolean z11 = atomicReference.get() == null;
                if (z10) {
                    if (z11) {
                        bVar.a();
                    } else {
                        Object andSet2 = atomicReference.getAndSet(null);
                        if (this.f59323e) {
                            long j10 = this.f59332n;
                            if (j10 != atomicLong.get()) {
                                this.f59332n = j10 + 1;
                                bVar.h(andSet2);
                                bVar.a();
                            } else {
                                g(andSet2);
                            }
                        } else {
                            InterfaceC6469f interfaceC6469f = this.f59326h;
                            if (interfaceC6469f != null) {
                                try {
                                    interfaceC6469f.accept(andSet2);
                                } catch (Throwable th3) {
                                    AbstractC6152a.b(th3);
                                    bVar.onError(th3);
                                    this.f59322d.dispose();
                                    return;
                                }
                            }
                            bVar.a();
                        }
                    }
                    this.f59322d.dispose();
                    return;
                }
                if (z11) {
                    if (this.f59331m) {
                        this.f59333o = false;
                        this.f59331m = false;
                    }
                } else if (!this.f59333o || this.f59331m) {
                    Object andSet3 = atomicReference.getAndSet(null);
                    long j11 = this.f59332n;
                    if (j11 == atomicLong.get()) {
                        this.f59327i.cancel();
                        g(andSet3);
                        this.f59322d.dispose();
                        return;
                    } else {
                        bVar.h(andSet3);
                        this.f59332n = j11 + 1;
                        this.f59331m = false;
                        this.f59333o = true;
                        this.f59322d.c(this, this.f59320b, this.f59321c);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            c();
        }

        void g(Object obj) {
            Throwable thA = MissingBackpressureException.a();
            InterfaceC6469f interfaceC6469f = this.f59326h;
            if (interfaceC6469f != null) {
                try {
                    interfaceC6469f.accept(obj);
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    thA = new CompositeException(thA, th2);
                }
            }
            this.f59319a.onError(thA);
        }

        @Override // Dj.b
        public void h(Object obj) {
            Object andSet = this.f59324f.getAndSet(obj);
            InterfaceC6469f interfaceC6469f = this.f59326h;
            if (interfaceC6469f != null && andSet != null) {
                try {
                    interfaceC6469f.accept(andSet);
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    this.f59327i.cancel();
                    this.f59329k = th2;
                    this.f59328j = true;
                }
            }
            d();
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59327i, cVar)) {
                this.f59327i = cVar;
                this.f59319a.j(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f59329k = th2;
            this.f59328j = true;
            d();
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this.f59325g, j10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59331m = true;
            d();
        }
    }

    public w0(gg.i iVar, long j10, TimeUnit timeUnit, gg.y yVar, boolean z10, InterfaceC6469f interfaceC6469f) {
        super(iVar);
        this.f59314c = j10;
        this.f59315d = timeUnit;
        this.f59316e = yVar;
        this.f59317f = z10;
        this.f59318g = interfaceC6469f;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f59314c, this.f59315d, this.f59316e.c(), this.f59317f, this.f59318g));
    }
}
