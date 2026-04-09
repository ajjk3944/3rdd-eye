package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wb2 implements ca4 {
    public final /* synthetic */ int a;
    public final ga4 b;
    public final ga4 c;
    public final ga4 d;

    public wb2(da4 da4Var, ba4 ba4Var, da4 da4Var2) {
        this.a = 29;
        this.b = da4Var;
        this.d = ba4Var;
        this.c = da4Var2;
    }

    public g4 a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.d();
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        ld2 ld2Var2 = md2.b;
        i41.M(ld2Var2);
        Context contextA = ((hh2) ((ri2) this.c).b).a();
        i41.M(ld2Var);
        return new g4(scheduledExecutorService, ld2Var, ld2Var2, new ay2(contextA, ld2Var, 1), ba4.b((ic2) this.d), 10);
    }

    public p21 b() {
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        ft2 ft2VarA = ((gt2) this.b).d();
        rc2 rc2Var = (rc2) this.c;
        i41.M(ld2Var);
        return new p21(ld2Var, ft2VarA, new xb4(ld2Var, ((gt2) rc2Var.b).d(), (jv2) ((ba4) rc2Var.c).d(), 22), (jv2) ((ba4) this.d).d());
    }

    public e33 c() {
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        return new e33(ld2Var, ((hh2) this.b).a(), ((qm2) this.c).a(), (ViewGroup) ((ug0) ((u12) this.d).b).g, 0);
    }

    @Override // defpackage.ga4
    public final Object d() {
        Set setSingleton;
        switch (this.a) {
            case 0:
                ra4 ra4Var = (ra4) ((da4) this.c).a;
                return new vb2(ra4Var);
            case 1:
                e51 e51VarA = ((ph2) this.b).a();
                JSONObject jSONObject = (JSONObject) ((ba4) this.c).d();
                String str = (String) ((ca4) this.d).d();
                boolean zEquals = "native".equals(str);
                lf4 lf4Var = hg4.C.c;
                return new mv1(UUID.randomUUID().toString(), e51VarA, str, jSONObject, zEquals);
            case 2:
                return new rk2((ag2) ((mk2) this.b).b.i, (mv2) this.c.d(), ((ll2) this.d).a());
            case 3:
                Context context = (Context) this.b.d();
                e51 e51VarA2 = ((ph2) this.c).a();
                a83 a83VarA = ((ll2) this.d).a();
                rb2 rb2Var = a83VarA.A;
                if (rb2Var == null) {
                    return null;
                }
                e83 e83Var = a83VarA.s;
                return new qb2(context, e51VarA2, rb2Var, e83Var != null ? e83Var.b : null);
            case 4:
                ym2 ym2Var = new ym2(((tm2) this.b).b.d());
                Set setD = ((ha4) this.c).d();
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new an2(ym2Var, setD, ld2Var, (ScheduledExecutorService) this.d.d());
            case 5:
                return new ao2(((ha4) this.b).d(), ((ll2) this.c).a(), ((ll2) this.d).b());
            case 6:
                return new vp2((Context) this.b.d(), ((ha4) this.c).d(), ((ll2) this.d).a());
            case 7:
                tr2 tr2VarA = ((u12) this.b).a();
                ur2 ur2Var = (ur2) ((zl2) this.c).b.d();
                i41.M(ur2Var);
                Executor executor = (Executor) this.d.d();
                ld2 ld2Var2 = md2.a;
                i41.M(ld2Var2);
                return new ss2(tr2VarA, ur2Var, executor, ld2Var2);
            case 8:
                return b();
            case 9:
                int i = ((qm2) this.d).a().p.g;
                if (i != 0) {
                    return i + (-1) != 0 ? ((e02) this.c).b() : ((e02) this.b).b();
                }
                throw null;
            case 10:
                String str2 = ((fa2) ((n63) this.b).b.h).m;
                i41.M(str2);
                Context contextA = ((hh2) this.c).a();
                ld2 ld2Var3 = md2.a;
                i41.M(ld2Var3);
                Map mapD = ((ea4) this.d).d();
                if (((Boolean) tw1.e.c.a(mz1.A5)).booleanValue()) {
                    cx1 cx1Var = new cx1(new wy0(contextA, 4));
                    synchronized (cx1Var) {
                        if (cx1Var.c) {
                            try {
                                yy1 yy1Var = cx1Var.b;
                                yy1Var.b();
                                ((zy1) yy1Var.g).B(str2);
                            } catch (NullPointerException e) {
                                hg4.C.h.d("AdMobClearcutLogger.modify", e);
                            }
                        }
                    }
                    setSingleton = Collections.singleton(new up2(new fv2(cx1Var, mapD), ld2Var3));
                } else {
                    setSingleton = Collections.EMPTY_SET;
                }
                i41.M(setSingleton);
                return setSingleton;
            case 11:
                return new ov2((jv2) ((ba4) this.b).d(), ((ha4) this.c).d(), (ym) this.d.d());
            case 12:
                ld2 ld2Var4 = md2.a;
                i41.M(ld2Var4);
                ug4 ug4Var = (ug4) this.b.d();
                xk xkVar = (xk) this.c;
                return new pv2(ld2Var4, ug4Var, new t83((Context) xkVar.b.d(), (e51) xkVar.c.d()), new gs3(2), ((hh2) this.d).a());
            case 13:
                Context contextA2 = ((hh2) this.b).a();
                WeakReference weakReference = ((gh2) this.c).b.d;
                i41.M(weakReference);
                ax2 ax2Var = (ax2) ((ba4) this.d).d();
                ld2 ld2Var5 = md2.a;
                i41.M(ld2Var5);
                return new ex2(contextA2, weakReference, ax2Var, ld2Var5);
            case 14:
                return a();
            case 15:
                return c();
            case 16:
                lc2 lc2Var = (lc2) this.b;
                ld2 ld2Var6 = md2.a;
                i41.M(ld2Var6);
                o33 o33Var = new o33(ld2Var6, lc2Var.b.a(), 2);
                ym ymVar = (ym) ((ba4) this.c).d();
                i41.M(ld2Var6);
                return new f43(o33Var, ((Long) k02.c.w()).longValue(), ymVar, ld2Var6, (mv2) ((ba4) this.d).d());
            case 17:
                Context contextA3 = ((lc2) this.b).b.a();
                ld2 ld2Var7 = md2.a;
                i41.M(ld2Var7);
                o33 o33Var2 = new o33(contextA3, ld2Var7, 6);
                ym ymVar2 = (ym) ((ba4) this.c).d();
                i41.M(ld2Var7);
                return new f43(o33Var2, 2147483647L, ymVar2, ld2Var7, (mv2) ((ba4) this.d).d());
            case 18:
                nh2 nh2Var = (nh2) this.b;
                ld2 ld2Var8 = md2.a;
                i41.M(ld2Var8);
                k33 k33Var = new k33(ld2Var8, nh2Var.b.a(), (gx2) nh2Var.c.d(), 4);
                ym ymVar3 = (ym) ((ba4) this.c).d();
                i41.M(ld2Var8);
                return new f43(k33Var, ((Long) k02.d.w()).longValue(), ymVar3, ld2Var8, (mv2) ((ba4) this.d).d());
            case 19:
                b33 b33Var = new b33(0, ((hh2) ((d33) this.b).a).a());
                ym ymVar4 = (ym) ((ba4) this.c).d();
                ld2 ld2Var9 = md2.a;
                i41.M(ld2Var9);
                return new f43(b33Var, 2147483647L, ymVar4, ld2Var9, (mv2) ((ba4) this.d).d());
            case 20:
                g33 g33VarD = ((r33) this.b).d();
                ym ymVar5 = (ym) ((ba4) this.c).d();
                ld2 ld2Var10 = md2.a;
                i41.M(ld2Var10);
                return new f43(g33VarD, ((Long) k02.a.w()).longValue(), ymVar5, ld2Var10, (mv2) ((ba4) this.d).d());
            case zy1.zzm /* 21 */:
                g33 g33VarD2 = ((x33) this.b).d();
                ym ymVar6 = (ym) ((ba4) this.c).d();
                ld2 ld2Var11 = md2.a;
                i41.M(ld2Var11);
                return new f43(g33VarD2, 2147483647L, ymVar6, ld2Var11, (mv2) ((ba4) this.d).d());
            case 22:
                o33 o33VarD = ((b43) this.b).d();
                ym ymVar7 = (ym) ((ba4) this.c).d();
                ld2 ld2Var12 = md2.a;
                i41.M(ld2Var12);
                return new f43(o33VarD, ((Long) k02.b.w()).longValue(), ymVar7, ld2Var12, (mv2) ((ba4) this.d).d());
            case 23:
                g33 g33VarD3 = ((s43) this.b).d();
                ym ymVar8 = (ym) ((ba4) this.c).d();
                ld2 ld2Var13 = md2.a;
                i41.M(ld2Var13);
                return new f43(g33VarD3, ((Long) k02.e.w()).longValue(), ymVar8, ld2Var13, (mv2) ((ba4) this.d).d());
            case 24:
                k33 k33VarD = ((z43) this.b).d();
                ym ymVar9 = (ym) ((ba4) this.c).d();
                ld2 ld2Var14 = md2.a;
                i41.M(ld2Var14);
                return new f43(k33VarD, 2147483647L, ymVar9, ld2Var14, (mv2) ((ba4) this.d).d());
            case 25:
                e33 e33VarD = ((l53) this.b).d();
                ym ymVar10 = (ym) ((ba4) this.c).d();
                ld2 ld2Var15 = md2.a;
                i41.M(ld2Var15);
                return new f43(e33VarD, ((Long) k02.g.w()).longValue(), ymVar10, ld2Var15, (mv2) ((ba4) this.d).d());
            case 26:
                o33 o33VarD2 = ((x53) this.b).d();
                ym ymVar11 = (ym) ((ba4) this.c).d();
                ld2 ld2Var16 = md2.a;
                i41.M(ld2Var16);
                return new f43(o33VarD2, ((Long) k02.h.w()).longValue(), ymVar11, ld2Var16, (mv2) ((ba4) this.d).d());
            case 27:
                return e();
            case 28:
                i41.M(((fa2) ((n63) this.b).b.h).i);
                gd2 gd2Var = (gd2) this.c.d();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.d();
                ld2 ld2Var17 = md2.a;
                i41.M(ld2Var17);
                return new k33(gd2Var, scheduledExecutorService, ld2Var17);
            default:
                Context context2 = (Context) ((da4) this.b).a;
                return new ek3(context2, (ExecutorService) ((da4) this.c).a, ek3.g);
        }
    }

    public e33 e() {
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        return new e33(ld2Var, (ViewGroup) ((ug0) ((u12) this.b).b).g, (Context) ((ba4) this.c).d(), ((ha4) this.d).d());
    }

    public /* synthetic */ wb2(ga4 ga4Var, ga4 ga4Var2, ga4 ga4Var3, int i) {
        this.a = i;
        this.b = ga4Var;
        this.c = ga4Var2;
        this.d = ga4Var3;
    }
}
