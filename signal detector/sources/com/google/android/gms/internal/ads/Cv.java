package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import j2.EnumC2546b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import q2.C2841s;
import t2.AbstractC2907C;

/* loaded from: classes.dex */
public final class Cv {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f7689a;

    /* renamed from: b, reason: collision with root package name */
    public final Nv f7690b;

    /* renamed from: c, reason: collision with root package name */
    public final C1014cu f7691c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f7692d;

    /* renamed from: e, reason: collision with root package name */
    public volatile ConnectivityManager f7693e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f7694f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public final Q2.a f7695g;

    /* renamed from: h, reason: collision with root package name */
    public AtomicInteger f7696h;
    public final Av i;

    public Cv(Nv nv, C1014cu c1014cu, Context context, Q2.a aVar, Av av) {
        HashMap map = new HashMap();
        this.f7689a = map;
        map.put(EnumC2546b.APP_OPEN_AD, new HashMap());
        map.put(EnumC2546b.INTERSTITIAL, new HashMap());
        map.put(EnumC2546b.REWARDED, new HashMap());
        this.f7690b = nv;
        this.f7691c = c1014cu;
        this.f7692d = context;
        this.f7695g = aVar;
        this.i = av;
    }

    public final void a(boolean z6) {
        synchronized (this) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8860y)).booleanValue()) {
                b(z6);
            }
        }
    }

    public final synchronized void b(boolean z6) {
        try {
            Iterator it = this.f7689a.values().iterator();
            while (it.hasNext()) {
                for (Ev ev : ((Map) it.next()).values()) {
                    if (z6) {
                        ev.n();
                    } else {
                        ev.f8029g.set(false);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Object c(EnumC2546b enumC2546b, Class cls, String str) {
        C1014cu c1014cu = this.f7691c;
        this.f7695g.getClass();
        c1014cu.n("poll_ad", "ppacwe_ts", System.currentTimeMillis(), -1, -1, null, null, "2");
        HashMap map = this.f7689a;
        if (!map.containsKey(enumC2546b)) {
            return null;
        }
        Ev ev = (Ev) ((Map) map.get(enumC2546b)).get(str);
        if (ev != null && enumC2546b.equals(ev.q())) {
            C1338iu c1338iu = new C1338iu(ev.f8027e.f23139a, 29, ev.q());
            c1338iu.f14824d = str;
            Jv jv = new Jv(c1338iu);
            c1014cu.n("poll_ad", "ppac_ts", System.currentTimeMillis(), ev.f8027e.f23142d, ev.r(), null, jv, "2");
            try {
                String strO = ev.o();
                Object objM = ev.m();
                Object objCast = objM == null ? null : cls.cast(objM);
                if (objCast != null) {
                    c1014cu.j(System.currentTimeMillis(), ev.f8027e.f23142d, ev.r(), strO, jv, "2");
                }
                return objCast;
            } catch (ClassCastException e6) {
                p2.j.f22785C.f22795h.f("PreloadAdManager.pollAd", e6);
                AbstractC2907C.n("Unable to cast ad to the requested type:".concat(cls.getName()), e6);
                return null;
            }
        }
        return null;
    }

    public final synchronized boolean d(EnumC2546b enumC2546b) {
        int size;
        int iOrdinal;
        try {
            HashMap map = this.f7689a;
            size = map.containsKey(enumC2546b) ? ((Map) map.get(enumC2546b)).size() : 0;
            iOrdinal = enumC2546b.ordinal();
        } finally {
        }
        return size < (iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 5 ? 0 : Math.max(((Integer) C2841s.f23267e.f23270c.a(H9.f8781l5)).intValue(), 1) : Math.max(((Integer) C2841s.f23267e.f23270c.a(H9.f8775k5)).intValue(), 1) : Math.max(((Integer) C2841s.f23267e.f23270c.a(H9.f8768j5)).intValue(), 1));
    }
}
