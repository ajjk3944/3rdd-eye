package qg;

import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.O;
import yg.AbstractC8666a;
import yg.EnumC8669d;
import yg.EnumC8672g;
import zg.AbstractC8751d;
import zg.AbstractC8755h;
import zg.C8750c;

/* renamed from: qg.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7487e extends gg.i {

    /* renamed from: b, reason: collision with root package name */
    final Dj.a[] f58939b;

    /* renamed from: c, reason: collision with root package name */
    final Iterable f58940c = null;

    /* renamed from: d, reason: collision with root package name */
    final kg.n f58941d;

    /* renamed from: e, reason: collision with root package name */
    final int f58942e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f58943f;

    /* renamed from: qg.e$a */
    static final class a extends AbstractC8666a {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58944a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f58945b;

        /* renamed from: c, reason: collision with root package name */
        final b[] f58946c;

        /* renamed from: d, reason: collision with root package name */
        final Dg.i f58947d;

        /* renamed from: e, reason: collision with root package name */
        final Object[] f58948e;

        /* renamed from: f, reason: collision with root package name */
        final boolean f58949f;

        /* renamed from: g, reason: collision with root package name */
        boolean f58950g;

        /* renamed from: h, reason: collision with root package name */
        int f58951h;

        /* renamed from: i, reason: collision with root package name */
        int f58952i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f58953j;

        /* renamed from: k, reason: collision with root package name */
        final AtomicLong f58954k;

        /* renamed from: l, reason: collision with root package name */
        volatile boolean f58955l;

        /* renamed from: m, reason: collision with root package name */
        final C8750c f58956m;

        a(Dj.b bVar, kg.n nVar, int i10, int i11, boolean z10) {
            this.f58944a = bVar;
            this.f58945b = nVar;
            b[] bVarArr = new b[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                bVarArr[i12] = new b(this, i12, i11);
            }
            this.f58946c = bVarArr;
            this.f58948e = new Object[i10];
            this.f58947d = new Dg.i(i11);
            this.f58954k = new AtomicLong();
            this.f58956m = new C8750c();
            this.f58949f = z10;
        }

        @Override // Dj.c
        public void cancel() {
            this.f58953j = true;
            d();
            l();
        }

        @Override // Dg.g
        public void clear() {
            this.f58947d.clear();
        }

        void d() {
            for (b bVar : this.f58946c) {
                bVar.c();
            }
        }

        boolean g(boolean z10, boolean z11, Dj.b bVar, Dg.i iVar) {
            if (this.f58953j) {
                d();
                iVar.clear();
                this.f58956m.h();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.f58949f) {
                if (!z11) {
                    return false;
                }
                d();
                this.f58956m.j(bVar);
                return true;
            }
            Throwable thE = AbstractC8755h.e(this.f58956m);
            if (thE != null && thE != AbstractC8755h.f67282a) {
                d();
                iVar.clear();
                bVar.onError(thE);
                return true;
            }
            if (!z11) {
                return false;
            }
            d();
            bVar.a();
            return true;
        }

        @Override // Dg.g
        public boolean isEmpty() {
            return this.f58947d.isEmpty();
        }

        void l() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.f58950g) {
                o();
            } else {
                n();
            }
        }

        void n() {
            Dj.b bVar = this.f58944a;
            Dg.i iVar = this.f58947d;
            int iAddAndGet = 1;
            do {
                long j10 = this.f58954k.get();
                long j11 = 0;
                while (j11 != j10) {
                    boolean z10 = this.f58955l;
                    Object objPoll = iVar.poll();
                    boolean z11 = objPoll == null;
                    if (g(z10, z11, bVar, iVar)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    try {
                        Object objApply = this.f58945b.apply((Object[]) iVar.poll());
                        Objects.requireNonNull(objApply, "The combiner returned a null value");
                        bVar.h(objApply);
                        ((b) objPoll).d();
                        j11++;
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        d();
                        AbstractC8755h.a(this.f58956m, th2);
                        bVar.onError(AbstractC8755h.e(this.f58956m));
                        return;
                    }
                }
                if (j11 == j10 && g(this.f58955l, iVar.isEmpty(), bVar, iVar)) {
                    return;
                }
                if (j11 != 0 && j10 != Long.MAX_VALUE) {
                    this.f58954k.addAndGet(-j11);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        void o() {
            Dj.b bVar = this.f58944a;
            Dg.i iVar = this.f58947d;
            int iAddAndGet = 1;
            while (!this.f58953j) {
                Throwable th2 = (Throwable) this.f58956m.get();
                if (th2 != null) {
                    iVar.clear();
                    bVar.onError(th2);
                    return;
                }
                boolean z10 = this.f58955l;
                boolean zIsEmpty = iVar.isEmpty();
                if (!zIsEmpty) {
                    bVar.h(null);
                }
                if (z10 && zIsEmpty) {
                    bVar.a();
                    return;
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            iVar.clear();
        }

        void p(int i10) {
            int i11;
            synchronized (this) {
                try {
                    Object[] objArr = this.f58948e;
                    if (objArr[i10] != null && (i11 = this.f58952i + 1) != objArr.length) {
                        this.f58952i = i11;
                    } else {
                        this.f58955l = true;
                        l();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // Dg.g
        public Object poll() {
            Object objPoll = this.f58947d.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f58945b.apply((Object[]) this.f58947d.poll());
            Objects.requireNonNull(objApply, "The combiner returned a null value");
            ((b) objPoll).d();
            return objApply;
        }

        void r(int i10, Throwable th2) {
            if (!AbstractC8755h.a(this.f58956m, th2)) {
                Eg.a.v(th2);
            } else {
                if (this.f58949f) {
                    p(i10);
                    return;
                }
                d();
                this.f58955l = true;
                l();
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this.f58954k, j10);
                l();
            }
        }

        @Override // Dg.c
        public int requestFusion(int i10) {
            if ((i10 & 4) != 0) {
                return 0;
            }
            int i11 = i10 & 2;
            this.f58950g = i11 != 0;
            return i11;
        }

        void s(int i10, Object obj) {
            boolean z10;
            synchronized (this) {
                try {
                    Object[] objArr = this.f58948e;
                    int i11 = this.f58951h;
                    if (objArr[i10] == null) {
                        i11++;
                        this.f58951h = i11;
                    }
                    objArr[i10] = obj;
                    if (objArr.length == i11) {
                        this.f58947d.k(this.f58946c[i10], objArr.clone());
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                this.f58946c[i10].d();
            } else {
                l();
            }
        }

        void t(Dj.a[] aVarArr, int i10) {
            b[] bVarArr = this.f58946c;
            for (int i11 = 0; i11 < i10 && !this.f58955l && !this.f58953j; i11++) {
                aVarArr[i11].b(bVarArr[i11]);
            }
        }
    }

    /* renamed from: qg.e$b */
    static final class b extends AtomicReference implements gg.l {

        /* renamed from: a, reason: collision with root package name */
        final a f58957a;

        /* renamed from: b, reason: collision with root package name */
        final int f58958b;

        /* renamed from: c, reason: collision with root package name */
        final int f58959c;

        /* renamed from: d, reason: collision with root package name */
        final int f58960d;

        /* renamed from: e, reason: collision with root package name */
        int f58961e;

        b(a aVar, int i10, int i11) {
            this.f58957a = aVar;
            this.f58958b = i10;
            this.f58959c = i11;
            this.f58960d = i11 - (i11 >> 2);
        }

        @Override // Dj.b
        public void a() {
            this.f58957a.p(this.f58958b);
        }

        public void c() {
            EnumC8672g.cancel(this);
        }

        public void d() {
            int i10 = this.f58961e + 1;
            if (i10 != this.f58960d) {
                this.f58961e = i10;
            } else {
                this.f58961e = 0;
                ((Dj.c) get()).request(i10);
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            this.f58957a.s(this.f58958b, obj);
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            EnumC8672g.setOnce(this, cVar, this.f58959c);
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f58957a.r(this.f58958b, th2);
        }
    }

    /* renamed from: qg.e$c */
    final class c implements kg.n {
        c() {
        }

        @Override // kg.n
        public Object apply(Object obj) {
            return C7487e.this.f58941d.apply(new Object[]{obj});
        }
    }

    public C7487e(Dj.a[] aVarArr, kg.n nVar, int i10, boolean z10) {
        this.f58939b = aVarArr;
        this.f58941d = nVar;
        this.f58942e = i10;
        this.f58943f = z10;
    }

    @Override // gg.i
    public void E1(Dj.b bVar) {
        int length;
        Dj.a[] aVarArr = this.f58939b;
        if (aVarArr == null) {
            aVarArr = new Dj.a[8];
            try {
                length = 0;
                for (Dj.a aVar : this.f58940c) {
                    if (length == aVarArr.length) {
                        Dj.a[] aVarArr2 = new Dj.a[(length >> 2) + length];
                        System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                        aVarArr = aVarArr2;
                    }
                    int i10 = length + 1;
                    Objects.requireNonNull(aVar, "The Iterator returned a null Publisher");
                    aVarArr[length] = aVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                EnumC8669d.error(th2, bVar);
                return;
            }
        } else {
            length = aVarArr.length;
        }
        int i11 = length;
        if (i11 == 0) {
            EnumC8669d.complete(bVar);
        } else {
            if (i11 == 1) {
                aVarArr[0].b(new O.b(bVar, new c()));
                return;
            }
            a aVar2 = new a(bVar, this.f58941d, i11, this.f58942e, this.f58943f);
            bVar.j(aVar2);
            aVar2.t(aVarArr, i11);
        }
    }
}
