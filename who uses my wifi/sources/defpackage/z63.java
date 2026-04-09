package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z63 {
    public final Context a;
    public final Executor b;
    public final th2 c;
    public final s23 d;
    public final u23 e;
    public final FrameLayout f;
    public vz1 g;
    public final go2 h;
    public final ea3 i;
    public final wo2 j;
    public final k83 k;
    public q93 l;
    public boolean m;
    public nx2 n;
    public y23 o;

    public z63(Context context, Executor executor, xe4 xe4Var, th2 th2Var, s23 s23Var, u23 u23Var, k83 k83Var, wo2 wo2Var) {
        this.a = context;
        this.b = executor;
        this.c = th2Var;
        this.d = s23Var;
        this.e = u23Var;
        this.k = k83Var;
        this.h = new go2((ScheduledExecutorService) th2Var.d.d(), (ym) th2Var.f.d(), (mv2) th2Var.j.d());
        this.i = th2Var.c();
        this.f = new FrameLayout(context);
        this.j = wo2Var;
        k83Var.b = xe4Var;
        this.m = true;
        this.n = null;
        this.o = null;
    }

    public final boolean a(pc4 pc4Var, String str, m54 m54Var, y23 y23Var) {
        boolean z;
        da3 da3Var;
        bi2 bi2Var;
        Executor executor = this.b;
        if (str == null) {
            gi2.Z("Ad unit ID should not be null for banner ad.");
            executor.execute(new bs2(16, this));
            return false;
        }
        boolean zB = b();
        k83 k83Var = this.k;
        if (!zB) {
            iz1 iz1Var = mz1.I9;
            tw1 tw1Var = tw1.e;
            boolean zBooleanValue = ((Boolean) tw1Var.c.a(iz1Var)).booleanValue();
            th2 th2Var = this.c;
            if (zBooleanValue && pc4Var.k) {
                ((zw2) th2Var.z.d()).b(true);
            }
            Pair pair = new Pair("api-call", Long.valueOf(pc4Var.E));
            hg4.C.k.getClass();
            Bundle bundleC = bd2.C(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
            k83Var.c = str;
            k83Var.a = pc4Var;
            k83Var.t = bundleC;
            l83 l83VarA = k83Var.a();
            int iN = qb1.N(l83VarA);
            Context context = this.a;
            aa3 aa3VarG = aa3.g(context, iN, 3, pc4Var);
            boolean zBooleanValue2 = ((Boolean) c12.d.w()).booleanValue();
            s23 s23Var = this.d;
            Object obj = null;
            if (!zBooleanValue2 || !k83Var.b.p) {
                boolean zBooleanValue3 = ((Boolean) tw1Var.c.a(mz1.O8)).booleanValue();
                FrameLayout frameLayout = this.f;
                wo2 wo2Var = this.j;
                go2 go2Var = this.h;
                if (zBooleanValue3) {
                    th2 th2Var2 = th2Var.b;
                    mm2 mm2Var = new mm2();
                    mm2Var.a = context;
                    mm2Var.b = l83VarA;
                    mm2 mm2Var2 = new mm2(mm2Var);
                    ep2 ep2Var = new ep2();
                    ep2Var.d(s23Var, executor);
                    ep2Var.b(s23Var, executor);
                    fp2 fp2Var = new fp2(ep2Var);
                    f23 f23Var = new f23(0, this.g);
                    z = true;
                    bi2Var = new bi2(th2Var2, new ug0(19, frameLayout), new vq2(yr2.h, obj, 0), new tv2(0, (byte) 0), fp2Var, mm2Var2, new f23(25), f23Var, new l92(go2Var, wo2Var), null, null);
                    da3Var = null;
                } else {
                    z = true;
                    th2 th2Var3 = th2Var.b;
                    mm2 mm2Var3 = new mm2();
                    mm2Var3.a = context;
                    mm2Var3.b = l83VarA;
                    mm2 mm2Var4 = new mm2(mm2Var3);
                    ep2 ep2Var2 = new ep2();
                    HashSet hashSet = (HashSet) ep2Var2.c;
                    ep2Var2.d(s23Var, executor);
                    hashSet.add(new up2(s23Var, executor));
                    hashSet.add(new up2(this.e, executor));
                    ep2Var2.c(s23Var, executor);
                    ((HashSet) ep2Var2.f).add(new up2(s23Var, executor));
                    ((HashSet) ep2Var2.e).add(new up2(s23Var, executor));
                    ((HashSet) ep2Var2.h).add(new up2(s23Var, executor));
                    ep2Var2.a(s23Var, executor);
                    ep2Var2.b(s23Var, executor);
                    ((HashSet) ep2Var2.m).add(new up2(s23Var, executor));
                    fp2 fp2Var2 = new fp2(ep2Var2);
                    f23 f23Var2 = new f23(0, this.g);
                    int i = 0;
                    da3Var = null;
                    bi2Var = new bi2(th2Var3, new ug0(19, frameLayout), new vq2(yr2.h, da3Var, i), new tv2(i, (byte) 0), fp2Var2, mm2Var4, new f23(25), f23Var2, new l92(go2Var, wo2Var), null, null);
                }
                if (((Boolean) n02.c.w()).booleanValue()) {
                    da3Var = (da3) bi2Var.k.d();
                    da3Var.i(3);
                    da3Var.c(pc4Var.u);
                    da3Var.d(pc4Var.r);
                }
                this.o = y23Var;
                nl2 nl2Var = (nl2) bi2Var.r.d();
                q93 q93VarC = nl2Var.c(nl2Var.b());
                this.l = q93VarC;
                p21 p21Var = new p21();
                p21Var.f = da3Var;
                p21Var.g = aa3VarG;
                p21Var.h = bi2Var;
                p21Var.i = this;
                q93VarC.c(new jq3(q93VarC, p21Var, 0), executor);
                return z;
            }
            if (s23Var != null) {
                s23Var.d0(zt0.Q(7, null, null));
            }
        } else if (!k83Var.p) {
            this.m = true;
            return false;
        }
        return false;
    }

    public final boolean b() {
        q93 q93Var = this.l;
        return (q93Var == null || q93Var.h.isDone()) ? false : true;
    }

    public final void c() {
        synchronized (this) {
            try {
                q93 q93Var = this.l;
                if (q93Var != null && q93Var.h.isDone()) {
                    try {
                        ik2 ik2Var = (ik2) this.l.h.get();
                        this.l = null;
                        FrameLayout frameLayout = this.f;
                        frameLayout.removeAllViews();
                        ik2Var.getClass();
                        ViewParent parent = ik2Var.m.getParent();
                        if (parent instanceof ViewGroup) {
                            String str = ik2Var.f.f;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                            sb.append("Banner view provided from ");
                            sb.append(str);
                            sb.append(" already has a parent view. Removing its old parent.");
                            gi2.i0(sb.toString());
                            ((ViewGroup) parent).removeView(ik2Var.m);
                        }
                        iz1 iz1Var = mz1.O8;
                        tw1 tw1Var = tw1.e;
                        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                            ug0 ug0Var = ik2Var.g.f;
                            s23 s23Var = this.d;
                            po2 po2Var = (po2) ug0Var.g;
                            po2Var.g = s23Var;
                            po2Var.h = this.e;
                        }
                        frameLayout.addView(ik2Var.m);
                        y23 y23Var = this.o;
                        if (y23Var != null) {
                            y23Var.w(ik2Var);
                        }
                        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                            Executor executor = this.b;
                            s23 s23Var2 = this.d;
                            Objects.requireNonNull(s23Var2);
                            executor.execute(new bs2(17, s23Var2));
                        }
                        int i = ((c83) ik2Var.a.b.g).d;
                        if (i >= 0) {
                            this.m = false;
                            go2 go2Var = this.h;
                            go2Var.U1(i);
                            go2Var.V1(ik2Var.d());
                        } else {
                            this.m = true;
                            this.h.U1(ik2Var.d());
                        }
                    } catch (InterruptedException | ExecutionException unused) {
                        e();
                        gi2.R();
                        this.m = true;
                        this.h.r();
                    }
                } else if (this.l != null) {
                    gi2.G("Show timer went off but there is an ongoing ad request.");
                    this.m = true;
                } else {
                    gi2.G("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.m = true;
                    this.h.r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        Object parent = this.f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        lf4 lf4Var = hg4.C.c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return lf4.r(view, powerManager, keyguardManager);
    }

    public final void e() {
        this.l = null;
        nx2 nx2Var = this.n;
        this.n = null;
        if (((Boolean) tw1.e.c.a(mz1.O8)).booleanValue() && nx2Var != null) {
            this.b.execute(new sz2(this, nx2Var, 6));
        }
        y23 y23Var = this.o;
        if (y23Var != null) {
            y23Var.mo8a();
        }
    }
}
