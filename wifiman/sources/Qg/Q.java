package qg;

import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import yg.EnumC8672g;
import zg.AbstractC8751d;
import zg.C8750c;

/* loaded from: classes4.dex */
public final class Q extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final gg.r f58762c;

    static final class a extends AtomicInteger implements gg.l, Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58763a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference f58764b = new AtomicReference();

        /* renamed from: c, reason: collision with root package name */
        final C2070a f58765c = new C2070a(this);

        /* renamed from: d, reason: collision with root package name */
        final C8750c f58766d = new C8750c();

        /* renamed from: e, reason: collision with root package name */
        final AtomicLong f58767e = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        final int f58768f;

        /* renamed from: g, reason: collision with root package name */
        final int f58769g;

        /* renamed from: h, reason: collision with root package name */
        volatile Dg.f f58770h;

        /* renamed from: i, reason: collision with root package name */
        Object f58771i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f58772j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f58773k;

        /* renamed from: l, reason: collision with root package name */
        volatile int f58774l;

        /* renamed from: m, reason: collision with root package name */
        long f58775m;

        /* renamed from: n, reason: collision with root package name */
        int f58776n;

        /* renamed from: qg.Q$a$a, reason: collision with other inner class name */
        static final class C2070a extends AtomicReference implements gg.p {

            /* renamed from: a, reason: collision with root package name */
            final a f58777a;

            C2070a(a aVar) {
                this.f58777a = aVar;
            }

            @Override // gg.p
            public void a() {
                this.f58777a.l();
            }

            @Override // gg.p
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.setOnce(this, interfaceC6043c);
            }

            @Override // gg.p
            public void onError(Throwable th2) {
                this.f58777a.n(th2);
            }

            @Override // gg.p
            public void onSuccess(Object obj) {
                this.f58777a.o(obj);
            }
        }

        a(Dj.b bVar) {
            this.f58763a = bVar;
            int i10 = gg.i.i();
            this.f58768f = i10;
            this.f58769g = i10 - (i10 >> 2);
        }

        @Override // Dj.b
        public void a() {
            this.f58773k = true;
            c();
        }

        void c() {
            if (getAndIncrement() == 0) {
                d();
            }
        }

        @Override // Dj.c
        public void cancel() {
            this.f58772j = true;
            EnumC8672g.cancel(this.f58764b);
            EnumC6592b.dispose(this.f58765c);
            this.f58766d.h();
            if (getAndIncrement() == 0) {
                this.f58770h = null;
                this.f58771i = null;
            }
        }

        void d() {
            Dj.b bVar = this.f58763a;
            long j10 = this.f58775m;
            int i10 = this.f58776n;
            int i11 = this.f58769g;
            int i12 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.f58767e.get();
                while (j10 != j11) {
                    if (this.f58772j) {
                        this.f58771i = null;
                        this.f58770h = null;
                        return;
                    }
                    if (this.f58766d.get() != null) {
                        this.f58771i = null;
                        this.f58770h = null;
                        this.f58766d.j(this.f58763a);
                        return;
                    }
                    int i13 = this.f58774l;
                    if (i13 == i12) {
                        Object obj = this.f58771i;
                        this.f58771i = null;
                        this.f58774l = 2;
                        bVar.h(obj);
                        j10++;
                    } else {
                        boolean z10 = this.f58773k;
                        Dg.f fVar = this.f58770h;
                        Object objPoll = fVar != null ? fVar.poll() : null;
                        boolean z11 = objPoll == null;
                        if (z10 && z11 && i13 == 2) {
                            this.f58770h = null;
                            bVar.a();
                            return;
                        } else {
                            if (z11) {
                                break;
                            }
                            bVar.h(objPoll);
                            j10++;
                            i10++;
                            if (i10 == i11) {
                                ((Dj.c) this.f58764b.get()).request(i11);
                                i10 = 0;
                            }
                            i12 = 1;
                        }
                    }
                }
                if (j10 == j11) {
                    if (this.f58772j) {
                        this.f58771i = null;
                        this.f58770h = null;
                        return;
                    }
                    if (this.f58766d.get() != null) {
                        this.f58771i = null;
                        this.f58770h = null;
                        this.f58766d.j(this.f58763a);
                        return;
                    }
                    boolean z12 = this.f58773k;
                    Dg.f fVar2 = this.f58770h;
                    boolean z13 = fVar2 == null || fVar2.isEmpty();
                    if (z12 && z13 && this.f58774l == 2) {
                        this.f58770h = null;
                        bVar.a();
                        return;
                    }
                }
                this.f58775m = j10;
                this.f58776n = i10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i12 = 1;
                }
            }
        }

        Dg.f g() {
            Dg.f fVar = this.f58770h;
            if (fVar != null) {
                return fVar;
            }
            Dg.h hVar = new Dg.h(gg.i.i());
            this.f58770h = hVar;
            return hVar;
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (compareAndSet(0, 1)) {
                long j10 = this.f58775m;
                if (this.f58767e.get() != j10) {
                    Dg.f fVar = this.f58770h;
                    if (fVar == null || fVar.isEmpty()) {
                        this.f58775m = j10 + 1;
                        this.f58763a.h(obj);
                        int i10 = this.f58776n + 1;
                        if (i10 == this.f58769g) {
                            this.f58776n = 0;
                            ((Dj.c) this.f58764b.get()).request(i10);
                        } else {
                            this.f58776n = i10;
                        }
                    } else {
                        fVar.offer(obj);
                    }
                } else {
                    g().offer(obj);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                g().offer(obj);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            d();
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            EnumC8672g.setOnce(this.f58764b, cVar, this.f58768f);
        }

        void l() {
            this.f58774l = 2;
            c();
        }

        void n(Throwable th2) {
            if (this.f58766d.g(th2)) {
                EnumC8672g.cancel(this.f58764b);
                c();
            }
        }

        void o(Object obj) {
            if (compareAndSet(0, 1)) {
                long j10 = this.f58775m;
                if (this.f58767e.get() != j10) {
                    this.f58775m = j10 + 1;
                    this.f58763a.h(obj);
                    this.f58774l = 2;
                } else {
                    this.f58771i = obj;
                    this.f58774l = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.f58771i = obj;
                this.f58774l = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            d();
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f58766d.g(th2)) {
                EnumC6592b.dispose(this.f58765c);
                c();
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            AbstractC8751d.a(this.f58767e, j10);
            c();
        }
    }

    public Q(gg.i iVar, gg.r rVar) {
        super(iVar);
        this.f58762c = rVar;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        a aVar = new a(bVar);
        bVar.j(aVar);
        this.f58857b.D1(aVar);
        this.f58762c.a(aVar.f58765c);
    }
}
