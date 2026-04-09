package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import zg.C8750c;

/* renamed from: tg.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8110v extends AbstractC8090a {

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62569b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f62570c;

    /* renamed from: d, reason: collision with root package name */
    final int f62571d;

    /* renamed from: e, reason: collision with root package name */
    final int f62572e;

    /* renamed from: tg.v$a */
    static final class a extends AtomicReference implements gg.x {

        /* renamed from: a, reason: collision with root package name */
        final long f62573a;

        /* renamed from: b, reason: collision with root package name */
        final b f62574b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f62575c;

        /* renamed from: d, reason: collision with root package name */
        volatile Dg.g f62576d;

        /* renamed from: e, reason: collision with root package name */
        int f62577e;

        a(b bVar, long j10) {
            this.f62573a = j10;
            this.f62574b = bVar;
        }

        @Override // gg.x
        public void a() {
            this.f62575c = true;
            this.f62574b.m();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c) && (interfaceC6043c instanceof Dg.b)) {
                Dg.b bVar = (Dg.b) interfaceC6043c;
                int iRequestFusion = bVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f62577e = iRequestFusion;
                    this.f62576d = bVar;
                    this.f62575c = true;
                    this.f62574b.m();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f62577e = iRequestFusion;
                    this.f62576d = bVar;
                }
            }
        }

        public void d() {
            EnumC6592b.dispose(this);
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62577e == 0) {
                this.f62574b.y(obj, this);
            } else {
                this.f62574b.m();
            }
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62574b.f62587h.g(th2)) {
                b bVar = this.f62574b;
                if (!bVar.f62582c) {
                    bVar.j();
                }
                this.f62575c = true;
                this.f62574b.m();
            }
        }
    }

    /* renamed from: tg.v$b */
    static final class b extends AtomicInteger implements InterfaceC6043c, gg.x {

        /* renamed from: p, reason: collision with root package name */
        static final a[] f62578p = new a[0];

        /* renamed from: q, reason: collision with root package name */
        static final a[] f62579q = new a[0];

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62580a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f62581b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f62582c;

        /* renamed from: d, reason: collision with root package name */
        final int f62583d;

        /* renamed from: e, reason: collision with root package name */
        final int f62584e;

        /* renamed from: f, reason: collision with root package name */
        volatile Dg.f f62585f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f62586g;

        /* renamed from: h, reason: collision with root package name */
        final C8750c f62587h = new C8750c();

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f62588i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicReference f62589j;

        /* renamed from: k, reason: collision with root package name */
        InterfaceC6043c f62590k;

        /* renamed from: l, reason: collision with root package name */
        long f62591l;

        /* renamed from: m, reason: collision with root package name */
        int f62592m;

        /* renamed from: n, reason: collision with root package name */
        Queue f62593n;

        /* renamed from: o, reason: collision with root package name */
        int f62594o;

        b(gg.x xVar, kg.n nVar, boolean z10, int i10, int i11) {
            this.f62580a = xVar;
            this.f62581b = nVar;
            this.f62582c = z10;
            this.f62583d = i10;
            this.f62584e = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.f62593n = new ArrayDeque(i10);
            }
            this.f62589j = new AtomicReference(f62578p);
        }

        boolean B(kg.q qVar) {
            try {
                Object obj = qVar.get();
                if (obj == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f62580a.h(obj);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    Dg.f iVar = this.f62585f;
                    if (iVar == null) {
                        iVar = this.f62583d == Integer.MAX_VALUE ? new Dg.i(this.f62584e) : new Dg.h(this.f62583d);
                        this.f62585f = iVar;
                    }
                    iVar.offer(obj);
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                o();
                return true;
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f62587h.g(th2);
                m();
                return true;
            }
        }

        @Override // gg.x
        public void a() {
            if (this.f62586g) {
                return;
            }
            this.f62586g = true;
            m();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.validate(this.f62590k, interfaceC6043c)) {
                this.f62590k = interfaceC6043c;
                this.f62580a.c(this);
            }
        }

        boolean d(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f62589j.get();
                if (aVarArr == f62579q) {
                    aVar.d();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!r.Y.a(this.f62589j, aVarArr, aVarArr2));
            return true;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62588i = true;
            if (j()) {
                this.f62587h.h();
            }
        }

        boolean g() {
            if (this.f62588i) {
                return true;
            }
            Throwable th2 = (Throwable) this.f62587h.get();
            if (this.f62582c || th2 == null) {
                return false;
            }
            j();
            this.f62587h.n(this.f62580a);
            return true;
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62586g) {
                return;
            }
            try {
                Object objApply = this.f62581b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                gg.v vVar = (gg.v) objApply;
                if (this.f62583d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i10 = this.f62594o;
                            if (i10 == this.f62583d) {
                                this.f62593n.offer(vVar);
                                return;
                            }
                            this.f62594o = i10 + 1;
                        } finally {
                        }
                    }
                }
                t(vVar);
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                this.f62590k.dispose();
                onError(th2);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62588i;
        }

        boolean j() {
            this.f62590k.dispose();
            AtomicReference atomicReference = this.f62589j;
            a[] aVarArr = f62579q;
            a[] aVarArr2 = (a[]) atomicReference.getAndSet(aVarArr);
            if (aVarArr2 == aVarArr) {
                return false;
            }
            for (a aVar : aVarArr2) {
                aVar.d();
            }
            return true;
        }

        void m() {
            if (getAndIncrement() == 0) {
                o();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x00c5 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00c4 A[PHI: r4
  0x00c4: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:57:0x00aa, B:66:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void o() {
            /*
                Method dump skipped, instructions count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tg.C8110v.b.o():void");
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62586g) {
                Eg.a.v(th2);
            } else if (this.f62587h.g(th2)) {
                this.f62586g = true;
                m();
            }
        }

        void s(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f62589j.get();
                int length = aVarArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr[i10] == aVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = f62578p;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!r.Y.a(this.f62589j, aVarArr, aVarArr2));
        }

        void t(gg.v vVar) {
            boolean z10;
            while (vVar instanceof kg.q) {
                if (!B((kg.q) vVar) || this.f62583d == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    try {
                        vVar = (gg.v) this.f62593n.poll();
                        if (vVar == null) {
                            z10 = true;
                            this.f62594o--;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    m();
                    return;
                }
            }
            long j10 = this.f62591l;
            this.f62591l = 1 + j10;
            a aVar = new a(this, j10);
            if (d(aVar)) {
                vVar.d(aVar);
            }
        }

        void v(int i10) {
            while (true) {
                int i11 = i10 - 1;
                if (i10 == 0) {
                    return;
                }
                synchronized (this) {
                    try {
                        gg.v vVar = (gg.v) this.f62593n.poll();
                        if (vVar == null) {
                            this.f62594o--;
                        } else {
                            t(vVar);
                        }
                    } finally {
                    }
                }
                i10 = i11;
            }
        }

        void y(Object obj, a aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f62580a.h(obj);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                Dg.g iVar = aVar.f62576d;
                if (iVar == null) {
                    iVar = new Dg.i(this.f62584e);
                    aVar.f62576d = iVar;
                }
                iVar.offer(obj);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            o();
        }
    }

    public C8110v(gg.v vVar, kg.n nVar, boolean z10, int i10, int i11) {
        super(vVar);
        this.f62569b = nVar;
        this.f62570c = z10;
        this.f62571d = i10;
        this.f62572e = i11;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        if (a0.b(this.f62287a, xVar, this.f62569b)) {
            return;
        }
        this.f62287a.d(new b(xVar, this.f62569b, this.f62570c, this.f62571d, this.f62572e));
    }
}
