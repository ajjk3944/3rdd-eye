package sg;

import gg.p;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kg.n;
import lg.EnumC6592b;
import zg.AbstractC8751d;
import zg.EnumC8754g;

/* renamed from: sg.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7959e extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final gg.i f61524b;

    /* renamed from: c, reason: collision with root package name */
    final n f61525c;

    /* renamed from: d, reason: collision with root package name */
    final EnumC8754g f61526d;

    /* renamed from: e, reason: collision with root package name */
    final int f61527e;

    /* renamed from: sg.e$a */
    static final class a extends AbstractC7957c implements Dj.c {

        /* renamed from: i, reason: collision with root package name */
        final Dj.b f61528i;

        /* renamed from: j, reason: collision with root package name */
        final n f61529j;

        /* renamed from: k, reason: collision with root package name */
        final AtomicLong f61530k;

        /* renamed from: l, reason: collision with root package name */
        final C2157a f61531l;

        /* renamed from: m, reason: collision with root package name */
        long f61532m;

        /* renamed from: n, reason: collision with root package name */
        int f61533n;

        /* renamed from: o, reason: collision with root package name */
        Object f61534o;

        /* renamed from: p, reason: collision with root package name */
        volatile int f61535p;

        /* renamed from: sg.e$a$a, reason: collision with other inner class name */
        static final class C2157a extends AtomicReference implements p {

            /* renamed from: a, reason: collision with root package name */
            final a f61536a;

            C2157a(a aVar) {
                this.f61536a = aVar;
            }

            @Override // gg.p
            public void a() {
                this.f61536a.t();
            }

            @Override // gg.p
            public void c(InterfaceC6043c interfaceC6043c) {
                EnumC6592b.replace(this, interfaceC6043c);
            }

            void d() {
                EnumC6592b.dispose(this);
            }

            @Override // gg.p
            public void onError(Throwable th2) {
                this.f61536a.v(th2);
            }

            @Override // gg.p
            public void onSuccess(Object obj) {
                this.f61536a.y(obj);
            }
        }

        a(Dj.b bVar, n nVar, int i10, EnumC8754g enumC8754g) {
            super(i10, enumC8754g);
            this.f61528i = bVar;
            this.f61529j = nVar;
            this.f61530k = new AtomicLong();
            this.f61531l = new C2157a(this);
        }

        @Override // sg.AbstractC7957c
        void c() {
            this.f61534o = null;
        }

        @Override // Dj.c
        public void cancel() {
            s();
        }

        @Override // sg.AbstractC7957c
        void d() {
            this.f61531l.d();
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            r3.clear();
            r17.f61534o = null;
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
                Dj.b r2 = r1.f61528i
                zg.g r0 = r1.f61508c
                Dg.g r3 = r1.f61509d
                zg.c r4 = r1.f61506a
                java.util.concurrent.atomic.AtomicLong r5 = r1.f61530k
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
                r1.f61534o = r11
                goto Lc4
            L28:
                int r10 = r1.f61535p
                java.lang.Object r12 = r4.get()
                if (r12 == 0) goto L43
                zg.g r12 = zg.EnumC8754g.IMMEDIATE
                if (r0 == r12) goto L3a
                zg.g r12 = zg.EnumC8754g.BOUNDARY
                if (r0 != r12) goto L43
                if (r10 != 0) goto L43
            L3a:
                r3.clear()
                r1.f61534o = r11
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
                int r10 = r1.f61533n
                int r10 = r10 + r8
                if (r10 != r6) goto L6c
                r1.f61533n = r12
                Dj.c r10 = r1.f61510e
                long r12 = (long) r6
                r10.request(r12)
                goto L6e
            L6c:
                r1.f61533n = r10
            L6e:
                kg.n r10 = r1.f61529j     // Catch: java.lang.Throwable -> L83
                java.lang.Object r10 = r10.apply(r11)     // Catch: java.lang.Throwable -> L83
                java.lang.String r11 = "The mapper returned a null MaybeSource"
                java.util.Objects.requireNonNull(r10, r11)     // Catch: java.lang.Throwable -> L83
                gg.r r10 = (gg.r) r10     // Catch: java.lang.Throwable -> L83
                r1.f61535p = r8
                sg.e$a$a r11 = r1.f61531l
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
                long r13 = r1.f61532m
                long r15 = r5.get()
                int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r10 == 0) goto Lc4
                java.lang.Object r10 = r1.f61534o
                r1.f61534o = r11
                r2.h(r10)
                r10 = 1
                long r13 = r13 + r10
                r1.f61532m = r13
                r1.f61535p = r12
                goto L1c
            Lc4:
                int r9 = -r9
                int r9 = r1.addAndGet(r9)
                if (r9 != 0) goto L1c
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.C7959e.a.g():void");
        }

        @Override // sg.AbstractC7957c
        void o() {
            this.f61528i.j(this);
        }

        @Override // Dj.c
        public void request(long j10) {
            AbstractC8751d.a(this.f61530k, j10);
            g();
        }

        void t() {
            this.f61535p = 0;
            g();
        }

        void v(Throwable th2) {
            if (this.f61506a.g(th2)) {
                if (this.f61508c != EnumC8754g.END) {
                    this.f61510e.cancel();
                }
                this.f61535p = 0;
                g();
            }
        }

        void y(Object obj) {
            this.f61534o = obj;
            this.f61535p = 2;
            g();
        }
    }

    public C7959e(gg.i iVar, n nVar, EnumC8754g enumC8754g, int i10) {
        this.f61524b = iVar;
        this.f61525c = nVar;
        this.f61526d = enumC8754g;
        this.f61527e = i10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f61524b.D1(new a(bVar, this.f61525c, this.f61527e, this.f61526d));
    }
}
