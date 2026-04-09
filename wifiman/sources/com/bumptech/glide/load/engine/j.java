package com.bumptech.glide.load.engine;

import G2.a;
import G2.h;
import X2.a;
import android.util.Log;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class j implements l, h.a, o.a {

    /* renamed from: i, reason: collision with root package name */
    private static final boolean f34391i = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    private final p f34392a;

    /* renamed from: b, reason: collision with root package name */
    private final n f34393b;

    /* renamed from: c, reason: collision with root package name */
    private final G2.h f34394c;

    /* renamed from: d, reason: collision with root package name */
    private final b f34395d;

    /* renamed from: e, reason: collision with root package name */
    private final u f34396e;

    /* renamed from: f, reason: collision with root package name */
    private final c f34397f;

    /* renamed from: g, reason: collision with root package name */
    private final a f34398g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a f34399h;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final h.e f34400a;

        /* renamed from: b, reason: collision with root package name */
        final E1.e f34401b = X2.a.d(150, new C1197a());

        /* renamed from: c, reason: collision with root package name */
        private int f34402c;

        /* renamed from: com.bumptech.glide.load.engine.j$a$a, reason: collision with other inner class name */
        class C1197a implements a.d {
            C1197a() {
            }

            @Override // X2.a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h create() {
                a aVar = a.this;
                return new h(aVar.f34400a, aVar.f34401b);
            }
        }

        a(h.e eVar) {
            this.f34400a = eVar;
        }

        h a(com.bumptech.glide.d dVar, Object obj, m mVar, C2.e eVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, E2.a aVar, Map map, boolean z10, boolean z11, boolean z12, C2.g gVar2, h.b bVar) {
            h hVar = (h) W2.k.d((h) this.f34401b.b());
            int i12 = this.f34402c;
            this.f34402c = i12 + 1;
            return hVar.v(dVar, obj, mVar, eVar, i10, i11, cls, cls2, gVar, aVar, map, z10, z11, z12, gVar2, bVar, i12);
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final H2.a f34404a;

        /* renamed from: b, reason: collision with root package name */
        final H2.a f34405b;

        /* renamed from: c, reason: collision with root package name */
        final H2.a f34406c;

        /* renamed from: d, reason: collision with root package name */
        final H2.a f34407d;

        /* renamed from: e, reason: collision with root package name */
        final l f34408e;

        /* renamed from: f, reason: collision with root package name */
        final o.a f34409f;

        /* renamed from: g, reason: collision with root package name */
        final E1.e f34410g = X2.a.d(150, new a());

        class a implements a.d {
            a() {
            }

            @Override // X2.a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public k create() {
                b bVar = b.this;
                return new k(bVar.f34404a, bVar.f34405b, bVar.f34406c, bVar.f34407d, bVar.f34408e, bVar.f34409f, bVar.f34410g);
            }
        }

        b(H2.a aVar, H2.a aVar2, H2.a aVar3, H2.a aVar4, l lVar, o.a aVar5) {
            this.f34404a = aVar;
            this.f34405b = aVar2;
            this.f34406c = aVar3;
            this.f34407d = aVar4;
            this.f34408e = lVar;
            this.f34409f = aVar5;
        }

        k a(C2.e eVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((k) W2.k.d((k) this.f34410g.b())).l(eVar, z10, z11, z12, z13);
        }
    }

    private static class c implements h.e {

        /* renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0274a f34412a;

        /* renamed from: b, reason: collision with root package name */
        private volatile G2.a f34413b;

        c(a.InterfaceC0274a interfaceC0274a) {
            this.f34412a = interfaceC0274a;
        }

        @Override // com.bumptech.glide.load.engine.h.e
        public G2.a a() {
            if (this.f34413b == null) {
                synchronized (this) {
                    try {
                        if (this.f34413b == null) {
                            this.f34413b = this.f34412a.a();
                        }
                        if (this.f34413b == null) {
                            this.f34413b = new G2.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f34413b;
        }
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        private final k f34414a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.request.g f34415b;

        d(com.bumptech.glide.request.g gVar, k kVar) {
            this.f34415b = gVar;
            this.f34414a = kVar;
        }

        public void a() {
            synchronized (j.this) {
                this.f34414a.r(this.f34415b);
            }
        }
    }

    public j(G2.h hVar, a.InterfaceC0274a interfaceC0274a, H2.a aVar, H2.a aVar2, H2.a aVar3, H2.a aVar4, boolean z10) {
        this(hVar, interfaceC0274a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z10);
    }

    private o e(C2.e eVar) {
        E2.c cVarE = this.f34394c.e(eVar);
        if (cVarE == null) {
            return null;
        }
        return cVarE instanceof o ? (o) cVarE : new o(cVarE, true, true, eVar, this);
    }

    private o g(C2.e eVar) {
        o oVarE = this.f34399h.e(eVar);
        if (oVarE != null) {
            oVarE.b();
        }
        return oVarE;
    }

    private o h(C2.e eVar) {
        o oVarE = e(eVar);
        if (oVarE != null) {
            oVarE.b();
            this.f34399h.a(eVar, oVarE);
        }
        return oVarE;
    }

    private o i(m mVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        o oVarG = g(mVar);
        if (oVarG != null) {
            if (f34391i) {
                j("Loaded resource from active resources", j10, mVar);
            }
            return oVarG;
        }
        o oVarH = h(mVar);
        if (oVarH == null) {
            return null;
        }
        if (f34391i) {
            j("Loaded resource from cache", j10, mVar);
        }
        return oVarH;
    }

    private static void j(String str, long j10, C2.e eVar) {
        Log.v("Engine", str + " in " + W2.g.a(j10) + "ms, key: " + eVar);
    }

    private d l(com.bumptech.glide.d dVar, Object obj, C2.e eVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, E2.a aVar, Map map, boolean z10, boolean z11, C2.g gVar2, boolean z12, boolean z13, boolean z14, boolean z15, com.bumptech.glide.request.g gVar3, Executor executor, m mVar, long j10) {
        k kVarA = this.f34392a.a(mVar, z15);
        if (kVarA != null) {
            kVarA.e(gVar3, executor);
            if (f34391i) {
                j("Added to existing load", j10, mVar);
            }
            return new d(gVar3, kVarA);
        }
        k kVarA2 = this.f34395d.a(mVar, z12, z13, z14, z15);
        h hVarA = this.f34398g.a(dVar, obj, mVar, eVar, i10, i11, cls, cls2, gVar, aVar, map, z10, z11, z15, gVar2, kVarA2);
        this.f34392a.c(mVar, kVarA2);
        kVarA2.e(gVar3, executor);
        kVarA2.s(hVarA);
        if (f34391i) {
            j("Started new load", j10, mVar);
        }
        return new d(gVar3, kVarA2);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void a(k kVar, C2.e eVar, o oVar) {
        if (oVar != null) {
            try {
                if (oVar.f()) {
                    this.f34399h.a(eVar, oVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f34392a.d(eVar, kVar);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void b(k kVar, C2.e eVar) {
        this.f34392a.d(eVar, kVar);
    }

    @Override // com.bumptech.glide.load.engine.o.a
    public void c(C2.e eVar, o oVar) {
        this.f34399h.d(eVar);
        if (oVar.f()) {
            this.f34394c.c(eVar, oVar);
        } else {
            this.f34396e.a(oVar, false);
        }
    }

    @Override // G2.h.a
    public void d(E2.c cVar) {
        this.f34396e.a(cVar, true);
    }

    public d f(com.bumptech.glide.d dVar, Object obj, C2.e eVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.g gVar, E2.a aVar, Map map, boolean z10, boolean z11, C2.g gVar2, boolean z12, boolean z13, boolean z14, boolean z15, com.bumptech.glide.request.g gVar3, Executor executor) {
        long jB = f34391i ? W2.g.b() : 0L;
        m mVarA = this.f34393b.a(obj, eVar, i10, i11, map, cls, cls2, gVar2);
        synchronized (this) {
            try {
                o oVarI = i(mVarA, z12, jB);
                if (oVarI == null) {
                    return l(dVar, obj, eVar, i10, i11, cls, cls2, gVar, aVar, map, z10, z11, gVar2, z12, z13, z14, z15, gVar3, executor, mVarA, jB);
                }
                gVar3.c(oVarI, C2.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k(E2.c cVar) {
        if (!(cVar instanceof o)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((o) cVar).g();
    }

    j(G2.h hVar, a.InterfaceC0274a interfaceC0274a, H2.a aVar, H2.a aVar2, H2.a aVar3, H2.a aVar4, p pVar, n nVar, com.bumptech.glide.load.engine.a aVar5, b bVar, a aVar6, u uVar, boolean z10) {
        this.f34394c = hVar;
        c cVar = new c(interfaceC0274a);
        this.f34397f = cVar;
        com.bumptech.glide.load.engine.a aVar7 = aVar5 == null ? new com.bumptech.glide.load.engine.a(z10) : aVar5;
        this.f34399h = aVar7;
        aVar7.f(this);
        this.f34393b = nVar == null ? new n() : nVar;
        this.f34392a = pVar == null ? new p() : pVar;
        this.f34395d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f34398g = aVar6 == null ? new a(cVar) : aVar6;
        this.f34396e = uVar == null ? new u() : uVar;
        hVar.d(this);
    }
}
