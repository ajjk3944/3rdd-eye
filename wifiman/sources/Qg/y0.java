package qg;

import gg.y;
import hg.InterfaceC6043c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lg.C6595e;
import yg.C8671f;
import yg.EnumC8672g;
import zg.AbstractC8755h;

/* loaded from: classes4.dex */
public final class y0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final long f59376c;

    /* renamed from: d, reason: collision with root package name */
    final TimeUnit f59377d;

    /* renamed from: e, reason: collision with root package name */
    final gg.y f59378e;

    /* renamed from: f, reason: collision with root package name */
    final Dj.a f59379f;

    static final class a implements gg.l {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59380a;

        /* renamed from: b, reason: collision with root package name */
        final C8671f f59381b;

        a(Dj.b bVar, C8671f c8671f) {
            this.f59380a = bVar;
            this.f59381b = c8671f;
        }

        @Override // Dj.b
        public void a() {
            this.f59380a.a();
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f59380a.h(obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            this.f59381b.r(cVar);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f59380a.onError(th2);
        }
    }

    static final class b extends C8671f implements gg.l, d {

        /* renamed from: i, reason: collision with root package name */
        final Dj.b f59382i;

        /* renamed from: j, reason: collision with root package name */
        final long f59383j;

        /* renamed from: k, reason: collision with root package name */
        final TimeUnit f59384k;

        /* renamed from: l, reason: collision with root package name */
        final y.c f59385l;

        /* renamed from: m, reason: collision with root package name */
        final C6595e f59386m;

        /* renamed from: n, reason: collision with root package name */
        final AtomicReference f59387n;

        /* renamed from: o, reason: collision with root package name */
        final AtomicLong f59388o;

        /* renamed from: p, reason: collision with root package name */
        long f59389p;

        /* renamed from: q, reason: collision with root package name */
        Dj.a f59390q;

        b(Dj.b bVar, long j10, TimeUnit timeUnit, y.c cVar, Dj.a aVar) {
            super(true);
            this.f59382i = bVar;
            this.f59383j = j10;
            this.f59384k = timeUnit;
            this.f59385l = cVar;
            this.f59390q = aVar;
            this.f59386m = new C6595e();
            this.f59387n = new AtomicReference();
            this.f59388o = new AtomicLong();
        }

        @Override // Dj.b
        public void a() {
            if (this.f59388o.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f59386m.dispose();
                this.f59382i.a();
                this.f59385l.dispose();
            }
        }

        @Override // yg.C8671f, Dj.c
        public void cancel() {
            super.cancel();
            this.f59385l.dispose();
        }

        @Override // qg.y0.d
        public void d(long j10) {
            if (this.f59388o.compareAndSet(j10, Long.MAX_VALUE)) {
                EnumC8672g.cancel(this.f59387n);
                long j11 = this.f59389p;
                if (j11 != 0) {
                    p(j11);
                }
                Dj.a aVar = this.f59390q;
                this.f59390q = null;
                aVar.b(new a(this.f59382i, this));
                this.f59385l.dispose();
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            long j10 = this.f59388o.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = j10 + 1;
                if (this.f59388o.compareAndSet(j10, j11)) {
                    ((InterfaceC6043c) this.f59386m.get()).dispose();
                    this.f59389p++;
                    this.f59382i.h(obj);
                    s(j11);
                }
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.setOnce(this.f59387n, cVar)) {
                r(cVar);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59388o.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                Eg.a.v(th2);
                return;
            }
            this.f59386m.dispose();
            this.f59382i.onError(th2);
            this.f59385l.dispose();
        }

        void s(long j10) {
            this.f59386m.a(this.f59385l.c(new e(j10, this), this.f59383j, this.f59384k));
        }
    }

    static final class c extends AtomicLong implements gg.l, Dj.c, d {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59391a;

        /* renamed from: b, reason: collision with root package name */
        final long f59392b;

        /* renamed from: c, reason: collision with root package name */
        final TimeUnit f59393c;

        /* renamed from: d, reason: collision with root package name */
        final y.c f59394d;

        /* renamed from: e, reason: collision with root package name */
        final C6595e f59395e = new C6595e();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference f59396f = new AtomicReference();

        /* renamed from: g, reason: collision with root package name */
        final AtomicLong f59397g = new AtomicLong();

        c(Dj.b bVar, long j10, TimeUnit timeUnit, y.c cVar) {
            this.f59391a = bVar;
            this.f59392b = j10;
            this.f59393c = timeUnit;
            this.f59394d = cVar;
        }

        @Override // Dj.b
        public void a() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f59395e.dispose();
                this.f59391a.a();
                this.f59394d.dispose();
            }
        }

        void c(long j10) {
            this.f59395e.a(this.f59394d.c(new e(j10, this), this.f59392b, this.f59393c));
        }

        @Override // Dj.c
        public void cancel() {
            EnumC8672g.cancel(this.f59396f);
            this.f59394d.dispose();
        }

        @Override // qg.y0.d
        public void d(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                EnumC8672g.cancel(this.f59396f);
                this.f59391a.onError(new TimeoutException(AbstractC8755h.g(this.f59392b, this.f59393c)));
                this.f59394d.dispose();
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    ((InterfaceC6043c) this.f59395e.get()).dispose();
                    this.f59391a.h(obj);
                    c(j11);
                }
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            EnumC8672g.deferredSetOnce(this.f59396f, this.f59397g, cVar);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                Eg.a.v(th2);
                return;
            }
            this.f59395e.dispose();
            this.f59391a.onError(th2);
            this.f59394d.dispose();
        }

        @Override // Dj.c
        public void request(long j10) {
            EnumC8672g.deferredRequest(this.f59396f, this.f59397g, j10);
        }
    }

    interface d {
        void d(long j10);
    }

    static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final d f59398a;

        /* renamed from: b, reason: collision with root package name */
        final long f59399b;

        e(long j10, d dVar) {
            this.f59399b = j10;
            this.f59398a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59398a.d(this.f59399b);
        }
    }

    public y0(gg.i iVar, long j10, TimeUnit timeUnit, gg.y yVar, Dj.a aVar) {
        super(iVar);
        this.f59376c = j10;
        this.f59377d = timeUnit;
        this.f59378e = yVar;
        this.f59379f = aVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        if (this.f59379f == null) {
            c cVar = new c(bVar, this.f59376c, this.f59377d, this.f59378e.c());
            bVar.j(cVar);
            cVar.c(0L);
            this.f58857b.D1(cVar);
            return;
        }
        b bVar2 = new b(bVar, this.f59376c, this.f59377d, this.f59378e.c(), this.f59379f);
        bVar.j(bVar2);
        bVar2.s(0L);
        this.f58857b.D1(bVar2);
    }
}
