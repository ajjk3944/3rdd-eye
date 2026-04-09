package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lg.C6595e;
import lg.EnumC6592b;
import tg.m0;

/* loaded from: classes4.dex */
public final class l0 extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final gg.v f62457b;

    /* renamed from: c, reason: collision with root package name */
    final kg.n f62458c;

    /* renamed from: d, reason: collision with root package name */
    final gg.v f62459d;

    static final class a extends AtomicReference implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final d f62460a;

        /* renamed from: b, reason: collision with root package name */
        final long f62461b;

        a(long j10, d dVar) {
            this.f62461b = j10;
            this.f62460a = dVar;
        }

        @Override // gg.x
        public void a() {
            Object obj = get();
            EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
            if (obj != enumC6592b) {
                lazySet(enumC6592b);
                this.f62460a.d(this.f62461b);
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this, interfaceC6043c);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // gg.x
        public void h(Object obj) {
            InterfaceC6043c interfaceC6043c = (InterfaceC6043c) get();
            EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
            if (interfaceC6043c != enumC6592b) {
                interfaceC6043c.dispose();
                lazySet(enumC6592b);
                this.f62460a.d(this.f62461b);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            Object obj = get();
            EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
            if (obj == enumC6592b) {
                Eg.a.v(th2);
            } else {
                lazySet(enumC6592b);
                this.f62460a.g(this.f62461b, th2);
            }
        }
    }

    static final class b extends AtomicReference implements gg.x, InterfaceC6043c, d {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62462a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f62463b;

        /* renamed from: c, reason: collision with root package name */
        final C6595e f62464c = new C6595e();

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f62465d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference f62466e = new AtomicReference();

        /* renamed from: f, reason: collision with root package name */
        gg.v f62467f;

        b(gg.x xVar, kg.n nVar, gg.v vVar) {
            this.f62462a = xVar;
            this.f62463b = nVar;
            this.f62467f = vVar;
        }

        @Override // gg.x
        public void a() {
            if (this.f62465d.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f62464c.dispose();
                this.f62462a.a();
                this.f62464c.dispose();
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this.f62466e, interfaceC6043c);
        }

        @Override // tg.m0.d
        public void d(long j10) {
            if (this.f62465d.compareAndSet(j10, Long.MAX_VALUE)) {
                EnumC6592b.dispose(this.f62466e);
                gg.v vVar = this.f62467f;
                this.f62467f = null;
                vVar.d(new m0.a(this.f62462a, this));
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this.f62466e);
            EnumC6592b.dispose(this);
            this.f62464c.dispose();
        }

        @Override // tg.l0.d
        public void g(long j10, Throwable th2) {
            if (!this.f62465d.compareAndSet(j10, Long.MAX_VALUE)) {
                Eg.a.v(th2);
            } else {
                EnumC6592b.dispose(this);
                this.f62462a.onError(th2);
            }
        }

        @Override // gg.x
        public void h(Object obj) {
            long j10 = this.f62465d.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.f62465d.compareAndSet(j10, j11)) {
                    InterfaceC6043c interfaceC6043c = (InterfaceC6043c) this.f62464c.get();
                    if (interfaceC6043c != null) {
                        interfaceC6043c.dispose();
                    }
                    this.f62462a.h(obj);
                    try {
                        Object objApply = this.f62463b.apply(obj);
                        Objects.requireNonNull(objApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        gg.v vVar = (gg.v) objApply;
                        a aVar = new a(j11, this);
                        if (this.f62464c.a(aVar)) {
                            vVar.d(aVar);
                        }
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        ((InterfaceC6043c) this.f62466e.get()).dispose();
                        this.f62465d.getAndSet(Long.MAX_VALUE);
                        this.f62462a.onError(th2);
                    }
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        void j(gg.v vVar) {
            if (vVar != null) {
                a aVar = new a(0L, this);
                if (this.f62464c.a(aVar)) {
                    vVar.d(aVar);
                }
            }
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62465d.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                Eg.a.v(th2);
                return;
            }
            this.f62464c.dispose();
            this.f62462a.onError(th2);
            this.f62464c.dispose();
        }
    }

    static final class c extends AtomicLong implements gg.x, InterfaceC6043c, d {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62468a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f62469b;

        /* renamed from: c, reason: collision with root package name */
        final C6595e f62470c = new C6595e();

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference f62471d = new AtomicReference();

        c(gg.x xVar, kg.n nVar) {
            this.f62468a = xVar;
            this.f62469b = nVar;
        }

        @Override // gg.x
        public void a() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f62470c.dispose();
                this.f62468a.a();
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this.f62471d, interfaceC6043c);
        }

        @Override // tg.m0.d
        public void d(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                EnumC6592b.dispose(this.f62471d);
                this.f62468a.onError(new TimeoutException());
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this.f62471d);
            this.f62470c.dispose();
        }

        @Override // tg.l0.d
        public void g(long j10, Throwable th2) {
            if (!compareAndSet(j10, Long.MAX_VALUE)) {
                Eg.a.v(th2);
            } else {
                EnumC6592b.dispose(this.f62471d);
                this.f62468a.onError(th2);
            }
        }

        @Override // gg.x
        public void h(Object obj) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    InterfaceC6043c interfaceC6043c = (InterfaceC6043c) this.f62470c.get();
                    if (interfaceC6043c != null) {
                        interfaceC6043c.dispose();
                    }
                    this.f62468a.h(obj);
                    try {
                        Object objApply = this.f62469b.apply(obj);
                        Objects.requireNonNull(objApply, "The itemTimeoutIndicator returned a null ObservableSource.");
                        gg.v vVar = (gg.v) objApply;
                        a aVar = new a(j11, this);
                        if (this.f62470c.a(aVar)) {
                            vVar.d(aVar);
                        }
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        ((InterfaceC6043c) this.f62471d.get()).dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.f62468a.onError(th2);
                    }
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) this.f62471d.get());
        }

        void j(gg.v vVar) {
            if (vVar != null) {
                a aVar = new a(0L, this);
                if (this.f62470c.a(aVar)) {
                    vVar.d(aVar);
                }
            }
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                Eg.a.v(th2);
            } else {
                this.f62470c.dispose();
                this.f62468a.onError(th2);
            }
        }
    }

    interface d extends m0.d {
        void g(long j10, Throwable th2);
    }

    public l0(gg.s sVar, gg.v vVar, kg.n nVar, gg.v vVar2) {
        super(sVar);
        this.f62457b = vVar;
        this.f62458c = nVar;
        this.f62459d = vVar2;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        if (this.f62459d == null) {
            c cVar = new c(xVar, this.f62458c);
            xVar.c(cVar);
            cVar.j(this.f62457b);
            this.f62287a.d(cVar);
            return;
        }
        b bVar = new b(xVar, this.f62458c, this.f62459d);
        xVar.c(bVar);
        bVar.j(this.f62457b);
        this.f62287a.d(bVar);
    }
}
