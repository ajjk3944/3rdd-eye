package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kl2 {
    public final Executor a;
    public final ScheduledExecutorService b;
    public volatile boolean c = true;

    public kl2(ld2 ld2Var, ScheduledExecutorService scheduledExecutorService, q93 q93Var) {
        this.a = ld2Var;
        this.b = scheduledExecutorService;
    }
}
