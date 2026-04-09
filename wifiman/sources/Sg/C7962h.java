package sg;

import gg.p;
import gg.r;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kg.n;
import lg.EnumC6592b;
import r.Y;
import yg.EnumC8672g;
import zg.AbstractC8751d;
import zg.C8750c;

/* renamed from: sg.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7962h extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final gg.i f61562b;

    /* renamed from: c, reason: collision with root package name */
    final n f61563c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f61564d;

    /* renamed from: sg.h$a */
    static final class a extends AtomicInteger implements gg.l, Dj.c {

        /* renamed from: k, reason: collision with root package name */
        static final C2160a f61565k = new C2160a(null);

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f61566a;

        /* renamed from: b, reason: collision with root package name */
        final n f61567b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f61568c;

        /* renamed from: d, reason: collision with root package name */
        final C8750c f61569d = new C8750c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicLong f61570e = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference f61571f = new AtomicReference();

        /* renamed from: g, reason: collision with root package name */
        Dj.c f61572g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f61573h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f61574i;

        /* renamed from: j, reason: collision with root package name */
        long f61575j;

        /* renamed from: sg.h$a$a, reason: collision with other inner class name */
        static final class C2160a extends AtomicReference implements p {

            /* renamed from: a, reason: collision with root package name */
            final a f61576a;

            /* renamed from: b, reason: collision with root package name */
            volatile Object f61577b;

            C2160a(a aVar) {
                this.f61576a = aVar;
            }

            @Override // gg.p
            public void a() {
                this.f61576a.g(this);
            }

            @Override // gg.p
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this, interfaceC6043c);
            }

            void d() {
                EnumC6592b.dispose(this);
            }

            @Override // gg.p
            public void onError(Throwable th2) {
                this.f61576a.l(this, th2);
            }

            @Override // gg.p
            public void onSuccess(Object obj) {
                this.f61577b = obj;
                this.f61576a.d();
            }
        }

        a(Dj.b bVar, n nVar, boolean z10) {
            this.f61566a = bVar;
            this.f61567b = nVar;
            this.f61568c = z10;
        }

        @Override // Dj.b
        public void a() {
            this.f61573h = true;
            d();
        }

        void c() {
            AtomicReference atomicReference = this.f61571f;
            C2160a c2160a = f61565k;
            C2160a c2160a2 = (C2160a) atomicReference.getAndSet(c2160a);
            if (c2160a2 == null || c2160a2 == c2160a) {
                return;
            }
            c2160a2.d();
        }

        @Override // Dj.c
        public void cancel() {
            this.f61574i = true;
            this.f61572g.cancel();
            c();
            this.f61569d.h();
        }

        void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            Dj.b bVar = this.f61566a;
            C8750c c8750c = this.f61569d;
            AtomicReference atomicReference = this.f61571f;
            AtomicLong atomicLong = this.f61570e;
            long j10 = this.f61575j;
            int iAddAndGet = 1;
            while (!this.f61574i) {
                if (c8750c.get() != null && !this.f61568c) {
                    c8750c.j(bVar);
                    return;
                }
                boolean z10 = this.f61573h;
                C2160a c2160a = (C2160a) atomicReference.get();
                boolean z11 = c2160a == null;
                if (z10 && z11) {
                    c8750c.j(bVar);
                    return;
                }
                if (z11 || c2160a.f61577b == null || j10 == atomicLong.get()) {
                    this.f61575j = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Y.a(atomicReference, c2160a, null);
                    bVar.h(c2160a.f61577b);
                    j10++;
                }
            }
        }

        void g(C2160a c2160a) {
            if (Y.a(this.f61571f, c2160a, null)) {
                d();
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            C2160a c2160a;
            C2160a c2160a2 = (C2160a) this.f61571f.get();
            if (c2160a2 != null) {
                c2160a2.d();
            }
            try {
                Object objApply = this.f61567b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                r rVar = (r) objApply;
                C2160a c2160a3 = new C2160a(this);
                do {
                    c2160a = (C2160a) this.f61571f.get();
                    if (c2160a == f61565k) {
                        return;
                    }
                } while (!Y.a(this.f61571f, c2160a, c2160a3));
                rVar.a(c2160a3);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f61572g.cancel();
                this.f61571f.getAndSet(f61565k);
                onError(th2);
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f61572g, cVar)) {
                this.f61572g = cVar;
                this.f61566a.j(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        void l(C2160a c2160a, Throwable th2) {
            if (!Y.a(this.f61571f, c2160a, null)) {
                Eg.a.v(th2);
            } else if (this.f61569d.g(th2)) {
                if (!this.f61568c) {
                    this.f61572g.cancel();
                    c();
                }
                d();
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f61569d.g(th2)) {
                if (!this.f61568c) {
                    c();
                }
                this.f61573h = true;
                d();
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            AbstractC8751d.a(this.f61570e, j10);
            d();
        }
    }

    public C7962h(gg.i iVar, n nVar, boolean z10) {
        this.f61562b = iVar;
        this.f61563c = nVar;
        this.f61564d = z10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f61562b.D1(new a(bVar, this.f61563c, this.f61564d));
    }
}
