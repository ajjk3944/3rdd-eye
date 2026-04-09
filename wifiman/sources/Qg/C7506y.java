package qg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.C6042b;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import ng.InterfaceC6941b;
import yg.EnumC8672g;
import zg.C8750c;

/* renamed from: qg.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7506y extends AbstractC5912b implements InterfaceC6941b {

    /* renamed from: a, reason: collision with root package name */
    final gg.i f59363a;

    /* renamed from: b, reason: collision with root package name */
    final kg.n f59364b;

    /* renamed from: c, reason: collision with root package name */
    final int f59365c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f59366d;

    /* renamed from: qg.y$a */
    static final class a extends AtomicInteger implements gg.l, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f59367a;

        /* renamed from: c, reason: collision with root package name */
        final kg.n f59369c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f59370d;

        /* renamed from: f, reason: collision with root package name */
        final int f59372f;

        /* renamed from: g, reason: collision with root package name */
        Dj.c f59373g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f59374h;

        /* renamed from: b, reason: collision with root package name */
        final C8750c f59368b = new C8750c();

        /* renamed from: e, reason: collision with root package name */
        final C6042b f59371e = new C6042b();

        /* renamed from: qg.y$a$a, reason: collision with other inner class name */
        final class C2079a extends AtomicReference implements InterfaceC5914d, InterfaceC6043c {
            C2079a() {
            }

            @Override // gg.InterfaceC5914d
            public void a() {
                a.this.c(this);
            }

            @Override // gg.InterfaceC5914d
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this, interfaceC6043c);
            }

            @Override // hg.InterfaceC6043c
            public void dispose() {
                EnumC6592b.dispose(this);
            }

            @Override // hg.InterfaceC6043c
            public boolean isDisposed() {
                return EnumC6592b.isDisposed((InterfaceC6043c) get());
            }

            @Override // gg.InterfaceC5914d
            public void onError(Throwable th2) {
                a.this.d(this, th2);
            }
        }

        a(InterfaceC5914d interfaceC5914d, kg.n nVar, boolean z10, int i10) {
            this.f59367a = interfaceC5914d;
            this.f59369c = nVar;
            this.f59370d = z10;
            this.f59372f = i10;
            lazySet(1);
        }

        @Override // Dj.b
        public void a() {
            if (decrementAndGet() == 0) {
                this.f59368b.l(this.f59367a);
            } else if (this.f59372f != Integer.MAX_VALUE) {
                this.f59373g.request(1L);
            }
        }

        void c(C2079a c2079a) {
            this.f59371e.c(c2079a);
            a();
        }

        void d(C2079a c2079a, Throwable th2) {
            this.f59371e.c(c2079a);
            onError(th2);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f59374h = true;
            this.f59373g.cancel();
            this.f59371e.dispose();
            this.f59368b.h();
        }

        @Override // Dj.b
        public void h(Object obj) {
            try {
                Object objApply = this.f59369c.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                gg.f fVar = (gg.f) objApply;
                getAndIncrement();
                C2079a c2079a = new C2079a();
                if (this.f59374h || !this.f59371e.a(c2079a)) {
                    return;
                }
                fVar.e(c2079a);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f59373g.cancel();
                onError(th2);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f59371e.isDisposed();
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59373g, cVar)) {
                this.f59373g = cVar;
                this.f59367a.c(this);
                int i10 = this.f59372f;
                if (i10 == Integer.MAX_VALUE) {
                    cVar.request(Long.MAX_VALUE);
                } else {
                    cVar.request(i10);
                }
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59368b.g(th2)) {
                if (!this.f59370d) {
                    this.f59374h = true;
                    this.f59373g.cancel();
                    this.f59371e.dispose();
                    this.f59368b.l(this.f59367a);
                    return;
                }
                if (decrementAndGet() == 0) {
                    this.f59368b.l(this.f59367a);
                } else if (this.f59372f != Integer.MAX_VALUE) {
                    this.f59373g.request(1L);
                }
            }
        }
    }

    public C7506y(gg.i iVar, kg.n nVar, boolean z10, int i10) {
        this.f59363a = iVar;
        this.f59364b = nVar;
        this.f59366d = z10;
        this.f59365c = i10;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f59363a.D1(new a(interfaceC5914d, this.f59364b, this.f59366d, this.f59365c));
    }

    @Override // ng.InterfaceC6941b
    public gg.i f() {
        return Eg.a.o(new C7505x(this.f59363a, this.f59364b, this.f59366d, this.f59365c));
    }
}
