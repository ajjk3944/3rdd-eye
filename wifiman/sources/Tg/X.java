package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6469f;
import lg.EnumC6592b;
import zg.AbstractC8755h;
import zg.EnumC8757j;

/* loaded from: classes4.dex */
public final class X extends Bg.a {

    /* renamed from: e, reason: collision with root package name */
    static final b f62244e = new j();

    /* renamed from: a, reason: collision with root package name */
    final gg.v f62245a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference f62246b;

    /* renamed from: c, reason: collision with root package name */
    final b f62247c;

    /* renamed from: d, reason: collision with root package name */
    final gg.v f62248d;

    static abstract class a extends AtomicReference implements e {

        /* renamed from: a, reason: collision with root package name */
        d f62249a;

        /* renamed from: b, reason: collision with root package name */
        int f62250b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f62251c;

        a(boolean z10) {
            this.f62251c = z10;
            d dVar = new d(null);
            this.f62249a = dVar;
            set(dVar);
        }

        @Override // tg.X.e
        public final void F(Throwable th2) {
            a(new d(c(EnumC8757j.error(th2))));
            p();
        }

        @Override // tg.X.e
        public final void S(c cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                d dVarD = (d) cVar.a();
                if (dVarD == null) {
                    dVarD = d();
                    cVar.f62254c = dVarD;
                }
                while (!cVar.isDisposed()) {
                    d dVar = (d) dVarD.get();
                    if (dVar == null) {
                        cVar.f62254c = dVarD;
                        iAddAndGet = cVar.addAndGet(-iAddAndGet);
                    } else {
                        if (EnumC8757j.accept(g(dVar.f62256a), cVar.f62253b)) {
                            cVar.f62254c = null;
                            return;
                        }
                        dVarD = dVar;
                    }
                }
                cVar.f62254c = null;
                return;
            } while (iAddAndGet != 0);
        }

        final void a(d dVar) {
            this.f62249a.set(dVar);
            this.f62249a = dVar;
            this.f62250b++;
        }

        Object c(Object obj) {
            return obj;
        }

        d d() {
            return (d) get();
        }

        Object g(Object obj) {
            return obj;
        }

        final void h() {
            this.f62250b--;
            j((d) ((d) get()).get());
        }

        final void j(d dVar) {
            if (this.f62251c) {
                d dVar2 = new d(null);
                dVar2.lazySet(dVar.get());
                dVar = dVar2;
            }
            set(dVar);
        }

        final void l() {
            d dVar = (d) get();
            if (dVar.f62256a != null) {
                d dVar2 = new d(null);
                dVar2.lazySet(dVar.get());
                set(dVar2);
            }
        }

        @Override // tg.X.e
        public final void m() {
            a(new d(c(EnumC8757j.complete())));
            p();
        }

        abstract void n();

        @Override // tg.X.e
        public final void o(Object obj) {
            a(new d(c(EnumC8757j.next(obj))));
            n();
        }

