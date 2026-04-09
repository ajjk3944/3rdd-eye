package tg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.C6042b;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import ng.InterfaceC6943d;
import zg.C8750c;

/* renamed from: tg.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8112x extends AbstractC5912b implements InterfaceC6943d {

    /* renamed from: a, reason: collision with root package name */
    final gg.v f62605a;

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62606b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f62607c;

    /* renamed from: tg.x$a */
    static final class a extends AtomicInteger implements InterfaceC6043c, gg.x {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f62608a;

        /* renamed from: c, reason: collision with root package name */
        final kg.n f62610c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f62611d;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC6043c f62613f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f62614g;

        /* renamed from: b, reason: collision with root package name */
        final C8750c f62609b = new C8750c();

        /* renamed from: e, reason: collision with root package name */
        final C6042b f62612e = new C6042b();

        /* renamed from: tg.x$a$a, reason: collision with other inner class name */
        final class C2189a extends AtomicReference implements InterfaceC5914d, InterfaceC6043c {
            C2189a() {
            }

            @Override // gg.InterfaceC5914d
            public void a() {
                a.this.d(this);
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
                a.this.g(this, th2);
            }
        }

        a(InterfaceC5914d interfaceC5914d, kg.n nVar, boolean z10) {
            this.f62608a = interfaceC5914d;
            this.f62610c = nVar;
            this.f62611d = z10;
            lazySet(1);
        }

        @Override // gg.x
        public void a() {
            if (decrementAndGet() == 0) {
                this.f62609b.l(this.f62608a);
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62613f, interfaceC6043c)) {
                this.f62613f = interfaceC6043c;
                this.f62608a.c(this);
            }
        }

        void d(C2189a c2189a) {
            this.f62612e.c(c2189a);
            a();
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62614g = true;
            this.f62613f.dispose();
            this.f62612e.dispose();
            this.f62609b.h();
        }

        void g(C2189a c2189a, Throwable th2) {
            this.f62612e.c(c2189a);
            onError(th2);
        }

        @Override // gg.x
        public void h(Object obj) {
            try {
                Object objApply = this.f62610c.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                gg.f fVar = (gg.f) objApply;
                getAndIncrement();
                C2189a c2189a = new C2189a();
                if (this.f62614g || !this.f62612e.a(c2189a)) {
                    return;
                }
                fVar.e(c2189a);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f62613f.dispose();
                onError(th2);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62613f.isDisposed();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62609b.g(th2)) {
                if (this.f62611d) {
                    if (decrementAndGet() == 0) {
                        this.f62609b.l(this.f62608a);
                    }
                } else {
                    this.f62614g = true;
                    this.f62613f.dispose();
                    this.f62612e.dispose();
                    this.f62609b.l(this.f62608a);
                }
            }
        }
    }

    public C8112x(gg.v vVar, kg.n nVar, boolean z10) {
        this.f62605a = vVar;
        this.f62606b = nVar;
        this.f62607c = z10;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f62605a.d(new a(interfaceC5914d, this.f62606b, this.f62607c));
    }

    @Override // ng.InterfaceC6943d
    public gg.s b() {
        return Eg.a.q(new C8111w(this.f62605a, this.f62606b, this.f62607c));
    }
}
