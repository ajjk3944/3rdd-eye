package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zw {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19193a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ya.c0 f19194b;

    /* renamed from: c, reason: collision with root package name */
    public final bx f19195c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19196d;

    /* renamed from: e, reason: collision with root package name */
    public Context f19197e;

    /* renamed from: f, reason: collision with root package name */
    public za.a f19198f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.gms.internal.consent_sdk.d f19199h;

    /* renamed from: i, reason: collision with root package name */
    public qd0 f19200i;
    public Boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f19201k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f19202l;

    /* renamed from: m, reason: collision with root package name */
    public final yw f19203m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f19204n;

    /* renamed from: o, reason: collision with root package name */
    public vd.b f19205o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f19206p;

    public zw() {
        ya.c0 c0Var = new ya.c0();
        this.f19194b = c0Var;
        this.f19195c = new bx(va.r.g.f36162f, c0Var);
        this.f19196d = false;
        this.f19199h = null;
        this.f19200i = null;
        this.j = null;
        this.f19201k = new AtomicInteger(0);
        this.f19202l = new AtomicInteger(0);
        this.f19203m = new yw();
        this.f19204n = new Object();
        this.f19206p = new AtomicBoolean();
    }

    public final com.google.android.gms.internal.consent_sdk.d a() {
        com.google.android.gms.internal.consent_sdk.d dVar;
        synchronized (this.f19193a) {
            dVar = this.f19199h;
        }
        return dVar;
    }

    public final void b(Boolean bool) {
        synchronized (this.f19193a) {
            this.j = bool;
        }
    }

    public final Boolean c() {
        Boolean bool;
        synchronized (this.f19193a) {
            bool = this.j;
        }
        return bool;
    }

    public final void d(Context context, za.a aVar, qd0 qd0Var) {
        com.google.android.gms.internal.consent_sdk.d dVar;
        synchronized (this.f19193a) {
            try {
                if (!this.f19196d) {
                    this.f19197e = context.getApplicationContext();
                    this.f19198f = aVar;
                    ua.j.C.g.f(this.f19195c);
                    this.f19194b.o(this.f19197e);
                    ut.b(this.f19197e, this.f19198f);
                    this.f19200i = qd0Var;
                    pk pkVar = sk.f16348u2;
                    va.s sVar = va.s.f36163e;
                    if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                        dVar = new com.google.android.gms.internal.consent_sdk.d();
                    } else {
                        ya.a0.m("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        dVar = null;
                    }
                    this.f19199h = dVar;
                    if (dVar != null) {
                        nn1.e(new xw(this).A(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.f19197e;
                    if (tb.b.g()) {
                        if (((Boolean) sVar.f36166c.a(sk.A9)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new se(this));
                            } catch (RuntimeException e2) {
                                za.i.i("Failed to register network callback", e2);
                                this.f19206p.set(true);
                            }
                        }
                    }
                    this.f19196d = true;
                    j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16160hf)).booleanValue()) {
            return;
        }
        ua.j.C.f35261c.F(context, aVar.f38129a);
    }

    public final Resources e() {
        if (this.f19198f.f38132d) {
            return this.f19197e.getResources();
        }
        try {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16143gc)).booleanValue()) {
                return za.i.b(this.f19197e).f36591a.getResources();
            }
            za.i.b(this.f19197e).f36591a.getResources();
            return null;
        } catch (za.j e2) {
            za.i.i("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    public final void f(String str, Throwable th2) {
        ut.b(this.f19197e, this.f19198f).d(str, th2);
    }

    public final void g(String str, Throwable th2) {
        ut.b(this.f19197e, this.f19198f).e(th2, str, ((Double) dm.f10521f.u()).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x001d, B:10:0x002d, B:13:0x0037, B:14:0x0040), top: B:19:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f19197e
            za.a r1 = r6.f19198f
            java.lang.Object r2 = com.google.android.gms.internal.ads.ut.f17317l
            monitor-enter(r2)
            com.google.android.gms.internal.ads.vt r3 = com.google.android.gms.internal.ads.ut.f17319n     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L40
            com.google.android.gms.internal.ads.pk r3 = com.google.android.gms.internal.ads.sk.f16435z8     // Catch: java.lang.Throwable -> L35
            va.s r4 = va.s.f36163e     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.rk r5 = r4.f36166c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r5.a(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L37
            com.google.android.gms.internal.ads.pk r3 = com.google.android.gms.internal.ads.sk.f16419y8     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.rk r4 = r4.f36166c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L37
            com.google.android.gms.internal.ads.ut r3 = new com.google.android.gms.internal.ads.ut     // Catch: java.lang.Throwable -> L35
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.ut.f17319n = r3     // Catch: java.lang.Throwable -> L35
            goto L40
        L35:
            r7 = move-exception
            goto L47
        L37:
            com.google.android.gms.internal.ads.hl r0 = new com.google.android.gms.internal.ads.hl     // Catch: java.lang.Throwable -> L35
            r1 = 13
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.ut.f17319n = r0     // Catch: java.lang.Throwable -> L35
        L40:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.vt r0 = com.google.android.gms.internal.ads.ut.f17319n
            r0.d(r7, r8)
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zw.h(java.lang.String, java.lang.Throwable):void");
    }

    public final ya.c0 i() {
        ya.c0 c0Var;
        synchronized (this.f19193a) {
            c0Var = this.f19194b;
        }
        return c0Var;
    }

    public final vd.b j() {
        if (this.f19197e != null) {
            if (!((Boolean) va.s.f36163e.f36166c.a(sk.A3)).booleanValue()) {
                synchronized (this.f19204n) {
                    try {
                        vd.b bVar = this.f19205o;
                        if (bVar != null) {
                            return bVar;
                        }
                        vd.b bVarE = fx.f11274a.e(new qe(1, this));
                        this.f19205o = bVarE;
                        return bVarE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        return yo0.e(new ArrayList());
    }

    public final boolean k(Context context) {
        if (tb.b.g()) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.A9)).booleanValue()) {
                return this.f19206p.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
