package zc;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.c4;
import com.google.android.gms.internal.measurement.e4;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.m4;
import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.p4;
import com.google.android.gms.internal.measurement.zzdd;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c1 implements k1 {

    /* renamed from: a0, reason: collision with root package name */
    public static volatile c1 f26883a0;
    public final a1 B;
    public final e3 D;
    public final s3 E;
    public final f0 F;
    public final gc.a G;
    public final o2 H;
    public final d2 I;
    public final r J;
    public final h2 K;
    public final String L;
    public e0 M;
    public x2 N;
    public o O;
    public c0 P;
    public i2 Q;
    public Boolean S;
    public long T;
    public volatile Boolean U;
    public volatile boolean V;
    public int W;
    public int X;
    public final long Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f26884a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26885d;

    /* renamed from: g, reason: collision with root package name */
    public final d f26886g;

    /* renamed from: r, reason: collision with root package name */
    public final f f26887r;

    /* renamed from: x, reason: collision with root package name */
    public final r0 f26888x;

    /* renamed from: y, reason: collision with root package name */
    public final j0 f26889y;
    public boolean R = false;
    public final AtomicInteger Y = new AtomicInteger(0);

    public c1(r1 r1Var) {
        ne.n oVar;
        Context context;
        Context context2 = r1Var.f27124a;
        d dVar = new d(0);
        this.f26886g = dVar;
        p1.k = dVar;
        this.f26884a = context2;
        this.f26885d = r1Var.f27128e;
        this.U = r1Var.f27125b;
        this.L = r1Var.f27130g;
        this.V = true;
        if (m4.f5115h == null && context2 != null) {
            Object obj = m4.f5114g;
            synchronized (obj) {
                try {
                    if (m4.f5115h == null) {
                        synchronized (obj) {
                            c4 c4Var = m4.f5115h;
                            Context applicationContext = context2.getApplicationContext();
                            if (applicationContext == null) {
                                applicationContext = context2;
                            }
                            if (c4Var == null || c4Var.f4928a != applicationContext) {
                                if (c4Var != null) {
                                    e4.c();
                                    p4.a();
                                    synchronized (h4.class) {
                                        try {
                                            h4 h4Var = h4.f5054r;
                                            if (h4Var != null && (context = (Context) h4Var.f5056d) != null && ((g4) h4Var.f5057g) != null && h4Var.f5055a) {
                                                context.getContentResolver().unregisterContentObserver((g4) h4.f5054r.f5057g);
                                            }
                                            h4.f5054r = null;
                                        } finally {
                                        }
                                    }
                                }
                                o4 o4Var = new o4(applicationContext);
                                if (o4Var instanceof Serializable) {
                                    oVar = new ne.o(o4Var);
                                } else {
                                    ne.p pVar = new ne.p();
                                    pVar.f17539a = o4Var;
                                    oVar = pVar;
                                }
                                m4.f5115h = new c4(applicationContext, oVar);
                                m4.f5116i.incrementAndGet();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                } finally {
                }
            }
        }
        this.G = gc.a.f9479a;
        Long l10 = r1Var.f27129f;
        this.Z = l10 != null ? l10.longValue() : System.currentTimeMillis();
        f fVar = new f(this);
        fVar.f26922x = yh.c.f26249d;
        this.f26887r = fVar;
        r0 r0Var = new r0(this);
        r0Var.v1();
        this.f26888x = r0Var;
        j0 j0Var = new j0(this);
        j0Var.v1();
        this.f26889y = j0Var;
        s3 s3Var = new s3(this);
        s3Var.v1();
        this.E = s3Var;
        this.F = new f0(new z7.j(r1Var, this));
        this.J = new r(this);
        o2 o2Var = new o2(this);
        o2Var.u1();
        this.H = o2Var;
        d2 d2Var = new d2(this);
        d2Var.u1();
        this.I = d2Var;
        e3 e3Var = new e3(this);
        e3Var.u1();
        this.D = e3Var;
        h2 h2Var = new h2(this);
        h2Var.v1();
        this.K = h2Var;
        a1 a1Var = new a1(this);
        a1Var.v1();
        this.B = a1Var;
        zzdd zzddVar = r1Var.f27127d;
        boolean z10 = zzddVar == null || zzddVar.f5291d == 0;
        if (context2.getApplicationContext() instanceof Application) {
            f(d2Var);
            if (((c1) d2Var.f1504d).f26884a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((c1) d2Var.f1504d).f26884a.getApplicationContext();
                if (d2Var.f26906r == null) {
                    d2Var.f26906r = new kg.j(d2Var);
                }
                if (z10) {
                    application.unregisterActivityLifecycleCallbacks(d2Var.f26906r);
                    application.registerActivityLifecycleCallbacks(d2Var.f26906r);
                    j0 j0Var2 = ((c1) d2Var.f1504d).f26889y;
                    g(j0Var2);
                    j0Var2.K.b("Registered activity lifecycle callback");
                }
            }
        } else {
            g(j0Var);
            j0Var.F.b("Application context is not an Application");
        }
        a1Var.B1(new re.a(28, this, r1Var, false));
    }

    public static final void d(s sVar) {
        if (sVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void e(androidx.lifecycle.o oVar) {
        if (oVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void f(w wVar) {
        if (wVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!wVar.f27249g) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(wVar.getClass())));
        }
    }

    public static final void g(j1 j1Var) {
        if (j1Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!j1Var.f26980g) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(j1Var.getClass())));
        }
    }

    public static c1 m(Context context, zzdd zzddVar, Long l10) {
        Bundle bundle;
        if (zzddVar != null) {
            Bundle bundle2 = zzddVar.f5293r;
            zzddVar = new zzdd(zzddVar.f5290a, zzddVar.f5291d, zzddVar.f5292g, bundle2, null);
        }
        cc.s.h(context);
        cc.s.h(context.getApplicationContext());
        if (f26883a0 == null) {
            synchronized (c1.class) {
                try {
                    if (f26883a0 == null) {
                        f26883a0 = new c1(new r1(context, zzddVar, l10));
                    }
                } finally {
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.f5293r) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            cc.s.h(f26883a0);
            f26883a0.U = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        cc.s.h(f26883a0);
        return f26883a0;
    }

    @Override // zc.k1
    public final gc.a C0() {
        return this.G;
    }

    @Override // zc.k1
    public final a1 J() {
        a1 a1Var = this.B;
        g(a1Var);
        return a1Var;
    }

    @Override // zc.k1
    public final d Z() {
        return this.f26886g;
    }

    public final boolean a() {
        return b() == 0;
    }

    public final int b() {
        a1 a1Var = this.B;
        g(a1Var);
        a1Var.s1();
        f fVar = this.f26887r;
        if (fVar.F1()) {
            return 1;
        }
        g(a1Var);
        a1Var.s1();
        if (!this.V) {
            return 8;
        }
        r0 r0Var = this.f26888x;
        e(r0Var);
        r0Var.s1();
        Boolean boolValueOf = r0Var.w1().contains("measurement_enabled") ? Boolean.valueOf(r0Var.w1().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        d dVar = ((c1) fVar.f1504d).f26886g;
        Boolean boolE1 = fVar.E1("firebase_analytics_collection_enabled");
        return boolE1 != null ? boolE1.booleanValue() ? 0 : 4 : (this.U == null || this.U.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r6 = this;
            boolean r0 = r6.R
            if (r0 == 0) goto L96
            zc.a1 r0 = r6.B
            g(r0)
            r0.s1()
            java.lang.Boolean r0 = r6.S
            gc.a r1 = r6.G
            if (r0 == 0) goto L34
            long r2 = r6.T
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8f
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.T
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L8f
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.T = r0
            zc.s3 r0 = r6.E
            e(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.P1(r1)
            r2 = 0
            if (r1 == 0) goto L75
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.P1(r1)
            if (r1 == 0) goto L75
            android.content.Context r1 = r6.f26884a
            ic.b r3 = ic.c.a(r1)
            boolean r3 = r3.d()
            r4 = 1
            if (r3 != 0) goto L74
            zc.f r3 = r6.f26887r
            boolean r3 = r3.v1()
            if (r3 != 0) goto L74
            boolean r3 = zc.s3.i2(r1)
            if (r3 == 0) goto L75
            boolean r1 = zc.s3.L1(r1)
            if (r1 == 0) goto L75
        L74:
            r2 = r4
        L75:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r6.S = r1
            if (r2 == 0) goto L8f
            zc.c0 r1 = r6.l()
            java.lang.String r1 = r1.z1()
            boolean r0 = r0.w1(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.S = r0
        L8f:
            java.lang.Boolean r0 = r6.S
            boolean r0 = r0.booleanValue()
            return r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.c1.c():boolean");
    }

    public final f0 h() {
        return this.F;
    }

    public final e0 i() {
        f(this.M);
        return this.M;
    }

    public final x2 j() {
        f(this.N);
        return this.N;
    }

    public final o k() {
        g(this.O);
        return this.O;
    }

    public final c0 l() {
        f(this.P);
        return this.P;
    }

    @Override // zc.k1
    public final Context u0() {
        return this.f26884a;
    }

    @Override // zc.k1
    public final j0 x() {
        j0 j0Var = this.f26889y;
        g(j0Var);
        return j0Var;
    }
}
