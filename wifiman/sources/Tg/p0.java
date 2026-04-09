package tg;

import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import vg.C8229a;
import zg.C8750c;

/* loaded from: classes4.dex */
public final class p0 extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final gg.v f62532b;

    /* renamed from: c, reason: collision with root package name */
    final int f62533c;

    static final class a extends Cg.a {

        /* renamed from: b, reason: collision with root package name */
        final b f62534b;

        /* renamed from: c, reason: collision with root package name */
        boolean f62535c;

        a(b bVar) {
            this.f62534b = bVar;
        }

        @Override // gg.x
        public void a() {
            if (this.f62535c) {
                return;
            }
            this.f62535c = true;
            this.f62534b.g();
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62535c) {
                return;
            }
            this.f62534b.m();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62535c) {
                Eg.a.v(th2);
            } else {
                this.f62535c = true;
                this.f62534b.j(th2);
            }
        }
    }

    static final class b extends AtomicInteger implements gg.x, InterfaceC6043c, Runnable {

        /* renamed from: k, reason: collision with root package name */
        static final Object f62536k = new Object();

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62537a;

        /* renamed from: b, reason: collision with root package name */
        final int f62538b;

        /* renamed from: c, reason: collision with root package name */
        final a f62539c = new a(this);

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference f62540d = new AtomicReference();

        /* renamed from: e, reason: collision with root package name */
        final AtomicInteger f62541e = new AtomicInteger(1);

        /* renamed from: f, reason: collision with root package name */
        final C8229a f62542f = new C8229a();

        /* renamed from: g, reason: collision with root package name */
        final C8750c f62543g = new C8750c();

        /* renamed from: h, reason: collision with root package name */
        final AtomicBoolean f62544h = new AtomicBoolean();

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f62545i;

        /* renamed from: j, reason: collision with root package name */
        Hg.e f62546j;

        b(gg.x xVar, int i10) {
            this.f62537a = xVar;
            this.f62538b = i10;
        }

        @Override // gg.x
        public void a() {
            this.f62539c.dispose();
            this.f62545i = true;
            d();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this.f62540d, interfaceC6043c)) {
                m();
            }
        }

        void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            gg.x xVar = this.f62537a;
            C8229a c8229a = this.f62542f;
            C8750c c8750c = this.f62543g;
            int iAddAndGet = 1;
            while (this.f62541e.get() != 0) {
                Hg.e eVar = this.f62546j;
                boolean z10 = this.f62545i;
                if (z10 && c8750c.get() != null) {
                    c8229a.clear();
                    Throwable thC = c8750c.c();
                    if (eVar != null) {
                        this.f62546j = null;
                        eVar.onError(thC);
                    }
                    xVar.onError(thC);
                    return;
                }
                Object objPoll = c8229a.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    Throwable thC2 = c8750c.c();
                    if (thC2 == null) {
                        if (eVar != null) {
                            this.f62546j = null;
                            eVar.a();
                        }
                        xVar.a();
                        return;
                    }
                    if (eVar != null) {
                        this.f62546j = null;
                        eVar.onError(thC2);
                    }
                    xVar.onError(thC2);
                    return;
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f62536k) {
                    eVar.h(objPoll);
                } else {
                    if (eVar != null) {
                        this.f62546j = null;
                        eVar.a();
                    }
                    if (!this.f62544h.get()) {
                        Hg.e eVarJ1 = Hg.e.j1(this.f62538b, this);
                        this.f62546j = eVarJ1;
                        this.f62541e.getAndIncrement();
                        q0 q0Var = new q0(eVarJ1);
                        xVar.h(q0Var);
                        if (q0Var.i1()) {
                            eVarJ1.a();
                        }
                    }
                }
            }
            c8229a.clear();
            this.f62546j = null;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f62544h.compareAndSet(false, true)) {
                this.f62539c.dispose();
                if (this.f62541e.decrementAndGet() == 0) {
                    EnumC6592b.dispose(this.f62540d);
                }
            }
        }

        void g() {
            EnumC6592b.dispose(this.f62540d);
            this.f62545i = true;
            d();
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f62542f.offer(obj);
            d();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62544h.get();
        }

        void j(Throwable th2) {
            EnumC6592b.dispose(this.f62540d);
            if (this.f62543g.g(th2)) {
                this.f62545i = true;
                d();
            }
        }

        void m() {
            this.f62542f.offer(f62536k);
            d();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f62539c.dispose();
            if (this.f62543g.g(th2)) {
                this.f62545i = true;
                d();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f62541e.decrementAndGet() == 0) {
                EnumC6592b.dispose(this.f62540d);
            }
        }
    }

    public p0(gg.v vVar, gg.v vVar2, int i10) {
        super(vVar);
        this.f62532b = vVar2;
        this.f62533c = i10;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        b bVar = new b(xVar, this.f62533c);
        xVar.c(bVar);
        this.f62532b.d(bVar.f62539c);
        this.f62287a.d(bVar);
    }
}
