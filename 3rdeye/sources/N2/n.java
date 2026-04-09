package N2;

import H6.I;
import N2.j;
import h3.e;
import i3.C4455a;
import i3.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import t4.C5606d;

/* compiled from: EngineJob.java */
/* loaded from: classes.dex */
public final class n<R> implements C4455a.d {

    /* renamed from: x, reason: collision with root package name */
    public static final c f4578x = new c();

    /* renamed from: b, reason: collision with root package name */
    public final e f4579b;

    /* renamed from: c, reason: collision with root package name */
    public final d.a f4580c;

    /* renamed from: d, reason: collision with root package name */
    public final m f4581d;

    /* renamed from: e, reason: collision with root package name */
    public final C4455a.c f4582e;

    /* renamed from: f, reason: collision with root package name */
    public final c f4583f;

    /* renamed from: g, reason: collision with root package name */
    public final m f4584g;

    /* renamed from: h, reason: collision with root package name */
    public final Q2.a f4585h;
    public final Q2.a i;

    /* renamed from: j, reason: collision with root package name */
    public final Q2.a f4586j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f4587k;

    /* renamed from: l, reason: collision with root package name */
    public o f4588l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4589m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4590n;

    /* renamed from: o, reason: collision with root package name */
    public u<?> f4591o;

    /* renamed from: p, reason: collision with root package name */
    public L2.a f4592p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4593q;

    /* renamed from: r, reason: collision with root package name */
    public q f4594r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4595s;

    /* renamed from: t, reason: collision with root package name */
    public p<?> f4596t;

    /* renamed from: u, reason: collision with root package name */
    public j<R> f4597u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f4598v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4599w;

    /* compiled from: EngineJob.java */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final d3.h f4600b;

