package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ps1 implements rs1 {
    public static ps1 w;
    public final Context f;
    public final mc2 g;
    public final de3 h;
    public final fe3 i;
    public final ft1 j;
    public final gd3 k;
    public final Executor l;
    public final av1 m;
    public final pt1 p;
    public final xe1 q;
    public final dm1 r;
    public volatile boolean u;
    public volatile boolean v;
    public volatile long s = 0;
    public final Object t = new Object();
    public final CountDownLatch o = new CountDownLatch(1);
    public final us0 n = new us0();

    public ps1(Context context, gd3 gd3Var, mc2 mc2Var, de3 de3Var, fe3 fe3Var, ft1 ft1Var, Executor executor, fd3 fd3Var, av1 av1Var, pt1 pt1Var, xe1 xe1Var, dm1 dm1Var) {
        this.v = false;
        this.f = context;
        this.k = gd3Var;
        this.g = mc2Var;
        this.h = de3Var;
        this.i = fe3Var;
        this.j = ft1Var;
        this.l = executor;
        this.m = av1Var;
        this.p = pt1Var;
        this.q = xe1Var;
        this.r = dm1Var;
        this.v = false;
    }

    public static synchronized ps1 m(Context context, ExecutorService executorService, id3 id3Var, boolean z) {
        try {
            if (w == null) {
                gd3 gd3VarA = gd3.a(context, executorService, z);
                iz1 iz1Var = mz1.J3;
                tw1 tw1Var = tw1.e;
                zs1 zs1VarD = ((Boolean) tw1Var.c.a(iz1Var)).booleanValue() ? zs1.D(context) : null;
                pt1 pt1VarA = ((Boolean) tw1Var.c.a(mz1.K3)).booleanValue() ? pt1.a(context, executorService) : null;
                xe1 xe1Var = ((Boolean) tw1Var.c.a(mz1.S2)).booleanValue() ? new xe1() : null;
                dm1 dm1Var = ((Boolean) tw1Var.c.a(mz1.b3)).booleanValue() ? new dm1() : null;
                p21 p21VarX = p21.x(context, executorService, gd3VarA);
                et1 et1Var = new et1(context);
                ft1 ft1Var = new ft1(id3Var, p21VarX, new nt1(context, et1Var), et1Var, zs1VarD, pt1VarA, xe1Var, dm1Var);
                av1 av1VarJ = gi2.J(context, gd3VarA);
                fd3 fd3Var = new fd3();
                ps1 ps1Var = new ps1(context, gd3VarA, new mc2(context, av1VarJ), new de3(context, av1VarJ, new ug0(13, gd3VarA), ((Boolean) tw1Var.c.a(mz1.C2)).booleanValue()), new fe3(context, ft1Var, gd3VarA, fd3Var, false), ft1Var, executorService, fd3Var, av1VarJ, pt1VarA, xe1Var, dm1Var);
                w = ps1Var;
                ps1Var.j();
                w.k();
            }
        } catch (Throwable th) {
            throw th;
        }
        return w;
    }

    @Override // defpackage.rs1
    public final void a(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) tw1.e.c.a(mz1.Lc)).booleanValue() || (displayMetrics = this.f.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = displayMetrics.density;
        float f3 = i2;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f * f2, f3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        f(motionEventObtain);
        motionEventObtain.recycle();
        float f4 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * f4, f3 * f4, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        f(motionEventObtain2);
        motionEventObtain2.recycle();
        float f5 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i3, 1, f * f5, f3 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        f(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // defpackage.rs1
    public final String b(Context context) {
        return "19";
    }

    @Override // defpackage.rs1
    public final void c(StackTraceElement[] stackTraceElementArr) {
        dm1 dm1Var = this.r;
        if (dm1Var != null) {
            dm1Var.a = new ArrayList(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // defpackage.rs1
    public final String d(Context context) {
        pt1 pt1Var = this.p;
        if (pt1Var != null && pt1Var.d) {
            pt1Var.b = System.currentTimeMillis();
        }
        if (((Boolean) tw1.e.c.a(mz1.S2)).booleanValue()) {
            xe1 xe1Var = this.q;
            xe1Var.b = xe1Var.a;
            xe1Var.a = SystemClock.uptimeMillis();
        }
        k();
        de3 de3VarB = this.i.b();
        if (de3VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = de3VarB.a(context);
        this.k.e(5001, System.currentTimeMillis() - jCurrentTimeMillis, null, strA, null);
        return strA;
    }

    @Override // defpackage.rs1
    public final void e(View view) {
        this.j.c.a(view);
    }

    @Override // defpackage.rs1
    public final void f(MotionEvent motionEvent) {
        de3 de3VarB = this.i.b();
        if (de3VarB != null) {
            try {
                de3VarB.i(motionEvent);
            } catch (ee3 e) {
                this.k.c(e.f, -1L, e);
            }
        }
    }

    @Override // defpackage.rs1
    public final String g(Context context, String str, View view) {
        return h(context, str, view, null);
    }

    @Override // defpackage.rs1
    public final String h(Context context, String str, View view, Activity activity) {
        pt1 pt1Var = this.p;
        if (pt1Var != null && pt1Var.d) {
            pt1Var.b = System.currentTimeMillis();
        }
        if (((Boolean) tw1.e.c.a(mz1.S2)).booleanValue()) {
            xe1 xe1Var = this.q;
            xe1Var.h = xe1Var.g;
            xe1Var.g = SystemClock.uptimeMillis();
        }
        k();
        de3 de3VarB = this.i.b();
        if (de3VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strH = de3VarB.h(context, str, view, activity);
        this.k.e(5000, System.currentTimeMillis() - jCurrentTimeMillis, null, strH, null);
        return strH;
    }

    @Override // defpackage.rs1
    public final String i(Context context, View view, Activity activity) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        pt1 pt1Var = this.p;
        if (pt1Var != null && pt1Var.d) {
            pt1Var.b = System.currentTimeMillis();
        }
        if (((Boolean) tw1.e.c.a(mz1.S2)).booleanValue()) {
            this.q.b(context, view);
        }
        k();
        de3 de3VarB = this.i.b();
        if (de3VarB == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = de3VarB.e(context, view, activity);
        this.k.e(5002, System.currentTimeMillis() - jCurrentTimeMillis, null, strE, null);
        return strE;
    }

    public final synchronized void j() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        g4 g4VarN = n();
        if (g4VarN == null) {
            this.k.b(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.i.a(g4VarN)) {
            this.v = true;
            this.o.countDown();
        }
    }

    public final void k() {
        g4 g4Var;
        if (this.u) {
            return;
        }
        synchronized (this.t) {
            try {
                if (!this.u) {
                    if ((System.currentTimeMillis() / 1000) - this.s < 3600) {
                        return;
                    }
                    fe3 fe3Var = this.i;
                    synchronized (fe3Var.g) {
                        try {
                            de3 de3Var = fe3Var.f;
                            g4Var = de3Var != null ? (g4) de3Var.h : null;
                        } finally {
                        }
                    }
                    if ((g4Var == null || ((fv1) g4Var.g).C() - (System.currentTimeMillis() / 1000) < 3600) && gi2.H(this.m)) {
                        this.l.execute(new a9(26, this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        String strA;
        String strB;
        int length;
        g4 g4VarN;
        fv1 fv1Var;
        boolean zJ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        g4 g4VarN2 = n();
        if (g4VarN2 != null) {
            strA = ((fv1) g4VarN2.g).A();
            strB = ((fv1) g4VarN2.g).B();
        } else {
            strA = null;
            strB = null;
        }
        try {
            try {
                Context context = this.f;
                av1 av1Var = this.m;
                gd3 gd3Var = this.k;
                ce3 ce3VarG = bd2.G(context, av1Var, strA, strB, gd3Var);
                byte[] bArr = ce3VarG.g;
                if (bArr == null || (length = bArr.length) == 0) {
                    gd3Var.b(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        y44 y44VarN = a54.n(bArr, 0, length);
                        h54 h54Var = h54.a;
                        int i = u44.a;
                        bv1 bv1VarD = bv1.D(y44VarN, h54.b);
                        if (bv1VarD.A().A().isEmpty() || bv1VarD.A().B().isEmpty() || bv1VarD.C().p().length == 0 || ((g4VarN = n()) != null && (fv1Var = (fv1) g4VarN.g) != null && bv1VarD.A().A().equals(fv1Var.A()) && bv1VarD.A().B().equals(fv1Var.B()))) {
                            this.k.b(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            us0 us0Var = this.n;
                            int i2 = ce3VarG.h;
                            if (!((Boolean) tw1.e.c.a(mz1.A2)).booleanValue()) {
                                zJ = this.g.j(bv1VarD, us0Var);
                            } else if (i2 == 3) {
                                zJ = this.h.g(bv1VarD);
                            } else {
                                if (i2 == 4) {
                                    zJ = this.h.d(bv1VarD, us0Var);
                                }
                                this.k.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zJ) {
                                g4 g4VarN3 = n();
                                if (g4VarN3 != null) {
                                    if (this.i.a(g4VarN3)) {
                                        this.v = true;
                                    }
                                    this.s = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.k.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.k.b(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (a64 e) {
                this.k.c(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
            }
            this.o.countDown();
        } catch (Throwable th) {
            this.o.countDown();
            throw th;
        }
    }

    public final g4 n() {
        if (gi2.H(this.m)) {
            if (((Boolean) tw1.e.c.a(mz1.A2)).booleanValue()) {
                de3 de3Var = this.h;
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (de3.k) {
                    try {
                        fv1 fv1VarR = de3Var.r(1);
                        if (fv1VarR == null) {
                            de3Var.p(4022, jCurrentTimeMillis);
                            return null;
                        }
                        File fileJ = de3Var.j(fv1VarR.A());
                        File file = new File(fileJ, "pcam.jar");
                        if (!file.exists()) {
                            file = new File(fileJ, "pcam");
                        }
                        File file2 = new File(fileJ, "pcbc");
                        File file3 = new File(fileJ, "pcopt");
                        de3Var.p(5016, jCurrentTimeMillis);
                        return new g4(fv1VarR, file, file2, file3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            mc2 mc2Var = this.g;
            fv1 fv1VarR2 = mc2Var.r(1);
            if (fv1VarR2 != null) {
                String strA = fv1VarR2.A();
                File fileJ2 = uk2.J(strA, "pcam.jar", mc2Var.v());
                if (!fileJ2.exists()) {
                    fileJ2 = uk2.J(strA, "pcam", mc2Var.v());
                }
                return new g4(fv1VarR2, fileJ2, uk2.J(strA, "pcbc", mc2Var.v()), uk2.J(strA, "pcopt", mc2Var.v()));
            }
        }
        return null;
    }
}
