package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import zg.C8750c;
import zg.EnumC8754g;

/* renamed from: tg.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8093d extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62317b;

    /* renamed from: c, reason: collision with root package name */
    final int f62318c;

    /* renamed from: d, reason: collision with root package name */
    final EnumC8754g f62319d;

    /* renamed from: tg.d$a */
    static final class a extends AtomicInteger implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62320a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f62321b;

        /* renamed from: c, reason: collision with root package name */
        final int f62322c;

        /* renamed from: d, reason: collision with root package name */
        final C8750c f62323d = new C8750c();

        /* renamed from: e, reason: collision with root package name */
        final C2183a f62324e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f62325f;

        /* renamed from: g, reason: collision with root package name */
        Dg.g f62326g;

        /* renamed from: h, reason: collision with root package name */
        InterfaceC6043c f62327h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f62328i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f62329j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f62330k;

        /* renamed from: l, reason: collision with root package name */
        int f62331l;

        /* renamed from: tg.d$a$a, reason: collision with other inner class name */
        static final class C2183a extends AtomicReference implements gg.x {

            /* renamed from: a, reason: collision with root package name */
            final gg.x f62332a;

            /* renamed from: b, reason: collision with root package name */
            final a f62333b;

            C2183a(gg.x xVar, a aVar) {
                this.f62332a = xVar;
                this.f62333b = aVar;
            }

            @Override // gg.x
            public void a() {
                a aVar = this.f62333b;
                aVar.f62328i = false;
                aVar.d();
            }

            @Override // gg.x
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.replace(this, interfaceC6043c);
            }

            void d() {
                EnumC6592b.dispose(this);
            }

            @Override // gg.x
            public void h(Object obj) {
                this.f62332a.h(obj);
            }

            @Override // gg.x
            public void onError(Throwable th2) {
                a aVar = this.f62333b;
                if (aVar.f62323d.g(th2)) {
                    if (!aVar.f62325f) {
                        aVar.f62327h.dispose();
                    }
                    aVar.f62328i = false;
                    aVar.d();
                }
            }
        }

        a(gg.x xVar, kg.n nVar, int i10, boolean z10) {
            this.f62320a = xVar;
            this.f62321b = nVar;
            this.f62322c = i10;
            this.f62325f = z10;
            this.f62324e = new C2183a(xVar, this);
        }

        @Override // gg.x
        public void a() {
            this.f62329j = true;
            d();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62327h, interfaceC6043c)) {
                this.f62327h = interfaceC6043c;
                if (interfaceC6043c instanceof Dg.b) {
                    Dg.b bVar = (Dg.b) interfaceC6043c;
                    int iRequestFusion = bVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f62331l = iRequestFusion;
                        this.f62326g = bVar;
                        this.f62329j = true;
                        this.f62320a.c(this);
                        d();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f62331l = iRequestFusion;
                        this.f62326g = bVar;
                        this.f62320a.c(this);
                        return;
                    }
                }
                this.f62326g = new Dg.i(this.f62322c);
                this.f62320a.c(this);
            }
        }

        void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            gg.x xVar = this.f62320a;
            Dg.g gVar = this.f62326g;
            C8750c c8750c = this.f62323d;
            while (true) {
                if (!this.f62328i) {
                    if (this.f62330k) {
                        gVar.clear();
                        return;
                    }
                    if (!this.f62325f && ((Throwable) c8750c.get()) != null) {
                        gVar.clear();
                        this.f62330k = true;
                        c8750c.n(xVar);
                        return;
                    }
                    boolean z10 = this.f62329j;
                    try {
                        Object objPoll = gVar.poll();
                        boolean z11 = objPoll == null;
                        if (z10 && z11) {
                            this.f62330k = true;
                            c8750c.n(xVar);
                            return;
                        }
                        if (!z11) {
                            try {
                                Object objApply = this.f62321b.apply(objPoll);
                                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                                gg.v vVar = (gg.v) objApply;
                                if (vVar instanceof kg.q) {
                                    try {
                                        Object obj = ((kg.q) vVar).get();
                                        if (obj != null && !this.f62330k) {
                                            xVar.h(obj);
                                        }
                                    } catch (Throwable th2) {
                                        AbstractC6152a.b(th2);
                                        c8750c.g(th2);
                                    }
                                } else {
                                    this.f62328i = true;
                                    vVar.d(this.f62324e);
                                }
                            } catch (Throwable th3) {
                                AbstractC6152a.b(th3);
                                this.f62330k = true;
                                this.f62327h.dispose();
                                gVar.clear();
                                c8750c.g(th3);
                                c8750c.n(xVar);
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        AbstractC6152a.b(th4);
                        this.f62330k = true;
                        this.f62327h.dispose();
                        c8750c.g(th4);
                        c8750c.n(xVar);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62330k = true;
            this.f62327h.dispose();
            this.f62324e.d();
            this.f62323d.h();
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62331l == 0) {
                this.f62326g.offer(obj);
            }
            d();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62330k;
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62323d.g(th2)) {
                this.f62329j = true;
                d();
            }
        }
    }

    /* renamed from: tg.d$b */
    static final class b extends AtomicInteger implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62334a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f62335b;

        /* renamed from: c, reason: collision with root package name */
        final a f62336c;

        /* renamed from: d, reason: collision with root package name */
        final int f62337d;

        /* renamed from: e, reason: collision with root package name */
        Dg.g f62338e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC6043c f62339f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f62340g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f62341h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f62342i;

        /* renamed from: j, reason: collision with root package name */
        int f62343j;

        /* renamed from: tg.d$b$a */
        static final class a extends AtomicReference implements gg.x {

            /* renamed from: a, reason: collision with root package name */
            final gg.x f62344a;

            /* renamed from: b, reason: collision with root package name */
            final b f62345b;

            a(gg.x xVar, b bVar) {
                this.f62344a = xVar;
                this.f62345b = bVar;
            }

            @Override // gg.x
            public void a() {
                this.f62345b.g();
            }

            @Override // gg.x
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.replace(this, interfaceC6043c);
            }

            void d() {
                EnumC6592b.dispose(this);
            }

            @Override // gg.x
            public void h(Object obj) {
                this.f62344a.h(obj);
            }

            @Override // gg.x
            public void onError(Throwable th2) {
                this.f62345b.dispose();
                this.f62344a.onError(th2);
            }
        }

        b(gg.x xVar, kg.n nVar, int i10) {
            this.f62334a = xVar;
            this.f62335b = nVar;
            this.f62337d = i10;
            this.f62336c = new a(xVar, this);
        }

        @Override // gg.x
        public void a() {
            if (this.f62342i) {
                return;
            }
            this.f62342i = true;
            d();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62339f, interfaceC6043c)) {
                this.f62339f = interfaceC6043c;
                if (interfaceC6043c instanceof Dg.b) {
                    Dg.b bVar = (Dg.b) interfaceC6043c;
                    int iRequestFusion = bVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f62343j = iRequestFusion;
                        this.f62338e = bVar;
                        this.f62342i = true;
                        this.f62334a.c(this);
                        d();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f62343j = iRequestFusion;
                        this.f62338e = bVar;
                        this.f62334a.c(this);
                        return;
                    }
                }
                this.f62338e = new Dg.i(this.f62337d);
                this.f62334a.c(this);
            }
        }

        void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f62341h) {
                if (!this.f62340g) {
                    boolean z10 = this.f62342i;
                    try {
                        Object objPoll = this.f62338e.poll();
                        boolean z11 = objPoll == null;
                        if (z10 && z11) {
                            this.f62341h = true;
                            this.f62334a.a();
                            return;
                        }
                        if (!z11) {
                            try {
                                Object objApply = this.f62335b.apply(objPoll);
                                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                                gg.v vVar = (gg.v) objApply;
                                this.f62340g = true;
                                vVar.d(this.f62336c);
                            } catch (Throwable th2) {
                                AbstractC6152a.b(th2);
                                dispose();
                                this.f62338e.clear();
                                this.f62334a.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        AbstractC6152a.b(th3);
                        dispose();
                        this.f62338e.clear();
                        this.f62334a.onError(th3);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f62338e.clear();
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62341h = true;
            this.f62336c.d();
            this.f62339f.dispose();
            if (getAndIncrement() == 0) {
                this.f62338e.clear();
            }
        }

        void g() {
            this.f62340g = false;
            d();
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62342i) {
                return;
            }
            if (this.f62343j == 0) {
                this.f62338e.offer(obj);
            }
            d();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62341h;
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62342i) {
                Eg.a.v(th2);
                return;
            }
            this.f62342i = true;
            dispose();
            this.f62334a.onError(th2);
        }
    }

    public C8093d(gg.v vVar, kg.n nVar, int i10, EnumC8754g enumC8754g) {
        super(vVar);
        this.f62317b = nVar;
        this.f62319d = enumC8754g;
        this.f62318c = Math.max(8, i10);
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        if (a0.b(this.f62287a, xVar, this.f62317b)) {
            return;
        }
        if (this.f62319d == EnumC8754g.IMMEDIATE) {
            this.f62287a.d(new b(new Cg.c(xVar), this.f62317b, this.f62318c));
        } else {
            this.f62287a.d(new a(xVar, this.f62317b, this.f62318c, this.f62319d == EnumC8754g.END));
        }
    }
}
