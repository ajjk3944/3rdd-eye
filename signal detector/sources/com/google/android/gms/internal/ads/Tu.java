package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import q2.C2841s;
import q2.C2852x0;

/* loaded from: classes.dex */
public final class Tu implements Su {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11490a;

    /* renamed from: p, reason: collision with root package name */
    public final int f11504p;

    /* renamed from: b, reason: collision with root package name */
    public long f11491b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f11492c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11493d = false;

    /* renamed from: q, reason: collision with root package name */
    public int f11505q = 2;

    /* renamed from: r, reason: collision with root package name */
    public int f11506r = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f11494e = 0;

    /* renamed from: f, reason: collision with root package name */
    public String f11495f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f11496g = "";

    /* renamed from: h, reason: collision with root package name */
    public String f11497h = "";
    public String i = "";

    /* renamed from: j, reason: collision with root package name */
    public int f11498j = 2;

    /* renamed from: k, reason: collision with root package name */
    public String f11499k = "";

    /* renamed from: l, reason: collision with root package name */
    public String f11500l = "";

    /* renamed from: m, reason: collision with root package name */
    public String f11501m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f11502n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11503o = false;

    public Tu(Context context, int i) {
        this.f11490a = context;
        this.f11504p = i;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final /* bridge */ /* synthetic */ Su a() {
        k();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su b(boolean z6) {
        synchronized (this) {
            this.f11493d = z6;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final synchronized boolean c() {
        return this.f11503o;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su d(Throwable th) {
        synchronized (this) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.U9)).booleanValue()) {
                String strD = u2.f.d(C1053de.d(th), "SHA-256");
                if (strD == null) {
                    strD = "";
                }
                this.f11500l = strD;
                String strD2 = C1053de.d(th);
                C1448kw c1448kwF = C1448kw.f(new MA('\n'));
                strD2.getClass();
                this.f11499k = (String) ((XA) ((YA) c1448kwF.f15314b).e(c1448kwF, strD2)).next();
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su e(C2852x0 c2852x0) {
        synchronized (this) {
            try {
                IBinder iBinder = c2852x0.f23277e;
                if (iBinder != null) {
                    BinderC1168fk binderC1168fk = (BinderC1168fk) iBinder;
                    String str = binderC1168fk.f14127d;
                    if (!TextUtils.isEmpty(str)) {
                        this.f11495f = str;
                    }
                    String str2 = binderC1168fk.f14125b;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f11496g = str2;
                    }
                }
            } finally {
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final /* bridge */ /* synthetic */ Su f() {
        l();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su g(String str) {
        synchronized (this) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.U9)).booleanValue()) {
                this.f11501m = str;
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r2.f11496g = r0;
     */
    @Override // com.google.android.gms.internal.ads.Su
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.Su h(com.google.android.gms.internal.ads.C1431kf r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r3.f15174c     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.St r0 = (com.google.android.gms.internal.ads.St) r0     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.f11269b     // Catch: java.lang.Throwable -> L10
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L12
            r2.f11495f = r0     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L32
        L12:
            java.lang.Object r3 = r3.f15173b     // Catch: java.lang.Throwable -> L10
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L10
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L10
        L1a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L30
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.ads.Qt r0 = (com.google.android.gms.internal.ads.Qt) r0     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = r0.b0     // Catch: java.lang.Throwable -> L10
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L1a
            r2.f11496g = r0     // Catch: java.lang.Throwable -> L10
        L30:
            monitor-exit(r2)
            return r2
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Tu.h(com.google.android.gms.internal.ads.kf):com.google.android.gms.internal.ads.Su");
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final boolean i() {
        return !TextUtils.isEmpty(this.f11497h);
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su j(int i) {
        synchronized (this) {
            this.f11505q = i;
        }
        return this;
    }

    public final synchronized void k() {
        Configuration configuration;
        p2.j jVar = p2.j.f22785C;
        p1.e eVar = jVar.f22793f;
        Context context = this.f11490a;
        this.f11494e = eVar.v(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.f11506r = i;
        jVar.f22797k.getClass();
        this.f11491b = SystemClock.elapsedRealtime();
        this.f11503o = true;
    }

    public final synchronized void l() {
        p2.j.f22785C.f22797k.getClass();
        this.f11492c = SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final synchronized Uu n() {
        try {
            if (this.f11502n) {
                return null;
            }
            this.f11502n = true;
            if (!this.f11503o) {
                k();
            }
            if (this.f11492c < 0) {
                l();
            }
            return new Uu(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su s0(String str) {
        synchronized (this) {
            this.f11497h = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su t(int i) {
        synchronized (this) {
            this.f11498j = i;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Su
    public final Su x(String str) {
        synchronized (this) {
            this.i = str;
        }
        return this;
    }
}
