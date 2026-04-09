package n1;

import b4.C0344i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class p implements I1.b {

    /* renamed from: K, reason: collision with root package name */
    public static final C0344i f22257K = new C0344i(22);

    /* renamed from: C, reason: collision with root package name */
    public int f22258C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f22259D;

    /* renamed from: E, reason: collision with root package name */
    public v f22260E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f22261F;

    /* renamed from: G, reason: collision with root package name */
    public t f22262G;

    /* renamed from: H, reason: collision with root package name */
    public i f22263H;

    /* renamed from: I, reason: collision with root package name */
    public volatile boolean f22264I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f22265J;

    /* renamed from: c, reason: collision with root package name */
    public final s f22268c;

    /* renamed from: d, reason: collision with root package name */
    public final Q.b f22269d;

    /* renamed from: f, reason: collision with root package name */
    public final q f22271f;

    /* renamed from: g, reason: collision with root package name */
    public final q1.d f22272g;

    /* renamed from: h, reason: collision with root package name */
    public final q1.d f22273h;
    public final q1.d i;

    /* renamed from: k, reason: collision with root package name */
    public r f22275k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22276l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22277m;

    /* renamed from: n, reason: collision with root package name */
    public z f22278n;

    /* renamed from: a, reason: collision with root package name */
    public final o f22266a = new o(new ArrayList(2));

    /* renamed from: b, reason: collision with root package name */
    public final I1.d f22267b = new I1.d();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f22274j = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final C0344i f22270e = f22257K;

    public p(q1.d dVar, q1.d dVar2, q1.d dVar3, q1.d dVar4, l lVar, l lVar2, V2.e eVar) {
        this.f22272g = dVar;
        this.f22273h = dVar2;
        this.i = dVar4;
        this.f22271f = lVar;
        this.f22268c = lVar2;
        this.f22269d = eVar;
    }

    public final synchronized void a(D1.f fVar, Executor executor) {
        try {
            this.f22267b.a();
            this.f22266a.f22256a.add(new n(fVar, executor));
            if (this.f22259D) {
                e(1);
                executor.execute(new m(this, fVar, 1));
            } else if (this.f22261F) {
                e(1);
                executor.execute(new m(this, fVar, 0));
            } else {
                H1.g.a("Cannot add callbacks to a cancelled EngineJob", !this.f22264I);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (f()) {
            return;
        }
        this.f22264I = true;
        i iVar = this.f22263H;
        iVar.f22216Q = true;
        g gVar = iVar.f22214O;
        if (gVar != null) {
            gVar.cancel();
        }
        q qVar = this.f22271f;
        r rVar = this.f22275k;
        l lVar = (l) qVar;
        synchronized (lVar) {
            HashMap map = lVar.f22244a.f4710a;
            if (equals(map.get(rVar))) {
                map.remove(rVar);
            }
        }
    }

    public final void c() {
        t tVar;
        synchronized (this) {
            try {
                this.f22267b.a();
                H1.g.a("Not yet complete!", f());
                int iDecrementAndGet = this.f22274j.decrementAndGet();
                H1.g.a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    tVar = this.f22262G;
                    i();
                } else {
                    tVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (tVar != null) {
            tVar.d();
        }
    }

    @Override // I1.b
    public final I1.d d() {
        return this.f22267b;
    }

    public final synchronized void e(int i) {
        t tVar;
        H1.g.a("Not yet complete!", f());
        if (this.f22274j.getAndAdd(i) == 0 && (tVar = this.f22262G) != null) {
            tVar.a();
        }
    }

    public final boolean f() {
        return this.f22261F || this.f22259D || this.f22264I;
    }

    public final void g() {
        synchronized (this) {
            try {
                this.f22267b.a();
                if (this.f22264I) {
                    i();
                    return;
                }
                if (this.f22266a.f22256a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f22261F) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f22261F = true;
                r rVar = this.f22275k;
                o oVar = this.f22266a;
                oVar.getClass();
                ArrayList arrayList = new ArrayList(oVar.f22256a);
                e(arrayList.size() + 1);
                ((l) this.f22271f).e(this, rVar, null);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    n nVar = (n) obj;
                    nVar.f22255b.execute(new m(this, nVar.f22254a, 0));
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this) {
            try {
                this.f22267b.a();
                if (this.f22264I) {
                    this.f22278n.b();
                    i();
                    return;
                }
                if (this.f22266a.f22256a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f22259D) {
                    throw new IllegalStateException("Already have resource");
                }
                C0344i c0344i = this.f22270e;
                z zVar = this.f22278n;
                boolean z6 = this.f22276l;
                r rVar = this.f22275k;
                s sVar = this.f22268c;
                c0344i.getClass();
                this.f22262G = new t(zVar, z6, true, rVar, sVar);
                this.f22259D = true;
                o oVar = this.f22266a;
                oVar.getClass();
                ArrayList arrayList = new ArrayList(oVar.f22256a);
                e(arrayList.size() + 1);
                ((l) this.f22271f).e(this, this.f22275k, this.f22262G);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    n nVar = (n) obj;
                    nVar.f22255b.execute(new m(this, nVar.f22254a, 1));
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void i() {
        if (this.f22275k == null) {
            throw new IllegalArgumentException();
        }
        this.f22266a.f22256a.clear();
        this.f22275k = null;
        this.f22262G = null;
        this.f22278n = null;
        this.f22261F = false;
        this.f22264I = false;
        this.f22259D = false;
        this.f22265J = false;
        this.f22263H.m();
        this.f22263H = null;
        this.f22260E = null;
        this.f22258C = 0;
        this.f22269d.d(this);
    }

    public final synchronized void j(D1.f fVar) {
        try {
            this.f22267b.a();
            this.f22266a.f22256a.remove(new n(fVar, H1.g.f1764b));
            if (this.f22266a.f22256a.isEmpty()) {
                b();
                if (this.f22259D || this.f22261F) {
                    if (this.f22274j.get() == 0) {
                        i();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(i iVar) {
        this.f22263H = iVar;
        int iH = iVar.h(1);
        ((iH == 2 || iH == 3) ? this.f22272g : this.f22277m ? this.i : this.f22273h).execute(iVar);
    }
}
