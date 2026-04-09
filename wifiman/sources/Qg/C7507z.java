package qg;

import hg.C6042b;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import yg.EnumC8672g;
import zg.AbstractC8751d;
import zg.C8750c;

/* renamed from: qg.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7507z extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.n f59400c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f59401d;

    /* renamed from: e, reason: collision with root package name */
    final int f59402e;

    /* renamed from: qg.z$a */
    static final class a extends AtomicInteger implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59403a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f59404b;

        /* renamed from: c, reason: collision with root package name */
        final int f59405c;

        /* renamed from: h, reason: collision with root package name */
        final kg.n f59410h;

        /* renamed from: j, reason: collision with root package name */
        Dj.c f59412j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f59413k;

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f59406d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        final C6042b f59407e = new C6042b();

        /* renamed from: g, reason: collision with root package name */
        final C8750c f59409g = new C8750c();

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f59408f = new AtomicInteger(1);

        /* renamed from: i, reason: collision with root package name */
        final AtomicReference f59411i = new AtomicReference();

        /* renamed from: qg.z$a$a, reason: collision with other inner class name */
        final class C2080a extends AtomicReference implements gg.p, InterfaceC6043c {
            C2080a() {
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
                a.this.p(this, th2);
            }

            @Override // gg.p
            public void onSuccess(Object obj) {
                a.this.r(this, obj);
            }
        }

        a(Dj.b bVar, kg.n nVar, boolean z10, int i10) {
            this.f59403a = bVar;
            this.f59410h = nVar;
            this.f59404b = z10;
            this.f59405c = i10;
        }

        static boolean c(boolean z10, Dg.i iVar) {
            return z10 && (iVar == null || iVar.isEmpty());
        }

        @Override // Dj.b
        public void a() {
            this.f59408f.decrementAndGet();
            g();
        }

        @Override // Dj.c
        public void cancel() {
            this.f59413k = true;
            this.f59412j.cancel();
            this.f59407e.dispose();
            this.f59409g.h();
        }

        void d() {
            Dg.i iVar = (Dg.i) this.f59411i.get();
            if (iVar != null) {
                iVar.clear();
            }
        }

        void g() {
            if (getAndIncrement() == 0) {
                l();
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            try {
                Object objApply = this.f59410h.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                gg.r rVar = (gg.r) objApply;
                this.f59408f.getAndIncrement();
                C2080a c2080a = new C2080a();
                if (this.f59413k || !this.f59407e.a(c2080a)) {
                    return;
                }
                rVar.a(c2080a);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f59412j.cancel();
                onError(th2);
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59412j, cVar)) {
                this.f59412j = cVar;
                this.f59403a.j(this);
                int i10 = this.f59405c;
                if (i10 == Integer.MAX_VALUE) {
                    cVar.request(Long.MAX_VALUE);
                } else {
                    cVar.request(i10);
                }
            }
        }

        void l() {
            Dj.b bVar = this.f59403a;
            AtomicInteger atomicInteger = this.f59408f;
            AtomicReference atomicReference = this.f59411i;
            int iAddAndGet = 1;
            do {
                long j10 = this.f59406d.get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (this.f59413k) {
                        d();
                        return;
                    }
                    if (!this.f59404b && ((Throwable) this.f59409g.get()) != null) {
                        d();
                        this.f59409g.j(bVar);
                        return;
                    }
                    boolean z10 = atomicInteger.get() == 0;
                    Dg.i iVar = (Dg.i) atomicReference.get();
                    Object objPoll = iVar != null ? iVar.poll() : null;
                    boolean z11 = objPoll == null;
                    if (z10 && z11) {
                        this.f59409g.j(bVar);
                        return;
                    } else {
                        if (z11) {
                            break;
                        }
                        bVar.h(objPoll);
                        j11++;
                    }
                }
                if (j11 == j10) {
                    if (this.f59413k) {
                        d();
                        return;
                    }
                    if (!this.f59404b && ((Throwable) this.f59409g.get()) != null) {
                        d();
                        this.f59409g.j(bVar);
                        return;
                    }
                    boolean z12 = atomicInteger.get() == 0;
                    Dg.i iVar2 = (Dg.i) atomicReference.get();
                    boolean z13 = iVar2 == null || iVar2.isEmpty();
                    if (z12 && z13) {
                        this.f59409g.j(bVar);
                        return;
                    }
                }
                if (j11 != 0) {
                    AbstractC8751d.d(this.f59406d, j11);
                    if (this.f59405c != Integer.MAX_VALUE) {
                        this.f59412j.request(j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        Dg.i n() {
            Dg.i iVar = (Dg.i) this.f59411i.get();
            if (iVar != null) {
                return iVar;
            }
            Dg.i iVar2 = new Dg.i(gg.i.i());
            return r.Y.a(this.f59411i, null, iVar2) ? iVar2 : (Dg.i) this.f59411i.get();
        }

        void o(C2080a c2080a) {
            this.f59407e.c(c2080a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    if (c(this.f59408f.decrementAndGet() == 0, (Dg.i) this.f59411i.get())) {
                        this.f59409g.j(this.f59403a);
                        return;
                    }
                    if (this.f59405c != Integer.MAX_VALUE) {
                        this.f59412j.request(1L);
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    l();
                    return;
                }
            }
            this.f59408f.decrementAndGet();
            if (this.f59405c != Integer.MAX_VALUE) {
                this.f59412j.request(1L);
            }
            g();
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f59408f.decrementAndGet();
            if (this.f59409g.g(th2)) {
                if (!this.f59404b) {
                    this.f59407e.dispose();
                }
                g();
            }
        }

        void p(C2080a c2080a, Throwable th2) {
            this.f59407e.c(c2080a);
            if (this.f59409g.g(th2)) {
                if (!this.f59404b) {
                    this.f59412j.cancel();
                    this.f59407e.dispose();
                } else if (this.f59405c != Integer.MAX_VALUE) {
                    this.f59412j.request(1L);
                }
                this.f59408f.decrementAndGet();
                g();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void r(qg.C7507z.a.C2080a r5, java.lang.Object r6) {
            /*
                r4 = this;
                hg.b r0 = r4.f59407e
                r0.c(r5)
                int r5 = r4.get()
                if (r5 != 0) goto L6a
                r5 = 0
                r0 = 1
                boolean r1 = r4.compareAndSet(r5, r0)
                if (r1 == 0) goto L6a
                java.util.concurrent.atomic.AtomicInteger r1 = r4.f59408f
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L1c
                r5 = r0
            L1c:
                java.util.concurrent.atomic.AtomicLong r0 = r4.f59406d
                long r0 = r0.get()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L57
                Dj.b r0 = r4.f59403a
                r0.h(r6)
                java.util.concurrent.atomic.AtomicReference r6 = r4.f59411i
                java.lang.Object r6 = r6.get()
                Dg.i r6 = (Dg.i) r6
                boolean r5 = c(r5, r6)
                if (r5 == 0) goto L43
                zg.c r5 = r4.f59409g
                Dj.b r6 = r4.f59403a
                r5.j(r6)
                return
            L43:
                java.util.concurrent.atomic.AtomicLong r5 = r4.f59406d
                r0 = 1
                zg.AbstractC8751d.d(r5, r0)
                int r5 = r4.f59405c
                r6 = 2147483647(0x7fffffff, float:NaN)
                if (r5 == r6) goto L60
                Dj.c r5 = r4.f59412j
                r5.request(r0)
                goto L60
            L57:
                Dg.i r5 = r4.n()
                monitor-enter(r5)
                r5.offer(r6)     // Catch: java.lang.Throwable -> L67
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
            L60:
                int r5 = r4.decrementAndGet()
                if (r5 != 0) goto L7f
                return
            L67:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L67
                throw r6
            L6a:
                Dg.i r5 = r4.n()
                monitor-enter(r5)
                r5.offer(r6)     // Catch: java.lang.Throwable -> L83
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
                java.util.concurrent.atomic.AtomicInteger r5 = r4.f59408f
                r5.decrementAndGet()
                int r5 = r4.getAndIncrement()
                if (r5 == 0) goto L7f
                return
            L7f:
                r4.l()
                return
            L83:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.C7507z.a.r(qg.z$a$a, java.lang.Object):void");
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this.f59406d, j10);
                g();
            }
        }
    }

    public C7507z(gg.i iVar, kg.n nVar, boolean z10, int i10) {
        super(iVar);
        this.f59400c = nVar;
        this.f59401d = z10;
        this.f59402e = i10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f59400c, this.f59401d, this.f59402e));
    }
}
