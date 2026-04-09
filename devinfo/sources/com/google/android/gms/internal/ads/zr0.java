package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zr0 implements yr0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19151a;

    /* renamed from: p, reason: collision with root package name */
    public final int f19164p;

    /* renamed from: b, reason: collision with root package name */
    public long f19152b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f19153c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19154d = false;

    /* renamed from: q, reason: collision with root package name */
    public int f19165q = 2;

    /* renamed from: r, reason: collision with root package name */
    public int f19166r = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f19155e = 0;

    /* renamed from: f, reason: collision with root package name */
    public String f19156f = "";
    public String g = "";

    /* renamed from: h, reason: collision with root package name */
    public String f19157h = "";

    /* renamed from: i, reason: collision with root package name */
    public String f19158i = "";
    public int j = 2;

    /* renamed from: k, reason: collision with root package name */
    public String f19159k = "";

    /* renamed from: l, reason: collision with root package name */
    public String f19160l = "";

    /* renamed from: m, reason: collision with root package name */
    public String f19161m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f19162n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f19163o = false;

    public zr0(Context context, int i4) {
        this.f19151a = context;
        this.f19164p = i4;
    }

    @Override // com.google.android.gms.internal.ads.yr0
    public final boolean B1() {
        return !TextUtils.isEmpty(this.f19157h);
    }

    @Override // com.google.android.gms.internal.ads.yr0
    public final synchronized as0 F1() {
        try {
            if (this.f19162n) {
                return null;
            }
            this.f19162n = true;
            if (!this.f19163o) {
                d();
            }
            if (this.f19153c < 0) {
                e();
            }
            return new as0(this);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.yr0
    public final yr0 K1(int i4) {
        synchronized (this) {
            this.j = i4;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yr0
    public final synchronized boolean a() {
        return this.f19163o;
    }

    @Override // com.google.android.gms.internal.ads.yr0
    public final /* bridge */ /* synthetic */ yr0 b() {
        d();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yr0
    public final yr0 c(boolean z3) {
        synchronized (this) {
            this.f19154d = z3;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yr0
    public final yr0 c0(String str) {
        synchronized (this) {
            this.f19157h = str;
        }
        return this;
    }

    public final synchronized void d() {
        Configuration configuration;
        ua.j jVar = ua.j.C;
        ja.c cVar = jVar.f35264f;
        Context context = this.f19151a;
        this.f19155e = cVar.P(context);
        Resources resources = context.getResources();
        int i4 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i4 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f19166r = i4;
        jVar.f35267k.getClass();
        this.f19152b = SystemClock.elapsedRealtime();
        this.f19163o = true;
    }

    public final synchronized void e() {
        ua.j.C.f35267k.getClass();
        this.f19153c = SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.yr0
    public final yr0 g(String str) {
        synchronized (this) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.W9)).booleanValue()) {
                this.f19161m = str;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yr0
    public final yr0 h(Throwable th2) {
        synchronized (this) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.W9)).booleanValue()) {
                String strD = za.d.d(ut.f(th2), "SHA-256");
                if (strD == null) {
                    strD = "";
                }
                this.f19160l = strD;
                String strF = ut.f(th2);
                rg0 rg0VarK = rg0.k(new y21('\n'));
                strF.getClass();
                this.f19159k = (String) ((j31) ((k31) rg0VarK.f15651b).m(rg0VarK, strF)).next();
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yr0
    public final yr0 i(va.w1 w1Var) {
        synchronized (this) {
            try {
                IBinder iBinder = w1Var.f36181e;
                if (iBinder != null) {
                    c60 c60Var = (c60) iBinder;
                    String str = c60Var.f10000d;
                    if (!TextUtils.isEmpty(str)) {
                        this.f19156f = str;
                    }
                    String str2 = c60Var.f9998b;
                    if (!TextUtils.isEmpty(str2)) {
                        this.g = str2;
                    }
                }
            } finally {
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r2.g = r0;
     */
    @Override // com.google.android.gms.internal.ads.yr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.yr0 j(com.google.android.gms.internal.ads.aw r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r3.f9452c     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.yp0 r0 = (com.google.android.gms.internal.ads.yp0) r0     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.f18820b     // Catch: java.lang.Throwable -> L10
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L12
            r2.f19156f = r0     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L32
        L12:
            java.lang.Object r3 = r3.f9451b     // Catch: java.lang.Throwable -> L10
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L10
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L10
        L1a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L30
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.wp0 r0 = (com.google.android.gms.internal.ads.wp0) r0     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.f18075b0     // Catch: java.lang.Throwable -> L10
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L1a
            r2.g = r0     // Catch: java.lang.Throwable -> L10
        L30:
            monitor-exit(r2)
            return r2
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zr0.j(com.google.android.gms.internal.ads.aw):com.google.android.gms.internal.ads.yr0");
    }

    @Override // com.google.android.gms.internal.ads.yr0
    public final yr0 k(String str) {
        synchronized (this) {
            this.f19158i = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yr0
    public final yr0 l(int i4) {
        synchronized (this) {
            this.f19165q = i4;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.yr0
    public final /* bridge */ /* synthetic */ yr0 zzc() {
        e();
        return this;
    }
}