        void p() {
            l();
        }
    }

    interface b {
        e call();
    }

    static final class c extends AtomicInteger implements InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final g f62252a;

        /* renamed from: b, reason: collision with root package name */
        final gg.x f62253b;

        /* renamed from: c, reason: collision with root package name */
        Object f62254c;

        /* renamed from: d, reason: collision with root package name */
        volatile boolean f62255d;

        c(g gVar, gg.x xVar) {
            this.f62252a = gVar;
            this.f62253b = xVar;
        }

        Object a() {
            return this.f62254c;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f62255d) {
                return;
            }
            this.f62255d = true;
            this.f62252a.g(this);
            this.f62254c = null;
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62255d;
        }
    }

    static final class d extends AtomicReference {

        /* renamed from: a, reason: collision with root package name */
        final Object f62256a;

        d(Object obj) {
            this.f62256a = obj;
        }
    }

    interface e {
        void F(Throwable th2);

        void S(c cVar);

        void m();

        void o(Object obj);
    }

    static final class f implements b {

        /* renamed from: a, reason: collision with root package name */
        final int f62257a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f62258b;

        f(int i10, boolean z10) {
            this.f62257a = i10;
            this.f62258b = z10;
        }

        @Override // tg.X.b
        public e call() {
            return new i(this.f62257a, this.f62258b);
        }
    }

    static final class g extends AtomicReference implements gg.x, InterfaceC6043c {

        /* renamed from: f, reason: collision with root package name */
        static final c[] f62259f = new c[0];

        /* renamed from: g, reason: collision with root package name */
        static final c[] f62260g = new c[0];

        /* renamed from: a, reason: collision with root package name */
        final e f62261a;

        /* renamed from: b, reason: collision with root package name */
        boolean f62262b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference f62263c = new AtomicReference(f62259f);

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f62264d = new AtomicBoolean();

        /* renamed from: e, reason: collision with root package name */
        final AtomicReference f62265e;

        g(e eVar, AtomicReference atomicReference) {
            this.f62261a = eVar;
            this.f62265e = atomicReference;
        }

        @Override // gg.x
        public void a() {
            if (this.f62262b) {
                return;
            }
            this.f62262b = true;
            this.f62261a.m();
            m();
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            if (EnumC6592b.setOnce(this, interfaceC6043c)) {
                j();
            }
        }

        boolean d(c cVar) {
            c[] cVarArr;
            c[] cVarArr2;
            do {
                cVarArr = (c[]) this.f62263c.get();
                if (cVarArr == f62260g) {
                    return false;
                }
                int length = cVarArr.length;
                cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
            } while (!r.Y.a(this.f62263c, cVarArr, cVarArr2));
            return true;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f62263c.set(f62260g);
            r.Y.a(this.f62265e, this, null);
            EnumC6592b.dispose(this);
        }

        void g(c cVar) {
            c[] cVarArr;
            c[] cVarArr2;
            do {
                cVarArr = (c[]) this.f62263c.get();
                int length = cVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (cVarArr[i10].equals(cVar)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    cVarArr2 = f62259f;
                } else {
                    c[] cVarArr3 = new c[length - 1];
                    System.arraycopy(cVarArr, 0, cVarArr3, 0, i10);
                    System.arraycopy(cVarArr, i10 + 1, cVarArr3, i10, (length - i10) - 1);
                    cVarArr2 = cVarArr3;
                }
            } while (!r.Y.a(this.f62263c, cVarArr, cVarArr2));
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62262b) {
                return;
            }
            this.f62261a.o(obj);
            j();
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62263c.get() == f62260g;
        }

        void j() {
            for (c cVar : (c[]) this.f62263c.get()) {
                this.f62261a.S(cVar);
            }
        }

        void m() {
            for (c cVar : (c[]) this.f62263c.getAndSet(f62260g)) {
                this.f62261a.S(cVar);
            }
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62262b) {
                Eg.a.v(th2);
                return;
            }
            this.f62262b = true;
            this.f62261a.F(th2);
            m();
        }
    }

    static final class h implements gg.v {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReference f62266a;

        /* renamed from: b, reason: collision with root package name */
        private final b f62267b;

        h(AtomicReference atomicReference, b bVar) {
            this.f62266a = atomicReference;
            this.f62267b = bVar;
        }

        @Override // gg.v
        public void d(gg.x xVar) {
            g gVar;
            while (true) {
                gVar = (g) this.f62266a.get();
                if (gVar != null) {
                    break;
                }
                g gVar2 = new g(this.f62267b.call(), this.f62266a);
                if (r.Y.a(this.f62266a, null, gVar2)) {
                    gVar = gVar2;
                    break;
                }
            }
            c cVar = new c(gVar, xVar);
            xVar.c(cVar);
            gVar.d(cVar);
            if (cVar.isDisposed()) {
                gVar.g(cVar);
            } else {
                gVar.f62261a.S(cVar);
            }
        }
    }

    static final class i extends a {

        /* renamed from: d, reason: collision with root package name */
        final int f62268d;

        i(int i10, boolean z10) {
            super(z10);
            this.f62268d = i10;
        }

        @Override // tg.X.a
        void n() {
            if (this.f62250b > this.f62268d) {
                h();
            }
        }
    }

    static final class j implements b {
        j() {
        }

        @Override // tg.X.b
        public e call() {
            return new k(16);
        }
    }

    static final class k extends ArrayList implements e {

        /* renamed from: a, reason: collision with root package name */
        volatile int f62269a;

        k(int i10) {
            super(i10);
        }

        @Override // tg.X.e
        public void F(Throwable th2) {
            add(EnumC8757j.error(th2));
            this.f62269a++;
        }

        @Override // tg.X.e
        public void S(c cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            gg.x xVar = cVar.f62253b;
            int iAddAndGet = 1;
            while (!cVar.isDisposed()) {
                int i10 = this.f62269a;
                Integer num = (Integer) cVar.a();
                int iIntValue = num != null ? num.intValue() : 0;
                while (iIntValue < i10) {
                    if (EnumC8757j.accept(get(iIntValue), xVar) || cVar.isDisposed()) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
                cVar.f62254c = Integer.valueOf(iIntValue);
                iAddAndGet = cVar.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // tg.X.e
        public void m() {
            add(EnumC8757j.complete());
            this.f62269a++;
        }

        @Override // tg.X.e
        public void o(Object obj) {
            add(EnumC8757j.next(obj));
            this.f62269a++;
        }
    }

    private X(gg.v vVar, gg.v vVar2, AtomicReference atomicReference, b bVar) {
        this.f62248d = vVar;
        this.f62245a = vVar2;
        this.f62246b = atomicReference;
        this.f62247c = bVar;
    }

    public static Bg.a p1(gg.v vVar, int i10, boolean z10) {
        return i10 == Integer.MAX_VALUE ? r1(vVar) : q1(vVar, new f(i10, z10));
    }

    static Bg.a q1(gg.v vVar, b bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return Eg.a.m(new X(new h(atomicReference, bVar), vVar, atomicReference, bVar));
    }

    public static Bg.a r1(gg.v vVar) {
        return q1(vVar, f62244e);
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        this.f62248d.d(xVar);
    }

    @Override // Bg.a
    public void k1(InterfaceC6469f interfaceC6469f) {
        g gVar;
        while (true) {
            gVar = (g) this.f62246b.get();
            if (gVar != null && !gVar.isDisposed()) {
                break;
            }
            g gVar2 = new g(this.f62247c.call(), this.f62246b);
            if (r.Y.a(this.f62246b, gVar, gVar2)) {
                gVar = gVar2;
                break;
            }
        }
        boolean z10 = !gVar.f62264d.get() && gVar.f62264d.compareAndSet(false, true);
        try {
            interfaceC6469f.accept(gVar);
            if (z10) {
                this.f62245a.d(gVar);
            }
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            if (z10) {
                gVar.f62264d.compareAndSet(true, false);
            }
            AbstractC6152a.b(th2);
            throw AbstractC8755h.h(th2);
        }
    }

    @Override // Bg.a
    public void o1() {
        g gVar = (g) this.f62246b.get();
        if (gVar == null || !gVar.isDisposed()) {
            return;
        }
        r.Y.a(this.f62246b, gVar, null);
    }
}
