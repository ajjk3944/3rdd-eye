package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qk2 implements ca4 {
    public final /* synthetic */ int a;
    public final ga4 b;
    public final ga4 c;

    public /* synthetic */ qk2(ga4 ga4Var, ga4 ga4Var2, int i) {
        this.a = i;
        this.b = ga4Var;
        this.c = ga4Var2;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new nc2(((hh2) this.b).a(), ((qm2) this.c).a().g);
            case 1:
                return new sl2((ul2) this.b.d(), ((qm2) this.c).a());
            case 2:
                return new nc2(((hh2) this.b).a(), ((qm2) this.c).a().g);
            case 3:
                p32 p32Var = (p32) this.b.d();
                ym ymVar = (ym) this.c.d();
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new zs2(p32Var, ymVar, ld2Var);
            case 4:
                return new vv2((sv2) this.b.d(), (th2) this.c.d());
            case 5:
                return new ix2(((hh2) this.b).a(), (mv2) this.c.d());
            case 6:
                return new jy2(((hh2) this.b).a(), (oc2) this.c.d());
            case 7:
                return new x43((f43) this.b.d(), ((Integer) tw1.e.c.a(mz1.cd)).intValue(), (ScheduledExecutorService) this.c.d());
            case 8:
                return new x43((f43) this.b.d(), ((Integer) tw1.e.c.a(mz1.Pc)).intValue(), (ScheduledExecutorService) this.c.d());
            case 9:
                oc2 oc2Var = (oc2) this.b.d();
                ld2 ld2Var2 = md2.a;
                i41.M(ld2Var2);
                return new k33(oc2Var, ld2Var2, ((hh2) this.c).a(), 3);
            case 10:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.d();
                ((hh2) this.c).a();
                return new b33(6, scheduledExecutorService);
            case 11:
                return new w83(((hh2) this.b).a(), ((qh2) this.c).d());
            default:
                return new w93(((hh2) this.b).a(), (da3) this.c.d());
        }
    }
}
