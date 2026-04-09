package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import zg.C8750c;

/* loaded from: classes4.dex */
public final class g0 extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62371b;

    /* renamed from: c, reason: collision with root package name */
    final int f62372c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f62373d;

    static final class a extends AtomicReference implements gg.x {

        /* renamed from: a, reason: collision with root package name */
        final b f62374a;

        /* renamed from: b, reason: collision with root package name */
        final long f62375b;

        /* renamed from: c, reason: collision with root package name */
        final int f62376c;

        /* renamed from: d, reason: collision with root package name */
        volatile Dg.g f62377d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f62378e;

        a(b bVar, long j10, int i10) {
            this.f62374a = bVar;
            this.f62375b = j10;
            this.f62376c = i10;
        }

        @Override // gg.x
        public void a() {
            if (this.f62375b == this.f62374a.f62389j) {
                this.f62378e = true;
                this.f62374a.g();
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                if (interfaceC6043c instanceof Dg.b) {
                    Dg.b bVar = (Dg.b) interfaceC6043c;
                    int iRequestFusion = bVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f62377d = bVar;
                        this.f62378e = true;
                        this.f62374a.g();
                        return;
                    } else if (iRequestFusion == 2) {
                        this.f62377d = bVar;
                        return;
                    }
                }
                this.f62377d = new Dg.i(this.f62376c);
            }
        }

        public void d() {
            EnumC6592b.dispose(this);
        }

        @Override // gg.x
        public void h(Object obj) {
            Dg.g gVar = this.f62377d;
            if (this.f62375b != this.f62374a.f62389j || gVar == null) {
                return;
            }
            if (obj != null) {
                gVar.offer(obj);
            }
            this.f62374a.g();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f62374a.j(this, th2);
        }
    }

    static final class b extends AtomicInteger implements gg.x, InterfaceC6043c {

        /* renamed from: k, reason: collision with root package name */
        static final a f62379k;

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62380a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f62381b;

        /* renamed from: c, reason: collision with root package name */
        final int f62382c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f62383d;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f62385f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f62386g;

        /* renamed from: h, reason: collision with root package name */
        InterfaceC6043c f62387h;

        /* renamed from: j, reason: collision with root package name */
        volatile long f62389j;

        /* renamed from: i, reason: collision with root package name */
        final AtomicReference f62388i = new AtomicReference();

        /* renamed from: e, reason: collision with root package name */
        final C8750c f62384e = new C8750c();

        static {
            a aVar = new a(null, -1L, 1);
            f62379k = aVar;
            aVar.d();
        }

        b(gg.x xVar, kg.n nVar, int i10, boolean z10) {
            this.f62380a = xVar;
            this.f62381b = nVar;
            this.f62382c = i10;
            this.f62383d = z10;
        }

        @Override // gg.x
        public void a() {
            if (this.f62385f) {
                return;
            }
            this.f62385f = true;
            g();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62387h, interfaceC6043c)) {
                this.f62387h = interfaceC6043c;
                this.f62380a.c(this);
            }
        }

        void d() {
            a aVar = (a) this.f62388i.getAndSet(f62379k);
            if (aVar != null) {
                aVar.d();
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f62386g) {
                return;
            }
            this.f62386g = true;
            this.f62387h.dispose();
            d();
            this.f62384e.h();
        }

        /* JADX WARN: Removed duplicated region for block: B:77:0x00b7 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x000f A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void g() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                gg.x r0 = r13.f62380a
                java.util.concurrent.atomic.AtomicReference r1 = r13.f62388i
                boolean r2 = r13.f62383d
                r3 = 1
                r4 = r3
            Lf:
                boolean r5 = r13.f62386g
                if (r5 == 0) goto L14
                return
            L14:
                boolean r5 = r13.f62385f
                r6 = 0
                if (r5 == 0) goto L4e
                java.lang.Object r5 = r1.get()
                if (r5 != 0) goto L21
                r5 = r3
                goto L22
            L21:
                r5 = r6
            L22:
                if (r2 == 0) goto L38
                if (r5 == 0) goto L4e
                zg.c r1 = r13.f62384e
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L34
                r0.onError(r1)
                goto L37
            L34:
                r0.a()
            L37:
                return
            L38:
                zg.c r7 = r13.f62384e
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L48
                zg.c r1 = r13.f62384e
                r1.n(r0)
                return
            L48:
                if (r5 == 0) goto L4e
                r0.a()
                return
            L4e:
                java.lang.Object r5 = r1.get()
                tg.g0$a r5 = (tg.g0.a) r5
                if (r5 == 0) goto Lb7
                Dg.g r7 = r5.f62377d
                if (r7 == 0) goto Lb7
                r8 = r6
            L5b:
                boolean r9 = r13.f62386g
                if (r9 == 0) goto L60
                return
            L60:
                java.lang.Object r9 = r1.get()
                if (r5 == r9) goto L68
            L66:
                r8 = r3
                goto Laf
            L68:
                if (r2 != 0) goto L7a
                zg.c r9 = r13.f62384e
                java.lang.Object r9 = r9.get()
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                if (r9 == 0) goto L7a
                zg.c r1 = r13.f62384e
                r1.n(r0)
                return
            L7a:
                boolean r9 = r5.f62378e
                r10 = 0
                java.lang.Object r11 = r7.poll()     // Catch: java.lang.Throwable -> L82
                goto La0
            L82:
                r8 = move-exception
                ig.AbstractC6152a.b(r8)
                zg.c r11 = r13.f62384e
                r11.g(r8)
                r.Y.a(r1, r5, r10)
                if (r2 != 0) goto L9b
                r13.d()
                hg.c r8 = r13.f62387h
                r8.dispose()
                r13.f62385f = r3
                goto L9e
            L9b:
                r5.d()
            L9e:
                r8 = r3
                r11 = r10
            La0:
                if (r11 != 0) goto La4
                r12 = r3
                goto La5
            La4:
                r12 = r6
            La5:
                if (r9 == 0) goto Lad
                if (r12 == 0) goto Lad
                r.Y.a(r1, r5, r10)
                goto L66
            Lad:
                if (r12 == 0) goto Lb3
            Laf:
                if (r8 == 0) goto Lb7
                goto Lf
            Lb3:
                r0.h(r11)
                goto L5b
            Lb7:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tg.g0.b.g():void");
        }

        @Override // gg.x
        public void h(Object obj) {
            a aVar;
            long j10 = this.f62389j + 1;
            this.f62389j = j10;
            a aVar2 = (a) this.f62388i.get();
            if (aVar2 != null) {
                aVar2.d();
            }
            try {
                Object objApply = this.f62381b.apply(obj);
                Objects.requireNonNull(objApply, "The ObservableSource returned is null");
                gg.v vVar = (gg.v) objApply;
                a aVar3 = new a(this, j10, this.f62382c);
                do {
                    aVar = (a) this.f62388i.get();
                    if (aVar == f62379k) {
                        return;
                    }
                } while (!r.Y.a(this.f62388i, aVar, aVar3));
                vVar.d(aVar3);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f62387h.dispose();
                onError(th2);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62386g;
        }

        void j(a aVar, Throwable th2) {
            if (aVar.f62375b != this.f62389j || !this.f62384e.d(th2)) {
                Eg.a.v(th2);
                return;
            }
            if (!this.f62383d) {
                this.f62387h.dispose();
                this.f62385f = true;
            }
            aVar.f62378e = true;
            g();
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62385f || !this.f62384e.d(th2)) {
                Eg.a.v(th2);
                return;
            }
            if (!this.f62383d) {
                d();
            }
            this.f62385f = true;
            g();
        }
    }

    public g0(gg.v vVar, kg.n nVar, int i10, boolean z10) {
        super(vVar);
        this.f62371b = nVar;
        this.f62372c = i10;
        this.f62373d = z10;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        if (a0.b(this.f62287a, xVar, this.f62371b)) {
            return;
        }
        this.f62287a.d(new b(xVar, this.f62371b, this.f62372c, this.f62373d));
    }
}
