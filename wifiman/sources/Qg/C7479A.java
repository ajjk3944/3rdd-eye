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

/* renamed from: qg.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7479A extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.n f58671c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f58672d;

    /* renamed from: e, reason: collision with root package name */
    final int f58673e;

    /* renamed from: qg.A$a */
    static final class a extends AtomicInteger implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58674a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f58675b;

        /* renamed from: c, reason: collision with root package name */
        final int f58676c;

        /* renamed from: h, reason: collision with root package name */
        final kg.n f58681h;

        /* renamed from: j, reason: collision with root package name */
        Dj.c f58683j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f58684k;

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f58677d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        final C6042b f58678e = new C6042b();

        /* renamed from: g, reason: collision with root package name */
        final C8750c f58680g = new C8750c();

        /* renamed from: f, reason: collision with root package name */
        final AtomicInteger f58679f = new AtomicInteger(1);

        /* renamed from: i, reason: collision with root package name */
        final AtomicReference f58682i = new AtomicReference();

        /* renamed from: qg.A$a$a, reason: collision with other inner class name */
        final class C2067a extends AtomicReference implements gg.B, InterfaceC6043c {
            C2067a() {
            }

            @Override // gg.B
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

            @Override // gg.B
            public void onError(Throwable th2) {
                a.this.n(this, th2);
            }

            @Override // gg.B
            public void onSuccess(Object obj) {
                a.this.o(this, obj);
            }
        }

        a(Dj.b bVar, kg.n nVar, boolean z10, int i10) {
            this.f58674a = bVar;
            this.f58681h = nVar;
            this.f58675b = z10;
            this.f58676c = i10;
        }

        @Override // Dj.b
        public void a() {
            this.f58679f.decrementAndGet();
            d();
        }

        void c() {
            Dg.i iVar = (Dg.i) this.f58682i.get();
            if (iVar != null) {
                iVar.clear();
            }
        }

        @Override // Dj.c
        public void cancel() {
            this.f58684k = true;
            this.f58683j.cancel();
            this.f58678e.dispose();
            this.f58680g.h();
        }

        void d() {
            if (getAndIncrement() == 0) {
                g();
            }
        }

        void g() {
            Dj.b bVar = this.f58674a;
            AtomicInteger atomicInteger = this.f58679f;
            AtomicReference atomicReference = this.f58682i;
            int iAddAndGet = 1;
            do {
                long j10 = this.f58677d.get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        break;
                    }
                    if (this.f58684k) {
                        c();
                        return;
                    }
                    if (!this.f58675b && ((Throwable) this.f58680g.get()) != null) {
                        c();
                        this.f58680g.j(this.f58674a);
                        return;
                    }
                    boolean z10 = atomicInteger.get() == 0;
                    Dg.i iVar = (Dg.i) atomicReference.get();
                    Object objPoll = iVar != null ? iVar.poll() : null;
                    boolean z11 = objPoll == null;
                    if (z10 && z11) {
                        this.f58680g.j(bVar);
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
                    if (this.f58684k) {
                        c();
                        return;
                    }
                    if (!this.f58675b && ((Throwable) this.f58680g.get()) != null) {
                        c();
                        this.f58680g.j(bVar);
                        return;
                    }
                    boolean z12 = atomicInteger.get() == 0;
                    Dg.i iVar2 = (Dg.i) atomicReference.get();
                    boolean z13 = iVar2 == null || iVar2.isEmpty();
                    if (z12 && z13) {
                        this.f58680g.j(bVar);
                        return;
                    }
                }
                if (j11 != 0) {
                    AbstractC8751d.d(this.f58677d, j11);
                    if (this.f58676c != Integer.MAX_VALUE) {
                        this.f58683j.request(j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // Dj.b
        public void h(Object obj) {
            try {
                Object objApply = this.f58681h.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
                gg.D d10 = (gg.D) objApply;
                this.f58679f.getAndIncrement();
                C2067a c2067a = new C2067a();
                if (this.f58684k || !this.f58678e.a(c2067a)) {
                    return;
                }
                d10.a(c2067a);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f58683j.cancel();
                onError(th2);
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58683j, cVar)) {
                this.f58683j = cVar;
                this.f58674a.j(this);
                int i10 = this.f58676c;
                if (i10 == Integer.MAX_VALUE) {
                    cVar.request(Long.MAX_VALUE);
                } else {
                    cVar.request(i10);
                }
            }
        }

        Dg.i l() {
            Dg.i iVar = (Dg.i) this.f58682i.get();
            if (iVar != null) {
                return iVar;
            }
            Dg.i iVar2 = new Dg.i(gg.i.i());
            return r.Y.a(this.f58682i, null, iVar2) ? iVar2 : (Dg.i) this.f58682i.get();
        }

        void n(C2067a c2067a, Throwable th2) {
            this.f58678e.c(c2067a);
            if (this.f58680g.g(th2)) {
                if (!this.f58675b) {
                    this.f58683j.cancel();
                    this.f58678e.dispose();
                } else if (this.f58676c != Integer.MAX_VALUE) {
                    this.f58683j.request(1L);
                }
                this.f58679f.decrementAndGet();
                d();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void o(qg.C7479A.a.C2067a r5, java.lang.Object r6) {
            /*
                r4 = this;
                hg.b r0 = r4.f58678e
                r0.c(r5)
                int r5 = r4.get()
                if (r5 != 0) goto L6e
                r5 = 0
                r0 = 1
                boolean r1 = r4.compareAndSet(r5, r0)
                if (r1 == 0) goto L6e
                java.util.concurrent.atomic.AtomicInteger r1 = r4.f58679f
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L1c
                r5 = r0
            L1c:
                java.util.concurrent.atomic.AtomicLong r0 = r4.f58677d
                long r0 = r0.get()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L5b
                Dj.b r0 = r4.f58674a
                r0.h(r6)
                java.util.concurrent.atomic.AtomicReference r6 = r4.f58682i
                java.lang.Object r6 = r6.get()
                Dg.i r6 = (Dg.i) r6
                if (r5 == 0) goto L47
                if (r6 == 0) goto L3f
                boolean r5 = r6.isEmpty()
                if (r5 == 0) goto L47
            L3f:
                zg.c r5 = r4.f58680g
                Dj.b r6 = r4.f58674a
                r5.j(r6)
                return
            L47:
                java.util.concurrent.atomic.AtomicLong r5 = r4.f58677d
                r0 = 1
                zg.AbstractC8751d.d(r5, r0)
                int r5 = r4.f58676c
                r6 = 2147483647(0x7fffffff, float:NaN)
                if (r5 == r6) goto L64
                Dj.c r5 = r4.f58683j
                r5.request(r0)
                goto L64
            L5b:
                Dg.i r5 = r4.l()
                monitor-enter(r5)
                r5.offer(r6)     // Catch: java.lang.Throwable -> L6b
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6b
            L64:
                int r5 = r4.decrementAndGet()
                if (r5 != 0) goto L83
                return
            L6b:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L6b
                throw r6
            L6e:
                Dg.i r5 = r4.l()
                monitor-enter(r5)
                r5.offer(r6)     // Catch: java.lang.Throwable -> L87
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
                java.util.concurrent.atomic.AtomicInteger r5 = r4.f58679f
                r5.decrementAndGet()
                int r5 = r4.getAndIncrement()
                if (r5 == 0) goto L83
                return
            L83:
                r4.g()
                return
            L87:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L87
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: qg.C7479A.a.o(qg.A$a$a, java.lang.Object):void");
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f58679f.decrementAndGet();
            if (this.f58680g.g(th2)) {
                if (!this.f58675b) {
                    this.f58678e.dispose();
                }
                d();
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this.f58677d, j10);
                d();
            }
        }
    }

    public C7479A(gg.i iVar, kg.n nVar, boolean z10, int i10) {
        super(iVar);
        this.f58671c = nVar;
        this.f58672d = z10;
        this.f58673e = i10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f58857b.D1(new a(bVar, this.f58671c, this.f58672d, this.f58673e));
    }
}
