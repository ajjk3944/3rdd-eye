package defpackage;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class an2 extends f74 implements xm2 {
    public final ScheduledExecutorService i;
    public ScheduledFuture j;
    public boolean k;

    public an2(ym2 ym2Var, Set set, ld2 ld2Var, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.k = false;
        this.i = scheduledExecutorService;
        L1(ym2Var, ld2Var);
    }

    @Override // defpackage.xm2
    public final void O(nx2 nx2Var) {
        P1(new ug0(20, nx2Var));
    }

    @Override // defpackage.xm2
    public final void R(pq2 pq2Var) {
        if (this.k) {
            return;
        }
        ScheduledFuture scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        P1(new f20(19, pq2Var));
    }

    public final void U1() {
        this.j = this.i.schedule(new fu1(28, this), ((Integer) tw1.e.c.a(mz1.xb)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.xm2
    public final void b() {
        P1(qd2.h);
    }
}
