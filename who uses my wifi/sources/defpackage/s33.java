package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s33 implements q53 {
    public final gd2 a;
    public final mr2 b;
    public final ScheduledExecutorService c;
    public final pq3 d;
    public final Context e;

    public s33(Context context, gd2 gd2Var, ScheduledExecutorService scheduledExecutorService, pq3 pq3Var) {
        if (!((Boolean) tw1.e.c.a(mz1.o3)).booleanValue()) {
            this.b = new mr2(context, 19);
        }
        this.e = context;
        this.a = gd2Var;
        this.c = scheduledExecutorService;
        this.d = pq3Var;
    }

    @Override // defpackage.q53
    public final n70 a() {
        gi4 gi4VarH;
        iz1 iz1Var = mz1.k3;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            if (!((Boolean) tw1Var.c.a(mz1.p3)).booleanValue()) {
                if (!((Boolean) tw1Var.c.a(mz1.l3)).booleanValue()) {
                    return pu1.P(wl2.D(this.b.h()), gj1.o, md2.g);
                }
                if (((Boolean) tw1Var.c.a(mz1.o3)).booleanValue()) {
                    i41.J(this.e, false);
                    synchronized (i41.v) {
                        gi4VarH = i41.t;
                    }
                } else {
                    gi4VarH = this.b.h();
                }
                if (gi4VarH == null) {
                    return pu1.r(new t33(null, -1, 0));
                }
                n70 n70VarO = pu1.O(wl2.D(gi4VarH), fi1.k, md2.g);
                if (((Boolean) tw1Var.c.a(mz1.m3)).booleanValue()) {
                    n70VarO = pu1.N(n70VarO, ((Long) tw1Var.c.a(mz1.n3)).longValue(), TimeUnit.MILLISECONDS, this.c);
                }
                return pu1.J(n70VarO, Exception.class, new vn1(5, this), this.d);
            }
        }
        return pu1.r(new t33(null, -1, 0));
    }

    @Override // defpackage.q53
    public final int d() {
        return 11;
    }
}
