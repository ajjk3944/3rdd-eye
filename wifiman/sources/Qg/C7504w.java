package qg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import yg.EnumC8672g;
import zg.AbstractC8751d;
import zg.C8750c;

/* renamed from: qg.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7504w extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final kg.n f59283c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f59284d;

    /* renamed from: e, reason: collision with root package name */
    final int f59285e;

    /* renamed from: f, reason: collision with root package name */
    final int f59286f;

    /* renamed from: qg.w$a */
    static final class a extends AtomicReference implements gg.l, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final long f59287a;

        /* renamed from: b, reason: collision with root package name */
        final b f59288b;

        /* renamed from: c, reason: collision with root package name */
        final int f59289c;

        /* renamed from: d, reason: collision with root package name */
        final int f59290d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f59291e;

        /* renamed from: f, reason: collision with root package name */
        volatile Dg.g f59292f;

        /* renamed from: g, reason: collision with root package name */
        long f59293g;

        /* renamed from: h, reason: collision with root package name */
        int f59294h;

        a(b bVar, int i10, long j10) {
            this.f59287a = j10;
            this.f59288b = bVar;
            this.f59290d = i10;
            this.f59289c = i10 >> 2;
        }

        @Override // Dj.b
        public void a() {
            this.f59291e = true;
            this.f59288b.n();
        }

        void c(long j10) {
            if (this.f59294h != 1) {
                long j11 = this.f59293g + j10;
                if (j11 < this.f59289c) {
                    this.f59293g = j11;
                } else {
                    this.f59293g = 0L;
                    ((Dj.c) get()).request(j11);
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC8672g.cancel(this);
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f59294h != 2) {
                this.f59288b.t(obj, this);
            } else {
                this.f59288b.n();
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get() == EnumC8672g.CANCELLED;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.setOnce(this, cVar)) {
                if (cVar instanceof Dg.d) {
                    Dg.d dVar = (Dg.d) cVar;
                    int iRequestFusion = dVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f59294h = iRequestFusion;
                        this.f59292f = dVar;
                        this.f59291e = true;
                        this.f59288b.n();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f59294h = iRequestFusion;
                        this.f59292f = dVar;
                    }
                }
                cVar.request(this.f59290d);
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            lazySet(EnumC8672g.CANCELLED);
            this.f59288b.r(this, th2);
        }
    }

    /* renamed from: qg.w$b */
    static final class b extends AtomicInteger implements gg.l, Dj.c {

        /* renamed from: r, reason: collision with root package name */
        static final a[] f59295r = new a[0];

        /* renamed from: s, reason: collision with root package name */
        static final a[] f59296s = new a[0];

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f59297a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f59298b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f59299c;

        /* renamed from: d, reason: collision with root package name */
        final int f59300d;

        /* renamed from: e, reason: collision with root package name */
        final int f59301e;

        /* renamed from: f, reason: collision with root package name */
        volatile Dg.f f59302f;

        /* renamed from: g, reason: collision with root package name */
        volatile boolean f59303g;

        /* renamed from: h, reason: collision with root package name */
        final C8750c f59304h = new C8750c();

        /* renamed from: i, reason: collision with root package name */
        volatile boolean f59305i;

        /* renamed from: j, reason: collision with root package name */
        final AtomicReference f59306j;

        /* renamed from: k, reason: collision with root package name */
        final AtomicLong f59307k;

        /* renamed from: l, reason: collision with root package name */
        Dj.c f59308l;

        /* renamed from: m, reason: collision with root package name */
        long f59309m;

        /* renamed from: n, reason: collision with root package name */
        long f59310n;

        /* renamed from: o, reason: collision with root package name */
        int f59311o;

        /* renamed from: p, reason: collision with root package name */
        int f59312p;

        /* renamed from: q, reason: collision with root package name */
        final int f59313q;

        b(Dj.b bVar, kg.n nVar, boolean z10, int i10, int i11) {
            AtomicReference atomicReference = new AtomicReference();
            this.f59306j = atomicReference;
            this.f59307k = new AtomicLong();
            this.f59297a = bVar;
            this.f59298b = nVar;
            this.f59299c = z10;
            this.f59300d = i10;
            this.f59301e = i11;
            this.f59313q = Math.max(1, i10 >> 1);
            atomicReference.lazySet(f59295r);
        }

        @Override // Dj.b
        public void a() {
            if (this.f59303g) {
                return;
            }
            this.f59303g = true;
            n();
        }

        boolean c(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f59306j.get();
                if (aVarArr == f59296s) {
                    aVar.dispose();
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!r.Y.a(this.f59306j, aVarArr, aVarArr2));
            return true;
        }

        @Override // Dj.c
        public void cancel() {
            Dg.f fVar;
            if (this.f59305i) {
                return;
            }
            this.f59305i = true;
            this.f59308l.cancel();
            l();
            if (getAndIncrement() != 0 || (fVar = this.f59302f) == null) {
                return;
            }
            fVar.clear();
        }

        boolean d() {
            if (this.f59305i) {
                g();
                return true;
            }
            if (this.f59299c || this.f59304h.get() == null) {
                return false;
            }
            g();
            this.f59304h.j(this.f59297a);
            return true;
        }

        void g() {
            Dg.f fVar = this.f59302f;
            if (fVar != null) {
                fVar.clear();
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f59303g) {
                return;
            }
            try {
                Object objApply = this.f59298b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                Dj.a aVar = (Dj.a) objApply;
                if (!(aVar instanceof kg.q)) {
                    int i10 = this.f59301e;
                    long j10 = this.f59309m;
                    this.f59309m = 1 + j10;
                    a aVar2 = new a(this, i10, j10);
                    if (c(aVar2)) {
                        aVar.b(aVar2);
                        return;
                    }
                    return;
                }
                try {
                    Object obj2 = ((kg.q) aVar).get();
                    if (obj2 != null) {
                        v(obj2);
                        return;
                    }
                    if (this.f59300d == Integer.MAX_VALUE || this.f59305i) {
                        return;
                    }
                    int i11 = this.f59312p + 1;
                    this.f59312p = i11;
                    int i12 = this.f59313q;
                    if (i11 == i12) {
                        this.f59312p = 0;
                        this.f59308l.request(i12);
                    }
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    this.f59304h.g(th2);
                    n();
                }
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                this.f59308l.cancel();
                onError(th3);
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f59308l, cVar)) {
                this.f59308l = cVar;
                this.f59297a.j(this);
                if (this.f59305i) {
                    return;
                }
                int i10 = this.f59300d;
                if (i10 == Integer.MAX_VALUE) {
                    cVar.request(Long.MAX_VALUE);
                } else {
                    cVar.request(i10);
                }
            }
        }

        void l() {
            AtomicReference atomicReference = this.f59306j;
            a[] aVarArr = f59296s;
            a[] aVarArr2 = (a[]) atomicReference.getAndSet(aVarArr);
            if (aVarArr2 != aVarArr) {
                for (a aVar : aVarArr2) {
                    aVar.dispose();
                }
                this.f59304h.h();
            }
        }

        void n() {
            if (getAndIncrement() == 0) {
                o();
            }
        }

        void o() {
            long j10;
            long j11;
            long j12;
            boolean z10;
            int i10;
            int i11;
            long j13;
            long j14;
            Dj.b bVar = this.f59297a;
            int iAddAndGet = 1;
            while (!d()) {
                Dg.f fVar = this.f59302f;
                long jAddAndGet = this.f59307k.get();
                boolean z11 = jAddAndGet == Long.MAX_VALUE;
                long j15 = 0;
                if (fVar != null) {
                    long j16 = 0;
                    j10 = 0;
                    while (jAddAndGet != 0) {
                        Object objPoll = fVar.poll();
                        if (d()) {
                            return;
                        }
                        if (objPoll == null) {
                            break;
                        }
                        bVar.h(objPoll);
                        j10++;
                        j16++;
                        jAddAndGet--;
                    }
                    if (j16 != 0) {
                        jAddAndGet = z11 ? Long.MAX_VALUE : this.f59307k.addAndGet(-j16);
                    }
                } else {
                    j10 = 0;
                }
                boolean z12 = this.f59303g;
                Dg.f fVar2 = this.f59302f;
                a[] aVarArr = (a[]) this.f59306j.get();
                int length = aVarArr.length;
                if (z12 && ((fVar2 == null || fVar2.isEmpty()) && length == 0)) {
                    this.f59304h.j(this.f59297a);
                    return;
                }
                int i12 = iAddAndGet;
                if (length != 0) {
                    long j17 = this.f59310n;
                    int i13 = this.f59311o;
                    if (length <= i13 || aVarArr[i13].f59287a != j17) {
                        if (length <= i13) {
                            i13 = 0;
                        }
                        for (int i14 = 0; i14 < length && aVarArr[i13].f59287a != j17; i14++) {
                            i13++;
                            if (i13 == length) {
                                i13 = 0;
                            }
                        }
                        this.f59311o = i13;
                        this.f59310n = aVarArr[i13].f59287a;
                    }
                    int i15 = i13;
                    boolean z13 = false;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= length) {
                            z10 = z13;
                            break;
                        }
                        if (d()) {
                            return;
                        }
                        a aVar = aVarArr[i15];
                        Object obj = null;
                        while (true) {
                            Dg.g gVar = aVar.f59292f;
                            if (gVar == null) {
                                i10 = length;
                                break;
                            }
                            i10 = length;
                            Object obj2 = obj;
                            long j18 = j15;
                            while (true) {
                                if (jAddAndGet == j15) {
                                    j13 = j15;
                                    break;
                                }
                                if (d()) {
                                    return;
                                }
                                try {
                                    Object objPoll2 = gVar.poll();
                                    if (objPoll2 == null) {
                                        obj2 = objPoll2;
                                        j13 = 0;
                                        break;
                                    } else {
                                        bVar.h(objPoll2);
                                        jAddAndGet--;
                                        j18++;
                                        obj2 = objPoll2;
                                        j15 = 0;
                                    }
                                } catch (Throwable th2) {
                                    AbstractC6152a.b(th2);
                                    aVar.dispose();
                                    this.f59304h.g(th2);
                                    if (!this.f59299c) {
                                        this.f59308l.cancel();
                                    }
                                    if (d()) {
                                        return;
                                    }
                                    s(aVar);
                                    i16++;
                                    i11 = i10;
                                    z13 = true;
                                }
                            }
                            if (j18 != j13) {
                                jAddAndGet = !z11 ? this.f59307k.addAndGet(-j18) : Long.MAX_VALUE;
                                aVar.c(j18);
                                j14 = 0;
                            } else {
                                j14 = j13;
                            }
                            if (jAddAndGet == j14 || obj2 == null) {
                                break;
                            }
                            length = i10;
                            obj = obj2;
                            j15 = 0;
                        }
                        boolean z14 = aVar.f59291e;
                        Dg.g gVar2 = aVar.f59292f;
                        if (z14 && (gVar2 == null || gVar2.isEmpty())) {
                            s(aVar);
                            if (d()) {
                                return;
                            }
                            j10++;
                            z13 = true;
                        }
                        if (jAddAndGet == 0) {
                            z10 = z13;
                            break;
                        }
                        i15++;
                        i11 = i10;
                        if (i15 == i11) {
                            i15 = 0;
                        }
                        i16++;
                        length = i11;
                        j15 = 0;
                    }
                    this.f59311o = i15;
                    this.f59310n = aVarArr[i15].f59287a;
                    j12 = j10;
                    j11 = 0;
                } else {
                    j11 = 0;
                    j12 = j10;
                    z10 = false;
                }
                if (j12 != j11 && !this.f59305i) {
                    this.f59308l.request(j12);
                }
                if (z10) {
                    iAddAndGet = i12;
                } else {
                    iAddAndGet = addAndGet(-i12);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59303g) {
                Eg.a.v(th2);
                return;
            }
            if (this.f59304h.g(th2)) {
                this.f59303g = true;
                if (!this.f59299c) {
                    for (a aVar : (a[]) this.f59306j.getAndSet(f59296s)) {
                        aVar.dispose();
                    }
                }
                n();
            }
        }

        Dg.g p() {
            Dg.f iVar = this.f59302f;
            if (iVar == null) {
                iVar = this.f59300d == Integer.MAX_VALUE ? new Dg.i(this.f59301e) : new Dg.h(this.f59300d);
                this.f59302f = iVar;
            }
            return iVar;
        }

        void r(a aVar, Throwable th2) {
            if (this.f59304h.g(th2)) {
                aVar.f59291e = true;
                if (!this.f59299c) {
                    this.f59308l.cancel();
                    for (a aVar2 : (a[]) this.f59306j.getAndSet(f59296s)) {
                        aVar2.dispose();
                    }
                }
                n();
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.a(this.f59307k, j10);
                n();
            }
        }

        void s(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f59306j.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
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
                    aVarArr2 = f59295r;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!r.Y.a(this.f59306j, aVarArr, aVarArr2));
        }

        void t(Object obj, a aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.f59307k.get();
                Dg.g hVar = aVar.f59292f;
                if (j10 == 0 || !(hVar == null || hVar.isEmpty())) {
                    if (hVar == null) {
                        hVar = new Dg.h(this.f59301e);
                        aVar.f59292f = hVar;
                    }
                    if (!hVar.offer(obj)) {
                        onError(new QueueOverflowException());
                    }
                } else {
                    this.f59297a.h(obj);
                    if (j10 != Long.MAX_VALUE) {
                        this.f59307k.decrementAndGet();
                    }
                    aVar.c(1L);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                Dg.g hVar2 = aVar.f59292f;
                if (hVar2 == null) {
                    hVar2 = new Dg.h(this.f59301e);
                    aVar.f59292f = hVar2;
                }
                if (!hVar2.offer(obj)) {
                    onError(new QueueOverflowException());
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            o();
        }

        void v(Object obj) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j10 = this.f59307k.get();
                Dg.g gVarP = this.f59302f;
                if (j10 == 0 || !(gVarP == null || gVarP.isEmpty())) {
                    if (gVarP == null) {
                        gVarP = p();
                    }
                    if (!gVarP.offer(obj)) {
                        onError(new QueueOverflowException());
                    }
                } else {
                    this.f59297a.h(obj);
                    if (j10 != Long.MAX_VALUE) {
                        this.f59307k.decrementAndGet();
                    }
                    if (this.f59300d != Integer.MAX_VALUE && !this.f59305i) {
                        int i10 = this.f59312p + 1;
                        this.f59312p = i10;
                        int i11 = this.f59313q;
                        if (i10 == i11) {
                            this.f59312p = 0;
                            this.f59308l.request(i11);
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!p().offer(obj)) {
                onError(new QueueOverflowException());
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            o();
        }
    }

    public C7504w(gg.i iVar, kg.n nVar, boolean z10, int i10, int i11) {
        super(iVar);
        this.f59283c = nVar;
        this.f59284d = z10;
        this.f59285e = i10;
        this.f59286f = i11;
    }

    public static gg.l h2(Dj.b bVar, kg.n nVar, boolean z10, int i10, int i11) {
        return new b(bVar, nVar, z10, i10, i11);
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        if (i0.b(this.f58857b, bVar, this.f59283c)) {
            return;
        }
        this.f58857b.D1(h2(bVar, this.f59283c, this.f59284d, this.f59285e, this.f59286f));
    }
}
