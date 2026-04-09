package defpackage;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u93 {
    public static final lq3 d = lq3.g;
    public final pq3 a;
    public final ScheduledExecutorService b;
    public final t93 c;

    public u93(pq3 pq3Var, ScheduledExecutorService scheduledExecutorService, t93 t93Var) {
        this.a = pq3Var;
        this.b = scheduledExecutorService;
        this.c = t93Var;
    }

    public final bu1 a(n70 n70Var, Object obj) {
        return new bu1(this, obj, null, n70Var, Collections.singletonList(n70Var), n70Var);
    }
}
