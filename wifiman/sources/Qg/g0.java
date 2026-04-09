package qg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jg.AbstractC6327a;
import kg.InterfaceC6469f;
import yg.EnumC8669d;
import yg.EnumC8672g;
import zg.AbstractC8751d;
import zg.AbstractC8755h;
import zg.EnumC8757j;

/* loaded from: classes4.dex */
public final class g0 extends AbstractC6327a {

    /* renamed from: f, reason: collision with root package name */
    static final kg.q f59011f = new b();

    /* renamed from: b, reason: collision with root package name */
    final gg.i f59012b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference f59013c;

    /* renamed from: d, reason: collision with root package name */
    final kg.q f59014d;

    /* renamed from: e, reason: collision with root package name */
    final Dj.a f59015e;

    static abstract class a extends AtomicReference implements e {

        /* renamed from: a, reason: collision with root package name */
        final boolean f59016a;

        /* renamed from: b, reason: collision with root package name */
        d f59017b;

        /* renamed from: c, reason: collision with root package name */
        int f59018c;

        /* renamed from: d, reason: collision with root package name */
        long f59019d;

        a(boolean z10) {
            this.f59016a = z10;
            d dVar = new d(null, 0L);
            this.f59017b = dVar;
            set(dVar);
        }

        @Override // qg.g0.e
        public final void F(Throwable th2) {
            Object objC = c(EnumC8757j.error(th2), true);
            long j10 = this.f59019d + 1;
            this.f59019d = j10;
            a(new d(objC, j10));
            p();
        }

