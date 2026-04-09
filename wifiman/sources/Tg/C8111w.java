package tg;

import gg.InterfaceC5914d;
import hg.C6042b;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import og.AbstractC7132b;
import zg.C8750c;

/* renamed from: tg.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8111w extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62595b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f62596c;

    /* renamed from: tg.w$a */
    static final class a extends AbstractC7132b implements gg.x {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62597a;

        /* renamed from: c, reason: collision with root package name */
        final kg.n f62599c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f62600d;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC6043c f62602f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f62603g;

        /* renamed from: b, reason: collision with root package name */
        final C8750c f62598b = new C8750c();

        /* renamed from: e, reason: collision with root package name */
        final C6042b f62601e = new C6042b();

        /* renamed from: tg.w$a$a, reason: collision with other inner class name */
        final class C2188a extends AtomicReference implements InterfaceC5914d, InterfaceC6043c {
            C2188a() {
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

        a(gg.x xVar, kg.n nVar, boolean z10) {
            this.f62597a = xVar;
            this.f62599c = nVar;
            this.f62600d = z10;
            lazySet(1);
        }

        @Override // gg.x
        public void a() {
            if (decrementAndGet() == 0) {
                this.f62598b.n(this.f62597a);
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62602f, interfaceC6043c)) {
                this.f62602f = interfaceC6043c;
                this.f62597a.c(this);
            }
        }

        @Override // Dg.g
        public void clear() {
        }

        void d(C2188a c2188a) {
            this.f62601e.c(c2188a);
            a();
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62603g = true;
            this.f62602f.dispose();
            this.f62601e.dispose();
            this.f62598b.h();
        }

        void g(C2188a c2188a, Throwable th2) {
            this.f62601e.c(c2188a);
            onError(th2);
        }

        @Override // gg.x
        public void h(Object obj) {
            try {
                Object objApply = this.f62599c.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                gg.f fVar = (gg.f) objApply;
                getAndIncrement();
                C2188a c2188a = new C2188a();
                if (this.f62603g || !this.f62601e.a(c2188a)) {
                    return;
                }
                fVar.e(c2188a);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f62602f.dispose();
                onError(th2);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62602f.isDisposed();
        }

        @Override // Dg.g
        public boolean isEmpty() {
            return true;
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62598b.g(th2)) {
                if (this.f62600d) {
                    if (decrementAndGet() == 0) {
                        this.f62598b.n(this.f62597a);
                    }
                } else {
                    this.f62603g = true;
                    this.f62602f.dispose();
                    this.f62601e.dispose();
                    this.f62598b.n(this.f62597a);
                }
            }
        }

        @Override // Dg.g
        public Object poll() {
            return null;
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            return i10 & 2;
        }
    }

    public C8111w(gg.v vVar, kg.n nVar, boolean z10) {
        super(vVar);
        this.f62595b = nVar;
        this.f62596c = z10;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar, this.f62595b, this.f62596c));
    }
}
