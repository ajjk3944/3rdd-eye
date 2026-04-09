package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import j$.util.concurrent.ConcurrentHashMap;
import j2.EnumC2546b;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import q2.C2841s;
import t2.AbstractC2907C;

/* loaded from: classes.dex */
public final class Iv {

    /* renamed from: c, reason: collision with root package name */
    public final Nv f9190c;

    /* renamed from: d, reason: collision with root package name */
    public final C1014cu f9191d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f9192e;

    /* renamed from: f, reason: collision with root package name */
    public volatile ConnectivityManager f9193f;

    /* renamed from: h, reason: collision with root package name */
    public final Q2.a f9195h;
    public AtomicInteger i;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f9194g = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f9188a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f9189b = new ConcurrentHashMap();

    public Iv(Nv nv, C1014cu c1014cu, Context context, Q2.a aVar) {
        this.f9190c = nv;
        this.f9191d = c1014cu;
        this.f9192e = context;
        this.f9195h = aVar;
    }

    public static String a(String str, EnumC2546b enumC2546b) {
        String strName = enumC2546b == null ? "NULL" : enumC2546b.name();
        return AbstractC1135f5.n(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length()), str, "#", strName);
    }

    public final void b(boolean z6) {
        synchronized (this) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8860y)).booleanValue()) {
                c(z6);
            }
        }
    }

    public final synchronized void c(boolean z6) {
        try {
            if (z6) {
                Iterator it = this.f9188a.values().iterator();
                while (it.hasNext()) {
                    ((Ev) it.next()).n();
                }
            } else {
                Iterator it2 = this.f9188a.values().iterator();
                while (it2.hasNext()) {
                    ((Ev) it2.next()).f8029g.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003c, B:13:0x004b, B:14:0x0051, B:16:0x0059, B:18:0x0067, B:19:0x0076, B:20:0x007a, B:21:0x007e, B:22:0x0088, B:24:0x008e, B:26:0x00a0, B:27:0x00b5, B:28:0x00bf, B:30:0x00c5, B:32:0x00ee, B:35:0x0101, B:37:0x0107, B:34:0x00fe), top: B:43:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.ArrayList d(java.util.List r9) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Iv.d(java.util.List):java.util.ArrayList");
    }

    public final synchronized void e(String str, Ev ev) {
        ev.j();
        this.f9188a.put(str, ev);
    }

    public final synchronized boolean f(String str, EnumC2546b enumC2546b) {
        boolean z6;
        try {
            this.f9195h.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Ev evH = h(str, enumC2546b);
            z6 = evH != null && evH.l();
            Long lValueOf = z6 ? Long.valueOf(System.currentTimeMillis()) : null;
            Jv jv = new Jv(new C1338iu(str, 29, enumC2546b));
            int iR = 0;
            C1014cu c1014cu = this.f9191d;
            int i = evH == null ? 0 : evH.f8027e.f23142d;
            if (evH != null) {
                iR = evH.r();
            }
            c1014cu.i(i, iR, jCurrentTimeMillis, lValueOf, evH != null ? evH.o() : null, jv, "1");
        } catch (Throwable th) {
            throw th;
        }
        return z6;
    }

    public final synchronized Object g(EnumC2546b enumC2546b, Class cls, String str) {
        Jv jv = new Jv(new C1338iu(str, 29, enumC2546b));
        C1014cu c1014cu = this.f9191d;
        this.f9195h.getClass();
        c1014cu.n("poll_ad", "ppac_ts", System.currentTimeMillis(), -1, -1, null, jv, "1");
        Ev evH = h(str, enumC2546b);
        if (evH == null) {
            return null;
        }
        try {
            String strO = evH.o();
            Object objM = evH.m();
            Object objCast = objM == null ? null : cls.cast(objM);
            if (objCast != null) {
                c1014cu.j(System.currentTimeMillis(), evH.f8027e.f23142d, evH.r(), strO, jv, "1");
            }
            return objCast;
        } catch (ClassCastException e6) {
            p2.j.f22785C.f22795h.f("PreloadAdManager.pollAd", e6);
            AbstractC2907C.n("Unable to cast ad to the requested type:".concat(cls.getName()), e6);
            return null;
        }
    }

    public final synchronized Ev h(String str, EnumC2546b enumC2546b) {
        return (Ev) this.f9188a.get(a(str, enumC2546b));
    }
}
