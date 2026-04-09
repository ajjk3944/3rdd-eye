package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gd2 {
    public final Object a = new Object();
    public final ra4 b;
    public final id2 c;
    public boolean d;
    public Context e;
    public e51 f;
    public String g;
    public h2 h;
    public mv2 i;
    public Boolean j;
    public final AtomicInteger k;
    public final AtomicInteger l;
    public final fd2 m;
    public final Object n;
    public n70 o;
    public final AtomicBoolean p;

    public gd2() {
        ra4 ra4Var = new ra4();
        this.b = ra4Var;
        this.c = new id2(sv1.f.c, ra4Var);
        this.d = false;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = new AtomicInteger(0);
        this.l = new AtomicInteger(0);
        this.m = new fd2();
        this.n = new Object();
        this.p = new AtomicBoolean();
    }

    public final h2 a() {
        h2 h2Var;
        synchronized (this.a) {
            h2Var = this.h;
        }
        return h2Var;
    }

    public final void b(Context context, e51 e51Var, mv2 mv2Var) {
        h2 h2Var;
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.e = context.getApplicationContext();
                    this.f = e51Var;
                    hg4.C.g.f(this.c);
                    this.b.j(this.e);
                    r92.b(this.e, this.f);
                    this.i = mv2Var;
                    iz1 iz1Var = mz1.f2;
                    tw1 tw1Var = tw1.e;
                    if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                        h2Var = new h2();
                    } else {
                        gi2.G("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        h2Var = null;
                    }
                    this.h = h2Var;
                    if (h2Var != null) {
                        um.F(new gc2(this).r1(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.e;
                    if (((Boolean) tw1Var.c.a(mz1.b9)).booleanValue()) {
                        try {
                            ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new ra0(this));
                        } catch (RuntimeException unused) {
                            gi2.q0(5);
                            this.p.set(true);
                        }
                    }
                    this.d = true;
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) tw1.e.c.a(mz1.we)).booleanValue()) {
            return;
        }
        hg4.C.c.D(context, e51Var.f);
    }

    public final Resources c() {
        if (this.f.i) {
            return this.e.getResources();
        }
        try {
            if (((Boolean) tw1.e.c.a(mz1.Hb)).booleanValue()) {
                return pu1.z(this.e).a.getResources();
            }
            pu1.z(this.e).a.getResources();
            return null;
        } catch (ze4 unused) {
            gi2.q0(5);
            return null;
        }
    }

    public final void d(String str, Throwable th) {
        r92.b(this.e, this.f).e(str, th);
    }

    public final void e(String str, Throwable th) {
        r92.b(this.e, this.f).g(th, str, ((Double) f12.f.w()).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x001d, B:10:0x002d, B:13:0x0037, B:14:0x003e), top: B:19:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.String r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.e
            e51 r1 = r6.f
            java.lang.Object r2 = defpackage.r92.q
            monitor-enter(r2)
            s92 r3 = defpackage.r92.s     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L3e
            iz1 r3 = defpackage.mz1.e8     // Catch: java.lang.Throwable -> L35
            tw1 r4 = defpackage.tw1.e     // Catch: java.lang.Throwable -> L35
            kz1 r5 = r4.c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r5.a(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r3 == 0) goto L37
            iz1 r3 = defpackage.mz1.d8     // Catch: java.lang.Throwable -> L35
            kz1 r4 = r4.c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r4.a(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L35
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L37
            r92 r3 = new r92     // Catch: java.lang.Throwable -> L35
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> L35
            defpackage.r92.s = r3     // Catch: java.lang.Throwable -> L35
            goto L3e
        L35:
            r7 = move-exception
            goto L45
        L37:
            us0 r0 = new us0     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            defpackage.r92.s = r0     // Catch: java.lang.Throwable -> L35
        L3e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            s92 r0 = defpackage.r92.s
            r0.e(r7, r8)
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd2.f(java.lang.String, java.lang.Throwable):void");
    }

    public final ra4 g() {
        ra4 ra4Var;
        synchronized (this.a) {
            ra4Var = this.b;
        }
        return ra4Var;
    }

    public final n70 h() {
        if (this.e != null) {
            if (!((Boolean) tw1.e.c.a(mz1.j3)).booleanValue()) {
                synchronized (this.n) {
                    try {
                        n70 n70Var = this.o;
                        if (n70Var != null) {
                            return n70Var;
                        }
                        n70 n70VarC = md2.a.c(new xs1(2, this));
                        this.o = n70VarC;
                        return n70VarC;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return pu1.r(new ArrayList());
    }

    public final boolean i(Context context) {
        if (((Boolean) tw1.e.c.a(mz1.b9)).booleanValue()) {
            return this.p.get();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
