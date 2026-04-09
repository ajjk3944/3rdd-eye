package qg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lg.C6595e;
import qg.y0;
import yg.C8671f;
import yg.EnumC8672g;

/* loaded from: classes4.dex */
public final class x0 extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final Dj.a f59346c;

    /* renamed from: d, reason: collision with root package name */
    final kg.n f59347d;

    /* renamed from: e, reason: collision with root package name */
    final Dj.a f59348e;

    static final class a extends AtomicReference implements gg.l, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final c f59349a;

        /* renamed from: b, reason: collision with root package name */
        final long f59350b;

        a(long j10, c cVar) {
            this.f59350b = j10;
            this.f59349a = cVar;
        }

        @Override // Dj.b
        public void a() {
            Object obj = get();
            EnumC8672g enumC8672g = EnumC8672g.CANCELLED;
            if (obj != enumC8672g) {
                lazySet(enumC8672g);
                this.f59349a.d(this.f59350b);
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC8672g.cancel(this);
        }

        @Override // Dj.b
        public void h(Object obj) {
            Dj.c cVar = (Dj.c) get();
            EnumC8672g enumC8672g = EnumC8672g.CANCELLED;
            if (cVar != enumC8672g) {
                cVar.cancel();
                lazySet(enumC8672g);
                this.f59349a.d(this.f59350b);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get() == EnumC8672g.CANCELLED;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            EnumC8672g.setOnce(this, cVar, Long.MAX_VALUE);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            Object obj = get();
            EnumC8672g enumC8672g = EnumC8672g.CANCELLED;
            if (obj == enumC8672g) {
                Eg.a.v(th2);
            } else {
                lazySet(enumC8672g);
                this.f59349a.g(this.f59350b, th2);
            }
        }
    }

    static final class b extends C8671f implements gg.l, c {

        /* renamed from: i, reason: collision with root package name */
        final Dj.b f59351i;

        /* renamed from: j, reason: collision with root package name */
        final kg.n f59352j;

        /* renamed from: k, reason: collision with root package name */
        final C6595e f59353k;

        /* renamed from: l, reason: collision with root package name */
        final AtomicReference f59354l;

        /* renamed from: m, reason: collision with root package name */
        final AtomicLong f59355m;

        /* renamed from: n, reason: collision with root package name */
        Dj.a f59356n;

        /* renamed from: o, reason: collision with root package name */
        long f59357o;

        b(Dj.b bVar, kg.n nVar, Dj.a aVar) {
            super(true);
            this.f59351i = bVar;
            this.f59352j = nVar;
            this.f59353k = new C6595e();
            this.f59354l = new AtomicReference();
            this.f59356n = aVar;
            this.f59355m = new AtomicLong();
        }

        @Override // Dj.b
        public void a() {
            if (this.f59355m.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f59353k.dispose();
                this.f59351i.a();
                this.f59353k.dispose();
            }
        }

        @Override // yg.C8671f, Dj.c
        public void cancel() {
            super.cancel();
            this.f59353k.dispose();
        }

        @Override // qg.y0.d
        public void d(long j10) {
            if (this.f59355m.compareAndSet(j10, Long.MAX_VALUE)) {
                EnumC8672g.cancel(this.f59354l);
                Dj.a aVar = this.f59356n;
                this.f59356n = null;
                long j11 = this.f59357o;
                if (j11 != 0) {
                    p(j11);
                }
                aVar.b(new y0.a(this.f59351i, this));
            }
        }

        @Override // qg.x0.c
        public void g(long j10, Throwable th2) {
            if (!this.f59355m.compareAndSet(j10, Long.MAX_VALUE)) {
                Eg.a.v(th2);
            } else {
                EnumC8672g.cancel(this.f59354l);
                this.f59351i.onError(th2);
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            long j10 = this.f59355m.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = j10 + 1;
                if (this.f59355m.compareAndSet(j10, j11)) {
                    InterfaceC6043c interfaceC6043c = (InterfaceC6043c) this.f59353k.get();
                    if (interfaceC6043c != null) {
                        interfaceC6043c.dispose();
                    }
                    this.f59357o++;
                    this.f59351i.h(obj);
                    try {
                        Object objApply = this.f59352j.apply(obj);
                        Objects.requireNonNull(objApply, "The itemTimeoutIndicator returned a null Publisher.");
                        Dj.a aVar = (Dj.a) objApply;
                        a aVar2 = new a(j11, this);
                        if (this.f59353k.a(aVar2)) {
                            aVar.b(aVar2);
                        }
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        ((Dj.c) this.f59354l.get()).cancel();
                        this.f59355m.getAndSet(Long.MAX_VALUE);
                        this.f59351i.onError(th2);
                    }
                }
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.setOnce(this.f59354l, cVar)) {
                r(cVar);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59355m.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                Eg.a.v(th2);
                return;
            }
            this.f59353k.dispose();
            this.f59351i.onError(th2);
            this.f59353k.dispose();
        }

        void s(Dj.a aVar) {
            if (aVar != null) {
                a aVar2 = new a(0L, this);
                if (this.f59353k.a(aVar2)) {
                    aVar.b(aVar2);
                }
            }
        }
    }

    interface c extends y0.d {
        void g(long j10, Throwable th2);
    }

    static final class d extends AtomicLong implements gg.l, Dj.c, c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59358a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f59359b;

        /* renamed from: c, reason: collision with root package name */
        final C6595e f59360c = new C6595e();

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference f59361d = new AtomicReference();

        /* renamed from: e, reason: collision with root package name */
        final AtomicLong f59362e = new AtomicLong();

        d(Dj.b bVar, kg.n nVar) {
            this.f59358a = bVar;
            this.f59359b = nVar;
        }

        @Override // Dj.b
        public void a() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f59360c.dispose();
                this.f59358a.a();
            }
        }

        void c(Dj.a aVar) {
            if (aVar != null) {
                a aVar2 = new a(0L, this);
                if (this.f59360c.a(aVar2)) {
                    aVar.b(aVar2);
                }
            }
        }

        @Override // Dj.c
        public void cancel() {
            EnumC8672g.cancel(this.f59361d);
            this.f59360c.dispose();
        }

        @Override // qg.y0.d
        public void d(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                EnumC8672g.cancel(this.f59361d);
                this.f59358a.onError(new TimeoutException());
            }
        }

        @Override // qg.x0.c
        public void g(long j10, Throwable th2) {
            if (!compareAndSet(j10, Long.MAX_VALUE)) {
                Eg.a.v(th2);
            } else {
                EnumC8672g.cancel(this.f59361d);
                this.f59358a.onError(th2);
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    InterfaceC6043c interfaceC6043c = (InterfaceC6043c) this.f59360c.get();
                    if (interfaceC6043c != null) {
                        interfaceC6043c.dispose();
                    }
                    this.f59358a.h(obj);
                    try {
                        Object objApply = this.f59359b.apply(obj);
                        Objects.requireNonNull(objApply, "The itemTimeoutIndicator returned a null Publisher.");
                        Dj.a aVar = (Dj.a) objApply;
                        a aVar2 = new a(j11, this);
                        if (this.f59360c.a(aVar2)) {
                            aVar.b(aVar2);
                        }
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        ((Dj.c) this.f59361d.get()).cancel();
                        getAndSet(Long.MAX_VALUE);
                        this.f59358a.onError(th2);
                    }
                }
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            EnumC8672g.deferredSetOnce(this.f59361d, this.f59362e, cVar);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                Eg.a.v(th2);
            } else {
                this.f59360c.dispose();
                this.f59358a.onError(th2);
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            EnumC8672g.deferredRequest(this.f59361d, this.f59362e, j10);
        }
    }

    public x0(gg.i iVar, Dj.a aVar, kg.n nVar, Dj.a aVar2) {
        super(iVar);
        this.f59346c = aVar;
        this.f59347d = nVar;
        this.f59348e = aVar2;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        if (this.f59348e == null) {
            d dVar = new d(bVar, this.f59347d);
            bVar.j(dVar);
            dVar.c(this.f59346c);
            this.f58857b.D1(dVar);
            return;
        }
        b bVar2 = new b(bVar, this.f59347d, this.f59348e);
        bVar.j(bVar2);
        bVar2.s(this.f59346c);
        this.f58857b.D1(bVar2);
    }
}
