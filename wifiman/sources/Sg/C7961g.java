package sg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kg.n;
import lg.EnumC6592b;
import r.Y;
import yg.EnumC8672g;
import zg.C8750c;

/* renamed from: sg.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7961g extends AbstractC5912b {

    /* renamed from: a, reason: collision with root package name */
    final gg.i f61550a;

    /* renamed from: b, reason: collision with root package name */
    final n f61551b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f61552c;

    /* renamed from: sg.g$a */
    static final class a implements gg.l, InterfaceC6043c {

        /* renamed from: h, reason: collision with root package name */
        static final C2159a f61553h = new C2159a(null);

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f61554a;

        /* renamed from: b, reason: collision with root package name */
        final n f61555b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f61556c;

        /* renamed from: d, reason: collision with root package name */
        final C8750c f61557d = new C8750c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference f61558e = new AtomicReference();

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f61559f;

        /* renamed from: g, reason: collision with root package name */
        Dj.c f61560g;

        /* renamed from: sg.g$a$a, reason: collision with other inner class name */
        static final class C2159a extends AtomicReference implements InterfaceC5914d {

            /* renamed from: a, reason: collision with root package name */
            final a f61561a;

            C2159a(a aVar) {
                this.f61561a = aVar;
            }

            @Override // gg.InterfaceC5914d
            public void a() {
                this.f61561a.c(this);
            }

            @Override // gg.InterfaceC5914d
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this, interfaceC6043c);
            }

            void d() {
                EnumC6592b.dispose(this);
            }

            @Override // gg.InterfaceC5914d
            public void onError(Throwable th2) {
                this.f61561a.d(this, th2);
            }
        }

        a(InterfaceC5914d interfaceC5914d, n nVar, boolean z10) {
            this.f61554a = interfaceC5914d;
            this.f61555b = nVar;
            this.f61556c = z10;
        }

        @Override // Dj.b
        public void a() {
            this.f61559f = true;
            if (this.f61558e.get() == null) {
                this.f61557d.l(this.f61554a);
            }
        }

        void b() {
            AtomicReference atomicReference = this.f61558e;
            C2159a c2159a = f61553h;
            C2159a c2159a2 = (C2159a) atomicReference.getAndSet(c2159a);
            if (c2159a2 == null || c2159a2 == c2159a) {
                return;
            }
            c2159a2.d();
        }

        void c(C2159a c2159a) {
            if (Y.a(this.f61558e, c2159a, null) && this.f61559f) {
                this.f61557d.l(this.f61554a);
            }
        }

        void d(C2159a c2159a, Throwable th2) {
            if (!Y.a(this.f61558e, c2159a, null)) {
                Eg.a.v(th2);
                return;
            }
            if (this.f61557d.g(th2)) {
                if (this.f61556c) {
                    if (this.f61559f) {
                        this.f61557d.l(this.f61554a);
                    }
                } else {
                    this.f61560g.cancel();
                    b();
                    this.f61557d.l(this.f61554a);
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f61560g.cancel();
            b();
            this.f61557d.h();
        }

        @Override // Dj.b
        public void h(Object obj) {
            C2159a c2159a;
            try {
                Object objApply = this.f61555b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                gg.f fVar = (gg.f) objApply;
                C2159a c2159a2 = new C2159a(this);
                do {
                    c2159a = (C2159a) this.f61558e.get();
                    if (c2159a == f61553h) {
                        return;
                    }
                } while (!Y.a(this.f61558e, c2159a, c2159a2));
                if (c2159a != null) {
                    c2159a.d();
                }
                fVar.e(c2159a2);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f61560g.cancel();
                onError(th2);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f61558e.get() == f61553h;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f61560g, cVar)) {
                this.f61560g = cVar;
                this.f61554a.c(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f61557d.g(th2)) {
                if (this.f61556c) {
                    a();
                } else {
                    b();
                    this.f61557d.l(this.f61554a);
                }
            }
        }
    }

    public C7961g(gg.i iVar, n nVar, boolean z10) {
        this.f61550a = iVar;
        this.f61551b = nVar;
        this.f61552c = z10;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        this.f61550a.D1(new a(interfaceC5914d, this.f61551b, this.f61552c));
    }
}
