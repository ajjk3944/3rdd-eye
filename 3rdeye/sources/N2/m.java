package N2;

import H6.I;
import N2.c;
import N2.j;
import N7.G8;
import android.os.SystemClock;
import android.util.Log;
import h3.e;
import h3.i;
import i3.C4455a;
import java.io.File;
import java.util.HashMap;
import t4.C5606d;

/* compiled from: Engine.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f4553h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final I f4554a;

    /* renamed from: b, reason: collision with root package name */
    public final C5606d f4555b;

    /* renamed from: c, reason: collision with root package name */
    public final P2.e f4556c;

    /* renamed from: d, reason: collision with root package name */
    public final b f4557d;

    /* renamed from: e, reason: collision with root package name */
    public final x f4558e;

    /* renamed from: f, reason: collision with root package name */
    public final a f4559f;

    /* renamed from: g, reason: collision with root package name */
    public final N2.c f4560g;

    /* compiled from: Engine.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final c f4561a;

        /* renamed from: b, reason: collision with root package name */
        public final C4455a.c f4562b = C4455a.a(150, new C0079a());

        /* renamed from: c, reason: collision with root package name */
        public int f4563c;

        /* compiled from: Engine.java */
        /* renamed from: N2.m$a$a, reason: collision with other inner class name */
        public class C0079a implements C4455a.b<j<?>> {
            public C0079a() {
            }

            @Override // i3.C4455a.b
            public final j<?> a() {
                a aVar = a.this;
                return new j<>(aVar.f4561a, aVar.f4562b);
            }
        }

        public a(c cVar) {
            this.f4561a = cVar;
        }
    }

    /* compiled from: Engine.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Q2.a f4565a;

        /* renamed from: b, reason: collision with root package name */
        public final Q2.a f4566b;

        /* renamed from: c, reason: collision with root package name */
        public final Q2.a f4567c;

        /* renamed from: d, reason: collision with root package name */
        public final Q2.a f4568d;

        /* renamed from: e, reason: collision with root package name */
        public final m f4569e;

        /* renamed from: f, reason: collision with root package name */
        public final m f4570f;

        /* renamed from: g, reason: collision with root package name */
        public final C4455a.c f4571g = C4455a.a(150, new a());

        /* compiled from: Engine.java */
        public class a implements C4455a.b<n<?>> {
            public a() {
            }

            @Override // i3.C4455a.b
            public final n<?> a() {
                b bVar = b.this;
                return new n<>(bVar.f4565a, bVar.f4566b, bVar.f4567c, bVar.f4568d, bVar.f4569e, bVar.f4570f, bVar.f4571g);
            }
        }

        public b(Q2.a aVar, Q2.a aVar2, Q2.a aVar3, Q2.a aVar4, m mVar, m mVar2) {
            this.f4565a = aVar;
            this.f4566b = aVar2;
            this.f4567c = aVar3;
            this.f4568d = aVar4;
            this.f4569e = mVar;
            this.f4570f = mVar2;
        }
    }

    /* compiled from: Engine.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final H7.e f4573a;

        /* renamed from: b, reason: collision with root package name */
        public volatile P2.a f4574b;

        public c(H7.e eVar) {
            this.f4573a = eVar;
        }

        public final P2.a a() {
            if (this.f4574b == null) {
                synchronized (this) {
                    try {
                        if (this.f4574b == null) {
                            File cacheDir = ((P2.d) this.f4573a.f2291b).f10571a.getCacheDir();
                            P2.c cVar = null;
                            File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                            if (file != null && (file.isDirectory() || file.mkdirs())) {
                                cVar = new P2.c(file);
                            }
                            this.f4574b = cVar;
                        }
                        if (this.f4574b == null) {
                            this.f4574b = new A2.l(18);
                        }
                    } finally {
                    }
                }
            }
            return this.f4574b;
        }
    }

    /* compiled from: Engine.java */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final n<?> f4575a;

        /* renamed from: b, reason: collision with root package name */
        public final d3.h f4576b;

        public d(d3.h hVar, n nVar) {
            this.f4576b = hVar;
            this.f4575a = nVar;
        }
    }

    public m(P2.e eVar, H7.e eVar2, Q2.a aVar, Q2.a aVar2, Q2.a aVar3, Q2.a aVar4) throws Throwable {
        this.f4556c = eVar;
        c cVar = new c(eVar2);
        N2.c cVar2 = new N2.c();
        this.f4560g = cVar2;
        synchronized (this) {
            try {
                synchronized (cVar2) {
                    try {
                        try {
                            cVar2.f4470d = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.f4555b = new C5606d(11);
                this.f4554a = new I(4);
                this.f4557d = new b(aVar, aVar2, aVar3, aVar4, this, this);
                this.f4559f = new a(cVar);
                this.f4558e = new x();
                eVar.f10572d = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void d(String str, long j4, o oVar) {
        StringBuilder sbV = G8.v(str, " in ");
        sbV.append(h3.h.a(j4));
        sbV.append("ms, key: ");
        sbV.append(oVar);
        Log.v("Engine", sbV.toString());
    }

    public static void g(u uVar) {
        if (!(uVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) uVar).d();
    }

    public final d a(com.bumptech.glide.e eVar, Object obj, L2.f fVar, int i, int i10, Class cls, Class cls2, com.bumptech.glide.h hVar, l lVar, h3.b bVar, boolean z10, boolean z11, L2.h hVar2, boolean z12, boolean z13, d3.h hVar3, e.a aVar) {
        long jElapsedRealtimeNanos;
        if (f4553h) {
            int i11 = h3.h.f38207b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f4555b.getClass();
        o oVar = new o(obj, fVar, i, i10, bVar, cls, cls2, hVar2);
        synchronized (this) {
            try {
                p<?> pVarC = c(oVar, z12, jElapsedRealtimeNanos);
                if (pVarC == null) {
                    return h(eVar, obj, fVar, i, i10, cls, cls2, hVar, lVar, bVar, z10, z11, hVar2, z12, z13, hVar3, aVar, oVar, jElapsedRealtimeNanos);
                }
                hVar3.k(pVarC, L2.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    public final p b(o oVar) throws Throwable {
        p pVar;
        u uVar;
        m mVar;
        o oVar2;
        P2.e eVar = this.f4556c;
        synchronized (eVar) {
            try {
                i.a aVar = (i.a) eVar.f38208a.remove(oVar);
                pVar = null;
                if (aVar == null) {
                    uVar = null;
                } else {
                    eVar.f38210c -= aVar.f38212b;
                    uVar = aVar.f38211a;
                }
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        u uVar2 = uVar;
        if (uVar2 == null) {
            mVar = this;
            oVar2 = oVar;
        } else if (uVar2 instanceof p) {
            pVar = (p) uVar2;
            mVar = this;
            oVar2 = oVar;
        } else {
            mVar = this;
            oVar2 = oVar;
            pVar = new p(uVar2, true, true, oVar2, mVar);
        }
        if (pVar != null) {
            pVar.b();
            mVar.f4560g.a(oVar2, pVar);
        }
        return pVar;
    }

    public final p<?> c(o oVar, boolean z10, long j4) throws Throwable {
        p<?> pVar;
        if (z10) {
            N2.c cVar = this.f4560g;
            synchronized (cVar) {
                c.a aVar = (c.a) cVar.f4468b.get(oVar);
                if (aVar == null) {
                    pVar = null;
                } else {
                    pVar = aVar.get();
                    if (pVar == null) {
                        cVar.b(aVar);
                    }
                }
            }
            if (pVar != null) {
                pVar.b();
            }
            if (pVar != null) {
                if (f4553h) {
                    d("Loaded resource from active resources", j4, oVar);
                }
                return pVar;
            }
            p<?> pVarB = b(oVar);
            if (pVarB != null) {
                if (f4553h) {
                    d("Loaded resource from cache", j4, oVar);
                }
                return pVarB;
            }
        }
        return null;
    }

    public final synchronized void e(n nVar, o oVar, p pVar) {
        if (pVar != null) {
            try {
                if (pVar.f4615b) {
                    this.f4560g.a(oVar, pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        I i = this.f4554a;
        i.getClass();
        nVar.getClass();
        HashMap map = (HashMap) i.f2053c;
        if (nVar.equals(map.get(oVar))) {
            map.remove(oVar);
        }
    }

    public final void f(o oVar, p pVar) {
        N2.c cVar = this.f4560g;
        synchronized (cVar) {
            c.a aVar = (c.a) cVar.f4468b.remove(oVar);
            if (aVar != null) {
                aVar.f4473c = null;
                aVar.clear();
            }
        }
        if (pVar.f4615b) {
            this.f4556c.d(oVar, pVar);
        } else {
            this.f4558e.a(pVar, false);
        }
    }

    public final d h(com.bumptech.glide.e eVar, Object obj, L2.f fVar, int i, int i10, Class cls, Class cls2, com.bumptech.glide.h hVar, l lVar, h3.b bVar, boolean z10, boolean z11, L2.h hVar2, boolean z12, boolean z13, d3.h hVar3, e.a aVar, o oVar, long j4) {
        n nVar = (n) ((HashMap) this.f4554a.f2053c).get(oVar);
        if (nVar != null) {
            nVar.a(hVar3, aVar);
            if (f4553h) {
                d("Added to existing load", j4, oVar);
            }
            return new d(hVar3, nVar);
        }
        n nVar2 = (n) this.f4557d.f4571g.a();
        synchronized (nVar2) {
            nVar2.f4588l = oVar;
            nVar2.f4589m = z12;
            nVar2.f4590n = z13;
        }
        a aVar2 = this.f4559f;
        j jVar = (j) aVar2.f4562b.a();
        int i11 = aVar2.f4563c;
        aVar2.f4563c = i11 + 1;
        i<R> iVar = jVar.f4510b;
        iVar.f4489c = eVar;
        iVar.f4490d = obj;
        iVar.f4499n = fVar;
        iVar.f4491e = i;
        iVar.f4492f = i10;
        iVar.f4501p = lVar;
        iVar.f4493g = cls;
        iVar.f4494h = jVar.f4513e;
        iVar.f4496k = cls2;
        iVar.f4500o = hVar;
        iVar.i = hVar2;
        iVar.f4495j = bVar;
        iVar.f4502q = z10;
        iVar.f4503r = z11;
        jVar.i = eVar;
        jVar.f4517j = fVar;
        jVar.f4518k = hVar;
        jVar.f4519l = oVar;
        jVar.f4520m = i;
        jVar.f4521n = i10;
        jVar.f4522o = lVar;
        jVar.f4523p = hVar2;
        jVar.f4524q = nVar2;
        jVar.f4525r = i11;
        jVar.f4527t = j.e.INITIALIZE;
        jVar.f4529v = obj;
        I i12 = this.f4554a;
        i12.getClass();
        ((HashMap) i12.f2053c).put(oVar, nVar2);
        nVar2.a(hVar3, aVar);
        nVar2.k(jVar);
        if (f4553h) {
            d("Started new load", j4, oVar);
        }
        return new d(hVar3, nVar2);
    }
}
