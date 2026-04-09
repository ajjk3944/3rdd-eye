package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import q2.C2841s;
import t2.AbstractC2907C;
import t2.C2909E;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Hf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538Hf {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8968a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C2909E f8969b;

    /* renamed from: c, reason: collision with root package name */
    public final C0572Jf f8970c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8971d;

    /* renamed from: e, reason: collision with root package name */
    public Context f8972e;

    /* renamed from: f, reason: collision with root package name */
    public C2951a f8973f;

    /* renamed from: g, reason: collision with root package name */
    public String f8974g;

    /* renamed from: h, reason: collision with root package name */
    public K4.c f8975h;
    public C0784Vn i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f8976j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f8977k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f8978l;

    /* renamed from: m, reason: collision with root package name */
    public final C0521Gf f8979m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f8980n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceFutureC2326a f8981o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f8982p;

    public C0538Hf() {
        C2909E c2909e = new C2909E();
        this.f8969b = c2909e;
        this.f8970c = new C0572Jf(q2.r.f23260g.f23266f, c2909e);
        this.f8971d = false;
        this.f8975h = null;
        this.i = null;
        this.f8976j = null;
        this.f8977k = new AtomicInteger(0);
        this.f8978l = new AtomicInteger(0);
        this.f8979m = new C0521Gf();
        this.f8980n = new Object();
        this.f8982p = new AtomicBoolean();
    }

    public final K4.c a() {
        K4.c cVar;
        synchronized (this.f8968a) {
            cVar = this.f8975h;
        }
        return cVar;
    }

    public final void b(Boolean bool) {
        synchronized (this.f8968a) {
            this.f8976j = bool;
        }
    }

    public final Boolean c() {
        Boolean bool;
        synchronized (this.f8968a) {
            bool = this.f8976j;
        }
        return bool;
    }

    public final void d(Context context, C2951a c2951a, C0784Vn c0784Vn) {
        K4.c cVar;
        synchronized (this.f8968a) {
            try {
                if (!this.f8971d) {
                    this.f8972e = context.getApplicationContext();
                    this.f8973f = c2951a;
                    p2.j.f22785C.f22794g.l(this.f8970c);
                    this.f8969b.o(this.f8972e);
                    C1053de.b(this.f8972e, this.f8973f);
                    this.i = c0784Vn;
                    E9 e9 = H9.f8838u2;
                    C2841s c2841s = C2841s.f23267e;
                    if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                        cVar = new K4.c(3);
                    } else {
                        AbstractC2907C.m("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        cVar = null;
                    }
                    this.f8975h = cVar;
                    if (cVar != null) {
                        AbstractC2022vd.g(new C0504Ff(this).k(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.f8972e;
                    if (Q2.b.e()) {
                        if (((Boolean) c2841s.f23270c.a(H9.y9)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new A1.r(this));
                            } catch (RuntimeException e6) {
                                u2.k.i("Failed to register network callback", e6);
                                this.f8982p.set(true);
                            }
                        }
                    }
                    this.f8971d = true;
                    j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.ff)).booleanValue()) {
            return;
        }
        p2.j.f22785C.f22790c.F(context, c2951a.f23784a);
    }

    public final Resources e() {
        if (this.f8973f.f23787d) {
            return this.f8972e.getResources();
        }
        try {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.ec)).booleanValue()) {
                return u2.k.b(this.f8972e).f3582a.getResources();
            }
            u2.k.b(this.f8972e).f3582a.getResources();
            return null;
        } catch (u2.l e6) {
            u2.k.i("Cannot load resource from dynamite apk or local jar", e6);
            return null;
        }
    }

    public final void f(String str, Throwable th) {
        C1053de.b(this.f8972e, this.f8973f).e(str, th);
    }

    public final void g(String str, Throwable th) {
        C1053de.b(this.f8972e, this.f8973f).f(th, str, ((Double) AbstractC1857sa.f16754f.v()).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x001d, B:10:0x002d, B:13:0x0037, B:14:0x0040), top: B:19:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f8972e
            u2.a r1 = r6.f8973f
            java.lang.Object r2 = com.google.android.gms.internal.ads.C1053de.f13775l
            monitor-enter(r2)
            com.google.android.gms.internal.ads.ee r3 = com.google.android.gms.internal.ads.C1053de.f13777n     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L40
            com.google.android.gms.internal.ads.E9 r3 = com.google.android.gms.internal.ads.H9.z8     // Catch: java.lang.Throwable -> L35
            q2.s r4 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.G9 r5 = r4.f23270c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r5.a(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L37
            com.google.android.gms.internal.ads.E9 r3 = com.google.android.gms.internal.ads.H9.y8     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.G9 r4 = r4.f23270c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L37
            com.google.android.gms.internal.ads.de r3 = new com.google.android.gms.internal.ads.de     // Catch: java.lang.Throwable -> L35
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.C1053de.f13777n = r3     // Catch: java.lang.Throwable -> L35
            goto L40
        L35:
            r7 = move-exception
            goto L47
        L37:
            com.google.android.gms.internal.ads.W9 r0 = new com.google.android.gms.internal.ads.W9     // Catch: java.lang.Throwable -> L35
            r1 = 13
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.C1053de.f13777n = r0     // Catch: java.lang.Throwable -> L35
        L40:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.ee r0 = com.google.android.gms.internal.ads.C1053de.f13777n
            r0.e(r7, r8)
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0538Hf.h(java.lang.String, java.lang.Throwable):void");
    }

    public final C2909E i() {
        C2909E c2909e;
        synchronized (this.f8968a) {
            c2909e = this.f8969b;
        }
        return c2909e;
    }

    public final InterfaceFutureC2326a j() {
        if (this.f8972e != null) {
            if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8561A3)).booleanValue()) {
                synchronized (this.f8980n) {
                    try {
                        InterfaceFutureC2326a interfaceFutureC2326a = this.f8981o;
                        if (interfaceFutureC2326a != null) {
                            return interfaceFutureC2326a;
                        }
                        InterfaceFutureC2326a interfaceFutureC2326aB = AbstractC0640Nf.f10005a.b(new J6(1, this));
                        this.f8981o = interfaceFutureC2326aB;
                        return interfaceFutureC2326aB;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return AbstractC1984ut.e(new ArrayList());
    }

    public final boolean k(Context context) {
        if (Q2.b.e()) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.y9)).booleanValue()) {
                return this.f8982p.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
