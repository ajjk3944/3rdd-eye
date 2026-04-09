package n1;

import android.os.SystemClock;
import android.util.Log;
import b4.C0344i;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import l1.InterfaceC2639e;
import o.m1;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class l implements q, s {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f22243h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final a4.n f22244a;

    /* renamed from: b, reason: collision with root package name */
    public final C0344i f22245b;

    /* renamed from: c, reason: collision with root package name */
    public final p1.c f22246c;

    /* renamed from: d, reason: collision with root package name */
    public final m1 f22247d;

    /* renamed from: e, reason: collision with root package name */
    public final P.g f22248e;

    /* renamed from: f, reason: collision with root package name */
    public final I.d f22249f;

    /* renamed from: g, reason: collision with root package name */
    public final c1.g f22250g;

    public l(p1.c cVar, d4.h hVar, q1.d dVar, q1.d dVar2, q1.d dVar3, q1.d dVar4) throws Throwable {
        this.f22246c = cVar;
        H1.h hVar2 = new H1.h(hVar);
        c1.g gVar = new c1.g(22);
        this.f22250g = gVar;
        synchronized (this) {
            try {
                try {
                    synchronized (gVar) {
                        try {
                            gVar.f5899e = this;
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
                    this.f22245b = new C0344i(23);
                    this.f22244a = new a4.n(1);
                    this.f22247d = new m1(dVar, dVar2, dVar3, dVar4, this, this);
                    this.f22249f = new I.d(hVar2);
                    this.f22248e = new P.g(7);
                    cVar.f22737d = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public static void d(String str, long j6, r rVar) {
        StringBuilder sbB = AbstractC2984e.b(str, " in ");
        sbB.append(H1.j.a(j6));
        sbB.append("ms, key: ");
        sbB.append(rVar);
        Log.v("Engine", sbB.toString());
    }

    public static void g(z zVar) {
        if (!(zVar instanceof t)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((t) zVar).d();
    }

    public final V2.e a(com.bumptech.glide.f fVar, Object obj, InterfaceC2639e interfaceC2639e, int i, int i3, Class cls, Class cls2, com.bumptech.glide.h hVar, k kVar, H1.c cVar, boolean z6, boolean z7, l1.h hVar2, boolean z8, boolean z9, D1.f fVar2, H1.f fVar3) {
        long jElapsedRealtimeNanos;
        if (f22243h) {
            int i6 = H1.j.f1768b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f22245b.getClass();
        r rVar = new r(obj, interfaceC2639e, i, i3, cVar, cls, cls2, hVar2);
        synchronized (this) {
            try {
                t tVarC = c(rVar, z8, jElapsedRealtimeNanos);
                if (tVarC == null) {
                    return h(fVar, obj, interfaceC2639e, i, i3, cls, cls2, hVar, kVar, cVar, z6, z7, hVar2, z8, z9, fVar2, fVar3, rVar, jElapsedRealtimeNanos);
                }
                fVar2.i(tVarC, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final t b(r rVar) throws Throwable {
        t tVar;
        Object obj;
        l lVar;
        r rVar2;
        p1.c cVar = this.f22246c;
        synchronized (cVar) {
            try {
                H1.k kVar = (H1.k) ((LinkedHashMap) cVar.f1773c).remove(rVar);
                tVar = null;
                if (kVar == null) {
                    obj = null;
                } else {
                    cVar.f1772b -= kVar.f1770b;
                    obj = kVar.f1769a;
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
        z zVar = (z) obj;
        if (zVar == null) {
            lVar = this;
            rVar2 = rVar;
        } else if (zVar instanceof t) {
            tVar = (t) zVar;
            lVar = this;
            rVar2 = rVar;
        } else {
            lVar = this;
            rVar2 = rVar;
            tVar = new t(zVar, true, true, rVar2, lVar);
        }
        if (tVar != null) {
            tVar.a();
            lVar.f22250g.d(rVar2, tVar);
        }
        return tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t c(r rVar, boolean z6, long j6) throws Throwable {
        t tVar;
        if (z6) {
            c1.g gVar = this.f22250g;
            synchronized (gVar) {
                C2684b c2684b = (C2684b) ((HashMap) gVar.f5897c).get(rVar);
                if (c2684b == null) {
                    tVar = null;
                } else {
                    tVar = (t) c2684b.get();
                    if (tVar == null) {
                        gVar.i(c2684b);
                    }
                }
            }
            if (tVar != null) {
                tVar.a();
            }
            if (tVar != null) {
                if (f22243h) {
                    d("Loaded resource from active resources", j6, rVar);
                }
                return tVar;
            }
            t tVarB = b(rVar);
            if (tVarB != null) {
                if (f22243h) {
                    d("Loaded resource from cache", j6, rVar);
                }
                return tVarB;
            }
        }
        return null;
    }

    public final synchronized void e(p pVar, r rVar, t tVar) {
        if (tVar != null) {
            try {
                if (tVar.f22287a) {
                    this.f22250g.d(rVar, tVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map = this.f22244a.f4710a;
        if (pVar.equals(map.get(rVar))) {
            map.remove(rVar);
        }
    }

    public final void f(InterfaceC2639e interfaceC2639e, t tVar) {
        c1.g gVar = this.f22250g;
        synchronized (gVar) {
            C2684b c2684b = (C2684b) ((HashMap) gVar.f5897c).remove(interfaceC2639e);
            if (c2684b != null) {
                c2684b.f22174c = null;
                c2684b.clear();
            }
        }
        if (tVar.f22287a) {
        } else {
            this.f22248e.f(tVar, false);
        }
    }

    public final V2.e h(com.bumptech.glide.f fVar, Object obj, InterfaceC2639e interfaceC2639e, int i, int i3, Class cls, Class cls2, com.bumptech.glide.h hVar, k kVar, Map map, boolean z6, boolean z7, l1.h hVar2, boolean z8, boolean z9, D1.f fVar2, Executor executor, r rVar, long j6) {
        p pVar = (p) this.f22244a.f4710a.get(rVar);
        if (pVar != null) {
            pVar.a(fVar2, executor);
            if (f22243h) {
                d("Added to existing load", j6, rVar);
            }
            return new V2.e(this, fVar2, pVar);
        }
        p pVar2 = (p) ((V2.e) this.f22247d.f22588h).h();
        synchronized (pVar2) {
            pVar2.f22275k = rVar;
            pVar2.f22276l = z8;
            pVar2.f22277m = z9;
        }
        I.d dVar = this.f22249f;
        i iVar = (i) ((V2.e) dVar.f1852d).h();
        int i6 = dVar.f1850b;
        dVar.f1850b = i6 + 1;
        h hVar3 = iVar.f22221a;
        H1.h hVar4 = iVar.f22224d;
        hVar3.f22187c = fVar;
        hVar3.f22188d = obj;
        hVar3.f22197n = interfaceC2639e;
        hVar3.f22189e = i;
        hVar3.f22190f = i3;
        hVar3.f22199p = kVar;
        hVar3.f22191g = cls;
        hVar3.f22192h = hVar4;
        hVar3.f22194k = cls2;
        hVar3.f22198o = hVar;
        hVar3.i = hVar2;
        hVar3.f22193j = map;
        hVar3.f22200q = z6;
        hVar3.f22201r = z7;
        iVar.f22228h = fVar;
        iVar.i = interfaceC2639e;
        iVar.f22229j = hVar;
        iVar.f22230k = rVar;
        iVar.f22231l = i;
        iVar.f22232m = i3;
        iVar.f22233n = kVar;
        iVar.f22203C = hVar2;
        iVar.f22204D = pVar2;
        iVar.f22205E = i6;
        iVar.f22219T = 1;
        iVar.f22207G = obj;
        iVar.f22208H = fVar.f6505h;
        iVar.f22209I = (Supplier) hVar2.c(i.f22202V);
        a4.n nVar = this.f22244a;
        nVar.getClass();
        nVar.f4710a.put(rVar, pVar2);
        pVar2.a(fVar2, executor);
        pVar2.k(iVar);
        if (f22243h) {
            d("Started new load", j6, rVar);
        }
        return new V2.e(this, fVar2, pVar2);
    }
}
