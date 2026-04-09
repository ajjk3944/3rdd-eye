package tg;

import gg.y;
import hg.InterfaceC6043c;
import lg.EnumC6592b;
import og.AbstractC7132b;

/* loaded from: classes4.dex */
public final class P extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final gg.y f62180b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f62181c;

    /* renamed from: d, reason: collision with root package name */
    final int f62182d;

    static final class a extends AbstractC7132b implements gg.x, Runnable {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62183a;

        /* renamed from: b, reason: collision with root package name */
        final y.c f62184b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f62185c;

        /* renamed from: d, reason: collision with root package name */
        final int f62186d;

        /* renamed from: e, reason: collision with root package name */
        Dg.g f62187e;

        /* renamed from: f, reason: collision with root package name */
        InterfaceC6043c f62188f;

        /* renamed from: g, reason: collision with root package name */
        Throwable f62189g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f62190h;

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f62191i;

        /* renamed from: j, reason: collision with root package name */
        int f62192j;

        /* renamed from: k, reason: collision with root package name */
        boolean f62193k;

        a(gg.x xVar, y.c cVar, boolean z10, int i10) {
            this.f62183a = xVar;
            this.f62184b = cVar;
            this.f62185c = z10;
            this.f62186d = i10;
        }

        @Override // gg.x
        public void a() {
            if (this.f62190h) {
                return;
            }
            this.f62190h = true;
            m();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62188f, interfaceC6043c)) {
                this.f62188f = interfaceC6043c;
                if (interfaceC6043c instanceof Dg.b) {
                    Dg.b bVar = (Dg.b) interfaceC6043c;
                    int iRequestFusion = bVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f62192j = iRequestFusion;
                        this.f62187e = bVar;
                        this.f62190h = true;
                        this.f62183a.c(this);
                        m();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f62192j = iRequestFusion;
                        this.f62187e = bVar;
                        this.f62183a.c(this);
                        return;
                    }
                }
                this.f62187e = new Dg.i(this.f62186d);
                this.f62183a.c(this);
            }
        }

        @Override // Dg.g
        public void clear() {
            this.f62187e.clear();
        }

        boolean d(boolean z10, boolean z11, gg.x xVar) {
            if (this.f62191i) {
                this.f62187e.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f62189g;
            if (this.f62185c) {
                if (!z11) {
                    return false;
                }
                this.f62191i = true;
                if (th2 != null) {
                    xVar.onError(th2);
                } else {
                    xVar.a();
                }
                this.f62184b.dispose();
                return true;
            }
            if (th2 != null) {
                this.f62191i = true;
                this.f62187e.clear();
                xVar.onError(th2);
                this.f62184b.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f62191i = true;
            xVar.a();
            this.f62184b.dispose();
            return true;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f62191i) {
                return;
            }
            this.f62191i = true;
            this.f62188f.dispose();
            this.f62184b.dispose();
            if (this.f62193k || getAndIncrement() != 0) {
                return;
            }
            this.f62187e.clear();
        }

        void g() {
            int iAddAndGet = 1;
            while (!this.f62191i) {
                boolean z10 = this.f62190h;
                Throwable th2 = this.f62189g;
                if (!this.f62185c && z10 && th2 != null) {
                    this.f62191i = true;
                    this.f62183a.onError(this.f62189g);
                    this.f62184b.dispose();
                    return;
                }
                this.f62183a.h(null);
                if (z10) {
                    this.f62191i = true;
                    Throwable th3 = this.f62189g;
                    if (th3 != null) {
                        this.f62183a.onError(th3);
                    } else {
                        this.f62183a.a();
                    }
                    this.f62184b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62190h) {
                return;
            }
            if (this.f62192j != 2) {
                this.f62187e.offer(obj);
            }
            m();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62191i;
        }

        @Override // Dg.g
        public boolean isEmpty() {
            return this.f62187e.isEmpty();
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        
            if (r3 != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void j() {
            /*
                r7 = this;
                Dg.g r0 = r7.f62187e
                gg.x r1 = r7.f62183a
                r2 = 1
                r3 = r2
            L6:
                boolean r4 = r7.f62190h
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.d(r4, r5, r1)
                if (r4 == 0) goto L13
                return
            L13:
                boolean r4 = r7.f62190h
                java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L1d
                r6 = r2
                goto L1e
            L1d:
                r6 = 0
            L1e:
                boolean r4 = r7.d(r4, r6, r1)
                if (r4 == 0) goto L25
                return
            L25:
                if (r6 == 0) goto L2f
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L6
                return
            L2f:
                r1.h(r5)
                goto L13
            L33:
                r3 = move-exception
                ig.AbstractC6152a.b(r3)
                r7.f62191i = r2
                hg.c r2 = r7.f62188f
                r2.dispose()
                r0.clear()
                r1.onError(r3)
                gg.y$c r0 = r7.f62184b
                r0.dispose()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tg.P.a.j():void");
        }

        void m() {
            if (getAndIncrement() == 0) {
                this.f62184b.b(this);
            }
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62190h) {
                Eg.a.v(th2);
                return;
            }
            this.f62189g = th2;
            this.f62190h = true;
            m();
        }

        @Override // Dg.g
        public Object poll() {
            return this.f62187e.poll();
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f62193k = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f62193k) {
                g();
            } else {
                j();
            }
        }
    }

    public P(gg.v vVar, gg.y yVar, boolean z10, int i10) {
        super(vVar);
        this.f62180b = yVar;
        this.f62181c = z10;
        this.f62182d = i10;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        gg.y yVar = this.f62180b;
        if (yVar instanceof wg.p) {
            this.f62287a.d(xVar);
        } else {
            this.f62287a.d(new a(xVar, yVar.c(), this.f62181c, this.f62182d));
        }
    }
}
