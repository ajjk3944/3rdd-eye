package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ip implements jp {
    public final ScheduledFuture f;

    public ip(ScheduledFuture scheduledFuture) {
        this.f = scheduledFuture;
    }

    @Override // defpackage.jp
    public final void b() {
        this.f.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f + ']';
    }
}
