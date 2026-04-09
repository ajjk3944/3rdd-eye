package sg;

import gg.B;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kg.n;
import lg.EnumC6592b;
import zg.AbstractC8751d;
import zg.EnumC8754g;

/* renamed from: sg.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7960f extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final gg.i f61537b;

    /* renamed from: c, reason: collision with root package name */
    final n f61538c;

    /* renamed from: d, reason: collision with root package name */
    final EnumC8754g f61539d;

    /* renamed from: e, reason: collision with root package name */
    final int f61540e;

    /* renamed from: sg.f$a */
    static final class a extends AbstractC7957c implements Dj.c {

        /* renamed from: i, reason: collision with root package name */
        final Dj.b f61541i;

        /* renamed from: j, reason: collision with root package name */
        final n f61542j;

        /* renamed from: k, reason: collision with root package name */
        final AtomicLong f61543k;

        /* renamed from: l, reason: collision with root package name */
        final C2158a f61544l;

        /* renamed from: m, reason: collision with root package name */
        long f61545m;

        /* renamed from: n, reason: collision with root package name */
        int f61546n;

        /* renamed from: o, reason: collision with root package name */
        Object f61547o;

        /* renamed from: p, reason: collision with root package name */
        volatile int f61548p;

        /* renamed from: sg.f$a$a, reason: collision with other inner class name */
        static final class C2158a extends AtomicReference implements B {

            /* renamed from: a, reason: collision with root package name */
            final a f61549a;

            C2158a(a aVar) {
                this.f61549a = aVar;
            }

            void a() {
                EnumC6592b.dispose(this);
            }

            @Override // gg.B
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.replace(this, interfaceC6043c);
            }

            @Override // gg.B
            public void onError(Throwable th2) {
                this.f61549a.t(th2);
            }

            @Override // gg.B
            public void onSuccess(Object obj) {
                this.f61549a.v(obj);
            }
        }

        a(Dj.b bVar, n nVar, int i10, EnumC8754g enumC8754g) {
            super(i10, enumC8754g);
            this.f61541i = bVar;
            this.f61542j = nVar;
            this.f61543k = new AtomicLong();
            this.f61544l = new C2158a(this);
        }

        @Override // sg.AbstractC7957c
        void c() {
            this.f61547o = null;
        }

        @Override // Dj.c
        public void cancel() {
            s();
        }

        @Override // sg.AbstractC7957c
        void d() {
            this.f61544l.a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            r3.clear();
            r17.f61547o = null;
            r4.j(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        
            return;
         */
        @Override // sg.AbstractC7957c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void g() {
            /*
                r17 = this;
                r1 = r17
                int r0 = r17.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                Dj.b r2 = r1.f61541i
                zg.g r0 = r1.f61508c
                Dg.g r3 = r1.f61509d
                zg.c r4 = r1.f61506a
                java.util.concurrent.atomic.AtomicLong r5 = r1.f61543k
                int r6 = r1.f61507b
                int r7 = r6 >> 1
                int r6 = r6 - r7
                boolean r7 = r1.f61513h
                r8 = 1
                r9 = r8
            L1c:
                boolean r10 = r1.f61512g
                r11 = 0
                if (r10 == 0) goto L28
                r3.clear()
                r1.f61547o = r11
                goto Lc4
            L28:
                int r10 = r1.f61548p
                java.lang.Object r12 = r4.get()
                if (r12 == 0) goto L43
                zg.g r12 = zg.EnumC8754g.IMMEDIATE
                if (r0 == r12) goto L3a
                zg.g r12 = zg.EnumC8754g.BOUNDARY
                if (r0 != r12) goto L43
                if (r10 != 0) goto L43
            L3a:
                r3.clear()
                r1.f61547o = r11
                r4.j(r2)
                return
            L43:
                r12 = 0
                if (r10 != 0) goto La7
                boolean r10 = r1.f61511f
                java.lang.Object r11 = r3.poll()     // Catch: java.lang.Throwable -> L96
                if (r11 != 0) goto L50
                r13 = r8
                goto L51
            L50:
                r13 = r12
            L51:
                if (r10 == 0) goto L59
                if (r13 == 0) goto L59
                r4.j(r2)
                return
            L59:
                if (r13 == 0) goto L5c
                goto Lc4
            L5c:
                if (r7 != 0) goto L6e
                int r10 = r1.f61546n
                int r10 = r10 + r8
                if (r10 != r6) goto L6c
                r1.f61546n = r12
                Dj.c r10 = r1.f61510e
                long r12 = (long) r6
                r10.request(r12)
                goto L6e
            L6c:
                r1.f61546n = r10
            L6e:
                kg.n r10 = r1.f61542j     // Catch: java.lang.Throwable -> L83
                java.lang.Object r10 = r10.apply(r11)     // Catch: java.lang.Throwable -> L83
                java.lang.String r11 = "The mapper returned a null SingleSource"
                java.util.Objects.requireNonNull(r10, r11)     // Catch: java.lang.Throwable -> L83
                gg.D r10 = (gg.D) r10     // Catch: java.lang.Throwable -> L83
                r1.f61548p = r8
                sg.f$a$a r11 = r1.f61544l
                r10.a(r11)
                goto Lc4
            L83:
                r0 = move-exception
                ig.AbstractC6152a.b(r0)
                Dj.c r5 = r1.f61510e
                r5.cancel()
                r3.clear()
                r4.g(r0)
                r4.j(r2)
                return
            L96:
                r0 = move-exception
                r3 = r0
                ig.AbstractC6152a.b(r3)
                Dj.c r0 = r1.f61510e
                r0.cancel()
                r4.g(r3)
                r4.j(r2)
                return
            La7:
                r13 = 2
                if (r10 != r13) goto Lc4
                long r13 = r1.f61545m
                long r15 = r5.get()
                int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r10 == 0) goto Lc4
                java.lang.Object r10 = r1.f61547o
                r1.f61547o = r11
                r2.h(r10)
                r10 = 1
                long r13 = r13 + r10
                r1.f61545m = r13
                r1.f61548p = r12
                goto L1c
            Lc4:
                int r9 = -r9
                int r9 = r1.addAndGet(r9)
                if (r9 != 0) goto L1c
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.C7960f.a.g():void");
        }

        @Override // sg.AbstractC7957c
        void o() {
            this.f61541i.j(this);
        }

        @Override // Dj.c
        public void request(long j10) {
            AbstractC8751d.a(this.f61543k, j10);
            g();
        }

        void t(Throwable th2) {
            if (this.f61506a.g(th2)) {
                if (this.f61508c != EnumC8754g.END) {
                    this.f61510e.cancel();
                }
                this.f61548p = 0;
                g();
            }
        }

        void v(Object obj) {
            this.f61547o = obj;
            this.f61548p = 2;
            g();
        }
    }

    public C7960f(gg.i iVar, n nVar, EnumC8754g enumC8754g, int i10) {
        this.f61537b = iVar;
        this.f61538c = nVar;
        this.f61539d = enumC8754g;
        this.f61540e = i10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f61537b.D1(new a(bVar, this.f61538c, this.f61540e, this.f61539d));
    }
}
