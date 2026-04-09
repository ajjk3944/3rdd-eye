package sg;

import gg.B;
import gg.D;
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

/* renamed from: sg.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7963i extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final gg.i f61578b;

    /* renamed from: c, reason: collision with root package name */
    final n f61579c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f61580d;

    /* renamed from: sg.i$a */
    static final class a extends AtomicInteger implements gg.l, Dj.c {

        /* renamed from: k, reason: collision with root package name */
        static final C2161a f61581k = new C2161a(null);

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f61582a;

        /* renamed from: b, reason: collision with root package name */
        final n f61583b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f61584c;

        /* renamed from: d, reason: collision with root package name */
        final C8750c f61585d = new C8750c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicLong f61586e = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        final AtomicReference f61587f = new AtomicReference();

        /* renamed from: g, reason: collision with root package name */
        Dj.c f61588g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f61589h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f61590i;

        /* renamed from: j, reason: collision with root package name */
        long f61591j;

        /* renamed from: sg.i$a$a, reason: collision with other inner class name */
        static final class C2161a extends AtomicReference implements B {

            /* renamed from: a, reason: collision with root package name */
            final a f61592a;

            /* renamed from: b, reason: collision with root package name */
            volatile Object f61593b;

            C2161a(a aVar) {
                this.f61592a = aVar;
            }

            void a() {
                EnumC6592b.dispose(this);
            }

            @Override // gg.B
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this, interfaceC6043c);
            }

            @Override // gg.B
            public void onError(Throwable th2) {
                this.f61592a.g(this, th2);
            }

            @Override // gg.B
            public void onSuccess(Object obj) {
                this.f61593b = obj;
                this.f61592a.d();
            }
        }

        a(Dj.b bVar, n nVar, boolean z10) {
            this.f61582a = bVar;
            this.f61583b = nVar;
            this.f61584c = z10;
        }

        @Override // Dj.b
        public void a() {
            this.f61589h = true;
            d();
        }

        void c() {
            AtomicReference atomicReference = this.f61587f;
            C2161a c2161a = f61581k;
            C2161a c2161a2 = (C2161a) atomicReference.getAndSet(c2161a);
            if (c2161a2 == null || c2161a2 == c2161a) {
                return;
            }
            c2161a2.a();
        }

        @Override // Dj.c
        public void cancel() {
            this.f61590i = true;
            this.f61588g.cancel();
            c();
            this.f61585d.h();
        }

        void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            Dj.b bVar = this.f61582a;
            C8750c c8750c = this.f61585d;
            AtomicReference atomicReference = this.f61587f;
            AtomicLong atomicLong = this.f61586e;
            long j10 = this.f61591j;
            int iAddAndGet = 1;
            while (!this.f61590i) {
                if (c8750c.get() != null && !this.f61584c) {
                    c8750c.j(bVar);
                    return;
                }
                boolean z10 = this.f61589h;
                C2161a c2161a = (C2161a) atomicReference.get();
                boolean z11 = c2161a == null;
                if (z10 && z11) {
                    c8750c.j(bVar);
                    return;
                }
                if (z11 || c2161a.f61593b == null || j10 == atomicLong.get()) {
                    this.f61591j = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Y.a(atomicReference, c2161a, null);
                    bVar.h(c2161a.f61593b);
                    j10++;
                }
            }
        }

        void g(C2161a c2161a, Throwable th2) {
            if (!Y.a(this.f61587f, c2161a, null)) {
                Eg.a.v(th2);
            } else if (this.f61585d.g(th2)) {
                if (!this.f61584c) {
                    this.f61588g.cancel();
                    c();
                }
                d();
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            C2161a c2161a;
            C2161a c2161a2 = (C2161a) this.f61587f.get();
            if (c2161a2 != null) {
                c2161a2.a();
            }
            try {
                Object objApply = this.f61583b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
                D d10 = (D) objApply;
                C2161a c2161a3 = new C2161a(this);
                do {
                    c2161a = (C2161a) this.f61587f.get();
                    if (c2161a == f61581k) {
                        return;
                    }
                } while (!Y.a(this.f61587f, c2161a, c2161a3));
                d10.a(c2161a3);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f61588g.cancel();
                this.f61587f.getAndSet(f61581k);
                onError(th2);
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f61588g, cVar)) {
                this.f61588g = cVar;
                this.f61582a.j(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f61585d.g(th2)) {
                if (!this.f61584c) {
                    c();
                }
                this.f61589h = true;
                d();
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            AbstractC8751d.a(this.f61586e, j10);
            d();
        }
    }

    public C7963i(gg.i iVar, n nVar, boolean z10) {
        this.f61578b = iVar;
        this.f61579c = nVar;
        this.f61580d = z10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f61578b.D1(new a(bVar, this.f61579c, this.f61580d));
    }
}
