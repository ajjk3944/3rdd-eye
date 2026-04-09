package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ic2 implements ca4 {
    public final /* synthetic */ int a;
    public final ga4 b;
    public final Object c;
    public final ga4 d;
    public final ga4 e;
    public final ga4 f;

    public /* synthetic */ ic2(Object obj, ga4 ga4Var, ca4 ca4Var, ba4 ba4Var, ga4 ga4Var2, int i) {
        this.a = i;
        this.c = obj;
        this.d = ga4Var;
        this.e = ca4Var;
        this.b = ba4Var;
        this.f = ga4Var2;
    }

    public rm2 a() {
        return new rm2(((ll2) this.c).a(), (String) ((ll2) this.b).b.i, (e03) this.d.d(), ((ll2) this.e).b.G(), (String) this.f.d());
    }

    public gz2 b() {
        return new gz2(((hh2) ((ga4) this.c)).a(), ((rr1) this.d).a(), (ez2) ((ba4) this.b).d(), ((rc2) this.e).a(), ((fh2) this.f).d());
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new lu1(((hh2) this.c).a(), ((Long) ((ba4) this.b).d()).longValue(), (PackageInfo) ((ba4) this.d).d(), (nn2) ((ba4) this.e).d(), (ScheduledExecutorService) ((ba4) this.f).d());
            case 1:
                return new xk2(((hh2) ((ga4) this.c)).a(), (ag2) ((mk2) this.d).b.i, ((ll2) this.e).a(), ((ph2) this.f).a(), (wz2) ((ba4) this.b).d());
            case 2:
                cn2 cn2Var = (cn2) ((ba4) this.b).d();
                a83 a83VarA = ((ll2) this.c).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.e.d();
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new fm2(cn2Var, a83VarA, scheduledExecutorService, ld2Var, (String) ((ll2) this.f).b.i, (co2) ((ba4) this.d).d());
            case 3:
                return new im2(((ll2) this.c).b(), ((ll2) this.b).a(), (ym) this.d.d(), (mv2) this.e.d(), (ScheduledExecutorService) this.f.d());
            case 4:
                return a();
            case 5:
                return new rq2(((hh2) ((ga4) this.c)).a(), (ag2) ((kq2) this.d).b.g, ((ll2) this.e).a(), ((ph2) this.f).a(), (wz2) ((ba4) this.b).d());
            case 6:
                qk2 qk2Var = (qk2) this.c;
                nc2 nc2Var = new nc2(((hh2) qk2Var.b).a(), ((qm2) qk2Var.c).a().g);
                Context contextA = ((hh2) this.b).a();
                oc2 oc2Var = (oc2) this.d.d();
                ag2 ag2Var = (ag2) ((kq2) this.e).b.g;
                return new tq2(nc2Var, contextA, oc2Var, ag2Var == null ? null : ag2Var.t(), (dx1) this.f.d());
            case 7:
                Map mapB = ((ea4) this.c).d();
                Map mapB2 = ((ea4) this.d).d();
                Map mapB3 = ((ea4) this.e).d();
                yr2 yr2Var = (yr2) ((xq2) this.f).a.g;
                i41.M(yr2Var);
                return new uq2(mapB, mapB2, mapB3, (ba4) this.b, yr2Var);
            case 8:
                Context contextA2 = ((hh2) ((ga4) this.c)).a();
                String packageName = ((hh2) ((ri2) this.d).b).a().getPackageName();
                i41.M(packageName);
                e51 e51VarA = ((ph2) this.e).a();
                dx1 dx1Var = (dx1) this.f.d();
                String str = (String) ((ba4) this.b).d();
                cx1 cx1Var = new cx1(new wy0(contextA2, 4));
                tx1 tx1VarB = ux1.B();
                int i = e51VarA.g;
                tx1VarB.b();
                ((ux1) tx1VarB.g).C(i);
                int i2 = e51VarA.h;
                tx1VarB.b();
                ((ux1) tx1VarB.g).D(i2);
                int i3 = true != e51VarA.i ? 2 : 0;
                tx1VarB.b();
                ((ux1) tx1VarB.g).A(i3);
                cx1Var.a(new p21(dx1Var, packageName, (ux1) tx1VarB.d(), str));
                return cx1Var;
            case 9:
                Context contextA3 = ((hh2) ((ga4) this.c)).a();
                ld2 ld2Var2 = md2.a;
                i41.M(ld2Var2);
                ts0 ts0Var = new ts0();
                th2 th2Var = (th2) ((oh2) this.b).a.a;
                i41.M(th2Var);
                return new xy2(contextA3, ld2Var2, ts0Var, th2Var, new zs1(23, ((rh2) ((ri2) this.d).b).d()), (ArrayDeque) this.e.d(), (ea3) this.f.d());
            case 10:
                return b();
            case 11:
                return new wz2(((hh2) ((ga4) this.c)).a(), ((ph2) this.b).a(), ((ll2) this.d).a(), (ag2) ((ca4) this.e).d(), (mv2) this.f.d());
            case 12:
                return new t03((Context) ((ba4) this.b).d(), (Executor) ((ga4) this.c).d(), (ei2) ((da4) this.d).a, (z73) this.e.d(), (mv2) this.f.d());
            case 13:
                return new k13((th2) ((ga4) this.c).d(), ((om2) this.e).b.b(), ((gp2) this.f).b, (o13) ((ba4) this.b).d(), (e03) ((ba4) this.d).d());
            case 14:
                ym ymVar = (ym) this.d.d();
                q13 q13Var = (q13) this.e;
                t83 t83Var = new t83((s83) q13Var.b.d(), (xu2) q13Var.c.d(), (mv2) q13Var.d.d(), 26, false);
                e03 e03Var = (e03) ((ba4) this.b).d();
                eb3 eb3Var = (eb3) this.f.d();
                o13 o13Var = (o13) ((f23) this.c).g;
                return o13Var != null ? o13Var : new o13(ymVar, t83Var, e03Var, eb3Var);
            case 15:
                return new t03((Context) ((ba4) this.b).d(), (bi2) ((da4) this.c).a, (u93) ((ba4) this.d).d(), (pq3) this.e.d(), (vz1) ((g23) this.f).b.g);
            case 16:
                return new n23((Context) ((ga4) this.c).d(), (d32) ((wq2) this.b).a.h, ((qm2) this.d).a(), ((jk2) ((u12) this.e).b).a(), (mv2) this.f.d());
            case 17:
                us0 us0Var = new us0();
                Context contextA4 = ((hh2) ((ga4) this.c)).a();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.b.d();
                ld2 ld2Var3 = md2.a;
                i41.M(ld2Var3);
                return new a63(us0Var, contextA4, scheduledExecutorService2, ld2Var3, ((n63) this.d).b.g, ((fa2) ((n63) this.e).b.h).q, ((fa2) ((n63) this.f).b.h).p);
            case 18:
                return new q73((Context) ((da4) this.c).a, (Executor) this.e.d(), (th2) this.f.d(), (s23) ((ba4) this.b).d(), (s73) ((ba4) this.d).d(), new k83());
            case 19:
                return new ub3(((hh2) this.c).a(), ((ph2) this.e).a(), (ScheduledExecutorService) ((ba4) this.b).d(), t83.S(((lc2) this.f).b.a()), (ym) ((ba4) this.d).d());
            case 20:
                Context context = (Context) ((da4) this.c).a;
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) ((ba4) this.b).d();
                ExecutorService executorService = (ExecutorService) ((da4) this.e).a;
                hg3 hg3Var = (hg3) ((ba4) this.d).d();
                vf3 vf3Var = (vf3) ((da4) this.f).a;
                return new wg3(context, scheduledExecutorService3, executorService, hg3Var, new Random(), vf3Var.G().A(), vf3Var.G().C(), vf3Var.G().D(), vf3Var.G().B(), vf3Var.E(), vf3Var.B() - 1);
            case zy1.zzm /* 21 */:
                return new nh3(ba4.b((ba4) this.b), ba4.b((ba4) this.d), ba4.b((ba4) this.e), (ExecutorService) ((da4) this.c).a, (gk3) ((ba4) this.f).d());
            case 22:
                return new oh3((vf3) ((da4) this.c).a, (nh3) ((ba4) this.b).d(), (lh3) ((ba4) this.d).d(), (ExecutorService) ((da4) this.f).a, (gk3) ((ba4) this.e).d());
            default:
                return new ii3((fr1) ((da4) this.c).a, (gi3) this.b.d(), (Map) ((da4) this.d).a, (Context) this.e.d(), (gk3) this.f.d());
        }
    }

    public ic2(hh2 hh2Var, ph2 ph2Var, ba4 ba4Var, lc2 lc2Var, ba4 ba4Var2) {
        this.a = 19;
        this.c = hh2Var;
        this.e = ph2Var;
        this.b = ba4Var;
        this.f = lc2Var;
        this.d = ba4Var2;
    }

    public /* synthetic */ ic2(hh2 hh2Var, ca4 ca4Var, ca4 ca4Var2, ga4 ga4Var, ba4 ba4Var, int i) {
        this.a = i;
        this.c = hh2Var;
        this.d = ca4Var;
        this.e = ca4Var2;
        this.f = ga4Var;
        this.b = ba4Var;
    }

    public /* synthetic */ ic2(ba4 ba4Var, Object obj, Object obj2, ga4 ga4Var, ga4 ga4Var2, int i) {
        this.a = i;
        this.b = ba4Var;
        this.c = obj;
        this.d = (ga4) obj2;
        this.e = ga4Var;
        this.f = ga4Var2;
    }

    public ic2(ba4 ba4Var, ll2 ll2Var, ba4 ba4Var2, ll2 ll2Var2, ba4 ba4Var3) {
        this.a = 2;
        this.b = ba4Var;
        this.c = ll2Var;
        this.e = ba4Var2;
        this.f = ll2Var2;
        this.d = ba4Var3;
    }

    public ic2(ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, da4 da4Var, ba4 ba4Var4) {
        this.a = 21;
        this.b = ba4Var;
        this.d = ba4Var2;
        this.e = ba4Var3;
        this.c = da4Var;
        this.f = ba4Var4;
    }

    public ic2(da4 da4Var, ba4 ba4Var, ba4 ba4Var2, da4 da4Var2, ba4 ba4Var3) {
        this.a = 22;
        this.c = da4Var;
        this.b = ba4Var;
        this.d = ba4Var2;
        this.f = da4Var2;
        this.e = ba4Var3;
    }

    public ic2(da4 da4Var, ba4 ba4Var, da4 da4Var2, ba4 ba4Var2, da4 da4Var3) {
        this.a = 20;
        this.c = da4Var;
        this.b = ba4Var;
        this.e = da4Var2;
        this.d = ba4Var2;
        this.f = da4Var3;
    }

    public /* synthetic */ ic2(da4 da4Var, ga4 ga4Var, ca4 ca4Var, ba4 ba4Var, ba4 ba4Var2, int i) {
        this.a = i;
        this.c = da4Var;
        this.e = ga4Var;
        this.f = ca4Var;
        this.b = ba4Var;
        this.d = ba4Var2;
    }

    public ic2(ga4 ga4Var, rr1 rr1Var, ba4 ba4Var, rc2 rc2Var, ga4 ga4Var2) {
        this.a = 10;
        this.c = ga4Var;
        this.d = rr1Var;
        this.b = ba4Var;
        this.e = rc2Var;
        this.f = ga4Var2;
    }

    public /* synthetic */ ic2(ga4 ga4Var, ga4 ga4Var2, ga4 ga4Var3, ga4 ga4Var4, ga4 ga4Var5, int i) {
        this.a = i;
        this.c = ga4Var;
        this.b = ga4Var2;
        this.d = ga4Var3;
        this.e = ga4Var4;
        this.f = ga4Var5;
    }
}