        @Override // qg.g0.e
        public final void S(c cVar) {
            synchronized (cVar) {
                try {
                    if (cVar.f59024e) {
                        cVar.f59025f = true;
                        return;
                    }
                    cVar.f59024e = true;
                    while (true) {
                        long j10 = cVar.get();
                        boolean z10 = j10 == Long.MAX_VALUE;
                        d dVarD = (d) cVar.a();
                        if (dVarD == null) {
                            dVarD = d();
                            cVar.f59022c = dVarD;
                            AbstractC8751d.a(cVar.f59023d, dVarD.f59027b);
                        }
                        long j11 = 0;
                        while (j10 != 0) {
                            if (!cVar.isDisposed()) {
                                d dVar = (d) dVarD.get();
                                if (dVar == null) {
                                    break;
                                }
                                Object objG = g(dVar.f59026a);
                                try {
                                    if (EnumC8757j.accept(objG, cVar.f59021b)) {
                                        cVar.f59022c = null;
                                        return;
                                    } else {
                                        j11++;
                                        j10--;
                                        dVarD = dVar;
                                    }
                                } catch (Throwable th2) {
                                    AbstractC6152a.b(th2);
                                    cVar.f59022c = null;
                                    cVar.dispose();
                                    if (EnumC8757j.isError(objG) || EnumC8757j.isComplete(objG)) {
                                        Eg.a.v(th2);
                                        return;
                                    } else {
                                        cVar.f59021b.onError(th2);
                                        return;
                                    }
                                }
                            } else {
                                cVar.f59022c = null;
                                return;
                            }
                        }
                        if (j10 == 0 && cVar.isDisposed()) {
                            cVar.f59022c = null;
                            return;
                        }
                        if (j11 != 0) {
                            cVar.f59022c = dVarD;
                            if (!z10) {
                                cVar.c(j11);
                            }
                        }
                        synchronized (cVar) {
                            try {
                                if (!cVar.f59025f) {
                                    cVar.f59024e = false;
                                    return;
                                }
                                cVar.f59025f = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        final void a(d dVar) {
            this.f59017b.set(dVar);
            this.f59017b = dVar;
            this.f59018c++;
        }

        Object c(Object obj, boolean z10) {
            return obj;
        }

        d d() {
            return (d) get();
        }

        Object g(Object obj) {
            return obj;
        }

        final void h() {
            d dVar = (d) ((d) get()).get();
            if (dVar == null) {
                throw new IllegalStateException("Empty list!");
            }
            this.f59018c--;
            j(dVar);
        }

        final void j(d dVar) {
            if (this.f59016a) {
                d dVar2 = new d(null, dVar.f59027b);
                dVar2.lazySet(dVar.get());
                dVar = dVar2;
            }
            set(dVar);
        }

        final void l() {
            d dVar = (d) get();
            if (dVar.f59026a != null) {
                d dVar2 = new d(null, 0L);
                dVar2.lazySet(dVar.get());
                set(dVar2);
            }
        }

        @Override // qg.g0.e
        public final void m() {
            Object objC = c(EnumC8757j.complete(), true);
            long j10 = this.f59019d + 1;
            this.f59019d = j10;
            a(new d(objC, j10));
            p();
        }

        abstract void n();

        @Override // qg.g0.e
        public final void o(Object obj) {
            Object objC = c(EnumC8757j.next(obj), false);
            long j10 = this.f59019d + 1;
            this.f59019d = j10;
            a(new d(objC, j10));
            n();
        }

        void p() {
            l();
        }
    }

    static final class b implements kg.q {
        b() {
        }

        @Override // kg.q
        public Object get() {
            return new j(16);
        }
    }

    static final class c extends AtomicLong implements Dj.c, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final h f59020a;

        /* renamed from: b, reason: collision with root package name */
        final Dj.b f59021b;

        /* renamed from: c, reason: collision with root package name */
        Object f59022c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicLong f59023d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        boolean f59024e;

        /* renamed from: f, reason: collision with root package name */
        boolean f59025f;

        c(h hVar, Dj.b bVar) {
            this.f59020a = hVar;
            this.f59021b = bVar;
        }

        Object a() {
            return this.f59022c;
        }

        public long c(long j10) {
            return AbstractC8751d.e(this, j10);
        }

        @Override // Dj.c
        public void cancel() {
            dispose();
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f59020a.g(this);
                this.f59020a.d();
                this.f59022c = null;
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // Dj.c
        public void request(long j10) {
            if (!EnumC8672g.validate(j10) || AbstractC8751d.b(this, j10) == Long.MIN_VALUE) {
                return;
            }
            AbstractC8751d.a(this.f59023d, j10);
            this.f59020a.d();
            this.f59020a.f59034a.S(this);
        }
    }

    static final class d extends AtomicReference {

        /* renamed from: a, reason: collision with root package name */
        final Object f59026a;

        /* renamed from: b, reason: collision with root package name */
        final long f59027b;

        d(Object obj, long j10) {
            this.f59026a = obj;
            this.f59027b = j10;
        }
    }

    interface e {
        void F(Throwable th2);

        void S(c cVar);

        void m();

        void o(Object obj);
    }

    static final class f implements kg.q {

        /* renamed from: a, reason: collision with root package name */
        final int f59028a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f59029b;

        f(int i10, boolean z10) {
            this.f59028a = i10;
            this.f59029b = z10;
        }

        @Override // kg.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get() {
            return new i(this.f59028a, this.f59029b);
        }
    }

    static final class g implements Dj.a {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReference f59030a;

        /* renamed from: b, reason: collision with root package name */
        private final kg.q f59031b;

        g(AtomicReference atomicReference, kg.q qVar) {
            this.f59030a = atomicReference;
            this.f59031b = qVar;
        }

        @Override // Dj.a
        public void b(Dj.b bVar) {
            h hVar;
            while (true) {
                hVar = (h) this.f59030a.get();
                if (hVar != null) {
                    break;
                }
                try {
                    h hVar2 = new h((e) this.f59031b.get(), this.f59030a);
                    if (r.Y.a(this.f59030a, null, hVar2)) {
                        hVar = hVar2;
                        break;
                    }
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    EnumC8669d.error(th2, bVar);
                    return;
                }
            }
            c cVar = new c(hVar, bVar);
            bVar.j(cVar);
            hVar.c(cVar);
            if (cVar.isDisposed()) {
                hVar.g(cVar);
            } else {
                hVar.d();
                hVar.f59034a.S(cVar);
            }
        }
    }

    static final class h extends AtomicReference implements gg.l, InterfaceC6043c {

        /* renamed from: h, reason: collision with root package name */
        static final c[] f59032h = new c[0];

        /* renamed from: i, reason: collision with root package name */
        static final c[] f59033i = new c[0];

        /* renamed from: a, reason: collision with root package name */
        final e f59034a;

        /* renamed from: b, reason: collision with root package name */
        boolean f59035b;

        /* renamed from: f, reason: collision with root package name */
        long f59039f;

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference f59040g;

        /* renamed from: e, reason: collision with root package name */
        final AtomicInteger f59038e = new AtomicInteger();

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference f59036c = new AtomicReference(f59032h);

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f59037d = new AtomicBoolean();

        h(e eVar, AtomicReference atomicReference) {
            this.f59034a = eVar;
            this.f59040g = atomicReference;
        }

        @Override // Dj.b
        public void a() {
            if (this.f59035b) {
                return;
            }
            this.f59035b = true;
            this.f59034a.m();
            for (c cVar : (c[]) this.f59036c.getAndSet(f59033i)) {
                this.f59034a.S(cVar);
            }
        }

        boolean c(c cVar) {
            c[] cVarArr;
            c[] cVarArr2;
            do {
                cVarArr = (c[]) this.f59036c.get();
                if (cVarArr == f59033i) {
                    return false;
                }
                int length = cVarArr.length;
                cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
            } while (!r.Y.a(this.f59036c, cVarArr, cVarArr2));
            return true;
        }

        void d() {
            AtomicInteger atomicInteger = this.f59038e;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            while (!isDisposed()) {
                Dj.c cVar = (Dj.c) get();
                if (cVar != null) {
                    long j10 = this.f59039f;
                    long jMax = j10;
                    for (c cVar2 : (c[]) this.f59036c.get()) {
                        jMax = Math.max(jMax, cVar2.f59023d.get());
                    }
                    long j11 = jMax - j10;
                    if (j11 != 0) {
                        this.f59039f = jMax;
                        cVar.request(j11);
                    }
                }
                iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f59036c.set(f59033i);
            r.Y.a(this.f59040g, this, null);
            EnumC8672g.cancel(this);
        }

        void g(c cVar) {
            c[] cVarArr;
            c[] cVarArr2;
            do {
                cVarArr = (c[]) this.f59036c.get();
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
                    cVarArr2 = f59032h;
                } else {
                    c[] cVarArr3 = new c[length - 1];
                    System.arraycopy(cVarArr, 0, cVarArr3, 0, i10);
                    System.arraycopy(cVarArr, i10 + 1, cVarArr3, i10, (length - i10) - 1);
                    cVarArr2 = cVarArr3;
                }
            } while (!r.Y.a(this.f59036c, cVarArr, cVarArr2));
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f59035b) {
                return;
            }
            this.f59034a.o(obj);
            for (c cVar : (c[]) this.f59036c.get()) {
                this.f59034a.S(cVar);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f59036c.get() == f59033i;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.setOnce(this, cVar)) {
                d();
                for (c cVar2 : (c[]) this.f59036c.get()) {
                    this.f59034a.S(cVar2);
                }
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f59035b) {
                Eg.a.v(th2);
                return;
            }
            this.f59035b = true;
            this.f59034a.F(th2);
            for (c cVar : (c[]) this.f59036c.getAndSet(f59033i)) {
                this.f59034a.S(cVar);
            }
        }
    }

    static final class i extends a {

        /* renamed from: e, reason: collision with root package name */
        final int f59041e;

        i(int i10, boolean z10) {
            super(z10);
            this.f59041e = i10;
        }

        @Override // qg.g0.a
        void n() {
            if (this.f59018c > this.f59041e) {
                h();
            }
        }
    }

    static final class j extends ArrayList implements e {

        /* renamed from: a, reason: collision with root package name */
        volatile int f59042a;

        j(int i10) {
            super(i10);
        }

        @Override // qg.g0.e
        public void F(Throwable th2) {
            add(EnumC8757j.error(th2));
            this.f59042a++;
        }

        @Override // qg.g0.e
        public void S(c cVar) {
            synchronized (cVar) {
                try {
                    if (cVar.f59024e) {
                        cVar.f59025f = true;
                        return;
                    }
                    cVar.f59024e = true;
                    Dj.b bVar = cVar.f59021b;
                    while (!cVar.isDisposed()) {
                        int i10 = this.f59042a;
                        Integer num = (Integer) cVar.a();
                        int iIntValue = num != null ? num.intValue() : 0;
                        long j10 = cVar.get();
                        long j11 = j10;
                        long j12 = 0;
                        while (j11 != 0 && iIntValue < i10) {
                            E e10 = get(iIntValue);
                            try {
                                if (EnumC8757j.accept(e10, bVar) || cVar.isDisposed()) {
                                    return;
                                }
                                iIntValue++;
                                j11--;
                                j12++;
                            } catch (Throwable th2) {
                                AbstractC6152a.b(th2);
                                cVar.dispose();
                                if (EnumC8757j.isError(e10) || EnumC8757j.isComplete(e10)) {
                                    Eg.a.v(th2);
                                    return;
                                } else {
                                    bVar.onError(th2);
                                    return;
                                }
                            }
                        }
                        if (j12 != 0) {
                            cVar.f59022c = Integer.valueOf(iIntValue);
                            if (j10 != Long.MAX_VALUE) {
                                cVar.c(j12);
                            }
                        }
                        synchronized (cVar) {
                            try {
                                if (!cVar.f59025f) {
                                    cVar.f59024e = false;
                                    return;
                                }
                                cVar.f59025f = false;
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        @Override // qg.g0.e
        public void m() {
            add(EnumC8757j.complete());
            this.f59042a++;
        }

        @Override // qg.g0.e
        public void o(Object obj) {
            add(EnumC8757j.next(obj));
            this.f59042a++;
        }
    }

    private g0(Dj.a aVar, gg.i iVar, AtomicReference atomicReference, kg.q qVar) {
        this.f59015e = aVar;
        this.f59012b = iVar;
        this.f59013c = atomicReference;
        this.f59014d = qVar;
    }

    public static AbstractC6327a m2(gg.i iVar, int i10, boolean z10) {
        return i10 == Integer.MAX_VALUE ? o2(iVar) : n2(iVar, new f(i10, z10));
    }

    static AbstractC6327a n2(gg.i iVar, kg.q qVar) {
        AtomicReference atomicReference = new AtomicReference();
        return Eg.a.s(new g0(new g(atomicReference, qVar), iVar, atomicReference, qVar));
    }

    public static AbstractC6327a o2(gg.i iVar) {
        return n2(iVar, f59011f);
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        this.f59015e.b(bVar);
    }

    @Override // jg.AbstractC6327a
    public void h2(InterfaceC6469f interfaceC6469f) {
        h hVar;
        while (true) {
            hVar = (h) this.f59013c.get();
            if (hVar != null && !hVar.isDisposed()) {
                break;
            }
            try {
                h hVar2 = new h((e) this.f59014d.get(), this.f59013c);
                if (r.Y.a(this.f59013c, hVar, hVar2)) {
                    hVar = hVar2;
                    break;
                }
            } finally {
                AbstractC6152a.b(th);
                RuntimeException runtimeExceptionH = AbstractC8755h.h(th);
            }
        }
        boolean z10 = !hVar.f59037d.get() && hVar.f59037d.compareAndSet(false, true);
        try {
            interfaceC6469f.accept(hVar);
            if (z10) {
                this.f59012b.D1(hVar);
            }
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            if (z10) {
                hVar.f59037d.compareAndSet(true, false);
            }
            throw AbstractC8755h.h(th2);
        }
    }

    @Override // jg.AbstractC6327a
    public void l2() {
        h hVar = (h) this.f59013c.get();
        if (hVar == null || !hVar.isDisposed()) {
            return;
        }
        r.Y.a(this.f59013c, hVar, null);
    }
}
