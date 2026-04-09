package tg;

import hg.C6042b;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import zg.C8750c;

/* renamed from: tg.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8113y extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62616b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f62617c;

    /* renamed from: tg.y$a */
    static final class a extends AtomicInteger implements gg.x, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62618a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f62619b;

        /* renamed from: f, reason: collision with root package name */
        final kg.n f62623f;

        /* renamed from: h, reason: collision with root package name */
        InterfaceC6043c f62625h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f62626i;

        /* renamed from: c, reason: collision with root package name */
        final C6042b f62620c = new C6042b();

        /* renamed from: e, reason: collision with root package name */
        final C8750c f62622e = new C8750c();

        /* renamed from: d, reason: collision with root package name */
        final AtomicInteger f62621d = new AtomicInteger(1);

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference f62624g = new AtomicReference();

        /* renamed from: tg.y$a$a, reason: collision with other inner class name */
        final class C2190a extends AtomicReference implements gg.p, InterfaceC6043c {
            C2190a() {
            }

            @Override // gg.p
            public void a() {
                a.this.o(this);
            }

            @Override // gg.p
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

            @Override // gg.p
            public void onError(Throwable th2) {
                a.this.s(this, th2);
            }

            @Override // gg.p
            public void onSuccess(Object obj) {
                a.this.t(this, obj);
            }
        }

        a(gg.x xVar, kg.n nVar, boolean z10) {
            this.f62618a = xVar;
            this.f62623f = nVar;
            this.f62619b = z10;
        }

        @Override // gg.x
        public void a() {
            this.f62621d.decrementAndGet();
            g();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62625h, interfaceC6043c)) {
                this.f62625h = interfaceC6043c;
                this.f62618a.c(this);
            }
        }

        void d() {
            Dg.i iVar = (Dg.i) this.f62624g.get();
            if (iVar != null) {
                iVar.clear();
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62626i = true;
            this.f62625h.dispose();
            this.f62620c.dispose();
            this.f62622e.h();
        }

        void g() {
            if (getAndIncrement() == 0) {
                j();
            }
        }

        @Override // gg.x
        public void h(Object obj) {
            try {
                Object objApply = this.f62623f.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                gg.r rVar = (gg.r) objApply;
                this.f62621d.getAndIncrement();
                C2190a c2190a = new C2190a();
                if (this.f62626i || !this.f62620c.a(c2190a)) {
                    return;
                }
                rVar.a(c2190a);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f62625h.dispose();
                onError(th2);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62626i;
        }

        void j() {
            gg.x xVar = this.f62618a;
            AtomicInteger atomicInteger = this.f62621d;
            AtomicReference atomicReference = this.f62624g;
            int iAddAndGet = 1;
            while (!this.f62626i) {
                if (!this.f62619b && ((Throwable) this.f62622e.get()) != null) {
                    d();
                    this.f62622e.n(xVar);
                    return;
                }
                boolean z10 = atomicInteger.get() == 0;
                Dg.i iVar = (Dg.i) atomicReference.get();
                Object objPoll = iVar != null ? iVar.poll() : null;
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    this.f62622e.n(xVar);
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    xVar.h(objPoll);
                }
            }
            d();
        }

        Dg.i m() {
            Dg.i iVar = (Dg.i) this.f62624g.get();
            if (iVar != null) {
                return iVar;
            }
            Dg.i iVar2 = new Dg.i(gg.s.e());
            return r.Y.a(this.f62624g, null, iVar2) ? iVar2 : (Dg.i) this.f62624g.get();
        }

        void o(C2190a c2190a) {
            this.f62620c.c(c2190a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z10 = this.f62621d.decrementAndGet() == 0;
                    Dg.i iVar = (Dg.i) this.f62624g.get();
                    if (z10 && (iVar == null || iVar.isEmpty())) {
                        this.f62622e.n(this.f62618a);
                        return;
                    } else {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        j();
                        return;
                    }
                }
            }
            this.f62621d.decrementAndGet();
            g();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f62621d.decrementAndGet();
            if (this.f62622e.g(th2)) {
                if (!this.f62619b) {
                    this.f62620c.dispose();
                }
                g();
            }
        }

        void s(C2190a c2190a, Throwable th2) {
            this.f62620c.c(c2190a);
            if (this.f62622e.g(th2)) {
                if (!this.f62619b) {
                    this.f62625h.dispose();
                    this.f62620c.dispose();
                }
                this.f62621d.decrementAndGet();
                g();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void t(tg.C8113y.a.C2190a r3, java.lang.Object r4) {
            /*
                r2 = this;
                hg.b r0 = r2.f62620c
                r0.c(r3)
                int r3 = r2.get()
                if (r3 != 0) goto L42
                r3 = 0
                r0 = 1
                boolean r1 = r2.compareAndSet(r3, r0)
                if (r1 == 0) goto L42
                gg.x r1 = r2.f62618a
                r1.h(r4)
                java.util.concurrent.atomic.AtomicInteger r4 = r2.f62621d
                int r4 = r4.decrementAndGet()
                if (r4 != 0) goto L21
                r3 = r0
            L21:
                java.util.concurrent.atomic.AtomicReference r4 = r2.f62624g
                java.lang.Object r4 = r4.get()
                Dg.i r4 = (Dg.i) r4
                if (r3 == 0) goto L3b
                if (r4 == 0) goto L33
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L3b
            L33:
                zg.c r3 = r2.f62622e
                gg.x r4 = r2.f62618a
                r3.n(r4)
                return
            L3b:
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L57
                return
            L42:
                Dg.i r3 = r2.m()
                monitor-enter(r3)
                r3.offer(r4)     // Catch: java.lang.Throwable -> L5b
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L5b
                java.util.concurrent.atomic.AtomicInteger r3 = r2.f62621d
                r3.decrementAndGet()
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L57
                return
            L57:
                r2.j()
                return
            L5b:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L5b
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: tg.C8113y.a.t(tg.y$a$a, java.lang.Object):void");
        }
    }

    public C8113y(gg.v vVar, kg.n nVar, boolean z10) {
        super(vVar);
        this.f62616b = nVar;
        this.f62617c = z10;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        this.f62287a.d(new a(xVar, this.f62616b, this.f62617c));
    }
}
