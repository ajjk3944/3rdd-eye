package v6;

import a0.x0;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import b7.r;
import b8.d;
import com.google.android.gms.internal.measurement.d5;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import km.i;
import km.n;
import km.o;
import km.y;
import nk.k;
import t6.g0;
import t6.v;
import u6.e;
import u6.h;
import x6.f;
import xk.y0;
import z6.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements e, f, u6.a {

    /* renamed from: o, reason: collision with root package name */
    public static final String f35937o = v.g("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f35938a;

    /* renamed from: c, reason: collision with root package name */
    public final a f35940c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f35941d;
    public final u6.c g;

    /* renamed from: h, reason: collision with root package name */
    public final o f35944h;

    /* renamed from: i, reason: collision with root package name */
    public final t6.b f35945i;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f35946k;

    /* renamed from: l, reason: collision with root package name */
    public final o8.b f35947l;

    /* renamed from: m, reason: collision with root package name */
    public final d7.a f35948m;

    /* renamed from: n, reason: collision with root package name */
    public final d f35949n;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f35939b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Object f35942e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final n f35943f = new n(new i(23));
    public final HashMap j = new HashMap();

    public c(Context context, t6.b bVar, l lVar, u6.c cVar, o oVar, d7.a aVar) {
        this.f35938a = context;
        y yVar = bVar.g;
        this.f35940c = new a(this, yVar, bVar.f34315d);
        k.e(yVar, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        d dVar = new d();
        dVar.f2074b = yVar;
        dVar.f2075c = oVar;
        dVar.f2073a = millis;
        dVar.f2076d = new Object();
        dVar.f2077e = new LinkedHashMap();
        this.f35949n = dVar;
        this.f35948m = aVar;
        this.f35947l = new o8.b(lVar);
        this.f35945i = bVar;
        this.g = cVar;
        this.f35944h = oVar;
    }

    @Override // x6.f
    public final void a(r rVar, x6.c cVar) {
        b7.l lVarH = d5.h(rVar);
        boolean z3 = cVar instanceof x6.a;
        o oVar = this.f35944h;
        d dVar = this.f35949n;
        String str = f35937o;
        n nVar = this.f35943f;
        if (!z3) {
            v.e().a(str, "Constraints not met: Cancelling work ID " + lVarH);
            h hVarX = nVar.x(lVarH);
            if (hVarX != null) {
                dVar.a(hVarX);
                int i4 = ((x6.b) cVar).f36978a;
                oVar.getClass();
                oVar.o(hVarX, i4);
                return;
            }
            return;
        }
        if (nVar.k(lVarH)) {
            return;
        }
        v.e().a(str, "Constraints met: Scheduling work ID " + lVarH);
        h hVarZ = nVar.z(lVarH);
        dVar.e(hVarZ);
        ((c7.l) ((x0) ((d7.a) oVar.f28446b)).f148e).execute(new oi.f(oVar, hVarZ, null, 10));
    }

    @Override // u6.e
    public final void b(r... rVarArr) {
        if (this.f35946k == null) {
            this.f35946k = Boolean.valueOf(c7.k.a(this.f35938a, this.f35945i));
        }
        if (!this.f35946k.booleanValue()) {
            v.e().f(f35937o, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f35941d) {
            this.g.a(this);
            this.f35941d = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (r rVar : rVarArr) {
            if (!this.f35943f.k(d5.h(rVar))) {
                long jMax = Math.max(rVar.a(), g(rVar));
                this.f35945i.f34315d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (rVar.f2031b == g0.f34349a) {
                    if (jCurrentTimeMillis < jMax) {
                        a aVar = this.f35940c;
                        if (aVar != null) {
                            y yVar = aVar.f35932b;
                            HashMap map = aVar.f35934d;
                            Runnable runnable = (Runnable) map.remove(rVar.f2030a);
                            if (runnable != null) {
                                ((Handler) yVar.f28522b).removeCallbacks(runnable);
                            }
                            fb.r rVar2 = new fb.r(aVar, false, rVar, 20);
                            map.put(rVar.f2030a, rVar2);
                            aVar.f35933c.getClass();
                            ((Handler) yVar.f28522b).postDelayed(rVar2, jMax - System.currentTimeMillis());
                        }
                    } else if (!k.a(t6.e.j, rVar.j)) {
                        t6.e eVar = rVar.j;
                        if (eVar.f34337d) {
                            v.e().a(f35937o, "Ignoring " + rVar + ". Requires device idle.");
                        } else if (Build.VERSION.SDK_INT < 24 || !eVar.b()) {
                            hashSet.add(rVar);
                            hashSet2.add(rVar.f2030a);
                        } else {
                            v.e().a(f35937o, "Ignoring " + rVar + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f35943f.k(d5.h(rVar))) {
                        v.e().a(f35937o, "Starting work for " + rVar.f2030a);
                        n nVar = this.f35943f;
                        nVar.getClass();
                        h hVarZ = nVar.z(d5.h(rVar));
                        this.f35949n.e(hVarZ);
                        o oVar = this.f35944h;
                        ((c7.l) ((x0) ((d7.a) oVar.f28446b)).f148e).execute(new oi.f(oVar, hVarZ, null, 10));
                    }
                }
            }
        }
        synchronized (this.f35942e) {
            try {
                if (!hashSet.isEmpty()) {
                    v.e().a(f35937o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        r rVar3 = (r) it.next();
                        b7.l lVarH = d5.h(rVar3);
                        if (!this.f35939b.containsKey(lVarH)) {
                            this.f35939b.put(lVarH, x6.i.a(this.f35947l, rVar3, (xk.r) ((x0) this.f35948m).f145b, this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u6.e
    public final boolean c() {
        return false;
    }

    @Override // u6.e
    public final void d(String str) {
        List<h> listW;
        Runnable runnable;
        String str2 = f35937o;
        if (this.f35946k == null) {
            this.f35946k = Boolean.valueOf(c7.k.a(this.f35938a, this.f35945i));
        }
        if (!this.f35946k.booleanValue()) {
            v.e().f(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f35941d) {
            this.g.a(this);
            this.f35941d = true;
        }
        v.e().a(str2, "Cancelling work ID " + str);
        a aVar = this.f35940c;
        if (aVar != null && (runnable = (Runnable) aVar.f35934d.remove(str)) != null) {
            ((Handler) aVar.f35932b.f28522b).removeCallbacks(runnable);
        }
        n nVar = this.f35943f;
        nVar.getClass();
        k.e(str, "workSpecId");
        synchronized (nVar.f28443c) {
            listW = ((i) nVar.f28442b).w(str);
        }
        for (h hVar : listW) {
            this.f35949n.a(hVar);
            o oVar = this.f35944h;
            oVar.getClass();
            oVar.o(hVar, -512);
        }
    }

    @Override // u6.a
    public final void e(b7.l lVar, boolean z3) {
        h hVarX = this.f35943f.x(lVar);
        if (hVarX != null) {
            this.f35949n.a(hVarX);
        }
        f(lVar);
        if (z3) {
            return;
        }
        synchronized (this.f35942e) {
            this.j.remove(lVar);
        }
    }

    public final void f(b7.l lVar) {
        y0 y0Var;
        synchronized (this.f35942e) {
            y0Var = (y0) this.f35939b.remove(lVar);
        }
        if (y0Var != null) {
            v.e().a(f35937o, "Stopping tracking for " + lVar);
            y0Var.e(null);
        }
    }

    public final long g(r rVar) {
        long jMax;
        synchronized (this.f35942e) {
            try {
                b7.l lVarH = d5.h(rVar);
                b bVar = (b) this.j.get(lVarH);
                if (bVar == null) {
                    int i4 = rVar.f2038k;
                    this.f35945i.f34315d.getClass();
                    bVar = new b(i4, System.currentTimeMillis());
                    this.j.put(lVarH, bVar);
                }
                jMax = (Math.max((rVar.f2038k - bVar.f35935a) - 5, 0) * 30000) + bVar.f35936b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jMax;
    }
}
