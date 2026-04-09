package z7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o implements u8.b {

    /* renamed from: w, reason: collision with root package name */
    public static final yb.f f38062w = new yb.f();

    /* renamed from: c, reason: collision with root package name */
    public final r f38065c;

    /* renamed from: d, reason: collision with root package name */
    public final d4.c f38066d;

    /* renamed from: f, reason: collision with root package name */
    public final p f38068f;
    public final c8.e g;

    /* renamed from: h, reason: collision with root package name */
    public final c8.e f38069h;

    /* renamed from: i, reason: collision with root package name */
    public final c8.e f38070i;

    /* renamed from: k, reason: collision with root package name */
    public q f38071k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f38072l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f38073m;

    /* renamed from: n, reason: collision with root package name */
    public y f38074n;

    /* renamed from: o, reason: collision with root package name */
    public int f38075o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f38076p;

    /* renamed from: q, reason: collision with root package name */
    public u f38077q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f38078r;

    /* renamed from: s, reason: collision with root package name */
    public s f38079s;

    /* renamed from: t, reason: collision with root package name */
    public h f38080t;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f38081u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f38082v;

    /* renamed from: a, reason: collision with root package name */
    public final n f38063a = new n(new ArrayList(2));

    /* renamed from: b, reason: collision with root package name */
    public final u8.e f38064b = new u8.e();
    public final AtomicInteger j = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final yb.f f38067e = f38062w;

    public o(c8.e eVar, c8.e eVar2, c8.e eVar3, c8.e eVar4, k kVar, k kVar2, i0.f fVar) {
        this.g = eVar;
        this.f38069h = eVar2;
        this.f38070i = eVar4;
        this.f38068f = kVar;
        this.f38065c = kVar2;
        this.f38066d = fVar;
    }

    public final synchronized void a(p8.g gVar, Executor executor) {
        try {
            this.f38064b.a();
            this.f38063a.f38061a.add(new m(gVar, executor));
            if (this.f38076p) {
                e(1);
                executor.execute(new l(this, gVar, 1));
            } else if (this.f38078r) {
                e(1);
                executor.execute(new l(this, gVar, 0));
            } else {
                t8.f.a("Cannot add callbacks to a cancelled EngineJob", !this.f38081u);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b() {
        if (f()) {
            return;
        }
        this.f38081u = true;
        h hVar = this.f38080t;
        hVar.C = true;
        f fVar = hVar.A;
        if (fVar != null) {
            fVar.cancel();
        }
        p pVar = this.f38068f;
        q qVar = this.f38071k;
        k kVar = (k) pVar;
        synchronized (kVar) {
            HashMap map = (HashMap) kVar.f38050a.f37798a;
            if (equals(map.get(qVar))) {
                map.remove(qVar);
            }
        }
    }

    public final void c() {
        s sVar;
        synchronized (this) {
            try {
                this.f38064b.a();
                t8.f.a("Not yet complete!", f());
                int iDecrementAndGet = this.j.decrementAndGet();
                t8.f.a("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    sVar = this.f38079s;
                    i();
                } else {
                    sVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (sVar != null) {
            sVar.d();
        }
    }

    @Override // u8.b
    public final u8.e d() {
        return this.f38064b;
    }

    public final synchronized void e(int i4) {
        s sVar;
        t8.f.a("Not yet complete!", f());
        if (this.j.getAndAdd(i4) == 0 && (sVar = this.f38079s) != null) {
            sVar.c();
        }
    }

    public final boolean f() {
        return this.f38078r || this.f38076p || this.f38081u;
    }

    public final void g() {
        synchronized (this) {
            try {
                this.f38064b.a();
                if (this.f38081u) {
                    i();
                    return;
                }
                if (this.f38063a.f38061a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f38078r) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f38078r = true;
                q qVar = this.f38071k;
                n nVar = this.f38063a;
                nVar.getClass();
                ArrayList arrayList = new ArrayList(nVar.f38061a);
                e(arrayList.size() + 1);
                ((k) this.f38068f).e(this, qVar, null);
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    m mVar = (m) obj;
                    mVar.f38060b.execute(new l(this, mVar.f38059a, 0));
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        synchronized (this) {
            try {
                this.f38064b.a();
                if (this.f38081u) {
                    this.f38074n.a();
                    i();
                    return;
                }
                if (this.f38063a.f38061a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f38076p) {
                    throw new IllegalStateException("Already have resource");
                }
                yb.f fVar = this.f38067e;
                y yVar = this.f38074n;
                boolean z3 = this.f38072l;
                q qVar = this.f38071k;
                r rVar = this.f38065c;
                fVar.getClass();
                this.f38079s = new s(yVar, z3, true, qVar, rVar);
                this.f38076p = true;
                n nVar = this.f38063a;
                nVar.getClass();
                ArrayList arrayList = new ArrayList(nVar.f38061a);
                e(arrayList.size() + 1);
                ((k) this.f38068f).e(this, this.f38071k, this.f38079s);
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    m mVar = (m) obj;
                    mVar.f38060b.execute(new l(this, mVar.f38059a, 1));
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void i() {
        if (this.f38071k == null) {
            throw new IllegalArgumentException();
        }
        this.f38063a.f38061a.clear();
        this.f38071k = null;
        this.f38079s = null;
        this.f38074n = null;
        this.f38078r = false;
        this.f38081u = false;
        this.f38076p = false;
        this.f38082v = false;
        this.f38080t.m();
        this.f38080t = null;
        this.f38077q = null;
        this.f38075o = 0;
        this.f38066d.i(this);
    }

    public final synchronized void j(p8.g gVar) {
        try {
            this.f38064b.a();
            this.f38063a.f38061a.remove(new m(gVar, t8.f.f34510b));
            if (this.f38063a.f38061a.isEmpty()) {
                b();
                if (this.f38076p || this.f38078r) {
                    if (this.j.get() == 0) {
                        i();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void k(h hVar) {
        this.f38080t = hVar;
        int iH = hVar.h(1);
        ((iH == 2 || iH == 3) ? this.g : this.f38073m ? this.f38070i : this.f38069h).execute(hVar);
    }
}
