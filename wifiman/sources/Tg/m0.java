package tg;

import gg.y;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lg.C6595e;
import lg.EnumC6592b;
import zg.AbstractC8755h;

/* loaded from: classes4.dex */
public final class m0 extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final long f62478b;

    /* renamed from: c, reason: collision with root package name */
    final TimeUnit f62479c;

    /* renamed from: d, reason: collision with root package name */
    final gg.y f62480d;

    /* renamed from: e, reason: collision with root package name */
    final gg.v f62481e;

    static final class a implements gg.x {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62482a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference f62483b;

        a(gg.x xVar, AtomicReference atomicReference) {
            this.f62482a = xVar;
            this.f62483b = atomicReference;
        }

        @Override // gg.x
        public void a() {
            this.f62482a.a();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.replace(this.f62483b, interfaceC6043c);
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f62482a.h(obj);
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f62482a.onError(th2);
        }
    }

    static final class b extends AtomicReference implements gg.x, InterfaceC6043c, d {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62484a;

        /* renamed from: b, reason: collision with root package name */
        final long f62485b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f62486c;

        /* renamed from: d, reason: collision with root package name */
        final y.c f62487d;

        /* renamed from: e, reason: collision with root package name */
        final C6595e f62488e = new C6595e();

        /* renamed from: f, reason: collision with root package name */
        final AtomicLong f62489f = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference f62490g = new AtomicReference();

        /* renamed from: h, reason: collision with root package name */
        gg.v f62491h;

        b(gg.x xVar, long j10, TimeUnit timeUnit, y.c cVar, gg.v vVar) {
            this.f62484a = xVar;
            this.f62485b = j10;
            this.f62486c = timeUnit;
            this.f62487d = cVar;
            this.f62491h = vVar;
        }

        @Override // gg.x
        public void a() {
            if (this.f62489f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f62488e.dispose();
                this.f62484a.a();
                this.f62487d.dispose();
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this.f62490g, interfaceC6043c);
        }

        @Override // tg.m0.d
        public void d(long j10) {
            if (this.f62489f.compareAndSet(j10, Long.MAX_VALUE)) {
                EnumC6592b.dispose(this.f62490g);
                gg.v vVar = this.f62491h;
                this.f62491h = null;
                vVar.d(new a(this.f62484a, this));
                this.f62487d.dispose();
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this.f62490g);
            EnumC6592b.dispose(this);
            this.f62487d.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            long j10 = this.f62489f.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.f62489f.compareAndSet(j10, j11)) {
                    ((InterfaceC6043c) this.f62488e.get()).dispose();
                    this.f62484a.h(obj);
                    j(j11);
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        void j(long j10) {
            this.f62488e.a(this.f62487d.c(new e(j10, this), this.f62485b, this.f62486c));
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62489f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                Eg.a.v(th2);
                return;
            }
            this.f62488e.dispose();
            this.f62484a.onError(th2);
            this.f62487d.dispose();
        }
    }

    static final class c extends AtomicLong implements gg.x, InterfaceC6043c, d {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62492a;

        /* renamed from: b, reason: collision with root package name */
        final long f62493b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f62494c;

        /* renamed from: d, reason: collision with root package name */
        final y.c f62495d;

        /* renamed from: e, reason: collision with root package name */
        final C6595e f62496e = new C6595e();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference f62497f = new AtomicReference();

        c(gg.x xVar, long j10, TimeUnit timeUnit, y.c cVar) {
            this.f62492a = xVar;
            this.f62493b = j10;
            this.f62494c = timeUnit;
            this.f62495d = cVar;
        }

        @Override // gg.x
        public void a() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f62496e.dispose();
                this.f62492a.a();
                this.f62495d.dispose();
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this.f62497f, interfaceC6043c);
        }

        @Override // tg.m0.d
        public void d(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                EnumC6592b.dispose(this.f62497f);
                this.f62492a.onError(new TimeoutException(AbstractC8755h.g(this.f62493b, this.f62494c)));
                this.f62495d.dispose();
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this.f62497f);
            this.f62495d.dispose();
        }

        @Override // gg.x
        public void h(Object obj) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    ((InterfaceC6043c) this.f62496e.get()).dispose();
                    this.f62492a.h(obj);
                    j(j11);
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) this.f62497f.get());
        }

        void j(long j10) {
            this.f62496e.a(this.f62495d.c(new e(j10, this), this.f62493b, this.f62494c));
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                Eg.a.v(th2);
                return;
            }
            this.f62496e.dispose();
            this.f62492a.onError(th2);
            this.f62495d.dispose();
        }
    }

    interface d {
        void d(long j10);
    }

    static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final d f62498a;

        /* renamed from: b, reason: collision with root package name */
        final long f62499b;

        e(long j10, d dVar) {
            this.f62499b = j10;
            this.f62498a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f62498a.d(this.f62499b);
        }
    }

    public m0(gg.s sVar, long j10, TimeUnit timeUnit, gg.y yVar, gg.v vVar) {
        super(sVar);
        this.f62478b = j10;
        this.f62479c = timeUnit;
        this.f62480d = yVar;
        this.f62481e = vVar;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        if (this.f62481e == null) {
            c cVar = new c(xVar, this.f62478b, this.f62479c, this.f62480d.c());
            xVar.c(cVar);
            cVar.j(0L);
            this.f62287a.d(cVar);
            return;
        }
        b bVar = new b(xVar, this.f62478b, this.f62479c, this.f62480d.c(), this.f62481e);
        xVar.c(bVar);
        bVar.j(0L);
        this.f62287a.d(bVar);
    }
}
