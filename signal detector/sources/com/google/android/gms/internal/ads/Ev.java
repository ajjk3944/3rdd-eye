package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import j2.EnumC2546b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import q2.C2841s;
import q2.C2852x0;
import q2.InterfaceC2854y0;
import t2.C2911G;

/* loaded from: classes.dex */
public final class Ev {

    /* renamed from: a, reason: collision with root package name */
    public final ClientApi f8023a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8024b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8025c;

    /* renamed from: d, reason: collision with root package name */
    public final C1338iu f8026d;

    /* renamed from: e, reason: collision with root package name */
    public q2.U0 f8027e;

    /* renamed from: f, reason: collision with root package name */
    public final Av f8028f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f8029g;

    /* renamed from: h, reason: collision with root package name */
    public final q2.P f8030h;
    public final q2.Q i;

    /* renamed from: j, reason: collision with root package name */
    public final Queue f8031j;

    /* renamed from: k, reason: collision with root package name */
    public final Fv f8032k;

    /* renamed from: l, reason: collision with root package name */
    public final String f8033l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f8034m;

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f8035n;

    /* renamed from: o, reason: collision with root package name */
    public final Hu f8036o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f8037p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f8038q;

    /* renamed from: r, reason: collision with root package name */
    public C1014cu f8039r;

    /* renamed from: s, reason: collision with root package name */
    public final Q2.a f8040s;

    /* renamed from: t, reason: collision with root package name */
    public final Jv f8041t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8042u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Ev(ClientApi clientApi, Context context, int i, C1338iu c1338iu, q2.U0 u02, q2.P p6, ScheduledExecutorService scheduledExecutorService, Hu hu, Fv fv, Q2.a aVar, int i3) {
        this("none", clientApi, context, i, c1338iu, u02, scheduledExecutorService, hu, fv, aVar, (Av) null);
        this.f8042u = i3;
        this.f8030h = p6;
    }

