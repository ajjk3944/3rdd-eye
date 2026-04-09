package com.bumptech.glide.load.engine;

import X2.a;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class k implements h.b, a.f {

    /* renamed from: z, reason: collision with root package name */
    private static final c f34417z = new c();

    /* renamed from: a, reason: collision with root package name */
    final e f34418a;

    /* renamed from: b, reason: collision with root package name */
    private final X2.c f34419b;

    /* renamed from: c, reason: collision with root package name */
    private final o.a f34420c;

    /* renamed from: d, reason: collision with root package name */
    private final E1.e f34421d;

    /* renamed from: e, reason: collision with root package name */
    private final c f34422e;

    /* renamed from: f, reason: collision with root package name */
    private final l f34423f;

    /* renamed from: g, reason: collision with root package name */
    private final H2.a f34424g;

    /* renamed from: h, reason: collision with root package name */
    private final H2.a f34425h;

    /* renamed from: i, reason: collision with root package name */
    private final H2.a f34426i;

    /* renamed from: j, reason: collision with root package name */
    private final H2.a f34427j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f34428k;

    /* renamed from: l, reason: collision with root package name */
    private C2.e f34429l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f34430m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f34431n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f34432o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f34433p;

    /* renamed from: q, reason: collision with root package name */
    private E2.c f34434q;

    /* renamed from: r, reason: collision with root package name */
    C2.a f34435r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f34436s;

    /* renamed from: t, reason: collision with root package name */
    GlideException f34437t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f34438u;

    /* renamed from: v, reason: collision with root package name */
    o f34439v;

    /* renamed from: w, reason: collision with root package name */
    private h f34440w;

    /* renamed from: x, reason: collision with root package name */
    private volatile boolean f34441x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f34442y;

    private class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.request.g f34443a;

        a(com.bumptech.glide.request.g gVar) {
            this.f34443a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f34443a.h()) {
                synchronized (k.this) {
                    try {
                        if (k.this.f34418a.e(this.f34443a)) {
                            k.this.f(this.f34443a);
                        }
                        k.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    private class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.request.g f34445a;

        b(com.bumptech.glide.request.g gVar) {
            this.f34445a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f34445a.h()) {
                synchronized (k.this) {
                    try {
                        if (k.this.f34418a.e(this.f34445a)) {
                            k.this.f34439v.b();
                            k.this.g(this.f34445a);
                            k.this.r(this.f34445a);
                        }
                        k.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    static class c {
        c() {
        }

        public o a(E2.c cVar, boolean z10, C2.e eVar, o.a aVar) {
            return new o(cVar, z10, true, eVar, aVar);
        }
    }

    static final class d {

        /* renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.request.g f34447a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f34448b;

        d(com.bumptech.glide.request.g gVar, Executor executor) {
            this.f34447a = gVar;
            this.f34448b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f34447a.equals(((d) obj).f34447a);
            }
            return false;
        }

        public int hashCode() {
            return this.f34447a.hashCode();
        }
    }

    static final class e implements Iterable {

        /* renamed from: a, reason: collision with root package name */
        private final List f34449a;

        e() {
            this(new ArrayList(2));
        }

        private static d g(com.bumptech.glide.request.g gVar) {
            return new d(gVar, W2.e.a());
        }

        void b(com.bumptech.glide.request.g gVar, Executor executor) {
            this.f34449a.add(new d(gVar, executor));
        }

        void clear() {
            this.f34449a.clear();
        }

        boolean e(com.bumptech.glide.request.g gVar) {
            return this.f34449a.contains(g(gVar));
        }

        e f() {
            return new e(new ArrayList(this.f34449a));
        }

        void i(com.bumptech.glide.request.g gVar) {
            this.f34449a.remove(g(gVar));
        }

        boolean isEmpty() {
            return this.f34449a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f34449a.iterator();
        }

        int size() {
            return this.f34449a.size();
        }

        e(List list) {
            this.f34449a = list;
        }
    }

    k(H2.a aVar, H2.a aVar2, H2.a aVar3, H2.a aVar4, l lVar, o.a aVar5, E1.e eVar) {
        this(aVar, aVar2, aVar3, aVar4, lVar, aVar5, eVar, f34417z);
    }

    private H2.a j() {
        return this.f34431n ? this.f34426i : this.f34432o ? this.f34427j : this.f34425h;
    }

    private boolean m() {
        return this.f34438u || this.f34436s || this.f34441x;
    }

    private synchronized void q() {
        if (this.f34429l == null) {
            throw new IllegalArgumentException();
        }
        this.f34418a.clear();
        this.f34429l = null;
        this.f34439v = null;
        this.f34434q = null;
        this.f34438u = false;
        this.f34441x = false;
        this.f34436s = false;
        this.f34442y = false;
        this.f34440w.J(false);
        this.f34440w = null;
        this.f34437t = null;
        this.f34435r = null;
        this.f34421d.a(this);
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void a(GlideException glideException) {
        synchronized (this) {
            this.f34437t = glideException;
        }
        n();
    }

    @Override // X2.a.f
    public X2.c b() {
        return this.f34419b;
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void c(E2.c cVar, C2.a aVar, boolean z10) {
        synchronized (this) {
            this.f34434q = cVar;
            this.f34435r = aVar;
            this.f34442y = z10;
        }
        o();
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void d(h hVar) {
        j().execute(hVar);
    }

    synchronized void e(com.bumptech.glide.request.g gVar, Executor executor) {
        try {
            this.f34419b.c();
            this.f34418a.b(gVar, executor);
            if (this.f34436s) {
                k(1);
                executor.execute(new b(gVar));
            } else if (this.f34438u) {
                k(1);
                executor.execute(new a(gVar));
            } else {
                W2.k.a(!this.f34441x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void f(com.bumptech.glide.request.g gVar) {
        try {
            gVar.a(this.f34437t);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    void g(com.bumptech.glide.request.g gVar) {
        try {
            gVar.c(this.f34439v, this.f34435r, this.f34442y);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    void h() {
        if (m()) {
            return;
        }
        this.f34441x = true;
        this.f34440w.g();
        this.f34423f.b(this, this.f34429l);
    }

    void i() {
        o oVar;
        synchronized (this) {
            try {
                this.f34419b.c();
                W2.k.a(m(), "Not yet complete!");
                int iDecrementAndGet = this.f34428k.decrementAndGet();
                W2.k.a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    oVar = this.f34439v;
                    q();
                } else {
                    oVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (oVar != null) {
            oVar.g();
        }
    }

    synchronized void k(int i10) {
        o oVar;
        W2.k.a(m(), "Not yet complete!");
        if (this.f34428k.getAndAdd(i10) == 0 && (oVar = this.f34439v) != null) {
            oVar.b();
        }
    }

    synchronized k l(C2.e eVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f34429l = eVar;
        this.f34430m = z10;
        this.f34431n = z11;
        this.f34432o = z12;
        this.f34433p = z13;
        return this;
    }

    void n() {
        synchronized (this) {
            try {
                this.f34419b.c();
                if (this.f34441x) {
                    q();
                    return;
                }
                if (this.f34418a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f34438u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f34438u = true;
                C2.e eVar = this.f34429l;
                e eVarF = this.f34418a.f();
                k(eVarF.size() + 1);
                this.f34423f.a(this, eVar, null);
                Iterator it = eVarF.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f34448b.execute(new a(dVar.f34447a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void o() {
        synchronized (this) {
            try {
                this.f34419b.c();
                if (this.f34441x) {
                    this.f34434q.c();
                    q();
                    return;
                }
                if (this.f34418a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f34436s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f34439v = this.f34422e.a(this.f34434q, this.f34430m, this.f34429l, this.f34420c);
                this.f34436s = true;
                e eVarF = this.f34418a.f();
                k(eVarF.size() + 1);
                this.f34423f.a(this, this.f34429l, this.f34439v);
                Iterator it = eVarF.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f34448b.execute(new b(dVar.f34447a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean p() {
        return this.f34433p;
    }

    synchronized void r(com.bumptech.glide.request.g gVar) {
        try {
            this.f34419b.c();
            this.f34418a.i(gVar);
            if (this.f34418a.isEmpty()) {
                h();
                if (this.f34436s || this.f34438u) {
                    if (this.f34428k.get() == 0) {
                        q();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void s(h hVar) {
        try {
            this.f34440w = hVar;
            (hVar.W() ? this.f34424g : j()).execute(hVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    k(H2.a aVar, H2.a aVar2, H2.a aVar3, H2.a aVar4, l lVar, o.a aVar5, E1.e eVar, c cVar) {
        this.f34418a = new e();
        this.f34419b = X2.c.a();
        this.f34428k = new AtomicInteger();
        this.f34424g = aVar;
        this.f34425h = aVar2;
        this.f34426i = aVar3;
        this.f34427j = aVar4;
        this.f34423f = lVar;
        this.f34420c = aVar5;
        this.f34421d = eVar;
        this.f34422e = cVar;
    }
}
