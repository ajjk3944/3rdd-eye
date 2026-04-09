package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rc2 implements ca4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final ga4 c;

    public /* synthetic */ rc2(Object obj, ga4 ga4Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = ga4Var;
    }

    public wt2 a() {
        return new wt2(new cz2(((hh2) ((ri2) this.b).b).a()), (pq3) this.c.d(), 2, false);
    }

    @Override // defpackage.ga4
    public final Object d() {
        View view;
        switch (this.a) {
            case 0:
                Context context = (Context) ((da4) this.b).a;
                xb2 xb2Var = (xb2) this.c;
                return new qc2(context, new gw3((ym) xb2Var.c.a, (vb2) xb2Var.b.d(), 24, false));
            case 1:
                return new tb1(((ea4) this.b).d(), ((ea4) this.c).d());
            case 2:
                return ((p21) this.b).J(((ha4) this.c).d());
            case 3:
                return new x43(((wb2) this.b).c(), ((Integer) tw1.e.c.a(mz1.kd)).intValue(), (ScheduledExecutorService) this.c.d());
            case 4:
                return new x43(new b33(2, ((ku2) this.b).b.a()), ((Integer) tw1.e.c.a(mz1.pd)).intValue(), (ScheduledExecutorService) this.c.d());
            case 5:
                return new x43(((wb2) this.b).e(), ((Integer) tw1.e.c.a(mz1.ld)).intValue(), (ScheduledExecutorService) this.c.d());
            case 6:
                Boolean bool = (Boolean) tw1.e.c.a(mz1.a6);
                bool.booleanValue();
                return true == bool.booleanValue() ? ((jk2) this.b).c() : ((e02) this.c).b();
            case 7:
                return new sk2((ag2) ((mk2) this.b).b.i, (Executor) this.c.d());
            case 8:
                String str = (String) ((ba4) this.c).d();
                e03 e03Var = (e03) ((mm2) this.b).f;
                return e03Var != null ? e03Var : new e03(str);
            case 9:
                ((hh2) this.c).a();
                Context context2 = ((mm2) this.b).a;
                i41.M(context2);
                return context2;
            case 10:
                Set setD = ((ha4) this.c).d();
                fp2 fp2Var = (fp2) this.b;
                if (fp2Var.p == null) {
                    fp2Var.p = new vm2(setD);
                }
                vm2 vm2Var = fp2Var.p;
                i41.M(vm2Var);
                return vm2Var;
            case 11:
                return new gq2((uu2) ((ga4) this.b).d(), ((ll2) this.c).b.G());
            case 12:
                Set setM = ((l92) this.b).M((fm2) ((ba4) this.c).d());
                i41.M(setM);
                return setM;
            case 13:
                return new up2(new kk2(1, (ag2) ((l92) this.b).g), (Executor) this.c.d());
            case 14:
                a83 a83VarA = ((ll2) this.b).a();
                JSONObject jSONObject = (JSONObject) ((fr2) this.c).b.g;
                i41.M(jSONObject);
                return new ur2(a83VarA, jSONObject);
            case 15:
                return new up2(new gu2(((jr2) this.b).b.a()), (Executor) this.c.d());
            case 16:
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new xb4(ld2Var, ((gt2) this.b).d(), (jv2) ((ba4) this.c).d(), 22);
            case 17:
                pr2 pr2Var = (pr2) ((u43) this.b).d();
                tr2 tr2VarA = ((u12) this.c).a();
                pt2 pt2Var = new pt2("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                synchronized (tr2VarA) {
                    view = tr2VarA.o;
                }
                pt2Var.f = view;
                pt2Var.g = tr2VarA.r();
                pt2Var.h = pr2Var;
                pt2Var.i = false;
                pt2Var.j = false;
                if (tr2VarA.h() != null) {
                    tr2VarA.h().T0(pt2Var);
                }
                return pt2Var;
            case 18:
                return new hu2((gn2) ((ba4) this.b).d(), ((ll2) this.c).a());
            case 19:
                return new yu2(t83.S(((lc2) this.b).b.a()), (xu2) ((ba4) this.c).d());
            case 20:
                return new fv2((cx1) ((ba4) this.b).d(), ((ea4) this.c).d());
            case zy1.zzm /* 21 */:
                return new bw2((ci2) ((da4) this.b).a, new f20(22, (m42) ((aw2) this.c).b.a));
            case 22:
                ld2 ld2Var2 = md2.b;
                i41.M(ld2Var2);
                ld2 ld2Var3 = md2.a;
                i41.M(ld2Var3);
                return new mc2(ld2Var2, ld2Var3, new ay2((Context) ((sw2) this.b).b.d(), ld2Var3, 0), ba4.b((ic2) this.c), 16, false);
            case 23:
                Map map = ((fa4) this.b).a;
                ld2 ld2Var4 = md2.a;
                i41.M(ld2Var4);
                return new ky2(map, ld2Var4, new io2(((tm2) this.c).b.d()));
            case 24:
                ld2 ld2Var5 = md2.a;
                i41.M(ld2Var5);
                return new t83(ld2Var5, ((ri2) this.b).a(), ba4.b((ic2) this.c), 22, false);
            case 25:
                return a();
            case 26:
                return new dz2(((ic2) this.b).b(), ((fh2) this.c).d());
            case 27:
                return new fz2(((rc2) this.b).a(), ((fh2) this.c).d());
            case 28:
                ez2 ez2Var = (ez2) ((ba4) this.b).d();
                rc2 rc2Var = (rc2) this.c;
                return new fv2(ez2Var, new fz2(((rc2) rc2Var.b).a(), ((fh2) rc2Var.c).d()));
            default:
                return new x43(((em2) this.b).a(), ((Integer) tw1.e.c.a(mz1.hd)).intValue(), (ScheduledExecutorService) this.c.d());
        }
    }
}