    public final void a(C2852x0 c2852x0) {
        synchronized (this) {
            try {
                if (this.f8037p.get()) {
                    C2911G.f23576l.post(new RunnableC0786Vp(this, c2852x0, 13));
                }
                this.f8034m.set(false);
                int i = c2852x0.f23273a;
                if (i != 1 && i != 8 && i != 10 && i != 11) {
                    c(true);
                    return;
                }
                q2.U0 u02 = this.f8027e;
                int i3 = u02.f23140b;
                String str = u02.f23139a;
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 26 + String.valueOf(str).length() + 61);
                sb.append("Preloading ");
                sb.append(i3);
                sb.append(", for adUnitId:");
                sb.append(str);
                sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
                u2.k.g(sb.toString());
                this.f8029g.set(false);
                Av av = this.f8028f;
                if (av != null) {
                    av.a(this);
                }
                C1338iu c1338iu = new C1338iu(this.f8027e.f23139a, 29, q());
                c1338iu.f14824d = this.f8033l;
                Jv jv = new Jv(c1338iu);
                C1014cu c1014cu = this.f8039r;
                this.f8040s.getClass();
                c1014cu.k(System.currentTimeMillis(), jv, c2852x0, this.f8027e.f23142d, r(), f());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void b(Object obj) {
        try {
            InterfaceC2854y0 interfaceC2854y0I = i(obj);
            double d6 = !(interfaceC2854y0I instanceof BinderC1168fk) ? 0.0d : ((BinderC1168fk) interfaceC2854y0I).f14132j;
            InterfaceC2854y0 interfaceC2854y0I2 = i(obj);
            int i = interfaceC2854y0I2 instanceof BinderC1168fk ? ((BinderC1168fk) interfaceC2854y0I2).f14133k : 2;
            Q2.a aVar = this.f8040s;
            Kv kv = new Kv(obj, aVar, d6, i);
            this.f8031j.add(kv);
            InterfaceC2854y0 interfaceC2854y0I3 = i(obj);
            aVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f8037p.get()) {
                C2911G.f23576l.post(new RunnableC0786Vp(this, interfaceC2854y0I3, 12));
            }
            ScheduledExecutorService scheduledExecutorService = this.f8035n;
            scheduledExecutorService.execute(new RunnableC1021d0(this, jCurrentTimeMillis, interfaceC2854y0I3));
            if (this.f8028f != null) {
                if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8582E)).booleanValue()) {
                    scheduledExecutorService.schedule(new Lv(this, 3), kv.a(), TimeUnit.MILLISECONDS);
                    return;
                }
                Hu hu = this.f8036o;
                Lv lv = new Lv(this, 4);
                long jA = kv.a();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                hu.a(lv, jA);
                return;
            }
            if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8582E)).booleanValue()) {
                scheduledExecutorService.schedule(new Lv(this, 0), kv.a(), TimeUnit.MILLISECONDS);
                return;
            }
            Hu hu2 = this.f8036o;
            Lv lv2 = new Lv(this, 0);
            long jA2 = kv.a();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            hu2.a(lv2, jA2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z6) {
        try {
            Av av = this.f8028f;
            if (av != null) {
                if (z6) {
                    this.f8032k.c();
                }
                av.a(this);
            } else {
                Fv fv = this.f8032k;
                if (fv.d()) {
                    return;
                }
                if (z6) {
                    fv.c();
                }
                this.f8035n.schedule(new Lv(this, 0), fv.b(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        Iterator it = this.f8031j.iterator();
        while (it.hasNext()) {
            Kv kv = (Kv) it.next();
            long j6 = kv.f9580b;
            long j7 = kv.f9582d;
            kv.f9581c.getClass();
            if (System.currentTimeMillis() >= j6 + j7) {
                it.remove();
                Av av = this.f8028f;
                if (av != null) {
                    av.a(this);
                }
            }
        }
    }

    public final synchronized void e() {
        try {
            if (this.f8038q.get() && this.f8031j.isEmpty()) {
                this.f8038q.set(false);
                if (this.f8037p.get()) {
                    C2911G.f23576l.post(new Lv(this, 1));
                }
                this.f8035n.execute(new Lv(this, 2));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String f() {
        return true != "none".equals(this.f8033l) ? "2" : "1";
    }

    public final XC g(Context context) {
        switch (this.f8042u) {
            case 0:
                InterfaceC0603Lc interfaceC0603Lc = (InterfaceC0603Lc) ((AtomicReference) this.f8026d.f14824d).get();
                if (interfaceC0603Lc == null) {
                    break;
                } else {
                    q2.L lU1 = this.f8023a.U1(new S2.b(context), q2.d1.b(), this.f8027e.f23139a, interfaceC0603Lc, this.f8025c);
                    if (lU1 == null) {
                        break;
                    } else {
                        PD pd = new PD();
                        try {
                            y(this.f8027e.f23141c);
                            BinderC1607nt binderC1607nt = (BinderC1607nt) lU1;
                            binderC1607nt.w1(new Dv(this, pd, this.f8027e));
                            binderC1607nt.f0(this.f8027e.f23141c);
                            break;
                        } catch (RemoteException e6) {
                            u2.k.i("Failed to load app open ad.", e6);
                            return AbstractC1984ut.w(new Bv());
                        }
                    }
                }
            case 1:
                InterfaceC0603Lc interfaceC0603Lc2 = (InterfaceC0603Lc) ((AtomicReference) this.f8026d.f14824d).get();
                if (interfaceC0603Lc2 == null) {
                    break;
                } else {
                    q2.L lH0 = this.f8023a.H0(new S2.b(context), new q2.d1(), this.f8027e.f23139a, interfaceC0603Lc2, this.f8025c);
                    if (lH0 == null) {
                        break;
                    } else {
                        PD pd2 = new PD();
                        try {
                            y(this.f8027e.f23141c);
                            ((BinderC2252zr) lH0).x3(this.f8027e.f23141c, new Gv(this, pd2, (BinderC2252zr) lH0));
                            break;
                        } catch (RemoteException e7) {
                            u2.k.i("Failed to load interstitial ad.", e7);
                            return AbstractC1984ut.w(new Bv());
                        }
                    }
                }
            default:
                InterfaceC0603Lc interfaceC0603Lc3 = (InterfaceC0603Lc) ((AtomicReference) this.f8026d.f14824d).get();
                if (interfaceC0603Lc3 == null) {
                    break;
                } else {
                    InterfaceC0605Le interfaceC0605LeJ3 = this.f8023a.j3(new S2.b(context), this.f8027e.f23139a, interfaceC0603Lc3, this.f8025c);
                    if (interfaceC0605LeJ3 == null) {
                        break;
                    } else {
                        PD pd3 = new PD();
                        try {
                            y(this.f8027e.f23141c);
                            ((Nt) interfaceC0605LeJ3).C0(this.f8027e.f23141c, new Pv(this, pd3, (Nt) interfaceC0605LeJ3));
                            break;
                        } catch (RemoteException unused) {
                            u2.k.h("Failed to load rewarded ad.");
                            return AbstractC1984ut.w(new Bv());
                        }
                    }
                }
        }
        return AbstractC1984ut.w(new Bv());
    }

    public final long h() {
        switch (this.f8042u) {
            case 0:
                return ((Long) C2841s.f23267e.f23270c.a(H9.f8665S)).longValue();
            case 1:
                return ((Long) C2841s.f23267e.f23270c.a(H9.f8654Q)).longValue();
            default:
                return ((Long) C2841s.f23267e.f23270c.a(H9.f8659R)).longValue();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        u2.k.d("Failed to get response info for  the interstitial ad.", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        u2.k.d("Failed to get response info for the app open ad.", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
    
        u2.k.d("Failed to get response info for the rewarded ad.", r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ q2.InterfaceC2854y0 i(java.lang.Object r2) {
        /*
            r1 = this;
            int r0 = r1.f8042u
            switch(r0) {
                case 0: goto L23;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            com.google.android.gms.internal.ads.Le r2 = (com.google.android.gms.internal.ads.InterfaceC0605Le) r2
            q2.y0 r2 = r2.n()     // Catch: android.os.RemoteException -> Lc
            goto L13
        Lc:
            r2 = move-exception
            java.lang.String r0 = "Failed to get response info for the rewarded ad."
            u2.k.d(r0, r2)
            r2 = 0
        L13:
            return r2
        L14:
            q2.L r2 = (q2.L) r2
            q2.y0 r2 = r2.N()     // Catch: android.os.RemoteException -> L1b
            goto L22
        L1b:
            r2 = move-exception
            java.lang.String r0 = "Failed to get response info for  the interstitial ad."
            u2.k.d(r0, r2)
            r2 = 0
        L22:
            return r2
        L23:
            com.google.android.gms.internal.ads.g8 r2 = (com.google.android.gms.internal.ads.InterfaceC1193g8) r2
            q2.y0 r2 = r2.e()     // Catch: android.os.RemoteException -> L2a
            goto L31
        L2a:
            r2 = move-exception
            java.lang.String r0 = "Failed to get response info for the app open ad."
            u2.k.d(r0, r2)
            r2 = 0
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Ev.i(java.lang.Object):q2.y0");
    }

    public final synchronized void j() {
        this.f8035n.submit(new Lv(this, 0));
    }

    public final synchronized void k() {
        if (!this.f8034m.get() && this.f8029g.get() && this.f8031j.size() < this.f8027e.f23142d) {
            this.f8034m.set(true);
            this.f8035n.submit(new Lv(this, 5));
        }
    }

    public final synchronized boolean l() {
        try {
            E9 e9 = H9.f8620K;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                this.f8032k.a();
            }
            if (((Boolean) c2841s.f23270c.a(H9.f8575D)).booleanValue() && this.f8028f == null) {
                v();
            } else {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return !this.f8031j.isEmpty();
    }

    public final synchronized Object m() {
        try {
            E9 e9 = H9.f8636N;
            C2841s c2841s = C2841s.f23267e;
            boolean z6 = true;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                if (!((Boolean) c2841s.f23270c.a(H9.f8626L)).booleanValue() || this.f8031j.size() == 1) {
                    this.f8032k.a();
                }
            }
            if (((Boolean) c2841s.f23270c.a(H9.M)).booleanValue()) {
                d();
            }
            Queue queue = this.f8031j;
            Kv kv = (Kv) queue.poll();
            AtomicBoolean atomicBoolean = this.f8038q;
            if (kv == null) {
                z6 = false;
            }
            atomicBoolean.set(z6);
            if (kv == null) {
                kv = null;
            } else if (!queue.isEmpty()) {
                Kv kv2 = (Kv) queue.peek();
                EnumC2546b enumC2546bA = EnumC2546b.a(this.f8027e.f23140b);
                InterfaceC2854y0 interfaceC2854y0I = i(kv.f9579a);
                String str = !(interfaceC2854y0I instanceof BinderC1168fk) ? null : ((BinderC1168fk) interfaceC2854y0I).f14127d;
                if (kv2 != null && enumC2546bA != null && str != null && kv2.f9580b < kv.f9580b) {
                    C1014cu c1014cu = this.f8039r;
                    this.f8040s.getClass();
                    c1014cu.n("poll_ad", "psvroc_ts", System.currentTimeMillis(), this.f8027e.f23142d, r(), str, this.f8041t, f());
                }
            }
            Av av = this.f8028f;
            if (av != null) {
                av.b(this);
            } else {
                long jH = h();
                if (jH < 0) {
                    jH = ((Long) c2841s.f23270c.a(H9.f8648P)).longValue();
                }
                if (jH > 0) {
                    this.f8035n.schedule(new Lv(this, 0), jH, TimeUnit.MILLISECONDS);
                } else {
                    v();
                }
            }
            if (kv == null) {
                return null;
            }
            return kv.f9579a;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void n() {
        this.f8029g.set(true);
        this.f8037p.set(true);
        if (this.f8028f == null) {
            this.f8035n.submit(new Lv(this, 0));
        }
    }

    public final synchronized String o() {
        String str;
        Object objU = u();
        str = null;
        InterfaceC2854y0 interfaceC2854y0I = objU == null ? null : i(objU);
        if (interfaceC2854y0I instanceof BinderC1168fk) {
            str = ((BinderC1168fk) interfaceC2854y0I).f14127d;
        }
        return str;
    }

    public final synchronized void p(int i) {
        M2.u.a(i >= 5);
        this.f8032k.e(i);
    }

    public final EnumC2546b q() {
        return EnumC2546b.a(this.f8027e.f23140b);
    }

    public final synchronized int r() {
        return this.f8031j.size();
    }

    public final boolean s() {
        if (!this.f8029g.get() || this.f8034m.get() || r() >= this.f8027e.f23142d) {
            return false;
        }
        Fv fv = this.f8032k;
        fv.f8225f.getClass();
        return System.currentTimeMillis() >= fv.f8224e;
    }

    public final synchronized void t() {
        this.f8031j.clear();
    }

    public final synchronized Object u() {
        Kv kv = (Kv) this.f8031j.peek();
        if (kv == null) {
            return null;
        }
        return kv.f9579a;
    }

    public final synchronized void v() {
        d();
        e();
        if (!this.f8034m.get() && this.f8029g.get() && this.f8031j.size() < this.f8027e.f23142d) {
            this.f8034m.set(true);
            w();
        }
    }

    public final synchronized void w() {
        XC xcG;
        try {
            Activity activityO = p2.j.f22785C.f22794g.o();
            if (activityO == null) {
                u2.k.h("Empty activity context at preloading: ".concat(String.valueOf(this.f8027e.f23139a)));
                xcG = g(this.f8024b);
            } else {
                xcG = g(activityO);
            }
            C2255zu c2255zu = new C2255zu(2, this);
            xcG.a(new CD(xcG, 0, c2255zu), this.f8035n);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void x(int i) {
        Av av;
        M2.u.a(i > 0);
        EnumC2546b enumC2546bA = EnumC2546b.a(this.f8027e.f23140b);
        int i3 = this.f8027e.f23142d;
        int size = this.f8031j.size();
        synchronized (this) {
            try {
                q2.U0 u02 = this.f8027e;
                this.f8027e = new q2.U0(u02.f23139a, u02.f23140b, u02.f23141c, i > 0 ? i : u02.f23142d);
                Queue queue = this.f8031j;
                if (queue.size() > i) {
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8854x)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i6 = 0; i6 < i; i6++) {
                            Kv kv = (Kv) queue.poll();
                            if (kv != null) {
                                arrayList.add(kv);
                            }
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                        if (size > arrayList.size() && (av = this.f8028f) != null) {
                            int size2 = size - arrayList.size();
                            if (arrayList.isEmpty()) {
                                size2--;
                            }
                            av.c(this, size2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1014cu c1014cu = this.f8039r;
        if (c1014cu == null || enumC2546bA == null) {
            return;
        }
        this.f8040s.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.f8027e.f23139a;
        C0697Ql c0697QlA = ((C0784Vn) c1014cu.f13695b).a();
        c0697QlA.r("action", "cache_resize");
        c0697QlA.r("cs_ts", Long.toString(jCurrentTimeMillis));
        c0697QlA.r("orig_ma", Integer.toString(i3));
        c0697QlA.r("max_ads", Integer.toString(i));
        c0697QlA.r("ad_format", enumC2546bA.name().toLowerCase(Locale.ENGLISH));
        c0697QlA.r("ad_unit_id", str);
        c0697QlA.r("pid", null);
        c0697QlA.r("pv", "1");
        c0697QlA.s();
    }

    public final void y(q2.a1 a1Var) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8569C)).booleanValue()) {
            Bundle bundle = a1Var.f23164P;
            bundle.putInt("plcs", r());
            bundle.putInt("plbs", this.f8027e.f23142d);
            bundle.putString("plid", this.f8033l);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Ev(String str, ClientApi clientApi, Context context, int i, C1338iu c1338iu, q2.U0 u02, q2.Q q3, ScheduledExecutorService scheduledExecutorService, Hu hu, Fv fv, Q2.a aVar, Av av, int i3) {
        this(str, clientApi, context, i, c1338iu, u02, scheduledExecutorService, hu, fv, aVar, av);
        this.f8042u = i3;
        this.i = q3;
    }

    public Ev(String str, ClientApi clientApi, Context context, int i, C1338iu c1338iu, q2.U0 u02, ScheduledExecutorService scheduledExecutorService, Hu hu, Fv fv, Q2.a aVar, Av av) {
        Queue priorityQueue;
        this.f8033l = str;
        this.f8023a = clientApi;
        this.f8024b = context;
        this.f8025c = i;
        this.f8026d = c1338iu;
        this.f8027e = u02;
        int iMax = Math.max(1, u02.f23142d);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8693X)).booleanValue()) {
            priorityQueue = new Ov();
        } else {
            priorityQueue = new PriorityQueue(iMax, C2045w.f17383f);
        }
        this.f8031j = priorityQueue;
        this.f8029g = new AtomicBoolean(true);
        this.f8034m = new AtomicBoolean(false);
        this.f8035n = scheduledExecutorService;
        this.f8036o = hu;
        this.f8032k = fv;
        this.f8037p = new AtomicBoolean(true);
        this.f8038q = new AtomicBoolean(false);
        this.f8040s = aVar;
        C1338iu c1338iu2 = new C1338iu(u02.f23139a, 29, EnumC2546b.a(this.f8027e.f23140b));
        c1338iu2.f14824d = str;
        this.f8041t = new Jv(c1338iu2);
        this.f8028f = av;
    }
}
