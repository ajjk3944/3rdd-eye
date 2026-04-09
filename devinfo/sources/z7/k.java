package z7;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.hp;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import p.r3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements p, r {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f38049h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final z.e f38050a;

    /* renamed from: b, reason: collision with root package name */
    public final yf.a f38051b;

    /* renamed from: c, reason: collision with root package name */
    public final b8.f f38052c;

    /* renamed from: d, reason: collision with root package name */
    public final r3 f38053d;

    /* renamed from: e, reason: collision with root package name */
    public final a4.d f38054e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.common.api.internal.a0 f38055f;
    public final se.b g;

    public k(b8.f fVar, o7.d dVar, c8.e eVar, c8.e eVar2, c8.e eVar3, c8.e eVar4) throws Throwable {
        this.f38052c = fVar;
        hp hpVar = new hp(dVar);
        se.b bVar = new se.b();
        this.g = bVar;
        synchronized (this) {
            try {
                synchronized (bVar) {
                    try {
                        try {
                            bVar.f33559d = this;
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                this.f38051b = new yf.a();
                this.f38050a = new z.e();
                this.f38053d = new r3(eVar, eVar2, eVar3, eVar4, this, this);
                this.f38055f = new com.google.android.gms.common.api.internal.a0(hpVar);
                this.f38054e = new a4.d(15);
                fVar.f2079d = this;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public static void d(String str, long j, q qVar) {
        StringBuilder sbB = i3.e.b(str, " in ");
        sbB.append(t8.h.a(j));
        sbB.append("ms, key: ");
        sbB.append(qVar);
        Log.v("Engine", sbB.toString());
    }

    public static void g(y yVar) {
        if (!(yVar instanceof s)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((s) yVar).d();
    }

    public final w4.m a(com.bumptech.glide.h hVar, Object obj, x7.e eVar, int i4, int i10, Class cls, Class cls2, com.bumptech.glide.i iVar, j jVar, t8.c cVar, boolean z3, boolean z10, x7.h hVar2, boolean z11, boolean z12, p8.g gVar, ae.d dVar) {
        long jElapsedRealtimeNanos;
        if (f38049h) {
            int i11 = t8.h.f34512b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f38051b.getClass();
        q qVar = new q(obj, eVar, i4, i10, cVar, cls, cls2, hVar2);
        synchronized (this) {
            try {
                s sVarC = c(qVar, z11, jElapsedRealtimeNanos);
                if (sVarC == null) {
                    return h(hVar, obj, eVar, i4, i10, cls, cls2, iVar, jVar, cVar, z3, z10, hVar2, z11, z12, gVar, dVar, qVar, jElapsedRealtimeNanos);
                }
                gVar.j(sVarC, 5, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final s b(q qVar) throws Throwable {
        s sVar;
        Object obj;
        k kVar;
        q qVar2;
        b8.f fVar = this.f38052c;
        synchronized (fVar) {
            try {
                t8.i iVar = (t8.i) ((LinkedHashMap) fVar.f15578c).remove(qVar);
                sVar = null;
                if (iVar == null) {
                    obj = null;
                } else {
                    fVar.f15577b -= iVar.f34514b;
                    obj = iVar.f34513a;
                }
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        y yVar = (y) obj;
        if (yVar == null) {
            kVar = this;
            qVar2 = qVar;
        } else if (yVar instanceof s) {
            sVar = (s) yVar;
            kVar = this;
            qVar2 = qVar;
        } else {
            kVar = this;
            qVar2 = qVar;
            sVar = new s(yVar, true, true, qVar2, kVar);
        }
        if (sVar != null) {
            sVar.c();
            kVar.g.a(qVar2, sVar);
        }
        return sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s c(q qVar, boolean z3, long j) throws Throwable {
        s sVar;
        if (z3) {
            se.b bVar = this.g;
            synchronized (bVar) {
                a aVar = (a) ((HashMap) bVar.f33557b).get(qVar);
                if (aVar == null) {
                    sVar = null;
                } else {
                    sVar = (s) aVar.get();
                    if (sVar == null) {
                        bVar.b(aVar);
                    }
                }
            }
            if (sVar != null) {
                sVar.c();
            }
            if (sVar != null) {
                if (f38049h) {
                    d("Loaded resource from active resources", j, qVar);
                }
                return sVar;
            }
            s sVarB = b(qVar);
            if (sVarB != null) {
                if (f38049h) {
                    d("Loaded resource from cache", j, qVar);
                }
                return sVarB;
            }
        }
        return null;
    }

    public final synchronized void e(o oVar, q qVar, s sVar) {
        if (sVar != null) {
            try {
                if (sVar.f38090a) {
                    this.g.a(qVar, sVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        HashMap map = (HashMap) this.f38050a.f37798a;
        if (oVar.equals(map.get(qVar))) {
            map.remove(qVar);
        }
    }

    public final void f(x7.e eVar, s sVar) {
        se.b bVar = this.g;
        synchronized (bVar) {
            a aVar = (a) ((HashMap) bVar.f33557b).remove(eVar);
            if (aVar != null) {
                aVar.f37976c = null;
                aVar.clear();
            }
        }
        if (sVar.f38090a) {
        } else {
            this.f38054e.l(sVar, false);
        }
    }

    public final w4.m h(com.bumptech.glide.h hVar, Object obj, x7.e eVar, int i4, int i10, Class cls, Class cls2, com.bumptech.glide.i iVar, j jVar, Map map, boolean z3, boolean z10, x7.h hVar2, boolean z11, boolean z12, p8.g gVar, Executor executor, q qVar, long j) {
        o oVar = (o) ((HashMap) this.f38050a.f37798a).get(qVar);
        if (oVar != null) {
            oVar.a(gVar, executor);
            if (f38049h) {
                d("Added to existing load", j, qVar);
            }
            return new w4.m(this, gVar, oVar);
        }
        o oVar2 = (o) ((i0.f) this.f38053d.g).k();
        synchronized (oVar2) {
            oVar2.f38071k = qVar;
            oVar2.f38072l = z11;
            oVar2.f38073m = z12;
        }
        com.google.android.gms.common.api.internal.a0 a0Var = this.f38055f;
        h hVar3 = (h) ((i0.f) a0Var.f9071d).k();
        int i11 = a0Var.f9069b;
        a0Var.f9069b = i11 + 1;
        g gVar2 = hVar3.f38016a;
        hp hpVar = hVar3.f38019d;
        gVar2.f38002c = hVar;
        gVar2.f38003d = obj;
        gVar2.f38011n = eVar;
        gVar2.f38004e = i4;
        gVar2.f38005f = i10;
        gVar2.f38013p = jVar;
        gVar2.g = cls;
        gVar2.f38006h = hpVar;
        gVar2.f38008k = cls2;
        gVar2.f38012o = iVar;
        gVar2.f38007i = hVar2;
        gVar2.j = map;
        gVar2.f38014q = z3;
        gVar2.f38015r = z10;
        hVar3.f38022h = hVar;
        hVar3.f38023i = eVar;
        hVar3.j = iVar;
        hVar3.f38024k = qVar;
        hVar3.f38025l = i4;
        hVar3.f38026m = i10;
        hVar3.f38027n = jVar;
        hVar3.f38028o = hVar2;
        hVar3.f38029p = oVar2;
        hVar3.f38030q = i11;
        hVar3.F = 1;
        hVar3.f38032s = obj;
        hVar3.f38033t = hVar.f6496h;
        hVar3.f38034u = (Supplier) hVar2.c(h.H);
        z.e eVar2 = this.f38050a;
        eVar2.getClass();
        ((HashMap) eVar2.f37798a).put(qVar, oVar2);
        oVar2.a(gVar, executor);
        oVar2.k(hVar3);
        if (f38049h) {
            d("Started new load", j, qVar);
        }
        return new w4.m(this, gVar, oVar2);
    }
}
