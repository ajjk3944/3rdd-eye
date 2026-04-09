package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x43 implements q53 {
    public final q53 a;
    public final long b;
    public final ScheduledExecutorService c;

    public x43(q53 q53Var, long j, ScheduledExecutorService scheduledExecutorService) {
        this.a = q53Var;
        this.b = j;
        this.c = scheduledExecutorService;
    }

    @Override // defpackage.q53
    public final n70 a() {
        n70 n70VarA = this.a.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) tw1.e.c.a(mz1.x2)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.b;
        if (j > 0) {
            n70VarA = pu1.N(n70VarA, j, timeUnit, this.c);
        }
        return pu1.L(n70VarA, Throwable.class, new u42(9, this), md2.g);
    }

    @Override // defpackage.q53
    public final int d() {
        return this.a.d();
    }
}
