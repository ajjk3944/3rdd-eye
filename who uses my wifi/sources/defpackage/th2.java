package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class th2 {
    public static th2 P0;
    public final ba4 A;
    public final ba4 A0;
    public final ba4 B;
    public final qi2 B0;
    public final ba4 C;
    public final ba4 C0;
    public final da4 D;
    public final ba4 D0;
    public final ba4 E;
    public final ba4 E0;
    public final li2 F;
    public final rv1 F0;
    public final ba4 G;
    public final ba4 G0;
    public final ba4 H;
    public final hk2 H0;
    public final ba4 I;
    public final ba4 I0;
    public final ba4 J;
    public final ba4 J0;
    public final ba4 K;
    public final ba4 K0;
    public final ba4 L;
    public final ba4 L0;
    public final ba4 M;
    public final ba4 M0;
    public final ba4 N;
    public final ba4 N0;
    public final ba4 O;
    public final ba4 O0;
    public final ba4 P;
    public final ba4 Q;
    public final oh2 R;
    public final rh2 S;
    public final ba4 T;
    public final ba4 U;
    public final qh2 V;
    public final ba4 W;
    public final fh2 X;
    public final ba4 Y;
    public final ba4 Z;
    public final eh2 a;
    public final ba4 a0;
    public final th2 b = this;
    public final ba4 b0;
    public final ba4 c;
    public final z43 c0;
    public final ba4 d;
    public final ba4 d0;
    public final ba4 e;
    public final ba4 e0;
    public final ba4 f;
    public final b43 f0;
    public final hh2 g;
    public final ba4 g0;
    public final ph2 h;
    public final l53 h0;
    public final ba4 i;
    public final ba4 i0;
    public final ba4 j;
    public final x53 j0;
    public final ba4 k;
    public final ba4 k0;
    public final ba4 l;
    public final ba4 l0;
    public final ba4 m;
    public final ba4 m0;
    public final ba4 n;
    public final ba4 n0;
    public final ba4 o;
    public final ba4 o0;
    public final ba4 p;
    public final r33 p0;
    public final ba4 q;
    public final ba4 q0;
    public final ba4 r;
    public final d33 r0;
    public final ba4 s;
    public final ba4 s0;
    public final ba4 t;
    public final x33 t0;
    public final ba4 u;
    public final ba4 u0;
    public final ba4 v;
    public final ba4 v0;
    public final ba4 w;
    public final s43 w0;
    public final ba4 x;
    public final ba4 x0;
    public final lh2 y;
    public final ba4 y0;
    public final ba4 z;
    public final ba4 z0;

    public th2(eh2 eh2Var, sd2 sd2Var) {
        this.a = eh2Var;
        ba4 ba4VarA = ba4.a(pu1.p);
        this.c = ba4VarA;
        ba4 ba4VarA2 = ba4.a(new sw2(ba4.a(uk2.n), 11));
        this.d = ba4VarA2;
        this.e = ba4.a(g82.m);
        int i = 5;
        ba4 ba4VarA3 = ba4.a(new p63(i));
        this.f = ba4VarA3;
        hh2 hh2Var = new hh2(eh2Var);
        this.g = hh2Var;
        ga4 ga4VarA = ia4.a(new nh2(hh2Var, ba4.a(new gh2(eh2Var, i)), 1));
        ph2 ph2Var = new ph2(eh2Var);
        this.h = ph2Var;
        int i2 = 0;
        ba4 ba4VarA4 = ba4.a(new wb2(ga4VarA, new xk(hh2Var, ph2Var, i2), hh2Var, 12));
        this.i = ba4VarA4;
        int i3 = 19;
        ba4 ba4VarA5 = ba4.a(new gr2(ba4VarA4, i3));
        this.j = ba4VarA5;
        ba4 ba4VarA6 = ba4.a(yb.n);
        this.k = ba4VarA6;
        this.l = ba4.a(new bh2(ba4VarA6, ba4VarA5, i2));
        ba4 ba4VarA7 = ba4.a(new xk(hh2Var, ph2Var, 2));
        this.m = ba4VarA7;
        lc2 lc2Var = new lc2(hh2Var, 3);
        ba4 ba4VarA8 = ba4.a(um.q);
        this.n = ba4VarA8;
        ba4 ba4VarA9 = ba4.a(new rc2(lc2Var, ba4VarA8, i3));
        this.o = ba4VarA9;
        ba4 ba4VarA10 = ba4.a(new mh2(ba4VarA9, 2));
        this.p = ba4VarA10;
        ba4 ba4VarA11 = ba4.a(new zq2(23));
        this.q = ba4VarA11;
        gh2 gh2Var = new gh2(eh2Var, 2);
        ba4 ba4VarA12 = ba4.a(new rv1(5));
        this.r = ba4VarA12;
        ba4 ba4VarA13 = ba4.a(new bh2(ba4VarA12, ba4VarA4, 9));
        ba4 ba4VarA14 = ba4.a(bd2.m);
        this.s = ba4VarA14;
        ba4 ba4VarA15 = ba4.a(new mh2(ba4VarA14, 0));
        int i4 = ha4.c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(ba4VarA15);
        tm2 tm2Var = new tm2(new ha4(list, arrayList), 17);
        ba4 ba4VarA16 = ba4.a(new bh2(ba4VarA6, ba4VarA2, 1));
        ba4 ba4VarA17 = ba4.a(new e02(hh2Var, ph2Var, ba4VarA8, ba4VarA16));
        this.t = ba4VarA17;
        ba4 ba4VarA18 = ba4.a(new nz1(ba4VarA, hh2Var, gh2Var, ba4VarA9, ba4VarA2, ba4VarA13, ph2Var, tm2Var, ba4VarA17));
        this.u = ba4VarA18;
        int i5 = 10;
        ba4 ba4VarA19 = ba4.a(new rv1(i5));
        this.v = ba4VarA19;
        ba4 ba4VarA20 = ba4.a(new zq2(i5));
        this.w = ba4VarA20;
        ba4 ba4VarA21 = ba4.a(new xk(hh2Var, ph2Var, 1));
        ba4 ba4VarA22 = ba4.a(new lc2(hh2Var, 5));
        ba4 ba4VarA23 = ba4.a(new lc2(hh2Var, 4));
        ba4 ba4VarA24 = ba4.a(new bh2(ba4VarA18, ba4VarA8, 10));
        ba4 ba4VarA25 = ba4.a(new wb2(hh2Var, gh2Var, ba4VarA21, 13));
        this.x = ba4VarA25;
        lh2 lh2Var = new lh2(hh2Var);
        this.y = lh2Var;
        ba4 ba4VarA26 = ba4.a(new es2(ba4VarA21, ba4VarA22, ba4VarA23, hh2Var, ph2Var, ba4VarA24, ba4VarA25, lh2Var));
        this.z = ba4VarA26;
        gh2 gh2Var2 = new gh2(eh2Var, 3);
        ba4 ba4VarA27 = ba4.a(new yl2(hh2Var, ba4VarA17, ph2Var));
        this.A = ba4VarA27;
        this.B = ba4.a(new pi2(hh2Var, ph2Var, ba4VarA9, ba4VarA10, ba4VarA11, ba4VarA18, ba4VarA19, ba4VarA20, ba4VarA26, gh2Var2, ba4VarA17, lc2Var, ba4VarA27, ba4VarA5));
        ba4 ba4VarA28 = ba4.a(new ic2(hh2Var, ph2Var, ba4VarA2, lc2Var, ba4VarA3));
        nh2 nh2Var = new nh2(hh2Var, ba4VarA5);
        this.C = ba4.a(new bh2(ba4.a(new hb3(ba4VarA28, nh2Var, hh2Var, ba4VarA3, 1)), ba4.a(new hb3(ba4VarA28, nh2Var, hh2Var, ba4VarA3, 0)), 15));
        da4 da4VarA = da4.a(this);
        this.D = da4VarA;
        ba4 ba4VarA29 = ba4.a(new bh2(ba4.a(new gh2(eh2Var, 4)), ba4.a(new gh2(eh2Var, 0)), 2));
        this.E = ba4VarA29;
        li2 li2Var = new li2(sd2Var);
        this.F = li2Var;
        ba4 ba4VarA30 = ba4.a(new lc2(hh2Var, 7));
        this.G = ba4VarA30;
        ba4 ba4VarA31 = ba4.a(bd2.n);
        ba4 ba4VarA32 = ba4.a(new sw2(ba4VarA30, 12));
        this.H = ba4VarA32;
        ba4 ba4VarA33 = ba4.a(new ar2(hh2Var, ba4VarA31, ga4VarA, ba4VarA32, ba4VarA17, ba4VarA16));
        this.I = ba4VarA33;
        ba4 ba4VarA34 = ba4.a(new e02(hh2Var, ba4VarA30, ga4VarA, ba4VarA5));
        this.J = ba4VarA34;
        ba4 ba4VarA35 = ba4.a(new sw2(ba4VarA29, 9));
        this.K = ba4VarA35;
        int i6 = 3;
        ba4 ba4VarA36 = ba4.a(new mh2(ba4.a(new nz1(hh2Var, ba4VarA, ba4VarA29, ph2Var, li2Var, ba4VarA30, ba4VarA33, ba4VarA5, ba4VarA34, ba4VarA35)), i6));
        this.L = ba4VarA36;
        ba4 ba4VarA37 = ba4.a(new nh2(hh2Var, ba4VarA4, 4));
        ba4 ba4VarA38 = ba4.a(new xk(hh2Var, ph2Var, i6));
        this.M = ba4.a(new rr1(da4VarA, hh2Var, ba4VarA29, ba4VarA36, ba4VarA2, ba4VarA4, ba4VarA33, ph2Var, new e02(ba4VarA2, ba4VarA37, ba4VarA38, ba4VarA4, 0), ba4VarA35, ba4VarA37, ba4VarA38));
        this.N = ba4.a(new sw2(ba4VarA4, 15));
        this.O = ba4.a(zt0.m);
        this.P = ba4.a(new lc2(hh2Var, 0));
        int i7 = 1;
        int i8 = 16;
        this.Q = ba4.a(new u12(17, new bh2(ba4.a(new u12(23, new gh2(eh2Var, i7))), ba4.a(new gr2(ba4VarA5, 7)), i8)));
        this.R = new oh2(da4VarA);
        this.S = new rh2(hh2Var, ba4VarA17);
        this.T = ba4.a(um.p);
        int i9 = 2;
        ba4 ba4VarA39 = ba4.a(new rv1(i9));
        this.U = ba4VarA39;
        this.V = new qh2(ba4VarA39);
        this.W = ba4.a(new gr2(ba4VarA3, 20));
        this.X = new fh2(ba4VarA39);
        ba4 ba4VarA40 = ba4.a(new lc2(hh2Var, i7));
        this.Y = ba4VarA40;
        ba4 ba4VarA41 = ba4.a(new nh2(hh2Var, ba4VarA40, 0));
        this.Z = ba4VarA41;
        this.a0 = ba4.a(new wb2(new nh2(hh2Var, ba4VarA7, i9), ba4VarA3, ba4VarA5, 18));
        this.b0 = ba4.a(um.r);
        z43 z43Var = new z43(ba4VarA40, ba4VarA41, hh2Var);
        this.c0 = z43Var;
        this.d0 = ba4.a(new wb2(z43Var, ba4VarA3, ba4VarA5, 24));
        this.e0 = ba4.a(a30.p);
        b43 b43Var = new b43(hh2Var);
        this.f0 = b43Var;
        this.g0 = ba4.a(new wb2(b43Var, ba4VarA3, ba4VarA5, 22));
        l53 l53Var = new l53(hh2Var, ph2Var, lh2Var);
        this.h0 = l53Var;
        this.i0 = ba4.a(new wb2(l53Var, ba4VarA3, ba4VarA5, 25));
        x53 x53Var = new x53(hh2Var);
        this.j0 = x53Var;
        this.k0 = ba4.a(new wb2(x53Var, ba4VarA3, ba4VarA5, 26));
        int i10 = 8;
        this.l0 = ba4.a(new wb2(new lc2(hh2Var, i10), ba4VarA3, ba4VarA5, i8));
        this.m0 = ba4.a(new bh2(ba4VarA3, ba4VarA5, 12));
        this.n0 = ba4.a(g82.l);
        this.o0 = ba4.a(new bh2(ba4VarA3, ba4VarA5, 13));
        r33 r33Var = new r33(ba4VarA39);
        this.p0 = r33Var;
        this.q0 = ba4.a(new wb2(r33Var, ba4VarA3, ba4VarA5, 20));
        d33 d33Var = new d33(hh2Var);
        this.r0 = d33Var;
        this.s0 = ba4.a(new wb2(d33Var, ba4VarA3, ba4VarA5, 19));
        x33 x33Var = new x33(ph2Var);
        this.t0 = x33Var;
        this.u0 = ba4.a(new wb2(x33Var, ba4VarA3, ba4VarA5, 21));
        ba4 ba4VarA42 = ba4.a(new rv1(4));
        this.v0 = ba4VarA42;
        s43 s43Var = new s43(hh2Var, ba4VarA42);
        this.w0 = s43Var;
        this.x0 = ba4.a(new wb2(s43Var, ba4VarA3, ba4VarA5, 23));
        this.y0 = ba4.a(i41.r);
        int i11 = 6;
        ba4 ba4VarA43 = ba4.a(new gh2(eh2Var, i11));
        this.z0 = ba4VarA43;
        this.A0 = ba4.a(new wb2(new lc2(hh2Var, 9), ba4VarA3, ba4VarA5, 17));
        this.B0 = new qi2(hh2Var);
        this.C0 = ba4.a(qb1.t);
        this.D0 = ba4.a(gi2.h);
        this.E0 = ba4.a(new mh2(ba4VarA9, 1));
        this.F0 = new rv1(i10);
        this.G0 = ba4.a(new yl2(hh2Var, ph2Var, ba4VarA17));
        this.H0 = new hk2(ba4VarA2, ba4VarA3, ba4VarA5);
        this.I0 = ba4.a(ob1.n);
        this.J0 = ba4.a(ou1.q);
        this.K0 = ba4.a(new lc2(hh2Var, 2));
        this.L0 = ba4.a(new gr2(ba4VarA5, 3));
        this.M0 = ba4.a(gi2.e);
        this.N0 = ba4.a(new ic2(hh2Var, ba4VarA43, ba4VarA41, ba4.a(new lc2(hh2Var, i11)), ba4VarA2, 0));
        this.O0 = ba4.a(new lc2(hh2Var, 10));
    }

    public static th2 a(Context context, u62 u62Var, int i) {
        pq3 pq3Var;
        SharedPreferences sharedPreferences;
        synchronized (th2.class) {
            try {
                th2 th2Var = P0;
                if (th2Var != null) {
                    return th2Var;
                }
                hg4 hg4Var = hg4.C;
                hg4Var.k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                mz1.a(context);
                if (((Boolean) m02.e.w()).booleanValue() && (sharedPreferences = context.getSharedPreferences("admob", 0)) != null) {
                    sharedPreferences.edit().putInt("init_without_write", i41.S(context, "init_without_write") + 1).commit();
                }
                t83 t83VarS = t83.S(context);
                boolean zF = lf4.f((Context) t83VarS.g);
                e51 e51Var = new e51(ModuleDescriptor.MODULE_VERSION, i, 0, true, zF);
                if (((Boolean) t02.c.w()).booleanValue()) {
                    nm2 nm2Var = (nm2) t83VarS.h;
                    w63 liteSdkVersion = null;
                    if (nm2Var != null) {
                        try {
                            liteSdkVersion = nm2Var.getLiteSdkVersion();
                        } catch (RemoteException unused) {
                        }
                    }
                    if (liteSdkVersion != null) {
                        e51Var = new e51(ModuleDescriptor.MODULE_VERSION, liteSdkVersion.g, 0, true, zF);
                    }
                }
                t83VarS.X(u62Var);
                eh2 eh2Var = new eh2();
                eh2Var.a = e51Var;
                eh2Var.d = new WeakReference(context);
                eh2Var.b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                eh2Var.c = jCurrentTimeMillis;
                eh2 eh2Var2 = new eh2();
                eh2Var2.a = eh2Var.a;
                eh2Var2.b = eh2Var.b;
                eh2Var2.d = eh2Var.d;
                eh2Var2.c = eh2Var.c;
                th2 th2Var2 = new th2(eh2Var2, new sd2(4));
                iz1 iz1Var = mz1.se;
                tw1 tw1Var = tw1.e;
                if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                    jd2 jd2Var = hg4Var.e;
                    ld2 ld2Var = md2.a;
                    i41.M(ld2Var);
                    jd2Var.a(ld2Var, (mv2) th2Var2.j.d());
                    jd2 jd2Var2 = hg4Var.e;
                    if (jd2Var2.c.get() && jd2Var2.e >= 0 && jd2Var2.f >= 0 && jd2Var2.d.compareAndSet(false, true) && (pq3Var = jd2Var2.a) != null) {
                        ((ld2) pq3Var).a(new fu1(11, jd2Var2));
                    }
                }
                ((gx2) th2Var2.m.d()).a();
                ((ah2) th2Var2.l.d()).a(context, e51Var);
                hg4Var.h.b(context, e51Var, (mv2) th2Var2.j.d());
                hg4Var.j.n(context);
                hg4Var.c.B(context);
                hg4Var.c.C(context);
                ob1.u(context);
                hg4Var.g.b(context);
                hg4Var.z.b(context);
                if (((Boolean) tw1Var.c.a(mz1.Le)).booleanValue()) {
                    String str = (String) tw1Var.c.a(mz1.Me);
                    if (!str.isEmpty()) {
                        if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                            ((uu2) th2Var2.Q.d()).a(hg4Var.g);
                        }
                    }
                } else if (((Boolean) tw1Var.c.a(mz1.Ke)).booleanValue()) {
                    ((uu2) th2Var2.Q.d()).a(hg4Var.g);
                }
                ((ib2) th2Var2.P.d()).a();
                mc2.m(context);
                if (((Boolean) tw1Var.c.a(mz1.C6)).booleanValue()) {
                    if (!((Boolean) tw1Var.c.a(mz1.G0)).booleanValue()) {
                        cx1 cx1Var = new cx1(new wy0(context, 4));
                        wt2 wt2Var = new wt2(new cz2(context), (pq3) th2Var2.e.d(), 2, false);
                        try {
                            wt2Var.e(new nb(new t83(context, e51Var, cx1Var, wt2Var), hg4Var.h.g().s()));
                        } catch (Exception e) {
                            gi2.Z("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                }
                if (((Boolean) tw1.e.c.a(mz1.Ee)).booleanValue()) {
                    Context context2 = th2Var2.a.b;
                    i41.M(context2);
                    ld2 ld2Var2 = md2.a;
                    i41.M(ld2Var2);
                    ld2Var2.execute(new bs2(8, new xb4(th2Var2, context2, ld2Var2)));
                }
                P0 = th2Var2;
                return th2Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Executor b() {
        return (Executor) this.c.d();
    }

    public final ea3 c() {
        return (ea3) this.t.d();
    }
}
