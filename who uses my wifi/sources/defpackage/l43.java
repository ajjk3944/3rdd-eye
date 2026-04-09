package defpackage;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l43 implements ca4 {
    public final /* synthetic */ int a;
    public final ga4 b;
    public final ga4 c;
    public final ga4 d;
    public final ga4 e;

    public /* synthetic */ l43(ca4 ca4Var, ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, int i) {
        this.a = i;
        this.b = ca4Var;
        this.c = ba4Var;
        this.d = ba4Var2;
        this.e = ba4Var3;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                g33 g33VarD = ((r33) this.b).d();
                f43 f43Var = (f43) this.c.d();
                List list = (List) this.d.d();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.e.d();
                if (list.contains("10")) {
                    return new x43(f43Var, ((Integer) tw1.e.c.a(mz1.Uc)).intValue(), scheduledExecutorService);
                }
                return new x43(g33VarD, ((Integer) tw1.e.c.a(mz1.Uc)).intValue(), scheduledExecutorService);
            case 1:
                g33 g33VarD2 = ((x33) this.b).d();
                f43 f43Var2 = (f43) this.c.d();
                List list2 = (List) this.d.d();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.e.d();
                if (list2.contains("54")) {
                    return new x43(f43Var2, ((Integer) tw1.e.c.a(mz1.ed)).intValue(), scheduledExecutorService2);
                }
                return new x43(g33VarD2, ((Integer) tw1.e.c.a(mz1.ed)).intValue(), scheduledExecutorService2);
            case 2:
                o33 o33VarD = ((b43) this.b).d();
                f43 f43Var3 = (f43) this.c.d();
                List list3 = (List) this.d.d();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.e.d();
                if (list3.contains("13")) {
                    return new x43(f43Var3, ((Integer) tw1.e.c.a(mz1.dd)).intValue(), scheduledExecutorService3);
                }
                return new x43(o33VarD, ((Integer) tw1.e.c.a(mz1.dd)).intValue(), scheduledExecutorService3);
            case 3:
                g33 g33VarD3 = ((s43) this.b).d();
                f43 f43Var4 = (f43) this.c.d();
                List list4 = (List) this.d.d();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.e.d();
                if (list4.contains("60")) {
                    return new x43(f43Var4, ((Integer) tw1.e.c.a(mz1.Ed)).intValue(), scheduledExecutorService4);
                }
                return new x43(g33VarD3, ((Integer) tw1.e.c.a(mz1.Ed)).intValue(), scheduledExecutorService4);
            case 4:
                e33 e33VarD = ((l53) this.b).d();
                f43 f43Var5 = (f43) this.c.d();
                List list5 = (List) this.d.d();
                ScheduledExecutorService scheduledExecutorService5 = (ScheduledExecutorService) this.e.d();
                if (list5.contains("35")) {
                    return new x43(f43Var5, ((Integer) tw1.e.c.a(mz1.Rc)).intValue(), scheduledExecutorService5);
                }
                return new x43(e33VarD, ((Integer) tw1.e.c.a(mz1.Rc)).intValue(), scheduledExecutorService5);
            default:
                o33 o33VarD2 = ((x53) this.b).d();
                f43 f43Var6 = (f43) this.c.d();
                List list6 = (List) this.d.d();
                ScheduledExecutorService scheduledExecutorService6 = (ScheduledExecutorService) this.e.d();
                if (list6.contains("39")) {
                    return new x43(f43Var6, ((Integer) tw1.e.c.a(mz1.Oc)).intValue(), scheduledExecutorService6);
                }
                return new x43(o33VarD2, ((Integer) tw1.e.c.a(mz1.Oc)).intValue(), scheduledExecutorService6);
        }
    }
}
