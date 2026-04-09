package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jd2 {
    public pq3 a;
    public mv2 b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public long e = -1;
    public long f = -1;

    public final void a(pq3 pq3Var, mv2 mv2Var) {
        if (this.c.getAndSet(true)) {
            return;
        }
        this.a = pq3Var;
        this.b = mv2Var;
        iz1 iz1Var = mz1.te;
        tw1 tw1Var = tw1.e;
        this.e = ((Long) tw1Var.c.a(iz1Var)).longValue();
        this.f = ((Long) tw1Var.c.a(mz1.ue)).longValue();
    }
}
