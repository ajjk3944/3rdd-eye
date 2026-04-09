package ec;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o1 implements w1 {
    public static volatile o1 E;
    public int A;
    public int B;
    public final long D;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22949a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22950b;

    /* renamed from: c, reason: collision with root package name */
    public final b7.h f22951c;

    /* renamed from: d, reason: collision with root package name */
    public final g f22952d;

    /* renamed from: e, reason: collision with root package name */
    public final b1 f22953e;

    /* renamed from: f, reason: collision with root package name */
    public final s0 f22954f;
    public final l1 g;

    /* renamed from: h, reason: collision with root package name */
    public final r3 f22955h;

    /* renamed from: i, reason: collision with root package name */
    public final l4 f22956i;
    public final o0 j;

    /* renamed from: k, reason: collision with root package name */
    public final tb.a f22957k;

    /* renamed from: l, reason: collision with root package name */
    public final b3 f22958l;

    /* renamed from: m, reason: collision with root package name */
    public final q2 f22959m;

    /* renamed from: n, reason: collision with root package name */
    public final w f22960n;

    /* renamed from: o, reason: collision with root package name */
    public final u2 f22961o;

    /* renamed from: p, reason: collision with root package name */
    public final String f22962p;

    /* renamed from: q, reason: collision with root package name */
    public n0 f22963q;

    /* renamed from: r, reason: collision with root package name */
    public j3 f22964r;

    /* renamed from: s, reason: collision with root package name */
    public p f22965s;

    /* renamed from: t, reason: collision with root package name */
    public l0 f22966t;

    /* renamed from: u, reason: collision with root package name */
    public v2 f22967u;

    /* renamed from: w, reason: collision with root package name */
    public Boolean f22969w;

    /* renamed from: x, reason: collision with root package name */
    public long f22970x;

    /* renamed from: y, reason: collision with root package name */
    public volatile Boolean f22971y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f22972z;

    /* renamed from: v, reason: collision with root package name */
    public boolean f22968v = false;
    public final AtomicInteger C = new AtomicInteger(0);

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        throw r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o1(ec.d2 r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.o1.<init>(ec.d2):void");
    }

    public static final void j(a0 a0Var) {
        if (a0Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void k(a8.a aVar) {
        if (aVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void l(f0 f0Var) {
        if (f0Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!f0Var.f22705c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(f0Var.getClass())));
        }
    }

    public static final void m(v1 v1Var) {
        if (v1Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!v1Var.f23099c) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(v1Var.getClass())));
        }
    }

    public static o1 s(Context context, com.google.android.gms.internal.measurement.t0 t0Var, Long l10) {
        Bundle bundle;
        if (t0Var != null) {
            Bundle bundle2 = t0Var.f19934d;
            t0Var = new com.google.android.gms.internal.measurement.t0(t0Var.f19931a, t0Var.f19932b, t0Var.f19933c, bundle2, null);
        }
        pb.y.h(context);
        pb.y.h(context.getApplicationContext());
        if (E == null) {
            synchronized (o1.class) {
                try {
                    if (E == null) {
                        E = new o1(new d2(context, t0Var, l10));
                    }
                } finally {
                }
            }
        } else if (t0Var != null && (bundle = t0Var.f19934d) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            pb.y.h(E);
            E.f22971y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        pb.y.h(E);
        return E;
    }

    @Override // ec.w1
    public final s0 a() {
        s0 s0Var = this.f22954f;
        m(s0Var);
        return s0Var;
    }

    @Override // ec.w1
    public final l1 b() {
        l1 l1Var = this.g;
        m(l1Var);
        return l1Var;
    }

    @Override // ec.w1
    public final b7.h c() {
        return this.f22951c;
    }

    @Override // ec.w1
    public final Context d() {
        return this.f22949a;
    }

    public final boolean e() {
        return g() == 0;
    }

    @Override // ec.w1
    public final tb.a f() {
        return this.f22957k;
    }

    public final int g() {
        l1 l1Var = this.g;
        m(l1Var);
        l1Var.B();
        g gVar = this.f22952d;
        if (gVar.O()) {
            return 1;
        }
        m(l1Var);
        l1Var.B();
        if (!this.f22972z) {
            return 8;
        }
        b1 b1Var = this.f22953e;
        k(b1Var);
        b1Var.B();
        Boolean boolValueOf = b1Var.F().contains("measurement_enabled") ? Boolean.valueOf(b1Var.F().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        b7.h hVar = ((o1) gVar.f218b).f22951c;
        Boolean boolN = gVar.N("firebase_analytics_collection_enabled");
        return boolN != null ? boolN.booleanValue() ? 0 : 4 : (this.f22971y == null || this.f22971y.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h() {
        /*
            r6 = this;
            boolean r0 = r6.f22968v
            if (r0 == 0) goto L96
            ec.l1 r0 = r6.g
            m(r0)
            r0.B()
            java.lang.Boolean r0 = r6.f22969w
            tb.a r1 = r6.f22957k
            if (r0 == 0) goto L34
            long r2 = r6.f22970x
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L8f
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f22970x
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L8f
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f22970x = r0
            ec.l4 r0 = r6.f22956i
            k(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.Z(r1)
            r2 = 0
            if (r1 == 0) goto L75
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.Z(r1)
            if (r1 == 0) goto L75
            android.content.Context r1 = r6.f22949a
            j1.q r3 = ub.b.a(r1)
            boolean r3 = r3.f()
            r4 = 1
            if (r3 != 0) goto L74
            ec.g r3 = r6.f22952d
            boolean r3 = r3.E()
            if (r3 != 0) goto L74
            boolean r3 = ec.l4.s0(r1)
            if (r3 == 0) goto L75
            boolean r1 = ec.l4.U(r1)
            if (r1 == 0) goto L75
        L74:
            r2 = r4
        L75:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r6.f22969w = r1
            if (r2 == 0) goto L8f
            ec.l0 r1 = r6.r()
            java.lang.String r1 = r1.I()
            boolean r0 = r0.F(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f22969w = r0
        L8f:
            java.lang.Boolean r0 = r6.f22969w
            boolean r0 = r0.booleanValue()
            return r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.o1.h():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r20, java.lang.Throwable r21, byte[] r22) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.o1.i(int, java.lang.Throwable, byte[]):void");
    }

    public final o0 n() {
        return this.j;
    }

    public final n0 o() {
        l(this.f22963q);
        return this.f22963q;
    }

    public final j3 p() {
        l(this.f22964r);
        return this.f22964r;
    }

    public final p q() {
        m(this.f22965s);
        return this.f22965s;
    }

    public final l0 r() {
        l(this.f22966t);
        return this.f22966t;
    }
}