        public a(d3.h hVar) {
            this.f4600b = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d3.h hVar = this.f4600b;
            hVar.f37396b.a();
            synchronized (hVar.f37397c) {
                synchronized (n.this) {
                    try {
                        e eVar = n.this.f4579b;
                        d3.h hVar2 = this.f4600b;
                        eVar.getClass();
                        if (eVar.f4606b.contains(new d(hVar2, h3.e.f38203b))) {
                            n nVar = n.this;
                            d3.h hVar3 = this.f4600b;
                            nVar.getClass();
                            try {
                                hVar3.i(nVar.f4594r, 5);
                            } catch (Throwable th) {
                                throw new N2.d(th);
                            }
                        }
                        n.this.d();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final d3.h f4602b;

        public b(d3.h hVar) {
            this.f4602b = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d3.h hVar = this.f4602b;
            hVar.f37396b.a();
            synchronized (hVar.f37397c) {
                synchronized (n.this) {
                    try {
                        e eVar = n.this.f4579b;
                        d3.h hVar2 = this.f4602b;
                        eVar.getClass();
                        if (eVar.f4606b.contains(new d(hVar2, h3.e.f38203b))) {
                            n.this.f4596t.b();
                            n nVar = n.this;
                            d3.h hVar3 = this.f4602b;
                            nVar.getClass();
                            try {
                                hVar3.k(nVar.f4596t, nVar.f4592p, nVar.f4599w);
                                n.this.j(this.f4602b);
                            } catch (Throwable th) {
                                throw new N2.d(th);
                            }
                        }
                        n.this.d();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    public static class c {
    }

    /* compiled from: EngineJob.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final d3.h f4604a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f4605b;

        public d(d3.h hVar, Executor executor) {
            this.f4604a = hVar;
            this.f4605b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f4604a.equals(((d) obj).f4604a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f4604a.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    public static final class e implements Iterable<d> {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f4606b;

        public e(ArrayList arrayList) {
            this.f4606b = arrayList;
        }

        @Override // java.lang.Iterable
        public final Iterator<d> iterator() {
            return this.f4606b.iterator();
        }
    }

    public n() {
        throw null;
    }

    public n(Q2.a aVar, Q2.a aVar2, Q2.a aVar3, Q2.a aVar4, m mVar, m mVar2, C4455a.c cVar) {
        c cVar2 = f4578x;
        this.f4579b = new e(new ArrayList(2));
        this.f4580c = new d.a();
        this.f4587k = new AtomicInteger();
        this.f4585h = aVar;
        this.i = aVar2;
        this.f4586j = aVar4;
        this.f4584g = mVar;
        this.f4581d = mVar2;
        this.f4582e = cVar;
        this.f4583f = cVar2;
    }

    public final synchronized void a(d3.h hVar, e.a aVar) {
        try {
            this.f4580c.a();
            e eVar = this.f4579b;
            eVar.getClass();
            eVar.f4606b.add(new d(hVar, aVar));
            if (this.f4593q) {
                e(1);
                b bVar = new b(hVar);
                aVar.getClass();
                h3.l.j(bVar);
            } else if (this.f4595s) {
                e(1);
                a aVar2 = new a(hVar);
                aVar.getClass();
                h3.l.j(aVar2);
            } else {
                C5606d.i("Cannot add callbacks to a cancelled EngineJob", !this.f4598v);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // i3.C4455a.d
    public final d.a b() {
        return this.f4580c;
    }

    public final void c() {
        if (f()) {
            return;
        }
        this.f4598v = true;
        j<R> jVar = this.f4597u;
        jVar.f4508E = true;
        h hVar = jVar.f4506C;
        if (hVar != null) {
            hVar.cancel();
        }
        m mVar = this.f4584g;
        o oVar = this.f4588l;
        synchronized (mVar) {
            I i = mVar.f4554a;
            i.getClass();
            HashMap map = (HashMap) i.f2053c;
            if (equals(map.get(oVar))) {
                map.remove(oVar);
            }
        }
    }

    public final void d() {
        p<?> pVar;
        synchronized (this) {
            try {
                this.f4580c.a();
                C5606d.i("Not yet complete!", f());
                int iDecrementAndGet = this.f4587k.decrementAndGet();
                C5606d.i("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    pVar = this.f4596t;
                    i();
                } else {
                    pVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pVar != null) {
            pVar.d();
        }
    }

    public final synchronized void e(int i) {
        p<?> pVar;
        C5606d.i("Not yet complete!", f());
        if (this.f4587k.getAndAdd(i) == 0 && (pVar = this.f4596t) != null) {
            pVar.b();
        }
    }

    public final boolean f() {
        return this.f4595s || this.f4593q || this.f4598v;
    }

    public final void g() {
        synchronized (this) {
            try {
                this.f4580c.a();
                if (this.f4598v) {
                    i();
                    return;
                }
                if (this.f4579b.f4606b.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f4595s) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f4595s = true;
                o oVar = this.f4588l;
                e eVar = this.f4579b;
                eVar.getClass();
                ArrayList arrayList = new ArrayList(eVar.f4606b);
                e(arrayList.size() + 1);
                this.f4584g.e(this, oVar, null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f4605b.execute(new a(dVar.f4604a));
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this) {
            try {
                this.f4580c.a();
                if (this.f4598v) {
                    this.f4591o.a();
                    i();
                    return;
                }
                if (this.f4579b.f4606b.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f4593q) {
                    throw new IllegalStateException("Already have resource");
                }
                c cVar = this.f4583f;
                u<?> uVar = this.f4591o;
                boolean z10 = this.f4589m;
                o oVar = this.f4588l;
                m mVar = this.f4581d;
                cVar.getClass();
                this.f4596t = new p<>(uVar, z10, true, oVar, mVar);
                this.f4593q = true;
                e eVar = this.f4579b;
                eVar.getClass();
                ArrayList arrayList = new ArrayList(eVar.f4606b);
                e(arrayList.size() + 1);
                this.f4584g.e(this, this.f4588l, this.f4596t);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.f4605b.execute(new b(dVar.f4604a));
                }
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void i() {
        if (this.f4588l == null) {
            throw new IllegalArgumentException();
        }
        this.f4579b.f4606b.clear();
        this.f4588l = null;
        this.f4596t = null;
        this.f4591o = null;
        this.f4595s = false;
        this.f4598v = false;
        this.f4593q = false;
        this.f4599w = false;
        this.f4597u.m();
        this.f4597u = null;
        this.f4594r = null;
        this.f4592p = null;
        this.f4582e.b(this);
    }

    public final synchronized void j(d3.h hVar) {
        try {
            this.f4580c.a();
            e eVar = this.f4579b;
            eVar.f4606b.remove(new d(hVar, h3.e.f38203b));
            if (this.f4579b.f4606b.isEmpty()) {
                c();
                if (this.f4593q || this.f4595s) {
                    if (this.f4587k.get() == 0) {
                        i();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(j<R> jVar) {
        this.f4597u = jVar;
        j.f fVarH = jVar.h(j.f.INITIALIZE);
        ((fVarH == j.f.RESOURCE_CACHE || fVarH == j.f.DATA_CACHE) ? this.f4585h : this.f4590n ? this.f4586j : this.i).execute(jVar);
    }
}
