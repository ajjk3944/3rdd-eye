package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gm2 {
    public final AtomicLong a;

    public gm2(h83 h83Var) {
        AtomicLong atomicLong = new AtomicLong();
        this.a = atomicLong;
        atomicLong.set(((l83) h83Var.a.g).u.get());
    }

    public final void a(long j) {
        this.a.set(j);
    }
}
