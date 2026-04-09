package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gt0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11601a;

    /* renamed from: b, reason: collision with root package name */
    public final rt0 f11602b;

    /* renamed from: c, reason: collision with root package name */
    public final kh0 f11603c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f11604d;

    /* renamed from: e, reason: collision with root package name */
    public volatile ConnectivityManager f11605e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f11606f = new AtomicBoolean(false);
    public final tb.a g;

    /* renamed from: h, reason: collision with root package name */
    public AtomicInteger f11607h;

    /* renamed from: i, reason: collision with root package name */
    public final et0 f11608i;

    public gt0(rt0 rt0Var, kh0 kh0Var, Context context, tb.a aVar, et0 et0Var) {
        HashMap map = new HashMap();
        this.f11601a = map;
        map.put(pa.b.APP_OPEN_AD, new HashMap());
        map.put(pa.b.INTERSTITIAL, new HashMap());
        map.put(pa.b.REWARDED, new HashMap());
        this.f11602b = rt0Var;
        this.f11603c = kh0Var;
        this.f11604d = context;
        this.g = aVar;
        this.f11608i = et0Var;
    }

    public final synchronized boolean a(String str, va.t2 t2Var, va.q0 q0Var) {
        it0 it0VarB;
        try {
        } catch (RuntimeException e2) {
            za.i.i("Failed to register network callback", e2);
            this.f11607h = new AtomicInteger(((Integer) va.s.f36163e.f36166c.a(sk.I)).intValue());
        } finally {
        }
        if (!this.f11606f.getAndSet(true)) {
            if (this.f11605e == null) {
                synchronized (this) {
                    if (this.f11605e == null) {
                        try {
                            this.f11605e = (ConnectivityManager) this.f11604d.getSystemService("connectivity");
                        } catch (ClassCastException e10) {
                            za.i.i("Failed to get connectivity manager", e10);
                        }
                    }
                }
            }
            if (!tb.b.g() || this.f11605e == null) {
                this.f11607h = new AtomicInteger(((Integer) va.s.f36163e.f36166c.a(sk.I)).intValue());
            } else {
                this.f11605e.registerDefaultNetworkCallback(new se(this));
            }
            ua.j.C.g.f(new zh(this));
        }
        pa.b bVarA = pa.b.a(t2Var.f36171b);
        if (bVarA != null) {
            HashMap map = this.f11601a;
            if (map.containsKey(bVarA) && !((Map) map.get(bVarA)).containsKey(str) && e(bVarA) && (it0VarB = this.f11602b.b(str, t2Var, q0Var)) != null) {
                AtomicInteger atomicInteger = this.f11607h;
                if (atomicInteger != null) {
                    it0VarB.p(atomicInteger.get());
                }
                kh0 kh0Var = this.f11603c;
                it0VarB.f12442r = kh0Var;
                et0 et0Var = this.f11608i;
                if (et0Var != null) {
                    et0Var.d(str, bVarA, it0VarB);
                } else {
                    it0VarB.j();
                }
                ((Map) map.get(bVarA)).put(str, it0VarB);
                pq0 pq0Var = new pq0(29, t2Var.f36170a, bVarA);
                pq0Var.f15075d = str;
                nt0 nt0Var = new nt0(pq0Var);
                int i4 = t2Var.f36173d;
                this.g.getClass();
                kh0Var.p(i4, System.currentTimeMillis(), nt0Var, "2");
                return true;
            }
        }
        return false;
    }

    public final void b(boolean z3) {
        synchronized (this) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16410y)).booleanValue()) {
                c(z3);
            }
        }
    }

    public final synchronized void c(boolean z3) {
        try {
            Iterator it = this.f11601a.values().iterator();
            while (it.hasNext()) {
                for (it0 it0Var : ((Map) it.next()).values()) {
                    if (z3) {
                        it0Var.n();
                    } else {
                        it0Var.g.set(false);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Object d(Class cls, String str, pa.b bVar) {
        kh0 kh0Var = this.f11603c;
        this.g.getClass();
        kh0Var.D("poll_ad", "ppacwe_ts", System.currentTimeMillis(), -1, -1, null, null, "2");
        HashMap map = this.f11601a;
        if (!map.containsKey(bVar)) {
            return null;
        }
        it0 it0Var = (it0) ((Map) map.get(bVar)).get(str);
        if (it0Var != null && bVar.equals(it0Var.q())) {
            pq0 pq0Var = new pq0(29, it0Var.f12431e.f36170a, it0Var.q());
            pq0Var.f15075d = str;
            nt0 nt0Var = new nt0(pq0Var);
            kh0Var.D("poll_ad", "ppac_ts", System.currentTimeMillis(), it0Var.f12431e.f36173d, it0Var.r(), null, nt0Var, "2");
            try {
                String strO = it0Var.o();
                Object objM = it0Var.m();
                Object objCast = objM == null ? null : cls.cast(objM);
                if (objCast != null) {
                    kh0Var.A(System.currentTimeMillis(), it0Var.f12431e.f36173d, it0Var.r(), strO, nt0Var, "2");
                }
                return objCast;
            } catch (ClassCastException e2) {
                ua.j.C.f35265h.f("PreloadAdManager.pollAd", e2);
                ya.a0.n("Unable to cast ad to the requested type:".concat(cls.getName()), e2);
                return null;
            }
        }
        return null;
    }

    public final synchronized boolean e(pa.b bVar) {
        int size;
        int iOrdinal;
        try {
            HashMap map = this.f11601a;
            size = map.containsKey(bVar) ? ((Map) map.get(bVar)).size() : 0;
            iOrdinal = bVar.ordinal();
        } finally {
        }
        return size < (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 5 ? 0 : Math.max(((Integer) va.s.f36163e.f36166c.a(sk.f16209l5)).intValue(), 1) : Math.max(((Integer) va.s.f36163e.f36166c.a(sk.f16194k5)).intValue(), 1) : Math.max(((Integer) va.s.f36163e.f36166c.a(sk.f16180j5)).intValue(), 1));
    }
}
