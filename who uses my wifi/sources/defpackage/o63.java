package defpackage;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o63 implements q53 {
    public final gd2 a;
    public final boolean b;
    public final ScheduledExecutorService c;
    public final pq3 d;
    public final int e;
    public final int f;

    public o63(gd2 gd2Var, boolean z, pq3 pq3Var, ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.a = gd2Var;
        this.b = z;
        this.d = pq3Var;
        this.c = scheduledExecutorService;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.q53
    public final n70 a() {
        iz1 iz1Var = mz1.r7;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && this.b) {
            return pu1.r(new j33(null, 5));
        }
        if (this.f == 2) {
            return pu1.r(new j33(null, 5));
        }
        if (!Arrays.asList(((String) tw1Var.c.a(mz1.t7)).split(",")).contains(String.valueOf(this.e))) {
            return pu1.r(new j33(null, 5));
        }
        lq3 lq3Var = lq3.g;
        gj1 gj1Var = gj1.r;
        pq3 pq3Var = this.d;
        return pu1.J(pu1.N(pu1.P(lq3Var, gj1Var, pq3Var), ((Long) k12.b.w()).longValue(), TimeUnit.MILLISECONDS, this.c), Exception.class, new vn1(7, this), pq3Var);
    }

    @Override // defpackage.q53
    public final int d() {
        return 50;
    }
}
