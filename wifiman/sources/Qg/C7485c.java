package qg;

import gg.y;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import vg.C8229a;
import yg.EnumC8669d;
import yg.EnumC8672g;
import zg.AbstractC8761n;

/* renamed from: qg.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7485c extends AbstractC7484b {

    /* renamed from: c, reason: collision with root package name */
    final long f58865c;

    /* renamed from: d, reason: collision with root package name */
    final long f58866d;

    /* renamed from: e, reason: collision with root package name */
    final TimeUnit f58867e;

    /* renamed from: f, reason: collision with root package name */
    final gg.y f58868f;

    /* renamed from: g, reason: collision with root package name */
    final kg.q f58869g;

    /* renamed from: h, reason: collision with root package name */
    final int f58870h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f58871i;

    /* renamed from: qg.c$a */
    static final class a extends xg.d implements Dj.c, Runnable, InterfaceC6043c {

        /* renamed from: h, reason: collision with root package name */
        final kg.q f58872h;

        /* renamed from: i, reason: collision with root package name */
        final long f58873i;

        /* renamed from: j, reason: collision with root package name */
        final TimeUnit f58874j;

        /* renamed from: k, reason: collision with root package name */
        final int f58875k;

        /* renamed from: l, reason: collision with root package name */
        final boolean f58876l;

        /* renamed from: m, reason: collision with root package name */
        final y.c f58877m;

        /* renamed from: n, reason: collision with root package name */
        Collection f58878n;

        /* renamed from: o, reason: collision with root package name */
        InterfaceC6043c f58879o;

        /* renamed from: p, reason: collision with root package name */
        Dj.c f58880p;

        /* renamed from: q, reason: collision with root package name */
        long f58881q;

        /* renamed from: r, reason: collision with root package name */
        long f58882r;

        a(Dj.b bVar, kg.q qVar, long j10, TimeUnit timeUnit, int i10, boolean z10, y.c cVar) {
            super(bVar, new C8229a());
            this.f58872h = qVar;
            this.f58873i = j10;
            this.f58874j = timeUnit;
            this.f58875k = i10;
            this.f58876l = z10;
            this.f58877m = cVar;
        }

        @Override // Dj.b
        public void a() {
            Collection collection;
            synchronized (this) {
                collection = this.f58878n;
                this.f58878n = null;
            }
            if (collection != null) {
                this.f66083d.offer(collection);
                this.f66085f = true;
                if (i()) {
                    AbstractC8761n.b(this.f66083d, this.f66082c, false, this, this);
                }
                this.f58877m.dispose();
            }
        }

        @Override // Dj.c
        public void cancel() {
            if (this.f66084e) {
                return;
            }
            this.f66084e = true;
            dispose();
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            synchronized (this) {
                this.f58878n = null;
            }
            this.f58880p.cancel();
            this.f58877m.dispose();
        }

        @Override // Dj.b
        public void h(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.f58878n;
                    if (collection == null) {
                        return;
                    }
                    collection.add(obj);
                    if (collection.size() < this.f58875k) {
                        return;
                    }
                    this.f58878n = null;
                    this.f58881q++;
                    if (this.f58876l) {
                        this.f58879o.dispose();
                    }
                    q(collection, false, this);
                    try {
                        Object obj2 = this.f58872h.get();
                        Objects.requireNonNull(obj2, "The supplied buffer is null");
                        Collection collection2 = (Collection) obj2;
                        synchronized (this) {
                            this.f58878n = collection2;
                            this.f58882r++;
                        }
                        if (this.f58876l) {
                            y.c cVar = this.f58877m;
                            long j10 = this.f58873i;
                            this.f58879o = cVar.d(this, j10, j10, this.f58874j);
                        }
                    } catch (Throwable th2) {
                        AbstractC6152a.b(th2);
                        cancel();
                        this.f66082c.onError(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f58877m.isDisposed();
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58880p, cVar)) {
                this.f58880p = cVar;
                try {
                    Object obj = this.f58872h.get();
                    Objects.requireNonNull(obj, "The supplied buffer is null");
                    this.f58878n = (Collection) obj;
                    this.f66082c.j(this);
                    y.c cVar2 = this.f58877m;
                    long j10 = this.f58873i;
                    this.f58879o = cVar2.d(this, j10, j10, this.f58874j);
                    cVar.request(Long.MAX_VALUE);
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    this.f58877m.dispose();
                    cVar.cancel();
                    EnumC8669d.error(th2, this.f66082c);
                }
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            synchronized (this) {
                this.f58878n = null;
            }
            this.f66082c.onError(th2);
            this.f58877m.dispose();
        }

        @Override // Dj.c
        public void request(long j10) {
            s(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Object obj = this.f58872h.get();
                Objects.requireNonNull(obj, "The supplied buffer is null");
                Collection collection = (Collection) obj;
                synchronized (this) {
                    Collection collection2 = this.f58878n;
                    if (collection2 != null && this.f58881q == this.f58882r) {
                        this.f58878n = collection;
                        q(collection2, false, this);
                    }
                }
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                cancel();
                this.f66082c.onError(th2);
            }
        }

        @Override // xg.d, zg.InterfaceC8760m
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public boolean g(Dj.b bVar, Collection collection) {
            bVar.h(collection);
            return true;
        }
    }

    /* renamed from: qg.c$b */
    static final class b extends xg.d implements Dj.c, Runnable, InterfaceC6043c {

        /* renamed from: h, reason: collision with root package name */
        final kg.q f58883h;

        /* renamed from: i, reason: collision with root package name */
        final long f58884i;

        /* renamed from: j, reason: collision with root package name */
        final TimeUnit f58885j;

        /* renamed from: k, reason: collision with root package name */
        final gg.y f58886k;

        /* renamed from: l, reason: collision with root package name */
        Dj.c f58887l;

        /* renamed from: m, reason: collision with root package name */
        Collection f58888m;

        /* renamed from: n, reason: collision with root package name */
        final AtomicReference f58889n;

        b(Dj.b bVar, kg.q qVar, long j10, TimeUnit timeUnit, gg.y yVar) {
            super(bVar, new C8229a());
            this.f58889n = new AtomicReference();
            this.f58883h = qVar;
            this.f58884i = j10;
            this.f58885j = timeUnit;
            this.f58886k = yVar;
        }

        @Override // Dj.b
        public void a() {
            EnumC6592b.dispose(this.f58889n);
            synchronized (this) {
                try {
                    Collection collection = this.f58888m;
                    if (collection == null) {
                        return;
                    }
                    this.f58888m = null;
                    this.f66083d.offer(collection);
                    this.f66085f = true;
                    if (i()) {
                        AbstractC8761n.b(this.f66083d, this.f66082c, false, null, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // Dj.c
        public void cancel() {
            this.f66084e = true;
            this.f58887l.cancel();
            EnumC6592b.dispose(this.f58889n);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            cancel();
        }

        @Override // Dj.b
        public void h(Object obj) {
            synchronized (this) {
                try {
                    Collection collection = this.f58888m;
                    if (collection != null) {
                        collection.add(obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f58889n.get() == EnumC6592b.DISPOSED;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58887l, cVar)) {
                this.f58887l = cVar;
                try {
                    Object obj = this.f58883h.get();
                    Objects.requireNonNull(obj, "The supplied buffer is null");
                    this.f58888m = (Collection) obj;
                    this.f66082c.j(this);
                    if (this.f66084e) {
                        return;
                    }
                    cVar.request(Long.MAX_VALUE);
                    gg.y yVar = this.f58886k;
                    long j10 = this.f58884i;
                    InterfaceC6043c interfaceC6043cG = yVar.g(this, j10, j10, this.f58885j);
                    if (r.Y.a(this.f58889n, null, interfaceC6043cG)) {
                        return;
                    }
                    interfaceC6043cG.dispose();
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    cancel();
                    EnumC8669d.error(th2, this.f66082c);
                }
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            EnumC6592b.dispose(this.f58889n);
            synchronized (this) {
                this.f58888m = null;
            }
            this.f66082c.onError(th2);
        }

        @Override // Dj.c
        public void request(long j10) {
            s(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Object obj = this.f58883h.get();
                Objects.requireNonNull(obj, "The supplied buffer is null");
                Collection collection = (Collection) obj;
                synchronized (this) {
                    try {
                        Collection collection2 = this.f58888m;
                        if (collection2 == null) {
                            return;
                        }
                        this.f58888m = collection;
                        o(collection2, false, this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                cancel();
                this.f66082c.onError(th3);
            }
        }

        @Override // xg.d, zg.InterfaceC8760m
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public boolean g(Dj.b bVar, Collection collection) {
            this.f66082c.h(collection);
            return true;
        }
    }

    /* renamed from: qg.c$c, reason: collision with other inner class name */
    static final class RunnableC2071c extends xg.d implements Dj.c, Runnable {

        /* renamed from: h, reason: collision with root package name */
        final kg.q f58890h;

        /* renamed from: i, reason: collision with root package name */
        final long f58891i;

        /* renamed from: j, reason: collision with root package name */
        final long f58892j;

        /* renamed from: k, reason: collision with root package name */
        final TimeUnit f58893k;

        /* renamed from: l, reason: collision with root package name */
        final y.c f58894l;

        /* renamed from: m, reason: collision with root package name */
        final List f58895m;

        /* renamed from: n, reason: collision with root package name */
        Dj.c f58896n;

        /* renamed from: qg.c$c$a */
        final class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            private final Collection f58897a;

            a(Collection collection) {
                this.f58897a = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC2071c.this) {
                    RunnableC2071c.this.f58895m.remove(this.f58897a);
                }
                RunnableC2071c runnableC2071c = RunnableC2071c.this;
                runnableC2071c.q(this.f58897a, false, runnableC2071c.f58894l);
            }
        }

        RunnableC2071c(Dj.b bVar, kg.q qVar, long j10, long j11, TimeUnit timeUnit, y.c cVar) {
            super(bVar, new C8229a());
            this.f58890h = qVar;
            this.f58891i = j10;
            this.f58892j = j11;
            this.f58893k = timeUnit;
            this.f58894l = cVar;
            this.f58895m = new LinkedList();
        }

        @Override // Dj.b
        public void a() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f58895m);
                this.f58895m.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f66083d.offer((Collection) it.next());
            }
            this.f66085f = true;
            if (i()) {
                AbstractC8761n.b(this.f66083d, this.f66082c, false, this.f58894l, this);
            }
        }

        @Override // Dj.c
        public void cancel() {
            this.f66084e = true;
            this.f58896n.cancel();
            this.f58894l.dispose();
            v();
        }

        @Override // Dj.b
        public void h(Object obj) {
            synchronized (this) {
                try {
                    Iterator it = this.f58895m.iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).add(obj);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.validate(this.f58896n, cVar)) {
                this.f58896n = cVar;
                try {
                    Object obj = this.f58890h.get();
                    Objects.requireNonNull(obj, "The supplied buffer is null");
                    Collection collection = (Collection) obj;
                    this.f58895m.add(collection);
                    this.f66082c.j(this);
                    cVar.request(Long.MAX_VALUE);
                    y.c cVar2 = this.f58894l;
                    long j10 = this.f58892j;
                    cVar2.d(this, j10, j10, this.f58893k);
                    this.f58894l.c(new a(collection), this.f58891i, this.f58893k);
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    this.f58894l.dispose();
                    cVar.cancel();
                    EnumC8669d.error(th2, this.f66082c);
                }
            }
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            this.f66085f = true;
            this.f58894l.dispose();
            v();
            this.f66082c.onError(th2);
        }

        @Override // Dj.c
        public void request(long j10) {
            s(j10);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f66084e) {
                return;
            }
            try {
                Object obj = this.f58890h.get();
                Objects.requireNonNull(obj, "The supplied buffer is null");
                Collection collection = (Collection) obj;
                synchronized (this) {
                    try {
                        if (this.f66084e) {
                            return;
                        }
                        this.f58895m.add(collection);
                        this.f58894l.c(new a(collection), this.f58891i, this.f58893k);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                AbstractC6152a.b(th3);
                cancel();
                this.f66082c.onError(th3);
            }
        }

        @Override // xg.d, zg.InterfaceC8760m
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public boolean g(Dj.b bVar, Collection collection) {
            bVar.h(collection);
            return true;
        }

        void v() {
            synchronized (this) {
                this.f58895m.clear();
            }
        }
    }

    public C7485c(gg.i iVar, long j10, long j11, TimeUnit timeUnit, gg.y yVar, kg.q qVar, int i10, boolean z10) {
        super(iVar);
        this.f58865c = j10;
        this.f58866d = j11;
        this.f58867e = timeUnit;
        this.f58868f = yVar;
        this.f58869g = qVar;
        this.f58870h = i10;
        this.f58871i = z10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        if (this.f58865c == this.f58866d && this.f58870h == Integer.MAX_VALUE) {
            this.f58857b.D1(new b(new Ig.a(bVar), this.f58869g, this.f58865c, this.f58867e, this.f58868f));
            return;
        }
        y.c cVarC = this.f58868f.c();
        if (this.f58865c == this.f58866d) {
            this.f58857b.D1(new a(new Ig.a(bVar), this.f58869g, this.f58865c, this.f58867e, this.f58870h, this.f58871i, cVarC));
        } else {
            this.f58857b.D1(new RunnableC2071c(new Ig.a(bVar), this.f58869g, this.f58865c, this.f58866d, this.f58867e, cVarC));
        }
    }
}
