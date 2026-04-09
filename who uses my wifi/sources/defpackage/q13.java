package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q13 implements ca4 {
    public final /* synthetic */ int a;
    public final ga4 b;
    public final ga4 c;
    public final ga4 d;

    public /* synthetic */ q13(ga4 ga4Var, ga4 ga4Var2, ga4 ga4Var3, int i) {
        this.a = i;
        this.b = ga4Var;
        this.c = ga4Var2;
        this.d = ga4Var3;
    }

    public e33 a() {
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        return new e33(ld2Var, (yu2) this.b.d(), (mw2) this.c.d(), (n33) this.d.d(), 2);
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new t83((s83) this.b.d(), (xu2) this.c.d(), (mv2) this.d.d(), 26, false);
            case 1:
                return a();
            case 2:
                Context contextA = ((hh2) this.b).a();
                gd2 gd2Var = (gd2) this.c.d();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.d();
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new s33(contextA, gd2Var, scheduledExecutorService, ld2Var);
            case 3:
                Object b33Var = new b33(0, ((hh2) ((d33) this.b).a).a());
                Object obj = (f43) this.c.d();
                if (true == ((List) this.d.d()).contains("2")) {
                    b33Var = obj;
                }
                i41.M(b33Var);
                return b33Var;
            case 4:
                ld2 ld2Var2 = md2.a;
                i41.M(ld2Var2);
                g43 g43Var = new g43(ld2Var2, 2);
                f43 f43Var = (f43) this.b.d();
                List list = (List) this.c.d();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.d.d();
                if (list.contains("24")) {
                    return new x43(f43Var, ((Integer) tw1.e.c.a(mz1.Wc)).intValue(), scheduledExecutorService2);
                }
                return new x43(g43Var, ((Integer) tw1.e.c.a(mz1.Wc)).intValue(), scheduledExecutorService2);
            case 5:
                Object objD = ((z43) this.b).d();
                Object obj2 = (f43) this.c.d();
                if (true == ((List) this.d.d()).contains("29")) {
                    objD = obj2;
                }
                i41.M(objD);
                return objD;
            case 6:
                return new hj3((Context) this.b.d(), (vf3) this.c.d(), (xj3) this.d.d());
            case 7:
                return new gj3((Context) this.b.d(), (ExecutorService) this.c.d(), (pg3) this.d.d());
            default:
                return new wj3((gk3) this.c.d(), ((vf3) this.d.d()).K().B());
        }
    }
}
