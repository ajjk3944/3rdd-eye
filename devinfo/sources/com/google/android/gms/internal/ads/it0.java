package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.applovin.mediation.AppLovinUtils;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class it0 {

    /* renamed from: a, reason: collision with root package name */
    public final ClientApi f12427a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12428b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12429c;

    /* renamed from: d, reason: collision with root package name */
    public final pq0 f12430d;

    /* renamed from: e, reason: collision with root package name */
    public va.t2 f12431e;

    /* renamed from: f, reason: collision with root package name */
    public final et0 f12432f;
    public final AtomicBoolean g;

    /* renamed from: h, reason: collision with root package name */
    public final va.p0 f12433h;

    /* renamed from: i, reason: collision with root package name */
    public final va.q0 f12434i;
    public final Queue j;

    /* renamed from: k, reason: collision with root package name */
    public final jt0 f12435k;

    /* renamed from: l, reason: collision with root package name */
    public final String f12436l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f12437m;

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f12438n;

    /* renamed from: o, reason: collision with root package name */
    public final nr0 f12439o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f12440p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f12441q;

    /* renamed from: r, reason: collision with root package name */
    public kh0 f12442r;

    /* renamed from: s, reason: collision with root package name */
    public final tb.a f12443s;

    /* renamed from: t, reason: collision with root package name */
    public final nt0 f12444t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12445u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public it0(ClientApi clientApi, Context context, int i4, pq0 pq0Var, va.t2 t2Var, va.p0 p0Var, ScheduledExecutorService scheduledExecutorService, nr0 nr0Var, jt0 jt0Var, tb.a aVar, int i10) {
        this("none", clientApi, context, i4, pq0Var, t2Var, scheduledExecutorService, nr0Var, jt0Var, aVar, (et0) null);
        this.f12445u = i10;
        this.f12433h = p0Var;
    }

    public final void a(va.w1 w1Var) {
        synchronized (this) {
            try {
                if (this.f12440p.get()) {
                    ya.f0.f37440l.post(new uh0(this, w1Var, 12));
                }
                this.f12437m.set(false);
                int i4 = w1Var.f36177a;
                if (i4 != 1 && i4 != 8 && i4 != 10 && i4 != 11) {
                    c(true);
                    return;
                }
                va.t2 t2Var = this.f12431e;
                int i10 = t2Var.f36171b;
                String str = t2Var.f36170a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26 + String.valueOf(str).length() + 61);
                sb2.append("Preloading ");
                sb2.append(i10);
                sb2.append(", for adUnitId:");
                sb2.append(str);
                sb2.append(", Ad load failed. Stop preloading due to non-retriable error:");
                za.i.g(sb2.toString());
                this.g.set(false);
                et0 et0Var = this.f12432f;
                if (et0Var != null) {
                    et0Var.a(this);
                }
                pq0 pq0Var = new pq0(29, this.f12431e.f36170a, q());
                pq0Var.f15075d = this.f12436l;
                nt0 nt0Var = new nt0(pq0Var);
                kh0 kh0Var = this.f12442r;
                this.f12443s.getClass();
                kh0Var.B(System.currentTimeMillis(), nt0Var, w1Var, this.f12431e.f36173d, r(), f());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void b(Object obj) {
        try {
            va.x1 x1VarI = i(obj);
            double d10 = !(x1VarI instanceof c60) ? 0.0d : ((c60) x1VarI).j;
            va.x1 x1VarI2 = i(obj);
            int i4 = x1VarI2 instanceof c60 ? ((c60) x1VarI2).f10005k : 2;
            tb.a aVar = this.f12443s;
            ot0 ot0Var = new ot0(obj, aVar, d10, i4);
            this.j.add(ot0Var);
            va.x1 x1VarI3 = i(obj);
            aVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f12440p.get()) {
                ya.f0.f37440l.post(new uh0(this, x1VarI3, 11));
            }
            ScheduledExecutorService scheduledExecutorService = this.f12438n;
            scheduledExecutorService.execute(new f1(this, jCurrentTimeMillis, x1VarI3));
            if (this.f12432f != null) {
                if (!((Boolean) va.s.f36163e.f36166c.a(sk.E)).booleanValue()) {
                    scheduledExecutorService.schedule(new pt0(this, 3), ot0Var.a(), TimeUnit.MILLISECONDS);
                    return;
                }
                nr0 nr0Var = this.f12439o;
                pt0 pt0Var = new pt0(this, 4);
                long jA = ot0Var.a();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                nr0Var.a(pt0Var, jA);
                return;
            }
            if (!((Boolean) va.s.f36163e.f36166c.a(sk.E)).booleanValue()) {
                scheduledExecutorService.schedule(new pt0(this, 0), ot0Var.a(), TimeUnit.MILLISECONDS);
                return;
            }
            nr0 nr0Var2 = this.f12439o;
            pt0 pt0Var2 = new pt0(this, 0);
            long jA2 = ot0Var.a();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            nr0Var2.a(pt0Var2, jA2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(boolean z3) {
        try {
            et0 et0Var = this.f12432f;
            if (et0Var != null) {
                if (z3) {
                    this.f12435k.c();
                }
                et0Var.a(this);
            } else {
                jt0 jt0Var = this.f12435k;
                if (jt0Var.d()) {
                    return;
                }
                if (z3) {
                    jt0Var.c();
                }
                this.f12438n.schedule(new pt0(this, 0), jt0Var.b(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ot0 ot0Var = (ot0) it.next();
            long j = ot0Var.f14789b;
            long j8 = ot0Var.f14791d;
            ot0Var.f14790c.getClass();
            if (System.currentTimeMillis() >= j + j8) {
                it.remove();
                et0 et0Var = this.f12432f;
                if (et0Var != null) {
                    et0Var.a(this);
                }
            }
        }
    }

    public final synchronized void e() {
        try {
            if (this.f12441q.get() && this.j.isEmpty()) {
                this.f12441q.set(false);
                if (this.f12440p.get()) {
                    ya.f0.f37440l.post(new pt0(this, 1));
                }
                this.f12438n.execute(new pt0(this, 2));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final String f() {
        return true != "none".equals(this.f12436l) ? "2" : "1";
    }

    public final l71 g(Context context) {
        switch (this.f12445u) {
            case 0:
                ar arVar = (ar) ((AtomicReference) this.f12430d.f15075d).get();
                if (arVar == null) {
                    break;
                } else {
                    va.l0 l0VarA0 = this.f12427a.A0(new vb.b(context), va.c3.c(), this.f12431e.f36170a, arVar, this.f12429c);
                    if (l0VarA0 == null) {
                        break;
                    } else {
                        d91 d91Var = new d91();
                        try {
                            y(this.f12431e.f36172c);
                            so0 so0Var = (so0) l0VarA0;
                            so0Var.t1(new ht0(this, d91Var, this.f12431e));
                            so0Var.P(this.f12431e.f36172c);
                            break;
                        } catch (RemoteException e2) {
                            za.i.i("Failed to load app open ad.", e2);
                            return yo0.w(new ft0());
                        }
                    }
                }
            case 1:
                ar arVar2 = (ar) ((AtomicReference) this.f12430d.f15075d).get();
                if (arVar2 == null) {
                    break;
                } else {
                    va.l0 l0VarV3 = this.f12427a.V3(new vb.b(context), new va.c3(), this.f12431e.f36170a, arVar2, this.f12429c);
                    if (l0VarV3 == null) {
                        break;
                    } else {
                        d91 d91Var2 = new d91();
                        try {
                            y(this.f12431e.f36172c);
                            ((xk0) l0VarV3).Z3(this.f12431e.f36172c, new kt0(this, d91Var2, (xk0) l0VarV3));
                            break;
                        } catch (RemoteException e10) {
                            za.i.i("Failed to load interstitial ad.", e10);
                            return yo0.w(new ft0());
                        }
                    }
                }
            default:
                ar arVar3 = (ar) ((AtomicReference) this.f12430d.f15075d).get();
                if (arVar3 == null) {
                    break;
                } else {
                    cv cvVarH2 = this.f12427a.h2(new vb.b(context), this.f12431e.f36170a, arVar3, this.f12429c);
                    if (cvVarH2 == null) {
                        break;
                    } else {
                        d91 d91Var3 = new d91();
                        try {
                            y(this.f12431e.f36172c);
                            ((sp0) cvVarH2).v2(this.f12431e.f36172c, new tt0(this, d91Var3, (sp0) cvVarH2));
                            break;
                        } catch (RemoteException unused) {
                            za.i.h("Failed to load rewarded ad.");
                            return yo0.w(new ft0());
                        }
                    }
                }
        }
        return yo0.w(new ft0());
    }

    public final long h() {
        switch (this.f12445u) {
            case 0:
                return ((Long) va.s.f36163e.f36166c.a(sk.S)).longValue();
            case 1:
                return ((Long) va.s.f36163e.f36166c.a(sk.Q)).longValue();
            default:
                return ((Long) va.s.f36163e.f36166c.a(sk.R)).longValue();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        za.i.d("Failed to get response info for  the interstitial ad.", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        za.i.d("Failed to get response info for the app open ad.", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
    
        za.i.d("Failed to get response info for the rewarded ad.", r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ va.x1 i(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.f12445u
            switch(r0) {
                case 0: goto L23;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.cv r2 = (com.google.android.gms.internal.ads.cv) r2
            va.x1 r2 = r2.F1()     // Catch: android.os.RemoteException -> Lc
            goto L13
        Lc:
            r2 = move-exception
            java.lang.String r0 = "Failed to get response info for the rewarded ad."
            za.i.d(r0, r2)
            r2 = 0
        L13:
            return r2
        L14:
            va.l0 r2 = (va.l0) r2
            va.x1 r2 = r2.N1()     // Catch: android.os.RemoteException -> L1b
            goto L22
        L1b:
            r2 = move-exception
            java.lang.String r0 = "Failed to get response info for  the interstitial ad."
            za.i.d(r0, r2)
            r2 = 0
        L22:
            return r2
        L23:
            com.google.android.gms.internal.ads.rh r2 = (com.google.android.gms.internal.ads.rh) r2
            va.x1 r2 = r2.e()     // Catch: android.os.RemoteException -> L2a
            goto L31
        L2a:
            r2 = move-exception
            java.lang.String r0 = "Failed to get response info for the app open ad."
            za.i.d(r0, r2)
            r2 = 0
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.it0.i(java.lang.Object):va.x1");
    }

    public final synchronized void j() {
        this.f12438n.submit(new pt0(this, 0));
    }

    public final synchronized void k() {
        if (!this.f12437m.get() && this.g.get() && this.j.size() < this.f12431e.f36173d) {
            this.f12437m.set(true);
            this.f12438n.submit(new pt0(this, 5));
        }
    }

    public final synchronized boolean l() {
        try {
            pk pkVar = sk.K;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                this.f12435k.a();
            }
            if (((Boolean) sVar.f36166c.a(sk.D)).booleanValue() && this.f12432f == null) {
                v();
            } else {
                d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return !this.j.isEmpty();
    }

    public final synchronized Object m() {
        try {
            pk pkVar = sk.N;
            va.s sVar = va.s.f36163e;
            boolean z3 = true;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                if (!((Boolean) sVar.f36166c.a(sk.L)).booleanValue() || this.j.size() == 1) {
                    this.f12435k.a();
                }
            }
            if (((Boolean) sVar.f36166c.a(sk.M)).booleanValue()) {
                d();
            }
            Queue queue = this.j;
            ot0 ot0Var = (ot0) queue.poll();
            AtomicBoolean atomicBoolean = this.f12441q;
            if (ot0Var == null) {
                z3 = false;
            }
            atomicBoolean.set(z3);
            if (ot0Var == null) {
                ot0Var = null;
            } else if (!queue.isEmpty()) {
                ot0 ot0Var2 = (ot0) queue.peek();
                pa.b bVarA = pa.b.a(this.f12431e.f36171b);
                va.x1 x1VarI = i(ot0Var.f14788a);
                String str = !(x1VarI instanceof c60) ? null : ((c60) x1VarI).f10000d;
                if (ot0Var2 != null && bVarA != null && str != null && ot0Var2.f14789b < ot0Var.f14789b) {
                    kh0 kh0Var = this.f12442r;
                    this.f12443s.getClass();
                    kh0Var.D("poll_ad", "psvroc_ts", System.currentTimeMillis(), this.f12431e.f36173d, r(), str, this.f12444t, f());
                }
            }
            et0 et0Var = this.f12432f;
            if (et0Var != null) {
                et0Var.b(this);
            } else {
                long jH = h();
                if (jH < 0) {
                    jH = ((Long) sVar.f36166c.a(sk.P)).longValue();
                }
                if (jH > 0) {
                    this.f12438n.schedule(new pt0(this, 0), jH, TimeUnit.MILLISECONDS);
                } else {
                    v();
                }
            }
            if (ot0Var == null) {
                return null;
            }
            return ot0Var.f14788a;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void n() {
        this.g.set(true);
        this.f12440p.set(true);
        if (this.f12432f == null) {
            this.f12438n.submit(new pt0(this, 0));
        }
    }

    public final synchronized String o() {
        String str;
        Object objU = u();
        str = null;
        va.x1 x1VarI = objU == null ? null : i(objU);
        if (x1VarI instanceof c60) {
            str = ((c60) x1VarI).f10000d;
        }
        return str;
    }

    public final synchronized void p(int i4) {
        pb.y.b(i4 >= 5);
        this.f12435k.e(i4);
    }

    public final pa.b q() {
        return pa.b.a(this.f12431e.f36171b);
    }

    public final synchronized int r() {
        return this.j.size();
    }

    public final boolean s() {
        if (!this.g.get() || this.f12437m.get() || r() >= this.f12431e.f36173d) {
            return false;
        }
        jt0 jt0Var = this.f12435k;
        jt0Var.f12820f.getClass();
        return System.currentTimeMillis() >= jt0Var.f12819e;
    }

    public final synchronized void t() {
        this.j.clear();
    }

    public final synchronized Object u() {
        ot0 ot0Var = (ot0) this.j.peek();
        if (ot0Var == null) {
            return null;
        }
        return ot0Var.f14788a;
    }

    public final synchronized void v() {
        d();
        e();
        if (!this.f12437m.get() && this.g.get() && this.j.size() < this.f12431e.f36173d) {
            this.f12437m.set(true);
            w();
        }
    }

    public final synchronized void w() {
        l71 l71VarG;
        try {
            Activity activityJ = ua.j.C.g.j();
            if (activityJ == null) {
                za.i.h("Empty activity context at preloading: ".concat(String.valueOf(this.f12431e.f36170a)));
                l71VarG = g(this.f12428b);
            } else {
                l71VarG = g(activityJ);
            }
            rg0 rg0Var = new rg0(12, this);
            l71VarG.a(new q81(0, l71VarG, rg0Var), this.f12438n);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void x(int i4) {
        et0 et0Var;
        pb.y.b(i4 > 0);
        pa.b bVarA = pa.b.a(this.f12431e.f36171b);
        int i10 = this.f12431e.f36173d;
        int size = this.j.size();
        synchronized (this) {
            try {
                va.t2 t2Var = this.f12431e;
                this.f12431e = new va.t2(t2Var.f36170a, t2Var.f36171b, t2Var.f36172c, i4 > 0 ? i4 : t2Var.f36173d);
                Queue queue = this.j;
                if (queue.size() > i4) {
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.f16393x)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < i4; i11++) {
                            ot0 ot0Var = (ot0) queue.poll();
                            if (ot0Var != null) {
                                arrayList.add(ot0Var);
                            }
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                        if (size > arrayList.size() && (et0Var = this.f12432f) != null) {
                            int size2 = size - arrayList.size();
                            if (arrayList.isEmpty()) {
                                size2--;
                            }
                            et0Var.c(this, size2);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        kh0 kh0Var = this.f12442r;
        if (kh0Var == null || bVarA == null) {
            return;
        }
        this.f12443s.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.f12431e.f36170a;
        rt rtVarA = ((qd0) kh0Var.f13160b).a();
        rtVarA.u("action", "cache_resize");
        rtVarA.u("cs_ts", Long.toString(jCurrentTimeMillis));
        rtVarA.u("orig_ma", Integer.toString(i10));
        rtVarA.u("max_ads", Integer.toString(i4));
        rtVarA.u("ad_format", bVarA.name().toLowerCase(Locale.ENGLISH));
        rtVarA.u(AppLovinUtils.ServerParameterKeys.AD_UNIT_ID, str);
        rtVarA.u("pid", null);
        rtVarA.u("pv", "1");
        rtVarA.v();
    }

    public final void y(va.z2 z2Var) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.C)).booleanValue()) {
            Bundle bundle = z2Var.B;
            bundle.putInt("plcs", r());
            bundle.putInt("plbs", this.f12431e.f36173d);
            bundle.putString("plid", this.f12436l);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public it0(String str, ClientApi clientApi, Context context, int i4, pq0 pq0Var, va.t2 t2Var, va.q0 q0Var, ScheduledExecutorService scheduledExecutorService, nr0 nr0Var, jt0 jt0Var, tb.a aVar, et0 et0Var, int i10) {
        this(str, clientApi, context, i4, pq0Var, t2Var, scheduledExecutorService, nr0Var, jt0Var, aVar, et0Var);
        this.f12445u = i10;
        this.f12434i = q0Var;
    }

    public it0(String str, ClientApi clientApi, Context context, int i4, pq0 pq0Var, va.t2 t2Var, ScheduledExecutorService scheduledExecutorService, nr0 nr0Var, jt0 jt0Var, tb.a aVar, et0 et0Var) {
        Queue priorityQueue;
        this.f12436l = str;
        this.f12427a = clientApi;
        this.f12428b = context;
        this.f12429c = i4;
        this.f12430d = pq0Var;
        this.f12431e = t2Var;
        int iMax = Math.max(1, t2Var.f36173d);
        if (((Boolean) va.s.f36163e.f36166c.a(sk.X)).booleanValue()) {
            priorityQueue = new st0();
        } else {
            priorityQueue = new PriorityQueue(iMax, v.f17398f);
        }
        this.j = priorityQueue;
        this.g = new AtomicBoolean(true);
        this.f12437m = new AtomicBoolean(false);
        this.f12438n = scheduledExecutorService;
        this.f12439o = nr0Var;
        this.f12435k = jt0Var;
        this.f12440p = new AtomicBoolean(true);
        this.f12441q = new AtomicBoolean(false);
        this.f12443s = aVar;
        pq0 pq0Var2 = new pq0(29, t2Var.f36170a, pa.b.a(this.f12431e.f36171b));
        pq0Var2.f15075d = str;
        this.f12444t = new nt0(pq0Var2);
        this.f12432f = et0Var;
    }
}
